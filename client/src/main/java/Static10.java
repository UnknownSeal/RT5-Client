import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "U", descriptor = "[S")
	public static short[] sourceBodyColors;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBI)I")
	public static int pow(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local15 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local15;
		} else {
			return local15;
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V")
	public static void method237(@OriginalArg(1) int arg0) {
		Static238.anInt4338 = arg0;
		Static133.A_SOFT_LRU_HASH_TABLE___17.clear();
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(III)I")
	public static int method238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static119.anIntArray152[arg0 & 0x3] : Static90.anIntArray460[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method239(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) DelayedStateChange local8 = DelayedStateChange.create(2, arg0);
		local8.pushServer();
		local8.aString21 = arg1;
	}
}
