import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public class AudioChannel {

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "Lclient!kn;")
	public static AudioThread thread;
	@OriginalMember(owner = "client!un", name = "h", descriptor = "Z")
	public static boolean stereo;
	@OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
	public static int threadPriority;
	@OriginalMember(owner = "client!tg", name = "g", descriptor = "[I")
	public int[] samples;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "Lclient!ll;")
	private PcmStream stream;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
	public int sampleRate;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
	private int anInt7098;

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
	public int bufferCapacity;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
	private final int anInt7081 = 32;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "Z")
	private boolean stop = false;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "J")
	private long time = MonotonicClock.currentTimeMillis();

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Z")
	private boolean skipConsumptionCheck = true;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "J")
	private long closeUntil = 0L;

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "J")
	private long calculateConsumptionAt = 0L;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
	private int consumedSamples = 0;

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
	private int previousConsumedSamples = 0;

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "[Lclient!ll;")
	private final PcmStream[] aPcmStreamArray6 = new PcmStream[8];

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "[Lclient!ll;")
	private final PcmStream[] aPcmStreamArray5 = new PcmStream[8];

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
	private int previousBufferSize = 0;

	@OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
	private int anInt7101 = 0;

	static {
		new LocalisedText("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZIIZ)V")
	public static void init(@OriginalArg(3) boolean stereo) {
		AudioChannel.stereo = stereo;
		threadPriority = 2;
		Static356.sampleRate = 22050;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BILclient!ml;Ljava/awt/Component;I)Lclient!tg;")
	public static AudioChannel create(@OriginalArg(2) SignLink signLink, @OriginalArg(3) Component component, @OriginalArg(1) int channelID, @OriginalArg(4) int sampleRate) {
		if (Static356.sampleRate == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) AudioChannel audioChannel = (AudioChannel) Class.forName("JavaAudioChannel").getDeclaredConstructor().newInstance();
			audioChannel.sampleRate = sampleRate;
			audioChannel.samples = new int[(stereo ? 2 : 1) * 256];
			audioChannel.init(component);
			audioChannel.bufferCapacity = (sampleRate & 0xFFFFFC00) + 1024;
			if (audioChannel.bufferCapacity > 16384) {
				audioChannel.bufferCapacity = 16384;
			}
			audioChannel.open(audioChannel.bufferCapacity);
			if (threadPriority > 0 && thread == null) {
				thread = new AudioThread();
				thread.signLink = signLink;
				signLink.startThread(thread, threadPriority);
			}
			if (thread != null) {
				if (thread.channels[channelID] != null) {
					throw new IllegalArgumentException();
				}
				thread.channels[channelID] = audioChannel;
			}
			return audioChannel;
		} catch (@Pc(106) Throwable exception) {
			try {
				@Pc(112) SignLinkAudioChannel signLinkAudioChannel = new SignLinkAudioChannel(signLink, channelID);
				signLinkAudioChannel.sampleRate = sampleRate;
				signLinkAudioChannel.samples = new int[(stereo ? 2 : 1) * 256];
				signLinkAudioChannel.init(component);
				signLinkAudioChannel.bufferCapacity = 16384;
				signLinkAudioChannel.open(signLinkAudioChannel.bufferCapacity);
				if (threadPriority > 0 && thread == null) {
					thread = new AudioThread();
					thread.signLink = signLink;
					signLink.startThread(thread, threadPriority);
				}
				if (thread != null) {
					if (thread.channels[channelID] != null) {
						throw new IllegalArgumentException();
					}
					thread.channels[channelID] = signLinkAudioChannel;
				}
				return signLinkAudioChannel;
			} catch (@Pc(186) Throwable throwable) {
				return new AudioChannel();
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public final synchronized void loop() {
		if (this.stop) {
			return;
		}
		@Pc(12) long now = MonotonicClock.currentTimeMillis();
		try {
			if (now > this.time + 500000L) {
				this.time = now - 500000L;
			}
			while (this.time + 5000L < now) {
				this.skip();
				this.time += 256000 / Static356.sampleRate;
			}
		} catch (@Pc(52) Exception exception) {
			this.time = now;
		}
		if (this.samples == null) {
			return;
		}
		try {
			if (this.closeUntil != 0L) {
				if (now < this.closeUntil) {
					return;
				}
				this.open(this.bufferCapacity);
				this.closeUntil = 0L;
				this.skipConsumptionCheck = true;
			}
			@Pc(83) int bufferSize = this.getBufferSize();
			if (this.previousBufferSize - bufferSize > this.consumedSamples) {
				this.consumedSamples = this.previousBufferSize - bufferSize;
			}
			@Pc(103) int targetBufferSize = this.anInt7098 + this.sampleRate;
			if (targetBufferSize + 256 > 16384) {
				targetBufferSize = 16128;
			}
			if (this.bufferCapacity < targetBufferSize + 256) {
				this.bufferCapacity += 1024;
				if (this.bufferCapacity > 16384) {
					this.bufferCapacity = 16384;
				}
				this.close();
				bufferSize = 0;
				this.open(this.bufferCapacity);
				if (this.bufferCapacity < targetBufferSize + 256) {
					targetBufferSize = this.bufferCapacity - 256;
					this.anInt7098 = targetBufferSize - this.sampleRate;
				}
				this.skipConsumptionCheck = true;
			}
			while (targetBufferSize > bufferSize) {
				this.read(this.samples);
				this.write();
				bufferSize += 256;
			}
			if (now > this.calculateConsumptionAt) {
				if (this.skipConsumptionCheck) {
					this.skipConsumptionCheck = false;
				} else if (this.consumedSamples == 0 && this.previousConsumedSamples == 0) {
					this.close();
					this.closeUntil = now + 2000L;
					return;
				} else {
					this.anInt7098 = Math.min(this.previousConsumedSamples, this.consumedSamples);
					this.previousConsumedSamples = this.consumedSamples;
				}
				this.consumedSamples = 0;
				this.calculateConsumptionAt = now + 2000L;
			}
			this.previousBufferSize = bufferSize;
		} catch (@Pc(227) Exception exception) {
			this.close();
			this.closeUntil = now + 2000L;
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public final synchronized void method6316() {
		this.skipConsumptionCheck = true;
		try {
			this.flush();
		} catch (@Pc(16) Exception exception) {
			this.close();
			this.closeUntil = MonotonicClock.currentTimeMillis() + 2000L;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!ll;BI)V")
	private void method6319(@OriginalArg(0) PcmStream arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) PcmStream local12 = this.aPcmStreamArray5[local7];
		if (local12 == null) {
			this.aPcmStreamArray6[local7] = arg0;
		} else {
			local12.aPcmStream_5 = arg0;
		}
		this.aPcmStreamArray5[local7] = arg0;
		arg0.anInt5476 = arg1;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "()I")
	protected int getBufferSize() throws Exception {
		return this.bufferCapacity;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "()V")
	protected void flush() throws Exception {
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([II)V")
	private void read(@OriginalArg(0) int[] arg0) {
		@Pc(1) short length = 256;
		if (stereo) {
			length = 512;
		}
		Static403.clear(arg0, 0, length);
		this.anInt7101 -= 256;
		if (this.stream != null && this.anInt7101 <= 0) {
			this.anInt7101 += Static356.sampleRate >> 4;
			PcmStream.setInactive(this.stream);
			this.method6319(this.stream, this.stream.method4975());
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 255;
			@Pc(49) int local49 = 7;
			@Pc(56) int local56;
			label103: while (local47 != 0) {
				@Pc(61) int local61;
				if (local49 < 0) {
					local56 = local49 & 0x3;
					local61 = -(local49 >> 2);
				} else {
					local56 = local49;
					local61 = 0;
				}
				for (@Pc(72) int local72 = local47 >>> local56 & 0x11111111; local72 != 0; local72 >>>= 0x4) {
					if ((local72 & 0x1) != 0) {
						local47 &= ~(0x1 << local56);
						@Pc(88) PcmStream local88 = null;
						@Pc(93) PcmStream local93 = this.aPcmStreamArray6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub21 local97 = local93.sound;
								if (local97 == null || local97.offset <= local61) {
									local93.active = true;
									@Pc(121) int local121 = local93.method4976();
									local45 += local121;
									if (local97 != null) {
										local97.offset += local121;
									}
									if (local45 >= this.anInt7081) {
										break label103;
									}
									@Pc(140) PcmStream local140 = local93.firstSubStream();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5476;
										while (local140 != null) {
											this.method6319(local140, local145 * local140.method4975() >> 8);
											local140 = local93.nextSubStream();
										}
									}
									@Pc(164) PcmStream local164 = local93.aPcmStream_5;
									local93.aPcmStream_5 = null;
									if (local88 == null) {
										this.aPcmStreamArray6[local56] = local164;
									} else {
										local88.aPcmStream_5 = local164;
									}
									if (local164 == null) {
										this.aPcmStreamArray5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aPcmStream_5;
								}
							}
						}
					}
					local56 += 4;
					local61++;
				}
				local49--;
			}
			for (local56 = 0; local56 < 8; local56++) {
				@Pc(207) PcmStream local207 = this.aPcmStreamArray6[local56];
				this.aPcmStreamArray6[local56] = this.aPcmStreamArray5[local56] = null;
				while (local207 != null) {
					@Pc(221) PcmStream local221 = local207.aPcmStream_5;
					local207.aPcmStream_5 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt7101 < 0) {
			this.anInt7101 = 0;
		}
		if (this.stream != null) {
			this.stream.read(arg0, 0, 256);
		}
		this.time = MonotonicClock.currentTimeMillis();
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "()V")
	protected void close() {
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V")
	public final void method6324() {
		this.skipConsumptionCheck = true;
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
	public final synchronized void quit() {
		if (thread != null) {
			@Pc(9) boolean stop = true;
			for (@Pc(11) int i = 0; i < 2; i++) {
				if (thread.channels[i] == this) {
					thread.channels[i] = null;
				}
				if (thread.channels[i] != null) {
					stop = false;
				}
			}
			if (stop) {
				thread.stop = true;
				while (thread.running) {
					Static231.sleep(50L);
				}
				thread = null;
			}
		}
		this.close();
		this.stop = true;
		this.samples = null;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void init(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V")
	private void skip() {
		this.anInt7101 -= 256;
		if (this.anInt7101 < 0) {
			this.anInt7101 = 0;
		}
		if (this.stream != null) {
			this.stream.skip(256);
		}
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "()V")
	protected void write() throws Exception {
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!ll;)V")
	public final synchronized void setStream(@OriginalArg(1) PcmStream stream) {
		this.stream = stream;
	}

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)V")
	public void open(@OriginalArg(0) int bufferCapacity) throws Exception {
	}
}
