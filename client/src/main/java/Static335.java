import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "Lclient!iu;")
	public static BufferedSocket socket;

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "Lclient!hu;")
	public static final SoftLruHashTable A_SOFT_LRU_HASH_TABLE___57 = new SoftLruHashTable(200);

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "[B")
	public static final byte[] aByteArray92 = new byte[2048];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
	public static void method5693() {
		if (Static190.aClass19_8 == null) {
			return;
		}
		Static34.aClass36_6.method1416();
		Static253.method4365();
		Static247.method4298();
		Static190.method3501();
		Static339.method5758();
		Static389.method4489();
		if (Static368.aSkyBox_1 != null) {
			Static368.aSkyBox_1.method1618();
		}
		Static393.method6460();
		Static211.method3720();
		Static155.method2790();
		Static241.method4191(false);
		Static67.clear();
		for (@Pc(41) int local41 = 0; local41 < 2048; local41++) {
			@Pc(47) Class11_Sub5_Sub2_Sub1 local47 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local41];
			if (local47 != null) {
				local47.aClass2_Sub6_3 = null;
				for (@Pc(54) int local54 = 0; local54 < local47.aModelArray3.length; local54++) {
					local47.aModelArray3[local54] = null;
				}
			}
		}
		for (@Pc(73) int local73 = 0; local73 < Static365.npcs.length; local73++) {
			@Pc(79) Npc local79 = Static365.npcs[local73];
			if (local79 != null) {
				for (@Pc(83) int local83 = 0; local83 < local79.aModelArray3.length; local83++) {
					local79.aModelArray3[local83] = null;
				}
			}
		}
		Static190.aClass19_8.method2825();
		Static190.aClass19_8 = null;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)Lclient!oj;")
	public static Class170 method5694(@OriginalArg(1) int arg0) {
		@Pc(13) Class170[] local13 = Static207.method3703();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class170 local21 = local13[local15];
			if (local21.anInt4690 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
