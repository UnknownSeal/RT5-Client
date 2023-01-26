import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Packet extends Buffer {

	@OriginalMember(owner = "client!bp", name = "w", descriptor = "[I")
	public static final int[] BITMASK = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!qg", name = "Mb", descriptor = "I")
	private int bitOffset;

	@OriginalMember(owner = "client!qg", name = "Qb", descriptor = "Lclient!sq;")
	private IsaacRandom isaac;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(I)V")
	public Packet(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "(I)I")
	public int method4863() {
		@Pc(22) int local22 = super.data[super.offset++] - this.isaac.getNext() & 0xFF;
		return local22 < 128 ? local22 : (super.data[super.offset++] - this.isaac.getNext() & 0xFF) + (local22 - 128 << 8);
	}

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "(B)V")
	public void accessBytes() {
		super.offset = (this.bitOffset + 7) / 8;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "([BIII)V")
	public void method4865(@OriginalArg(0) byte[] src, @OriginalArg(1) int len) {
		for (@Pc(12) int i = 0; i < len; i++) {
			src[i] = (byte) (super.data[super.offset++] - this.isaac.getNext());
		}
	}

	// put, 1 byte, isaac encrypted
	@OriginalMember(owner = "client!qg", name = "k", descriptor = "(II)V")
	public void p1isaac(@OriginalArg(0) int opcode) {
		super.data[super.offset++] = (byte) (opcode + this.isaac.getNext());
	}

	// get, n bits
	@OriginalMember(owner = "client!qg", name = "h", descriptor = "(BI)I")
	public int gBit(@OriginalArg(1) int n) {
		@Pc(10) int byteOffset = this.bitOffset >> 3;
		@Pc(17) int msb = 8 - (this.bitOffset & 0x7);
		this.bitOffset += n;

		@Pc(32) int val = 0;
		while (msb < n) {
			val += (super.data[byteOffset++] & BITMASK[msb]) << n - msb;
			n -= msb;
			msb = 8;
		}

		if (n == msb) {
			val += super.data[byteOffset] & BITMASK[msb];
		} else {
			val += super.data[byteOffset] >> msb - n & BITMASK[n];
		}

		return val;
	}

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "(I)V")
	public void accessBits() {
		this.bitOffset = super.offset * 8;
	}

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "(B)Z")
	public boolean method4869() {
		@Pc(17) int value = super.data[super.offset] - this.isaac.peekNext() & 0xFF;
		return value >= 128;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([IB)V")
	public void initIsaac(@OriginalArg(0) int[] seed) {
		this.isaac = new IsaacRandom(seed);
	}

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "(BI)I")
	public int method4872(@OriginalArg(1) int bytes) {
		return bytes * 8 - this.bitOffset;
	}

}
