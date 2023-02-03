import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ek", name = "Z", descriptor = "I")
	public static int anInt6679;

	@OriginalMember(owner = "client!ek", name = "X", descriptor = "Lclient!h;")
	public static final Class89 aClass89_234 = new Class89(65, 5);

	@OriginalMember(owner = "client!ek", name = "ab", descriptor = "[I")
	public static final int[] experience = new int[25];

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long longHashCode(@OriginalArg(1) String s) {
		@Pc(8) int length = s.length();
		@Pc(10) long hash = 0L;
		for (@Pc(12) int I = 0; I < length; I++) {
			hash = (hash << 5) - (hash - ((long) s.charAt(I)));
		}
		return hash;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long encode(@OriginalArg(1) String s) {
		@Pc(5) long out = 0L;
		@Pc(8) int length = s.length();
		for (@Pc(10) int i = 0; i < length; i++) {
			out *= 37L;
			@Pc(19) char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				out += c + 1 - 65;
			} else if (c >= 'a' && c <= 'z') {
				out += c - 96;
			} else if (c >= '0' && c <= '9') {
				out += c + 27 - 48;
			}
			if (out >= 177917621779460413L) {
				break;
			}
		}
		while (out % 37L == 0L && out != 0L) {
			out /= 37L;
		}
		return out;
	}
}
