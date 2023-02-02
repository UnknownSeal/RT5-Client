import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class MidiPcmStream extends PcmStream {

	@OriginalMember(owner = "client!od", name = "Lb", descriptor = "I")
	private int anInt4565;

	@OriginalMember(owner = "client!od", name = "Mb", descriptor = "I")
	private int anInt4566;

	@OriginalMember(owner = "client!od", name = "Nb", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!od", name = "Ob", descriptor = "Z")
	private boolean aBoolean314;

	@OriginalMember(owner = "client!od", name = "Pb", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!od", name = "Qb", descriptor = "Lclient!sl;")
	private Class2_Sub34 song;

	@OriginalMember(owner = "client!od", name = "Rb", descriptor = "I")
	private int anInt4567;

	@OriginalMember(owner = "client!od", name = "Sb", descriptor = "Z")
	private boolean aBoolean315;

	@OriginalMember(owner = "client!od", name = "w", descriptor = "[I")
	private final int[] channelProgram = new int[16];

	@OriginalMember(owner = "client!od", name = "x", descriptor = "[I")
	private final int[] anIntArray296 = new int[16];

	@OriginalMember(owner = "client!od", name = "C", descriptor = "[I")
	public final int[] anIntArray297 = new int[16];

	@OriginalMember(owner = "client!od", name = "I", descriptor = "[[Lclient!ej;")
	private final MidiNote[][] aClass2_Sub11ArrayArray2 = new MidiNote[16][128];

	@OriginalMember(owner = "client!od", name = "S", descriptor = "[I")
	public final int[] anIntArray300 = new int[16];

	@OriginalMember(owner = "client!od", name = "A", descriptor = "[[Lclient!ej;")
	private final MidiNote[][] notes = new MidiNote[16][128];

	@OriginalMember(owner = "client!od", name = "kb", descriptor = "I")
	private int volume = 256;

	@OriginalMember(owner = "client!od", name = "F", descriptor = "[I")
	private final int[] anIntArray298 = new int[16];

	@OriginalMember(owner = "client!od", name = "qb", descriptor = "[I")
	private final int[] anIntArray305 = new int[16];

	@OriginalMember(owner = "client!od", name = "hb", descriptor = "[I")
	private final int[] anIntArray303 = new int[16];

	@OriginalMember(owner = "client!od", name = "Q", descriptor = "[I")
	private final int[] anIntArray299 = new int[16];

	@OriginalMember(owner = "client!od", name = "pb", descriptor = "[I")
	private final int[] anIntArray304 = new int[16];

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "[I")
	private final int[] anIntArray302 = new int[16];

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "I")
	private final int microsecondsPerSecond = 1000000;

	@OriginalMember(owner = "client!od", name = "U", descriptor = "[I")
	private final int[] anIntArray301 = new int[16];

	@OriginalMember(owner = "client!od", name = "yb", descriptor = "[I")
	private final int[] anIntArray307 = new int[16];

	@OriginalMember(owner = "client!od", name = "zb", descriptor = "[I")
	public final int[] anIntArray308 = new int[16];

	@OriginalMember(owner = "client!od", name = "Db", descriptor = "[I")
	private final int[] anIntArray309 = new int[16];

	@OriginalMember(owner = "client!od", name = "tb", descriptor = "[I")
	private final int[] anIntArray306 = new int[16];

	@OriginalMember(owner = "client!od", name = "Jb", descriptor = "[I")
	private final int[] anIntArray310 = new int[16];

	@OriginalMember(owner = "client!od", name = "vb", descriptor = "Lclient!jp;")
	private final MidiDecoder decoder = new MidiDecoder();

	@OriginalMember(owner = "client!od", name = "Kb", descriptor = "Lclient!ff;")
	private final Class2_Sub12_Sub1 noteStream = new Class2_Sub12_Sub1(this);

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "Lclient!ad;")
	private final HashTable instruments = new HashTable(128);

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public MidiPcmStream() {
		this.method4300();
		this.reset(true);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)Z")
	public synchronized boolean isValid() {
		return this.decoder.isValid();
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	public synchronized void method4270() {
		for (@Pc(11) MidiInstrument local11 = (MidiInstrument) this.instruments.head(); local11 != null; local11 = (MidiInstrument) this.instruments.next()) {
			local11.method4012();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()Lclient!ll;")
	@Override
	public synchronized PcmStream nextSubStream() {
		return null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZLclient!ej;)V")
	public void method4271(@OriginalArg(1) boolean arg0, @OriginalArg(2) MidiNote arg1) {
		@Pc(8) int local8 = arg1.aPcmSound.aByteArray31.length;
		@Pc(31) int local31;
		if (arg0 && arg1.aPcmSound.aBoolean219) {
			@Pc(41) int local41 = local8 + local8 - arg1.aPcmSound.anInt3178;
			local8 <<= 0x8;
			local31 = (int) ((long) this.anIntArray297[arg1.anInt1793] * (long) local41 >> 6);
			if (local31 >= local8) {
				arg1.stream.method5003();
				local31 = local8 + local8 - local31 - 1;
			}
		} else {
			local31 = (int) ((long) local8 * (long) this.anIntArray297[arg1.anInt1793] >> 6);
		}
		arg1.stream.method5014(local31);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!sl;ZI)V")
	public synchronized void method4272(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(1) boolean arg1) {
		this.method4282(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
	public synchronized void method4273() {
		this.method4292(true);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!ej;)Z")
	public boolean method4274(@OriginalArg(1) MidiNote arg0) {
		if (arg0.stream != null) {
			return false;
		}
		if (arg0.anInt1791 >= 0) {
			arg0.unlink();
			if (arg0.anInt1788 > 0 && arg0 == this.aClass2_Sub11ArrayArray2[arg0.anInt1793][arg0.anInt1788]) {
				this.aClass2_Sub11ArrayArray2[arg0.anInt1793][arg0.anInt1788] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
	public synchronized void clearInstrument() {
		for (@Pc(7) MidiInstrument instrument = (MidiInstrument) this.instruments.head(); instrument != null; instrument = (MidiInstrument) this.instruments.next()) {
			instrument.unlink();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZI[ILclient!ej;)Z")
	public boolean method4276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) MidiNote arg3) {
		arg3.anInt1780 = Static356.sampleRate / 100;
		if (arg3.anInt1791 >= 0 && (arg3.stream == null || arg3.stream.method5000())) {
			arg3.release();
			arg3.unlink();
			if (arg3.anInt1788 > 0 && this.aClass2_Sub11ArrayArray2[arg3.anInt1793][arg3.anInt1788] == arg3) {
				this.aClass2_Sub11ArrayArray2[arg3.anInt1793][arg3.anInt1788] = null;
			}
			return true;
		}
		@Pc(54) int local54 = arg3.anInt1794;
		if (local54 > 0) {
			local54 -= (int) (Math.pow(2.0D, (double) this.anIntArray306[arg3.anInt1793] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local54 < 0) {
				local54 = 0;
			}
			arg3.anInt1794 = local54;
		}
		arg3.stream.method4990(this.method4293(arg3));
		@Pc(97) Class17 local97 = arg3.aClass17_1;
		@Pc(99) boolean local99 = false;
		arg3.anInt1782++;
		arg3.anInt1790 += local97.anInt547;
		@Pc(136) double local136 = (double) ((arg3.anInt1776 * arg3.anInt1794 >> 12) + (arg3.anInt1781 - 60 << 8)) * 5.086263020833333E-6D;
		if (local97.anInt544 > 0) {
			if (local97.anInt541 > 0) {
				arg3.anInt1786 += (int) (Math.pow(2.0D, local136 * (double) local97.anInt541) * 128.0D + 0.5D);
			} else {
				arg3.anInt1786 += 128;
			}
			if (local97.anInt544 * arg3.anInt1786 >= 819200) {
				local99 = true;
			}
		}
		if (local97.aByteArray3 != null) {
			if (local97.anInt546 > 0) {
				arg3.anInt1778 += (int) (Math.pow(2.0D, local136 * (double) local97.anInt546) * 128.0D + 0.5D);
			} else {
				arg3.anInt1778 += 128;
			}
			while (local97.aByteArray3.length - 2 > arg3.anInt1777 && (local97.aByteArray3[arg3.anInt1777 + 2] & 0xFF) << 8 < arg3.anInt1778) {
				arg3.anInt1777 += 2;
			}
			if (arg3.anInt1777 == local97.aByteArray3.length - 2 && local97.aByteArray3[arg3.anInt1777 + 1] == 0) {
				local99 = true;
			}
		}
		if (arg3.anInt1791 >= 0 && local97.aByteArray4 != null && (this.anIntArray308[arg3.anInt1793] & 0x1) == 0 && (arg3.anInt1788 < 0 || this.aClass2_Sub11ArrayArray2[arg3.anInt1793][arg3.anInt1788] != arg3)) {
			if (local97.anInt542 <= 0) {
				arg3.anInt1791 += 128;
			} else {
				arg3.anInt1791 += (int) (Math.pow(2.0D, (double) local97.anInt542 * local136) * 128.0D + 0.5D);
			}
			while (arg3.anInt1779 < local97.aByteArray4.length - 2 && arg3.anInt1791 > (local97.aByteArray4[arg3.anInt1779 + 2] & 0xFF) << 8) {
				arg3.anInt1779 += 2;
			}
			if (arg3.anInt1779 == local97.aByteArray4.length - 2) {
				local99 = true;
			}
		}
		if (!local99) {
			arg3.stream.method4993(arg3.anInt1780, this.method4297(arg3), this.method4291(arg3));
			return false;
		}
		arg3.stream.method4989(arg3.anInt1780);
		if (arg2 == null) {
			arg3.stream.skip(arg0);
		} else {
			arg3.stream.read(arg2, arg1, arg0);
		}
		if (arg3.stream.method4988()) {
			this.noteStream.mixer.addSubStream(arg3.stream);
		}
		arg3.release();
		if (arg3.anInt1791 >= 0) {
			arg3.unlink();
			if (arg3.anInt1788 > 0 && arg3 == this.aClass2_Sub11ArrayArray2[arg3.anInt1793][arg3.anInt1788]) {
				this.aClass2_Sub11ArrayArray2[arg3.anInt1793][arg3.anInt1788] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
	public synchronized void setVolume(@OriginalArg(0) int volume) {
		this.volume = volume;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIII)V")
	private void method4278(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) MidiNote local14 = this.notes[arg0][arg1];
		if (local14 == null) {
			return;
		}
		this.notes[arg0][arg1] = null;
		if ((this.anIntArray308[arg0] & 0x2) == 0) {
			local14.anInt1791 = 0;
			return;
		}
		for (@Pc(41) MidiNote local41 = (MidiNote) this.noteStream.notes.head(); local41 != null; local41 = (MidiNote) this.noteStream.notes.next()) {
			if (local41.anInt1793 == local14.anInt1793 && local41.anInt1791 < 0 && local41 != local14) {
				local14.anInt1791 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!bk;Lclient!sl;Lclient!r;II)Z")
	public synchronized boolean method4280(@OriginalArg(0) SoundBank arg0, @OriginalArg(1) Class2_Sub34 arg1, @OriginalArg(2) Js5 arg2) {
		arg1.method5448();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(34) Class2_Sub44 local34 = (Class2_Sub44) arg1.aClass4_119.head(); local34 != null; local34 = (Class2_Sub44) arg1.aClass4_119.next()) {
			@Pc(40) int local40 = (int) local34.key;
			@Pc(48) MidiInstrument local48 = (MidiInstrument) this.instruments.get((long) local40);
			if (local48 == null) {
				local48 = Static294.method5061(local40, arg2);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.instruments.put(local48, (long) local40);
			}
			if (!local48.method4017(local34.aByteArray99, arg0, local23)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method5446();
		}
		return local9;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBI)V")
	private void method4281(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray299[arg1] = arg0;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void skip(@OriginalArg(0) int length) {
		if (this.decoder.isValid()) {
			@Pc(12) int local12 = this.microsecondsPerSecond * this.decoder.anInt3194 / Static356.sampleRate;
			do {
				@Pc(22) long local22 = this.aLong136 + (long) length * (long) local12;
				if (this.aLong135 - local22 >= 0L) {
					this.aLong136 = local22;
					break;
				}
				@Pc(51) int local51 = (int) (((long) local12 + this.aLong135 - this.aLong136 - 1L) / (long) local12);
				this.aLong136 += (long) local51 * (long) local12;
				this.noteStream.skip(local51);
				length -= local51;
				this.method4288();
			} while (this.decoder.isValid());
		}
		this.noteStream.skip(length);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void read(@OriginalArg(0) int[] samples, @OriginalArg(1) int offset, @OriginalArg(2) int length) {
		if (this.decoder.isValid()) {
			@Pc(14) int local14 = this.microsecondsPerSecond * this.decoder.anInt3194 / Static356.sampleRate;
			do {
				@Pc(23) long local23 = this.aLong136 + (long) length * (long) local14;
				if (this.aLong135 - local23 >= 0L) {
					this.aLong136 = local23;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local14 + this.aLong135 - this.aLong136 - 1L) / (long) local14);
				this.aLong136 += (long) local14 * (long) local53;
				this.noteStream.read(samples, offset, local53);
				offset += local53;
				this.method4288();
				length -= local53;
			} while (this.decoder.isValid());
		}
		this.noteStream.read(samples, offset, length);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BZZLclient!sl;)V")
	private synchronized void method4282(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class2_Sub34 arg2) {
		this.method4292(arg0);
		this.decoder.method3202(arg2.aByteArray77);
		this.aBoolean314 = arg1;
		this.aLong136 = 0L;
		@Pc(29) int local29 = this.decoder.method3192();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			this.decoder.method3205(local31);
			this.decoder.method3194(local31);
			this.decoder.method3191(local31);
		}
		this.anInt4565 = this.decoder.method3197();
		this.anInt4566 = this.decoder.anIntArray195[this.anInt4565];
		this.aLong135 = this.decoder.method3199(this.anInt4566);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZII)V")
	private void method4283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(III)V")
	private void method4284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IB)V")
	private void allSoundOff(@OriginalArg(0) int channel) {
		for (@Pc(6) MidiNote note = (MidiNote) this.noteStream.notes.head(); note != null; note = (MidiNote) this.noteStream.notes.next()) {
			if (channel < 0 || channel == note.anInt1793) {
				if (note.stream != null) {
					note.stream.method4989(Static356.sampleRate / 100);
					if (note.stream.method4988()) {
						this.noteStream.mixer.addSubStream(note.stream);
					}
					note.release();
				}
				if (note.anInt1791 < 0) {
					this.notes[note.anInt1793][note.anInt1781] = null;
				}
				note.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)V")
	private void method4286(@OriginalArg(0) int arg0) {
		if ((this.anIntArray308[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(13) MidiNote local13 = (MidiNote) this.noteStream.notes.head(); local13 != null; local13 = (MidiNote) this.noteStream.notes.next()) {
			if (local13.anInt1793 == arg0 && this.notes[arg0][local13.anInt1781] == null && local13.anInt1791 < 0) {
				local13.anInt1791 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)V")
	private void reset(@OriginalArg(0) boolean allSoundOff) {
		if (allSoundOff) {
			this.allSoundOff(-1);
		} else {
			this.allNotesOff(-1);
		}
		this.method4294(-1);
		for (@Pc(24) int local24 = 0; local24 < 16; local24++) {
			this.channelProgram[local24] = this.anIntArray304[local24];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray309[local41] = this.anIntArray304[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
	private void method4288() {
		@Pc(6) int local6 = this.anInt4565;
		@Pc(9) int local9 = this.anInt4566;
		@Pc(12) long local12 = this.aLong135;
		if (this.song != null && local9 == this.anInt4567) {
			this.method4282(this.aBoolean315, this.aBoolean314, this.song);
			this.method4288();
			return;
		}
		while (this.anInt4566 == local9) {
			while (local9 == this.decoder.anIntArray195[local6]) {
				this.decoder.method3205(local6);
				@Pc(45) int local45 = this.decoder.method3204(local6);
				if (local45 == 1) {
					this.decoder.method3193();
					this.decoder.method3191(local6);
					if (this.decoder.method3195()) {
						if (this.song != null) {
							this.method4272(this.song, this.aBoolean314);
							this.method4288();
							return;
						}
						if (!this.aBoolean314 || local9 == 0) {
							this.reset(true);
							this.decoder.release();
							return;
						}
						this.decoder.method3203(local12);
					}
					break;
				}
				if ((local45 & 0x80) != 0) {
					this.method4289(local45);
				}
				this.decoder.method3194(local6);
				this.decoder.method3191(local6);
			}
			local6 = this.decoder.method3197();
			local9 = this.decoder.anIntArray195[local6];
			local12 = this.decoder.method3199(local9);
		}
		this.anInt4565 = local6;
		this.aLong135 = local12;
		this.anInt4566 = local9;
		if (this.song != null && local9 > this.anInt4567) {
			this.anInt4566 = this.anInt4567;
			this.anInt4565 = -1;
			this.aLong135 = this.decoder.method3199(this.anInt4566);
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(II)V")
	private void method4289(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0xF0;
		@Pc(14) int local14;
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (local7 == 128) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local26 = arg0 >> 16 & 0x7F;
			this.method4278(local14, local20, local26);
		} else if (local7 == 144) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local26 = arg0 >> 16 & 0x7F;
			if (local26 <= 0) {
				this.method4278(local14, local20, 64);
			} else {
				this.method4299(local14, local20, local26);
			}
		} else if (local7 == 160) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local26 = arg0 >> 16 & 0x7F;
			this.method4283(local14, local26, local20);
		} else if (local7 == 176) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local26 = arg0 >> 16 & 0x7F;
			if (local20 == 0) {
				this.anIntArray309[local14] = (local26 << 14) + (this.anIntArray309[local14] & 0xFFE03FFF);
			}
			if (local20 == 32) {
				this.anIntArray309[local14] = (local26 << 7) + (this.anIntArray309[local14] & 0xFFFFC07F);
			}
			if (local20 == 1) {
				this.anIntArray301[local14] = (this.anIntArray301[local14] & 0xFFFFC07F) + (local26 << 7);
			}
			if (local20 == 33) {
				this.anIntArray301[local14] = local26 + (this.anIntArray301[local14] & 0xFFFFFF80);
			}
			if (local20 == 5) {
				this.anIntArray306[local14] = (local26 << 7) + (this.anIntArray306[local14] & 0xFFFFC07F);
			}
			if (local20 == 37) {
				this.anIntArray306[local14] = (this.anIntArray306[local14] & 0xFFFFFF80) + local26;
			}
			if (local20 == 7) {
				this.anIntArray296[local14] = (local26 << 7) + (this.anIntArray296[local14] & 0xFFFFC07F);
			}
			if (local20 == 39) {
				this.anIntArray296[local14] = (this.anIntArray296[local14] & 0xFFFFFF80) + local26;
			}
			if (local20 == 10) {
				this.anIntArray305[local14] = (this.anIntArray305[local14] & 0xFFFFC07F) + (local26 << 7);
			}
			if (local20 == 42) {
				this.anIntArray305[local14] = (this.anIntArray305[local14] & 0xFFFFFF80) + local26;
			}
			if (local20 == 11) {
				this.anIntArray298[local14] = (this.anIntArray298[local14] & 0xFFFFC07F) + (local26 << 7);
			}
			if (local20 == 43) {
				this.anIntArray298[local14] = (this.anIntArray298[local14] & 0xFFFFFF80) + local26;
			}
			if (local20 == 64) {
				if (local26 >= 64) {
					this.anIntArray308[local14] |= 0x1;
				} else {
					this.anIntArray308[local14] &= 0xFFFFFFFE;
				}
			}
			if (local20 == 65) {
				if (local26 >= 64) {
					this.anIntArray308[local14] |= 0x2;
				} else {
					this.method4286(local14);
					this.anIntArray308[local14] &= 0xFFFFFFFD;
				}
			}
			if (local20 == 99) {
				this.anIntArray310[local14] = (this.anIntArray310[local14] & 0x7F) + (local26 << 7);
			}
			if (local20 == 98) {
				this.anIntArray310[local14] = local26 + (this.anIntArray310[local14] & 0x3F80);
			}
			if (local20 == 101) {
				this.anIntArray310[local14] = (local26 << 7) + (this.anIntArray310[local14] & 0x7F) + 16384;
			}
			if (local20 == 100) {
				this.anIntArray310[local14] = local26 + (this.anIntArray310[local14] & 0x3F80) + 16384;
			}
			if (local20 == 120) {
				this.allSoundOff(local14);
			}
			if (local20 == 121) {
				this.method4294(local14);
			}
			if (local20 == 123) {
				this.allNotesOff(local14);
			}
			@Pc(497) int local497;
			if (local20 == 6) {
				local497 = this.anIntArray310[local14];
				if (local497 == 16384) {
					this.anIntArray307[local14] = (this.anIntArray307[local14] & 0xFFFFC07F) + (local26 << 7);
				}
			}
			if (local20 == 38) {
				local497 = this.anIntArray310[local14];
				if (local497 == 16384) {
					this.anIntArray307[local14] = (this.anIntArray307[local14] & 0xFFFFFF80) + local26;
				}
			}
			if (local20 == 16) {
				this.anIntArray297[local14] = (local26 << 7) + (this.anIntArray297[local14] & 0xFFFFC07F);
			}
			if (local20 == 48) {
				this.anIntArray297[local14] = (this.anIntArray297[local14] & 0xFFFFFF80) + local26;
			}
			if (local20 == 81) {
				if (local26 >= 64) {
					this.anIntArray308[local14] |= 0x4;
				} else {
					this.method4304(local14);
					this.anIntArray308[local14] &= 0xFFFFFFFB;
				}
			}
			if (local20 == 17) {
				this.method4305(local14, (this.anIntArray303[local14] & 0xFFFFC07F) + (local26 << 7));
			}
			if (local20 == 49) {
				this.method4305(local14, local26 + (this.anIntArray303[local14] & 0xFFFFFF80));
			}
		} else if (local7 == 192) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			this.setProgram(local14, local20 + this.anIntArray309[local14]);
		} else if (local7 == 208) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			this.method4284(local20, local14);
		} else if (local7 == 224) {
			local14 = arg0 & 0xF;
			local20 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method4281(local20, local14);
		} else {
			local7 = arg0 & 0xFF;
			if (local7 == 255) {
				this.reset(true);
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIB)V")
	private void setProgram(@OriginalArg(1) int channel, @OriginalArg(0) int program) {
		if (this.channelProgram[channel] != program) {
			this.channelProgram[channel] = program;
			for (@Pc(16) int key = 0; key < 128; key++) {
				this.aClass2_Sub11ArrayArray2[channel][key] = null;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ej;I)I")
	private int method4291(@OriginalArg(0) MidiNote arg0) {
		@Pc(9) int local9 = this.anIntArray305[arg0.anInt1793];
		return local9 < 8192 ? local9 * arg0.anInt1775 + 32 >> 6 : 16384 - ((128 - arg0.anInt1775) * (-local9 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BZ)V")
	private synchronized void method4292(@OriginalArg(1) boolean allSoundOff) {
		this.decoder.release();
		this.song = null;
		this.reset(allSoundOff);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Lclient!ej;I)I")
	private int method4293(@OriginalArg(0) MidiNote arg0) {
		@Pc(14) int local14 = (arg0.anInt1794 * arg0.anInt1776 >> 12) + arg0.anInt1795;
		local14 += this.anIntArray307[arg0.anInt1793] * (this.anIntArray299[arg0.anInt1793] - 8192) >> 12;
		@Pc(40) Class17 local40 = arg0.aClass17_1;
		@Pc(63) int local63;
		if (local40.anInt547 > 0 && (local40.anInt540 > 0 || this.anIntArray301[arg0.anInt1793] > 0)) {
			local63 = local40.anInt540 << 2;
			@Pc(68) int local68 = local40.anInt539 << 1;
			if (arg0.anInt1782 < local68) {
				local63 = local63 * arg0.anInt1782 / local68;
			}
			local63 += this.anIntArray301[arg0.anInt1793] >> 7;
			@Pc(102) double local102 = Math.sin((double) (arg0.anInt1790 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local63 * local102);
		}
		local63 = (int) ((double) (arg0.aPcmSound.anInt3176 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static356.sampleRate + 0.5D);
		return local63 < 1 ? 1 : local63;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(IB)V")
	private void method4294(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
				this.method4294(local7);
			}
			return;
		}
		this.anIntArray296[arg0] = 12800;
		this.anIntArray305[arg0] = 8192;
		this.anIntArray298[arg0] = 16383;
		this.anIntArray299[arg0] = 8192;
		this.anIntArray301[arg0] = 0;
		this.anIntArray306[arg0] = 8192;
		this.method4286(arg0);
		this.method4304(arg0);
		this.anIntArray308[arg0] = 0;
		this.anIntArray310[arg0] = 32767;
		this.anIntArray307[arg0] = 256;
		this.anIntArray297[arg0] = 0;
		this.method4305(arg0, 8192);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIB)V")
	public synchronized void init() {
		this.setDefaultProgram();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IZ)V")
	private void allNotesOff(@OriginalArg(0) int arg0) {
		for (@Pc(10) MidiNote local10 = (MidiNote) this.noteStream.notes.head(); local10 != null; local10 = (MidiNote) this.noteStream.notes.next()) {
			if ((arg0 < 0 || arg0 == local10.anInt1793) && local10.anInt1791 < 0) {
				this.notes[local10.anInt1793][local10.anInt1781] = null;
				local10.anInt1791 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "()Lclient!ll;")
	@Override
	public synchronized PcmStream firstSubStream() {
		return this.noteStream;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "()I")
	@Override
	public synchronized int method4976() {
		return 0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!ej;)I")
	private int method4297(@OriginalArg(1) MidiNote arg0) {
		if (this.anIntArray302[arg0.anInt1793] == 0) {
			return 0;
		}
		@Pc(14) Class17 local14 = arg0.aClass17_1;
		@Pc(30) int local30 = this.anIntArray296[arg0.anInt1793] * this.anIntArray298[arg0.anInt1793] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = arg0.anInt1783 * local38 + 16384 >> 15;
		@Pc(56) int local56 = local47 * this.volume + 128 >> 8;
		local30 = this.anIntArray302[arg0.anInt1793] * local56 + 128 >> 8;
		if (local14.anInt544 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) arg0.anInt1786 * 1.953125E-5D * (double) local14.anInt544) * (double) local30 + 0.5D);
		}
		@Pc(95) int local95;
		@Pc(103) int local103;
		@Pc(125) int local125;
		@Pc(137) int local137;
		if (local14.aByteArray3 != null) {
			local95 = arg0.anInt1778;
			local103 = local14.aByteArray3[arg0.anInt1777 + 1];
			if (local14.aByteArray3.length - 2 > arg0.anInt1777) {
				local125 = (local14.aByteArray3[arg0.anInt1777] & 0xFF) << 8;
				local137 = (local14.aByteArray3[arg0.anInt1777 + 2] & 0xFF) << 8;
				local103 += (local95 - local125) * (-local103 + local14.aByteArray3[arg0.anInt1777 + 3]) / (local137 - local125);
			}
			local30 = local30 * local103 + 32 >> 6;
		}
		if (arg0.anInt1791 > 0 && local14.aByteArray4 != null) {
			local95 = arg0.anInt1791;
			local103 = local14.aByteArray4[arg0.anInt1779 + 1];
			if (local14.aByteArray4.length - 2 > arg0.anInt1779) {
				local125 = (local14.aByteArray4[arg0.anInt1779] & 0xFF) << 8;
				local137 = (local14.aByteArray4[arg0.anInt1779 + 2] & 0xFF) << 8;
				local103 += (local95 - local125) * (-local103 + local14.aByteArray4[arg0.anInt1779 + 3]) / (local137 - local125);
			}
			local30 = local103 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBII)V")
	private void method4299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4278(arg0, arg1, 64);
		if ((this.anIntArray308[arg0] & 0x2) != 0) {
			for (@Pc(26) MidiNote local26 = (MidiNote) this.noteStream.notes.tail(); local26 != null; local26 = (MidiNote) this.noteStream.notes.method3546()) {
				if (local26.anInt1793 == arg0 && local26.anInt1791 < 0) {
					this.notes[arg0][local26.anInt1781] = null;
					this.notes[arg0][arg1] = local26;
					@Pc(60) int local60 = local26.anInt1795 + (local26.anInt1776 * local26.anInt1794 >> 12);
					local26.anInt1795 += arg1 - local26.anInt1781 << 8;
					local26.anInt1794 = 4096;
					local26.anInt1776 = local60 - local26.anInt1795;
					local26.anInt1781 = arg1;
					return;
				}
			}
		}
		@Pc(105) MidiInstrument local105 = (MidiInstrument) this.instruments.get((long) this.channelProgram[arg0]);
		if (local105 == null) {
			return;
		}
		@Pc(113) PcmSound local113 = local105.aPcmSound[arg1];
		if (local113 == null) {
			return;
		}
		@Pc(120) MidiNote local120 = new MidiNote();
		local120.anInt1793 = arg0;
		local120.aPcmSound = local113;
		local120.aMidiInstrument_1 = local105;
		local120.aClass17_1 = local105.aClass17Array1[arg1];
		local120.anInt1788 = local105.aByteArray46[arg1];
		local120.anInt1781 = arg1;
		local120.anInt1783 = arg2 * arg2 * local105.anInt4064 * local105.aByteArray47[arg1] + 1024 >> 11;
		local120.anInt1775 = local105.aByteArray45[arg1] & 0xFF;
		local120.anInt1795 = (arg1 << 8) - (local105.aShortArray90[arg1] & 0x7FFF);
		local120.anInt1777 = 0;
		local120.anInt1778 = 0;
		local120.anInt1791 = -1;
		local120.anInt1786 = 0;
		local120.anInt1779 = 0;
		if (this.anIntArray297[arg0] == 0) {
			local120.stream = Static405.method4997(local113, this.method4293(local120), this.method4297(local120), this.method4291(local120));
		} else {
			local120.stream = Static405.method4997(local113, this.method4293(local120), 0, this.method4291(local120));
			this.method4271(local105.aShortArray90[arg1] < 0, local120);
		}
		if (local105.aShortArray90[arg1] < 0) {
			local120.stream.method4983(-1);
		}
		if (local120.anInt1788 >= 0) {
			@Pc(276) MidiNote local276 = this.aClass2_Sub11ArrayArray2[arg0][local120.anInt1788];
			if (local276 != null && local276.anInt1791 < 0) {
				this.notes[arg0][local276.anInt1781] = null;
				local276.anInt1791 = 0;
			}
			this.aClass2_Sub11ArrayArray2[arg0][local120.anInt1788] = local120;
		}
		this.noteStream.notes.addTail(local120);
		this.notes[arg0][arg1] = local120;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(III)V")
	private synchronized void method4300() {
		for (@Pc(6) int local6 = 0; local6 < 16; local6++) {
			this.anIntArray302[local6] = 256;
		}
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)I")
	public int getVolume() {
		return this.volume;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BII)V")
	private void setDefaultProgram() {
		this.anIntArray304[9] = 128;
		this.anIntArray309[9] = 128;
		this.setProgram(9, 128);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)V")
	private void method4304(@OriginalArg(1) int arg0) {
		if ((this.anIntArray308[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(17) MidiNote local17 = (MidiNote) this.noteStream.notes.head(); local17 != null; local17 = (MidiNote) this.noteStream.notes.next()) {
			if (arg0 == local17.anInt1793) {
				local17.anInt1792 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(III)V")
	private void method4305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray303[arg0] = arg1;
		this.anIntArray300[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}
}
