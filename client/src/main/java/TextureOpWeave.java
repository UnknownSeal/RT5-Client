import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class TextureOpWeave extends TextureOp {

	@OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
	private int thickness = 585;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public TextureOpWeave() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] destination = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(25) int local25 = Static16.normalizedY[y];
			for (@Pc(27) int local27 = 0; local27 < Static227.width; local27++) {
				@Pc(33) int local33 = Static334.normalizedX[local27];
				@Pc(73) int local73;
				if (local33 > this.thickness && 4096 - this.thickness > local33 && 2048 - this.thickness < local25 && local25 < this.thickness + 2048) {
					local73 = 2048 - local33;
					local73 = local73 >= 0 ? local73 : -local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.thickness;
					destination[local27] = 4096 - local73;
				} else if (local33 > 2048 - this.thickness && this.thickness + 2048 > local33) {
					local73 = local25 - 2048;
					local73 = local73 < 0 ? -local73 : local73;
					local73 -= this.thickness;
					local73 <<= 0xC;
					destination[local27] = local73 / (2048 - this.thickness);
				} else if (this.thickness > local25 || local25 > 4096 - this.thickness) {
					local73 = local33 - 2048;
					@Pc(181) int local181 = local73 >= 0 ? local73 : -local73;
					@Pc(186) int local186 = local181 - this.thickness;
					@Pc(190) int local190 = local186 << 12;
					destination[local27] = local190 / (2048 - this.thickness);
				} else if (this.thickness <= local33 && 4096 - this.thickness >= local33) {
					destination[local27] = 0;
				} else {
					local73 = 2048 - local25;
					local73 = local73 < 0 ? -local73 : local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.thickness;
					destination[local27] = 4096 - local73;
				}
			}
		}
		return destination;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(0) int opcode) {
		if (opcode == 0) {
			this.thickness = buffer.g2();
		}
	}
}
