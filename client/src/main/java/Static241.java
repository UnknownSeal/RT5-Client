import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "J")
	public static long encodedUsername;

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
	public static void addNpcEntries(@OriginalArg(0) Npc npc, @OriginalArg(1) boolean arg1) {
		if (Static268.size >= 400) {
			return;
		}
		@Pc(16) NpcType type = npc.type;
		if (type.multiNpcs != null) {
			type = type.getMultiNpc(Static214.aClass226_1);
			if (type == null) {
				return;
			}
		}
		if (!type.interactive) {
			return;
		}
		@Pc(34) String nameWithLevel = type.name;
		if (type.combatLevel != 0) {
			@Pc(50) String levelPrefix = client.game == GameType.GAME_TYPE_STELLARDAWN ? LocalisedText.RATING.getLocalisedText(client.language) : LocalisedText.LEVEL.getLocalisedText(client.language);
			nameWithLevel = nameWithLevel + Static178.getCombatLevelColor(Static17.self.combatLevel, type.combatLevel) + " (" + levelPrefix + type.combatLevel + ")";
		}
		if (!Static330.aBoolean419) {
			if (!arg1) {
				@Pc(80) String[] ops = type.ops;
				if (Static338.aBoolean465) {
					ops = Static97.method2095(ops);
				}
				@Pc(90) int i;
				if (ops != null) {
					for (i = 4; i >= 0; i--) {
						if (ops[i] != null && (client.game != GameType.GAME_TYPE_RUNESCAPE || !ops[i].equalsIgnoreCase(LocalisedText.ATTACK.getLocalisedText(client.language)))) {
							@Pc(110) byte local110 = 0;
							@Pc(112) int local112 = Static91.anInt1910;
							if (i == 0) {
								local110 = 5;
							}
							if (i == 1) {
								local110 = 25;
							}
							if (i == 2) {
								local110 = 4;
							}
							if (i == 3) {
								local110 = 3;
							}
							if (i == 4) {
								local110 = 8;
							}
							if (i == type.cursor1op) {
								local112 = type.cursor1;
							}
							if (i == type.cursor2op) {
								local112 = type.cursor2;
							}
							Static1.add(-1, true, 0, false, ops[i], 0, local110, "<col=ffff00>" + nameWithLevel, local112, (long) npc.anInt4619);
						}
					}
				}
				if (client.game == GameType.GAME_TYPE_RUNESCAPE && ops != null) {
					for (i = 4; i >= 0; i--) {
						if (ops[i] != null && ops[i].equalsIgnoreCase(LocalisedText.ATTACK.getLocalisedText(client.language))) {
							@Pc(211) short priority = 0;
							if (Static17.self.combatLevel < type.combatLevel) {
								priority = 2000;
							}
							@Pc(224) short action = 0;
							if (i == 0) {
								action = 5;
							}
							if (i == 1) {
								action = 25;
							}
							if (i == 2) {
								action = 4;
							}
							if (i == 3) {
								action = 3;
							}
							if (i == 4) {
								action = 8;
							}
							if (action != 0) {
								action += priority;
							}
							Static1.add(-1, true, 0, false, ops[i], 0, action, "<col=ffff00>" + nameWithLevel, type.cursor, npc.anInt4619);
						}
					}
				}
			}
			Static1.add(-1, true, 0, arg1, LocalisedText.EXAMINE.getLocalisedText(client.language), 0, 1006, "<col=ffff00>" + nameWithLevel, Static135.anInt2523, (long) npc.anInt4619);
		} else if (!arg1) {
			@Pc(335) Class240 local335 = Static172.anInt3298 == -1 ? null : Static363.aClass18_2.method565(Static172.anInt3298);
			if ((Static115.anInt3837 & 0x2) != 0) {
				if (local335 == null || type.method2098(local335.anInt7023, Static172.anInt3298) != local335.anInt7023) {
					Static1.add(-1, true, 0, false, Static91.aString18, 0, 10, Static371.aString68 + " -> <col=ffff00>" + nameWithLevel, Static41.anInt1044, (long) npc.anInt4619);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZI)V")
	public static void method4191(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static344.aMap_3 != null) {
			Static97.anInt2034 = Static344.aMap_3.id;
		} else {
			Static97.anInt2034 = -1;
		}
		Static227.aComponent_11 = null;
		Static344.aMap_3 = null;
		Static355.loadPercentage = 0;
		Static197.aLinkedList_24 = null;
		Static344.method5512();
		Static344.A_LINKED_LIST___36.clear();
		Static27.font26 = null;
		Static249.font19 = null;
		Static30.font22 = null;
		Static77.anInt1763 = -1;
		Static74.font11 = null;
		Static344.labels = null;
		Static2.font14 = null;
		Static238.anInt4328 = -1;
		Static369.font30 = null;
		Static175.font17 = null;
		Static107.font12 = null;
		Static371.aSprite_20 = null;
		Static344.aClass125_4.method3379();
		Static344.aClass104_4.method2702(64, 64);
		Static344.aClass125_4.method3376(64, 128);
		Static344.aLocTypeList_3.method5160(64);
		VarbitTypeList.varbitTypeList.method3391(64);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V")
	public static void method4193() {
		Static202.anIntArray220 = Static321.method5478(0.4F);
	}
}
