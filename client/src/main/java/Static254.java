import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public static int anInt4698;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "S")
	public static short aShort73 = 256;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "Lclient!hu;")
	public static final SoftLruHashTable A_SOFT_LRU_HASH_TABLE___39 = new SoftLruHashTable(8);

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	public static int anInt4701 = 765;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[S)[S")
	public static short[] method4370(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static403.method4605(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	public static void method4371() {
		Static343.anInt6389 = -1;
		Static312.anInt5844 = -1;
		Static146.anInt2703 = 0;
		Static358.anInt6550 = -1;
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)I")
	public static int method4374() {
		return 16;
	}
}
