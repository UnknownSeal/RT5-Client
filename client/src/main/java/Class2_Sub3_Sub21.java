import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class2_Sub3_Sub21 extends TextureOp {

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(16) int[] local16 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(24) int local24 = Static16.normalizedY[y];
			for (@Pc(26) int local26 = 0; local26 < Static227.width; local26++) {
				local16[local26] = this.method3587(local24, Static334.normalizedX[local26]) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(III)I")
	private int method3587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 1 ^ local9;
		return 4096 - (local15 * (local15 * local15 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
