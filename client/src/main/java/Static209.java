import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "[I")
	public static int[] anIntArray228;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[200];

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)Lclient!jg;")
	public static Class2_Sub20 method3712() {
		if (Static344.A_LINKED_LIST___36 == null || Static116.aClass75_1 == null) {
			return null;
		}
		Static116.aClass75_1.method2180(Static344.A_LINKED_LIST___36);
		@Pc(18) Class2_Sub20 local18 = (Class2_Sub20) Static116.aClass75_1.method2181();
		if (local18 == null) {
			return null;
		} else {
			@Pc(33) Class164 local33 = Static344.aClass125_4.method3378(local18.anInt2947);
			return local33 != null && local33.aBoolean302 && local33.method4179(Static344.anInterface11_2) ? local18 : Static115.method3828();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!wm;Lclient!ci;)V")
	public static void method3713(@OriginalArg(1) Class19 arg0, @OriginalArg(2) Interface2 arg1) {
		if (Static344.aClass2_Sub2_Sub17_3 == null) {
			return;
		}
		if (Static355.loadPercentage < 10) {
			if (!Static344.archive.isGroupReady(Static344.aClass2_Sub2_Sub17_3.aString67)) {
				Static355.loadPercentage = Static389.aJs5_66.method5084(Static344.aClass2_Sub2_Sub17_3.aString67) / 10;
				return;
			}
			Static386.method6030();
			Static355.loadPercentage = 10;
		}
		if (Static355.loadPercentage == 10) {
			Static344.anInt6057 = Static344.aClass2_Sub2_Sub17_3.anInt6870 >> 6 << 6;
			Static344.anInt6055 = Static344.aClass2_Sub2_Sub17_3.anInt6863 >> 6 << 6;
			Static344.anInt6056 = (Static344.aClass2_Sub2_Sub17_3.anInt6868 >> 6 << 6) + 64 - Static344.anInt6057;
			Static344.anInt6052 = (Static344.aClass2_Sub2_Sub17_3.anInt6874 >> 6 << 6) + 64 - Static344.anInt6055;
			@Pc(80) int[] local80 = new int[3];
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = -1;
			if (Static344.aClass2_Sub2_Sub17_3.method6144(Static17.self.aByte78, local80, Static164.originX + (Static17.self.xFine >> 7), Static148.originZ + (Static17.self.zFine >> 7))) {
				local82 = local80[1] - Static344.anInt6057;
				local84 = local80[2] - Static344.anInt6055;
			}
			if (!Static299.aBoolean399 && local82 >= 0 && Static344.anInt6056 > local82 && local84 >= 0 && Static344.anInt6052 > local84) {
				local84 += (int) (Math.random() * 10.0D) - 5;
				local82 += (int) (Math.random() * 10.0D) - 5;
				Static96.anInt2003 = local84;
				Static151.anInt2772 = local82;
			} else if (Static184.anInt3436 == -1 || Static18.anInt519 == -1) {
				Static344.aClass2_Sub2_Sub17_3.method6150(Static344.aClass2_Sub2_Sub17_3.anInt6872 >> 14 & 0x3FFF, Static344.aClass2_Sub2_Sub17_3.anInt6872 & 0x3FFF, local80);
				Static96.anInt2003 = local80[2] - Static344.anInt6055;
				Static151.anInt2772 = local80[1] - Static344.anInt6057;
			} else {
				Static344.aClass2_Sub2_Sub17_3.method6150(Static184.anInt3436, Static18.anInt519, local80);
				Static18.anInt519 = -1;
				Static184.anInt3436 = -1;
				Static299.aBoolean399 = false;
				if (local80 != null) {
					Static96.anInt2003 = local80[2] - Static344.anInt6055;
					Static151.anInt2772 = local80[1] - Static344.anInt6057;
				}
			}
			if (Static344.aClass2_Sub2_Sub17_3.anInt6875 == 37) {
				Static344.aFloat72 = 3.0F;
				Static344.aFloat73 = 3.0F;
			} else if (Static344.aClass2_Sub2_Sub17_3.anInt6875 == 50) {
				Static344.aFloat72 = 4.0F;
				Static344.aFloat73 = 4.0F;
			} else if (Static344.aClass2_Sub2_Sub17_3.anInt6875 == 75) {
				Static344.aFloat72 = 6.0F;
				Static344.aFloat73 = 6.0F;
			} else if (Static344.aClass2_Sub2_Sub17_3.anInt6875 == 100) {
				Static344.aFloat72 = 8.0F;
				Static344.aFloat73 = 8.0F;
			} else if (Static344.aClass2_Sub2_Sub17_3.anInt6875 == 200) {
				Static344.aFloat72 = 16.0F;
				Static344.aFloat73 = 16.0F;
			} else {
				Static344.aFloat72 = 8.0F;
				Static344.aFloat73 = 8.0F;
			}
			Static344.anInt6047 = (int) Static344.aFloat72 >> 1;
			Static344.aByteArrayArrayArray15 = Static260.method6017(Static344.anInt6047);
			Static298.method2422();
			Static344.method5518();
			Static197.aLinkedList_24 = new LinkedList();
			Static344.anInt6048 += (int) (Math.random() * 5.0D) - 2;
			if (Static344.anInt6048 < -8) {
				Static344.anInt6048 = -8;
			}
			Static344.anInt6049 += (int) (Math.random() * 5.0D) - 2;
			if (Static344.anInt6048 > 8) {
				Static344.anInt6048 = 8;
			}
			if (Static344.anInt6049 < -16) {
				Static344.anInt6049 = -16;
			}
			if (Static344.anInt6049 > 16) {
				Static344.anInt6049 = 16;
			}
			Static344.method5527(arg1, Static344.anInt6048 >> 2 << 10, Static344.anInt6049 >> 1);
			Static344.aClass125_4.method3376(256, 1024);
			Static344.aClass104_4.method2702(256, 256);
			Static344.aClass202_3.method5160(4096);
			Static322.aClass128_1.method3391(256);
			Static355.loadPercentage = 20;
		} else if (Static355.loadPercentage == 20) {
			Static161.method2972(true);
			Static344.method5520(arg0, Static344.anInt6048, Static344.anInt6049);
			Static355.loadPercentage = 60;
			Static161.method2972(true);
			GameShell.resetTimer();
		} else if (Static355.loadPercentage == 60) {
			if (Static344.archive.isGroupNameValid(Static344.aClass2_Sub2_Sub17_3.aString67 + "_staticelements")) {
				if (!Static344.archive.isGroupReady(Static344.aClass2_Sub2_Sub17_3.aString67 + "_staticelements")) {
					return;
				}
				Static344.labels = MapElementList.create(Static344.archive, Static344.aClass2_Sub2_Sub17_3.aString67 + "_staticelements", Static206.mapMembers);
			} else {
				Static344.labels = new MapElementList(0);
			}
			Static344.method5510();
			Static355.loadPercentage = 70;
			Static161.method2972(true);
			GameShell.resetTimer();
		} else if (Static355.loadPercentage == 70) {
			Static74.font11 = new WorldMapFont(arg0, 11, true, GameShell.canvas);
			Static355.loadPercentage = 73;
			Static161.method2972(true);
			GameShell.resetTimer();
		} else if (Static355.loadPercentage == 73) {
			Static107.font12 = new WorldMapFont(arg0, 12, true, GameShell.canvas);
			Static355.loadPercentage = 76;
			Static161.method2972(true);
			GameShell.resetTimer();
		} else if (Static355.loadPercentage == 76) {
			Static2.font14 = new WorldMapFont(arg0, 14, true, GameShell.canvas);
			Static355.loadPercentage = 79;
			Static161.method2972(true);
			GameShell.resetTimer();
		} else if (Static355.loadPercentage == 79) {
			Static175.font17 = new WorldMapFont(arg0, 17, true, GameShell.canvas);
			Static355.loadPercentage = 82;
			Static161.method2972(true);
			GameShell.resetTimer();
		} else if (Static355.loadPercentage == 82) {
			Static249.font19 = new WorldMapFont(arg0, 19, true, GameShell.canvas);
			Static355.loadPercentage = 85;
			Static161.method2972(true);
			GameShell.resetTimer();
		} else if (Static355.loadPercentage == 85) {
			Static30.font22 = new WorldMapFont(arg0, 22, true, GameShell.canvas);
			Static355.loadPercentage = 88;
			Static161.method2972(true);
			GameShell.resetTimer();
		} else if (Static355.loadPercentage == 88) {
			Static27.font26 = new WorldMapFont(arg0, 26, true, GameShell.canvas);
			Static355.loadPercentage = 91;
			Static161.method2972(true);
			GameShell.resetTimer();
		} else {
			Static369.font30 = new WorldMapFont(arg0, 30, true, GameShell.canvas);
			Static355.loadPercentage = 100;
			Static161.method2972(true);
			GameShell.resetTimer();
			System.gc();
		}
	}
}
