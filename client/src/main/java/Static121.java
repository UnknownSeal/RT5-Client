import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static121 {

	@OriginalMember(owner = "client!gu", name = "u", descriptor = "[I")
	public static int[] anIntArray156;

	@OriginalMember(owner = "client!gu", name = "x", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!gu", name = "y", descriptor = "Lclient!kk;")
	public static Class127 aClass127_4;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2394(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static324.method5540(arg3, arg2, arg0, 0, arg1, arg5, arg4);
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
	public static void method2396() {
		if (Static140.aBoolean187) {
			return;
		}
		if (Static218.preferences.aBoolean351) {
			Static31.aFloat28 = (int) Static31.aFloat28 - 17 & 0xFFFFFFF0;
		} else {
			Static296.aFloat68 += (-Static296.aFloat68 - 12.0F) / 2.0F;
		}
		Static140.aBoolean187 = true;
		Static100.aBoolean156 = true;
	}
}
