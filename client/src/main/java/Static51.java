import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cu", name = "s", descriptor = "[I")
	public static int[] underwaterMapGroupIDs;

	@OriginalMember(owner = "client!cu", name = "v", descriptor = "Lclient!on;")
	public static Class14 aClass14_2;

	@OriginalMember(owner = "client!cu", name = "B", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "I")
	public static int anInt1369 = 0;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIZII)V")
	public static void method1545(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static19.anInt535 = arg0;
		Static348.anInt6446 = arg1;
		Static180.anInt3404 = arg4;
		Static359.anInt6702 = arg2;
		Static311.anInt5810 = arg5;
		if (arg3 && Static359.anInt6702 >= 100) {
			Static136.anInt6778 = Static311.anInt5810 * 128 + 64;
			Static211.anInt3777 = Static19.anInt535 * 128 + 64;
			Static102.anInt3592 = Static386.method6031(Static136.anInt6778, Static211.anInt3777, Static355.anInt6585) - Static180.anInt3404;
		}
		Static314.anInt5911 = 2;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] encodeString(@OriginalArg(0) String sourceString) {
		@Pc(13) int stringLength = sourceString.length();
		@Pc(16) byte[] destination = new byte[stringLength];
		for (@Pc(18) int i = 0; i < stringLength; i++) {
			@Pc(24) char c = sourceString.charAt(i);
			if (c > '\u0000' && c < '\u0080' || !(c < ' ' || c > 'ÿ')) {
				destination[i] = (byte) c;
			} else if (c == '€') {
				destination[i] = -128;
			} else if (c == '‚') {
				destination[i] = -126;
			} else if (c == 'ƒ') {
				destination[i] = -125;
			} else if (c == '„') {
				destination[i] = -124;
			} else if (c == '…') {
				destination[i] = -123;
			} else if (c == '†') {
				destination[i] = -122;
			} else if (c == '‡') {
				destination[i] = -121;
			} else if (c == 'ˆ') {
				destination[i] = -120;
			} else if (c == '‰') {
				destination[i] = -119;
			} else if (c == 'Š') {
				destination[i] = -118;
			} else if (c == '‹') {
				destination[i] = -117;
			} else if (c == 'Œ') {
				destination[i] = -116;
			} else if (c == 'Ž') {
				destination[i] = -114;
			} else if (c == '‘') {
				destination[i] = -111;
			} else if (c == '’') {
				destination[i] = -110;
			} else if (c == '“') {
				destination[i] = -109;
			} else if (c == '”') {
				destination[i] = -108;
			} else if (c == '•') {
				destination[i] = -107;
			} else if (c == '–') {
				destination[i] = -106;
			} else if (c == '—') {
				destination[i] = -105;
			} else if (c == '˜') {
				destination[i] = -104;
			} else if (c == '™') {
				destination[i] = -103;
			} else if (c == 'š') {
				destination[i] = -102;
			} else if (c == '›') {
				destination[i] = -101;
			} else if (c == 'œ') {
				destination[i] = -100;
			} else if (c == 'ž') {
				destination[i] = -98;
			} else if (c == 'Ÿ') {
				destination[i] = -97;
			} else {
				destination[i] = 63;
			}
		}
		return destination;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIIIB)V")
	public static void method1547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(19) int local19 = arg5 + arg0;
		for (@Pc(21) int local21 = arg5; local21 < local19; local21++) {
			Static101.method2163(arg4, Static357.anIntArrayArray58[local21], arg3, arg1);
		}
		@Pc(46) int local46 = arg1 + arg0;
		for (@Pc(48) int local48 = arg2; local48 > local10; local48--) {
			Static101.method2163(arg4, Static357.anIntArrayArray58[local48], arg3, arg1);
		}
		@Pc(67) int local67 = arg4 - arg0;
		for (@Pc(69) int local69 = local19; local69 <= local10; local69++) {
			@Pc(75) int[] local75 = Static357.anIntArrayArray58[local69];
			Static101.method2163(local46, local75, arg3, arg1);
			Static101.method2163(arg4, local75, arg3, local67);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)I")
	public static int method1548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static314.aByteArrayArray17 == null ? 0 : Static314.aByteArrayArray17[arg0][arg1] & 0xFF;
	}
}
