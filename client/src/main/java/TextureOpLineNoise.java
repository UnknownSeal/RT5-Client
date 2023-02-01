import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class TextureOpLineNoise extends TextureOp {

	@OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
	private int maxAngle = 4096;

	@OriginalMember(owner = "client!dj", name = "ab", descriptor = "I")
	private int seed = 0;

	@OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
	private int minAngle = 0;

	@OriginalMember(owner = "client!dj", name = "X", descriptor = "I")
	private int length = 16;

	@OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
	private int count = 2000;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
	public TextureOpLineNoise() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] destination = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(28) int local28 = this.maxAngle >> 1;
			@Pc(33) int[][] pixels = super.monochromeImageCache.get();
			@Pc(40) Random random = new Random((long) this.seed);
			for (@Pc(42) int i = 0; i < this.count; i++) {
				@Pc(62) int angle = this.maxAngle <= 0 ? this.minAngle : this.minAngle + Static382.nextInt(random, this.maxAngle) - local28;
				@Pc(68) int local68 = angle >> 4 & 0xFF;
				@Pc(73) int x0 = Static382.nextInt(random, Static227.width);
				@Pc(78) int y0 = Static382.nextInt(random, Static24.height);
				@Pc(90) int x1 = x0 + (this.length * TextureOp.COSINE[local68] >> 12);
				@Pc(102) int y1 = y0 + (this.length * TextureOp.SINE[local68] >> 12);
				@Pc(107) int local107 = y1 - y0;
				@Pc(112) int local112 = x1 - x0;
				if (local112 != 0 || local107 != 0) {
					if (local112 < 0) {
						local112 = -local112;
					}
					if (local107 < 0) {
						local107 = -local107;
					}
					@Pc(143) boolean local143 = local112 < local107;
					@Pc(147) int local147;
					@Pc(149) int local149;
					if (local143) {
						local147 = x0;
						local149 = x1;
						x0 = y0;
						y0 = local147;
						x1 = y1;
						y1 = local149;
					}
					if (x1 < x0) {
						local147 = x0;
						x0 = x1;
						local149 = y0;
						y0 = y1;
						x1 = local147;
						y1 = local149;
					}
					local147 = y0;
					local149 = x1 - x0;
					@Pc(184) int local184 = y1 - y0;
					@Pc(189) int local189 = -local149 / 2;
					@Pc(193) int local193 = 2048 / local149;
					@Pc(202) int local202 = 1024 - (Static382.nextInt(random, 4096) >> 2);
					if (local184 < 0) {
						local184 = -local184;
					}
					@Pc(217) int local217 = y0 < y1 ? 1 : -1;
					for (@Pc(219) int local219 = x0; local219 < x1; local219++) {
						@Pc(232) int local232 = local202 + (local219 - x0) * local193 + 1024;
						@Pc(236) int local236 = local219 & Static73.anInt1721;
						@Pc(240) int local240 = Static148.heightMask & local147;
						if (local143) {
							pixels[local240][local236] = local232;
						} else {
							pixels[local236][local240] = local232;
						}
						local189 += local184;
						if (local189 > 0) {
							local147 -= -local217;
							local189 -= local149;
						}
					}
				}
			}
		}
		return destination;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(0) int opcode) {
		if (opcode == 0) {
			this.seed = buffer.g1();
		} else if (opcode == 1) {
			this.count = buffer.g2();
		} else if (opcode == 2) {
			this.length = buffer.g1();
		} else if (opcode == 3) {
			this.minAngle = buffer.g2();
		} else if (opcode == 4) {
			this.maxAngle = buffer.g2();
		}
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V")
	@Override
	public void postDecode() {
		TextureOp.createTrigonometryTables();
	}
}
