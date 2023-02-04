import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static334 {

	@OriginalMember(owner = "client!th", name = "o", descriptor = "I")
	public static int anInt6242;

	@OriginalMember(owner = "client!th", name = "t", descriptor = "[I")
	public static int[] normalizedX;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!lo;)V")
	public static void init(@OriginalArg(1) HuffmanCodec codec) {
		Static370.huffmanCodec = codec;
	}
}
