import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
	public static int anInt5697;

	@OriginalMember(owner = "client!ri", name = "X", descriptor = "[[I")
	public static int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!ri", name = "N", descriptor = "Lclient!nk;")
	public static Component aComponent_13 = null;

	@OriginalMember(owner = "client!ri", name = "P", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[128][128];

	@OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
	public static int anInt5700 = 0;

	@OriginalMember(owner = "client!ri", name = "V", descriptor = "Z")
	public static boolean aBoolean403 = false;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(Z)V")
	public static void method5187() {
		for (@Pc(14) Class2_Sub2_Sub9 local14 = (Class2_Sub2_Sub9) Static332.A_LINKED_LIST___38.head(); local14 != null; local14 = (Class2_Sub2_Sub9) Static332.A_LINKED_LIST___38.next()) {
			@Pc(19) Class11_Sub5_Sub3 local19 = local14.aClass11_Sub5_Sub3_1;
			if (local19.aByte78 != Static355.anInt6585 || local19.anInt4722 < Static114.loop) {
				local14.unlink();
				local19.method4390();
			} else if (Static114.loop >= local19.anInt4725) {
				if (local19.anInt4714 > 0) {
					@Pc(56) Npc local56 = Static365.npcs[local19.anInt4714 - 1];
					if (local56 != null && local56.xFine >= 0 && local56.xFine < Static373.anInt7033 * 128 && local56.zFine >= 0 && Static242.anInt4449 * 128 > local56.zFine) {
						local19.method4396(Static386.method6031(local56.xFine, local56.zFine, local19.aByte78) - local19.anInt4736, local56.xFine, Static114.loop, local56.zFine);
					}
				}
				if (local19.anInt4714 < 0) {
					@Pc(111) int local111 = -local19.anInt4714 - 1;
					@Pc(120) Class11_Sub5_Sub2_Sub1 local120;
					if (local111 == Static234.selfID) {
						local120 = Static17.self;
					} else {
						local120 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local111];
					}
					if (local120 != null && local120.xFine >= 0 && local120.xFine < Static373.anInt7033 * 128 && local120.zFine >= 0 && local120.zFine < Static242.anInt4449 * 128) {
						local19.method4396(Static386.method6031(local120.xFine, local120.zFine, local19.aByte78) - local19.anInt4736, local120.xFine, Static114.loop, local120.zFine);
					}
				}
				local19.method4391(Static165.anInt3148);
				Static329.method5629(local19, true);
			}
		}
	}
}
