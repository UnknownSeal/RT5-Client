import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static42 {

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "Lclient!mc;")
	public static Class145 aClass145_230 = new Class145(55, 0);

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray59 = new String[100];

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "Lclient!h;")
	public static Class89 aClass89_226 = new Class89(62, 6);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIII)V")
	public static void method5748(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg0) {
			Static364.method6102(arg4, arg2, arg3, arg1);
		} else if (Static28.anInt675 <= arg2 - arg1 && Static82.anInt1837 >= arg1 + arg2 && Static365.anInt6832 <= arg3 - arg0 && Static161.anInt2954 >= arg0 + arg3) {
			Static326.method5681(arg2, arg3, arg1, arg4, arg0);
		} else {
			Static292.method5034(arg3, arg1, arg2, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "(I)V")
	public static void method5749() {
		aStringArray59 = null;
		aClass145_230 = null;
		aClass89_226 = null;
	}
}
