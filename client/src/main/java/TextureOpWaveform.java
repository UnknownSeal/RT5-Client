import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class TextureOpWaveform extends TextureOp {

	@OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
	private int anInt3132 = 0;

	@OriginalMember(owner = "client!jl", name = "S", descriptor = "I")
	private int anInt3135 = 0;

	@OriginalMember(owner = "client!jl", name = "U", descriptor = "I")
	private int anInt3137 = 1;

	static {
		new LocalisedText("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	public TextureOpWaveform() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt3132 = arg1.g1();
		} else if (arg0 == 1) {
			this.anInt3135 = arg1.g1();
		} else if (arg0 == 3) {
			this.anInt3137 = arg1.g1();
		}
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
	@Override
	public void postDecode() {
		TextureOp.createTrigonometryTables();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(16) int[] local16 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(24) int local24 = Static16.normalizedY[y];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static227.width; local32++) {
				@Pc(38) int local38 = Static334.normalizedX[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(58) int local58;
				if (this.anInt3132 == 0) {
					local58 = (local38 - local24) * this.anInt3137;
				} else {
					@Pc(70) int local70 = local30 * local30 + local44 * local44 >> 12;
					local58 = (int) (Math.sqrt((double) ((float) local70 / 4096.0F)) * 4096.0D);
					local58 = (int) ((double) (local58 * this.anInt3137) * 3.141592653589793D);
				}
				local58 -= local58 & 0xFFFFF000;
				if (this.anInt3135 == 0) {
					local58 = TextureOp.SINE[local58 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3135 == 2) {
					local58 -= 2048;
					if (local58 < 0) {
						local58 = -local58;
					}
					local58 = 2048 - local58 << 1;
				}
				local16[local32] = local58;
			}
		}
		return local16;
	}
}
