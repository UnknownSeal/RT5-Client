import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ch", name = "Y", descriptor = "I")
	public static int anInt1044;

	@OriginalMember(owner = "client!ch", name = "kb", descriptor = "I")
	public static int anInt1052;

	@OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
	public static int anInt1038 = 0;

	@OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
	public static int reply = -2;

	@OriginalMember(owner = "client!ch", name = "cb", descriptor = "I")
	public static int anInt1048 = 0;

	@OriginalMember(owner = "client!ch", name = "fb", descriptor = "[I")
	public static final int[] anIntArray85 = new int[32];

	@OriginalMember(owner = "client!ch", name = "gb", descriptor = "[Lclient!nt;")
	public static final Class2_Sub2_Sub13[] aClass2_Sub2_Sub13Array2 = new Class2_Sub2_Sub13[14];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZIII)I")
	public static int getItemType(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class2_Sub41 local13 = Static374.method6274(arg0, arg1);
		if (local13 == null) {
			return -1;
		} else if (arg2 >= 0 && local13.anIntArray489.length > arg2) {
			return local13.anIntArray489[arg2];
		} else {
			return -1;
		}
	}
}
