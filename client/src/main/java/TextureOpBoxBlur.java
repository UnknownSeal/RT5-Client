import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class TextureOpBoxBlur extends TextureOp {

	@OriginalMember(owner = "client!ar", name = "Q", descriptor = "I")
	private int radiusX = 1;

	@OriginalMember(owner = "client!ar", name = "S", descriptor = "I")
	private int radiusY = 1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	public TextureOpBoxBlur() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] destination = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(31) int windowY = this.radiusY + this.radiusY + 1;
			@Pc(35) int windowYReciprocal = 65536 / windowY;
			@Pc(44) int windowX = this.radiusX + this.radiusX + 1;
			@Pc(48) int windowXReciprocal = 65536 / windowX;
			@Pc(51) int[][] horizontalAverages = new int[windowY][];
			@Pc(72) int local72;
			for (@Pc(57) int y0 = y - this.radiusY; y0 <= y + this.radiusY; y0++) {
				@Pc(67) int[] source = this.getChildMonochromeOutput(0, Static148.heightMask & y0);
				@Pc(70) int[] horizontalAverage = new int[Static227.width];
				local72 = 0;
				for (@Pc(76) int local76 = -this.radiusX; local76 <= this.radiusX; local76++) {
					local72 += source[Static73.anInt1721 & local76];
				}
				@Pc(93) int local93 = 0;
				while (local93 < Static227.width) {
					horizontalAverage[local93] = local72 * windowXReciprocal >> 16;
					local72 -= source[local93 - this.radiusX & Static73.anInt1721];
					local93++;
					local72 += source[Static73.anInt1721 & local93 + this.radiusX];
				}
				horizontalAverages[y0 + this.radiusY - y] = horizontalAverage;
			}
			for (@Pc(154) int local154 = 0; local154 < Static227.width; local154++) {
				@Pc(158) int local158 = 0;
				for (local72 = 0; local72 < windowY; local72++) {
					local158 += horizontalAverages[local72][local154];
				}
				destination[local154] = local158 * windowYReciprocal >> 16;
			}
		}
		return destination;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int opcode, @OriginalArg(1) Buffer buffer) {
		if (opcode == 0) {
			this.radiusX = buffer.g1();
		} else if (opcode == 1) {
			this.radiusY = buffer.g1();
		} else if (opcode == 2) {
			super.monochrome = buffer.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] destination = super.colorImageCache.get(arg0);
		if (super.colorImageCache.invalid) {
			@Pc(31) int local31 = this.radiusY + this.radiusY + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.radiusX + this.radiusX + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(73) int local73;
			@Pc(75) int local75;
			for (@Pc(55) int local55 = arg0 - this.radiusY; local55 <= this.radiusY + arg0; local55++) {
				@Pc(65) int[][] source = this.getChildColorOutput(0, local55 & Static148.heightMask);
				@Pc(69) int[][] local69 = new int[3][Static227.width];
				@Pc(71) int local71 = 0;
				local73 = 0;
				local75 = 0;
				@Pc(79) int[] sourceRed = source[0];
				@Pc(83) int[] sourceGreen = source[1];
				@Pc(87) int[] sourceBlue = source[2];
				for (@Pc(91) int local91 = -this.radiusX; local91 <= this.radiusX; local91++) {
					@Pc(97) int local97 = local91 & Static73.anInt1721;
					local71 += sourceRed[local97];
					local75 += sourceBlue[local97];
					local73 += sourceGreen[local97];
				}
				@Pc(124) int[] local124 = local69[0];
				@Pc(128) int[] local128 = local69[1];
				@Pc(132) int[] local132 = local69[2];
				@Pc(134) int local134 = 0;
				while (Static227.width > local134) {
					local124[local134] = local71 * local47 >> 16;
					local128[local134] = local73 * local47 >> 16;
					local132[local134] = local75 * local47 >> 16;
					@Pc(167) int local167 = local134 - this.radiusX & Static73.anInt1721;
					local75 -= sourceBlue[local167];
					local134++;
					local73 -= sourceGreen[local167];
					local71 -= sourceRed[local167];
					@Pc(193) int local193 = Static73.anInt1721 & this.radiusX + local134;
					local71 += sourceRed[local193];
					local75 += sourceBlue[local193];
					local73 += sourceGreen[local193];
				}
				local50[this.radiusY + local55 - arg0] = local69;
			}
			@Pc(239) int[] destinationRed = destination[0];
			@Pc(243) int[] destinationGreen = destination[1];
			@Pc(247) int[] destinationBlue = destination[2];
			for (local73 = 0; local73 < Static227.width; local73++) {
				local75 = 0;
				@Pc(255) int local255 = 0;
				@Pc(257) int local257 = 0;
				for (@Pc(259) int local259 = 0; local259 < local31; local259++) {
					@Pc(265) int[][] local265 = local50[local259];
					local257 += local265[2][local73];
					local255 += local265[1][local73];
					local75 += local265[0][local73];
				}
				destinationRed[local73] = local35 * local75 >> 16;
				destinationGreen[local73] = local35 * local255 >> 16;
				destinationBlue[local73] = local35 * local257 >> 16;
			}
		}
		return destination;
	}
}
