import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static246 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!iu;")
	public static BufferedSocket aBufferedSocket_2;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "[Lclient!ec;")
	public static Class58[] aClass58Array3;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Z")
	public static boolean aBoolean312 = false;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
	public static int anInt4505 = 0;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)Z")
	public static boolean isPowerOfTwo(@OriginalArg(1) int v) {
		return v == (v & -v);
	}
}
