import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ho", name = "Q", descriptor = "I")
	public static final int anInt2521 = 1338;

	@OriginalMember(owner = "client!ho", name = "R", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[100];

	@OriginalMember(owner = "client!ho", name = "S", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_2 = new Class16("", 14);

	@OriginalMember(owner = "client!ho", name = "U", descriptor = "I")
	public static int anInt2523 = -1;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
	public static void method2534(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static188.method3467(arg1, 0, arg0.length - 1, arg0);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BIC)C")
	public static char getFirstChar(@OriginalArg(2) char c, @OriginalArg(1) int language) {
		if (c >= 'À' && c <= 'ÿ') {
			if (c >= 'À' && c <= 'Æ') {
				return 'A';
			}
			if (c == 'Ç') {
				return 'C';
			}
			if (c >= 'È' && c <= 'Ë') {
				return 'E';
			}
			if (c >= 'Ì' && c <= 'Ï') {
				return 'I';
			}
			if (c == 'Ñ' && language != 0) {
				return 'N';
			}
			if (c >= 'Ò' && c <= 'Ö') {
				return 'O';
			}
			if (c >= 'Ù' && c <= 'Ü') {
				return 'U';
			}
			if (c == 'Ý') {
				return 'Y';
			}
			if (c == 'ß') {
				return 's';
			}
			if (c >= 'à' && c <= 'æ') {
				return 'a';
			}
			if (c == 'ç') {
				return 'c';
			}
			if (c >= 'è' && c <= 'ë') {
				return 'e';
			}
			if (c >= 'ì' && c <= 'ï') {
				return 'i';
			}
			if (c == 'ñ' && language != 0) {
				return 'n';
			}
			if (c >= 'ò' && c <= 'ö') {
				return 'o';
			}
			if (c >= 'ù' && c <= 'ü') {
				return 'u';
			}
			if (c == 'ý' || c == 'ÿ') {
				return 'y';
			}
		}
		if (c == 'Œ') {
			return 'O';
		} else if (c == 'œ') {
			return 'o';
		} else if (c == 'Ÿ') {
			return 'Y';
		} else {
			return c;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method2537(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) int local16 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local19 > local16 && Static118.method3454(arg0.charAt(local16))) {
			local16++;
		}
		while (local16 < local19 && Static118.method3454(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(50) int local50 = local19 - local16;
		if (local50 < 1 || local50 > 12) {
			return null;
		}
		@Pc(63) StringBuffer local63 = new StringBuffer(local50);
		for (@Pc(65) int local65 = local16; local65 < local19; local65++) {
			@Pc(71) char local71 = arg0.charAt(local65);
			if (Static160.method2953(local71)) {
				@Pc(79) char local79 = Static340.method5761(local71);
				if (local79 != '\u0000') {
					local63.append(local79);
				}
			}
		}
		if (local63.length() == 0) {
			return null;
		} else {
			return local63.toString();
		}
	}
}
