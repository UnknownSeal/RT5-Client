import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class TextureOpTiledSprite extends TextureOpSprite {

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(11) int[][] destination = super.colorImageCache.get(y);
		if (super.colorImageCache.invalid && this.loadSprite()) {
			@Pc(28) int[] destinationRed = destination[0];
			@Pc(32) int[] destinationGreen = destination[1];
			@Pc(36) int[] destinationBlue = destination[2];
			@Pc(44) int sourceY = y % super.height * super.height;
			for (@Pc(46) int x = 0; x < Static227.width; x++) {
				@Pc(58) int color = super.pixels[x % super.width + sourceY];
				destinationBlue[x] = (color & 0xFF) << 4;
				destinationGreen[x] = color >> 4 & 0xFF0;
				destinationRed[x] = color >> 12 & 0xFF0;
			}
		}
		return destination;
	}
}
