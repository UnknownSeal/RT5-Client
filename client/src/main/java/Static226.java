import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!na", name = "Y", descriptor = "Lclient!lh;")
	public static Class119 aClass119_1;

	@OriginalMember(owner = "client!na", name = "S", descriptor = "I")
	public static int anInt4016 = 0;

	@OriginalMember(owner = "client!na", name = "Z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V")
	public static void method3981() {
		@Pc(18) int local18 = Static218.preferences.method4491(Static77.anInt1762);
		if (local18 == 0) {
			Static230.aByteArrayArrayArray13 = null;
			Static136.method6076(0);
		} else if (local18 == 1) {
			Static306.method5249((byte) 0);
			Static136.method6076(512);
			if (Static359.aByteArrayArrayArray16 != null) {
				Static33.method4206();
			}
		} else {
			Static306.method5249((byte) (Static163.anInt3086 - 4 & 0xFF));
			Static136.method6076(2);
		}
		Static272.anInt5022 = Static355.anInt6585;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(II)V")
	public static void method3982(@OriginalArg(0) int arg0) {
		@Pc(10) DelayedStateChange local10 = DelayedStateChange.create(1, arg0);
		local10.pushClient();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([Ljava/lang/Object;[II)V")
	public static void method3983(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1) {
		Static17.method4210(arg0, arg1, 0, arg1.length - 1);
	}
}
