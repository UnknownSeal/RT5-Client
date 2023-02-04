import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
	public static int anInt1483 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!nk;B)V")
	public static void method1624(@OriginalArg(0) Component arg0) {
		@Pc(7) Component local7 = Static7.method6464(arg0);
		@Pc(13) int local13;
		@Pc(11) int local11;
		if (local7 == null) {
			local11 = GameShell.canvasHeight;
			local13 = GameShell.canvasWidth;
		} else {
			local11 = local7.height;
			local13 = local7.width;
		}
		Static371.method6255(local11, local13, false, arg0);
		Static287.method4938(arg0, local13, local11);
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)I")
	public static int method1632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static284.anIntArray367[arg0 & 0x3] : 256;
	}
}
