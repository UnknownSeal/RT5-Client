import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class BasType {

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "[I")
	public int[] anIntArray425;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "[[I")
	public int[][] equipmentTransforms;

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
	public int walkSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
	public int runCwSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
	private int anInt6279 = 0;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
	public int anInt6272 = -1;

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
	public int walkCwSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
	public int walkCcwSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
	public int anInt6278 = 0;

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
	public int readyCwSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
	public int anInt6266 = 0;

	@OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
	public int anInt6287 = 0;

	@OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
	public int anInt6288 = -1;

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
	public int anInt6281 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
	public int runSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
	public int readySeqID = -1;

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
	public int crawlSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
	public int anInt6274 = -1;

	@OriginalMember(owner = "client!ti", name = "J", descriptor = "Z")
	public boolean aBoolean424 = true;

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "[I")
	public int[] anIntArray426 = null;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
	public int runCcwSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
	public int readyCcwSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
	public int anInt6283 = 0;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
	public int crawlFollowCwSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
	public int walkFollowCcwSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "B", descriptor = "[I")
	public int[] anIntArray427 = null;

	@OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
	public int runFollow180SeqID = -1;

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
	public int crawlFollowCcwSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
	public int walkFollowCwSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
	public int crawlCcwSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
	public int anInt6280 = 0;

	@OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
	public int crawlFollow180SeqID = -1;

	@OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
	public int anInt6290 = 0;

	@OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
	public int anInt6300 = 0;

	@OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
	public int walkFollow180SeqID = -1;

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
	public int runFollowCcwSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
	public int anInt6303 = 0;

	@OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
	public int anInt6304 = -1;

	@OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
	public int runFollowCwSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
	public int anInt6302 = 0;

	@OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
	public int crawlCwSeqID = -1;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(13) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(opcode, buffer);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!bt;I)V")
	private void decode(@OriginalArg(0) int opcode, @OriginalArg(1) Buffer buffer) {
		if (opcode == 1) {
			this.readySeqID = buffer.g2();
			this.walkSeqID = buffer.g2();
			if (this.readySeqID == 65535) {
				this.readySeqID = -1;
			}
			if (this.walkSeqID == 65535) {
				this.walkSeqID = -1;
			}
		} else if (opcode == 2) {
			this.crawlSeqID = buffer.g2();
		} else if (opcode == 3) {
			this.crawlFollow180SeqID = buffer.g2();
		} else if (opcode == 4) {
			this.crawlFollowCcwSeqID = buffer.g2();
		} else if (opcode == 5) {
			this.crawlFollowCwSeqID = buffer.g2();
		} else if (opcode == 6) {
			this.runSeqID = buffer.g2();
		} else if (opcode == 7) {
			this.runFollow180SeqID = buffer.g2();
		} else if (opcode == 8) {
			this.runFollowCcwSeqID = buffer.g2();
		} else if (opcode == 9) {
			this.runFollowCwSeqID = buffer.g2();
		} else if (opcode == 26) {
			this.anInt6287 = (short) (buffer.g1() * 4);
			this.anInt6290 = (short) (buffer.g1() * 4);
		} else if (opcode == 27) {
			if (this.equipmentTransforms == null) {
				this.equipmentTransforms = new int[12][];
			}
			@Pc(137) int slot = buffer.g1();
			this.equipmentTransforms[slot] = new int[6];
			for (@Pc(335) int i = 0; i < 6; i++) {
				this.equipmentTransforms[slot][i] = buffer.g2b_dup();
			}
		} else if (opcode == 28) {
			this.anIntArray425 = new int[12];
			for (int local137 = 0; local137 < 12; local137++) {
				this.anIntArray425[local137] = buffer.g1();
				if (this.anIntArray425[local137] == 255) {
					this.anIntArray425[local137] = -1;
				}
			}
		} else if (opcode == 29) {
			this.anInt6266 = buffer.g1();
		} else if (opcode == 30) {
			this.anInt6300 = buffer.g2();
		} else if (opcode == 31) {
			this.anInt6302 = buffer.g1();
		} else if (opcode == 32) {
			this.anInt6278 = buffer.g2();
		} else if (opcode == 33) {
			this.anInt6281 = buffer.g2b_dup();
		} else if (opcode == 34) {
			this.anInt6303 = buffer.g1();
		} else if (opcode == 35) {
			this.anInt6280 = buffer.g2();
		} else if (opcode == 36) {
			this.anInt6283 = buffer.g2b_dup();
		} else if (opcode == 37) {
			this.anInt6274 = buffer.g1();
		} else if (opcode == 38) {
			this.readyCcwSeqID = buffer.g2();
		} else if (opcode == 39) {
			this.readyCwSeqID = buffer.g2();
		} else if (opcode == 40) {
			this.walkFollow180SeqID = buffer.g2();
		} else if (opcode == 41) {
			this.walkFollowCcwSeqID = buffer.g2();
		} else if (opcode == 42) {
			this.walkFollowCwSeqID = buffer.g2();
		} else if (opcode == 43) {
			this.anInt6304 = buffer.g2();
		} else if (opcode == 44) {
			this.anInt6288 = buffer.g2();
		} else if (opcode == 45) {
			this.anInt6272 = buffer.g2();
		} else if (opcode == 46) {
			this.crawlCcwSeqID = buffer.g2();
		} else if (opcode == 47) {
			this.crawlCwSeqID = buffer.g2();
		} else if (opcode == 48) {
			this.runCcwSeqID = buffer.g2();
		} else if (opcode == 49) {
			this.runCwSeqID = buffer.g2();
		} else if (opcode == 50) {
			this.walkCcwSeqID = buffer.g2();
		} else if (opcode == 51) {
			this.walkCwSeqID = buffer.g2();
		} else if (opcode == 52) {
			int local137 = buffer.g1();
			this.anIntArray426 = new int[local137];
			this.anIntArray427 = new int[local137];
			for (int local335 = 0; local335 < local137; local335++) {
				this.anIntArray426[local335] = buffer.g2();
				@Pc(348) int local348 = buffer.g1();
				this.anIntArray427[local335] = local348;
				this.anInt6279 += local348;
			}
		} else if (opcode == 53) {
			this.aBoolean424 = false;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Z")
	public boolean method5691(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.readySeqID == arg0) {
			return true;
		} else {
			if (this.anIntArray426 != null) {
				for (@Pc(32) int local32 = 0; local32 < this.anIntArray426.length; local32++) {
					if (arg0 == this.anIntArray426[local32]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)I")
	public int method5695() {
		if (this.readySeqID != -1) {
			return this.readySeqID;
		} else if (this.anIntArray426 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) ((double) this.anInt6279 * Math.random());
			@Pc(30) int local30;
			for (local30 = 0; local28 >= this.anIntArray427[local30]; local30++) {
				local28 -= this.anIntArray427[local30];
			}
			return this.anIntArray426[local30];
		}
	}
}
