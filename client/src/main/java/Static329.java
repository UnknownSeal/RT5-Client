import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
	public static int anInt6167;

	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "Lclient!oj;")
	public static final Class170 aClass170_4 = new Class170(1);

	@OriginalMember(owner = "client!tc", name = "T", descriptor = "[I")
	public static final int[] loops = new int[50];

	@OriginalMember(owner = "client!tc", name = "W", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!tc", name = "Y", descriptor = "Lclient!ad;")
	public static HashTable aClass4_130 = new HashTable(8);

	@OriginalMember(owner = "client!tc", name = "ab", descriptor = "[I")
	public static final int[] anIntArray420 = new int[3];

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZIIIIZ)V")
	public static void method5628(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg2 >= arg4) {
			return;
		}
		@Pc(22) int local22 = (arg4 + arg2) / 2;
		@Pc(24) int local24 = arg2;
		@Pc(28) World local28 = Static300.aWorldArray2[local22];
		Static300.aWorldArray2[local22] = Static300.aWorldArray2[arg4];
		Static300.aWorldArray2[arg4] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg4; local40++) {
			if (Static212.method3729(arg1, arg0, Static300.aWorldArray2[local40], local28, arg3, arg5) <= 0) {
				@Pc(57) World local57 = Static300.aWorldArray2[local40];
				Static300.aWorldArray2[local40] = Static300.aWorldArray2[local24];
				Static300.aWorldArray2[local24++] = local57;
			}
		}
		Static300.aWorldArray2[arg4] = Static300.aWorldArray2[local24];
		Static300.aWorldArray2[local24] = local28;
		method5628(arg0, arg1, arg2, arg3, local24 - 1, arg5);
		method5628(arg0, arg1, local24 + 1, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!hb;Z)Z")
	public static boolean method5629(@OriginalArg(0) Class11_Sub5 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static365.aClass6Array4 == Static186.aClass6Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method6077();
		if (arg0.aShort103 < 0 || arg0.aShort101 < 0 || arg0.aShort104 >= Static72.anInt1684 || arg0.aShort102 >= Static210.anInt3773) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort103; local34 <= arg0.aShort104; local34++) {
			for (local38 = arg0.aShort101; local38 <= arg0.aShort102; local38++) {
				@Pc(45) Class67 local45 = Static266.method4499(arg0.aByte78, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort103) {
						local49++;
					}
					if (local34 < arg0.aShort104) {
						local49 += 4;
					}
					if (local38 > arg0.aShort101) {
						local49 += 8;
					}
					if (local38 < arg0.aShort102) {
						local49 += 2;
					}
					@Pc(74) Class22 local74 = Static165.method3148(local49, arg0);
					@Pc(77) Class22 local77 = local45.aClass22_2;
					if (local77 == null) {
						local45.aClass22_2 = local74;
					} else {
						while (local77.aClass22_1 != null) {
							local77 = local77.aClass22_1;
						}
						local77.aClass22_1 = local74;
					}
					local45.aByte8 = (byte) (local45.aByte8 | local49);
					if (local6 && (Static82.anIntArrayArray16[local34][local38] & 0xFF000000) != 0) {
						local8 = Static82.anIntArrayArray16[local34][local38];
						local10 = Static32.aByteArrayArray4[local34][local38];
						local12 = Static314.aByteArrayArray17[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort103; local38 <= arg0.aShort104; local38++) {
				for (@Pc(150) int local150 = arg0.aShort101; local150 <= arg0.aShort102; local150++) {
					if ((Static82.anIntArrayArray16[local38][local150] & 0xFF000000) == 0) {
						Static82.anIntArrayArray16[local38][local150] = local8;
						Static32.aByteArrayArray4[local38][local150] = local10;
						Static314.aByteArrayArray17[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static98.aClass11_Sub5Array1[Static378.anInt7077++] = arg0;
		}
		return true;
	}
}
