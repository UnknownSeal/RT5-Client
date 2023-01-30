import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class TextureOpVerticalGradient extends TextureOp {

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	public TextureOpVerticalGradient() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(14) int[] destination = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			Static403.fill(destination, 0, Static227.width, Static16.normalizedY[y]);
		}
		return destination;
	}
}
