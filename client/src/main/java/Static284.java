import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
	public static int anInt5359;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "[I")
	public static final int[] anIntArray367 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "J")
	public static long aLong157 = 0L;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_7 = new Class36();

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!ci;IIIILclient!wm;)V")
	public static void method4880(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class19 arg5) {
		if (Static355.loadPercentage < 100) {
			Static209.method3713(arg5, arg0);
		}
		arg5.method2895(arg4, arg2, arg4 + arg3, arg2 - -arg1);
		@Pc(36) int local36;
		@Pc(47) int local47;
		if (Static355.loadPercentage < 100) {
			local36 = arg3 / 2 + arg4;
			local47 = arg1 / 2 + arg2 - 18 - 20;
			arg5.method2901(arg4, arg2, arg3, arg1, -16777216, 0);
			arg5.method2836(local36 - 152, local47, 304, 34, Static291.aColorArray4[Static64.anInt1555].getRGB(), 0);
			arg5.method2901(local36 - 150, local47 - -2, Static355.loadPercentage * 3, 30, Static174.aColorArray2[Static64.anInt1555].getRGB(), 0);
			Static52.aClass130_1.method5899(LocalisedText.LOADING.getLocalisedText(client.language), -1, local47 + 20, Static286.aColorArray3[Static64.anInt1555].getRGB(), local36);
			return;
		}
		@Pc(111) int local111 = Static151.anInt2772 - (int) ((float) arg3 / Static344.aFloat72);
		local36 = (int) ((float) arg1 / Static344.aFloat72) + Static96.anInt2003;
		local47 = (int) ((float) arg3 / Static344.aFloat72) + Static151.anInt2772;
		Static368.anInt6930 = (int) ((float) (arg1 * 2) / Static344.aFloat72);
		Static21.anInt548 = Static96.anInt2003 - (int) ((float) arg1 / Static344.aFloat72);
		Static44.anInt1105 = (int) ((float) (arg3 * 2) / Static344.aFloat72);
		@Pc(160) int local160 = Static96.anInt2003 - (int) ((float) arg1 / Static344.aFloat72);
		Static178.anInt2317 = Static151.anInt2772 - (int) ((float) arg3 / Static344.aFloat72);
		Static344.method5529(local111 + Static344.anInt6057, local36 - -Static344.anInt6055, Static344.anInt6057 + local47, Static344.anInt6055 + local160, arg4, arg2, arg3 + arg4, arg2 - (-arg1 - 1));
		Static344.method5521(arg5);
		@Pc(203) LinkedList local203 = Static344.method5523(arg5);
		Static303.method5207(local203, arg5);
		if (Static243.anInt4495 > 0) {
			Static90.anInt6637--;
			if (Static90.anInt6637 == 0) {
				Static90.anInt6637 = 20;
				Static243.anInt4495--;
			}
		}
		if (!Static356.aBoolean456) {
			return;
		}
		@Pc(237) int local237 = arg3 + arg4 - 5;
		@Pc(243) int local243 = arg1 + arg2 - 8;
		Static276.aClass130_4.method5897(local237, local243, "Fps:" + GameShell.framesPerSecond, 16776960);
		@Pc(258) int local258 = local243 - 15;
		@Pc(260) Runtime local260 = Runtime.getRuntime();
		@Pc(270) int local270 = (int) ((local260.totalMemory() - local260.freeMemory()) / 1024L);
		@Pc(272) int local272 = 16776960;
		if (local270 > 65536) {
			local272 = 16711680;
		}
		Static276.aClass130_4.method5897(local237, local258, "Mem:" + local270 + "k", local272);
		local243 = local258 - 15;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)Z")
	public static boolean method4881(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static190.aClass19_8.method2892();
		if (arg0 == local11) {
			return true;
		}
		if (!arg0) {
			Static190.aClass19_8.method2831();
		} else if (!Static190.aClass19_8.method2847()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static218.aClass177_Sub1_2.aBoolean356 = arg0;
			Static218.aClass177_Sub1_2.write(GameShell.signlink);
			return true;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!nk;ZI)Ljava/lang/String;")
	public static String method4882(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1) {
		if (!Static45.getServerActiveProperties(arg0).method1854(arg1) && arg0.onOptionClick == null) {
			return null;
		} else if (arg0.ops == null || arg1 >= arg0.ops.length || arg0.ops[arg1] == null || arg0.ops[arg1].trim().length() == 0) {
			return Static18.aBoolean30 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.ops[arg1];
		}
	}
}
