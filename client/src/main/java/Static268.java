import org.openrs2.deob.annotation.OriginalMember;

public final class Static268 {

	@OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
	public static int anInt4955 = 0;

	@OriginalMember(owner = "client!pg", name = "Q", descriptor = "[B")
	public static final byte[] aByteArray60 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!pg", name = "T", descriptor = "Lclient!h;")
	public static final Class89 aClass89_180 = new Class89(92, 6);

	@OriginalMember(owner = "client!pg", name = "U", descriptor = "[I")
	public static final int[] boostedLevels = new int[25];

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)Lclient!ac;")
	public static World method4547() {
		return Static300.aWorldArray2.length > Static231.anInt4079 ? Static300.aWorldArray2[Static231.anInt4079++] : null;
	}
}
