import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!vm", name = "O", descriptor = "Lclient!je;")
	public static WorldMapFont font30;

	@OriginalMember(owner = "client!vm", name = "N", descriptor = "[I")
	public static final int[] anIntArray479 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!vm", name = "W", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_248 = new Class145(19, -1);

	@OriginalMember(owner = "client!vm", name = "Z", descriptor = "Z")
	public static boolean aBoolean471 = false;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "(I)V")
	public static void method6216() {
		@Pc(5) SoftLruHashTable local5 = Static98.A_SOFT_LRU_HASH_TABLE___10;
		synchronized (Static98.A_SOFT_LRU_HASH_TABLE___10) {
			Static98.A_SOFT_LRU_HASH_TABLE___10.method2614();
		}
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(IB)V")
	public static void setComponentScrollPositionClient(@OriginalArg(0) int arg0) {
		@Pc(16) DelayedStateChange change = DelayedStateChange.create(12, arg0);
		change.pushClient();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIII)V")
	public static void method6220(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static154.anInt2806; local3++) {
			@Pc(9) Rectangle local9 = Class55.aRectangleArray1[local3];
			if (local9.x + local9.width > arg1 && local9.x < arg0 + arg1 && arg3 < local9.y + local9.height && local9.y < arg2 + arg3) {
				Static357.aBooleanArray59[local3] = true;
			}
		}
	}
}
