import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
	public static int anInt7153 = 0;

	@OriginalMember(owner = "client!wf", name = "D", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_9 = new Class16("", 15);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void setSettings(@OriginalArg(0) String settings) {
		client.settings = settings;
		if (GameShell.signlink.applet == null) {
			return;
		}
		try {
			@Pc(20) String cookiePrefix = GameShell.signlink.applet.getParameter("cookieprefix");
			@Pc(25) String cookieHost = GameShell.signlink.applet.getParameter("cookiehost");
			@Pc(40) String cookie = cookiePrefix + "settings=" + settings + "; version=1; path=/; domain=" + cookieHost;
			if (settings.length() == 0) {
				cookie = cookie + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				cookie = cookie + "; Expires=" + Static15.method393(MonotonicClock.currentTimeMillis() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			BrowserControl.eval(GameShell.signlink.applet, "document.cookie=\"" + cookie + "\"");
		} catch (@Pc(89) Throwable exception) {
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static25.method861(Static365.anInt6832, arg2, Static161.anInt2954);
		@Pc(17) int local17 = Static25.method861(Static365.anInt6832, arg5, Static161.anInt2954);
		@Pc(23) int local23 = Static25.method861(Static28.anInt675, arg4, Static82.anInt1837);
		@Pc(29) int local29 = Static25.method861(Static28.anInt675, arg0, Static82.anInt1837);
		@Pc(38) int local38 = Static25.method861(Static365.anInt6832, arg2 + arg3, Static161.anInt2954);
		@Pc(46) int local46 = Static25.method861(Static365.anInt6832, arg5 - arg3, Static161.anInt2954);
		for (@Pc(48) int local48 = local11; local48 < local38; local48++) {
			Static101.method2163(local29, Static357.anIntArrayArray58[local48], arg1, local23);
		}
		for (@Pc(72) int local72 = local17; local72 > local46; local72--) {
			Static101.method2163(local29, Static357.anIntArrayArray58[local72], arg1, local23);
		}
		@Pc(96) int local96 = Static25.method861(Static28.anInt675, arg3 + arg4, Static82.anInt1837);
		@Pc(105) int local105 = Static25.method861(Static28.anInt675, arg0 - arg3, Static82.anInt1837);
		for (@Pc(107) int local107 = local38; local107 <= local46; local107++) {
			@Pc(113) int[] local113 = Static357.anIntArrayArray58[local107];
			Static101.method2163(local96, local113, arg1, local23);
			Static101.method2163(local105, local113, arg6, local96);
			Static101.method2163(local29, local113, arg1, local105);
		}
	}
}
