import org.openrs2.deob.annotation.OriginalMember;

public final class Static268 {

	@OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
	public static int anInt4955 = 0;

	@OriginalMember(owner = "client!pg", name = "Q", descriptor = "[B")
	public static byte[] aByteArray60 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
	public static int anInt4959 = 0;

	@OriginalMember(owner = "client!pg", name = "T", descriptor = "Lclient!h;")
	public static Class89 aClass89_180 = new Class89(92, 6);

	@OriginalMember(owner = "client!pg", name = "U", descriptor = "[I")
	public static int[] anIntArray338 = new int[25];

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
	public static void method4546() {
		aByteArray60 = null;
		aClass89_180 = null;
		anIntArray338 = null;
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)Lclient!ac;")
	public static Class3_Sub1 method4547() {
		return Static300.aClass3_Sub1Array2.length > Static231.anInt4079 ? Static300.aClass3_Sub1Array2[Static231.anInt4079++] : null;
	}
}
