import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!jg", name = "E", descriptor = "Z")
	public static boolean aBoolean208;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "Lclient!h;")
	public static Class89 aClass89_123 = new Class89(10, -1);

	@OriginalMember(owner = "client!jg", name = "F", descriptor = "Lclient!gd;")
	public static Class79 aClass79_67 = new Class79(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
	public static int anInt2954 = 100;

	@OriginalMember(owner = "client!jg", name = "I", descriptor = "[I")
	public static int[] anIntArray187 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
	public static void method2968() {
		Static119.aClass98_16.method2614();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([BI)[B")
	public static byte[] method2969(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub4 local8 = new Class2_Sub4(arg0);
		@Pc(12) int local12 = local8.method4814();
		@Pc(23) int local23 = local8.method4835();
		if (local23 < 0 || Static45.anInt1198 != 0 && Static45.anInt1198 < local23) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(45) byte[] local45 = new byte[local23];
			local8.method4798(local45, local23);
			return local45;
		} else {
			@Pc(57) int local57 = local8.method4835();
			if (local57 < 0 || Static45.anInt1198 != 0 && Static45.anInt1198 < local57) {
				throw new RuntimeException();
			}
			@Pc(71) byte[] local71 = new byte[local57];
			if (local12 == 1) {
				Static213.method3741(local71, local57, arg0, local23);
			} else {
				Static92.aClass92_1.method2436(local71, local8);
			}
			return local71;
		}
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)V")
	public static void method2970() {
		aClass89_123 = null;
		aClass79_67 = null;
		anIntArray187 = null;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method2971(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (Static189.aClass127_6 == Static121.aClass127_4 && Static4.anInt90 < 2) {
			return;
		}
		if (arg0.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static356.aBoolean456 = true;
				Static158.method2939("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static356.aBoolean456 = false;
				Static158.method2939("fps debug disabled");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static177.anInt3385 = 0;
				Static368.anInt6917 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static284.aClass36_7.method1416();
				Static158.method2939("Text coords cleared");
				return;
			}
			@Pc(76) int local76;
			@Pc(96) int local96;
			@Pc(87) Runtime local87;
			if (arg0.equalsIgnoreCase("gc")) {
				Static59.method1643();
				for (local76 = 0; local76 < 10; local76++) {
					System.gc();
				}
				local87 = Runtime.getRuntime();
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				Static158.method2939("mem=" + local96 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static59.method1643();
				for (local76 = 0; local76 < 10; local76++) {
					System.gc();
				}
				local87 = Runtime.getRuntime();
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				Static158.method2939("Memory before cleanup=" + local96 + "k");
				Static163.method3104();
				Static59.method1643();
				for (@Pc(153) int local153 = 0; local153 < 10; local153++) {
					System.gc();
				}
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				Static158.method2939("Memory after cleanup=" + local96 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static158.method2939("Number of player models in cache:" + Static365.method6116());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static158.method2939("Dropped client connection");
				if (Static347.anInt6442 == 30) {
					Static211.method3724();
					return;
				}
				if (Static347.anInt6442 == 25) {
					Static101.aBoolean158 = true;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static287.aClass183_3.method4644();
				Static158.method2939("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static287.aClass183_3.method4634();
				Static158.method2939("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static328.aClass152_5.method3759();
				Static335.aClass111_4.method2801();
				Static287.aClass183_3.method4632();
				Static158.method2939("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static347.method5826();
				Static247.method4298();
				Static158.method2939("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static143.method2677(-1, 1, false, -1);
				if (Static144.method2692() == 1) {
					Static158.method2939("wm1 succeeded");
					return;
				}
				Static158.method2939("wm1 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static143.method2677(-1, 2, false, -1);
				if (Static144.method2692() == 2) {
					Static158.method2939("wm2 succeeded");
					return;
				}
				Static158.method2939("wm2 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static143.method2677(768, 3, false, 1024);
				if (Static144.method2692() == 3) {
					Static158.method2939("wm3 succeeded");
					return;
				}
				Static158.method2939("wm3 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static78.method5700(0);
				if (Static77.anInt1762 == 0) {
					Static158.method2939("Entered tk0");
					Static218.aClass177_Sub1_2.anInt4878 = 0;
					Static218.aClass177_Sub1_2.method4496(Static328.aClass152_5);
					Static236.aBoolean288 = false;
					return;
				}
				Static158.method2939("Failed to enter tk0");
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static78.method5700(1);
				if (Static77.anInt1762 != 1) {
					Static158.method2939("Failed to enter tk1");
					return;
				}
				Static158.method2939("Entered tk1");
				Static218.aClass177_Sub1_2.anInt4878 = 1;
				Static218.aClass177_Sub1_2.method4496(Static328.aClass152_5);
				Static236.aBoolean288 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static78.method5700(2);
				if (Static77.anInt1762 != 2) {
					Static158.method2939("Failed to enter tk2");
					return;
				}
				Static158.method2939("Entered tk2");
				Static218.aClass177_Sub1_2.anInt4878 = 2;
				Static218.aClass177_Sub1_2.method4496(Static328.aClass152_5);
				Static236.aBoolean288 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static78.method5700(3);
				if (Static77.anInt1762 == 3) {
					Static158.method2939("Entered tk3");
					return;
				}
				Static158.method2939("Failed to enter tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static218.aClass177_Sub1_2.aBoolean355 = !Static218.aClass177_Sub1_2.aBoolean355;
				Static218.aClass177_Sub1_2.method4496(Static328.aClass152_5);
				Static236.aBoolean288 = false;
				Static347.method5826();
				Static158.method2939("ot=" + Static218.aClass177_Sub1_2.aBoolean355);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static218.aClass177_Sub1_2.aBoolean357 = !Static218.aClass177_Sub1_2.aBoolean357;
				Static218.aClass177_Sub1_2.method4496(Static328.aClass152_5);
				Static236.aBoolean288 = false;
				Static347.method5826();
				Static158.method2939("gb=" + Static218.aClass177_Sub1_2.aBoolean357);
				return;
			}
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static158.method2939("Invalid shadows value");
					return;
				}
				@Pc(521) String local521 = arg0.substring(8);
				@Pc(531) int local531 = Static132.method2485(local521) ? Static146.method2698(local521) : -1;
				if (local531 >= 0 && local531 <= 2) {
					Static218.aClass177_Sub1_2.anInt4886 = local531;
					Static218.aClass177_Sub1_2.method4496(Static328.aClass152_5);
					Static236.aBoolean288 = false;
					Static347.method5826();
					Static158.method2939("shadows=" + local531);
					return;
				}
				Static158.method2939("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static158.method2939("Invalid buildarea value");
					return;
				}
				local76 = Static146.method2698(arg0.substring(6));
				if (local76 >= 0 && local76 <= Static289.method5018(Static309.anInt5802)) {
					Static218.aClass177_Sub1_2.anInt4883 = local76;
					Static218.aClass177_Sub1_2.method4496(Static328.aClass152_5);
					Static236.aBoolean288 = false;
					Static158.method2939("maxbuildarea=" + Static218.aClass177_Sub1_2.anInt4883);
					return;
				}
				Static158.method2939("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static158.method2939("Invalid particles value");
					return;
				}
				Static26.method864(Static146.method2698(arg0.substring(13)));
				Static218.aClass177_Sub1_2.method4496(Static328.aClass152_5);
				Static236.aBoolean288 = false;
				Static158.method2939("particles=" + Static184.method3390());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static158.method2939("Invalid rect_debug value");
					return;
				}
				Static154.anInt2807 = Static146.method2698(arg0.substring(10).trim());
				Static158.method2939("rect_debug=" + Static154.anInt2807);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static18.aBoolean30 = true;
				Static158.method2939("qa_op_test=" + Static18.aBoolean30);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static88.aBoolean134 = !Static88.aBoolean134;
				Static158.method2939("clipcomponents=" + Static88.aBoolean134);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(736) boolean local736 = Static190.aClass19_8.method2892();
				if (Static284.method4881(!local736)) {
					if (!local736) {
						Static158.method2939("Bloom enabled");
						return;
					}
					Static158.method2939("Bloom disabled");
					return;
				}
				Static158.method2939("Failed to enable bloom");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Static318.aBoolean408) {
					Static318.aBoolean408 = true;
					Static158.method2939("Forced tweening ENABLED!");
					return;
				}
				Static318.aBoolean408 = false;
				Static158.method2939("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static148.aBoolean192) {
					Static158.method2939("Shift-click disabled.");
					Static148.aBoolean192 = false;
					return;
				}
				Static158.method2939("Shift-click ENABLED!");
				Static148.aBoolean192 = true;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static158.method2939("x:" + (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6781 >> 7) + " z:" + (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6783 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static158.method2939("Height: " + Static365.aClass6Array4[Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78].method5718(Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6781 >> 7, Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6783 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static30.aClass197_5.method5089();
				Static30.aClass197_5.method5067();
				Static320.aClass104_2.method2707();
				Static236.aClass125_1.method3379();
				Static247.method4298();
				Static158.method2939("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (Static190.aClass19_8.method2869()) {
					local76 = Integer.parseInt(arg0.substring(3));
					if (local76 < 1) {
						local76 = 1;
					} else if (local76 > 4) {
						local76 = 4;
					}
					Static102.anInt3591 = local76;
					Static190.aClass19_8.method2854(Static102.anInt3591);
					Static190.aClass19_8.method2893(0);
					Static158.method2939("Render cores now: " + Static102.anInt3591);
					return;
				}
				Static158.method2939("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static158.method2939("I(s): " + Static335.aClass98_57.method2616() + "/" + Static335.aClass98_57.method2620());
				Static158.method2939("I(m): " + Static124.aClass98_63.method2616() + "/" + Static124.aClass98_63.method2620());
				Static158.method2939("O(s): " + Static313.aClass107_2.aClass97_1.method2587() + "/" + Static313.aClass107_2.aClass97_1.method2592());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static158.method2939("Pos: " + Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 + "," + (Static164.anInt3140 + (Static136.anInt6778 >> 7) >> 6) + "," + ((Static211.anInt3777 >> 7) + Static148.anInt2719 >> 6) + "," + (Static164.anInt3140 + (Static136.anInt6778 >> 7) & 0x3F) + "," + (Static148.anInt2719 + (Static211.anInt3777 >> 7) & 0x3F) + " Height: " + (Static386.method6031(Static136.anInt6778, Static211.anInt3777, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78) - Static102.anInt3592));
				Static158.method2939("Look: " + Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 + "," + (Static164.anInt3140 + Static254.anInt4698 >> 6) + "," + (Static123.anInt2420 + Static148.anInt2719 >> 6) + "," + (Static254.anInt4698 + Static164.anInt3140 & 0x3F) + "," + (Static148.anInt2719 + Static123.anInt2420 & 0x3F) + " Height: " + (Static386.method6031(Static254.anInt4698, Static123.anInt2420, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78) - Static57.anInt1464));
				return;
			}
			if (arg0.equals("showocc")) {
				Static160.aBoolean206 = !Static160.aBoolean206;
				Static347.method5826();
				Static158.method2939("showocc=" + Static160.aBoolean206);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static263.aBoolean329 = !Static263.aBoolean329;
				Static347.method5826();
				Static158.method2939("forcewallocc=" + Static263.aBoolean329);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static294.aBoolean392 = !Static294.aBoolean392;
				Static190.aClass19_8.method2855(Static294.aBoolean392);
				Static49.method1471();
				Static158.method2939("showprofiling=" + Static294.aBoolean392);
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static47.aBoolean102 = !Static47.aBoolean102;
				Static158.method2939("nonpcs=" + Static47.aBoolean102);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static200.method3643();
				Static158.method2939("auto world selected");
				return;
			}
			if (arg0.equals("heap")) {
				Static158.method2939("Heap: " + Static309.anInt5802 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static340.method5764();
				Static158.method2939("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local76 = 0; local76 < Static75.anIntArray117.length; local76++) {
					if (Static89.aBooleanArray18[local76]) {
						Static75.anIntArray117[local76] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static75.anIntArray117[local76] *= -1;
						}
					}
				}
				Static340.method5764();
				Static158.method2939("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static46.aBoolean100 = true;
				Static247.method4298();
				Static158.method2939("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static46.aBoolean100 = false;
				Static247.method4298();
				Static158.method2939("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static211.method3720();
				Static158.method2939("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static158.method2939(Static374.method6272() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local76 = Integer.parseInt(arg0.substring(9));
				if (local76 >= 0 && local76 <= 4) {
					Static218.aClass177_Sub1_2.anInt4881 = local76;
				}
				Static158.method2939("cpuusage=" + Static218.aClass177_Sub1_2.anInt4881);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local76 = Integer.parseInt(arg0.substring(17));
				Static158.method2939("varpbit=" + Static214.aClass226_1.method5777(local76));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local76 = Integer.parseInt(arg0.substring(14));
				Static158.method2939("varp=" + Static214.aClass226_1.method5776(local76));
				return;
			}
			if (Static347.anInt6442 == 30) {
				Static91.method1960(Static243.aClass145_162);
				Static257.aClass2_Sub4_Sub2_4.method4841(arg0.length() + 2);
				Static257.aClass2_Sub4_Sub2_4.method4841(arg1 ? 1 : 0);
				Static257.aClass2_Sub4_Sub2_4.method4821(arg0);
			}
			if (arg0.startsWith("fps ") && Static189.aClass127_6 != Static121.aClass127_4) {
				Static250.method4345(Static146.method2698(arg0.substring(4)));
				return;
			}
			if (Static347.anInt6442 != 30) {
				Static158.method2939("Unrecogonised commmand when not logged in: " + arg0);
				return;
			}
		} catch (@Pc(1450) Exception local1450) {
			Static158.method2939("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BZ)V")
	public static void method2972(@OriginalArg(1) boolean arg0) {
		Static37.method1135();
		if (Static347.anInt6442 != 30 && Static347.anInt6442 != 25) {
			return;
		}
		Static367.anInt6876++;
		if (Static367.anInt6876 < 50 && !arg0) {
			return;
		}
		Static367.anInt6876 = 0;
		if (!Static101.aBoolean158 && Static335.aClass111_4 != null) {
			Static91.method1960(Static326.aClass145_228);
			try {
				Static335.aClass111_4.method2797(Static257.aClass2_Sub4_Sub2_4.anInt5300, Static257.aClass2_Sub4_Sub2_4.aByteArray73);
				Static257.aClass2_Sub4_Sub2_4.anInt5300 = 0;
			} catch (@Pc(57) IOException local57) {
				Static101.aBoolean158 = true;
			}
		}
		Static37.method1135();
	}
}
