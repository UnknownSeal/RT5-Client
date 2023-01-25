import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "[I")
	public static int[] anIntArray226 = new int[32];

	@OriginalMember(owner = "client!md", name = "e", descriptor = "[I")
	public static int[] anIntArray227 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Lclient!wc;")
	public static Class246 aClass246_4 = new Class246();

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public static void method3706() {
		aClass246_4 = null;
		anIntArray227 = null;
		anIntArray226 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Z")
	public static boolean method3709() {
		@Pc(8) Class2_Sub5 local8 = (Class2_Sub5) Static129.aClass135_19.aClass2_130.aClass2_244;
		if (local8 == null || Static129.aClass135_19.aClass2_130 == local8) {
			return false;
		} else {
			if (local8.anInt1005 >= 2000) {
				local8.anInt1005 -= 2000;
			}
			return local8.anInt1005 == 1011;
		}
	}
}
