import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "[I")
	public static int[] anIntArray150;

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
	public static int anInt2375;

	@OriginalMember(owner = "client!gp", name = "r", descriptor = "I")
	public static int anInt2376 = -1;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!r;Lclient!r;Z)V")
	public static void method2366(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		Static43.globalArchive = arg1;
		Static367.archive = arg0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method2367(@OriginalArg(1) Class19 arg0) {
		@Pc(7) int local7 = Static305.anInt5743;
		@Pc(9) int local9 = Static363.anInt6801;
		@Pc(11) int local11 = Static107.anInt2220;
		@Pc(15) int local15 = Static352.anInt6519 - 3;
		if (Static197.aClass13_12 == null || Static138.aClass13_8 == null) {
			if (client.js5Archive8.isFileReady(Static186.anInt3731) && client.js5Archive8.isFileReady(Static67.anInt1636)) {
				Static197.aClass13_12 = arg0.method2891(Static396.loadSoftwareSprite(client.js5Archive8, Static186.anInt3731, 0));
				@Pc(44) SoftwareSprite local44 = Static396.loadSoftwareSprite(client.js5Archive8, Static67.anInt1636, 0);
				Static138.aClass13_8 = arg0.method2891(local44);
				local44.method1684();
				Static75.aClass13_5 = arg0.method2891(local44);
			} else {
				arg0.method2901(local7, local9, local11, 20, 255 - Static260.anInt6717 << 24 | Static242.anInt4446, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static197.aClass13_12 != null && Static138.aClass13_8 != null) {
			local87 = (local11 - Static138.aClass13_8.method6388() * 2) / Static197.aClass13_12.method6388();
			for (local89 = 0; local89 < local87; local89++) {
				Static197.aClass13_12.method6384(local7 + Static138.aClass13_8.method6388() + Static197.aClass13_12.method6388() * local89, local9);
			}
			Static138.aClass13_8.method6384(local7, local9);
			Static75.aClass13_5.method6384(local7 + local11 - Static75.aClass13_5.method6388(), local9);
		}
		Static52.aClass130_1.method5896(local7 + 3, -1, local9 + 14, Static322.anInt6030 | 0xFF000000, LocalisedText.CHOOSE_OPTION.getLocalisedText(client.language));
		arg0.method2901(local7, local9 + 20, local11, local15 - 20, -Static260.anInt6717 + 255 << 24 | Static242.anInt4446, 1);
		local87 = Static226.aClass119_1.method3303();
		local89 = Static226.aClass119_1.method3312();
		@Pc(169) int local169 = 0;
		@Pc(192) int local192;
		for (@Pc(174) Class2_Sub5 local174 = (Class2_Sub5) Static129.A_LINKED_LIST___19.head(); local174 != null; local174 = (Class2_Sub5) Static129.A_LINKED_LIST___19.next()) {
			local192 = local9 + (-local169 + -1 + Static268.size) * 16 + 33;
			local169++;
			if (local7 < local87 && local87 < local7 + local11 && local89 > local192 - 13 && local192 + 4 > local89 && local174.aBoolean83) {
				arg0.method2901(local7, local192 - 12, local11, 16, Static200.anInt3697 | 255 - Static86.anInt1868 << 24, 1);
			}
		}
		if ((Static337.aClass13_17 == null || Static211.aClass13_13 == null || Static35.aClass13_3 == null) && client.js5Archive8.isFileReady(Static74.anInt1722) && client.js5Archive8.isFileReady(Static363.anInt6804) && client.js5Archive8.isFileReady(Static390.anInt7211)) {
			@Pc(275) SoftwareSprite local275 = Static396.loadSoftwareSprite(client.js5Archive8, Static363.anInt6804, 0);
			Static211.aClass13_13 = arg0.method2891(local275);
			local275.method1684();
			Static339.aClass13_18 = arg0.method2891(local275);
			Static337.aClass13_17 = arg0.method2891(Static396.loadSoftwareSprite(client.js5Archive8, Static74.anInt1722, 0));
			@Pc(300) SoftwareSprite local300 = Static396.loadSoftwareSprite(client.js5Archive8, Static390.anInt7211, 0);
			Static35.aClass13_3 = arg0.method2891(local300);
			local300.method1684();
			Static110.aClass13_6 = arg0.method2891(local300);
		}
		local169 = 0;
		@Pc(368) int local368;
		@Pc(333) int local333;
		if (Static337.aClass13_17 != null && Static211.aClass13_13 != null && Static35.aClass13_3 != null) {
			local192 = (local11 - Static35.aClass13_3.method6388() * 2) / Static337.aClass13_17.method6388();
			for (local333 = 0; local333 < local192; local333++) {
				Static337.aClass13_17.method6384(Static35.aClass13_3.method6388() + local7 + local333 * Static337.aClass13_17.method6388(), local9 + local15 - Static337.aClass13_17.method6381());
			}
			local368 = (local15 - Static35.aClass13_3.method6381() - 20) / Static211.aClass13_13.method6381();
			for (@Pc(370) int local370 = 0; local370 < local368; local370++) {
				Static211.aClass13_13.method6384(local7, local9 + local370 * Static211.aClass13_13.method6381() + 20);
				Static339.aClass13_18.method6384(local11 + local7 - Static339.aClass13_18.method6388(), local370 * Static211.aClass13_13.method6381() + 20 + local9);
			}
			Static35.aClass13_3.method6384(local7, local9 + local15 - Static35.aClass13_3.method6381());
			Static110.aClass13_6.method6384(local7 + local11 - Static35.aClass13_3.method6388(), local15 + local9 + -Static35.aClass13_3.method6381());
		}
		for (@Pc(436) Class2_Sub5 local436 = (Class2_Sub5) Static129.A_LINKED_LIST___19.head(); local436 != null; local436 = (Class2_Sub5) Static129.A_LINKED_LIST___19.next()) {
			local333 = (Static268.size - local169 - 1) * 16 + local9 + 13 + 20;
			local368 = Static322.anInt6030 | 0xFF000000;
			if (local7 < local87 && local87 < local7 + local11 && local89 > local333 - 13 && local89 < local333 + 4 && local436.aBoolean83) {
				local368 = Static381.anInt7118 | 0xFF000000;
			}
			@Pc(499) int[] local499 = null;
			if (Static298.method2425(local436.anInt1005)) {
				local499 = ObjTypeList.objTypeList.get((int) local436.aLong30).anIntArray364;
			} else if (local436.anInt1008 != -1) {
				local499 = ObjTypeList.objTypeList.get(local436.anInt1008).anIntArray364;
			} else if (Static297.method5110(local436.anInt1005)) {
				@Pc(572) Npc local572 = Static365.npcs[(int) local436.aLong30];
				if (local572 != null) {
					@Pc(577) NpcType local577 = local572.type;
					if (local577.multiNpcs != null) {
						local577 = local577.getMultiNpc(Static214.aClass226_1);
					}
					if (local577 != null) {
						local499 = local577.anIntArray131;
					}
				}
			} else if (Static241.method4189(local436.anInt1005)) {
				@Pc(540) Class41 local540;
				if (local436.anInt1005 == 1010) {
					local540 = Static359.aClass202_4.method5162((int) local436.aLong30);
				} else {
					local540 = Static359.aClass202_4.method5162((int) (local436.aLong30 >>> 32 & 0x7FFFFFFFL));
				}
				if (local540.anIntArray94 != null) {
					local540 = local540.method1533(Static214.aClass226_1);
				}
				if (local540 != null) {
					local499 = local540.anIntArray96;
				}
			}
			@Pc(607) String local607 = Static318.method5420(local436);
			if (local499 != null) {
				local607 = local607 + Static158.method2938(local499);
			}
			Static52.aClass130_1.method5900(Static72.anIntArray114, Static134.aClass13Array12, local7 + 3, local607, local333, local368);
			local169++;
			if (local436.aBoolean82) {
				Static119.aClass13_7.method6384(local7 + Static113.aClass239_2.method6125(local607) + 5, local333 + -12);
			}
		}
		Static148.method2710(Static363.anInt6801, Static305.anInt5743, Static352.anInt6519, Static107.anInt2220);
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)V")
	public static void method2369() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static189.aBooleanArray33[local3] = false;
		}
		Static147.anInt2717 = -1;
		Static349.anInt6455 = -1;
		Static236.anInt4309 = 0;
		Static314.anInt5911 = 1;
		Static33.anInt4463 = 0;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)I")
	public static int getGroupID(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2372(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < Static384.anInt7178; local19++) {
			if (arg0.equalsIgnoreCase(Static17.aStringArray43[local19])) {
				return local19;
			}
		}
		return -1;
	}
}
