import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class91 {

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Lclient!sg;")
	public Class211 aClass211_1;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
	private int anInt2452;

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
	public int anInt2453;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
	private int anInt2445 = 0;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
	private int anInt2447 = 128;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
	private int anInt2446 = 0;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Z")
	public boolean aBoolean177 = false;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
	public int anInt2448 = -1;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
	private int anInt2454 = 128;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
	private int anInt2450 = 0;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "Z")
	public boolean aBoolean178 = false;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!bt;)V")
	public void method2430(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.g1();
			if (local17 == 0) {
				return;
			}
			this.method2431(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!bt;I)V")
	private void method2431(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2452 = arg0.g2();
		} else if (arg1 == 2) {
			this.anInt2448 = arg0.g2();
		} else if (arg1 == 4) {
			this.anInt2454 = arg0.g2();
		} else if (arg1 == 5) {
			this.anInt2447 = arg0.g2();
		} else if (arg1 == 6) {
			this.anInt2445 = arg0.g2();
		} else if (arg1 == 7) {
			this.anInt2446 = arg0.g1();
		} else if (arg1 == 8) {
			this.anInt2450 = arg0.g1();
		} else if (arg1 == 9) {
			this.aBoolean178 = true;
		} else if (arg1 == 10) {
			this.aBoolean177 = true;
		} else {
			@Pc(96) int local96;
			@Pc(106) int local106;
			if (arg1 == 40) {
				local96 = arg0.g1();
				this.aShortArray52 = new short[local96];
				this.aShortArray49 = new short[local96];
				for (local106 = 0; local106 < local96; local106++) {
					this.aShortArray52[local106] = (short) arg0.g2();
					this.aShortArray49[local106] = (short) arg0.g2();
				}
			} else if (arg1 == 41) {
				local96 = arg0.g1();
				this.aShortArray51 = new short[local96];
				this.aShortArray50 = new short[local96];
				for (local106 = 0; local106 < local96; local106++) {
					this.aShortArray51[local106] = (short) arg0.g2();
					this.aShortArray50[local106] = (short) arg0.g2();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILclient!wm;BILclient!gp;I)Lclient!gn;")
	public Model method2433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class85 arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg3;
		@Pc(23) Class157 local23 = this.anInt2448 == -1 || arg5 == -1 ? null : arg4.method2371(this.anInt2448);
		if (local23 != null) {
			local7 = arg3 | local23.method3989(arg5, false, arg0);
		}
		if (this.anInt2447 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt2454 != 128 || this.anInt2445 != 0) {
			local7 |= 0x5;
		}
		@Pc(62) SoftLruHashTable local62 = this.aClass211_1.aSoftLruHashTable_51;
		@Pc(82) Model local82;
		synchronized (this.aClass211_1.aSoftLruHashTable_51) {
			local82 = (Model) this.aClass211_1.aSoftLruHashTable_51.get((long) (this.anInt2453 |= arg2.anInt2836 << 29));
		}
		if (local82 == null || arg2.method2863(local82.method3826(), local7) != 0) {
			if (local82 != null) {
				local7 = arg2.method2806(local7, local82.method3826());
			}
			@Pc(109) int local109 = local7;
			if (this.aShortArray52 != null) {
				local109 = local7 | 0x2000;
			}
			if (this.aShortArray51 != null) {
				local109 |= 0x4000;
			}
			@Pc(132) RawModel local132 = RawModel.create(this.aClass211_1.aJs5_81, this.anInt2452);
			if (local132 == null) {
				return null;
			}
			local82 = arg2.method2864(local132, local109, this.aClass211_1.anInt5958, this.anInt2446 + 64, this.anInt2450 + 850);
			@Pc(157) int local157;
			if (this.aShortArray52 != null) {
				for (local157 = 0; local157 < this.aShortArray52.length; local157++) {
					local82.method3837(this.aShortArray52[local157], this.aShortArray49[local157]);
				}
			}
			if (this.aShortArray51 != null) {
				for (local157 = 0; local157 < this.aShortArray51.length; local157++) {
					local82.method3815(this.aShortArray51[local157], this.aShortArray50[local157]);
				}
			}
			local82.method3813(local7);
			@Pc(209) SoftLruHashTable local209 = this.aClass211_1.aSoftLruHashTable_51;
			synchronized (this.aClass211_1.aSoftLruHashTable_51) {
				this.aClass211_1.aSoftLruHashTable_51.put((long) (this.anInt2453 |= arg2.anInt2836 << 29), local82);
			}
		}
		@Pc(253) Model local253 = local23 == null ? local82.method3799((byte) 2, local7, true) : local23.method3986(arg0, (byte) 2, arg5, 0, arg1, local7, local82);
		if (this.anInt2454 != 128 || this.anInt2447 != 128) {
			local253.method3841(this.anInt2454, this.anInt2447, this.anInt2454);
		}
		if (this.anInt2445 != 0) {
			if (this.anInt2445 == 90) {
				local253.method3832(4096);
			}
			if (this.anInt2445 == 180) {
				local253.method3832(8192);
			}
			if (this.anInt2445 == 270) {
				local253.method3832(12288);
			}
		}
		local253.method3813(arg3);
		return local253;
	}
}
