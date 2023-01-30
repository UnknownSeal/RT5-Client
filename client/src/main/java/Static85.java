import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!r;")
	public static Js5 aJs5_20;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Lclient!r;")
	public static Js5 aJs5_21;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "[I")
	public static final int[] anIntArray121 = new int[2048];

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZLclient!nk;B)V")
	public static void method1911(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		@Pc(12) int local12 = arg1.scrollWidth == 0 ? arg1.width : arg1.scrollWidth;
		@Pc(24) int local24 = arg1.scrollHeight == 0 ? arg1.height : arg1.scrollHeight;
		Static364.method6104(arg0, local24, arg1.id, Static26.aComponentArrayArray1[arg1.id >> 16], local12);
		if (arg1.aComponentArray2 != null) {
			Static364.method6104(arg0, local24, arg1.id, arg1.aComponentArray2, local12);
		}
		@Pc(57) Class2_Sub7 local57 = (Class2_Sub7) Static329.aClass4_130.get((long) arg1.id);
		if (local57 != null) {
			Static129.method2435(local24, local57.anInt1370, arg0, local12);
		}
	}
}
