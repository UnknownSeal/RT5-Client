import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!br", name = "P", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!br", name = "R", descriptor = "I")
	public static int anInt798;

	@OriginalMember(owner = "client!br", name = "V", descriptor = "Lclient!cf;")
	public static Class2_Sub5 aClass2_Sub5_2;

	@OriginalMember(owner = "client!br", name = "X", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_32 = new Class145(62, 3);

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!wm;Lclient!hp;III)V")
	public static void method990(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class67 local12;
		if (arg3 < Static72.anInt1684) {
			local12 = Static330.aClass67ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass11_Sub2_2 != null && local12.aClass11_Sub2_2.method6075()) {
				arg1.method6074(Static256.anInt4716, 0, 0, arg0, true, local12.aClass11_Sub2_2);
			}
		}
		if (arg4 < Static72.anInt1684) {
			local12 = Static330.aClass67ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass11_Sub2_2 != null && local12.aClass11_Sub2_2.method6075()) {
				arg1.method6074(0, Static256.anInt4716, 0, arg0, true, local12.aClass11_Sub2_2);
			}
		}
		if (arg3 < Static72.anInt1684 && arg4 < Static210.anInt3773) {
			local12 = Static330.aClass67ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass11_Sub2_2 != null && local12.aClass11_Sub2_2.method6075()) {
				arg1.method6074(Static256.anInt4716, Static256.anInt4716, 0, arg0, true, local12.aClass11_Sub2_2);
			}
		}
		if (arg3 < Static72.anInt1684 && arg4 > 0) {
			local12 = Static330.aClass67ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass11_Sub2_2 != null && local12.aClass11_Sub2_2.method6075()) {
				arg1.method6074(Static256.anInt4716, -Static256.anInt4716, 0, arg0, true, local12.aClass11_Sub2_2);
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(Z)I")
	public static int getTotal() {
		return 2;
	}
}
