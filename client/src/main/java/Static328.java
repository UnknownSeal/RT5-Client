import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static328 {

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
	public static int size;

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "[I")
	public static final int[] anIntArray416 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "Z")
	public static volatile boolean aBoolean412 = true;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BC)Z")
	public static boolean method5597(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
