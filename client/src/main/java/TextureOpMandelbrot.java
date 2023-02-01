import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class TextureOpMandelbrot extends TextureOp {

	@OriginalMember(owner = "client!ft", name = "P", descriptor = "I")
	private int anInt2179 = 20;

	@OriginalMember(owner = "client!ft", name = "O", descriptor = "I")
	private int anInt2178 = 1365;

	@OriginalMember(owner = "client!ft", name = "W", descriptor = "I")
	private int anInt2184 = 0;

	@OriginalMember(owner = "client!ft", name = "T", descriptor = "I")
	private int anInt2182 = 0;

	static {
		new LocalisedText("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
	public TextureOpMandelbrot() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(16) int[] local16 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			for (@Pc(22) int local22 = 0; local22 < Static227.width; local22++) {
				@Pc(36) int local36 = this.anInt2184 + (Static334.normalizedX[local22] << 12) / this.anInt2178;
				@Pc(48) int local48 = (Static16.normalizedY[y] << 12) / this.anInt2178 + this.anInt2182;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local68 + local62 < 16384 && this.anInt2179 > local70) {
					local56 = local48 + (local56 * local54 >> 12) * 2;
					local54 = local62 + local36 - local68;
					local68 = local56 * local56 >> 12;
					local70++;
					local62 = local54 * local54 >> 12;
				}
				local16[local22] = local70 < this.anInt2179 - 1 ? (local70 << 12) / this.anInt2179 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(0) int opcode) {
		if (opcode == 0) {
			this.anInt2178 = buffer.g2();
		} else if (opcode == 1) {
			this.anInt2179 = buffer.g2();
		} else if (opcode == 2) {
			this.anInt2184 = buffer.g2();
		} else if (opcode == 3) {
			this.anInt2182 = buffer.g2();
		}
	}
}
