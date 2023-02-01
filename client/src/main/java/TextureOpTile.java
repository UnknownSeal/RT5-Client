import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class TextureOpTile extends TextureOp {

	@OriginalMember(owner = "client!vn", name = "S", descriptor = "I")
	private int anInt6990 = 4;

	@OriginalMember(owner = "client!vn", name = "T", descriptor = "I")
	private int anInt6991 = 4;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	public TextureOpTile() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.colorImageCache.get(arg0);
		if (super.colorImageCache.invalid) {
			@Pc(25) int local25 = Static227.width / this.anInt6991;
			@Pc(30) int local30 = Static24.height / this.anInt6990;
			@Pc(49) int[][] local49;
			if (local30 > 0) {
				@Pc(39) int local39 = arg0 % local30;
				local49 = this.getChildColorOutput(0, Static24.height * local39 / local30);
			} else {
				local49 = this.getChildColorOutput(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[2];
			@Pc(73) int[] local73 = local11[0];
			@Pc(77) int[] local77 = local11[1];
			@Pc(81) int[] local81 = local11[2];
			for (@Pc(83) int local83 = 0; local83 < Static227.width; local83++) {
				@Pc(89) int local89;
				if (local25 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local83 % local25;
					local89 = Static227.width * local95 / local25;
				}
				local73[local83] = local61[local89];
				local77[local83] = local65[local89];
				local81[local83] = local69[local89];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(28) int local28 = Static227.width / this.anInt6991;
			@Pc(33) int local33 = Static24.height / this.anInt6990;
			@Pc(49) int[] local49;
			@Pc(39) int local39;
			if (local33 > 0) {
				local39 = y % local33;
				local49 = this.getChildMonochromeOutput(0, local39 * Static24.height / local33);
			} else {
				local49 = this.getChildMonochromeOutput(0, 0);
			}
			for (local39 = 0; local39 < Static227.width; local39++) {
				if (local28 > 0) {
					@Pc(67) int local67 = local39 % local28;
					local11[local39] = local49[local67 * Static227.width / local28];
				} else {
					local11[local39] = local49[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(0) int opcode) {
		if (opcode == 0) {
			this.anInt6991 = buffer.g1();
		} else if (opcode == 1) {
			this.anInt6990 = buffer.g1();
		}
	}
}
