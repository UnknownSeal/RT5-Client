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
	public static long method5981(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) - (local10 - ((long) arg0.charAt(local12)));
		}
		return local10;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method5984(@OriginalArg(1) String arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			local5 *= 37L;
			@Pc(19) char local19 = arg0.charAt(local10);
			if (local19 >= 'A' && local19 <= 'Z') {
				local5 += local19 + 1 - 65;
			} else if (local19 >= 'a' && local19 <= 'z') {
				local5 += local19 - 96;
			} else if (local19 >= '0' && local19 <= '9') {
				local5 += local19 + 27 - 48;
			}
			if (local5 >= 177917621779460413L) {
				break;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}
}
