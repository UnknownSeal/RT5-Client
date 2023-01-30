import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
	public static int anInt7028;

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
	public static int anInt7030;

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_254 = new Class145(43, 8);

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
	public static int anInt7029 = -1;

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
	public static int anInt7032 = 0;

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
	public static int anInt7033 = 104;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZIZIZ)V")
	public static void method6266(@OriginalArg(0) boolean loginScreen, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (!arg2 && Static105.anInt2187 == arg1 && Static9.anInt212 == arg3 && (Static355.anInt6585 == Static44.visibleLevel || Static218.aClass177_Sub1_2.method4494(Static77.anInt1762))) {
			return;
		}
		Static44.visibleLevel = Static355.anInt6585;
		Static105.anInt2187 = arg1;
		Static9.anInt212 = arg3;
		if (Static218.aClass177_Sub1_2.method4494(Static77.anInt1762)) {
			Static44.visibleLevel = 0;
		}
		if (loginScreen) {
			Static336.method5704(28);
		} else {
			Static336.method5704(25);
		}
		Static351.method5856(Static276.aClass130_4, true, Static256.A_TRANSLATABLE_STRING___102.getLocalisedText(Static295.anInt5581));
		@Pc(59) int local59 = Static164.originX;
		Static164.originX = (Static105.anInt2187 - (anInt7033 >> 4)) * 8;
		@Pc(70) int local70 = Static148.originZ;
		Static148.originZ = (Static9.anInt212 - (Static242.anInt4449 >> 4)) * 8;
		Static91.aClass2_Sub2_Sub17_1 = Static344.method5526(Static105.anInt2187 * 8, Static9.anInt212 * 8);
		Static34.aClass103_3 = null;
		@Pc(94) int local94 = Static164.originX - local59;
		@Pc(99) int local99 = Static148.originZ - local70;
		@Pc(103) int local103;
		@Pc(113) int local113;
		if (loginScreen) {
			Static166.size = 0;
			local103 = (anInt7033 - 1) * 128;
			@Pc(175) int local175 = (Static242.anInt4449 - 1) * 128;
			for (local113 = 0; local113 < 32768; local113++) {
				@Pc(183) Npc local183 = Static365.npcs[local113];
				if (local183 != null) {
					local183.anInt6781 -= local94 * 128;
					local183.anInt6783 -= local99 * 128;
					if (local183.anInt6781 >= 0 && local183.anInt6781 <= local103 && local183.anInt6783 >= 0 && local183.anInt6783 <= local175) {
						@Pc(232) boolean local232 = true;
						for (@Pc(234) int local234 = 0; local234 < 10; local234++) {
							local183.anIntArray316[local234] -= local94;
							local183.anIntArray317[local234] -= local99;
							if (local183.anIntArray316[local234] < 0 || anInt7033 <= local183.anIntArray316[local234] || local183.anIntArray317[local234] < 0 || local183.anIntArray317[local234] >= Static242.anInt4449) {
								local232 = false;
							}
						}
						if (local232) {
							Static211.ids[Static166.size++] = local113;
						} else {
							Static365.npcs[local113].setType(null);
							Static365.npcs[local113] = null;
						}
					} else {
						Static365.npcs[local113].setType(null);
						Static365.npcs[local113] = null;
					}
				}
			}
		} else {
			for (local103 = 0; local103 < 32768; local103++) {
				@Pc(109) Npc local109 = Static365.npcs[local103];
				if (local109 != null) {
					for (local113 = 0; local113 < 10; local113++) {
						local109.anIntArray316[local113] -= local94;
						local109.anIntArray317[local113] -= local99;
					}
					local109.anInt6783 -= local99 * 128;
					local109.anInt6781 -= local94 * 128;
				}
			}
		}
		for (local103 = 0; local103 < 2048; local103++) {
			@Pc(314) Class11_Sub5_Sub2_Sub1 local314 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local103];
			if (local314 != null) {
				for (local113 = 0; local113 < 10; local113++) {
					local314.anIntArray316[local113] -= local94;
					local314.anIntArray317[local113] -= local99;
				}
				local314.anInt6783 -= local99 * 128;
				local314.anInt6781 -= local94 * 128;
			}
		}
		Static372.method6261(local99, local94);
		for (@Pc(371) Class2_Sub37 local371 = (Class2_Sub37) Static207.aClass135_26.method3550(); local371 != null; local371 = (Class2_Sub37) Static207.aClass135_26.method3551()) {
			local371.anInt6484 -= local94;
			local371.anInt6486 -= local99;
			if (local371.anInt6484 < 0 || local371.anInt6486 < 0 || local371.anInt6484 >= anInt7033 || local371.anInt6486 >= Static242.anInt4449) {
				local371.unlink();
			}
		}
		Static243.anInt4503 = 0;
		if (Static358.anInt6550 != 0) {
			Static358.anInt6550 -= local94;
			Static312.anInt5844 -= local99;
		}
		if (loginScreen) {
			Static311.anInt5810 -= local94;
			Static136.anInt6778 -= local94 * 128;
			Static123.anInt2420 -= local99;
			Static211.anInt3777 -= local99 * 128;
			Static19.anInt535 -= local99;
			Static254.anInt4698 -= local94;
			if (Math.abs(local94) > anInt7033 || Math.abs(local99) > Static242.anInt4449) {
				Static348.method5827();
			}
		} else if (Static314.anInt5911 == 4) {
			Static288.anInt5463 -= local94 * 128;
			Static348.anInt6448 -= local99 * 128;
			Static394.anInt7264 -= local94 * 128;
			Static62.anInt2395 -= local99 * 128;
		} else {
			Static314.anInt5911 = 1;
		}
		Static160.method2955();
		Static247.method4298();
		Static129.aClass135_20.method3543();
		Static332.aClass135_38.method3543();
		Static284.aClass36_7.method1416();
		Static120.method2380();
	}
}
