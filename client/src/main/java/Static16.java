import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static16 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "[I")
	public static int[] normalizedY;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "I")
	public static int anInt4756;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "Lclient!wm;")
	public static Class19 aClass19_10;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "Ljava/lang/String;")
	public static String password = "";

	@OriginalMember(owner = "client!as", name = "a", descriptor = "([II[J)V")
	public static void method4406(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static61.method1671(arg1, arg1.length - 1, arg0, 0);
	}
}
