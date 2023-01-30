import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "[[B")
	public static byte[][] underwaterLocBytes;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
	public static int anInt4966;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
	public static final int anInt4964 = 1407;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "Z")
	public static boolean aBoolean371 = false;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BJ)V")
	public static void sleepUninterruptibly(@OriginalArg(1) long millis) {
		try {
			Thread.sleep(millis);
		} catch (@Pc(15) InterruptedException exception) {
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)Z")
	public static boolean method4554() {
		return Static268.size > 0;
	}
}
