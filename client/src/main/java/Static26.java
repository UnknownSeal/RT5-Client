import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "[[B")
	public static byte[][] fakeModelCacheEntries;

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "[[Lclient!nk;")
	public static Component[][] aComponentArrayArray1;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	public static void method862() {
		if (Static369.aBoolean471) {
			return;
		}
		Static100.aBoolean156 = true;
		Static369.aBoolean471 = true;
		if (Static218.preferences.aBoolean351) {
			Static277.aFloat67 = (int) Static277.aFloat67 - 65 & 0xFFFFFF80;
		} else {
			Static184.aFloat39 += (-Static184.aFloat39 - 24.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)S")
	public static short method863(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(41) int local41 = local24 <= 64 ? local24 * local20 >> 7 : (127 - local24) * local20 >> 7;
		@Pc(45) int local45 = local41 + local24;
		@Pc(51) int local51;
		if (local45 == 0) {
			local51 = local41 << 1;
		} else {
			local51 = (local41 << 8) / local45;
		}
		return (short) (local45 | local9 << 10 | local51 >> 4 << 7);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)Lclient!el;")
	public static Class11_Sub2 method865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Static330.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass11_Sub2_2 == null ? null : local7.aClass11_Sub2_2;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIILclient!da;)V")
	public static void method866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11_Sub4 arg4) {
		@Pc(4) Class67 local4 = Static266.method4499(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt3968 = (arg1 << Static322.anInt6029) + Static253.anInt4693;
		arg4.anInt3965 = arg3;
		arg4.anInt3967 = (arg2 << Static322.anInt6029) + Static253.anInt4693;
		for (@Pc(28) Class22 local28 = local4.aClass22_2; local28 != null; local28 = local28.aClass22_1) {
			if (local28.aClass11_Sub5_1.aBoolean463) {
				@Pc(38) int local38 = local28.aClass11_Sub5_1.method6079();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt3965 += local8;
			arg4.aBoolean259 = true;
		}
		local4.aClass11_Sub4_1 = arg4;
	}
}
