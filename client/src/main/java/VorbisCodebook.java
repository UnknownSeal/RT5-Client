import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class VorbisCodebook {

	@OriginalMember(owner = "client!p", name = "f", descriptor = "[I")
	private int[] entryTree;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "I")
	public final int dimensions;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "I")
	private final int entries;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "[I")
	private final int[] lengths;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "[I")
	private int[] multiplicands;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "[[F")
	private float[][] valueVector;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
	public VorbisCodebook() {
		Static267.readBits(24);
		this.dimensions = Static267.readBits(16);
		this.entries = Static267.readBits(24);
		this.lengths = new int[this.entries];
		@Pc(23) boolean ordered = Static267.readBit() != 0;
		if (ordered) {
			@Pc(27) int i = 0;
			@Pc(32) int length = Static267.readBits(5) + 1;
			while (i < this.entries) {
				@Pc(41) int n = Static267.readBits(Static287.bitCount(this.entries - i));
				for (@Pc(43) int j = 0; j < n; j++) {
					this.lengths[i++] = length;
				}
				length++;
			}
		} else {
			@Pc(66) boolean sparse = Static267.readBit() != 0;
			for (int i = 0; i < this.entries; i++) {
				if (sparse && Static267.readBit() == 0) {
					this.lengths[i] = 0;
				} else {
					this.lengths[i] = Static267.readBits(5) + 1;
				}
			}
		}
		this.createEntryTree();
		int lookupType = Static267.readBits(4);
		if (lookupType > 0) {
			@Pc(103) float local103 = Static267.float32Unpack(Static267.readBits(32));
			@Pc(107) float local107 = Static267.float32Unpack(Static267.readBits(32));
			int valueBits = Static267.readBits(4) + 1;
			@Pc(118) boolean sequenceP = Static267.readBit() != 0;
			@Pc(127) int lookupValues;
			if (lookupType == 1) {
				lookupValues = lookup1Values(this.entries, this.dimensions);
			} else {
				lookupValues = this.entries * this.dimensions;
			}
			this.multiplicands = new int[lookupValues];
			for (@Pc(140) int i = 0; i < lookupValues; i++) {
				this.multiplicands[i] = Static267.readBits(valueBits);
			}
			this.valueVector = new float[this.entries][this.dimensions];
			@Pc(163) int local163;
			@Pc(166) float local166;
			@Pc(168) int local168;
			@Pc(170) int local170;
			if (lookupType == 1) {
				for (local163 = 0; local163 < this.entries; local163++) {
					local166 = 0.0F;
					local168 = 1;
					for (local170 = 0; local170 < this.dimensions; local170++) {
						@Pc(177) int local177 = local163 / local168 % lookupValues;
						@Pc(189) float local189 = (float) this.multiplicands[local177] * local107 + local103 + local166;
						this.valueVector[local163][local170] = local189;
						if (sequenceP) {
							local166 = local189;
						}
						local168 *= lookupValues;
					}
				}
				return;
			}
			for (local163 = 0; local163 < this.entries; local163++) {
				local166 = 0.0F;
				local168 = local163 * this.dimensions;
				for (local170 = 0; local170 < this.dimensions; local170++) {
					@Pc(240) float local240 = (float) this.multiplicands[local168] * local107 + local103 + local166;
					this.valueVector[local163][local170] = local240;
					if (sequenceP) {
						local166 = local240;
					}
					local168++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I")
	public static int lookup1Values(@OriginalArg(0) int entries, @OriginalArg(1) int dimensions) {
		@Pc(10) int returValue;
		for (returValue = (int) Math.pow(entries, 1.0D / (double) dimensions) + 1; Static10.pow(dimensions, returValue) > entries; returValue--) {
		}
		return returValue;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()[F")
	public float[] decodeVq() {
		return this.valueVector[this.decodeScalar()];
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
	public int decodeScalar() {
		@Pc(1) int node;
		for (node = 0; this.entryTree[node] >= 0; node = Static267.readBit() == 0 ? node + 1 : this.entryTree[node]) {
		}
		return ~this.entryTree[node];
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "()V")
	private void createEntryTree() {
		@Pc(3) int[] codewords = new int[this.entries];
		@Pc(6) int[] nextCodewords = new int[33];
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(40) int local40;
		@Pc(49) int local49;
		@Pc(54) int local54;
		@Pc(63) int local63;
		for (@Pc(8) int local8 = 0; local8 < this.entries; local8++) {
			local14 = this.lengths[local8];
			if (local14 != 0) {
				local22 = 0x1 << 32 - local14;
				local26 = nextCodewords[local14];
				codewords[local8] = local26;
				if ((local26 & local22) == 0) {
					local40 = local26 | local22;
					for (local49 = local14 - 1; local49 >= 1; local49--) {
						local54 = nextCodewords[local49];
						if (local54 != local26) {
							break;
						}
						local63 = 0x1 << 32 - local49;
						if ((local54 & local63) != 0) {
							nextCodewords[local49] = nextCodewords[local49 - 1];
							break;
						}
						nextCodewords[local49] = local54 | local63;
					}
				} else {
					local40 = nextCodewords[local14 - 1];
				}
				nextCodewords[local14] = local40;
				for (local49 = local14 + 1; local49 <= 32; local49++) {
					local54 = nextCodewords[local49];
					if (local54 == local26) {
						nextCodewords[local49] = local40;
					}
				}
			}
		}
		this.entryTree = new int[8];
		local14 = 0;
		for (local22 = 0; local22 < this.entries; local22++) {
			local26 = this.lengths[local22];
			if (local26 != 0) {
				local40 = codewords[local22];
				local49 = 0;
				for (local54 = 0; local54 < local26; local54++) {
					local63 = Integer.MIN_VALUE >>> local54;
					if ((local40 & local63) == 0) {
						local49++;
					} else {
						if (this.entryTree[local49] == 0) {
							this.entryTree[local49] = local14;
						}
						local49 = this.entryTree[local49];
					}
					if (local49 >= this.entryTree.length) {
						@Pc(178) int[] local178 = new int[this.entryTree.length * 2];
						for (@Pc(180) int local180 = 0; local180 < this.entryTree.length; local180++) {
							local178[local180] = this.entryTree[local180];
						}
						this.entryTree = local178;
					}
				}
				this.entryTree[local49] = ~local22;
				if (local49 >= local14) {
					local14 = local49 + 1;
				}
			}
		}
	}
}
