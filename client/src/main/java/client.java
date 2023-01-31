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

	@OriginalMember(owner = "client!vo", name = "F", descriptor = "J")
	public static long js5ConnectTime;
	@OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
	public static int js5ConnectState = 0;
	@OriginalMember(owner = "client!fr", name = "e", descriptor = "Lclient!iu;")
	public static BufferedSocket js5Socket;
	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!cc;")
	public static PrivelegedRequest js5SocketRequest;
	@OriginalMember(owner = "client!ql", name = "z", descriptor = "Lclient!pp;")
	public static Class183 js5NetQueue;
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
	public static Class50 game = null;
	@OriginalMember(owner = "client!r", name = "M", descriptor = "I")
	public static int language = 0;
	@OriginalMember(owner = "client!lq", name = "I", descriptor = "Lclient!rt;")
	public static Class209 modeWhat;
	@OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
	public static int worldListWorldID = 1;
	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/lang/String;")
	public static String settings = null;
	@OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
	public static int worldID = -1;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				printUsage("argument count");
			}
			worldListWorldID = Integer.parseInt(arg0[0]);
			Static121.aClass127_4 = Static231.aClass127_7;
			if (arg0[1].equals("live")) {
				modeWhat = Static232.aClass209_3;
			} else if (arg0[1].equals("rc")) {
				modeWhat = Static175.aClass209_1;
			} else if (arg0[1].equals("wip")) {
				modeWhat = Static359.aClass209_4;
			} else {
				printUsage("modewhat");
			}
			language = Static25.method860(arg0[2]);
			if (language == -1) {
				if (arg0[2].equals("english")) {
					language = 0;
				} else if (arg0[2].equals("german")) {
					language = 1;
				} else {
					printUsage("language");
				}
			}
			Static237.aBoolean298 = false;
			Static276.aBoolean375 = false;
			if (arg0[3].equals("game0")) {
				game = Static249.aClass50_3;
			} else if (arg0[3].equals("game1")) {
				game = Static106.aClass50_1;
			} else {
				printUsage("game");
			}
			Static320.anInt6007 = 0;
			Static31.aBoolean68 = true;
			Static381.aBoolean482 = true;
			settings = "";
			Static165.anInt3149 = 0;
			Static64.anInt1555 = game.anInt1553;
			@Pc(131) client client = new client();
			Static144.instance = client;
			client.startApplication(game.aString15, modeWhat.method5281() + 32);
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
	protected void method1385() {
		if (Static347.anInt6442 == 1000) {
			return;
		}
		@Pc(18) long local18 = Static307.method5256() / 1000000L - Static154.aLong89;
		Static154.aLong89 = Static307.method5256() / 1000000L;
		@Pc(31) boolean local31 = Static196.method3309();
		if (local31 && Static393.aBoolean486 && Static303.aClass221_2 != null) {
			Static303.aClass221_2.method6316();
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
		if (Static363.aFrame2 == null) {
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
		if (Static363.aFrame2 != null && !Static242.aBoolean306 && (Static347.anInt6442 == 30 || Static347.anInt6442 == 10)) {
			Static143.method2677(-1, Static218.aClass177_Sub1_2.anInt4894, false, -1);
		}
		@Pc(169) boolean local169 = false;
		if (Static328.aBoolean412) {
			Static328.aBoolean412 = false;
			local169 = true;
		}
		if (local169) {
			Static372.method6259();
		}
		if (Static190.aClass19_8 != null && Static190.aClass19_8.method2812() || Static144.method2692() != 1) {
			Static98.method2107();
		}
		if (Static347.anInt6442 == 0) {
			Static172.method3289(Static291.aColorArray4[Static64.anInt1555], local169, Static141.anInt2650, Static56.aString13, Static286.aColorArray3[Static64.anInt1555], Static174.aColorArray2[Static64.anInt1555]);
		} else if (Static347.anInt6442 == 5) {
			Static193.method3511(Static286.aColorArray3[Static64.anInt1555].getRGB(), Static190.aClass19_8, Static52.aClass130_1, Static190.aClass19_8.method2812() | local169, Static291.aColorArray4[Static64.anInt1555].getRGB(), Static174.aColorArray2[Static64.anInt1555].getRGB());
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
		if ((Static347.anInt6442 == 30 || Static347.anInt6442 == 10) && Static154.anInt2807 == 0 && Static144.method2692() == 1 && !local169 && Static215.aString34.equals("1.1")) {
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
		if (Static352.aBoolean446) {
			Static2.method29();
		}
		if (Static218.aClass177_Sub1_2.aBoolean362 && Static347.anInt6442 == 10 && Static139.anInt2595 != -1) {
			Static218.aClass177_Sub1_2.aBoolean362 = false;
			Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
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
		if (Static359.aClass209_4 != modeWhat && Static175.aClass209_1 != modeWhat && Static232.aClass209_3 != modeWhat) {
			modeWhat = Static232.aClass209_3;
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
			game = Static106.aClass50_1;
		} else {
			game = Static249.aClass50_3;
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
		Static144.instance = this;
		if (game == Static249.aClass50_3) {
			Static263.anInt4834 = 503;
			Static254.anInt4701 = 765;
		} else if (game == Static106.aClass50_1) {
			Static263.anInt4834 = 480;
			Static254.anInt4701 = 640;
		}
		this.method1394(Static254.anInt4701, modeWhat.method5281() + 32, Static263.anInt4834);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1384() {
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
		if (Static54.aClass154_1 != null) {
			Static54.aClass154_1.method3876();
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
				Static277.A_LINKED_LIST___31.method3539(local163);
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
	protected void method1389() {
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
				js5Socket.write(buffer.data, 5);
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
							@Pc(179) int local179 = Static141.method2654(true, Static52.anIntArray99, local50, -1, 0, 0, Static171.aClass46Array1[local33.aByte78], local33.anIntArray316[0], local50, local96, Static59.anIntArray105, local50, local128, local33.anIntArray317[0]);
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
										local311 = Static6.method140(local303.layer);
									} while (local311 == null || local311.aComponentArray2 == null || local303.createdComponentID >= local311.aComponentArray2.length || local303 != local311.aComponentArray2[local303.createdComponentID]);
									ScriptRunner.method3590(local298);
								}
							}
							local303 = local298.aComponent_3;
							if (local303.createdComponentID < 0) {
								break;
							}
							local311 = Static6.method140(local303.layer);
						} while (local311 == null || local311.aComponentArray2 == null || local303.createdComponentID >= local311.aComponentArray2.length || local311.aComponentArray2[local303.createdComponentID] != local303);
						ScriptRunner.method3590(local298);
					}
				}
				local303 = local298.aComponent_3;
				if (local303.createdComponentID < 0) {
					break;
				}
				local311 = Static6.method140(local303.layer);
			} while (local311 == null || local311.aComponentArray2 == null || local303.createdComponentID >= local311.aComponentArray2.length || local311.aComponentArray2[local303.createdComponentID] != local303);
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
		Static1.aJs5CacheQueue_1 = new Js5CacheQueue(GameShell.signlink);
		js5NetQueue = new Class183();
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
		if (game == Static106.aClass50_1) {
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
			if (GameShell.signlink.aClass204_2 != null) {
				Static110.aBufferedFile_1 = new BufferedFile(GameShell.signlink.aClass204_2, 5200, 0);
				for (@Pc(171) int local171 = 0; local171 < 29; local171++) {
					Static185.A_BUFFERED_FILE_ARRAY_1[local171] = new BufferedFile(GameShell.signlink.aClass204Array1[local171], 6000, 0);
				}
				Static150.aBufferedFile_2 = new BufferedFile(GameShell.signlink.aClass204_3, 6000, 0);
				Static18.aCache_1 = new Cache(255, Static110.aBufferedFile_1, Static150.aBufferedFile_2, 500000);
				Static317.aBufferedFile_6 = new BufferedFile(GameShell.signlink.aClass204_1, 24, 0);
				GameShell.signlink.aClass204_1 = null;
				GameShell.signlink.aClass204_3 = null;
				GameShell.signlink.aClass204Array1 = null;
				GameShell.signlink.aClass204_2 = null;
			}
		} catch (@Pc(227) IOException local227) {
			Static150.aBufferedFile_2 = null;
			Static110.aBufferedFile_1 = null;
			Static317.aBufferedFile_6 = null;
			Static18.aCache_1 = null;
		}
		if (Static189.aClass127_6 != Static121.aClass127_4) {
			Static356.aBoolean456 = true;
		}
		Static290.aString56 = (Static249.aClass50_3 == game ? LocalisedText.RUNESCAPE_IS_LOADING : LocalisedText.ALTERNATE_GAME_IS_LOADING).getLocalisedText(language);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1411() {
		@Pc(6) int local6;
		if (!Static218.aClass177_Sub1_2.aBoolean362) {
			for (local6 = 0; local6 < Static6.anInt159; local6++) {
				if (Static156.aClass37Array1[local6].method1456() == 's' || Static156.aClass37Array1[local6].method1456() == 'S') {
					Static218.aClass177_Sub1_2.aBoolean362 = true;
					break;
				}
			}
		}
		@Pc(55) int local55;
		if (Static309.anInt5801 == 0) {
			@Pc(45) Runtime local45 = Runtime.getRuntime();
			local55 = (int) ((local45.totalMemory() - local45.freeMemory()) / 1024L);
			@Pc(60) long local60 = MonotonicClock.currentTimeMillis();
			if (Static5.aLong11 == 0L) {
				Static5.aLong11 = local60;
			}
			if (local55 > 16384 && local60 - Static5.aLong11 < 5000L) {
				if (local60 - Static29.aLong22 > 1000L) {
					System.gc();
					Static29.aLong22 = local60;
				}
				Static56.aString13 = LocalisedText.ALLOCATING_MEMORY.getLocalisedText(language);
				Static141.anInt2650 = 5;
			} else {
				Static56.aString13 = LocalisedText.ALLOCATED_MEMORY.getLocalisedText(language);
				Static141.anInt2650 = 5;
				Static309.anInt5801 = 10;
			}
		} else if (Static309.anInt5801 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static171.aClass46Array1[local6] = Static24.method853(Static242.anInt4449, Static373.anInt7033);
			}
			Static56.aString13 = LocalisedText.CREATED_GAMEWORLD.getLocalisedText(language);
			Static309.anInt5801 = 20;
			Static141.anInt2650 = 10;
		} else if (Static309.anInt5801 == 20) {
			if (Static54.aClass154_1 == null) {
				Static54.aClass154_1 = new Class154(js5NetQueue, Static1.aJs5CacheQueue_1);
			}
			if (Static54.aClass154_1.method3871()) {
				Static342.aJs5_77 = Static163.method3100(true, 0, false);
				Static34.aJs5_67 = Static163.method3100(true, 1, false);
				Static289.aJs5_71 = Static163.method3100(true, 2, false);
				Static354.aJs5_9 = Static163.method3100(true, 3, false);
				Static85.aJs5_21 = Static163.method3100(true, 4, false);
				Static288.js5Archive5 = Static163.method3100(true, 5, true);
				Static101.aJs5_23 = Static163.method3100(false, 6, true);
				Static237.aJs5_63 = Static163.method3100(true, 7, false);
				Static30.aJs5_5 = Static163.method3100(true, 8, false);
				Static324.aJs5_86 = Static163.method3100(true, 9, false);
				Static75.aJs5_18 = Static163.method3100(true, 10, false);
				Static216.aJs5_58 = Static163.method3100(true, 11, false);
				Static195.aJs5_54 = Static163.method3100(true, 12, false);
				Static255.aJs5_64 = Static163.method3100(true, 13, false);
				Static133.aJs5_32 = Static163.method3100(false, 14, false);
				Static120.aJs5_28 = Static163.method3100(true, 15, false);
				Static391.aJs5_96 = Static163.method3100(true, 16, false);
				Static226.aJs5_61 = Static163.method3100(true, 17, false);
				Static216.aJs5_57 = Static163.method3100(true, 18, false);
				Static61.aJs5_12 = Static163.method3100(true, 19, false);
				Static139.aJs5_35 = Static163.method3100(true, 20, false);
				Static173.aJs5_45 = Static163.method3100(true, 21, false);
				Static294.aJs5_75 = Static163.method3100(true, 22, false);
				Static389.aJs5_66 = Static163.method3100(true, 23, true);
				Static385.aJs5_94 = Static163.method3100(true, 24, false);
				Static139.aJs5_34 = Static163.method3100(true, 25, false);
				Static235.aJs5_47 = Static163.method3100(true, 26, true);
				Static61.aJs5_11 = Static163.method3100(true, 27, false);
				Static85.aJs5_20 = Static163.method3100(true, 28, true);
				Static56.aString13 = LocalisedText.CONNECTED_TO_UPDATE_SERVER.getLocalisedText(language);
				Static309.anInt5801 = 30;
				Static141.anInt2650 = 15;
			} else {
				Static56.aString13 = LocalisedText.CONNECTING_TO_UPDATE_SERVER.getLocalisedText(language);
				Static141.anInt2650 = 12;
			}
		} else if (Static309.anInt5801 == 30) {
			local6 = 0;
			for (local55 = 0; local55 < 29; local55++) {
				local6 += Static374.aClass25_Sub1Array2[local55].method896() * Static278.anIntArray362[local55] / 100;
			}
			if (local6 == 100) {
				Static56.aString13 = LocalisedText.LOADED_UPDATE_LIST.getLocalisedText(language);
				Static141.anInt2650 = 20;
				Static62.method2390(Static30.aJs5_5);
				Static44.method1359(Static30.aJs5_5);
				Static309.anInt5801 = 40;
			} else {
				if (local6 != 0) {
					Static56.aString13 = LocalisedText.CHECKING_FOR_UPDATES.getLocalisedText(language) + local6 + "%";
				}
				Static141.anInt2650 = 20;
			}
		} else if (Static309.anInt5801 == 40) {
			if (Static85.aJs5_20.method5072()) {
				this.method1406(Static85.aJs5_20.method5081(1));
				Static56.aString13 = LocalisedText.LOADED_DEFAULTS.getLocalisedText(language);
				Static141.anInt2650 = 25;
				Static309.anInt5801 = 50;
			} else {
				Static56.aString13 = LocalisedText.LOADING_DEFAULTS.getLocalisedText(language) + Static85.aJs5_20.method5090() + "%";
				Static141.anInt2650 = 25;
			}
		} else if (Static309.anInt5801 == 50) {
			Static84.method1909(Static218.aClass177_Sub1_2.aBoolean352);
			Static385.aClass2_Sub12_Sub3_3 = new Class2_Sub12_Sub3();
			Static385.aClass2_Sub12_Sub3_3.method4295();
			Static303.aClass221_2 = Static381.method6346(0, GameShell.signlink, GameShell.canvas, 22050);
			Static303.aClass221_2.method6329(Static385.aClass2_Sub12_Sub3_3);
			Static180.method3368(Static133.aJs5_32, Static120.aJs5_28, Static85.aJs5_21, Static385.aClass2_Sub12_Sub3_3);
			Static190.aClass221_1 = Static381.method6346(1, GameShell.signlink, GameShell.canvas, 2048);
			Static227.aClass2_Sub12_Sub2_2 = new Class2_Sub12_Sub2();
			Static190.aClass221_1.method6329(Static227.aClass2_Sub12_Sub2_2);
			Static300.aClass249_1 = new Class249(22050, Static356.anInt6643);
			Static97.anInt2049 = Static101.aJs5_23.getGroupID("scape main");
			Static56.aString13 = LocalisedText.PREPARED_SOUND_ENGINE.getLocalisedText(language);
			Static141.anInt2650 = 30;
			Static309.anInt5801 = 60;
		} else if (Static309.anInt5801 == 60) {
			local6 = Static64.method1707(Static255.aJs5_64, Static30.aJs5_5);
			local55 = Static218.method1090();
			if (local55 > local6) {
				Static56.aString13 = LocalisedText.LOADING_CORE_FONTS.getLocalisedText(language) + local6 * 100 / local55 + "%";
				Static141.anInt2650 = 35;
			} else {
				Static56.aString13 = LocalisedText.LOADED_CORE_FONTS.getLocalisedText(language);
				Static309.anInt5801 = 70;
				Static141.anInt2650 = 35;
			}
		} else if (Static309.anInt5801 == 70) {
			local6 = Static333.method6332(Static30.aJs5_5);
			local55 = Static32.method991();
			if (local6 < local55) {
				Static56.aString13 = LocalisedText.LOADING_TITLE_SCREEN.getLocalisedText(language) + local6 * 100 / local55 + "%";
				Static141.anInt2650 = 40;
			} else {
				Static56.aString13 = LocalisedText.LOADED_TITLE_SCREEN.getLocalisedText(language);
				Static309.anInt5801 = 80;
				Static141.anInt2650 = 40;
			}
		} else if (Static309.anInt5801 == 80) {
			if (Static235.aJs5_47.method5072()) {
				Static128.anInterface2_4 = new Class99(Static235.aJs5_47, Static324.aJs5_86, Static30.aJs5_5);
				Static56.aString13 = LocalisedText.LOADED_TEXTURES.getLocalisedText(language);
				Static141.anInt2650 = 45;
				Static309.anInt5801 = 90;
			} else {
				Static56.aString13 = LocalisedText.LOADING_TEXTURES.getLocalisedText(language) + Static235.aJs5_47.method5090() + "%";
				Static141.anInt2650 = 45;
			}
		} else if (Static309.anInt5801 == 90) {
			Static56.aString13 = LocalisedText.STARTING_3D_LIBRARY.getLocalisedText(language);
			Static309.anInt5801 = 95;
			Static141.anInt2650 = 50;
		} else if (Static309.anInt5801 == 95) {
			if (Static218.aClass177_Sub1_2.aBoolean362) {
				Static218.aClass177_Sub1_2.anInt4894 = 1;
				Static218.aClass177_Sub1_2.anInt4878 = 0;
				Static218.aClass177_Sub1_2.anInt4885 = 0;
				Static218.aClass177_Sub1_2.anInt4883 = 0;
				Static218.aClass177_Sub1_2.anInt4891 = 0;
			}
			Static218.aClass177_Sub1_2.aBoolean362 = true;
			Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
			Static252.method4364(false, Static218.aClass177_Sub1_2.anInt4878);
			Static56.aString13 = LocalisedText.STARTED_3D_LIBRARY.getLocalisedText(language);
			Static141.anInt2650 = 55;
			Static309.anInt5801 = 100;
		} else if (Static309.anInt5801 == 100) {
			Static236.method4101(Static30.aJs5_5, Static255.aJs5_64, Static190.aClass19_8);
			Static56.aString13 = LocalisedText.OPENED_TITLE_SCREEN.getLocalisedText(language);
			Static141.anInt2650 = 60;
			Static336.method5704(5);
			Static309.anInt5801 = 110;
		} else if (Static309.anInt5801 == 110) {
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
				Static56.aString13 = LocalisedText.LOADING_CONFIG.getLocalisedText(language) + local6 / 11 + "%";
				Static141.anInt2650 = 65;
			} else {
				Static363.aClass18_2 = new Class18(game, language, Static289.aJs5_71);
				Static59.aClass7_1 = new Class7(game, language, Static289.aJs5_71);
				Static221.aClass150_3 = new Class150(game, language, Static289.aJs5_71, Static30.aJs5_5);
				Static140.aClass109_1 = new Class109(game, language, Static226.aJs5_61);
				Static39.aClass72_3 = new Class72(game, language, Static289.aJs5_71);
				Static336.aClass241_5 = new Class241(game, language, Static289.aJs5_71);
				Static21.aClass55_1 = new Class55(game, language, Static289.aJs5_71, Static237.aJs5_63);
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
				Static56.aString13 = LocalisedText.LOADED_CONFIG.getLocalisedText(language);
				Static141.anInt2650 = 65;
				Static156.method2798();
				Static359.aClass202_4.method5159(!Static218.aClass177_Sub1_2.method4494(Static77.anInt1762));
				Static214.aClass226_1 = new Class226();
				Static174.method1506();
				Static382.method6361(Static61.aJs5_11);
				Static292.method5036(Static128.anInterface2_4, Static237.aJs5_63);
				Static309.anInt5801 = 120;
			}
		} else if (Static309.anInt5801 == 120) {
			local6 = Static134.method2509(Static30.aJs5_5);
			local55 = Static254.method4374();
			if (local55 > local6) {
				Static56.aString13 = LocalisedText.LOADING_SPRITES.getLocalisedText(language) + local6 * 100 / local55 + "%";
				Static141.anInt2650 = 70;
			} else {
				Static44.method1358(Static190.aClass19_8, Static30.aJs5_5);
				Static144.method2691(Static124.aClass13Array27);
				Static56.aString13 = LocalisedText.LOADED_SPRITES.getLocalisedText(language);
				Static309.anInt5801 = 130;
				Static141.anInt2650 = 70;
			}
		} else if (Static309.anInt5801 == 130) {
			if (Static75.aJs5_18.method5097("huffman", "")) {
				@Pc(1242) Class140 local1242 = new Class140(Static75.aJs5_18.method5083("huffman", ""));
				Static334.method5686(local1242);
				Static56.aString13 = LocalisedText.LOADED_WORDPACK.getLocalisedText(language);
				Static309.anInt5801 = 140;
				Static141.anInt2650 = 75;
			} else {
				Static56.aString13 = LocalisedText.LOADING_WORDPACK.getLocalisedText(language) + "0%";
				Static141.anInt2650 = 75;
			}
		} else if (Static309.anInt5801 == 140) {
			if (Static354.aJs5_9.method5072()) {
				Static56.aString13 = LocalisedText.LOADED_INTERFACES.getLocalisedText(language);
				Static309.anInt5801 = 150;
				Static141.anInt2650 = 80;
			} else {
				Static56.aString13 = LocalisedText.LOADING_INTERFACES.getLocalisedText(language) + Static354.aJs5_9.method5090() + "%";
				Static141.anInt2650 = 80;
			}
		} else if (Static309.anInt5801 == 150) {
			if (Static195.aJs5_54.method5072()) {
				Static56.aString13 = LocalisedText.LOADED_INTERFACE_SCRIPTS.getLocalisedText(language);
				Static141.anInt2650 = 82;
				Static309.anInt5801 = 160;
			} else {
				Static56.aString13 = LocalisedText.LOADING_INTERFACE_SCRIPTS.getLocalisedText(language) + Static195.aJs5_54.method5090() + "%";
				Static141.anInt2650 = 82;
			}
		} else if (Static309.anInt5801 == 160) {
			if (Static255.aJs5_64.method5072()) {
				Static56.aString13 = LocalisedText.LOADING_ADDITIONAL_FONTS.getLocalisedText(language);
				Static141.anInt2650 = 85;
				Static309.anInt5801 = 170;
			} else {
				Static56.aString13 = LocalisedText.LOADING_ADDITIONAL_FONTS.getLocalisedText(language) + Static255.aJs5_64.method5090() + "%";
				Static141.anInt2650 = 85;
			}
		} else if (Static309.anInt5801 == 170) {
			if (Static389.aJs5_66.isGroupReady("details")) {
				Static344.method5511(Static389.aJs5_66, Static39.aClass72_3, Static336.aClass241_5, Static359.aClass202_4, Static236.aClass125_1, Static320.aClass104_2, Static214.aClass226_1);
				Static56.aString13 = LocalisedText.LOADED_WORLD_MAP.getLocalisedText(language);
				Static309.anInt5801 = 180;
				Static141.anInt2650 = 89;
			} else {
				Static56.aString13 = LocalisedText.LOADING_WORLD_MAP.getLocalisedText(language) + Static389.aJs5_66.method5084("details") + "%";
				Static141.anInt2650 = 87;
			}
		} else if (Static309.anInt5801 == 180) {
			local6 = Static319.method5429();
			if (local6 == -1) {
				Static56.aString13 = LocalisedText.LOADING_WORLD_LIST_DATA.getLocalisedText(language);
				Static141.anInt2650 = 90;
			} else if (local6 == 7 || local6 == 9) {
				this.error("worldlistfull");
				Static336.method5704(1000);
			} else if (Static70.aBoolean130) {
				Static56.aString13 = LocalisedText.LOADED_WORLD_LIST_DATA.getLocalisedText(language);
				Static141.anInt2650 = 90;
				Static309.anInt5801 = 190;
			} else {
				this.error("worldlistio_" + local6);
				Static336.method5704(1000);
			}
		} else if (Static309.anInt5801 == 190) {
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
			Static352.aBoolean446 = true;
			Static289.aJs5_71.discardUnpacked = 2;
			Static226.aJs5_61.discardUnpacked = 2;
			Static391.aJs5_96.discardUnpacked = 2;
			Static216.aJs5_57.discardUnpacked = 2;
			Static61.aJs5_12.discardUnpacked = 2;
			Static139.aJs5_35.discardUnpacked = 2;
			Static173.aJs5_45.discardUnpacked = 2;
			Static143.method2677(-1, Static218.aClass177_Sub1_2.anInt4894, false, -1);
			Static56.aString13 = LocalisedText.LOADED_CLIENT_VARIABLE_DATA.getLocalisedText(language);
			Static309.anInt5801 = 200;
			Static141.anInt2650 = 95;
		} else if (Static309.anInt5801 == 200) {
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
	protected void method1386() {
		if (Static273.aBoolean374) {
			Static340.method5764();
		}
		if (Static190.aClass19_8 != null) {
			Static190.aClass19_8.method2825();
		}
		if (Static363.aFrame2 != null) {
			Static17.method4214(Static363.aFrame2, GameShell.signlink);
			Static363.aFrame2 = null;
		}
		if (Static335.socket != null) {
			Static335.socket.close();
			Static335.socket = null;
		}
		if (Static337.aClass131_1 != null) {
			Static337.aClass131_1.method3690(GameShell.canvas);
		}
		Static337.aClass131_1 = null;
		if (Static303.aClass221_2 != null) {
			Static303.aClass221_2.method6325();
		}
		if (Static190.aClass221_1 != null) {
			Static190.aClass221_1.method6325();
		}
		js5NetQueue.method4644();
		Static1.aJs5CacheQueue_1.method5227();
		if (Static4.aClass162_1 != null) {
			Static4.aClass162_1.method4114();
			Static4.aClass162_1 = null;
		}
	}
}
