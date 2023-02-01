import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class TextureOpBricks extends TextureOp {

	@OriginalMember(owner = "client!pk", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
	private int anInt5008;

	@OriginalMember(owner = "client!pk", name = "U", descriptor = "I")
	private int anInt5011;

	@OriginalMember(owner = "client!pk", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!pk", name = "Y", descriptor = "[I")
	private int[] anIntArray350;

	@OriginalMember(owner = "client!pk", name = "fb", descriptor = "I")
	private int anInt5020;

	@OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
	private int anInt5010 = 1024;

	@OriginalMember(owner = "client!pk", name = "X", descriptor = "I")
	private int anInt5013 = 8;

	@OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
	private int anInt5006 = 409;

	@OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
	private int anInt5009 = 0;

	@OriginalMember(owner = "client!pk", name = "cb", descriptor = "I")
	private int anInt5017 = 81;

	@OriginalMember(owner = "client!pk", name = "db", descriptor = "I")
	private int anInt5018 = 1024;

	@OriginalMember(owner = "client!pk", name = "ab", descriptor = "I")
	private int anInt5015 = 204;

	@OriginalMember(owner = "client!pk", name = "gb", descriptor = "I")
	private int anInt5021 = 4;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public TextureOpBricks() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V")
	@Override
	public void postDecode() {
		this.method4594();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] destination = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = Static16.normalizedY[y] + this.anInt5009; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (local22 < this.anInt5013 && this.anIntArray350[local22] <= local29) {
				local22++;
			}
			@Pc(62) int local62 = local22 - 1;
			@Pc(73) boolean local73 = (local22 & 0x1) == 0;
			@Pc(78) int local78 = this.anIntArray350[local22];
			@Pc(85) int local85 = this.anIntArray350[local22 - 1];
			if (local29 > this.anInt5020 + local85 && local29 < local78 - this.anInt5020) {
				for (@Pc(103) int local103 = 0; local103 < Static227.width; local103++) {
					@Pc(107) int local107 = 0;
					@Pc(116) int local116 = local73 ? this.anInt5018 : -this.anInt5018;
					@Pc(128) int local128;
					for (local128 = Static334.normalizedX[local103] + (this.anInt5011 * local116 >> 12); local128 < 0; local128 += 4096) {
					}
					while (local128 > 4096) {
						local128 -= 4096;
					}
					while (local107 < this.anInt5021 && local128 >= this.anIntArrayArray42[local62][local107]) {
						local107++;
					}
					@Pc(165) int local165 = local107 - 1;
					@Pc(172) int local172 = this.anIntArrayArray42[local62][local107];
					@Pc(179) int local179 = this.anIntArrayArray42[local62][local165];
					if (local179 + this.anInt5020 < local128 && local172 - this.anInt5020 > local128) {
						destination[local103] = this.anIntArrayArray41[local62][local165];
					} else {
						destination[local103] = 0;
					}
				}
			} else {
				Static403.fill(destination, 0, Static227.width, 0);
			}
		}
		return destination;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(0) int opcode) {
		if (opcode == 0) {
			this.anInt5021 = buffer.g1();
		} else if (opcode == 1) {
			this.anInt5013 = buffer.g1();
		} else if (opcode == 2) {
			this.anInt5006 = buffer.g2();
		} else if (opcode == 3) {
			this.anInt5015 = buffer.g2();
		} else if (opcode == 4) {
			this.anInt5018 = buffer.g2();
		} else if (opcode == 5) {
			this.anInt5009 = buffer.g2();
		} else if (opcode == 6) {
			this.anInt5017 = buffer.g2();
		} else if (opcode == 7) {
			this.anInt5010 = buffer.g2();
		}
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(Z)V")
	private void method4594() {
		@Pc(12) Random local12 = new Random((long) this.anInt5013);
		this.anInt5008 = 4096 / this.anInt5013;
		this.anInt5020 = this.anInt5017 / 2;
		this.anInt5011 = 4096 / this.anInt5021;
		@Pc(35) int local35 = this.anInt5011 / 2;
		@Pc(46) int local46 = this.anInt5008 / 2;
		this.anIntArrayArray41 = new int[this.anInt5013][this.anInt5021];
		this.anIntArray350 = new int[this.anInt5013 + 1];
		this.anIntArrayArray42 = new int[this.anInt5013][this.anInt5021 + 1];
		this.anIntArray350[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt5013; local76++) {
			@Pc(83) int local83;
			@Pc(95) int local95;
			if (local76 > 0) {
				local83 = this.anInt5008;
				local95 = (Static382.nextInt(local12, 4096) - 2048) * this.anInt5015 >> 12;
				@Pc(103) int local103 = local83 + (local95 * local46 >> 12);
				this.anIntArray350[local76] = this.anIntArray350[local76 - 1] + local103;
			}
			this.anIntArrayArray42[local76][0] = 0;
			for (local83 = 0; local83 < this.anInt5021; local83++) {
				if (local83 > 0) {
					local95 = this.anInt5011;
					@Pc(144) int local144 = (Static382.nextInt(local12, 4096) - 2048) * this.anInt5006 >> 12;
					local95 += local144 * local35 >> 12;
					this.anIntArrayArray42[local76][local83] = this.anIntArrayArray42[local76][local83 - 1] + local95;
				}
				this.anIntArrayArray41[local76][local83] = this.anInt5010 > 0 ? 4096 - Static382.nextInt(local12, this.anInt5010) : 4096;
			}
			this.anIntArrayArray42[local76][this.anInt5021] = 4096;
		}
		this.anIntArray350[this.anInt5013] = 4096;
	}
}
