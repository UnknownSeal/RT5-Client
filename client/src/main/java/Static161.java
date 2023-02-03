import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!jg", name = "E", descriptor = "Z")
	public static boolean aBoolean208;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "Lclient!h;")
	public static final Class89 aClass89_123 = new Class89(10, -1);

	@OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
	public static int anInt2954 = 100;

	@OriginalMember(owner = "client!jg", name = "I", descriptor = "[I")
	public static final int[] anIntArray187 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
	public static void method2968() {
		Static119.types.clear();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([BI)[B")
	public static byte[] uncompress(@OriginalArg(0) byte[] in) {
		@Pc(8) Buffer buffer = new Buffer(in);
		@Pc(12) int type = buffer.g1();
		@Pc(23) int length = buffer.mg4();
		if (length < 0 || Static45.MAX_LENGTH != 0 && Static45.MAX_LENGTH < length) {
			throw new RuntimeException();
		} else if (type == 0) {
			@Pc(45) byte[] out = new byte[length];
			buffer.gdata(out, length);
			return out;
		} else {
			@Pc(57) int uncompressedLength = buffer.mg4();
			if (uncompressedLength < 0 || Static45.MAX_LENGTH != 0 && Static45.MAX_LENGTH < uncompressedLength) {
				throw new RuntimeException();
			}
			@Pc(71) byte[] out = new byte[uncompressedLength];
			if (type == 1) {
				Static213.bunzip2(out, uncompressedLength, in, length);
			} else {
				Static92.GZIP_DECOMPRESSOR.gUnzip(out, buffer);
			}
			return out;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void execute(@OriginalArg(0) String command, @OriginalArg(1) boolean arg1) {
		if (Static189.aClass127_6 == Static121.aClass127_4 && Static4.anInt90 < 2) {
			return;
		}
		if (command.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (command.equalsIgnoreCase("fpson")) {
				client.displayFps = true;
				Static158.add("fps debug enabled");
				return;
			}
			if (command.equalsIgnoreCase("fpsoff")) {
				client.displayFps = false;
				Static158.add("fps debug disabled");
				return;
			}
			if (command.equalsIgnoreCase("cls")) {
				Static177.anInt3385 = 0;
				Static368.anInt6917 = 0;
				return;
			}
			if (command.equalsIgnoreCase("cleartext")) {
				Static284.aClass36_7.method1416();
				Static158.add("Text coords cleared");
				return;
			}
			@Pc(76) int local76;
			@Pc(96) int local96;
			@Pc(87) Runtime local87;
			if (command.equalsIgnoreCase("gc")) {
				client.removeSoft();
				for (int i = 0; i < 10; i++) {
					System.gc();
				}
				Runtime runtime = Runtime.getRuntime();
				int used = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Static158.add("mem=" + used + "k");
				return;
			}
			if (command.equalsIgnoreCase("compact")) {
				client.removeSoft();
				for (int i = 0; i < 10; i++) {
					System.gc();
				}
				local87 = Runtime.getRuntime();
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				Static158.add("Memory before cleanup=" + local96 + "k");
				Static163.method3104();
				client.removeSoft();
				for (@Pc(153) int local153 = 0; local153 < 10; local153++) {
					System.gc();
				}
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				Static158.add("Memory after cleanup=" + local96 + "k");
				return;
			}
			if (command.equalsIgnoreCase("pcachesize")) {
				Static158.add("Number of player models in cache:" + Static365.getModelCacheSize());
				return;
			}
			if (command.equalsIgnoreCase("clientdrop")) {
				Static158.add("Dropped client connection");
				if (Static347.anInt6442 == 30) {
					Static211.method3724();
					return;
				}
				if (Static347.anInt6442 == 25) {
					Static101.aBoolean158 = true;
				}
				return;
			}
			if (command.equalsIgnoreCase("clientjs5drop")) {
				client.js5NetQueue.quit();
				Static158.add("Dropped client js5 net queue");
				return;
			}
			if (command.equalsIgnoreCase("serverjs5drop")) {
				client.js5NetQueue.closeServer();
				Static158.add("Dropped server js5 net queue");
				return;
			}
			if (command.equalsIgnoreCase("breakcon")) {
				GameShell.signlink.breakConnection();
				Static335.socket.breakConnection();
				client.js5NetQueue.breakConnection();
				Static158.add("Breaking new connections for 5 seconds");
				return;
			}
			if (command.equalsIgnoreCase("rebuild")) {
				Static347.method5826();
				Static247.method4298();
				Static158.add("Rebuilding map");
				return;
			}
			if (command.equalsIgnoreCase("wm1")) {
				Static143.setWindowMode(false, 1, -1, -1);
				if (Static144.getWindowMode() == 1) {
					Static158.add("wm1 succeeded");
					return;
				}
				Static158.add("wm1 failed");
				return;
			}
			if (command.equalsIgnoreCase("wm2")) {
				Static143.setWindowMode(false, 2, -1, -1);
				if (Static144.getWindowMode() == 2) {
					Static158.add("wm2 succeeded");
					return;
				}
				Static158.add("wm2 failed");
				return;
			}
			if (command.equalsIgnoreCase("wm3")) {
				Static143.setWindowMode(false, 3, 768, 1024);
				if (Static144.getWindowMode() == 3) {
					Static158.add("wm3 succeeded");
					return;
				}
				Static158.add("wm3 failed");
				return;
			}
			if (command.equalsIgnoreCase("tk0")) {
				Static78.method5700(0);
				if (Static77.anInt1762 == 0) {
					Static158.add("Entered tk0");
					Static218.preferences.anInt4878 = 0;
					Static218.preferences.write(GameShell.signlink);
					Static236.sentToServer = false;
					return;
				}
				Static158.add("Failed to enter tk0");
				return;
			}
			if (command.equalsIgnoreCase("tk1")) {
				Static78.method5700(1);
				if (Static77.anInt1762 != 1) {
					Static158.add("Failed to enter tk1");
					return;
				}
				Static158.add("Entered tk1");
				Static218.preferences.anInt4878 = 1;
				Static218.preferences.write(GameShell.signlink);
				Static236.sentToServer = false;
				return;
			}
			if (command.equalsIgnoreCase("tk2")) {
				Static78.method5700(2);
				if (Static77.anInt1762 != 2) {
					Static158.add("Failed to enter tk2");
					return;
				}
				Static158.add("Entered tk2");
				Static218.preferences.anInt4878 = 2;
				Static218.preferences.write(GameShell.signlink);
				Static236.sentToServer = false;
				return;
			}
			if (command.equalsIgnoreCase("tk3")) {
				Static78.method5700(3);
				if (Static77.anInt1762 == 3) {
					Static158.add("Entered tk3");
					return;
				}
				Static158.add("Failed to enter tk3");
				return;
			}
			if (command.equalsIgnoreCase("ot")) {
				Static218.preferences.groundTextures = !Static218.preferences.groundTextures;
				Static218.preferences.write(GameShell.signlink);
				Static236.sentToServer = false;
				Static347.method5826();
				Static158.add("ot=" + Static218.preferences.groundTextures);
				return;
			}
			if (command.equalsIgnoreCase("gb")) {
				Static218.preferences.aBoolean357 = !Static218.preferences.aBoolean357;
				Static218.preferences.write(GameShell.signlink);
				Static236.sentToServer = false;
				Static347.method5826();
				Static158.add("gb=" + Static218.preferences.aBoolean357);
				return;
			}
			if (command.startsWith("shadows")) {
				if (command.length() < 8) {
					Static158.add("Invalid shadows value");
					return;
				}
				@Pc(521) String local521 = command.substring(8);
				@Pc(531) int local531 = Static132.isInt(local521) ? Static146.parseInt(local521) : -1;
				if (local531 >= 0 && local531 <= 2) {
					Static218.preferences.sceneryShadows = local531;
					Static218.preferences.write(GameShell.signlink);
					Static236.sentToServer = false;
					Static347.method5826();
					Static158.add("shadows=" + local531);
					return;
				}
				Static158.add("Invalid shadows value");
				return;
			}
			if (command.startsWith("setba")) {
				if (command.length() < 6) {
					Static158.add("Invalid buildarea value");
					return;
				}
				int buildArea = Static146.parseInt(command.substring(6));
				if (buildArea >= 0 && buildArea <= Static289.method5018(GameShell.maxMemory)) {
					Static218.preferences.buildArea = buildArea;
					Static218.preferences.write(GameShell.signlink);
					Static236.sentToServer = false;
					Static158.add("maxbuildarea=" + Static218.preferences.buildArea);
					return;
				}
				Static158.add("Invalid buildarea value");
				return;
			}
			if (command.startsWith("setparticles")) {
				if (command.length() < 13) {
					Static158.add("Invalid particles value");
					return;
				}
				Preferences.setParticles(Static146.parseInt(command.substring(13)));
				Static218.preferences.write(GameShell.signlink);
				Static236.sentToServer = false;
				Static158.add("particles=" + Static184.getParticles());
				return;
			}
			if (command.startsWith("rect_debug")) {
				if (command.length() < 10) {
					Static158.add("Invalid rect_debug value");
					return;
				}
				Static154.rectDebug = Static146.parseInt(command.substring(10).trim());
				Static158.add("rect_debug=" + Static154.rectDebug);
				return;
			}
			if (command.equalsIgnoreCase("qa_op_test")) {
				Static18.qaOpTest = true;
				Static158.add("qa_op_test=" + Static18.qaOpTest);
				return;
			}
			if (command.equalsIgnoreCase("clipcomponents")) {
				Static88.aBoolean134 = !Static88.aBoolean134;
				Static158.add("clipcomponents=" + Static88.aBoolean134);
				return;
			}
			if (command.startsWith("bloom")) {
				@Pc(736) boolean local736 = Static190.aClass19_8.method2892();
				if (Static284.method4881(!local736)) {
					if (!local736) {
						Static158.add("Bloom enabled");
						return;
					}
					Static158.add("Bloom disabled");
					return;
				}
				Static158.add("Failed to enable bloom");
				return;
			}
			if (command.equalsIgnoreCase("tween")) {
				if (!Static318.forceTween) {
					Static318.forceTween = true;
					Static158.add("Forced tweening ENABLED!");
					return;
				}
				Static318.forceTween = false;
				Static158.add("Forced tweening disabled.");
				return;
			}
			if (command.equalsIgnoreCase("shiftclick")) {
				if (Static148.shiftClick) {
					Static158.add("Shift-click disabled.");
					Static148.shiftClick = false;
					return;
				}
				Static158.add("Shift-click ENABLED!");
				Static148.shiftClick = true;
				return;
			}
			if (command.equalsIgnoreCase("getcgcoord")) {
				Static158.add("x:" + (Static17.self.xFine >> 7) + " z:" + (Static17.self.zFine >> 7));
				return;
			}
			if (command.equalsIgnoreCase("getheight")) {
				Static158.add("Height: " + Static365.aClass6Array4[Static17.self.aByte78].method5718(Static17.self.xFine >> 7, Static17.self.zFine >> 7));
				return;
			}
			if (command.equalsIgnoreCase("resetminimap")) {
				client.js5Archive8.method5089();
				client.js5Archive8.method5067();
				Static320.aClass104_2.method2707();
				Static236.aClass125_1.method3379();
				Static247.method4298();
				Static158.add("Minimap reset");
				return;
			}
			if (command.startsWith("mc")) {
				if (Static190.aClass19_8.method2869()) {
					local76 = Integer.parseInt(command.substring(3));
					if (local76 < 1) {
						local76 = 1;
					} else if (local76 > 4) {
						local76 = 4;
					}
					Static102.anInt3591 = local76;
					Static190.aClass19_8.method2854(Static102.anInt3591);
					Static190.aClass19_8.method2893(0);
					Static158.add("Render cores now: " + Static102.anInt3591);
					return;
				}
				Static158.add("Current toolkit doesn't support multiple cores");
				return;
			}
			if (command.startsWith("cachespace")) {
				Static158.add("I(s): " + Static335.A_SOFT_LRU_HASH_TABLE___57.method2616() + "/" + Static335.A_SOFT_LRU_HASH_TABLE___57.method2620());
				Static158.add("I(m): " + Static124.A_SOFT_LRU_HASH_TABLE___63.method2616() + "/" + Static124.A_SOFT_LRU_HASH_TABLE___63.method2620());
				Static158.add("O(s): " + ObjTypeList.objTypeList.aClass97_1.method2587() + "/" + ObjTypeList.objTypeList.aClass97_1.method2592());
				return;
			}
			if (command.equalsIgnoreCase("getcamerapos")) {
				Static158.add("Pos: " + Static17.self.aByte78 + "," + (Static164.originX + (Static136.anInt6778 >> 7) >> 6) + "," + ((Static211.anInt3777 >> 7) + Static148.originZ >> 6) + "," + (Static164.originX + (Static136.anInt6778 >> 7) & 0x3F) + "," + (Static148.originZ + (Static211.anInt3777 >> 7) & 0x3F) + " Height: " + (Static386.method6031(Static136.anInt6778, Static211.anInt3777, Static17.self.aByte78) - Static102.anInt3592));
				Static158.add("Look: " + Static17.self.aByte78 + "," + (Static164.originX + Static254.anInt4698 >> 6) + "," + (Static123.anInt2420 + Static148.originZ >> 6) + "," + (Static254.anInt4698 + Static164.originX & 0x3F) + "," + (Static148.originZ + Static123.anInt2420 & 0x3F) + " Height: " + (Static386.method6031(Static254.anInt4698, Static123.anInt2420, Static17.self.aByte78) - Static57.anInt1464));
				return;
			}
			if (command.equals("showocc")) {
				Static160.aBoolean206 = !Static160.aBoolean206;
				Static347.method5826();
				Static158.add("showocc=" + Static160.aBoolean206);
				return;
			}
			if (command.equals("wallocc")) {
				Static263.aBoolean329 = !Static263.aBoolean329;
				Static347.method5826();
				Static158.add("forcewallocc=" + Static263.aBoolean329);
				return;
			}
			if (command.equals("renderprofile") || command.equals("rp")) {
				Static294.aBoolean392 = !Static294.aBoolean392;
				Static190.aClass19_8.method2855(Static294.aBoolean392);
				Static49.method1471();
				Static158.add("showprofiling=" + Static294.aBoolean392);
				return;
			}
			if (command.equals("nonpcs")) {
				Static47.aBoolean102 = !Static47.aBoolean102;
				Static158.add("nonpcs=" + Static47.aBoolean102);
				return;
			}
			if (command.equals("autoworld")) {
				Static200.method3643();
				Static158.add("auto world selected");
				return;
			}
			if (command.equals("heap")) {
				Static158.add("Heap: " + GameShell.maxMemory + "MB");
				return;
			}
			if (command.equals("savevarcs")) {
				Static340.method5764();
				Static158.add("perm varcs saved");
				return;
			}
			if (command.equals("scramblevarcs")) {
				for (local76 = 0; local76 < Static75.anIntArray117.length; local76++) {
					if (Static89.aBooleanArray18[local76]) {
						Static75.anIntArray117[local76] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static75.anIntArray117[local76] *= -1;
						}
					}
				}
				Static340.method5764();
				Static158.add("perm varcs scrambled");
				return;
			}
			if (command.equals("showcolmap")) {
				Static46.aBoolean100 = true;
				Static247.method4298();
				Static158.add("colmap is shown");
				return;
			}
			if (command.equals("hidecolmap")) {
				Static46.aBoolean100 = false;
				Static247.method4298();
				Static158.add("colmap is hidden");
				return;
			}
			if (command.equals("resetcache")) {
				Static211.method3720();
				Static158.add("Caches reset");
				return;
			}
			if (command.equals("profilecpu")) {
				Static158.add(Static374.method6272() + "ms");
				return;
			}
			if (command.startsWith("cpuusage")) {
				local76 = Integer.parseInt(command.substring(9));
				if (local76 >= 0 && local76 <= 4) {
					Static218.preferences.anInt4881 = local76;
				}
				Static158.add("cpuusage=" + Static218.preferences.anInt4881);
				return;
			}
			if (command.startsWith("getclientvarpbit")) {
				local76 = Integer.parseInt(command.substring(17));
				Static158.add("varpbit=" + Static214.aClass226_1.method5777(local76));
				return;
			}
			if (command.startsWith("getclientvarp")) {
				local76 = Integer.parseInt(command.substring(14));
				Static158.add("varp=" + Static214.aClass226_1.method5776(local76));
				return;
			}
			if (Static347.anInt6442 == 30) {
				Static91.method1960(Static243.aClass145_162);
				Static257.outboundBuffer.p1(command.length() + 2);
				Static257.outboundBuffer.p1(arg1 ? 1 : 0);
				Static257.outboundBuffer.pjstr(command);
			}
			if (command.startsWith("fps ") && Static121.aClass127_4 != Static189.aClass127_6) {
				GameShell.setFramesPerSecond(Static146.parseInt(command.substring(4)));
				return;
			}
			if (Static347.anInt6442 != 30) {
				Static158.add("Unrecogonised commmand when not logged in: " + command);
				return;
			}
		} catch (@Pc(1450) Exception local1450) {
			Static158.add("Whoops, something went wrong.");
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
		if (!Static101.aBoolean158 && Static335.socket != null) {
			Static91.method1960(Static326.aClass145_228);
			try {
				Static335.socket.write(Static257.outboundBuffer.bytes, Static257.outboundBuffer.offset);
				Static257.outboundBuffer.offset = 0;
			} catch (@Pc(57) IOException local57) {
				Static101.aBoolean158 = true;
			}
		}
		Static37.method1135();
	}
}
