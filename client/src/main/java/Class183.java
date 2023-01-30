import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class183 {

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "Lclient!iu;")
	private BufferedSocket socket;

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
	private int anInt5061;

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "J")
	private long aLong151;

	@OriginalMember(owner = "client!pp", name = "G", descriptor = "Lclient!jj;")
	private Class2_Sub2_Sub10_Sub1 aClass2_Sub2_Sub10_Sub1_2;

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "Lclient!wc;")
	private final Class246 aClass246_5 = new Class246();

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "Lclient!wc;")
	private final Class246 aClass246_6 = new Class246();

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "Lclient!wc;")
	private final Class246 aClass246_7 = new Class246();

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "Lclient!wc;")
	private final Class246 aClass246_8 = new Class246();

	@OriginalMember(owner = "client!pp", name = "B", descriptor = "Lclient!bt;")
	private final Buffer outBuffer = new Buffer(4);

	@OriginalMember(owner = "client!pp", name = "E", descriptor = "B")
	private byte aByte55 = 0;

	@OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
	public volatile int anInt5063 = 0;

	@OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
	public volatile int anInt5062 = 0;

	@OriginalMember(owner = "client!pp", name = "C", descriptor = "Lclient!bt;")
	private final Buffer aClass2_Sub4_8 = new Buffer(8);

	static {
		new LocalisedText("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
	private void method4631() {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.offset = 0;
			this.outBuffer.p1(6);
			this.outBuffer.p3(3);
			this.socket.write(this.outBuffer.data, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.socket.method2799();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt5062 = -2;
			this.anInt5063++;
			this.socket = null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public void method4632() {
		if (this.socket != null) {
			this.socket.method2801();
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
	public void method4634() {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.offset = 0;
			this.outBuffer.p1(7);
			this.outBuffer.p3(0);
			this.socket.write(this.outBuffer.data, 4);
		} catch (@Pc(34) IOException local34) {
			try {
				this.socket.method2799();
			} catch (@Pc(40) Exception local40) {
			}
			this.anInt5062 = -2;
			this.socket = null;
			this.anInt5063++;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)Z")
	public boolean method4635() {
		return this.method4645() >= 20;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)I")
	public int method4636() {
		return this.aClass246_5.method6337() + this.aClass246_6.method6337();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!iu;ZI)V")
	public void method4638(@OriginalArg(0) BufferedSocket arg0, @OriginalArg(1) boolean arg1) {
		if (this.socket != null) {
			try {
				this.socket.method2799();
			} catch (@Pc(16) Exception local16) {
			}
			this.socket = null;
		}
		this.socket = arg0;
		this.method4631();
		this.writeLoggedIn(arg1);
		this.aClass2_Sub4_8.offset = 0;
		this.aClass2_Sub2_Sub10_Sub1_2 = null;
		while (true) {
			@Pc(44) Class2_Sub2_Sub10_Sub1 local44 = (Class2_Sub2_Sub10_Sub1) this.aClass246_6.method6338();
			if (local44 == null) {
				while (true) {
					local44 = (Class2_Sub2_Sub10_Sub1) this.aClass246_8.method6338();
					if (local44 == null) {
						if (this.aByte55 != 0) {
							try {
								this.outBuffer.offset = 0;
								this.outBuffer.p1(4);
								this.outBuffer.p1(this.aByte55);
								this.outBuffer.p2(0);
								this.socket.write(this.outBuffer.data, 4);
							} catch (@Pc(103) IOException local103) {
								try {
									this.socket.method2799();
								} catch (@Pc(111) Exception local111) {
								}
								this.socket = null;
								this.anInt5062 = -2;
								this.anInt5063++;
							}
						}
						this.anInt5061 = 0;
						this.aLong151 = Static204.method3684();
						return;
					}
					this.aClass246_7.method6340(local44);
				}
			}
			this.aClass246_5.method6340(local44);
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)Z")
	public boolean method4639() {
		@Pc(18) int local18;
		if (this.socket != null) {
			@Pc(11) long local11 = Static204.method3684();
			local18 = (int) (local11 - this.aLong151);
			this.aLong151 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt5061 += local18;
			if (this.anInt5061 > 30000) {
				try {
					this.socket.method2799();
				} catch (@Pc(46) Exception local46) {
				}
				this.socket = null;
			}
		}
		if (this.socket == null) {
			return this.method4636() == 0 && this.method4645() == 0;
		}
		try {
			this.socket.method2792();
			for (@Pc(74) Class2_Sub2_Sub10_Sub1 local74 = (Class2_Sub2_Sub10_Sub1) this.aClass246_5.head(); local74 != null; local74 = (Class2_Sub2_Sub10_Sub1) this.aClass246_5.next()) {
				this.outBuffer.offset = 0;
				this.outBuffer.p1(1);
				this.outBuffer.p3((int) local74.aLong215);
				this.socket.write(this.outBuffer.data, 4);
				this.aClass246_6.method6340(local74);
			}
			for (@Pc(126) Class2_Sub2_Sub10_Sub1 local126 = (Class2_Sub2_Sub10_Sub1) this.aClass246_7.head(); local126 != null; local126 = (Class2_Sub2_Sub10_Sub1) this.aClass246_7.next()) {
				this.outBuffer.offset = 0;
				this.outBuffer.p1(0);
				this.outBuffer.p3((int) local126.aLong215);
				this.socket.write(this.outBuffer.data, 4);
				this.aClass246_8.method6340(local126);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(175) int local175 = this.socket.method2795();
				if (local175 < 0) {
					throw new IOException();
				}
				if (local175 == 0) {
					break;
				}
				this.anInt5061 = 0;
				@Pc(191) byte local191 = 0;
				if (this.aClass2_Sub2_Sub10_Sub1_2 == null) {
					local191 = 8;
				} else if (this.aClass2_Sub2_Sub10_Sub1_2.anInt3083 == 0) {
					local191 = 1;
				}
				@Pc(219) int local219;
				@Pc(243) int local243;
				@Pc(301) int local301;
				if (local191 > 0) {
					local219 = local191 - this.aClass2_Sub4_8.offset;
					if (local175 < local219) {
						local219 = local175;
					}
					this.socket.method2793(this.aClass2_Sub4_8.data, local219, this.aClass2_Sub4_8.offset);
					if (this.aByte55 != 0) {
						for (local243 = 0; local243 < local219; local243++) {
							this.aClass2_Sub4_8.data[this.aClass2_Sub4_8.offset + local243] = (byte) (this.aClass2_Sub4_8.data[this.aClass2_Sub4_8.offset + local243] ^ this.aByte55);
						}
					}
					this.aClass2_Sub4_8.offset += local219;
					if (this.aClass2_Sub4_8.offset >= local191) {
						if (this.aClass2_Sub2_Sub10_Sub1_2 == null) {
							this.aClass2_Sub4_8.offset = 0;
							local243 = this.aClass2_Sub4_8.g1();
							local301 = this.aClass2_Sub4_8.g2();
							@Pc(306) int local306 = this.aClass2_Sub4_8.g1();
							@Pc(311) int local311 = this.aClass2_Sub4_8.mg4();
							@Pc(315) int local315 = local306 & 0x7F;
							@Pc(326) boolean local326 = (local306 & 0x80) != 0;
							@Pc(333) long local333 = (long) ((local243 << 16) + local301);
							@Pc(343) Class2_Sub2_Sub10_Sub1 local343;
							if (local326) {
								for (local343 = (Class2_Sub2_Sub10_Sub1) this.aClass246_8.head(); local343 != null && local333 != local343.aLong215; local343 = (Class2_Sub2_Sub10_Sub1) this.aClass246_8.next()) {
								}
							} else {
								for (local343 = (Class2_Sub2_Sub10_Sub1) this.aClass246_6.head(); local343 != null && local343.aLong215 != local333; local343 = (Class2_Sub2_Sub10_Sub1) this.aClass246_6.next()) {
								}
							}
							if (local343 == null) {
								throw new IOException();
							}
							this.aClass2_Sub2_Sub10_Sub1_2 = local343;
							@Pc(399) int local399 = local315 == 0 ? 5 : 9;
							this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3 = new Buffer(local311 + local399 + this.aClass2_Sub2_Sub10_Sub1_2.aByte27);
							this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.p1(local315);
							this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.p4(local311);
							this.aClass2_Sub2_Sub10_Sub1_2.anInt3083 = 8;
							this.aClass2_Sub4_8.offset = 0;
						} else if (this.aClass2_Sub2_Sub10_Sub1_2.anInt3083 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub4_8.data[0] == -1) {
							this.aClass2_Sub2_Sub10_Sub1_2.anInt3083 = 1;
							this.aClass2_Sub4_8.offset = 0;
						} else {
							this.aClass2_Sub2_Sub10_Sub1_2 = null;
						}
					}
				} else {
					local219 = this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.data.length - this.aClass2_Sub2_Sub10_Sub1_2.aByte27;
					local243 = 512 - this.aClass2_Sub2_Sub10_Sub1_2.anInt3083;
					if (local219 - this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.offset < local243) {
						local243 = local219 - this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.offset;
					}
					if (local175 < local243) {
						local243 = local175;
					}
					this.socket.method2793(this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.data, local243, this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.offset);
					if (this.aByte55 != 0) {
						for (local301 = 0; local301 < local243; local301++) {
							this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.data[local301 + this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.offset] ^= this.aByte55;
						}
					}
					this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.offset += local243;
					this.aClass2_Sub2_Sub10_Sub1_2.anInt3083 += local243;
					if (local219 == this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.offset) {
						this.aClass2_Sub2_Sub10_Sub1_2.unlinkSecondary();
						this.aClass2_Sub2_Sub10_Sub1_2.aBoolean416 = false;
						this.aClass2_Sub2_Sub10_Sub1_2 = null;
					} else if (this.aClass2_Sub2_Sub10_Sub1_2.anInt3083 == 512) {
						this.aClass2_Sub2_Sub10_Sub1_2.anInt3083 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(619) IOException local619) {
			try {
				this.socket.method2799();
			} catch (@Pc(625) Exception local625) {
			}
			this.socket = null;
			this.anInt5063++;
			this.anInt5062 = -2;
			return this.method4636() == 0 && this.method4645() == 0;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZIBBI)Lclient!jj;")
	public Class2_Sub2_Sub10_Sub1 method4641(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) ((arg1 << 16) + arg3);
		@Pc(20) Class2_Sub2_Sub10_Sub1 local20 = new Class2_Sub2_Sub10_Sub1();
		local20.aBoolean418 = arg0;
		local20.aLong215 = local16;
		local20.aByte27 = arg2;
		if (arg0) {
			if (this.method4636() >= 20) {
				throw new RuntimeException();
			}
			this.aClass246_5.method6340(local20);
		} else if (this.method4645() < 20) {
			this.aClass246_7.method6340(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)V")
	public void method4642() {
		try {
			this.socket.method2799();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt5062 = -1;
		this.socket = null;
		this.anInt5063++;
		this.aByte55 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)Z")
	public boolean method4643() {
		return this.method4636() >= 20;
	}

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)V")
	public void method4644() {
		if (this.socket != null) {
			this.socket.method2799();
		}
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(Z)I")
	private int method4645() {
		return this.aClass246_7.method6337() + this.aClass246_8.method6337();
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
			this.socket.write(this.outBuffer.data, 4);
		} catch (@Pc(41) IOException local41) {
			try {
				this.socket.method2799();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt5062 = -2;
			this.anInt5063++;
			this.socket = null;
		}
	}
}
