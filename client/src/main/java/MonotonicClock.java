import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class MonotonicClock {

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "J")
	private static long leapMillis;

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "J")
	private static long previous;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)J")
	public static synchronized long currentTimeMillis() {
		@Pc(6) long now = System.currentTimeMillis();
		if (previous > now) {
			leapMillis += previous - now;
		}
		previous = now;
		return now + leapMillis;
	}
}
