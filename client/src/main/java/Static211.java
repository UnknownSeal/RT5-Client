import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
	public static int anInt3777;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Lclient!jd;")
	public static Class13 aClass13_13;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
	public static int anInt3780;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "[I")
	public static final int[] ids = new int[1024];

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
	public static void method3720() {
		Static39.aClass72_3.method2103();
		Static336.aClass241_5.method6269();
		Static21.aClass55_1.method1782();
		Static359.aClass202_4.method5158();
		Static6.aClass219_1.method5570();
		Static313.aClass107_2.method2761();
		Static39.aClass85_1.method2373();
		Static322.aClass211_2.method5409();
		Static322.aClass128_1.method3394();
		Static56.aClass199_1.method5107();
		Static59.aClass7_1.method241();
		Static320.aClass104_2.method2707();
		Static236.aClass125_1.method3379();
		Static287.aClass233_1.method5880();
		Static363.aClass18_2.method563();
		Static9.aClass213_1.method5425();
		Static278.aClass160_1.method4032();
		Static90.aClass190_3.method4884();
		Static221.aClass150_3.method3732();
		Static367.aClass132_1.method3474();
		Static140.method2627();
		Static91.method1962();
		Static71.method6020();
		if (Static189.aClass127_6 != Static121.aClass127_4) {
			for (@Pc(80) int local80 = 0; local80 < Static26.aByteArrayArray3.length; local80++) {
				Static26.aByteArrayArray3[local80] = null;
			}
			Static50.anInt1332 = 0;
		}
		Static286.method4920();
		Static273.method4626();
		Static369.method6216();
		Static192.method3507();
		Static161.method2968();
		ScriptRunner.A_SOFT_LRU_HASH_TABLE___30.method2614();
		Static190.aClass19_8.method2903();
		Static261.aClass116_7.method3152();
		Static194.method3540();
		Static342.aJs5_77.method5067();
		Static34.aJs5_67.method5067();
		Static289.aJs5_71.method5067();
		Static354.aJs5_9.method5067();
		Static85.aJs5_21.method5067();
		Static288.js5Archive5.method5067();
		Static101.aJs5_23.method5067();
		Static237.aJs5_63.method5067();
		Static30.aJs5_5.method5067();
		Static324.aJs5_86.method5067();
		Static75.aJs5_18.method5067();
		Static216.aJs5_58.method5067();
		Static195.aJs5_54.method5067();
		Static255.aJs5_64.method5067();
		Static133.aJs5_32.method5067();
		Static120.aJs5_28.method5067();
		Static391.aJs5_96.method5067();
		Static226.aJs5_61.method5067();
		Static216.aJs5_57.method5067();
		Static61.aJs5_12.method5067();
		Static139.aJs5_35.method5067();
		Static173.aJs5_45.method5067();
		Static294.aJs5_75.method5067();
		Static389.aJs5_66.method5067();
		Static385.aJs5_94.method5067();
		Static139.aJs5_34.method5067();
		Static235.aJs5_47.method5067();
		Static61.aJs5_11.method5067();
		Static85.aJs5_20.method5067();
		Static306.A_SOFT_LRU_HASH_TABLE___49.method2614();
		Static139.A_SOFT_LRU_HASH_TABLE___18.method2614();
		Static61.A_SOFT_LRU_HASH_TABLE___5.method2614();
		Static210.A_SOFT_LRU_HASH_TABLE___31.method2614();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
	public static void method3721(@OriginalArg(1) int arg0) {
		Static77.anInt1763 = -1;
		if (arg0 == 37) {
			Static344.aFloat73 = 3.0F;
		} else if (arg0 == 50) {
			Static344.aFloat73 = 4.0F;
		} else if (arg0 == 75) {
			Static344.aFloat73 = 6.0F;
		} else if (arg0 == 100) {
			Static344.aFloat73 = 8.0F;
		} else if (arg0 == 200) {
			Static344.aFloat73 = 16.0F;
		}
		Static77.anInt1763 = -1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ct;IILclient!nh;Lclient!oe;BII)V")
	public static void method3723(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub5_Sub2_Sub1 arg3, @OriginalArg(4) Npc arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class2_Sub19 local7 = new Class2_Sub19();
		local7.anInt2905 = arg6;
		local7.anInt2899 = arg5 * 128;
		local7.anInt2910 = arg1 * 128;
		if (arg0 != null) {
			local7.aClass41_1 = arg0;
			@Pc(33) int local33 = arg0.anInt1356;
			@Pc(36) int local36 = arg0.anInt1327;
			if (arg2 == 1 || arg2 == 3) {
				local33 = arg0.anInt1327;
				local36 = arg0.anInt1356;
			}
			local7.anIntArray181 = arg0.anIntArray93;
			local7.anInt2903 = arg0.anInt1334;
			local7.anInt2896 = (arg5 + local33) * 128;
			local7.anInt2901 = arg0.anInt1307 * 128;
			local7.anInt2904 = (local36 + arg1) * 128;
			local7.anInt2906 = arg0.anInt1320;
			local7.anInt2894 = arg0.anInt1325;
			local7.anInt2897 = arg0.anInt1315;
			if (arg0.anIntArray94 != null) {
				local7.aBoolean204 = true;
				local7.method2940();
			}
			if (local7.anIntArray181 != null) {
				local7.anInt2907 = local7.anInt2903 + (int) ((double) (local7.anInt2897 - local7.anInt2903) * Math.random());
			}
			Static83.A_LINKED_LIST___14.method3539(local7);
		} else if (arg4 != null) {
			local7.aClass11_Sub5_Sub2_Sub2_1 = arg4;
			@Pc(131) NpcType local131 = arg4.type;
			if (local131.multiNpcs != null) {
				local7.aBoolean204 = true;
				local131 = local131.getMultiNpc(Static214.aClass226_1);
			}
			if (local131 != null) {
				local7.anInt2904 = (arg1 + local131.size) * 128;
				local7.anInt2896 = (arg5 + local131.size) * 128;
				local7.anInt2894 = Static340.method5763(arg4);
				local7.anInt2901 = local131.soundradius * 128;
				local7.anInt2906 = local131.soundvolume;
			}
			Static363.A_LINKED_LIST___39.method3539(local7);
		} else if (arg3 != null) {
			local7.aClass11_Sub5_Sub2_Sub1_2 = arg3;
			local7.anInt2896 = (arg5 + arg3.method4327()) * 128;
			local7.anInt2904 = (arg1 + arg3.method4327()) * 128;
			local7.anInt2894 = Static384.method6414(arg3);
			local7.anInt2906 = arg3.anInt4201;
			local7.anInt2901 = arg3.anInt4182 * 128;
			Static232.aClass4_86.put(local7, (long) arg3.anInt4619);
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
	public static void method3724() {
		if (Static86.anInt1870 > 0) {
			Static99.method2144();
		} else {
			Static246.aBufferedSocket_2 = Static335.socket;
			Static335.socket = null;
			Static336.method5704(40);
		}
	}
}
