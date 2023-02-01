import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Filter {

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
	private final int[] inverseGain = new int[2];

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[[[I")
	private final int[][][] gain = new int[2][2][4];

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
	public final int[] pairs = new int[2];

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "[[[I")
	private final int[][][] octaves = new int[2][2][4];

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!bt;Lclient!uf;)V")
	public void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(1) Envelope envelope) {
		@Pc(3) int pairs = buffer.g1();
		this.pairs[0] = pairs >> 4;
		this.pairs[1] = pairs & 0xF;
		if (pairs == 0) {
			this.inverseGain[0] = this.inverseGain[1] = 0;
			return;
		}
		this.inverseGain[0] = buffer.g2();
		this.inverseGain[1] = buffer.g2();
		@Pc(37) int interpolated = buffer.g1();
		for (@Pc(39) int direction = 0; direction < 2; direction++) {
			for (@Pc(42) int i = 0; i < this.pairs[direction]; i++) {
				this.octaves[direction][0][i] = buffer.g2();
				this.gain[direction][0][i] = buffer.g2();
			}
		}
		for (int direction = 0; direction < 2; direction++) {
			for (@Pc(81) int i = 0; i < this.pairs[direction]; i++) {
				if ((interpolated & 0x1 << direction * 4 << i) == 0) {
					this.octaves[direction][1][i] = this.octaves[direction][0][i];
					this.gain[direction][1][i] = this.gain[direction][0][i];
				} else {
					this.octaves[direction][1][i] = buffer.g2();
					this.gain[direction][1][i] = buffer.g2();
				}
			}
		}
		if (interpolated != 0 || this.inverseGain[1] != this.inverseGain[0]) {
			envelope.decodeStages(buffer);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IF)I")
	public int method4469(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.inverseGain[0] + (float) (this.inverseGain[1] - this.inverseGain[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static264.aFloat66 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static264.anInt4839 = (int) (Static264.aFloat66 * 65536.0F);
		}
		if (this.pairs[arg0] == 0) {
			return 0;
		}
		local20 = this.method4470(arg0, 0, arg1);
		Static264.aFloatArrayArray8[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method4472(arg0, 0, arg1));
		Static264.aFloatArrayArray8[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.pairs[arg0]; local77++) {
			local20 = this.method4470(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method4472(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static264.aFloatArrayArray8[arg0][local77 * 2 + 1] = Static264.aFloatArrayArray8[arg0][local77 * 2 - 1] * local101;
			Static264.aFloatArrayArray8[arg0][local77 * 2] = Static264.aFloatArrayArray8[arg0][local77 * 2 - 1] * local97 + Static264.aFloatArrayArray8[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static264.aFloatArrayArray8[arg0][local157] += Static264.aFloatArrayArray8[arg0][local157 - 1] * local97 + Static264.aFloatArrayArray8[arg0][local157 - 2] * local101;
			}
			Static264.aFloatArrayArray8[arg0][1] += Static264.aFloatArrayArray8[arg0][0] * local97 + local101;
			Static264.aFloatArrayArray8[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.pairs[0] * 2; local226++) {
				Static264.aFloatArrayArray8[0][local226] *= Static264.aFloat66;
			}
		}
		for (local226 = 0; local226 < this.pairs[arg0] * 2; local226++) {
			Static264.anIntArrayArray40[arg0][local226] = (int) (Static264.aFloatArrayArray8[arg0][local226] * 65536.0F);
		}
		return this.pairs[arg0] * 2;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIF)F")
	private float method4470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.gain[arg0][0][arg1] + arg2 * (float) (this.gain[arg0][1][arg1] - this.gain[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIF)F")
	private float method4472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.octaves[arg0][0][arg1] + arg2 * (float) (this.octaves[arg0][1][arg1] - this.octaves[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static264.method4471(local34);
	}
}
