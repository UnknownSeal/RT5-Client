import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
	public static int anInt2458;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
	public static int anInt2460 = -1;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "Lclient!ld;")
	public static final LinkedList A_LINKED_LIST___19 = new LinkedList();

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "Lclient!ld;")
	public static final LinkedList A_LINKED_LIST___20 = new LinkedList();

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIZII)V")
	public static void method2434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static365.anInt6832 && arg2 <= Static161.anInt2954) {
			@Pc(19) int local19 = Static25.method861(Static28.anInt675, arg0, Static82.anInt1837);
			@Pc(25) int local25 = Static25.method861(Static28.anInt675, arg3, Static82.anInt1837);
			Static240.method4180(arg2, arg1, local25, local19);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIZBI)V")
	public static void method2435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static222.method3915(arg1)) {
			Static364.method6104(arg2, arg0, -1, Static26.aComponentArrayArray1[arg1], arg3);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIBI)V")
	public static void method2438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) DelayedStateChange local13 = Static316.create(11, arg2);
		local13.pushServer();
		local13.anInt2290 = arg1;
		local13.anInt2289 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V")
	public static void method2439(@OriginalArg(1) int arg0) {
		@Pc(17) DelayedStateChange local17 = Static316.create(16, arg0);
		local17.pushClient();
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	public static void method2440() {
		if (!Static355.method5933()) {
			return;
		}
		if (Static124.aStringArray65 == null) {
			Static148.method2709();
		}
		Static313.anIntArray388 = new int[100];
		Static214.anInt3793 = 0;
		Static353.anIntArray450 = new int[100];
		Static121.anIntArray156 = new int[100];
		Static121.anIntArray157 = new int[100];
		Static14.aBoolean24 = true;
		for (@Pc(35) int local35 = 0; local35 < 100; local35++) {
			Static121.anIntArray157[local35] = (int) ((double) GameShell.canvasWidth * Math.random()) << 4;
			Static121.anIntArray156[local35] = (int) (Math.random() * 350.0D) << 4;
			Static353.anIntArray450[local35] = (int) (Math.random() * 102.0D) + 51;
			Static313.anIntArray388[local35] = (int) (Math.random() * 48.0D) + 8;
		}
		try {
			Static23.aClipboard1 = client.instance.getToolkit().getSystemClipboard();
		} catch (@Pc(84) Exception local84) {
		}
	}
}
