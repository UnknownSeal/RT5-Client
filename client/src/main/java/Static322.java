import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!so", name = "c", descriptor = "Lclient!km;")
	public static Class128 aClass128_1;

	@OriginalMember(owner = "client!so", name = "g", descriptor = "I")
	public static int anInt6029;

	@OriginalMember(owner = "client!so", name = "i", descriptor = "I")
	public static int anInt6030;

	@OriginalMember(owner = "client!so", name = "j", descriptor = "I")
	public static int anInt6031;

	@OriginalMember(owner = "client!so", name = "l", descriptor = "Lclient!sg;")
	public static Class211 aClass211_2;

	@OriginalMember(owner = "client!so", name = "m", descriptor = "[I")
	public static int[] anIntArray404;

	@OriginalMember(owner = "client!so", name = "d", descriptor = "Lclient!h;")
	public static final Class89 aClass89_217 = new Class89(60, -2);

	@OriginalMember(owner = "client!so", name = "h", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_218 = new Class145(14, 8);

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III)V")
	public static void method5480(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) DelayedStateChange local12 = DelayedStateChange.create(1, arg0);
		local12.pushServer();
		local12.anInt2289 = arg1;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZIIIIIIII)Z")
	public static boolean method5481(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = Static17.self.anIntArray316[0];
		@Pc(18) int local18 = Static17.self.anIntArray317[0];
		if (local13 < 0 || Static373.anInt7033 <= local13 || local18 < 0 || Static242.anInt4449 <= local18) {
			return false;
		} else if (arg5 >= 0 && arg5 < Static373.anInt7033 && arg2 >= 0 && arg2 < Static242.anInt4449) {
			@Pc(88) int local88 = Static141.method2654(arg0, Static52.anIntArray99, arg6, arg1, arg7, arg3, Static171.collisionMap[Static17.self.aByte78], local13, arg4, arg5, Static59.anIntArray105, Static17.self.method4327(), arg2, local18);
			if (local88 < 1) {
				return false;
			}
			Static358.anInt6550 = Static52.anIntArray99[local88 - 1];
			Static312.anInt5844 = Static59.anIntArray105[local88 - 1];
			Static370.aBoolean474 = false;
			Static359.method6008();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
	public static void method5482() {
		Static161.method2972(false);
		Static144.anInt2694 = 0;
		@Pc(12) boolean ready = true;
		for (@Pc(14) int local14 = 0; local14 < Static106.mapBytes.length; local14++) {
			if (Static221.mapGroupIDs[local14] != -1 && Static106.mapBytes[local14] == null) {
				Static106.mapBytes[local14] = client.js5Archive5.fetchFile(Static221.mapGroupIDs[local14], 0);
				if (Static106.mapBytes[local14] == null) {
					ready = false;
					Static144.anInt2694++;
				}
			}
			if (Static374.locGroupIDs[local14] != -1 && Static82.locBytes[local14] == null) {
				Static82.locBytes[local14] = client.js5Archive5.fetchFile(Static374.locGroupIDs[local14], 0, Static277.xteaKeys[local14]);
				if (Static82.locBytes[local14] == null) {
					ready = false;
					Static144.anInt2694++;
				}
			}
			if (Static51.underwaterMapGroupIDs[local14] != -1 && Static232.underwaterMapBytes[local14] == null) {
				Static232.underwaterMapBytes[local14] = client.js5Archive5.fetchFile(Static51.underwaterMapGroupIDs[local14], 0);
				if (Static232.underwaterMapBytes[local14] == null) {
					ready = false;
					Static144.anInt2694++;
				}
			}
			if (Static62.underwaterLocGroupIDs[local14] != -1 && Static270.underwaterLocBytes[local14] == null) {
				Static270.underwaterLocBytes[local14] = client.js5Archive5.fetchFile(Static62.underwaterLocGroupIDs[local14], 0);
				if (Static270.underwaterLocBytes[local14] == null) {
					Static144.anInt2694++;
					ready = false;
				}
			}
			if (Static190.npcGroupIDs != null && Static210.npcBytes[local14] == null && Static190.npcGroupIDs[local14] != -1) {
				Static210.npcBytes[local14] = client.js5Archive5.fetchFile(Static190.npcGroupIDs[local14], 0, Static277.xteaKeys[local14]);
				if (Static210.npcBytes[local14] == null) {
					Static144.anInt2694++;
					ready = false;
				}
			}
		}
		if (Static34.aMapElementList_3 == null) {
			if (Static91.aMap_1 == null || !client.js5Archive23.isGroupNameValid(Static91.aMap_1.aString67 + "_staticelements")) {
				Static34.aMapElementList_3 = new MapElementList(0);
			} else if (client.js5Archive23.isGroupReady(Static91.aMap_1.aString67 + "_staticelements")) {
				Static34.aMapElementList_3 = MapElementList.create(client.js5Archive23, Static91.aMap_1.aString67 + "_staticelements", Static206.mapMembers);
			} else {
				Static144.anInt2694++;
				ready = false;
			}
		}
		if (!ready) {
			Static246.anInt4505 = 1;
			return;
		}
		ready = true;
		Static305.anInt5742 = 0;
		@Pc(268) int local268;
		@Pc(279) int local279;
		for (@Pc(249) int local249 = 0; local249 < Static106.mapBytes.length; local249++) {
			@Pc(255) byte[] local255 = Static82.locBytes[local249];
			if (local255 != null) {
				local268 = (Static291.mapSquares[local249] >> 8) * 64 - Static164.originX;
				local279 = (Static291.mapSquares[local249] & 0xFF) * 64 - Static148.originZ;
				if (Static220.aBoolean252) {
					local268 = 10;
					local279 = 10;
				}
				ready &= Static193.method3510(local279, local268, local255, Static242.anInt4449, Static373.anInt7033);
			}
			local255 = Static270.underwaterLocBytes[local249];
			if (local255 != null) {
				local268 = (Static291.mapSquares[local249] >> 8) * 64 - Static164.originX;
				local279 = (Static291.mapSquares[local249] & 0xFF) * 64 - Static148.originZ;
				if (Static220.aBoolean252) {
					local279 = 10;
					local268 = 10;
				}
				ready &= Static193.method3510(local279, local268, local255, Static242.anInt4449, Static373.anInt7033);
			}
		}
		if (!ready) {
			Static246.anInt4505 = 2;
			return;
		}
		if (Static246.anInt4505 != 0) {
			Static351.method5856(Static276.aClass130_4, true, LocalisedText.LOADING_PLEASE_WAIT.getLocalisedText(client.language) + "<br>(100%)");
		}
		Static37.method1135();
		Static211.method3720();
		@Pc(375) boolean local375 = false;
		if (Static190.aClass19_8.method2805() && Static218.preferences.highDetailWater) {
			for (local268 = 0; local268 < Static106.mapBytes.length; local268++) {
				if (Static270.underwaterLocBytes[local268] != null || Static232.underwaterMapBytes[local268] != null) {
					local375 = true;
					break;
				}
			}
		}
		if (Static218.preferences.fog) {
			local268 = Static272.anIntArray351[Static31.anInt752];
		} else {
			local268 = Static59.anIntArray106[Static31.anInt752];
		}
		if (Static190.aClass19_8.method2888()) {
			local268++;
		}
		Static354.method1381(Static373.anInt7033, Static242.anInt4449, local268, local375, Static190.aClass19_8.method2886() > 0);
		for (local279 = 0; local279 < 4; local279++) {
			Static171.collisionMap[local279].clear();
		}
		Static285.method4886();
		Static239.method4151(false);
		Static20.method560();
		Static37.method1135();
		System.gc();
		Static161.method2972(true);
		Static375.method6280();
		Static246.aBoolean312 = Static218.preferences.highDetailLighting;
		Static105.aBoolean162 = Static218.preferences.highDetailWater;
		Static183.aBoolean8 = GameShell.maxMemory >= 96;
		Static174.anInt1300 = Static218.preferences.sceneryShadows;
		Static141.aBoolean190 = !Static218.preferences.groundTextures;
		Static158.anInt2911 = Static218.preferences.method4494(Static77.anInt1762) ? -1 : Static44.visibleLevel;
		Static132.aBoolean179 = Static77.anInt1762 == 1 || Static218.preferences.aBoolean357;
		Static190.aClass29_Sub1_63 = new Class29_Sub1(4, Static373.anInt7033, Static242.anInt4449, false);
		if (!Static220.aBoolean252) {
			Static177.method3345(Static190.aClass29_Sub1_63, Static106.mapBytes);
		}
		if (Static220.aBoolean252) {
			Static120.method2381(Static106.mapBytes, Static190.aClass29_Sub1_63);
		}
		Static195.method3558(Static373.anInt7033 >> 4, Static242.anInt4449 >> 4);
		Static56.method1611();
		if (local375) {
			Static341.method5766(true);
			Static7.aClass29_Sub1_120 = new Class29_Sub1(1, Static373.anInt7033, Static242.anInt4449, true);
			if (!Static220.aBoolean252) {
				Static177.method3345(Static7.aClass29_Sub1_120, Static232.underwaterMapBytes);
				Static161.method2972(true);
			}
			if (Static220.aBoolean252) {
				Static120.method2381(Static232.underwaterMapBytes, Static7.aClass29_Sub1_120);
				Static161.method2972(true);
			}
			Static7.aClass29_Sub1_120.method1097(Static190.aClass29_Sub1_63.anIntArrayArrayArray8[0]);
			Static7.aClass29_Sub1_120.method1085(null, null, Static190.aClass19_8);
			Static341.method5766(false);
		}
		Static190.aClass29_Sub1_63.method1085(local375 ? Static7.aClass29_Sub1_120.anIntArrayArrayArray8 : null, Static171.collisionMap, Static190.aClass19_8);
		if (!Static220.aBoolean252) {
			Static161.method2972(true);
			Static170.method3230(Static190.aClass29_Sub1_63, Static82.locBytes);
			if (Static210.npcBytes != null) {
				Static1.method2();
			}
		}
		if (Static220.aBoolean252) {
			Static161.method2972(true);
			Static65.method1737(Static190.aClass29_Sub1_63, Static82.locBytes);
		}
		Static211.method3720();
		Static161.method2972(true);
		Static190.aClass29_Sub1_63.method1093(local375 ? Static186.aClass6Array2[0] : null, Static190.aClass19_8, null);
		Static190.aClass29_Sub1_63.method1104(Static190.aClass19_8);
		Static161.method2972(true);
		if (local375) {
			Static341.method5766(true);
			Static161.method2972(true);
			if (!Static220.aBoolean252) {
				Static170.method3230(Static7.aClass29_Sub1_120, Static270.underwaterLocBytes);
			}
			if (Static220.aBoolean252) {
				Static65.method1737(Static7.aClass29_Sub1_120, Static270.underwaterLocBytes);
			}
			Static211.method3720();
			Static161.method2972(true);
			Static7.aClass29_Sub1_120.method1093(null, Static190.aClass19_8, Static330.aClass6Array3[0]);
			Static7.aClass29_Sub1_120.method1104(Static190.aClass19_8);
			Static161.method2972(true);
			Static341.method5766(false);
		}
		Static295.method5093();
		@Pc(692) int local692 = Static190.aClass29_Sub1_63.anInt922;
		if (Static355.anInt6585 < local692) {
			local692 = Static355.anInt6585;
		}
		if (Static355.anInt6585 - 1 > local692) {
			local692 = Static355.anInt6585 - 1;
		}
		if (Static218.preferences.method4494(Static77.anInt1762)) {
			Static77.method1856(0);
		} else {
			Static77.method1856(local692);
		}
		@Pc(731) int local731;
		@Pc(735) int local735;
		for (@Pc(727) int local727 = 0; local727 < 4; local727++) {
			for (local731 = 0; local731 < Static373.anInt7033; local731++) {
				for (local735 = 0; local735 < Static242.anInt4449; local735++) {
					Static165.method3153(local731, local727, local735);
				}
			}
		}
		Static226.method3981();
		Static37.method1135();
		Static144.method2690();
		Static211.method3720();
		Static3.aBoolean5 = false;
		Static50.method1530();
		if (GameShell.frame != null && Static335.socket != null && Static347.anInt6442 == 25) {
			Static91.method1960(Static30.aClass145_28);
			Static257.outboundBuffer.p4(1057001181);
		}
		if (!Static220.aBoolean252) {
			local731 = (Static105.anInt2187 - (Static373.anInt7033 >> 4)) / 8;
			local735 = ((Static373.anInt7033 >> 4) + Static105.anInt2187) / 8;
			@Pc(811) int local811 = (Static9.anInt212 - (Static242.anInt4449 >> 4)) / 8;
			@Pc(819) int local819 = ((Static242.anInt4449 >> 4) + Static9.anInt212) / 8;
			for (@Pc(823) int local823 = local731 - 1; local823 <= local735 + 1; local823++) {
				for (@Pc(829) int local829 = local811 - 1; local829 <= local819 + 1; local829++) {
					if (local823 < local731 || local823 > local735 || local829 < local811 || local819 < local829) {
						client.js5Archive5.method5075("m" + local823 + "_" + local829);
						client.js5Archive5.method5075("l" + local823 + "_" + local829);
					}
				}
			}
		}
		if (Static347.anInt6442 == 28) {
			Static336.method5704(10);
		} else {
			Static336.method5704(30);
			if (Static335.socket != null) {
				Static91.method1960(Static42.aClass145_230);
			}
		}
		Static253.method4368();
		Static37.method1135();
		GameShell.resetTimer();
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
	public static void topBannerRefresh() {
		if (Static121.aClass127_4 != Static231.aClass127_7) {
			try {
				BrowserControl.call(client.instance, "tbrefresh");
			} catch (@Pc(14) Throwable exception) {
			}
		}
	}
}
