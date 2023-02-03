import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static30 {

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "Lclient!je;")
	public static WorldMapFont font22;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!h;")
	public static final Class89 aClass89_25 = new Class89(88, -2);

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_28 = new Class145(33, 4);

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "Lclient!h;")
	public static final Class89 aClass89_26 = new Class89(16, 7);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 >= Static28.anInt675 && Static82.anInt1837 >= arg5 && Static28.anInt675 <= arg3 && arg3 <= Static82.anInt1837 && Static28.anInt675 <= arg6 && Static82.anInt1837 >= arg6 && Static28.anInt675 <= arg7 && Static82.anInt1837 >= arg7 && arg1 >= Static365.anInt6832 && arg1 <= Static161.anInt2954 && Static365.anInt6832 <= arg0 && Static161.anInt2954 >= arg0 && Static365.anInt6832 <= arg4 && arg4 <= Static161.anInt2954 && arg8 >= Static365.anInt6832 && Static161.anInt2954 >= arg8) {
			Static339.method5759(arg0, arg6, arg1, arg5, arg7, arg3, arg8, arg2, arg4);
		} else {
			Static4.method72(arg3, arg4, arg8, arg0, arg6, arg1, arg2, arg7, arg5);
		}
	}
}
