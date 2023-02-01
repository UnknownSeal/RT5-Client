import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!km", name = "k", descriptor = "I")
	public static int anInt3435;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "F")
	public static float aFloat39 = 0.0F;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "I")
	public static int anInt3436 = -1;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I")
	public static int getParticles() {
		return Preferences.particles;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLclient!nh;I)V")
	public static void method3396(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class11_Sub5_Sub2_Sub1 arg1) {
		if (Static268.size >= 400 || Static17.self == arg1) {
			return;
		}
		@Pc(146) String local146;
		@Pc(72) int local72;
		if (arg1.anInt4173 == 0) {
			@Pc(23) boolean local23 = true;
			if (Static17.self.anInt4191 != -1 && arg1.anInt4191 != -1) {
				@Pc(47) int local47 = arg1.combatLevel >= Static17.self.combatLevel ? arg1.combatLevel : Static17.self.combatLevel;
				@Pc(62) int local62 = arg1.anInt4191 > Static17.self.anInt4191 ? Static17.self.anInt4191 : arg1.anInt4191;
				local72 = local62 + local47 * 10 / 100 + 5;
				@Pc(79) int local79 = Static17.self.combatLevel - arg1.combatLevel;
				if (local79 < 0) {
					local79 = -local79;
				}
				if (local79 > local72) {
					local23 = false;
				}
			}
			@Pc(109) String local109 = GameType.GAME_TYPE_STELLARDAWN == client.game ? LocalisedText.RATING.getLocalisedText(client.language) : LocalisedText.LEVEL.getLocalisedText(client.language);
			if (arg1.anInt4171 <= arg1.combatLevel) {
				local146 = arg1.method4071() + (local23 ? Static178.getCombatLevelColor(Static17.self.combatLevel, arg1.combatLevel) : "<col=ffffff>") + " (" + local109 + arg1.combatLevel + ")";
			} else {
				local146 = arg1.method4071() + (local23 ? Static178.getCombatLevelColor(Static17.self.combatLevel, arg1.combatLevel) : "<col=ffffff>") + " (" + local109 + arg1.combatLevel + "+" + (arg1.anInt4171 - arg1.combatLevel) + ")";
			}
		} else {
			local146 = arg1.method4071() + " (" + LocalisedText.SKILL.getLocalisedText(client.language) + arg1.anInt4173 + ")";
		}
		if (Static330.aBoolean419) {
			if (!arg0 && (Static115.anInt3837 & 0x8) != 0) {
				Static1.add(-1, true, 0, false, Static91.aString18, 0, 60, Static371.aString68 + " -> <col=ffffff>" + local146, Static41.anInt1044, (long) arg1.anInt4619);
			}
		} else if (arg0) {
			Static1.add(0, false, 0, true, "<col=cccccc>" + local146, 0, -1, "", -1, 0L);
		} else {
			for (@Pc(272) int local272 = 7; local272 >= 0; local272--) {
				if (Static243.aStringArray44[local272] != null) {
					@Pc(280) short local280 = 0;
					if (client.game == GameType.GAME_TYPE_RUNESCAPE && Static243.aStringArray44[local272].equalsIgnoreCase(LocalisedText.ATTACK.getLocalisedText(client.language))) {
						if (Static17.self.combatLevel < arg1.combatLevel) {
							local280 = 2000;
						}
						if (Static17.self.anInt4193 != 0 && arg1.anInt4193 != 0) {
							if (Static17.self.anInt4193 == arg1.anInt4193) {
								local280 = 2000;
							} else {
								local280 = 0;
							}
						}
					} else if (Static44.aBooleanArray11[local272]) {
						local280 = 2000;
					}
					@Pc(334) short local334 = (short) (Static292.aShortArray115[local272] + local280);
					local72 = Static207.anIntArray225[local272] == -1 ? Static91.anInt1910 : Static207.anIntArray225[local272];
					Static1.add(-1, true, 0, false, Static243.aStringArray44[local272], 0, local334, "<col=ffffff>" + local146, local72, (long) arg1.anInt4619);
				}
			}
		}
		if (arg0) {
			return;
		}
		for (@Pc(385) Class2_Sub5 local385 = (Class2_Sub5) Static129.A_LINKED_LIST___19.head(); local385 != null; local385 = (Class2_Sub5) Static129.A_LINKED_LIST___19.next()) {
			if (local385.anInt1005 == 22) {
				local385.aString11 = "<col=ffffff>" + local146;
				return;
			}
		}
	}
}
