import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "Lclient!wm;")
	public static Class19 aClass19_5;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "Lclient!nk;")
	public static Component aComponent_6 = null;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "Lclient!h;")
	public static final Class89 aClass89_143 = new Class89(11, -1);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)V")
	public static void method3363(@OriginalArg(1) int arg0) {
		@Pc(16) DelayedStateChange local16 = Static316.create(3, arg0);
		local16.pushClient();
	}
}
