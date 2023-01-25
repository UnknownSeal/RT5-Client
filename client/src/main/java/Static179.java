import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "Lclient!wm;")
	public static Class19 aClass19_5;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "Lclient!nk;")
	public static Class161 aClass161_6 = null;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "Lclient!h;")
	public static Class89 aClass89_143 = new Class89(11, -1);

	@OriginalMember(owner = "client!kg", name = "v", descriptor = "Lclient!gd;")
	public static Class79 aClass79_73 = new Class79("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)V")
	public static void method3363(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub2_Sub7 local16 = Static316.method5412(3, arg0);
		local16.method2312();
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
	public static void method3364() {
		aClass19_5 = null;
		aClass89_143 = null;
		aClass161_6 = null;
		aClass79_73 = null;
	}
}
