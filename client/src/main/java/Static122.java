import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_89 = new Class145(12, 8);

	@OriginalMember(owner = "client!h", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean176 = false;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method2398() {
		Static200.redraw(Static375.aComponent_14);
		Static129.anInt2458++;
		if (Static301.aBoolean403 && Static278.aBoolean377) {
			@Pc(26) int local26 = Static226.aClass119_1.method3303();
			@Pc(30) int local30 = Static226.aClass119_1.method3312();
			local26 -= Static18.anInt530;
			local30 -= Static392.anInt7228;
			if (local26 < Static4.anInt88) {
				local26 = Static4.anInt88;
			}
			if (local30 < Static100.anInt2111) {
				local30 = Static100.anInt2111;
			}
			if (Static375.aComponent_14.width + local26 > Static301.aComponent_13.width + Static4.anInt88) {
				local26 = Static301.aComponent_13.width + Static4.anInt88 - Static375.aComponent_14.width;
			}
			if (local30 + Static375.aComponent_14.height > Static100.anInt2111 + Static301.aComponent_13.height) {
				local30 = Static301.aComponent_13.height + Static100.anInt2111 - Static375.aComponent_14.height;
			}
			@Pc(105) int local105 = local26 + Static301.aComponent_13.scrollX - Static4.anInt88;
			@Pc(113) int local113 = local30 + Static301.aComponent_13.scrollY - Static100.anInt2111;
			@Pc(128) Class2_Sub13 local128;
			if (Static226.aClass119_1.method3304()) {
				if (Static375.aComponent_14.anInt4271 < Static129.anInt2458) {
					@Pc(205) int local205 = local26 - Static168.anInt7248;
					@Pc(210) int local210 = local30 - Static3.anInt61;
					if (Static375.aComponent_14.anInt4239 < local205 || -Static375.aComponent_14.anInt4239 > local205 || local210 > Static375.aComponent_14.anInt4239 || local210 < -Static375.aComponent_14.anInt4239) {
						Static57.aBoolean124 = true;
					}
				}
				if (Static375.aComponent_14.anObjectArray31 != null && Static57.aBoolean124) {
					local128 = new Class2_Sub13();
					local128.anInt2117 = local113;
					local128.aComponent_3 = Static375.aComponent_14;
					local128.anObjectArray4 = Static375.aComponent_14.anObjectArray31;
					local128.anInt2116 = local105;
					ScriptRunner.method3590(local128);
				}
			} else {
				if (Static57.aBoolean124) {
					Static207.method3698();
					if (Static375.aComponent_14.anObjectArray8 != null) {
						local128 = new Class2_Sub13();
						local128.anInt2116 = local105;
						local128.aComponent_4 = Static182.aComponent_7;
						local128.aComponent_3 = Static375.aComponent_14;
						local128.anObjectArray4 = Static375.aComponent_14.anObjectArray8;
						local128.anInt2117 = local113;
						ScriptRunner.method3590(local128);
					}
					if (Static182.aComponent_7 != null && Static45.method1413(Static375.aComponent_14) != null) {
						Static295.method5095(Static182.aComponent_7, Static375.aComponent_14);
					}
				} else if ((Static232.anInt4087 == 1 || Static208.method3709()) && Static268.size > 2) {
					Static143.method2679(Static392.anInt7228 + Static3.anInt61, Static168.anInt7248 + Static18.anInt530);
				} else if (Static270.method4554()) {
					Static143.method2679(Static392.anInt7228 + Static3.anInt61, Static168.anInt7248 + Static18.anInt530);
				}
				Static375.aComponent_14 = null;
			}
		} else if (Static129.anInt2458 > 1) {
			Static375.aComponent_14 = null;
		}
	}
}
