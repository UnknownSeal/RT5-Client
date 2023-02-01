import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class TextureOpCurve extends TextureOp {

	@OriginalMember(owner = "client!wt", name = "S", descriptor = "[I")
	private int[] anIntArray525;

	@OriginalMember(owner = "client!wt", name = "T", descriptor = "[[I")
	private int[][] markers;

	@OriginalMember(owner = "client!wt", name = "Z", descriptor = "[I")
	private int[] anIntArray526;

	@OriginalMember(owner = "client!wt", name = "R", descriptor = "I")
	private int anInt7259 = 0;

	@OriginalMember(owner = "client!wt", name = "V", descriptor = "[S")
	private final short[] aShortArray129 = new short[257];

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V")
	public TextureOpCurve() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(16) int[] destination = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(26) int[] source = this.getChildMonochromeOutput(0, y);
			for (@Pc(28) int x = 0; x < Static227.width; x++) {
				@Pc(36) int local36 = source[x] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				destination[x] = this.aShortArray129[local36];
			}
		}
		return destination;
	}

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)V")
	private void method6485() {
		@Pc(8) int[] local8 = this.markers[0];
		@Pc(21) int[] local21 = this.markers[1];
		@Pc(30) int[] local30 = this.markers[this.markers.length - 2];
		@Pc(39) int[] local39 = this.markers[this.markers.length - 1];
		this.anIntArray526 = new int[] { local30[0] + local30[0] - local39[0], local30[1] + -local39[1] + local30[1] };
		this.anIntArray525 = new int[] { local8[0] + local8[0] - local21[0], local8[1] + -local21[1] + local8[1] };
	}

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "(I)V")
	private void method6487() {
		@Pc(4) int local4 = this.anInt7259;
		@Pc(24) int local24;
		@Pc(22) int local22;
		@Pc(55) int[] local55;
		@Pc(60) int[] local60;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(86) int local86;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.markers.length - 1 && this.markers[local24][0] <= local22; local24++) {
				}
				local55 = this.markers[local24 - 1];
				local60 = this.markers[local24];
				local69 = this.method6488(local24 - 2)[1];
				local73 = local55[1];
				local77 = local60[1];
				local86 = this.method6488(local24 + 1)[1];
				@Pc(103) int local103 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				@Pc(109) int local109 = local103 * local103 >> 12;
				@Pc(119) int local119 = local73 + local86 - local69 - local77;
				@Pc(127) int local127 = local69 - local119 - local73;
				@Pc(132) int local132 = local77 - local69;
				@Pc(144) int local144 = local109 * (local119 * local103 >> 12) >> 12;
				@Pc(150) int local150 = local127 * local109 >> 12;
				@Pc(156) int local156 = local103 * local132 >> 12;
				@Pc(165) int local165 = local150 + local144 + local156 + local73;
				if (local165 <= -32768) {
					local165 = -32767;
				}
				if (local165 >= 32768) {
					local165 = 32767;
				}
				this.aShortArray129[local4] = (short) local165;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.markers.length - 1 > local24 && local22 >= this.markers[local24][0]; local24++) {
				}
				local55 = this.markers[local24 - 1];
				local60 = this.markers[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - TextureOp.COSINE[local69 >> 5 & 0xFF] >> 1;
				local77 = 4096 - local73;
				local86 = local73 * local60[1] + local77 * local55[1] >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray129[local4] = (short) local86;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.markers.length - 1 > local24 && this.markers[local24][0] <= local22; local24++) {
				}
				local55 = this.markers[local24 - 1];
				local60 = this.markers[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - local69;
				local77 = local69 * local60[1] + local55[1] * local73 >> 12;
				if (local77 <= -32768) {
					local77 = -32767;
				}
				if (local77 >= 32768) {
					local77 = 32767;
				}
				this.aShortArray129[local4] = (short) local77;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)V")
	@Override
	public void postDecode() {
		if (this.markers == null) {
			this.markers = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.markers.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt7259 == 2) {
			this.method6485();
		}
		TextureOp.createTrigonometryTables();
		this.method6487();
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)[I")
	private int[] method6488(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray525;
		} else if (this.markers.length <= arg0) {
			return this.anIntArray526;
		} else {
			return this.markers[arg0];
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(0) int opcode) {
		if (opcode != 0) {
			return;
		}
		this.anInt7259 = buffer.g1();
		this.markers = new int[buffer.g1()][2];
		for (@Pc(22) int i = 0; i < this.markers.length; i++) {
			this.markers[i][0] = buffer.g2();
			this.markers[i][1] = buffer.g2();
		}
	}
}
