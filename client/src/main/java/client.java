import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends GameShell {

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "[Lclient!rn;")
	public static final BufferedFile[] cacheIndexes = new BufferedFile[29];
	@OriginalMember(owner = "client!vr", name = "e", descriptor = "[Lclient!bl;")
	public static final Js5CachedResourceProvider[] js5Providers = new Js5CachedResourceProvider[29];
	@OriginalMember(owner = "client!qb", name = "X", descriptor = "[I")
	public static final int[] JS5_ARCHIVE_WEIGHTS = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
	@OriginalMember(owner = "client!vo", name = "F", descriptor = "J")
	public static long js5ConnectTime;
	@OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
	public static int js5ConnectState = 0;
	@OriginalMember(owner = "client!fr", name = "e", descriptor = "Lclient!iu;")
	public static BufferedSocket js5Socket;
	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!cc;")
	public static PrivelegedRequest js5SocketRequest;
	@OriginalMember(owner = "client!ql", name = "z", descriptor = "Lclient!pp;")
	public static Js5NetQueue js5NetQueue;
	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Ljava/lang/String;")
	public static String hostname;
	@OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
	public static int port;
	@OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
	public static int js5PreviousErrors = 0;
	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	public static int js5ConnectDelay = 0;
	@OriginalMember(owner = "client!as", name = "d", descriptor = "I")
	public static int defaultPort;
	@OriginalMember(owner = "client!td", name = "O", descriptor = "I")
	public static int alternatePort;
	@OriginalMember(owner = "client!ts", name = "r", descriptor = "Lclient!dn;")
	public static GameType game = null;
	@OriginalMember(owner = "client!r", name = "M", descriptor = "I")
	public static int language = 0;
	@OriginalMember(owner = "client!lq", name = "I", descriptor = "Lclient!rt;")
	public static GameMode modeWhat;
	@OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
	public static int worldListWorldID = 1;
	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/lang/String;")
	public static String settings = null;
	@OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
	public static int worldID = -1;
	@OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
	public static int mainLoadState = 0;
	@OriginalMember(owner = "client!i", name = "T", descriptor = "I")
	public static int mainLoadPercentage = 10;
	@OriginalMember(owner = "client!dd", name = "t", descriptor = "Ljava/lang/String;")
	public static String mainLoadSecondaryState = "";
	@OriginalMember(owner = "client!db", name = "s", descriptor = "Lclient!mq;")
	public static Js5MasterIndex js5MasterIndex;
	@OriginalMember(owner = "client!a", name = "g", descriptor = "Lclient!ro;")
	public static Js5CacheQueue js5CacheQueue;
	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!rn;")
	public static BufferedFile cacheData;
	@OriginalMember(owner = "client!bb", name = "z", descriptor = "Lclient!rq;")
	public static Cache masterCache;
	@OriginalMember(owner = "client!ie", name = "q", descriptor = "Lclient!client;")
	public static client instance;
	@OriginalMember(owner = "client!rm", name = "n", descriptor = "Lclient!tg;")
	public static AudioChannel musicChannel;
	@OriginalMember(owner = "client!uh", name = "W", descriptor = "Z")
	public static boolean clean = false;
	@OriginalMember(owner = "client!lg", name = "c", descriptor = "Lclient!r;")
	public static Js5 js5Archive12;
	@OriginalMember(owner = "client!fo", name = "h", descriptor = "Lclient!r;")
	public static Js5 js5Archive6;
	@OriginalMember(owner = "client!wi", name = "s", descriptor = "Lclient!od;")
	public static MidiPcmStream musicStream;
	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Lclient!r;")
	public static Js5 js5Archive4;
	@OriginalMember(owner = "client!gs", name = "n", descriptor = "Lclient!r;")
	public static Js5 js5Archive15;
	@OriginalMember(owner = "client!rh", name = "r", descriptor = "Lclient!wp;")
	public static Resampler resampler;
	@OriginalMember(owner = "client!ol", name = "e", descriptor = "Lclient!r;")
	public static Js5 js5Archive13;
	@OriginalMember(owner = "client!bo", name = "e", descriptor = "Lclient!r;")
	public static Js5 js5Archive8;
	@OriginalMember(owner = "client!kt", name = "Z", descriptor = "Lclient!tg;")
	public static AudioChannel soundChannel;
	@OriginalMember(owner = "client!nb", name = "E", descriptor = "Lclient!fi;")
	public static MixerPcmStream soundStream;
	@OriginalMember(owner = "client!hl", name = "D", descriptor = "Lclient!r;")
	public static Js5 js5Archive14;
	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!r;")
	public static Js5 js5Archive28;
	@OriginalMember(owner = "client!tr", name = "h", descriptor = "Lclient!r;")
	public static Js5 js5Archive0;
	@OriginalMember(owner = "client!bt", name = "F", descriptor = "Lclient!r;")
	public static Js5 js5Archive1;
	@OriginalMember(owner = "client!qo", name = "b", descriptor = "Lclient!r;")
	public static Js5 js5Archive2;
	@OriginalMember(owner = "client!un", name = "H", descriptor = "Lclient!r;")
	public static Js5 js5Archive3;
	@OriginalMember(owner = "client!qm", name = "Q", descriptor = "Lclient!r;")
	public static Js5 js5Archive5;
	@OriginalMember(owner = "client!nl", name = "i", descriptor = "Lclient!r;")
	public static Js5 js5Archive7;
	@OriginalMember(owner = "client!sq", name = "r", descriptor = "Lclient!r;")
	public static Js5 js5Archive9;
	@OriginalMember(owner = "client!ef", name = "A", descriptor = "Lclient!r;")
	public static Js5 js5Archive10;
	@OriginalMember(owner = "client!mm", name = "j", descriptor = "Lclient!r;")
	public static Js5 js5Archive11;
	@OriginalMember(owner = "client!wq", name = "m", descriptor = "Lclient!r;")
	public static Js5 js5Archive16;
	@OriginalMember(owner = "client!na", name = "U", descriptor = "Lclient!r;")
	public static Js5 js5Archive17;
	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!r;")
	public static Js5 js5Archive18;
	@OriginalMember(owner = "client!dj", name = "eb", descriptor = "Lclient!r;")
	public static Js5 js5Archive19;
	@OriginalMember(owner = "client!hs", name = "y", descriptor = "Lclient!r;")
	public static Js5 js5Archive20;
	@OriginalMember(owner = "client!k", name = "G", descriptor = "Lclient!r;")
	public static Js5 js5Archive21;
	@OriginalMember(owner = "client!qt", name = "v", descriptor = "Lclient!r;")
	public static Js5 js5Archive22;
	@OriginalMember(owner = "client!wo", name = "M", descriptor = "Lclient!r;")
	public static Js5 js5Archive23;
	@OriginalMember(owner = "client!wi", name = "z", descriptor = "Lclient!r;")
	public static Js5 js5Archive24;
	@OriginalMember(owner = "client!hs", name = "w", descriptor = "Lclient!r;")
	public static Js5 js5Archive25;
	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Lclient!r;")
	public static Js5 js5Archive26;
	@OriginalMember(owner = "client!dj", name = "db", descriptor = "Lclient!r;")
	public static Js5 js5Archive27;
	@OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
	public static int worldListPort;
	@OriginalMember(owner = "client!dj", name = "cb", descriptor = "Ljava/lang/String;")
	public static String worldListHostname;
	@OriginalMember(owner = "client!bu", name = "J", descriptor = "I")
	public static int worldListAlternatePort;
	@OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
	public static int worldListDefaultPort;
	@OriginalMember(owner = "client!up", name = "P", descriptor = "Z")
	public static boolean displayFps = false;
	@OriginalMember(owner = "client!il", name = "Z", descriptor = "Lclient!rn;")
	public static BufferedFile cacheMasterIndex;
	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Lclient!rn;")
	public static BufferedFile uid;
	@OriginalMember(owner = "client!tk", name = "f", descriptor = "Lclient!kp;")
	public static MouseWheel mouseWheel;
	@OriginalMember(owner = "client!bm", name = "S", descriptor = "J")
	public static long previousGC = 0L;
	@OriginalMember(owner = "client!ad", name = "p", descriptor = "J")
	public static long firstGC = 0L;
	@OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
	public static int gameState = 0;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arguments) {
		try {
			if (arguments.length != 4) {
				printUsage("argument count");
			}
			worldListWorldID = Integer.parseInt(arguments[0]);
			Static121.aClass127_4 = Static231.aClass127_7;
			if (arguments[1].equals("live")) {
				modeWhat = GameMode.GAME_MODE_LIVE;
			} else if (arguments[1].equals("rc")) {
				modeWhat = GameMode.GAME_MODE_RC;
			} else if (arguments[1].equals("wip")) {
				modeWhat = GameMode.GAME_MODE_WIP;
			} else {
				printUsage("modewhat");
			}
			language = Static25.fromIsoCode(arguments[2]);
			if (language == -1) {
				if (arguments[2].equals("english")) {
					language = 0;
				} else if (arguments[2].equals("german")) {
					language = 1;
				} else {
					printUsage("language");
				}
			}
			Static237.aBoolean298 = false;
			Static276.aBoolean375 = false;
			if (arguments[3].equals("game0")) {
				game = GameType.GAME_TYPE_RUNESCAPE;
			} else if (arguments[3].equals("game1")) {
				game = GameType.GAME_TYPE_STELLARDAWN;
			} else {
				printUsage("game");
			}
			Static320.anInt6007 = 0;
			Static31.aBoolean68 = true;
			Static381.playerMemeber = true;
			settings = "";
			Static165.anInt3149 = 0;
			Static64.anInt1555 = game.gameTypeID;
			@Pc(131) client client = new client();
			instance = client;
			client.startApplication(game.gameTypeString, modeWhat.getGameModeID() + 32);
			GameShell.frame.setLocation(40, 40);
		} catch (@Pc(154) Exception exception) {
			Static262.report(exception, null);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void printUsage(@OriginalArg(0) String argument) {
		System.out.println("Bad " + argument + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZBIZ)Lclient!r;")
	public static Js5 createJs5(@OriginalArg(1) boolean prefetchAll, @OriginalArg(3) int archive, @OriginalArg(4) boolean discardPacked) {
		@Pc(5) Cache cache = null;
		if (cacheData != null) {
			cache = new Cache(archive, cacheData, cacheIndexes[archive], 1000000);
		}
		js5Providers[archive] = js5MasterIndex.getResourceProvider(masterCache, cache, archive);
		if (prefetchAll) {
			js5Providers[archive].prefetchAll();
		}
		return new Js5(js5Providers[archive], discardPacked, 1);
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
	public static void clean() {
		Static39.aClass72_3.clean();
		Static336.aClass241_5.method6268();
		IdentityKitTypeList.identityKitTypeList.method1785();
		LocTypeList.locTypeList.method5161();
		NpcTypeList.npcTypeList.method5574();
		ObjTypeList.objTypeList.method2757();
		SeqTypeList.seqTypeList.method2375();
		Static322.aClass211_2.method5410();
		VarbitTypeList.varbitTypeList.method3389();
		Static56.aClass199_1.method5108();
		Static59.aClass7_1.method243();
		Static236.aClass125_1.method3375();
		Static320.aClass104_2.method2704();
		Static363.aClass18_2.method566();
		Static287.aClass233_1.method5883();
		Static9.aClass213_1.method5422();
		Static278.aClass160_1.method4028();
		Static90.aClass190_3.method4878();
		Static221.aClass150_3.method3731();
		Static367.aClass132_1.method3471();
		Static31.method944();
		Static367.method6145();
		Static180.method3369();
		Static33.method4201();
		Static306.A_SOFT_LRU_HASH_TABLE___49.clean(5);
		Static139.A_SOFT_LRU_HASH_TABLE___18.clean(5);
		Static61.A_SOFT_LRU_HASH_TABLE___5.clean(5);
		Static210.A_SOFT_LRU_HASH_TABLE___31.clean(5);
		ScriptRunner.A_SOFT_LRU_HASH_TABLE___30.clean(5);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	public static void removeSoft() {
		Static39.aClass72_3.method2108();
		Static336.aClass241_5.method6267();
		IdentityKitTypeList.identityKitTypeList.method1781();
		LocTypeList.locTypeList.method5157();
		NpcTypeList.npcTypeList.method5578();
		ObjTypeList.objTypeList.method2763();
		SeqTypeList.seqTypeList.method2374();
		Static322.aClass211_2.method5407();
		VarbitTypeList.varbitTypeList.method3392();
		Static56.aClass199_1.method5111();
		Static59.aClass7_1.method242();
		Static320.aClass104_2.method2705();
		Static236.aClass125_1.method3372();
		Static287.aClass233_1.method5881();
		Static363.aClass18_2.method564();
		Static9.aClass213_1.method5421();
		Static278.aClass160_1.method4029();
		Static90.aClass190_3.method4883();
		Static221.aClass150_3.method3727();
		Static367.aClass132_1.method3472();
		Static225.method3956();
		Static13.method345();
		Static320.method5460();
		Static177.method3346();
		Static306.A_SOFT_LRU_HASH_TABLE___49.method2621();
		Static139.A_SOFT_LRU_HASH_TABLE___18.method2621();
		Static61.A_SOFT_LRU_HASH_TABLE___5.method2621();
		Static210.A_SOFT_LRU_HASH_TABLE___31.method2621();
		ScriptRunner.A_SOFT_LRU_HASH_TABLE___30.method2621();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void setJs5Response(@OriginalArg(0) int response) {
		js5NetQueue.response = response;
		js5SocketRequest = null;
		js5Socket = null;
		js5ConnectState = 0;
		js5NetQueue.errors++;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void mainRedraw() {
		if (gameState == 1000) {
			return;
		}
		@Pc(18) long local18 = GameShell.time() / 1000000L - Static154.aLong89;
		Static154.aLong89 = GameShell.time() / 1000000L;
		@Pc(31) boolean local31 = Static196.method3309();
		if (local31 && Static393.jingle && musicChannel != null) {
			musicChannel.method6316();
		}
		if (gameState == 30 || gameState == 10) {
			if (Static338.aLong214 != 0L && Static338.aLong214 < MonotonicClock.currentTimeMillis()) {
				Static143.setWindowMode(false, Static144.getWindowMode(), Static218.preferences.anInt4893, Static218.preferences.anInt4884);
			} else if (Static190.aClass19_8.method2859() && Static122.aBoolean176) {
				Static353.method5882();
			}
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (GameShell.fullScreenFrame == null) {
			@Pc(84) Container local84;
			if (GameShell.frame == null) {
				local84 = GameShell.signlink.applet;
			} else {
				local84 = GameShell.frame;
			}
			local92 = local84.getSize().width;
			local96 = local84.getSize().height;
			if (local84 == GameShell.frame) {
				@Pc(102) Insets local102 = GameShell.frame.getInsets();
				local92 -= local102.right + local102.left;
				local96 -= local102.top + local102.bottom;
			}
			if (Static142.anInt2663 != local92 || local96 != Static178.anInt2319) {
				if (Static190.aClass19_8 == null || Static190.aClass19_8.method2840()) {
					Static352.method5876();
				} else {
					Static142.anInt2663 = local92;
					Static178.anInt2319 = local96;
				}
				Static338.aLong214 = MonotonicClock.currentTimeMillis() + 500L;
			}
		}
		if (GameShell.fullScreenFrame != null && !GameShell.focus && (gameState == 30 || gameState == 10)) {
			Static143.setWindowMode(false, Static218.preferences.anInt4894, -1, -1);
		}
		@Pc(169) boolean redraw = false;
		if (GameShell.fullRedraw) {
			GameShell.fullRedraw = false;
			redraw = true;
		}
		if (redraw) {
			Static372.method6259();
		}
		if (Static190.aClass19_8 != null && Static190.aClass19_8.method2812() || Static144.getWindowMode() != 1) {
			Static98.method2107();
		}
		if (gameState == 0) {
			Static172.method3289(Static291.aColorArray4[Static64.anInt1555], redraw, mainLoadPercentage, mainLoadSecondaryState, Static286.aColorArray3[Static64.anInt1555], Static174.aColorArray2[Static64.anInt1555]);
		} else if (gameState == 5) {
			Static193.method3511(Static286.aColorArray3[Static64.anInt1555].getRGB(), Static190.aClass19_8, Static52.aClass130_1, Static190.aClass19_8.method2812() | redraw, Static291.aColorArray4[Static64.anInt1555].getRGB(), Static174.aColorArray2[Static64.anInt1555].getRGB());
		} else if (gameState == 10) {
			Static337.method5708();
		} else if (gameState == 25 || gameState == 28) {
			if (Static246.anInt4505 == 1) {
				if (Static65.anInt1588 < Static144.anInt2694) {
					Static65.anInt1588 = Static144.anInt2694;
				}
				local92 = (Static65.anInt1588 - Static144.anInt2694) * 50 / Static65.anInt1588;
				Static351.method5856(Static276.aClass130_4, true, LocalisedText.LOADING_PLEASE_WAIT.getLocalisedText(language) + "<br>(" + local92 + "%)");
			} else if (Static246.anInt4505 == 2) {
				if (Static190.anInt3541 < Static305.anInt5742) {
					Static190.anInt3541 = Static305.anInt5742;
				}
				local92 = (Static190.anInt3541 - Static305.anInt5742) * 50 / Static190.anInt3541 + 50;
				Static351.method5856(Static276.aClass130_4, true, LocalisedText.LOADING_PLEASE_WAIT.getLocalisedText(language) + "<br>(" + local92 + "%)");
			} else {
				Static351.method5856(Static276.aClass130_4, true, LocalisedText.LOADING_PLEASE_WAIT.getLocalisedText(language));
			}
		} else if (gameState == 30) {
			Static133.method2503(local18);
		} else if (gameState == 40) {
			Static351.method5856(Static276.aClass130_4, true, LocalisedText.CONNECTION_LOST.getLocalisedText(language) + "<br>" + LocalisedText.PLEASE_WAIT_ATTEMPTING_TO_REESTABLISH.getLocalisedText(language));
		}
		if (Static154.rectDebug == 3) {
			for (local92 = 0; local92 < Static154.anInt2806; local92++) {
				@Pc(398) Rectangle local398 = IdentityKitTypeList.aRectangleArray1[local92];
				if (Static20.aBooleanArray6[local92]) {
					Static190.aClass19_8.method2868(local398.height, local398.x, local398.y, -1996553985, local398.width);
				} else if (Static375.aBooleanArray64[local92]) {
					Static190.aClass19_8.method2868(local398.height, local398.x, local398.y, -1996554240, local398.width);
				}
			}
		}
		if (Static333.method6317()) {
			Static279.method4724(Static190.aClass19_8);
		}
		if ((gameState == 30 || gameState == 10) && Static154.rectDebug == 0 && Static144.getWindowMode() == 1 && !redraw && SignLink.javaVersion.equals("1.1")) {
			local92 = 0;
			for (local96 = 0; local96 < Static154.anInt2806; local96++) {
				if (Static375.aBooleanArray64[local96]) {
					Static375.aBooleanArray64[local96] = false;
					Static281.aRectangleArray2[local92++] = IdentityKitTypeList.aRectangleArray1[local96];
				}
			}
			Static190.aClass19_8.method2842(Static281.aRectangleArray2, local92);
		} else if (gameState != 0) {
			Static190.aClass19_8.method2883();
			for (local92 = 0; local92 < Static154.anInt2806; local92++) {
				Static375.aBooleanArray64[local92] = false;
			}
		}
		if (Static218.preferences.anInt4881 == 0) {
			Static231.sleep(15L);
		} else if (Static218.preferences.anInt4881 == 1) {
			Static231.sleep(10L);
		} else if (Static218.preferences.anInt4881 == 2) {
			Static231.sleep(5L);
		} else if (Static218.preferences.anInt4881 == 3) {
			Static231.sleep(2L);
		}
		if (clean) {
			clean();
		}
		if (Static218.preferences.safeMode && gameState == 10 && Static139.topLevelInterface != -1) {
			Static218.preferences.safeMode = false;
			Static218.preferences.write(GameShell.signlink);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1388()) {
			return;
		}
		worldListWorldID = Integer.parseInt(this.getParameter("worldid"));
		Static121.aClass127_4 = Static238.method4119(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static274.method4637(Static121.aClass127_4) && Static189.aClass127_6 != Static121.aClass127_4) {
			Static121.aClass127_4 = Static189.aClass127_6;
		}
		modeWhat = Static132.method2484(Integer.parseInt(this.getParameter("modewhat")));
		if (GameMode.GAME_MODE_WIP != modeWhat && GameMode.GAME_MODE_RC != modeWhat && GameMode.GAME_MODE_LIVE != modeWhat) {
			modeWhat = GameMode.GAME_MODE_LIVE;
		}
		try {
			language = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			language = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static237.aBoolean298 = true;
		} else {
			Static237.aBoolean298 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static276.aBoolean375 = true;
		} else {
			Static276.aBoolean375 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static132.aBoolean180 = true;
		} else {
			Static132.aBoolean180 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			game = GameType.GAME_TYPE_STELLARDAWN;
		} else {
			game = GameType.GAME_TYPE_RUNESCAPE;
		}
		try {
			Static165.anInt3149 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static165.anInt3149 = 0;
		}
		Static307.aString57 = this.getParameter("quiturl");
		settings = this.getParameter("settings");
		if (settings == null) {
			settings = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static320.anInt6007 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static320.anInt6007 = 0;
			}
		}
		Static64.anInt1555 = Integer.parseInt(this.getParameter("colourid"));
		if (Static64.anInt1555 < 0 || Static64.anInt1555 >= Static174.aColorArray2.length) {
			Static64.anInt1555 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static31.aBoolean68 = true;
			Static381.playerMemeber = true;
		}
		instance = this;
		if (game == GameType.GAME_TYPE_RUNESCAPE) {
			Static263.anInt4834 = 503;
			Static254.anInt4701 = 765;
		} else if (game == GameType.GAME_TYPE_STELLARDAWN) {
			Static263.anInt4834 = 480;
			Static254.anInt4701 = 640;
		}
		this.method1394(Static254.anInt4701, modeWhat.getGameModeID() + 32, Static263.anInt4834);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void mainLoop() {
		if (gameState == 1000) {
			return;
		}
		Static114.loop++;
		if (Static114.loop % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static283.anInt5352 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static61.aRandom1.setSeed((long) Static283.anInt5352);
		}
		if (Static114.loop % 50 == 0) {
			Static207.anInt3746 = Static175.anInt3348;
			Static298.anInt2437 = Static301.anInt5697;
			Static175.anInt3348 = 0;
			Static301.anInt5697 = 0;
		}
		this.method1412();
		if (js5MasterIndex != null) {
			js5MasterIndex.method3876();
		}
		Static388.loop();
		Static37.method1135();
		Static174.aClass123_2.method3336();
		Static226.aClass119_1.method3306();
		if (mouseWheel != null) {
			@Pc(81) int local81 = mouseWheel.getWheelRotation();
			Static323.anInt6063 = local81;
		}
		if (Static190.aClass19_8 != null) {
			Static190.aClass19_8.method2848((int) MonotonicClock.currentTimeMillis());
		}
		Static56.method1614();
		Static6.anInt159 = 0;
		for (@Pc(103) Class37 local103 = Static174.aClass123_2.method3341(); local103 != null && Static6.anInt159 < 128; local103 = Static174.aClass123_2.method3341()) {
			if (local103.method1460() != 1) {
				@Pc(114) char local114 = local103.method1456();
				if (!Static355.method5933() || local114 != '`' && local114 != '§') {
					Static156.aClass37Array1[Static6.anInt159] = local103;
					Static6.anInt159++;
				} else if (Static333.method6317()) {
					Static321.method5477();
				} else {
					Static129.method2440();
				}
			}
		}
		Static370.aClass2_Sub24_1 = null;
		for (@Pc(163) Class2_Sub24 local163 = Static226.aClass119_1.method3307(); local163 != null; local163 = Static226.aClass119_1.method3307()) {
			@Pc(169) int local169 = local163.method5246();
			if (local169 == -1) {
				Static277.A_LINKED_LIST___31.addTail(local163);
			} else if (Static330.method5653(local169)) {
				Static370.aClass2_Sub24_1 = local163;
			}
		}
		if (Static333.method6317()) {
			Static105.method2209();
		}
		if (gameState == 0) {
			this.method1411();
			GameShell.resetTimer();
		} else if (gameState == 5) {
			this.method1411();
			GameShell.resetTimer();
		} else if (gameState == 25 || gameState == 28) {
			Static322.method5482();
		}
		if (gameState == 10) {
			this.method1405();
			Static142.method2663();
			Static164.method3147();
			Static91.loop();
		} else if (gameState == 30) {
			Static137.method2549();
		} else if (gameState == 40) {
			Static91.loop();
			if (Static41.reply != -3 && Static41.reply != 2 && Static41.reply != 15) {
				Static99.logout();
			}
		}
		Static318.method5428(Static190.aClass19_8);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void reset() {
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1402() {
		if (js5PreviousErrors < js5NetQueue.errors) {
			js5ConnectDelay = 5 * 50 * (js5NetQueue.errors - 1);
			if (port == defaultPort) {
				port = alternatePort;
			} else {
				port = defaultPort;
			}
			if (js5ConnectDelay > 3000) {
				js5ConnectDelay = 3000;
			}
			if (js5NetQueue.errors >= 2 && js5NetQueue.response == 6) {
				this.error("js5connect_outofdate");
				gameState = 1000;
				return;
			}
			if (js5NetQueue.errors >= 4 && js5NetQueue.response == -1) {
				this.error("js5crc");
				gameState = 1000;
				return;
			}
			if (js5NetQueue.errors >= 4 && (gameState == 0 || gameState == 5)) {
				if (js5NetQueue.response == 7 || js5NetQueue.response == 9) {
					this.error("js5connect_full");
				} else if (js5NetQueue.response > 0) {
					this.error("js5connect");
				} else {
					this.error("js5io");
				}
				gameState = 1000;
				return;
			}
		}
		js5PreviousErrors = js5NetQueue.errors;
		if (js5ConnectDelay > 0) {
			js5ConnectDelay--;
			return;
		}
		try {
			if (js5ConnectState == 0) {
				js5SocketRequest = GameShell.signlink.openSocket(hostname, port);
				js5ConnectState++;
			}
			if (js5ConnectState == 1) {
				if (js5SocketRequest.status == 2) {
					this.setJs5Response(1000);
					return;
				}
				if (js5SocketRequest.status == 1) {
					js5ConnectState++;
				}
			}
			if (js5ConnectState == 2) {
				js5Socket = new BufferedSocket((Socket) js5SocketRequest.result, GameShell.signlink);
				@Pc(186) Buffer buffer = new Buffer(5);
				buffer.p1(Static43.aClass242_2.value);
				buffer.p4(578);
				js5Socket.write(buffer.bytes, 5);
				js5ConnectState++;
				js5ConnectTime = MonotonicClock.currentTimeMillis();
			}
			if (js5ConnectState == 3) {
				if (gameState == 0 || gameState == 5 || js5Socket.available() > 0) {
					@Pc(245) int response = js5Socket.read();
					if (response != 0) {
						this.setJs5Response(response);
						return;
					}
					js5ConnectState++;
				} else if (MonotonicClock.currentTimeMillis() - js5ConnectTime > 30000L) {
					this.setJs5Response(1001);
					return;
				}
			}
			if (js5ConnectState == 4) {
				@Pc(278) boolean loggedOut = gameState == 5 || gameState == 10 || gameState == 28;
				js5NetQueue.start(js5Socket, !loggedOut);
				js5SocketRequest = null;
				js5ConnectState = 0;
				js5Socket = null;
			}
		} catch (@Pc(295) IOException exception) {
			this.setJs5Response(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1405() {
		Static165.anInt3148++;
		Static374.method6273(-1, null, -1);
		Static65.method1735(-1, null, -1);
		Static309.method5277();
		Static88.anInt1876++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Npc local33 = Static365.npcs[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.type.defaultmode;
				if ((local39 & 0x1) != 0) {
					@Pc(50) int local50 = local33.method4327();
					@Pc(74) int local74;
					if ((local39 & 0x2) != 0 && local33.movementQueueSize == 0 && Math.random() * 1000.0D < 10.0D) {
						local74 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(82) int local82 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local74 != 0 || local82 != 0) {
							@Pc(96) int local96 = local74 + local33.anIntArray316[0];
							if (local96 < 0) {
								local96 = 0;
							} else if (Static373.anInt7033 - local50 - 1 < local96) {
								local96 = Static373.anInt7033 - local50 - 1;
							}
							@Pc(128) int local128 = local33.anIntArray317[0] + local82;
							if (local128 < 0) {
								local128 = 0;
							} else if (Static242.anInt4449 - local50 - 1 < local128) {
								local128 = Static242.anInt4449 - local50 - 1;
							}
							@Pc(179) int local179 = Static141.findPath1(true, Static52.anIntArray99, local50, -1, 0, 0, Static171.collisionMap[local33.aByte78], local33.anIntArray316[0], local50, local96, Static59.anIntArray105, local50, local128, local33.anIntArray317[0]);
							if (local179 > 0) {
								if (local179 > 9) {
									local179 = 9;
								}
								for (@Pc(190) int local190 = 0; local190 < local179; local190++) {
									local33.anIntArray316[local190] = Static52.anIntArray99[local179 - local190 - 1];
									local33.anIntArray317[local190] = Static59.anIntArray105[local179 - local190 - 1];
									local33.aByteArray51[local190] = 1;
								}
								local33.movementQueueSize = local179;
							}
						}
					}
					Static317.method5547(local33, true);
					local74 = Static71.method6018(local33);
					Static100.method2160(local74, Static16.anInt4756, Static170.anInt3229, local33);
					Static173.method3314(local33);
				}
			}
		}
		if (Static347.step == 0 && Static141.anInt2652 == 0) {
			if (Static314.anInt5911 == 2) {
				Static222.method3916();
			} else {
				Static199.method5248();
			}
			if (Static136.anInt6778 >> 7 < 14 || Static136.anInt6778 >> 7 >= Static373.anInt7033 - 14 || Static211.anInt3777 >> 7 < 14 || Static211.anInt3777 >> 7 >= Static242.anInt4449 - 14) {
				Static262.method6253();
			}
		}
		while (true) {
			@Pc(298) HookRequest local298;
			@Pc(303) Component local303;
			@Pc(311) Component local311;
			do {
				local298 = (HookRequest) Static378.A_LINKED_LIST___43.method3548();
				if (local298 == null) {
					while (true) {
						do {
							local298 = (HookRequest) Static207.A_LINKED_LIST___25.method3548();
							if (local298 == null) {
								while (true) {
									do {
										local298 = (HookRequest) Static274.A_LINKED_LIST___30.method3548();
										if (local298 == null) {
											if (Static375.aComponent_14 != null) {
												Static122.method2398();
											}
											if (Static114.loop % 1500 == 0) {
												Static322.topBannerRefresh();
											}
											Static259.method4427();
											if (Static273.aBoolean374 && Static375.aLong221 < MonotonicClock.currentTimeMillis() - 60000L) {
												Static340.method5764();
												return;
											}
											return;
										}
										local303 = local298.source;
										if (local303.createdComponentID < 0) {
											break;
										}
										local311 = Static6.getComponent(local303.layer);
									} while (local311 == null || local311.createdComponent == null || local303.createdComponentID >= local311.createdComponent.length || local303 != local311.createdComponent[local303.createdComponentID]);
									ScriptRunner.method3590(local298);
								}
							}
							local303 = local298.source;
							if (local303.createdComponentID < 0) {
								break;
							}
							local311 = Static6.getComponent(local303.layer);
						} while (local311 == null || local311.createdComponent == null || local303.createdComponentID >= local311.createdComponent.length || local311.createdComponent[local303.createdComponentID] != local303);
						ScriptRunner.method3590(local298);
					}
				}
				local303 = local298.source;
				if (local303.createdComponentID < 0) {
					break;
				}
				local311 = Static6.getComponent(local303.layer);
			} while (local311 == null || local311.createdComponent == null || local303.createdComponentID >= local311.createdComponent.length || local311.createdComponent[local303.createdComponentID] != local303);
			ScriptRunner.method3590(local298);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
	private void decodeDefaults(@OriginalArg(1) byte[] bytes) {
		@Pc(14) Buffer buffer = new Buffer(bytes);
		while (true) {
			while (true) {
				while (true) {
					@Pc(18) int opcode = buffer.g1();
					if (opcode == 0) {
						return;
					}
					if (opcode == 1) {
						@Pc(109) int[] textures = Static209.skyboxTextures = new int[6];
						textures[0] = buffer.g2();
						textures[1] = buffer.g2();
						textures[2] = buffer.g2();
						textures[3] = buffer.g2();
						textures[4] = buffer.g2();
						textures[5] = buffer.g2();
					} else {
						@Pc(38) int local38;
						@Pc(33) int local33;
						if (opcode == 4) {
							local33 = buffer.g1();
							Static117.anIntArray150 = new int[local33];
							for (local38 = 0; local38 < local33; local38++) {
								Static117.anIntArray150[local38] = buffer.g2();
								if (Static117.anIntArray150[local38] == 65535) {
									Static117.anIntArray150[local38] = -1;
								}
							}
						} else if (opcode == 5) {
							local33 = buffer.g1();
							Static324.anIntArray412 = new int[local33];
							for (local38 = 0; local38 < local33; local38++) {
								Static324.anIntArray412[local38] = buffer.g2();
								if (Static324.anIntArray412[local38] == 65535) {
									Static324.anIntArray412[local38] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1387() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static352.method5876();
		js5CacheQueue = new Js5CacheQueue(GameShell.signlink);
		js5NetQueue = new Js5NetQueue();
		if (Static121.aClass127_4 != Static189.aClass127_6) {
			Static26.fakeModelCacheEntries = new byte[50][];
		}
		Static218.preferences = new Preferences(GameShell.signlink);
		if (Static121.aClass127_4 == Static189.aClass127_6) {
			worldListHostname = this.getCodeBase().getHost();
			worldListDefaultPort = 43594;
			worldListAlternatePort = 443;
		} else if (Static274.method4637(Static121.aClass127_4)) {
			worldListHostname = this.getCodeBase().getHost();
			worldListDefaultPort = worldListWorldID + 40000;
			worldListAlternatePort = worldListWorldID + 50000;
		} else if (Static231.aClass127_7 == Static121.aClass127_4) {
			worldListDefaultPort = worldListWorldID + 40000;
			worldListAlternatePort = worldListWorldID + 50000;
			worldListHostname = "127.0.0.1";
		}

		// temp overrides
		worldListDefaultPort = GlobalConfig.PORT;
		worldListAlternatePort = GlobalConfig.MS_PORT;
		worldListHostname = GlobalConfig.HOSTNAME;

		defaultPort = worldListDefaultPort;
		hostname = worldListHostname;
		worldListPort = worldListDefaultPort;
		alternatePort = worldListAlternatePort;
		Static257.aShortArray79 = Static223.aShortArray78 = Static258.aShortArray95 = Static147.aShortArray54 = new short[256];
		port = worldListPort;
		if (Static215.anInt3795 == 3) {
			worldID = worldListWorldID;
		}
		if (game == GameType.GAME_TYPE_STELLARDAWN) {
			Static186.aShortArrayArray6 = PlayerAppearance.GAME1_DESTINATION_SKIN_COLORS;
			Static28.anInt686 = 16777215;
			Static148.shiftClick = true;
			Static43.aShortArray20 = PlayerAppearance.GAME1_SOURCE_SKIN_COLORS;
			Static279.anInt5161 = 0;
			Static10.sourceBodyColors = PlayerAppearance.GAME1_SOURCE_BODY_COLORS;
			Static353.aShortArrayArray7 = PlayerAppearance.GAME1_DESTINATION_BODY_COLORS;
		} else {
			Static43.aShortArray20 = PlayerAppearance.GAME0_SOURCE_SKIN_COLORS;
			Static10.sourceBodyColors = PlayerAppearance.GAME0_SOURCE_BODY_COLORS;
			Static353.aShortArrayArray7 = PlayerAppearance.GAME0_DESTINATION_BODY_COLORS;
			Static186.aShortArrayArray6 = PlayerAppearance.GAME0_DESTINATION_SKIN_COLORS;
		}
		Static174.aClass123_2 = Static18.method556(GameShell.canvas);
		Static226.aClass119_1 = Static31.method948(GameShell.canvas);
		mouseWheel = MouseWheel.create();
		if (mouseWheel != null) {
			mouseWheel.start(GameShell.canvas);
		}
		Static367.anInt6878 = Static215.anInt3795;
		try {
			if (GameShell.signlink.cacheData != null) {
				cacheData = new BufferedFile(GameShell.signlink.cacheData, 5200, 0);
				for (@Pc(171) int i = 0; i < 29; i++) {
					cacheIndexes[i] = new BufferedFile(GameShell.signlink.cacheIndexes[i], 6000, 0);
				}
				cacheMasterIndex = new BufferedFile(GameShell.signlink.aFileOnDisk_3, 6000, 0);
				masterCache = new Cache(255, cacheData, cacheMasterIndex, 500000);
				uid = new BufferedFile(GameShell.signlink.aFileOnDisk_1, 24, 0);
				GameShell.signlink.aFileOnDisk_1 = null;
				GameShell.signlink.aFileOnDisk_3 = null;
				GameShell.signlink.cacheIndexes = null;
				GameShell.signlink.cacheData = null;
			}
		} catch (@Pc(227) IOException local227) {
			cacheMasterIndex = null;
			cacheData = null;
			uid = null;
			masterCache = null;
		}
		if (Static189.aClass127_6 != Static121.aClass127_4) {
			displayFps = true;
		}
		Static290.aString56 = (GameType.GAME_TYPE_RUNESCAPE == game ? LocalisedText.RUNESCAPE_IS_LOADING : LocalisedText.ALTERNATE_GAME_IS_LOADING).getLocalisedText(language);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1411() {
		@Pc(6) int local6;
		if (!Static218.preferences.safeMode) {
			for (local6 = 0; local6 < Static6.anInt159; local6++) {
				if (Static156.aClass37Array1[local6].method1456() == 's' || Static156.aClass37Array1[local6].method1456() == 'S') {
					Static218.preferences.safeMode = true;
					break;
				}
			}
		}
		@Pc(55) int local55;
		if (mainLoadState == 0) {
			@Pc(45) Runtime runtime = Runtime.getRuntime();
			int usedMemory = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
			@Pc(60) long now = MonotonicClock.currentTimeMillis();
			if (firstGC == 0L) {
				firstGC = now;
			}
			if (usedMemory > 16384 && now - firstGC < 5000L) {
				if (now - previousGC > 1000L) {
					System.gc();
					previousGC = now;
				}
				mainLoadSecondaryState = LocalisedText.ALLOCATING_MEMORY.getLocalisedText(language);
				mainLoadPercentage = 5;
			} else {
				mainLoadSecondaryState = LocalisedText.ALLOCATED_MEMORY.getLocalisedText(language);
				mainLoadPercentage = 5;
				mainLoadState = 10;
			}
		} else if (mainLoadState == 10) {
			for (int i = 0; i < 4; i++) {
				Static171.collisionMap[i] = Static24.method853(Static373.anInt7033, Static242.anInt4449);
			}
			mainLoadSecondaryState = LocalisedText.CREATED_GAMEWORLD.getLocalisedText(language);
			mainLoadState = 20;
			mainLoadPercentage = 10;
		} else if (mainLoadState == 20) {
			if (js5MasterIndex == null) {
				js5MasterIndex = new Js5MasterIndex(js5NetQueue, js5CacheQueue);
			}
			if (js5MasterIndex.isReady()) {
				js5Archive0 = createJs5(true, 0, false);
				js5Archive1 = createJs5(true, 1, false);
				js5Archive2 = createJs5(true, 2, false);
				js5Archive3 = createJs5(true, 3, false);
				js5Archive4 = createJs5(true, 4, false);
				js5Archive5 = createJs5(true, 5, true);
				js5Archive6 = createJs5(false, 6, true);
				js5Archive7 = createJs5(true, 7, false);
				js5Archive8 = createJs5(true, 8, false);
				js5Archive9 = createJs5(true, 9, false);
				js5Archive10 = createJs5(true, 10, false);
				js5Archive11 = createJs5(true, 11, false);
				js5Archive12 = createJs5(true, 12, false);
				js5Archive13 = createJs5(true, 13, false);
				js5Archive14 = createJs5(false, 14, false);
				js5Archive15 = createJs5(true, 15, false);
				js5Archive16 = createJs5(true, 16, false);
				js5Archive17 = createJs5(true, 17, false);
				js5Archive18 = createJs5(true, 18, false);
				js5Archive19 = createJs5(true, 19, false);
				js5Archive20 = createJs5(true, 20, false);
				js5Archive21 = createJs5(true, 21, false);
				js5Archive22 = createJs5(true, 22, false);
				js5Archive23 = createJs5(true, 23, true);
				js5Archive24 = createJs5(true, 24, false);
				js5Archive25 = createJs5(true, 25, false);
				js5Archive26 = createJs5(true, 26, true);
				js5Archive27 = createJs5(true, 27, false);
				js5Archive28 = createJs5(true, 28, true);
				mainLoadSecondaryState = LocalisedText.CONNECTED_TO_UPDATE_SERVER.getLocalisedText(language);
				mainLoadState = 30;
				mainLoadPercentage = 15;
			} else {
				mainLoadSecondaryState = LocalisedText.CONNECTING_TO_UPDATE_SERVER.getLocalisedText(language);
				mainLoadPercentage = 12;
			}
		} else if (mainLoadState == 30) {
			int percentage = 0;
			for (int i = 0; i < 29; i++) {
				percentage += js5Providers[i].getIndexPercentageComplete() * JS5_ARCHIVE_WEIGHTS[i] / 100;
			}
			if (percentage == 100) {
				mainLoadSecondaryState = LocalisedText.LOADED_UPDATE_LIST.getLocalisedText(language);
				mainLoadPercentage = 20;
				Static62.method2390(js5Archive8);
				Static44.method1359(js5Archive8);
				mainLoadState = 40;
			} else {
				if (percentage != 0) {
					mainLoadSecondaryState = LocalisedText.CHECKING_FOR_UPDATES.getLocalisedText(language) + percentage + "%";
				}
				mainLoadPercentage = 20;
			}
		} else if (mainLoadState == 40) {
			if (js5Archive28.fetchAll()) {
				this.decodeDefaults(js5Archive28.fetchFile(1));
				mainLoadSecondaryState = LocalisedText.LOADED_DEFAULTS.getLocalisedText(language);
				mainLoadPercentage = 25;
				mainLoadState = 50;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADING_DEFAULTS.getLocalisedText(language) + js5Archive28.getPercentageComplete() + "%";
				mainLoadPercentage = 25;
			}
		} else if (mainLoadState == 50) {
			AudioChannel.init(Static218.preferences.stereo);
			musicStream = new MidiPcmStream();
			musicStream.init();
			musicChannel = AudioChannel.create(GameShell.signlink, GameShell.canvas, 0, 22050);
			musicChannel.setStream(musicStream);
			Static180.init(musicStream, js5Archive15, js5Archive14, js5Archive4);
			soundChannel = AudioChannel.create(GameShell.signlink, GameShell.canvas, 1, 2048);
			soundStream = new MixerPcmStream();
			soundChannel.setStream(soundStream);
			resampler = new Resampler(22050, Static356.sampleRate);
			Static97.titleSong = js5Archive6.getGroupID("scape main");
			mainLoadSecondaryState = LocalisedText.PREPARED_SOUND_ENGINE.getLocalisedText(language);
			mainLoadPercentage = 30;
			mainLoadState = 60;
		} else if (mainLoadState == 60) {
			int ready = Static64.getReady(js5Archive8, js5Archive13);
			int total = Static218.getTotal();
			if (total > ready) {
				mainLoadSecondaryState = LocalisedText.LOADING_CORE_FONTS.getLocalisedText(language) + ready * 100 / total + "%";
				mainLoadPercentage = 35;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADED_CORE_FONTS.getLocalisedText(language);
				mainLoadState = 70;
				mainLoadPercentage = 35;
			}
		} else if (mainLoadState == 70) {
			int ready = Static333.getReady(js5Archive8);
			int total = Static32.getTotal();
			if (ready < total) {
				mainLoadSecondaryState = LocalisedText.LOADING_TITLE_SCREEN.getLocalisedText(language) + ready * 100 / total + "%";
				mainLoadPercentage = 40;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADED_TITLE_SCREEN.getLocalisedText(language);
				mainLoadState = 80;
				mainLoadPercentage = 40;
			}
		} else if (mainLoadState == 80) {
			if (js5Archive26.fetchAll()) {
				Static128.anInterface2_4 = new Class99(js5Archive26, js5Archive9, js5Archive8);
				mainLoadSecondaryState = LocalisedText.LOADED_TEXTURES.getLocalisedText(language);
				mainLoadPercentage = 45;
				mainLoadState = 90;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADING_TEXTURES.getLocalisedText(language) + js5Archive26.getPercentageComplete() + "%";
				mainLoadPercentage = 45;
			}
		} else if (mainLoadState == 90) {
			mainLoadSecondaryState = LocalisedText.STARTING_3D_LIBRARY.getLocalisedText(language);
			mainLoadState = 95;
			mainLoadPercentage = 50;
		} else if (mainLoadState == 95) {
			if (Static218.preferences.safeMode) {
				Static218.preferences.anInt4894 = 1;
				Static218.preferences.anInt4878 = 0;
				Static218.preferences.anInt4885 = 0;
				Static218.preferences.buildArea = 0;
				Static218.preferences.antiAliasingMode = 0;
			}
			Static218.preferences.safeMode = true;
			Static218.preferences.write(GameShell.signlink);
			Static252.method4364(false, Static218.preferences.anInt4878);
			mainLoadSecondaryState = LocalisedText.STARTED_3D_LIBRARY.getLocalisedText(language);
			mainLoadPercentage = 55;
			mainLoadState = 100;
		} else if (mainLoadState == 100) {
			Static236.method4101(js5Archive8, js5Archive13, Static190.aClass19_8);
			mainLoadSecondaryState = LocalisedText.OPENED_TITLE_SCREEN.getLocalisedText(language);
			mainLoadPercentage = 60;
			Static336.method5704(5);
			mainLoadState = 110;
		} else if (mainLoadState == 110) {
			js5Archive2.fetchAll();
			local6 = js5Archive2.getPercentageComplete();
			js5Archive16.fetchAll();
			local6 += js5Archive16.getPercentageComplete();
			js5Archive17.fetchAll();
			local6 += js5Archive17.getPercentageComplete();
			js5Archive18.fetchAll();
			local6 += js5Archive18.getPercentageComplete();
			js5Archive19.fetchAll();
			local6 += js5Archive19.getPercentageComplete();
			js5Archive20.fetchAll();
			local6 += js5Archive20.getPercentageComplete();
			js5Archive21.fetchAll();
			local6 += js5Archive21.getPercentageComplete();
			js5Archive22.fetchAll();
			local6 += js5Archive22.getPercentageComplete();
			js5Archive24.fetchAll();
			local6 += js5Archive24.getPercentageComplete();
			js5Archive25.fetchAll();
			local6 += js5Archive25.getPercentageComplete();
			js5Archive27.fetchAll();
			local6 += js5Archive27.getPercentageComplete();
			if (local6 < 1100) {
				mainLoadSecondaryState = LocalisedText.LOADING_CONFIG.getLocalisedText(language) + local6 / 11 + "%";
				mainLoadPercentage = 65;
			} else {
				Static363.aClass18_2 = new Class18(js5Archive2);
				Static59.aClass7_1 = new Class7(js5Archive2);
				Static221.aClass150_3 = new Class150(language, js5Archive2, js5Archive8);
				EnumTypeList.enumTypeList = new EnumTypeList(language, js5Archive17);
				Static39.aClass72_3 = new Class72(language, js5Archive2);
				Static336.aClass241_5 = new Class241(js5Archive2);
				IdentityKitTypeList.identityKitTypeList = new IdentityKitTypeList(js5Archive2, js5Archive7);
				Static178.aClass51_3 = new Class51(js5Archive2);
				Static90.aClass190_3 = new Class190(js5Archive2);
				LocTypeList.locTypeList = new LocTypeList(true, js5Archive16, js5Archive7);
				Static236.aClass125_1 = new Class125(js5Archive2, js5Archive8);
				Static320.aClass104_2 = new Class104(js5Archive2, js5Archive8);
				NpcTypeList.npcTypeList = new NpcTypeList(game, language, true, js5Archive18, js5Archive7);
				ObjTypeList.objTypeList = new ObjTypeList(language, true, Static363.aClass18_2, js5Archive19, js5Archive7);
				Static287.aClass233_1 = new Class233(game, language, js5Archive2);
				SeqTypeList.seqTypeList = new SeqTypeList(game, language, js5Archive20, js5Archive0, js5Archive1);
				Static9.aClass213_1 = new Class213(game, language, js5Archive2);
				Static278.aClass160_1 = new Class160(game, language, js5Archive2);
				Static322.aClass211_2 = new Class211(game, language, js5Archive21, js5Archive7);
				Static367.aClass132_1 = new Class132(game, language, js5Archive2);
				Static183.aClass193_2 = new Class193(game, language, js5Archive2);
				Static162.aClass45_1 = new Class45(game, language, js5Archive2);
				VarbitTypeList.varbitTypeList = new VarbitTypeList(game, language, js5Archive22);
				Static56.aClass199_1 = new Class199(game, language, js5Archive2);
				Static126.method5701(js5Archive13, js5Archive7, js5Archive3, js5Archive8);
				Static325.method5543(new Js5QuickChatCommandDecoder(), js5Archive24, js5Archive25);
				Static117.method2366(js5Archive24, js5Archive25);
				mainLoadSecondaryState = LocalisedText.LOADED_CONFIG.getLocalisedText(language);
				mainLoadPercentage = 65;
				Static156.method2798();
				LocTypeList.locTypeList.method5159(!Static218.preferences.method4494(Static77.anInt1762));
				Static214.aClass226_1 = new Class226();
				Static174.method1506();
				Static382.method6361(js5Archive27);
				Static292.method5036(Static128.anInterface2_4, js5Archive7);
				mainLoadState = 120;
			}
		} else if (mainLoadState == 120) {
			local6 = Static134.method2509(js5Archive8);
			local55 = Static254.method4374();
			if (local55 > local6) {
				mainLoadSecondaryState = LocalisedText.LOADING_SPRITES.getLocalisedText(language) + local6 * 100 / local55 + "%";
			} else {
				Static44.method1358(Static190.aClass19_8, js5Archive8);
				Static144.method2691(Static124.aSpriteArray27);
				mainLoadSecondaryState = LocalisedText.LOADED_SPRITES.getLocalisedText(language);
				mainLoadState = 130;
			}
			mainLoadPercentage = 70;
		} else if (mainLoadState == 130) {
			if (js5Archive10.isFileReady("huffman", "")) {
				@Pc(1242) HuffmanCodec codec = new HuffmanCodec(js5Archive10.fetchFile("huffman", ""));
				Static334.init(codec);
				mainLoadSecondaryState = LocalisedText.LOADED_WORDPACK.getLocalisedText(language);
				mainLoadState = 140;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADING_WORDPACK.getLocalisedText(language) + "0%";
			}
			mainLoadPercentage = 75;
		} else if (mainLoadState == 140) {
			if (js5Archive3.fetchAll()) {
				mainLoadSecondaryState = LocalisedText.LOADED_INTERFACES.getLocalisedText(language);
				mainLoadState = 150;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADING_INTERFACES.getLocalisedText(language) + js5Archive3.getPercentageComplete() + "%";
			}
			mainLoadPercentage = 80;
		} else if (mainLoadState == 150) {
			if (js5Archive12.fetchAll()) {
				mainLoadSecondaryState = LocalisedText.LOADED_INTERFACE_SCRIPTS.getLocalisedText(language);
				mainLoadPercentage = 82;
				mainLoadState = 160;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADING_INTERFACE_SCRIPTS.getLocalisedText(language) + js5Archive12.getPercentageComplete() + "%";
				mainLoadPercentage = 82;
			}
		} else if (mainLoadState == 160) {
			if (js5Archive13.fetchAll()) {
				mainLoadSecondaryState = LocalisedText.LOADING_ADDITIONAL_FONTS.getLocalisedText(language);
				mainLoadPercentage = 85;
				mainLoadState = 170;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADING_ADDITIONAL_FONTS.getLocalisedText(language) + js5Archive13.getPercentageComplete() + "%";
				mainLoadPercentage = 85;
			}
		} else if (mainLoadState == 170) {
			if (js5Archive23.isGroupReady("details")) {
				Static344.method5511(js5Archive23, Static39.aClass72_3, Static336.aClass241_5, LocTypeList.locTypeList, Static236.aClass125_1, Static320.aClass104_2, Static214.aClass226_1);
				mainLoadSecondaryState = LocalisedText.LOADED_WORLD_MAP.getLocalisedText(language);
				mainLoadState = 180;
				mainLoadPercentage = 89;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADING_WORLD_MAP.getLocalisedText(language) + js5Archive23.method5084("details") + "%";
				mainLoadPercentage = 87;
			}
		} else if (mainLoadState == 180) {
			int reply = Static319.fetch();
			if (reply == -1) {
				mainLoadSecondaryState = LocalisedText.LOADING_WORLD_LIST_DATA.getLocalisedText(language);
				mainLoadPercentage = 90;
			} else if (reply == 7 || reply == 9) {
				this.error("worldlistfull");
				Static336.method5704(1000);
			} else if (Static70.loaded) {
				mainLoadSecondaryState = LocalisedText.LOADED_WORLD_LIST_DATA.getLocalisedText(language);
				mainLoadPercentage = 90;
				mainLoadState = 190;
			} else {
				this.error("worldlistio_" + reply);
				Static336.method5704(1000);
			}
		} else if (mainLoadState == 190) {
			Static89.aBooleanArray18 = new boolean[Static162.aClass45_1.anInt1466];
			Static75.aStringArray11 = new String[Static183.aClass193_2.anInt5494];
			Static75.anIntArray117 = new int[Static162.aClass45_1.anInt1466];
			for (local6 = 0; local6 < Static162.aClass45_1.anInt1466; local6++) {
				if (Static162.aClass45_1.method1623(local6).anInt1258 == 0) {
					Static89.aBooleanArray18[local6] = true;
					Static112.anInt2294++;
				}
				Static75.anIntArray117[local6] = -1;
			}
			Static318.method5424();
			Static391.loginScreenID = js5Archive3.getGroupID("loginscreen");
			js5Archive5.discardNames(false);
			js5Archive6.discardNames(true);
			js5Archive8.discardNames(true);
			js5Archive13.discardNames(true);
			js5Archive10.discardNames(true);
			js5Archive3.discardNames(true);
			clean = true;
			js5Archive2.discardUnpacked = 2;
			js5Archive17.discardUnpacked = 2;
			js5Archive16.discardUnpacked = 2;
			js5Archive18.discardUnpacked = 2;
			js5Archive19.discardUnpacked = 2;
			js5Archive20.discardUnpacked = 2;
			js5Archive21.discardUnpacked = 2;
			Static143.setWindowMode(false, Static218.preferences.anInt4894, -1, -1);
			mainLoadSecondaryState = LocalisedText.LOADED_CLIENT_VARIABLE_DATA.getLocalisedText(language);
			mainLoadState = 200;
			mainLoadPercentage = 95;
		} else if (mainLoadState == 200) {
			Static50.method1525(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method1412() {
		@Pc(21) boolean local21 = js5NetQueue.method4639();
		if (!local21) {
			this.method1402();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void mainQuit() {
		if (Static273.aBoolean374) {
			Static340.method5764();
		}
		if (Static190.aClass19_8 != null) {
			Static190.aClass19_8.method2825();
		}
		if (GameShell.fullScreenFrame != null) {
			Static17.method4214(GameShell.fullScreenFrame, GameShell.signlink);
			GameShell.fullScreenFrame = null;
		}
		if (Static335.socket != null) {
			Static335.socket.close();
			Static335.socket = null;
		}
		if (mouseWheel != null) {
			mouseWheel.stop(GameShell.canvas);
		}
		mouseWheel = null;
		if (musicChannel != null) {
			musicChannel.quit();
		}
		if (soundChannel != null) {
			soundChannel.quit();
		}
		js5NetQueue.quit();
		js5CacheQueue.method5227();
		if (Static4.aClass162_1 != null) {
			Static4.aClass162_1.method4114();
			Static4.aClass162_1 = null;
		}
	}
}
