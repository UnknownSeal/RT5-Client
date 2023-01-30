import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "[I")
	public static final int[] anIntArray396 = new int[14];

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_214 = new Class145(31, 3);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Lclient!gg;")
	public static DelayedStateChange create(@OriginalArg(0) int type, @OriginalArg(2) int id) {
		@Pc(15) DelayedStateChange change = (DelayedStateChange) DelayedStateChange.changes.get((long) id | (long) type << 32);
		if (change == null) {
			change = new DelayedStateChange(type, id);
			DelayedStateChange.changes.put(change, change.key);
		}
		return change;
	}
}
