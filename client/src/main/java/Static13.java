import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static13 {

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_18 = new Class145(64, -1);

	@OriginalMember(owner = "client!ao", name = "D", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[128][128];

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "(I)V")
	public static void method345() {
		Static335.A_SOFT_LRU_HASH_TABLE___57.method2621();
		Static124.A_SOFT_LRU_HASH_TABLE___63.method2621();
		Static333.A_SOFT_LRU_HASH_TABLE___65.method2621();
		Static297.A_SOFT_LRU_HASH_TABLE___44.method2621();
		Static288.A_SOFT_LRU_HASH_TABLE___42.method2621();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)I")
	public static int getTargetMask(@OriginalArg(0) int events) {
		return events >> 11 & 0x7F;
	}
}
