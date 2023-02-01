import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class TextureOpMonochromeEdgeDetector extends TextureOp {

	@OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
	private int anInt246 = 4096;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
	public TextureOpMonochromeEdgeDetector() {
		super(1, true);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(16) int[] local16 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(30) int[] local30 = this.getChildMonochromeOutput(0, Static148.heightMask & y - 1);
			@Pc(36) int[] local36 = this.getChildMonochromeOutput(0, y);
			@Pc(46) int[] local46 = this.getChildMonochromeOutput(0, Static148.heightMask & y + 1);
			for (@Pc(48) int local48 = 0; local48 < Static227.width; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt246;
				@Pc(82) int local82 = (local36[Static73.anInt1721 & local48 + 1] - local36[Static73.anInt1721 & local48 - 1]) * this.anInt246;
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local102 + local96 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local116 == 0 ? 0 : 16777216 / local116;
				local16[local48] = 4096 - local127;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(0) int opcode) {
		if (opcode == 0) {
			this.anInt246 = buffer.g2();
		}
	}
}
