import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[B")
	public static byte[] buffer;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public static int anInt2437;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method2422() {
		if (Static151.anInt2772 < 0) {
			Static77.anInt1763 = -1;
			Static238.anInt4328 = -1;
			Static151.anInt2772 = 0;
		}
		if (Static344.anInt6056 < Static151.anInt2772) {
			Static77.anInt1763 = -1;
			Static238.anInt4328 = -1;
			Static151.anInt2772 = Static344.anInt6056;
		}
		if (Static96.anInt2003 < 0) {
			Static77.anInt1763 = -1;
			Static96.anInt2003 = 0;
			Static238.anInt4328 = -1;
		}
		if (Static96.anInt2003 > Static344.anInt6052) {
			Static77.anInt1763 = -1;
			Static96.anInt2003 = Static344.anInt6052;
			Static238.anInt4328 = -1;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!nh;)V")
	public static void method2423(@OriginalArg(1) Class11_Sub5_Sub2_Sub1 arg0) {
		@Pc(11) AreaSound local11 = (AreaSound) Static232.aClass4_86.get((long) arg0.anInt4619);
		if (local11 == null) {
			return;
		}
		if (local11.primarySystem != null) {
			client.soundStream.method2081(local11.primarySystem);
			local11.primarySystem = null;
		}
		local11.unlink();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z")
	public static boolean method2425(@OriginalArg(0) int arg0) {
		if (arg0 == 15 || arg0 == 46 || arg0 == 58 || arg0 == 6 || arg0 == 21) {
			return true;
		} else {
			return arg0 == 13 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)I")
	public static int getFileID(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
