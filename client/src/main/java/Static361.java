import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
	public static int checksum;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
	public static int anInt6770;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
	public static int globalCapacity = 0;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!qg;BI)V")
	public static void method6053(@OriginalArg(0) Packet arg0, @OriginalArg(2) int arg1) {
		Static112.aBoolean173 = false;
		Static325.anInt6079 = 0;
		Static1.method5(arg0);
		Static262.method6251(arg0);
		if (Static112.aBoolean173) {
			System.out.println("---endgpp---");
		}
		if (arg0.offset != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.offset + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!wm;I)V")
	public static void method6054(@OriginalArg(0) Class19 arg0) {
		@Pc(7) int local7 = Static305.anInt5743;
		@Pc(9) int local9 = Static363.anInt6801;
		@Pc(11) int local11 = Static107.anInt2220;
		@Pc(13) int local13 = Static352.anInt6519;
		arg0.method2868(local13, local7, local9, -10660793, local11);
		arg0.method2868(16, local7 + 1, local9 + 1, -16777216, local11 - 2);
		arg0.method2837(local9 + 18, local7 - -1, local13 - 19, -16777216, -2 + local11);
		Static52.aClass130_1.method5896(local7 + 3, -1, local9 + 14, -10660793, LocalisedText.CHOOSE_OPTION.getLocalisedText(client.language));
		@Pc(72) int local72 = Static226.aClass119_1.method3303();
		@Pc(76) int local76 = Static226.aClass119_1.method3312();
		@Pc(78) int local78 = 0;
		for (@Pc(88) Class2_Sub5 local88 = (Class2_Sub5) Static129.A_LINKED_LIST___19.head(); local88 != null; local88 = (Class2_Sub5) Static129.A_LINKED_LIST___19.next()) {
			@Pc(102) int local102 = (Static268.size - local78 - 1) * 16 + local9 + 31;
			@Pc(104) short local104 = -1;
			if (local72 > local7 && local7 + local11 > local72 && local76 > local102 - 13 && local76 < local102 + 3 && local88.aBoolean83) {
				local104 = -256;
			}
			@Pc(138) int[] local138 = null;
			if (Static298.method2425(local88.anInt1005)) {
				local138 = Static313.aClass107_2.get((int) local88.aLong30).anIntArray364;
			} else if (local88.anInt1008 != -1) {
				local138 = Static313.aClass107_2.get(local88.anInt1008).anIntArray364;
			} else if (Static297.method5110(local88.anInt1005)) {
				@Pc(166) Npc local166 = Static365.npcs[(int) local88.aLong30];
				if (local166 != null) {
					@Pc(171) NpcType local171 = local166.type;
					if (local171.multiNpcs != null) {
						local171 = local171.getMultiNpc(Static214.aClass226_1);
					}
					if (local171 != null) {
						local138 = local171.anIntArray131;
					}
				}
			} else if (Static241.method4189(local88.anInt1005)) {
				@Pc(207) Class41 local207;
				if (local88.anInt1005 == 1010) {
					local207 = Static359.aClass202_4.method5162((int) local88.aLong30);
				} else {
					local207 = Static359.aClass202_4.method5162((int) (local88.aLong30 >>> 32 & 0x7FFFFFFFL));
				}
				if (local207.anIntArray94 != null) {
					local207 = local207.method1533(Static214.aClass226_1);
				}
				if (local207 != null) {
					local138 = local207.anIntArray96;
				}
			}
			@Pc(241) String local241 = Static318.method5420(local88);
			if (local138 != null) {
				local241 = local241 + Static158.method2938(local138);
			}
			Static52.aClass130_1.method5900(Static72.anIntArray114, Static134.aClass13Array12, local7 + 3, local241, local102, local104);
			if (local88.aBoolean82) {
				Static119.aClass13_7.method6384(local7 + Static113.aClass239_2.method6125(local241) + 5, local102 + -12);
			}
			local78++;
		}
		Static148.method2710(Static363.anInt6801, Static305.anInt5743, Static352.anInt6519, Static107.anInt2220);
	}
}
