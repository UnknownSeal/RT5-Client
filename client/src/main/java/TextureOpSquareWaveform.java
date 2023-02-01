import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class TextureOpSquareWaveform extends TextureOp {

	@OriginalMember(owner = "client!sd", name = "P", descriptor = "[I")
	private int[] anIntArray389;

	@OriginalMember(owner = "client!sd", name = "Y", descriptor = "[I")
	private int[] anIntArray390;

	@OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
	private int mode = 0;

	@OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
	private int ration = 2048;

	@OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
	private int frequency = 10;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public TextureOpSquareWaveform() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
	@Override
	public void postDecode() {
		this.method5368();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(0) int opcode) {
		if (opcode == 0) {
			this.frequency = buffer.g1();
		} else if (opcode == 1) {
			this.ration = buffer.g2();
		} else if (opcode == 2) {
			this.mode = buffer.g1();
		}
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V")
	private void method5368() {
		@Pc(7) int local7 = 0;
		this.anIntArray389 = new int[this.frequency + 1];
		this.anIntArray390 = new int[this.frequency + 1];
		@Pc(32) int local32 = 4096 / this.frequency;
		@Pc(39) int local39 = local32 * this.ration >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.frequency; local41++) {
			this.anIntArray389[local41] = local7;
			this.anIntArray390[local41] = local7 + local39;
			local7 += local32;
		}
		this.anIntArray389[this.frequency] = 4096;
		this.anIntArray390[this.frequency] = this.anIntArray390[0] + 4096;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(17) int[] destination = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(25) int local25 = Static16.normalizedY[y];
			@Pc(34) int local34;
			if (this.mode == 0) {
				@Pc(138) short local138 = 0;
				for (local34 = 0; local34 < this.frequency; local34++) {
					if (local25 >= this.anIntArray389[local34] && this.anIntArray389[local34 + 1] > local25) {
						if (local25 < this.anIntArray390[local34]) {
							local138 = 4096;
						}
						break;
					}
				}
				Static403.fill(destination, 0, Static227.width, local138);
			} else {
				for (@Pc(30) int x = 0; x < Static227.width; x++) {
					local34 = 0;
					@Pc(36) short local36 = 0;
					@Pc(40) int normalizedX = Static334.normalizedX[x];
					@Pc(43) int mode = this.mode;
					if (mode == 1) {
						local34 = normalizedX;
					} else if (mode == 2) {
						local34 = (normalizedX + local25 - 4096 >> 1) + 2048;
					} else if (mode == 3) {
						local34 = (normalizedX - local25 >> 1) + 2048;
					}
					for (int i = 0; i < this.frequency; i++) {
						if (this.anIntArray389[i] <= local34 && local34 < this.anIntArray389[i + 1]) {
							if (this.anIntArray390[i] > local34) {
								local36 = 4096;
							}
							break;
						}
					}
					destination[x] = local36;
				}
			}
		}
		return destination;
	}
}
