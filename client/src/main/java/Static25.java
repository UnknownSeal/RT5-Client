import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
	public static int anInt648;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
	public static int anInt643 = -1;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString9 = "";

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!tf;)V")
	public static void method858(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1) {
		Static365.aClass6Array4[arg0] = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int fromIsoCode(@OriginalArg(0) String code) {
		for (@Pc(12) int i = 0; i < Static164.ISO_CODES.length; i++) {
			if (Static164.ISO_CODES[i].equalsIgnoreCase(code)) {
				return i;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)I")
	public static int method861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 <= arg1) {
			return arg2 < arg1 ? arg2 : arg1;
		} else {
			return arg0;
		}
	}
}
