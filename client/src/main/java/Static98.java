import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "[Lclient!ns;")
	public static Class12_Sub1_Sub1_Sub1[] aClass12_Sub1_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "[Lclient!hb;")
	public static Class11_Sub5[] aClass11_Sub5Array1;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Lclient!hu;")
	public static final SoftLruHashTable A_SOFT_LRU_HASH_TABLE___10 = new SoftLruHashTable(32);

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_73 = new Class145(46, 2);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)I")
	public static int method2104(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
	public static void method2107() {
		for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
			Static357.aBooleanArray59[local11] = true;
		}
	}
}
