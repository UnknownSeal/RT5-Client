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
			Static381.aBoolean482 = true;
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
		Static21.setIdentikit.method1785();
		Static359.aClass202_4.method5161();
		Static6.aClass219_1.method5574();
		Static313.aClass107_2.method2757();
		Static39.aClass85_1.method2375();
		Static322.aClass211_2.method5410();
		Static322.aClass128_1.method3389();
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
		if (Static347.anInt6442 == 1000) {
			return;
		}
		@Pc(18) long local18 = GameShell.time() / 1000000L - Static154.aLong89;
		Static154.aLong89 = GameShell.time() / 1000000L;
		@Pc(31) boolean local31 = Static196.method3309();
		if (local31 && Static393.jingle && musicChannel != null) {
			musicChannel.method6316();
		}
		if (Static347.anInt6442 == 30 || Static347.anInt6442 == 10) {
			if (Static338.aLong214 != 0L && Static338.aLong214 < MonotonicClock.currentTimeMillis()) {
				Static143.method2677(Static218.aClass177_Sub1_2.anInt4893, Static144.method2692(), false, Static218.aClass177_Sub1_2.anInt4884);
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
		if (GameShell.fullScreenFrame != null && !GameShell.focus && (Static347.anInt6442 == 30 || Static347.anInt6442 == 10)) {
			Static143.method2677(-1, Static218.aClass177_Sub1_2.anInt4894, false, -1);
		}
		@Pc(169) boolean redraw = false;
		if (GameShell.fullRedraw) {
			GameShell.fullRedraw = false;
			redraw = true;
		}
		if (redraw) {
			Static372.method6259();
		}
		if (Static190.aClass19_8 != null && Static190.aClass19_8.method2812() || Static144.method2692() != 1) {
			Static98.method2107();
		}
		if (Static347.anInt6442 == 0) {
			Static172.method3289(Static291.aColorArray4[Static64.anInt1555], redraw, mainLoadPercentage, mainLoadSecondaryState, Static286.aColorArray3[Static64.anInt1555], Static174.aColorArray2[Static64.anInt1555]);
		} else if (Static347.anInt6442 == 5) {
			Static193.method3511(Static286.aColorArray3[Static64.anInt1555].getRGB(), Static190.aClass19_8, Static52.aClass130_1, Static190.aClass19_8.method2812() | redraw, Static291.aColorArray4[Static64.anInt1555].getRGB(), Static174.aColorArray2[Static64.anInt1555].getRGB());
		} else if (Static347.anInt6442 == 10) {
			Static337.method5708();
		} else if (Static347.anInt6442 == 25 || Static347.anInt6442 == 28) {
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
		} else if (Static347.anInt6442 == 30) {
			Static133.method2503(local18);
		} else if (Static347.anInt6442 == 40) {
			Static351.method5856(Static276.aClass130_4, true, LocalisedText.CONNECTION_LOST.getLocalisedText(language) + "<br>" + LocalisedText.PLEASE_WAIT_ATTEMPTING_TO_REESTABLISH.getLocalisedText(language));
		}
		if (Static154.anInt2807 == 3) {
			for (local92 = 0; local92 < Static154.anInt2806; local92++) {
				@Pc(398) Rectangle local398 = Class55.aRectangleArray1[local92];
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
		if ((Static347.anInt6442 == 30 || Static347.anInt6442 == 10) && Static154.anInt2807 == 0 && Static144.method2692() == 1 && !redraw && SignLink.javaVersion.equals("1.1")) {
			local92 = 0;
			for (local96 = 0; local96 < Static154.anInt2806; local96++) {
				if (Static375.aBooleanArray64[local96]) {
					Static375.aBooleanArray64[local96] = false;
					Static281.aRectangleArray2[local92++] = Class55.aRectangleArray1[local96];
				}
			}
			Static190.aClass19_8.method2842(Static281.aRectangleArray2, local92);
		} else if (Static347.anInt6442 != 0) {
			Static190.aClass19_8.method2883();
			for (local92 = 0; local92 < Static154.anInt2806; local92++) {
				Static375.aBooleanArray64[local92] = false;
			}
		}
		if (Static218.aClass177_Sub1_2.anInt4881 == 0) {
			Static231.sleep(15L);
		} else if (Static218.aClass177_Sub1_2.anInt4881 == 1) {
			Static231.sleep(10L);
		} else if (Static218.aClass177_Sub1_2.anInt4881 == 2) {
			Static231.sleep(5L);
		} else if (Static218.aClass177_Sub1_2.anInt4881 == 3) {
			Static231.sleep(2L);
		}
		if (clean) {
			clean();
		}
		if (Static218.aClass177_Sub1_2.safeMode && Static347.anInt6442 == 10 && Static139.topLevelInterface != -1) {
			Static218.aClass177_Sub1_2.safeMode = false;
			Static218.aClass177_Sub1_2.write(GameShell.signlink);
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
			Static381.aBoolean482 = true;
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
		if (Static347.anInt6442 == 1000) {
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
		Static388.method6437();
		Static37.method1135();
		Static174.aClass123_2.method3336();
		Static226.aClass119_1.method3306();
		if (Static337.aClass131_1 != null) {
			@Pc(81) int local81 = Static337.aClass131_1.method3692();
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
		if (Static347.anInt6442 == 0) {
			this.method1411();
			GameShell.resetTimer();
		} else if (Static347.anInt6442 == 5) {
			this.method1411();
			GameShell.resetTimer();
		} else if (Static347.anInt6442 == 25 || Static347.anInt6442 == 28) {
			Static322.method5482();
		}
		if (Static347.anInt6442 == 10) {
			this.method1405();
			Static142.method2663();
			Static164.method3147();
			Static91.loop();
		} else if (Static347.anInt6442 == 30) {
			Static137.method2549();
		} else if (Static347.anInt6442 == 40) {
			Static91.loop();
			if (Static41.reply != -3 && Static41.reply != 2 && Static41.reply != 15) {
				Static99.method2144();
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
				Static347.anInt6442 = 1000;
				return;
			}
			if (js5NetQueue.errors >= 4 && js5NetQueue.response == -1) {
				this.error("js5crc");
				Static347.anInt6442 = 1000;
				return;
			}
			if (js5NetQueue.errors >= 4 && (Static347.anInt6442 == 0 || Static347.anInt6442 == 5)) {
				if (js5NetQueue.response == 7 || js5NetQueue.response == 9) {
					this.error("js5connect_full");
				} else if (js5NetQueue.response > 0) {
					this.error("js5connect");
				} else {
					this.error("js5io");
				}
				Static347.anInt6442 = 1000;
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
				buffer.p1(Static43.aClass242_2.anInt7038);
				buffer.p4(578);
				js5Socket.write(buffer.bytes, 5);
				js5ConnectState++;
				js5ConnectTime = MonotonicClock.currentTimeMillis();
			}
			if (js5ConnectState == 3) {
				if (Static347.anInt6442 == 0 || Static347.anInt6442 == 5 || js5Socket.available() > 0) {
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
				@Pc(278) boolean loggedOut = Static347.anInt6442 == 5 || Static347.anInt6442 == 10 || Static347.anInt6442 == 28;
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
							@Pc(179) int local179 = Static141.method2654(true, Static52.anIntArray99, local50, -1, 0, 0, Static171.collisionMap[local33.aByte78], local33.anIntArray316[0], local50, local96, Static59.anIntArray105, local50, local128, local33.anIntArray317[0]);
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
			@Pc(298) Class2_Sub13 local298;
			@Pc(303) Component local303;
			@Pc(311) Component local311;
			do {
				local298 = (Class2_Sub13) Static378.A_LINKED_LIST___43.method3548();
				if (local298 == null) {
					while (true) {
						do {
							local298 = (Class2_Sub13) Static207.A_LINKED_LIST___25.method3548();
							if (local298 == null) {
								while (true) {
									do {
										local298 = (Class2_Sub13) Static274.A_LINKED_LIST___30.method3548();
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
										local303 = local298.aComponent_3;
										if (local303.createdComponentID < 0) {
											break;
										}
										local311 = Static6.getComponent(local303.layer);
									} while (local311 == null || local311.createdComponent == null || local303.createdComponentID >= local311.createdComponent.length || local303 != local311.createdComponent[local303.createdComponentID]);
									ScriptRunner.method3590(local298);
								}
							}
							local303 = local298.aComponent_3;
							if (local303.createdComponentID < 0) {
								break;
							}
							local311 = Static6.getComponent(local303.layer);
						} while (local311 == null || local311.createdComponent == null || local303.createdComponentID >= local311.createdComponent.length || local311.createdComponent[local303.createdComponentID] != local303);
						ScriptRunner.method3590(local298);
					}
				}
				local303 = local298.aComponent_3;
				if (local303.createdComponentID < 0) {
					break;
				}
				local311 = Static6.getComponent(local303.layer);
			} while (local311 == null || local311.createdComponent == null || local303.createdComponentID >= local311.createdComponent.length || local311.createdComponent[local303.createdComponentID] != local303);
			ScriptRunner.method3590(local298);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
	private void method1406(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Buffer local14 = new Buffer(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(18) int local18 = local14.g1();
					if (local18 == 0) {
						return;
					}
					if (local18 == 1) {
						@Pc(109) int[] local109 = Static209.anIntArray228 = new int[6];
						local109[0] = local14.g2();
						local109[1] = local14.g2();
						local109[2] = local14.g2();
						local109[3] = local14.g2();
						local109[4] = local14.g2();
						local109[5] = local14.g2();
					} else {
						@Pc(38) int local38;
						@Pc(33) int local33;
						if (local18 == 4) {
							local33 = local14.g1();
							Static117.anIntArray150 = new int[local33];
							for (local38 = 0; local38 < local33; local38++) {
								Static117.anIntArray150[local38] = local14.g2();
								if (Static117.anIntArray150[local38] == 65535) {
									Static117.anIntArray150[local38] = -1;
								}
							}
						} else if (local18 == 5) {
							local33 = local14.g1();
							Static324.anIntArray412 = new int[local33];
							for (local38 = 0; local38 < local33; local38++) {
								Static324.anIntArray412[local38] = local14.g2();
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
			Static26.aByteArrayArray3 = new byte[50][];
		}
		Static218.aClass177_Sub1_2 = new Class177_Sub1(GameShell.signlink);
		if (Static121.aClass127_4 == Static189.aClass127_6) {
			Static61.aString14 = this.getCodeBase().getHost();
			Static392.anInt7225 = 43594;
			Static35.anInt920 = 443;
		} else if (Static274.method4637(Static121.aClass127_4)) {
			Static61.aString14 = this.getCodeBase().getHost();
			Static392.anInt7225 = worldListWorldID + 40000;
			Static35.anInt920 = worldListWorldID + 50000;
		} else if (Static231.aClass127_7 == Static121.aClass127_4) {
			Static392.anInt7225 = worldListWorldID + 40000;
			Static35.anInt920 = worldListWorldID + 50000;
			Static61.aString14 = "127.0.0.1";
		}

		// temp overrides
		Static392.anInt7225 = GlobalConfig.PORT;
		Static35.anInt920 = GlobalConfig.MS_PORT;
		Static61.aString14 = GlobalConfig.HOSTNAME;

		defaultPort = Static392.anInt7225;
		hostname = Static61.aString14;
		Static278.anInt5154 = Static392.anInt7225;
		alternatePort = Static35.anInt920;
		Static257.aShortArray79 = Static223.aShortArray78 = Static258.aShortArray95 = Static147.aShortArray54 = new short[256];
		port = Static278.anInt5154;
		if (Static215.anInt3795 == 3) {
			worldID = worldListWorldID;
		}
		if (game == GameType.GAME_TYPE_STELLARDAWN) {
			Static186.aShortArrayArray6 = Static30.aShortArrayArray3;
			Static28.anInt686 = 16777215;
			Static148.aBoolean192 = true;
			Static43.aShortArray20 = Static113.aShortArray46;
			Static279.anInt5161 = 0;
			Static10.aShortArray1 = Static25.aShortArray4;
			Static353.aShortArrayArray7 = Static201.aShortArrayArray5;
		} else {
			Static43.aShortArray20 = Static131.aShortArray65;
			Static10.aShortArray1 = Static78.aShortArray123;
			Static353.aShortArrayArray7 = Static25.aShortArrayArray2;
			Static186.aShortArrayArray6 = Static386.aShortArrayArray9;
		}
		Static174.aClass123_2 = Static18.method556(GameShell.canvas);
		Static226.aClass119_1 = Static31.method948(GameShell.canvas);
		Static337.aClass131_1 = Static63.method1702();
		if (Static337.aClass131_1 != null) {
			Static337.aClass131_1.method3691(GameShell.canvas);
		}
		Static367.anInt6878 = Static215.anInt3795;
		try {
			if (GameShell.signlink.aFileOnDisk_2 != null) {
				cacheData = new BufferedFile(GameShell.signlink.aFileOnDisk_2, 5200, 0);
				for (@Pc(171) int local171 = 0; local171 < 29; local171++) {
					cacheIndexes[local171] = new BufferedFile(GameShell.signlink.aFileOnDiskArray1[local171], 6000, 0);
				}
				Static150.aBufferedFile_2 = new BufferedFile(GameShell.signlink.aFileOnDisk_3, 6000, 0);
				masterCache = new Cache(255, cacheData, Static150.aBufferedFile_2, 500000);
				Static317.aBufferedFile_6 = new BufferedFile(GameShell.signlink.aFileOnDisk_1, 24, 0);
				GameShell.signlink.aFileOnDisk_1 = null;
				GameShell.signlink.aFileOnDisk_3 = null;
				GameShell.signlink.aFileOnDiskArray1 = null;
				GameShell.signlink.aFileOnDisk_2 = null;
			}
		} catch (@Pc(227) IOException local227) {
			Static150.aBufferedFile_2 = null;
			cacheData = null;
			Static317.aBufferedFile_6 = null;
			masterCache = null;
		}
		if (Static189.aClass127_6 != Static121.aClass127_4) {
			Static356.aBoolean456 = true;
		}
		Static290.aString56 = (GameType.GAME_TYPE_RUNESCAPE == game ? LocalisedText.RUNESCAPE_IS_LOADING : LocalisedText.ALTERNATE_GAME_IS_LOADING).getLocalisedText(language);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1411() {
		@Pc(6) int local6;
		if (!Static218.aClass177_Sub1_2.safeMode) {
			for (local6 = 0; local6 < Static6.anInt159; local6++) {
				if (Static156.aClass37Array1[local6].method1456() == 's' || Static156.aClass37Array1[local6].method1456() == 'S') {
					Static218.aClass177_Sub1_2.safeMode = true;
					break;
				}
			}
		}
		@Pc(55) int local55;
		if (mainLoadState == 0) {
			@Pc(45) Runtime runtime = Runtime.getRuntime();
			int usedMemory = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
			@Pc(60) long now = MonotonicClock.currentTimeMillis();
			if (Static5.firstGC == 0L) {
				Static5.firstGC = now;
			}
			if (usedMemory > 16384 && now - Static5.firstGC < 5000L) {
				if (now - Static29.previousGC > 1000L) {
					System.gc();
					Static29.previousGC = now;
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
				Static342.aJs5_77 = createJs5(true, 0, false);
				Static34.aJs5_67 = createJs5(true, 1, false);
				Static289.aJs5_71 = createJs5(true, 2, false);
				Static354.aJs5_9 = createJs5(true, 3, false);
				Static85.aJs5_21 = createJs5(true, 4, false);
				Static288.js5Archive5 = createJs5(true, 5, true);
				Static101.aJs5_23 = createJs5(false, 6, true);
				Static237.aJs5_63 = createJs5(true, 7, false);
				Static30.aJs5_5 = createJs5(true, 8, false);
				Static324.aJs5_86 = createJs5(true, 9, false);
				Static75.aJs5_18 = createJs5(true, 10, false);
				Static216.aJs5_58 = createJs5(true, 11, false);
				Static195.aJs5_54 = createJs5(true, 12, false);
				Static255.aJs5_64 = createJs5(true, 13, false);
				Static133.aJs5_32 = createJs5(false, 14, false);
				Static120.aJs5_28 = createJs5(true, 15, false);
				Static391.aJs5_96 = createJs5(true, 16, false);
				Static226.aJs5_61 = createJs5(true, 17, false);
				Static216.aJs5_57 = createJs5(true, 18, false);
				Static61.aJs5_12 = createJs5(true, 19, false);
				Static139.aJs5_35 = createJs5(true, 20, false);
				Static173.aJs5_45 = createJs5(true, 21, false);
				Static294.aJs5_75 = createJs5(true, 22, false);
				Static389.aJs5_66 = createJs5(true, 23, true);
				Static385.aJs5_94 = createJs5(true, 24, false);
				Static139.aJs5_34 = createJs5(true, 25, false);
				Static235.aJs5_47 = createJs5(true, 26, true);
				Static61.aJs5_11 = createJs5(true, 27, false);
				Static85.aJs5_20 = createJs5(true, 28, true);
				mainLoadSecondaryState = LocalisedText.CONNECTED_TO_UPDATE_SERVER.getLocalisedText(language);
				mainLoadState = 30;
				mainLoadPercentage = 15;
			} else {
				mainLoadSecondaryState = LocalisedText.CONNECTING_TO_UPDATE_SERVER.getLocalisedText(language);
				mainLoadPercentage = 12;
			}
		} else if (mainLoadState == 30) {
			local6 = 0;
			for (local55 = 0; local55 < 29; local55++) {
				local6 += js5Providers[local55].method896() * Static278.anIntArray362[local55] / 100;
			}
			if (local6 == 100) {
				mainLoadSecondaryState = LocalisedText.LOADED_UPDATE_LIST.getLocalisedText(language);
				mainLoadPercentage = 20;
				Static62.method2390(Static30.aJs5_5);
				Static44.method1359(Static30.aJs5_5);
				mainLoadState = 40;
			} else {
				if (local6 != 0) {
					mainLoadSecondaryState = LocalisedText.CHECKING_FOR_UPDATES.getLocalisedText(language) + local6 + "%";
				}
				mainLoadPercentage = 20;
			}
		} else if (mainLoadState == 40) {
			if (Static85.aJs5_20.method5072()) {
				this.method1406(Static85.aJs5_20.method5081(1));
				mainLoadSecondaryState = LocalisedText.LOADED_DEFAULTS.getLocalisedText(language);
				mainLoadPercentage = 25;
				mainLoadState = 50;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADING_DEFAULTS.getLocalisedText(language) + Static85.aJs5_20.method5090() + "%";
				mainLoadPercentage = 25;
			}
		} else if (mainLoadState == 50) {
			Static84.method1909(Static218.aClass177_Sub1_2.aBoolean352);
			Static385.aClass2_Sub12_Sub3_3 = new Class2_Sub12_Sub3();
			Static385.aClass2_Sub12_Sub3_3.method4295();
			musicChannel = Static381.method6346(0, GameShell.signlink, GameShell.canvas, 22050);
			musicChannel.method6329(Static385.aClass2_Sub12_Sub3_3);
			Static180.method3368(Static133.aJs5_32, Static120.aJs5_28, Static85.aJs5_21, Static385.aClass2_Sub12_Sub3_3);
			Static190.aAudioChannel_1 = Static381.method6346(1, GameShell.signlink, GameShell.canvas, 2048);
			Static227.aClass2_Sub12_Sub2_2 = new Class2_Sub12_Sub2();
			Static190.aAudioChannel_1.method6329(Static227.aClass2_Sub12_Sub2_2);
			Static300.aClass249_1 = new Class249(22050, Static356.anInt6643);
			Static97.anInt2049 = Static101.aJs5_23.getGroupID("scape main");
			mainLoadSecondaryState = LocalisedText.PREPARED_SOUND_ENGINE.getLocalisedText(language);
			mainLoadPercentage = 30;
			mainLoadState = 60;
		} else if (mainLoadState == 60) {
			local6 = Static64.method1707(Static255.aJs5_64, Static30.aJs5_5);
			local55 = Static218.method1090();
			if (local55 > local6) {
				mainLoadSecondaryState = LocalisedText.LOADING_CORE_FONTS.getLocalisedText(language) + local6 * 100 / local55 + "%";
				mainLoadPercentage = 35;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADED_CORE_FONTS.getLocalisedText(language);
				mainLoadState = 70;
				mainLoadPercentage = 35;
			}
		} else if (mainLoadState == 70) {
			local6 = Static333.method6332(Static30.aJs5_5);
			local55 = Static32.method991();
			if (local6 < local55) {
				mainLoadSecondaryState = LocalisedText.LOADING_TITLE_SCREEN.getLocalisedText(language) + local6 * 100 / local55 + "%";
				mainLoadPercentage = 40;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADED_TITLE_SCREEN.getLocalisedText(language);
				mainLoadState = 80;
				mainLoadPercentage = 40;
			}
		} else if (mainLoadState == 80) {
			if (Static235.aJs5_47.method5072()) {
				Static128.anInterface2_4 = new Class99(Static235.aJs5_47, Static324.aJs5_86, Static30.aJs5_5);
				mainLoadSecondaryState = LocalisedText.LOADED_TEXTURES.getLocalisedText(language);
				mainLoadPercentage = 45;
				mainLoadState = 90;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADING_TEXTURES.getLocalisedText(language) + Static235.aJs5_47.method5090() + "%";
				mainLoadPercentage = 45;
			}
		} else if (mainLoadState == 90) {
			mainLoadSecondaryState = LocalisedText.STARTING_3D_LIBRARY.getLocalisedText(language);
			mainLoadState = 95;
			mainLoadPercentage = 50;
		} else if (mainLoadState == 95) {
			if (Static218.aClass177_Sub1_2.safeMode) {
				Static218.aClass177_Sub1_2.anInt4894 = 1;
				Static218.aClass177_Sub1_2.anInt4878 = 0;
				Static218.aClass177_Sub1_2.anInt4885 = 0;
				Static218.aClass177_Sub1_2.anInt4883 = 0;
				Static218.aClass177_Sub1_2.anInt4891 = 0;
			}
			Static218.aClass177_Sub1_2.safeMode = true;
			Static218.aClass177_Sub1_2.write(GameShell.signlink);
			Static252.method4364(false, Static218.aClass177_Sub1_2.anInt4878);
			mainLoadSecondaryState = LocalisedText.STARTED_3D_LIBRARY.getLocalisedText(language);
			mainLoadPercentage = 55;
			mainLoadState = 100;
		} else if (mainLoadState == 100) {
			Static236.method4101(Static30.aJs5_5, Static255.aJs5_64, Static190.aClass19_8);
			mainLoadSecondaryState = LocalisedText.OPENED_TITLE_SCREEN.getLocalisedText(language);
			mainLoadPercentage = 60;
			Static336.method5704(5);
			mainLoadState = 110;
		} else if (mainLoadState == 110) {
			Static289.aJs5_71.method5072();
			local6 = Static289.aJs5_71.method5090();
			Static391.aJs5_96.method5072();
			local6 += Static391.aJs5_96.method5090();
			Static226.aJs5_61.method5072();
			local6 += Static226.aJs5_61.method5090();
			Static216.aJs5_57.method5072();
			local6 += Static216.aJs5_57.method5090();
			Static61.aJs5_12.method5072();
			local6 += Static61.aJs5_12.method5090();
			Static139.aJs5_35.method5072();
			local6 += Static139.aJs5_35.method5090();
			Static173.aJs5_45.method5072();
			local6 += Static173.aJs5_45.method5090();
			Static294.aJs5_75.method5072();
			local6 += Static294.aJs5_75.method5090();
			Static385.aJs5_94.method5072();
			local6 += Static385.aJs5_94.method5090();
			Static139.aJs5_34.method5072();
			local6 += Static139.aJs5_34.method5090();
			Static61.aJs5_11.method5072();
			local6 += Static61.aJs5_11.method5090();
			if (local6 < 1100) {
				mainLoadSecondaryState = LocalisedText.LOADING_CONFIG.getLocalisedText(language) + local6 / 11 + "%";
				mainLoadPercentage = 65;
			} else {
				Static363.aClass18_2 = new Class18(game, language, Static289.aJs5_71);
				Static59.aClass7_1 = new Class7(game, language, Static289.aJs5_71);
				Static221.aClass150_3 = new Class150(game, language, Static289.aJs5_71, Static30.aJs5_5);
				Static140.aClass109_1 = new Class109(game, language, Static226.aJs5_61);
				Static39.aClass72_3 = new Class72(game, language, Static289.aJs5_71);
				Static336.aClass241_5 = new Class241(game, language, Static289.aJs5_71);
				Static21.setIdentikit = new Class55(game, language, Static289.aJs5_71, Static237.aJs5_63);
				Static178.aClass51_3 = new Class51(game, language, Static289.aJs5_71);
				Static90.aClass190_3 = new Class190(game, language, Static289.aJs5_71);
				Static359.aClass202_4 = new Class202(game, language, true, Static391.aJs5_96, Static237.aJs5_63);
				Static236.aClass125_1 = new Class125(game, language, Static289.aJs5_71, Static30.aJs5_5);
				Static320.aClass104_2 = new Class104(game, language, Static289.aJs5_71, Static30.aJs5_5);
				Static6.aClass219_1 = new Class219(game, language, true, Static216.aJs5_57, Static237.aJs5_63);
				Static313.aClass107_2 = new Class107(game, language, true, Static363.aClass18_2, Static61.aJs5_12, Static237.aJs5_63);
				Static287.aClass233_1 = new Class233(game, language, Static289.aJs5_71);
				Static39.aClass85_1 = new Class85(game, language, Static139.aJs5_35, Static342.aJs5_77, Static34.aJs5_67);
				Static9.aClass213_1 = new Class213(game, language, Static289.aJs5_71);
				Static278.aClass160_1 = new Class160(game, language, Static289.aJs5_71);
				Static322.aClass211_2 = new Class211(game, language, Static173.aJs5_45, Static237.aJs5_63);
				Static367.aClass132_1 = new Class132(game, language, Static289.aJs5_71);
				Static183.aClass193_2 = new Class193(game, language, Static289.aJs5_71);
				Static162.aClass45_1 = new Class45(game, language, Static289.aJs5_71);
				Static322.aClass128_1 = new Class128(game, language, Static294.aJs5_75);
				Static56.aClass199_1 = new Class199(game, language, Static289.aJs5_71);
				Static126.method5701(Static255.aJs5_64, Static237.aJs5_63, Static354.aJs5_9, Static30.aJs5_5);
				Static325.method5543(new Class83(), Static385.aJs5_94, Static139.aJs5_34);
				Static117.method2366(Static385.aJs5_94, Static139.aJs5_34);
				mainLoadSecondaryState = LocalisedText.LOADED_CONFIG.getLocalisedText(language);
				mainLoadPercentage = 65;
				Static156.method2798();
				Static359.aClass202_4.method5159(!Static218.aClass177_Sub1_2.method4494(Static77.anInt1762));
				Static214.aClass226_1 = new Class226();
				Static174.method1506();
				Static382.method6361(Static61.aJs5_11);
				Static292.method5036(Static128.anInterface2_4, Static237.aJs5_63);
				mainLoadState = 120;
			}
		} else if (mainLoadState == 120) {
			local6 = Static134.method2509(Static30.aJs5_5);
			local55 = Static254.method4374();
			if (local55 > local6) {
				mainLoadSecondaryState = LocalisedText.LOADING_SPRITES.getLocalisedText(language) + local6 * 100 / local55 + "%";
				mainLoadPercentage = 70;
			} else {
				Static44.method1358(Static190.aClass19_8, Static30.aJs5_5);
				Static144.method2691(Static124.aClass13Array27);
				mainLoadSecondaryState = LocalisedText.LOADED_SPRITES.getLocalisedText(language);
				mainLoadState = 130;
				mainLoadPercentage = 70;
			}
		} else if (mainLoadState == 130) {
			if (Static75.aJs5_18.method5097("huffman", "")) {
				@Pc(1242) Class140 local1242 = new Class140(Static75.aJs5_18.method5083("huffman", ""));
				Static334.method5686(local1242);
				mainLoadSecondaryState = LocalisedText.LOADED_WORDPACK.getLocalisedText(language);
				mainLoadState = 140;
				mainLoadPercentage = 75;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADING_WORDPACK.getLocalisedText(language) + "0%";
				mainLoadPercentage = 75;
			}
		} else if (mainLoadState == 140) {
			if (Static354.aJs5_9.method5072()) {
				mainLoadSecondaryState = LocalisedText.LOADED_INTERFACES.getLocalisedText(language);
				mainLoadState = 150;
				mainLoadPercentage = 80;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADING_INTERFACES.getLocalisedText(language) + Static354.aJs5_9.method5090() + "%";
				mainLoadPercentage = 80;
			}
		} else if (mainLoadState == 150) {
			if (Static195.aJs5_54.method5072()) {
				mainLoadSecondaryState = LocalisedText.LOADED_INTERFACE_SCRIPTS.getLocalisedText(language);
				mainLoadPercentage = 82;
				mainLoadState = 160;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADING_INTERFACE_SCRIPTS.getLocalisedText(language) + Static195.aJs5_54.method5090() + "%";
				mainLoadPercentage = 82;
			}
		} else if (mainLoadState == 160) {
			if (Static255.aJs5_64.method5072()) {
				mainLoadSecondaryState = LocalisedText.LOADING_ADDITIONAL_FONTS.getLocalisedText(language);
				mainLoadPercentage = 85;
				mainLoadState = 170;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADING_ADDITIONAL_FONTS.getLocalisedText(language) + Static255.aJs5_64.method5090() + "%";
				mainLoadPercentage = 85;
			}
		} else if (mainLoadState == 170) {
			if (Static389.aJs5_66.isGroupReady("details")) {
				Static344.method5511(Static389.aJs5_66, Static39.aClass72_3, Static336.aClass241_5, Static359.aClass202_4, Static236.aClass125_1, Static320.aClass104_2, Static214.aClass226_1);
				mainLoadSecondaryState = LocalisedText.LOADED_WORLD_MAP.getLocalisedText(language);
				mainLoadState = 180;
				mainLoadPercentage = 89;
			} else {
				mainLoadSecondaryState = LocalisedText.LOADING_WORLD_MAP.getLocalisedText(language) + Static389.aJs5_66.method5084("details") + "%";
				mainLoadPercentage = 87;
			}
		} else if (mainLoadState == 180) {
			local6 = Static319.method5429();
			if (local6 == -1) {
				mainLoadSecondaryState = LocalisedText.LOADING_WORLD_LIST_DATA.getLocalisedText(language);
				mainLoadPercentage = 90;
			} else if (local6 == 7 || local6 == 9) {
				this.error("worldlistfull");
				Static336.method5704(1000);
			} else if (Static70.aBoolean130) {
				mainLoadSecondaryState = LocalisedText.LOADED_WORLD_LIST_DATA.getLocalisedText(language);
				mainLoadPercentage = 90;
				mainLoadState = 190;
			} else {
				this.error("worldlistio_" + local6);
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
			Static391.anInt7216 = Static354.aJs5_9.getGroupID("loginscreen");
			Static288.js5Archive5.method5069(false);
			Static101.aJs5_23.method5069(true);
			Static30.aJs5_5.method5069(true);
			Static255.aJs5_64.method5069(true);
			Static75.aJs5_18.method5069(true);
			Static354.aJs5_9.method5069(true);
			clean = true;
			Static289.aJs5_71.discardUnpacked = 2;
			Static226.aJs5_61.discardUnpacked = 2;
			Static391.aJs5_96.discardUnpacked = 2;
			Static216.aJs5_57.discardUnpacked = 2;
			Static61.aJs5_12.discardUnpacked = 2;
			Static139.aJs5_35.discardUnpacked = 2;
			Static173.aJs5_45.discardUnpacked = 2;
			Static143.method2677(-1, Static218.aClass177_Sub1_2.anInt4894, false, -1);
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
		if (Static337.aClass131_1 != null) {
			Static337.aClass131_1.method3690(GameShell.canvas);
		}
		Static337.aClass131_1 = null;
		if (musicChannel != null) {
			musicChannel.method6325();
		}
		if (Static190.aAudioChannel_1 != null) {
			Static190.aAudioChannel_1.method6325();
		}
		js5NetQueue.method4644();
		js5CacheQueue.method5227();
		if (Static4.aClass162_1 != null) {
			Static4.aClass162_1.method4114();
			Static4.aClass162_1 = null;
		}
	}
}
