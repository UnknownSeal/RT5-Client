import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!fm", name = "V", descriptor = "I")
	public static int anInt2095;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)Lclient!gq;")
	public static Class11_Sub1 method2143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Static330.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub1_2;
	}

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "(I)V")
	public static void logout() {
		if (Static335.socket != null) {
			Static335.socket.close();
			Static335.socket = null;
		}
		Static211.method3720();
		Static253.method4365();
		for (@Pc(17) int i = 0; i < 4; i++) {
			Static171.collisionMap[i].clear();
		}
		Static241.method4191(false);
		System.gc();
		Static174.method1507();
		Static393.jingle = false;
		Static171.groupID = -1;
		Static239.method4151(true);
		Static164.originX = 0;
		Static9.anInt212 = 0;
		Static220.aBoolean252 = false;
		Static105.anInt2187 = 0;
		Static148.originZ = 0;
		for (@Pc(56) int local56 = 0; local56 < Static50.HINT_ARROWS.length; local56++) {
			Static50.HINT_ARROWS[local56] = null;
		}
		Static358.method5887();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static12.aClass11_Sub5_Sub2_Sub1Array1[local75] = null;
		}
		Static166.size = 0;
		for (@Pc(91) int local91 = 0; local91 < 32768; local91++) {
			Static365.npcs[local91] = null;
		}
		Static120.aClass4_49.clear();
		Static117.method2369();
		Static292.anInt5510 = 0;
		Static214.aClass226_1.method5780();
		Static114.method2362();
		Static360.method5645();
		Static50.method1525(true);
		try {
			BrowserControl.call(GameShell.signlink.applet, "loggedout");
		} catch (@Pc(128) Throwable local128) {
		}
		Static375.aLong222 = 0L;
		Static385.aClass2_Sub16_2 = null;
	}

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "(I)V")
	public static void method2146() {
		Static65.aClass19_3.method2838(((float) Static218.preferences.brightness * 0.1F + 0.7F) * 1.1523438F);
		Static65.aClass19_3.method2832(Static28.anInt686, 0.69921875F, 1.2F, -50.0F, (float) -60, -50.0F);
		Static65.aClass19_3.method2879(Static279.anInt5161, -1);
		Static65.aClass19_3.method2870(Static62.aClass42_5);
	}
}
