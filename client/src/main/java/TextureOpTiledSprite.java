import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class TextureOpTiledSprite extends TextureOpSprite {

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(11) int[][] local11 = super.colorImageCache.get(y);
		if (super.colorImageCache.invalid && this.loadSprite()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(44) int local44 = y % super.height * super.height;
			for (@Pc(46) int local46 = 0; local46 < Static227.width; local46++) {
				@Pc(58) int local58 = super.pixels[local46 % super.width + local44];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
