import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!it", name = "d", descriptor = "I")
	public static int anInt2811;

	@OriginalMember(owner = "client!it", name = "f", descriptor = "Lclient!sl;")
	public static Class2_Sub34 aClass2_Sub34_1;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "I")
	public static int anInt2808 = 0;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "([II[B[[BI[I[[BI)I")
	public static int method2788(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg4[arg1];
		@Pc(15) int local15 = local9 + arg0[arg1];
		@Pc(19) int local19 = arg4[arg6];
		@Pc(25) int local25 = arg0[arg6] + local19;
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local15 > local25) {
			local34 = local25;
		}
		@Pc(45) int local45 = arg2[arg1] & 0xFF;
		if (local45 > (arg2[arg6] & 0xFF)) {
			local45 = arg2[arg6] & 0xFF;
		}
		@Pc(66) byte[] local66 = arg3[arg1];
		@Pc(70) byte[] local70 = arg5[arg6];
		@Pc(75) int local75 = local27 - local9;
		@Pc(80) int local80 = local27 - local19;
		for (@Pc(87) int local87 = local27; local87 < local34; local87++) {
			@Pc(99) int local99 = local70[local80++] + local66[local75++];
			if (local99 < local45) {
				local45 = local99;
			}
		}
		return -local45;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIB)V")
	public static void method2789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != Static227.width) {
			Static334.normalizedX = new int[arg0];
			for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
				Static334.normalizedX[local9] = (local9 << 12) / arg0;
			}
			Static73.anInt1721 = arg0 - 1;
			Static227.width = arg0;
			Static299.anInt5653 = arg0 * 32;
		}
		if (arg1 == Static24.height) {
			return;
		}
		if (arg1 == Static227.width) {
			Static16.normalizedY = Static334.normalizedX;
		} else {
			Static16.normalizedY = new int[arg1];
			for (@Pc(72) int local72 = 0; local72 < arg1; local72++) {
				Static16.normalizedY[local72] = (local72 << 12) / arg1;
			}
		}
		Static148.heightMask = arg1 - 1;
		Static24.height = arg1;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
	public static void method2790() {
		Static12.aSprite_2 = null;
		Static119.aSprite_7 = null;
		Static137.aSprite = null;
		Static332.aSpriteArray23 = null;
		Static276.aClass130_4 = null;
		Static76.mapDots = null;
		Static15.aSpriteArray3 = null;
		Static200.aClass130_3 = null;
		Static232.aSpriteArray17 = null;
		Static126.aSpriteArray22 = null;
		Static116.aSpriteArray8 = null;
		Static123.aSpriteArray10 = null;
		Static124.aSpriteArray27 = null;
		Static52.aClass130_1 = null;
		Static288.aSpriteArray21 = null;
		Static352.aSpriteArray25 = null;
		Static62.aSpriteArray9 = null;
		Static230.headHints = null;
	}
}
