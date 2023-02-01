import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class TextureOpNoise extends TextureOp {

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public TextureOpNoise() {
		super(0, true);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(16) int[] destination = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(24) int heightFraction = Static16.normalizedY[y];
			for (@Pc(26) int x = 0; x < Static227.width; x++) {
				destination[x] = this.noise(heightFraction, Static334.normalizedX[x]) % 4096;
			}
		}
		return destination;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(III)I")
	private int noise(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int noise = arg0 * 57 + arg1;
		@Pc(15) int local15 = noise << 1 ^ noise;
		return 4096 - (local15 * (local15 * local15 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
