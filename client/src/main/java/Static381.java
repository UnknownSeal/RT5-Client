import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static381 {

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
	public static int anInt7118;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
	public static int anInt7117 = 0;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "Z")
	public static boolean playerMemeber = false;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
	public static int method6347(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
