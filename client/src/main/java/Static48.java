import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
	public static int anInt1256;

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
	public static int anInt1254 = 0;

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "J")
	public static volatile long aLong37 = 0L;

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "Lclient!kk;")
	public static final Class127 aClass127_3 = new Class127("WTI", 5);

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "Lclient!hu;")
	public static final SoftLruHashTable A_SOFT_LRU_HASH_TABLE___3 = new SoftLruHashTable(10);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIII)I")
	public static int method1467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg0;
		} else {
			return arg1;
		}
	}
}
