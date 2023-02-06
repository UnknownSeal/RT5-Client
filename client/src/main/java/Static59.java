import org.openrs2.deob.annotation.OriginalMember;

public final class Static59 {

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "[I")
	public static int[] anIntArray107;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "[I")
	public static final int[] anIntArray105 = new int[50];

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "[I")
	public static final int[] anIntArray106 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
	public static void method1642() {
		if (Static25.aString9.length() == 0) {
			return;
		}
		Static158.add("--> " + Static25.aString9);
		Static161.execute(Static25.aString9, false);
		Static25.aString9 = "";
		Static141.anInt2653 = 0;
		Static357.anInt6683 = 0;
	}

}
