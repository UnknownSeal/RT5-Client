import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class TextureOpHerringbone extends TextureOp {

	@OriginalMember(owner = "client!sb", name = "R", descriptor = "I")
	private int anInt5874 = 1;

	@OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
	private int anInt5872 = 204;

	@OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
	private int anInt5877 = 1;

	static {
		new LocalisedText("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public TextureOpHerringbone() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			for (@Pc(17) int local17 = 0; local17 < Static227.width; local17++) {
				@Pc(23) int local23 = Static334.normalizedX[local17];
				@Pc(27) int local27 = Static16.normalizedY[y];
				@Pc(34) int local34 = local23 * this.anInt5874 >> 12;
				@Pc(41) int local41 = local27 * this.anInt5877 >> 12;
				@Pc(51) int local51 = this.anInt5874 * (local23 % (4096 / this.anInt5874));
				@Pc(61) int local61 = this.anInt5877 * (local27 % (4096 / this.anInt5877));
				if (local61 < this.anInt5872) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (this.anInt5872 > local51) {
						local11[local17] = 0;
						continue;
					}
				}
				if (local51 < this.anInt5872) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(0) int opcode) {
		if (opcode == 0) {
			this.anInt5874 = buffer.g1();
		} else if (opcode == 1) {
			this.anInt5877 = buffer.g1();
		} else if (opcode == 2) {
			this.anInt5872 = buffer.g2();
		}
	}
}
