import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Js5NetQueue {

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "Lclient!iu;")
	private BufferedSocket socket;

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
	private int latency;

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "J")
	private long previousLoop;

	@OriginalMember(owner = "client!pp", name = "G", descriptor = "Lclient!jj;")
	private Js5NetRequest current;

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "Lclient!wc;")
	private final Class246 pendingUrgentRequests = new Class246();

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "Lclient!wc;")
	private final Class246 inFlightUrgentRequests = new Class246();

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "Lclient!wc;")
	private final Class246 pendingPrefetchRequests = new Class246();

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "Lclient!wc;")
	private final Class246 inFlightPrefetchRequests = new Class246();

	@OriginalMember(owner = "client!pp", name = "B", descriptor = "Lclient!bt;")
	private final Buffer outBuffer = new Buffer(4);

	@OriginalMember(owner = "client!pp", name = "E", descriptor = "B")
	private byte encryptionKey = 0;

	@OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
	public volatile int errors = 0;

	@OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
	public volatile int response = 0;

	@OriginalMember(owner = "client!pp", name = "C", descriptor = "Lclient!bt;")
	private final Buffer ingoingBuffer = new Buffer(8);

	static {
		new LocalisedText("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
	private void writeConnected() {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.offset = 0;
			this.outBuffer.p1(6);
			this.outBuffer.p3(3);
			this.socket.write(this.outBuffer.bytes, 4);
		} catch (@Pc(40) IOException ioException) {
			try {
				this.socket.close();
			} catch (@Pc(46) Exception exception) {
			}
			this.response = -2;
			this.errors++;
			this.socket = null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public void breakConnection() {
		if (this.socket != null) {
			this.socket.breakConnection();
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
	public void closeServer() {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.offset = 0;
			this.outBuffer.p1(7);
			this.outBuffer.p3(0);
			this.socket.write(this.outBuffer.bytes, 4);
		} catch (@Pc(34) IOException exception) {
			try {
				this.socket.close();
			} catch (@Pc(40) Exception closeException) {
			}
			this.response = -2;
			this.socket = null;
			this.errors++;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)Z")
	public boolean method4635() {
		return this.getPrefetchRequestCount() >= 20;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)I")
	public int getUrgentRequestCount() {
		return this.pendingUrgentRequests.size() + this.inFlightUrgentRequests.size();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!iu;ZI)V")
	public void start(@OriginalArg(0) BufferedSocket socket, @OriginalArg(1) boolean loggedIn) {
		if (this.socket != null) {
			try {
				this.socket.close();
			} catch (@Pc(16) Exception exception) {
			}
			this.socket = null;
		}
		this.socket = socket;
		this.writeConnected();
		this.writeLoggedIn(loggedIn);
		this.ingoingBuffer.offset = 0;
		this.current = null;
		while (true) {
			@Pc(44) Js5NetRequest prefetchRequest = (Js5NetRequest) this.inFlightUrgentRequests.removeHead();
			if (prefetchRequest == null) {
				while (true) {
					prefetchRequest = (Js5NetRequest) this.inFlightPrefetchRequests.removeHead();
					if (prefetchRequest == null) {
						if (this.encryptionKey != 0) {
							try {
								this.outBuffer.offset = 0;
								this.outBuffer.p1(4);
								this.outBuffer.p1(this.encryptionKey);
								this.outBuffer.p2(0);
								this.socket.write(this.outBuffer.bytes, 4);
							} catch (@Pc(103) IOException local103) {
								try {
									this.socket.close();
								} catch (@Pc(111) Exception local111) {
								}
								this.socket = null;
								this.response = -2;
								this.errors++;
							}
						}
						this.latency = 0;
						this.previousLoop = MonotonicClock.currentTimeMillis();
						return;
					}
					this.pendingPrefetchRequests.addTail(prefetchRequest);
				}
			}
			this.pendingUrgentRequests.addTail(prefetchRequest);
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)Z")
	public boolean method4639() {
		@Pc(18) int local18;
		if (this.socket != null) {
			@Pc(11) long local11 = MonotonicClock.currentTimeMillis();
			local18 = (int) (local11 - this.previousLoop);
			this.previousLoop = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.latency += local18;
			if (this.latency > 30000) {
				try {
					this.socket.close();
				} catch (@Pc(46) Exception local46) {
				}
				this.socket = null;
			}
		}
		if (this.socket == null) {
			return this.getUrgentRequestCount() == 0 && this.getPrefetchRequestCount() == 0;
		}
		try {
			this.socket.checkError();
			for (@Pc(74) Js5NetRequest local74 = (Js5NetRequest) this.pendingUrgentRequests.head(); local74 != null; local74 = (Js5NetRequest) this.pendingUrgentRequests.next()) {
				this.outBuffer.offset = 0;
				this.outBuffer.p1(1);
				this.outBuffer.p3((int) local74.secondaryKey);
				this.socket.write(this.outBuffer.bytes, 4);
				this.inFlightUrgentRequests.addTail(local74);
			}
			for (@Pc(126) Js5NetRequest local126 = (Js5NetRequest) this.pendingPrefetchRequests.head(); local126 != null; local126 = (Js5NetRequest) this.pendingPrefetchRequests.next()) {
				this.outBuffer.offset = 0;
				this.outBuffer.p1(0);
				this.outBuffer.p3((int) local126.secondaryKey);
				this.socket.write(this.outBuffer.bytes, 4);
				this.inFlightPrefetchRequests.addTail(local126);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(175) int local175 = this.socket.available();
				if (local175 < 0) {
					throw new IOException();
				}
				if (local175 == 0) {
					break;
				}
				this.latency = 0;
				@Pc(191) byte local191 = 0;
				if (this.current == null) {
					local191 = 8;
				} else if (this.current.anInt3083 == 0) {
					local191 = 1;
				}
				@Pc(219) int local219;
				@Pc(243) int local243;
				@Pc(301) int local301;
				if (local191 > 0) {
					local219 = local191 - this.ingoingBuffer.offset;
					if (local175 < local219) {
						local219 = local175;
					}
					this.socket.read(this.ingoingBuffer.offset, local219, this.ingoingBuffer.bytes);
					if (this.encryptionKey != 0) {
						for (local243 = 0; local243 < local219; local243++) {
							this.ingoingBuffer.bytes[this.ingoingBuffer.offset + local243] = (byte) (this.ingoingBuffer.bytes[this.ingoingBuffer.offset + local243] ^ this.encryptionKey);
						}
					}
					this.ingoingBuffer.offset += local219;
					if (this.ingoingBuffer.offset >= local191) {
						if (this.current == null) {
							this.ingoingBuffer.offset = 0;
							local243 = this.ingoingBuffer.g1();
							local301 = this.ingoingBuffer.g2();
							@Pc(306) int local306 = this.ingoingBuffer.g1();
							@Pc(311) int local311 = this.ingoingBuffer.mg4();
							@Pc(315) int local315 = local306 & 0x7F;
							@Pc(326) boolean local326 = (local306 & 0x80) != 0;
							@Pc(333) long local333 = (long) ((local243 << 16) + local301);
							@Pc(343) Js5NetRequest local343;
							if (local326) {
								for (local343 = (Js5NetRequest) this.inFlightPrefetchRequests.head(); local343 != null && local333 != local343.secondaryKey; local343 = (Js5NetRequest) this.inFlightPrefetchRequests.next()) {
								}
							} else {
								for (local343 = (Js5NetRequest) this.inFlightUrgentRequests.head(); local343 != null && local343.secondaryKey != local333; local343 = (Js5NetRequest) this.inFlightUrgentRequests.next()) {
								}
							}
							if (local343 == null) {
								throw new IOException();
							}
							this.current = local343;
							@Pc(399) int local399 = local315 == 0 ? 5 : 9;
							this.current.data = new Buffer(local311 + local399 + this.current.trailerLength);
							this.current.data.p1(local315);
							this.current.data.p4(local311);
							this.current.anInt3083 = 8;
							this.ingoingBuffer.offset = 0;
						} else if (this.current.anInt3083 != 0) {
							throw new IOException();
						} else if (this.ingoingBuffer.bytes[0] == -1) {
							this.current.anInt3083 = 1;
							this.ingoingBuffer.offset = 0;
						} else {
							this.current = null;
						}
					}
				} else {
					local219 = this.current.data.bytes.length - this.current.trailerLength;
					local243 = 512 - this.current.anInt3083;
					if (local219 - this.current.data.offset < local243) {
						local243 = local219 - this.current.data.offset;
					}
					if (local175 < local243) {
						local243 = local175;
					}
					this.socket.read(this.current.data.offset, local243, this.current.data.bytes);
					if (this.encryptionKey != 0) {
						for (local301 = 0; local301 < local243; local301++) {
							this.current.data.bytes[local301 + this.current.data.offset] ^= this.encryptionKey;
						}
					}
					this.current.data.offset += local243;
					this.current.anInt3083 += local243;
					if (local219 == this.current.data.offset) {
						this.current.unlinkSecondary();
						this.current.incomplete = false;
						this.current = null;
					} else if (this.current.anInt3083 == 512) {
						this.current.anInt3083 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(619) IOException local619) {
			try {
				this.socket.close();
			} catch (@Pc(625) Exception local625) {
			}
			this.socket = null;
			this.errors++;
			this.response = -2;
			return this.getUrgentRequestCount() == 0 && this.getPrefetchRequestCount() == 0;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZIBBI)Lclient!jj;")
	public Js5NetRequest read(@OriginalArg(1) int archive, @OriginalArg(4) int group, @OriginalArg(0) boolean urgent, @OriginalArg(3) byte trailerLength) {
		@Pc(16) long key = group + (archive << 16);
		@Pc(20) Js5NetRequest request = new Js5NetRequest();
		request.urgent = urgent;
		request.secondaryKey = key;
		request.trailerLength = trailerLength;
		if (urgent) {
			if (this.getUrgentRequestCount() >= 20) {
				throw new RuntimeException();
			}
			this.pendingUrgentRequests.addTail(request);
		} else if (this.getPrefetchRequestCount() < 20) {
			this.pendingPrefetchRequests.addTail(request);
		} else {
			throw new RuntimeException();
		}
		return request;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)V")
	public void rekey() {
		try {
			this.socket.close();
		} catch (@Pc(9) Exception local9) {
		}
		this.response = -1;
		this.socket = null;
		this.errors++;
		this.encryptionKey = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)Z")
	public boolean isUrgentRequestQueueFull() {
		return this.getUrgentRequestCount() >= 20;
	}

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)V")
	public void quit() {
		if (this.socket != null) {
			this.socket.close();
		}
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(Z)I")
	private int getPrefetchRequestCount() {
		return this.pendingPrefetchRequests.size() + this.inFlightPrefetchRequests.size();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZI)V")
	public void writeLoggedIn(@OriginalArg(0) boolean loggedIn) {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.offset = 0;
			this.outBuffer.p1(loggedIn ? 2 : 3);
			this.outBuffer.p3(0);
			this.socket.write(this.outBuffer.bytes, 4);
		} catch (@Pc(41) IOException local41) {
			try {
				this.socket.close();
			} catch (@Pc(49) Exception local49) {
			}
			this.response = -2;
			this.errors++;
			this.socket = null;
		}
	}
}
