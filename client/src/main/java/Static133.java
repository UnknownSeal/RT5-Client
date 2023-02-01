import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "Lclient!hu;")
	public static final SoftLruHashTable A_SOFT_LRU_HASH_TABLE___17 = new SoftLruHashTable(4);

	@OriginalMember(owner = "client!hl", name = "I", descriptor = "Lclient!h;")
	public static final Class89 aClass89_103 = new Class89(61, 4);

	@OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
	public static final int anInt2489 = 1406;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BJ)V")
	public static void method2503(@OriginalArg(1) long arg0) {
		if (Static330.aClass67ArrayArrayArray3 != null) {
			if (Static314.anInt5911 == 1 || Static314.anInt5911 == 5) {
				Static182.method3385(arg0);
			} else if (Static314.anInt5911 == 4) {
				Static256.method4394(arg0);
			}
		}
		Static371.method6256((long) Static114.loop, Static190.aClass19_8);
		if (Static139.topLevelInterface != -1) {
			Static232.method4027(Static139.topLevelInterface);
		}
		for (@Pc(42) int local42 = 0; local42 < Static154.anInt2806; local42++) {
			if (Static357.aBooleanArray59[local42]) {
				Static375.aBooleanArray64[local42] = true;
			}
			Static20.aBooleanArray6[local42] = Static357.aBooleanArray59[local42];
			Static357.aBooleanArray59[local42] = false;
		}
		Static132.anInt2468 = Static114.loop;
		if (Static190.aClass19_8.method2871()) {
			Static106.aBoolean164 = true;
		}
		if (Static139.topLevelInterface != -1) {
			Static154.anInt2806 = 0;
			Static46.method1421();
		}
		Static190.aClass19_8.method2898();
		Static162.method2979(Static190.aClass19_8);
		@Pc(97) int local97 = Static33.method4200();
		if (local97 == -1) {
			local97 = Static394.anInt7263;
		}
		Static307.method5254(local97);
		Static56.method1616(Static17.self.xFine, Static17.self.zFine, Static165.anInt3148, Static17.self.aByte78);
		Static165.anInt3148 = 0;
	}
}
