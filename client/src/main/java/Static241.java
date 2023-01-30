import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "J")
	public static long aLong130;

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "Lclient!h;")
	public static final Class89 aClass89_170 = new Class89(19, 0);

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
	public static int anInt4445 = 0;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)Z")
	public static boolean method4189(@OriginalArg(1) int arg0) {
		if (arg0 == 50 || arg0 == 20 || arg0 == 12 || arg0 == 17 || arg0 == 1004) {
			return true;
		} else {
			return arg0 == 57 || arg0 == 1010;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!oe;ZZ)V")
	public static void method4190(@OriginalArg(0) Npc arg0, @OriginalArg(1) boolean arg1) {
		if (Static268.anInt4959 >= 400) {
			return;
		}
		@Pc(16) NpcType local16 = arg0.type;
		if (local16.multiNpcs != null) {
			local16 = local16.getMultiNpc(Static214.aClass226_1);
			if (local16 == null) {
				return;
			}
		}
		if (!local16.interactive) {
			return;
		}
		@Pc(34) String local34 = local16.name;
		if (local16.vislevel != 0) {
			@Pc(50) String local50 = client.game == Static106.aClass50_1 ? Static367.A_TRANSLATABLE_STRING___142.getLocalisedText(client.language) : Static33.A_TRANSLATABLE_STRING___96.getLocalisedText(client.language);
			local34 = local34 + Static178.method2343(Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4179, local16.vislevel) + " (" + local50 + local16.vislevel + ")";
		}
		if (!Static330.aBoolean419) {
			if (!arg1) {
				@Pc(80) String[] local80 = local16.ops;
				if (Static338.aBoolean465) {
					local80 = Static97.method2095(local80);
				}
				@Pc(90) int local90;
				if (local80 != null) {
					for (local90 = 4; local90 >= 0; local90--) {
						if (local80[local90] != null && (Static249.aClass50_3 != client.game || !local80[local90].equalsIgnoreCase(Static378.A_TRANSLATABLE_STRING___146.getLocalisedText(client.language)))) {
							@Pc(110) byte local110 = 0;
							@Pc(112) int local112 = Static91.anInt1910;
							if (local90 == 0) {
								local110 = 5;
							}
							if (local90 == 1) {
								local110 = 25;
							}
							if (local90 == 2) {
								local110 = 4;
							}
							if (local90 == 3) {
								local110 = 3;
							}
							if (local90 == 4) {
								local110 = 8;
							}
							if (local90 == local16.cursor1op) {
								local112 = local16.cursor1;
							}
							if (local90 == local16.cursor2op) {
								local112 = local16.cursor2;
							}
							Static1.method3(-1, true, 0, false, local80[local90], 0, local110, "<col=ffff00>" + local34, local112, (long) arg0.anInt4619);
						}
					}
				}
				if (client.game == Static249.aClass50_3 && local80 != null) {
					for (local90 = 4; local90 >= 0; local90--) {
						if (local80[local90] != null && local80[local90].equalsIgnoreCase(Static378.A_TRANSLATABLE_STRING___146.getLocalisedText(client.language))) {
							@Pc(211) short local211 = 0;
							if (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4179 < local16.vislevel) {
								local211 = 2000;
							}
							@Pc(224) short local224 = 0;
							if (local90 == 0) {
								local224 = 5;
							}
							if (local90 == 1) {
								local224 = 25;
							}
							if (local90 == 2) {
								local224 = 4;
							}
							if (local90 == 3) {
								local224 = 3;
							}
							if (local90 == 4) {
								local224 = 8;
							}
							if (local224 != 0) {
								local224 += local211;
							}
							Static1.method3(-1, true, 0, false, local80[local90], 0, local224, "<col=ffff00>" + local34, local16.attackcursor, (long) arg0.anInt4619);
						}
					}
				}
			}
			Static1.method3(-1, true, 0, arg1, Static368.A_TRANSLATABLE_STRING___143.getLocalisedText(client.language), 0, 1006, "<col=ffff00>" + local34, Static135.anInt2523, (long) arg0.anInt4619);
		} else if (!arg1) {
			@Pc(335) Class240 local335 = Static172.anInt3298 == -1 ? null : Static363.aClass18_2.method565(Static172.anInt3298);
			if ((Static115.anInt3837 & 0x2) != 0) {
				if (local335 == null || local16.method2098(local335.anInt7023, Static172.anInt3298) != local335.anInt7023) {
					Static1.method3(-1, true, 0, false, Static91.aString18, 0, 10, Static371.aString68 + " -> <col=ffff00>" + local34, Static41.anInt1044, (long) arg0.anInt4619);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZI)V")
	public static void method4191(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static344.aClass2_Sub2_Sub17_3 != null) {
			Static97.anInt2034 = Static344.aClass2_Sub2_Sub17_3.anInt6869;
		} else {
			Static97.anInt2034 = -1;
		}
		Static227.aClass161_11 = null;
		Static344.aClass2_Sub2_Sub17_3 = null;
		Static355.anInt6581 = 0;
		Static197.aClass135_24 = null;
		Static344.method5512();
		Static344.aClass135_36.method3543();
		Static27.aClass113_2 = null;
		Static249.aClass113_8 = null;
		Static30.aClass113_3 = null;
		Static77.anInt1763 = -1;
		Static74.aClass113_4 = null;
		Static344.aClass103_5 = null;
		Static2.aClass113_1 = null;
		Static238.anInt4328 = -1;
		Static369.aClass113_9 = null;
		Static175.aClass113_6 = null;
		Static107.aClass113_5 = null;
		Static371.aClass13_20 = null;
		Static344.aClass125_4.method3379();
		Static344.aClass104_4.method2702(64, 64);
		Static344.aClass125_4.method3376(64, 128);
		Static344.aClass202_3.method5160(64);
		Static322.aClass128_1.method3391(64);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V")
	public static void method4193() {
		Static202.anIntArray220 = Static321.method5478(0.4F);
	}
}
