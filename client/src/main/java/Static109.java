import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_83 = new Class145(26, 7);

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "Lclient!s;")
	public static final Class210 aClass210_4 = new Class210(2, 5);

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIILclient!ct;)V")
	public static void method2264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class41 arg3) {
		for (@Pc(10) Class2_Sub19 local10 = (Class2_Sub19) Static83.A_LINKED_LIST___14.head(); local10 != null; local10 = (Class2_Sub19) Static83.A_LINKED_LIST___14.next()) {
			if (local10.anInt2905 == arg0 && local10.anInt2899 == arg1 * 128 && local10.anInt2910 == arg2 * 128 && local10.aClass41_1.anInt1351 == arg3.anInt1351) {
				if (local10.aClass2_Sub12_Sub4_3 != null) {
					Static227.aClass2_Sub12_Sub2_2.method2081(local10.aClass2_Sub12_Sub4_3);
					local10.aClass2_Sub12_Sub4_3 = null;
				}
				if (local10.aClass2_Sub12_Sub4_2 != null) {
					Static227.aClass2_Sub12_Sub2_2.method2081(local10.aClass2_Sub12_Sub4_2);
					local10.aClass2_Sub12_Sub4_2 = null;
				}
				local10.unlink();
				return;
			}
		}
	}
}
