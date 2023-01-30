import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!du", name = "b", descriptor = "Z")
	public static boolean aBoolean129 = true;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IZ)V")
	public static void method1780(@OriginalArg(1) boolean arg0) {
		Static242.anInt4450 = 0;
		Static343.anInt6390 = 0;
		Static315.method5381();
		Static17.method4209(arg0);
		Static236.method4111();
		@Pc(24) int local24;
		for (@Pc(18) int local18 = 0; local18 < Static242.anInt4450; local18++) {
			local24 = Static17.anIntArray291[local18];
			if (Static114.loop != Static365.npcs[local24].lastSeenLoop) {
				if (Static365.npcs[local24].type.method2099()) {
					Static154.method2781(Static365.npcs[local24]);
				}
				Static365.npcs[local24].setType(null);
				Static365.npcs[local24] = null;
			}
		}
		if (Static212.aClass2_Sub4_Sub2_3.offset != Static82.anInt1836) {
			throw new RuntimeException("gnp1 pos:" + Static212.aClass2_Sub4_Sub2_3.offset + " psize:" + Static82.anInt1836);
		}
		for (local24 = 0; local24 < Static166.size; local24++) {
			if (Static365.npcs[Static211.ids[local24]] == null) {
				throw new RuntimeException("gnp2 pos:" + local24 + " size:" + Static166.size);
			}
		}
	}
}
