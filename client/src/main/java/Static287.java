import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "Lclient!ui;")
	public static Class233 aClass233_1;

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray52 = new String[5];

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "[I")
	public static final int[] anIntArray369 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)I")
	public static int bitCount(@OriginalArg(1) int v) {
		@Pc(5) int bits = 0;
		if (v < 0 || v >= 65536) {
			bits += 16;
			v >>>= 0x10;
		}
		if (v >= 256) {
			v >>>= 0x8;
			bits += 8;
		}
		if (v >= 16) {
			v >>>= 0x4;
			bits += 4;
		}
		if (v >= 4) {
			v >>>= 0x2;
			bits += 2;
		}
		if (v >= 1) {
			bits++;
			v >>>= 0x1;
		}
		return v + bits;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)Z")
	public static boolean method4930(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(15) Class41 local15 = Static359.aClass202_4.method5162(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local15.method1521(arg1);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!nk;IIB)V")
	public static void method4938(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.aByte46 == 0) {
			arg0.anInt4254 = arg0.anInt4249;
		} else if (arg0.aByte46 == 1) {
			arg0.anInt4254 = arg0.anInt4249 + (arg2 - arg0.height) / 2;
		} else if (arg0.aByte46 == 2) {
			arg0.anInt4254 = arg2 - arg0.height - arg0.anInt4249;
		} else if (arg0.aByte46 == 3) {
			arg0.anInt4254 = arg2 * arg0.anInt4249 >> 14;
		} else if (arg0.aByte46 == 4) {
			arg0.anInt4254 = (arg0.anInt4249 * arg2 >> 14) + (arg2 - arg0.height) / 2;
		} else {
			arg0.anInt4254 = arg2 - (arg0.anInt4249 * arg2 >> 14) - arg0.height;
		}
		if (arg0.aByte45 == 0) {
			arg0.anInt4305 = arg0.anInt4241;
		} else if (arg0.aByte45 == 1) {
			arg0.anInt4305 = (arg1 - arg0.width) / 2 + arg0.anInt4241;
		} else if (arg0.aByte45 == 2) {
			arg0.anInt4305 = arg1 - arg0.anInt4241 - arg0.width;
		} else if (arg0.aByte45 == 3) {
			arg0.anInt4305 = arg0.anInt4241 * arg1 >> 14;
		} else if (arg0.aByte45 == 4) {
			arg0.anInt4305 = (arg1 * arg0.anInt4241 >> 14) + (arg1 - arg0.width) / 2;
		} else {
			arg0.anInt4305 = arg1 - arg0.width - (arg1 * arg0.anInt4241 >> 14);
		}
		if (!Static18.aBoolean30) {
			return;
		}
		if (Static45.method1404(arg0).anInt1758 == 0 && arg0.type != 0) {
			return;
		}
		if (arg0.anInt4254 < 0) {
			arg0.anInt4254 = 0;
		} else if (arg0.height + arg0.anInt4254 > arg2) {
			arg0.anInt4254 = arg2 - arg0.height;
		}
		if (arg0.anInt4305 < 0) {
			arg0.anInt4305 = 0;
			return;
		}
		if (arg0.anInt4305 + arg0.width > arg1) {
			arg0.anInt4305 = arg1 - arg0.width;
			return;
		}
	}
}
