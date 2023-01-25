import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static152 {

	@OriginalMember(owner = "client!io", name = "p", descriptor = "Lclient!h;")
	public static Class89 aClass89_116 = new Class89(87, -2);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZZ)Z")
	public static boolean method2764(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
	public static void method2766() {
		aClass89_116 = null;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!r;)V")
	public static void method2768(@OriginalArg(1) Class197 arg0) {
		Static188.aClass197_52 = arg0;
	}
}
