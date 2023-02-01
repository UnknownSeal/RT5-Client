import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class TextureOpFlip extends TextureOp {

	@OriginalMember(owner = "client!ai", name = "U", descriptor = "Z")
	private boolean aBoolean16 = true;

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "Z")
	private boolean aBoolean15 = true;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public TextureOpFlip() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(16) int[] local16 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(33) int[] local33 = this.getChildMonochromeOutput(0, this.aBoolean16 ? Static148.heightMask - y : y);
			if (this.aBoolean15) {
				for (@Pc(46) int local46 = 0; local46 < Static227.width; local46++) {
					local16[local46] = local33[Static73.anInt1721 - local46];
				}
			} else {
				Static403.method4604(local33, 0, local16, 0, Static227.width);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(0) int opcode) {
		if (opcode == 0) {
			this.aBoolean15 = buffer.g1() == 1;
		} else if (opcode == 1) {
			this.aBoolean16 = buffer.g1() == 1;
		} else if (opcode == 2) {
			super.monochrome = buffer.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.colorImageCache.get(arg0);
		if (super.colorImageCache.invalid) {
			@Pc(34) int[][] local34 = this.getChildColorOutput(0, this.aBoolean16 ? Static148.heightMask - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			@Pc(63) int local63;
			if (this.aBoolean15) {
				for (local63 = 0; local63 < Static227.width; local63++) {
					local50[local63] = local38[Static73.anInt1721 - local63];
					local54[local63] = local42[Static73.anInt1721 - local63];
					local58[local63] = local46[Static73.anInt1721 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static227.width; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local11;
	}
}
