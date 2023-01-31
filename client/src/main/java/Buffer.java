import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public class Buffer extends Node {

	@OriginalMember(owner = "client!qk", name = "gb", descriptor = "[[B")
	public static final byte[][] allocatedMin = new byte[1000][];

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "[[B")
	public static final byte[][] allocatedMid = new byte[250][];

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "[[B")
	public static final byte[][] allocatedMax = new byte[50][];

	@OriginalMember(owner = "client!n", name = "r", descriptor = "[I")
	public static final int[] CRC32_TABLE = new int[256];

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "[J")
	public static final long[] CRC64_TABLE = new long[256];

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
	public static int allocatedMinCount = 0;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
	public static int allocatedMidCount = 0;

	@OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
	public static int allocatedMaxCount = 0;

	@OriginalMember(owner = "client!bt", name = "kb", descriptor = "[B")
	public byte[] bytes;

	@OriginalMember(owner = "client!bt", name = "U", descriptor = "I")
	public int offset;

	static {
		for (@Pc(4) int i = 0; i < 256; i++) {
			@Pc(7) int temp = i;

			for (@Pc(9) int j = 0; j < 8; j++) {
				if ((temp & 0x1) == 1) {
					temp = temp >>> 1 ^ 0xEDB88320;
				} else {
					temp >>>= 0x1;
				}
			}

			CRC32_TABLE[i] = temp;
		}

		for (@Pc(43) int i = 0; i < 256; i++) {
			@Pc(47) long temp = i;

			for (@Pc(49) int j = 0; j < 8; j++) {
				if ((temp & 0x1L) == 1L) {
					temp = temp >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					temp >>>= 0x1;
				}
			}

			CRC64_TABLE[i] = temp;
		}
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V")
	public Buffer(@OriginalArg(0) int size) {
		this.bytes = allocate(size);
		this.offset = 0;
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "([B)V")
	public Buffer(@OriginalArg(0) byte[] src) {
		this.offset = 0;
		this.bytes = src;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] allocate(@OriginalArg(0) int length) {
		@Pc(19) byte[] data;

		if (length == 100 && allocatedMinCount > 0) {
			data = allocatedMin[--allocatedMinCount];
			allocatedMin[allocatedMinCount] = null;
			return data;
		} else if (length == 5000 && allocatedMidCount > 0) {
			data = allocatedMid[--allocatedMidCount];
			allocatedMid[allocatedMidCount] = null;
			return data;
		} else if (length == 30000 && allocatedMaxCount > 0) {
			data = allocatedMax[--allocatedMaxCount];
			allocatedMax[allocatedMaxCount] = null;
			return data;
		}

		return new byte[length];
	}

	// generate checksum
	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III[B)I")
	public static int crc32(@OriginalArg(0) int length, @OriginalArg(1) int offset, @OriginalArg(3) byte[] src) {
		@Pc(7) int crc = -1;

		for (@Pc(16) int i = offset; i < length; i++) {
			crc = CRC32_TABLE[(src[i] ^ crc) & 0xFF] ^ crc >>> 8;
		}

		return ~crc;
	}

	// get, 8 bytes
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)J")
	public final long g8() {
		@Pc(10) long high = (long) this.mg4() & 0xFFFFFFFFL;
		@Pc(19) long low = (long) this.mg4() & 0xFFFFFFFFL;
		return low + (high << 32);
	}

	// get, data
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIIZ)V")
	public final void gdata(@OriginalArg(0) byte[] src, @OriginalArg(2) int length) {
		for (@Pc(11) int i = 0; i < length; i++) {
			src[i] = this.bytes[this.offset++];
		}
	}

	// get, 2 bytes, signed, subtract from
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)I")
	public final int g2bsub() {
		this.offset += 2;
		@Pc(38) int value = (this.bytes[this.offset - 1] - 128 & 0xFF) + ((this.bytes[this.offset - 2] & 0xFF) << 8);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	// get, 1 byte, negate
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)B")
	public final byte g1neg() {
		return (byte) -this.bytes[this.offset++];
	}

	// add checksum
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)I")
	public final int addcrc(@OriginalArg(0) int off) {
		@Pc(18) int checksum = crc32(this.offset, off, this.bytes);
		this.p4(checksum);
		return checksum;
	}

	// inverse, get, 2 bytes
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Z)I")
	public final int ig2() {
		this.offset += 2;
		return (this.bytes[this.offset - 2] & 0xFF) + ((this.bytes[this.offset - 1] & 0xFF) << 8);
	}

	// get, 1 byte, negate
	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)I")
	public final int g1bneg() {
		return -this.bytes[this.offset++] & 0xFF;
	}

	// middle, put, 4 bytes
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)V")
	public final void mp4(@OriginalArg(1) int value) {
		this.bytes[this.offset++] = (byte) (value >> 16);
		this.bytes[this.offset++] = (byte) (value >> 24);
		this.bytes[this.offset++] = (byte) value;
		this.bytes[this.offset++] = (byte) (value >> 8);
	}

	// get, 2 bytes, add to
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)I")
	public final int g2add() {
		this.offset += 2;
		return (this.bytes[this.offset - 1] - 128 & 0xFF) + ((this.bytes[this.offset - 2] & 0xFF) << 8);
	}

	// put, VarLong
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIJ)V")
	public final void pVarLong(@OriginalArg(1) int length, @OriginalArg(2) long value) {
		@Pc(2) int bytes = length - 1;
		if (bytes < 0 || bytes > 7) {
			throw new IllegalArgumentException();
		}

		for (@Pc(25) int shift = bytes * 8; shift >= 0; shift -= 8) {
			this.bytes[this.offset++] = (byte) (value >> shift);
		}
	}

	// compare checksums
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(Z)Z")
	public final boolean checkcrc() {
		this.offset -= 4;

		@Pc(23) int thisCrc = crc32(this.offset, 0, this.bytes);
		@Pc(27) int otherCrc = this.mg4();
		return otherCrc == thisCrc;
	}

	// get, jstr
	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)Ljava/lang/String;")
	public final String gjstr() {
		@Pc(14) int start = this.offset;
		while (this.bytes[this.offset++] != 0) {}
		@Pc(37) int length = this.offset - start - 1;
		return length == 0 ? "" : Static47.decodeString(start, this.bytes, length);
	}

	// get, 1 byte, subtract from
	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)I")
	public final int g1sub() {
		return 128 - this.bytes[this.offset++] & 0xFF;
	}

	// get, VarInt
	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(B)I")
	public final int gVarInt() {
		@Pc(21) byte b = this.bytes[this.offset++];
		@Pc(23) int value = 0;

		while (b < 0) {
			value = (b & 0x7F | value) << 7;
			b = this.bytes[this.offset++];
		}

		return value | b;
	}

	// put, 4 bytes
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI)V")
	public final void p4(@OriginalArg(1) int value) {
		this.bytes[this.offset++] = (byte) (value >> 24);
		this.bytes[this.offset++] = (byte) (value >> 16);
		this.bytes[this.offset++] = (byte) (value >> 8);
		this.bytes[this.offset++] = (byte) value;
	}

	// put, 1 byte, negate
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(IB)V")
	public final void p1neg(@OriginalArg(0) int value) {
		this.bytes[this.offset++] = (byte) -value;
	}

	// get, 1 byte
	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(B)I")
	public final int g1() {
		return this.bytes[this.offset++] & 0xFF;
	}

	// inverse, get, 2 bytes, signed, add to
	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(B)I")
	public final int ig2badd() {
		this.offset += 2;
		@Pc(33) int value = (this.bytes[this.offset - 2] - 128 & 0xFF) + ((this.bytes[this.offset - 1] & 0xFF) << 8);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	// get, smart, signed
	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(B)I")
	public final int gsmarts() {
		@Pc(16) int value = this.bytes[this.offset] & 0xFF;
		return value >= 128 ? this.g2() - 32768 : this.g1();
	}

	// get, smart
	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(B)I")
	public final int gsmart() {
		@Pc(19) int value = this.bytes[this.offset] & 0xFF;
		return value >= 128 ? this.g2() - 49152 : this.g1() + -64;
	}

	// put, 1 byte, subtract from
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)V")
	public final void p1sub(@OriginalArg(0) int value) {
		this.bytes[this.offset++] = (byte) (128 - value);
	}

	// (extended) tiny (encryption algorithm) (XTEA), decrypt
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[II)V")
	public final void tinydec(@OriginalArg(2) int[] src, @OriginalArg(3) int offset) {
		@Pc(16) int start = this.offset;
		this.offset = 5;

		@Pc(25) int blocks = (offset - 5) / 8;
		for (@Pc(27) int i = 0; i < blocks; i++) {
			@Pc(33) int v0 = this.mg4();
			@Pc(37) int v1 = this.mg4();
			@Pc(39) int sum = 0xC6EF3720;
			@Pc(43) int rounds = 32;

			while (rounds-- > 0) {
				v1 -= src[sum >>> 11 & 0x3] + sum ^ (v0 >>> 5 ^ v0 << 4) + v0;
				sum -= 0x9E3779B9;
				v0 -= (v1 >>> 5 ^ v1 << 4) + v1 ^ src[sum & 0x3] + sum;
			}

			this.offset -= 8;
			this.p4(v0);
			this.p4(v1);
		}

		this.offset = start;
	}

	// put, jstr
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void pjstr(@OriginalArg(0) String str) {
		@Pc(7) int firstNul = str.indexOf(0);
		if (firstNul >= 0) {
			throw new IllegalArgumentException("NUL character at " + firstNul + " - cannot pjstr");
		}

		this.offset += Static350.encodeString(str.length(), str, this.bytes, this.offset);
		this.bytes[this.offset++] = 0;
	}

	// get, 2 bytes, signed, duplicate (redundant - as g2b)
	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(B)I")
	public final int g2b_dup() {
		this.offset += 2;
		@Pc(37) int value = ((this.bytes[this.offset - 2] & 0xFF) << 8) + (this.bytes[this.offset - 1] & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	// put, smart, signed
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(BI)V")
	public final void psmarts(@OriginalArg(1) int value) {
		if (value >= 0 && value < 128) {
			this.p1(value);
		} else if (value >= 0 && value < 32768) {
			this.p2(value + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	// get, 1 byte, as byte
	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)B")
	public final byte g1b() {
		return this.bytes[this.offset++];
	}

	// put, size, 4 bytes
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZI)V")
	public final void psize4(@OriginalArg(1) int length) {
		this.bytes[this.offset - length - 4] = (byte) (length >> 24);
		this.bytes[this.offset - length - 3] = (byte) (length >> 16);
		this.bytes[this.offset - length - 2] = (byte) (length >> 8);
		this.bytes[this.offset - length - 1] = (byte) length;
	}

	// put, 1 byte, add to
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(BI)V")
	public final void p1add(@OriginalArg(1) int value) {
		this.bytes[this.offset++] = (byte) (value + 128);
	}

	// get, 2 bytes
	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(B)I")
	public final int g2() {
		this.offset += 2;
		return ((this.bytes[this.offset - 2] & 0xFF) << 8) + (this.bytes[this.offset - 1] & 0xFF);
	}

	// inverse, put 2 bytes, duplicate (redundant - as ip2)
	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(II)V")
	public final void ip2_dup(@OriginalArg(0) int value) {
		this.bytes[this.offset++] = (byte) value;
		this.bytes[this.offset++] = (byte) (value >> 8);
	}

	// inverse, get, data
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[BI)V")
	public final void igdata(@OriginalArg(2) byte[] src, @OriginalArg(3) int length) {
		for (@Pc(15) int i = length - 1; i >= 0; i--) {
			src[i] = this.bytes[this.offset++];
		}
	}

	// put, 8 bytes
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IJ)V")
	public final void p8(@OriginalArg(1) long value) {
		this.bytes[this.offset++] = (byte) (value >> 56);
		this.bytes[this.offset++] = (byte) (value >> 48);
		this.bytes[this.offset++] = (byte) (value >> 40);
		this.bytes[this.offset++] = (byte) (value >> 32);
		this.bytes[this.offset++] = (byte) (value >> 24);
		this.bytes[this.offset++] = (byte) (value >> 16);
		this.bytes[this.offset++] = (byte) (value >> 8);
		this.bytes[this.offset++] = (byte) value;
	}

	// inverse, get, 3 bytes
	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)I")
	public final int ig3() {
		this.offset += 3;
		return (this.bytes[this.offset - 1] & 0xFF) + (((this.bytes[this.offset - 3] & 0xFF) << 16) + ((this.bytes[this.offset - 2] & 0xFF) << 8));
	}

	// rsa, encrypt
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void rsaenc(@OriginalArg(0) BigInteger modulus, @OriginalArg(2) BigInteger exponent) {
		@Pc(6) int len = this.offset;
		this.offset = 0;

		@Pc(12) byte[] plaintextBytes = new byte[len];
		this.gdata(plaintextBytes, len);

		@Pc(23) BigInteger plaintext = new BigInteger(plaintextBytes);
		@Pc(36) BigInteger ciphertext = plaintext.modPow(exponent, modulus);
		@Pc(39) byte[] ciphertextBytes = ciphertext.toByteArray();

		this.offset = 0;
		this.p1(ciphertextBytes.length);
		this.pdata(ciphertextBytes, ciphertextBytes.length);
	}

	// get, 4 bytes
	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(Z)I")
	public final int g4() {
		this.offset += 4;
		return ((this.bytes[this.offset - 4] & 0xFF) << 16) + (((this.bytes[this.offset - 3] & 0xFF) << 24) + ((this.bytes[this.offset - 1] & 0xFF) << 8) + (this.bytes[this.offset + -2] & 0xFF));
	}

	// middle, get, 4 bytes
	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(I)I")
	public final int mg4() {
		this.offset += 4;
		return ((this.bytes[this.offset - 3] & 0xFF) << 16) + ((this.bytes[this.offset - 4] & 0xFF) << 24) + ((this.bytes[this.offset + -2] & 0xFF) << 8) + (this.bytes[this.offset + -1] & 0xFF);
	}

	// inverse, put, 4 bytes
	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(BI)V")
	public final void ip4(@OriginalArg(1) int value) {
		this.bytes[this.offset++] = (byte) value;
		this.bytes[this.offset++] = (byte) (value >> 8);
		this.bytes[this.offset++] = (byte) (value >> 16);
		this.bytes[this.offset++] = (byte) (value >> 24);
	}

	// inverse, put, 2 bytes, add to
	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(II)V")
	public final void ip2add(@OriginalArg(0) int value) {
		this.bytes[this.offset++] = (byte) (value + 128);
		this.bytes[this.offset++] = (byte) (value >> 8);
	}

	// get, VarSmart
	@OriginalMember(owner = "client!bt", name = "k", descriptor = "(B)I")
	public final int gVarSmart() {
		@Pc(12) int value = 0;
		@Pc(16) int value2 = this.gsmarts();
		while (value2 == 32767) {
			value2 = this.gsmarts();
			value += 32767;
		}
		return value + value2;
	}

	// inverse, middle, put, 4 bytes
	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(BI)V")
	public final void imp4(@OriginalArg(1) int value) {
		this.bytes[this.offset++] = (byte) (value >> 8);
		this.bytes[this.offset++] = (byte) value;
		this.bytes[this.offset++] = (byte) (value >> 24);
		this.bytes[this.offset++] = (byte) (value >> 16);
	}

	// get, 1 byte, as byte, subtract from
	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(I)B")
	public final byte g1bsub() {
		return (byte) (128 - this.bytes[this.offset++]);
	}

	// put, 1 byte
	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(II)V")
	public final void p1(@OriginalArg(0) int value) {
		this.bytes[this.offset++] = (byte) value;
	}

	// put, 2 bytes
	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(II)V")
	public final void p2(@OriginalArg(0) int value) {
		this.bytes[this.offset++] = (byte) (value >> 8);
		this.bytes[this.offset++] = (byte) value;
	}

	// inverse, get, 4 bytes
	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(B)I")
	public final int ig4() {
		this.offset += 4;
		return ((this.bytes[this.offset - 1] & 0xFF) << 24) + ((this.bytes[this.offset - 2] & 0xFF) << 16) + ((this.bytes[this.offset - 3] & 0xFF) << 8) + (this.bytes[this.offset - 4] & 0xFF);
	}

	// inverse, put, 2 bytes
	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(II)V")
	public final void ip2(@OriginalArg(1) int value) {
		this.bytes[this.offset++] = (byte) value;
		this.bytes[this.offset++] = (byte) (value >> 8);
	}

	// put, 3 bytes
	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(II)V")
	public final void p3(@OriginalArg(1) int value) {
		this.bytes[this.offset++] = (byte) (value >> 16);
		this.bytes[this.offset++] = (byte) (value >> 8);
		this.bytes[this.offset++] = (byte) value;
	}

	// inverse, put, 4 bytes, duplicate (redundant - as ip4)
	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(BI)V")
	public final void ip4_dup(@OriginalArg(1) int value) {
		this.bytes[this.offset++] = (byte) value;
		this.bytes[this.offset++] = (byte) (value >> 8);
		this.bytes[this.offset++] = (byte) (value >> 16);
		this.bytes[this.offset++] = (byte) (value >> 24);
	}

	// put, VarInt
	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(BI)V")
	public final void pVarInt(@OriginalArg(1) int value) {
		if ((value & 0xFFFFFF80) != 0) {
			if ((value & 0xFFFFC000) != 0) {
				if ((value & 0xFFE00000) != 0) {
					if ((value & 0xF0000000) != 0) {
						this.p1(value >>> 28 | 0x80);
					}
					this.p1(value >>> 21 | 0x80);
				}
				this.p1(value >>> 14 | 0x80);
			}
			this.p1(value >>> 7 | 0x80);
		}
		this.p1(value & 0x7F);
	}

	// get, 2 bytes, signed
	@OriginalMember(owner = "client!bt", name = "m", descriptor = "(B)I")
	public final int g2b() {
		this.offset += 2;
		@Pc(31) int value = (this.bytes[this.offset - 2] & 0xFF) + ((this.bytes[this.offset - 1] & 0xFF) << 8);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	// put, size, 2 bytes
	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(II)V")
	public final void psize2(@OriginalArg(1) int length) {
		this.bytes[this.offset - length - 2] = (byte) (length >> 8);
		this.bytes[this.offset - length - 1] = (byte) length;
	}

	// inverse, middle, get, 4 bytes
	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(I)I")
	public final int img4() {
		this.offset += 4;
		return ((this.bytes[this.offset - 2] & 0xFF) << 24) + (((this.bytes[this.offset - 1] & 0xFF) << 16) + (this.bytes[this.offset - 4] << 8 & 0xFF00)) + (this.bytes[this.offset + -3] & 0xFF);
	}

	// inverse, get, 2 bytes, add to
	@OriginalMember(owner = "client!bt", name = "n", descriptor = "(B)I")
	public final int ig2add() {
		this.offset += 2;
		return ((this.bytes[this.offset - 1] & 0xFF) << 8) + (this.bytes[this.offset - 2] - 128 & 0xFF);
	}

	// get, 1 byte, add to
	@OriginalMember(owner = "client!bt", name = "o", descriptor = "(B)B")
	public final byte g1badd() {
		return (byte) (this.bytes[this.offset++] - 128);
	}

	// put, 2 bytes, add to
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(IB)V")
	public final void p2add(@OriginalArg(0) int value) {
		this.bytes[this.offset++] = (byte) (value >> 8);
		this.bytes[this.offset++] = (byte) (value + 128);
	}

	// get, jstr (variant 2, versioned?)
	@OriginalMember(owner = "client!bt", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String gjstr2() {
		@Pc(14) byte version = this.bytes[this.offset++];
		if (version != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}

		@Pc(27) int start = this.offset;
		while (this.bytes[this.offset++] != 0) {}
		@Pc(55) int length = this.offset - start - 1;
		return length == 0 ? "" : Static47.decodeString(start, this.bytes, length);
	}

	// put, data
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI[BI)V")
	public final void pdata(@OriginalArg(2) byte[] src, @OriginalArg(3) int length) {
		for (@Pc(8) int i = 0; i < length; i++) {
			this.bytes[this.offset++] = src[i];
		}
	}

	// inverse, put, add to, data
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIII)V")
	public final void ipadata(@OriginalArg(0) byte[] src, @OriginalArg(2) int length) {
		for (@Pc(11) int i = length - 1; i >= 0; i--) {
			src[i] = (byte) (this.bytes[this.offset++] - 128);
		}
	}

	// (fast) get, str
	@OriginalMember(owner = "client!bt", name = "p", descriptor = "(B)Ljava/lang/String;")
	public final String fastgstr() {
		if (this.bytes[this.offset] == 0) {
			this.offset++;
			return null;
		} else {
			return this.gjstr();
		}
	}

	// get, VarLong
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(ZI)J")
	public final long gVarLong(@OriginalArg(1) int len) {
		@Pc(2) int bytes = len - 1;
		if (bytes < 0 || bytes > 7) {
			throw new IllegalArgumentException();
		}

		@Pc(24) long value = 0L;
		for (@Pc(22) int shift = bytes * 8; shift >= 0; shift -= 8) {
			value |= ((long) this.bytes[this.offset++] & 0xFFL) << shift;
		}
		return value;
	}

	// put, size, 1 byte
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(ZI)V")
	public final void psize1(@OriginalArg(1) int length) {
		this.bytes[this.offset - length - 1] = (byte) length;
	}

	// (extended) tiny (encryption algorithm) (XTEA), encrypt
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([II)V")
	public final void tinyenc(@OriginalArg(0) int[] key) {
		@Pc(17) int blocks = this.offset / 8;
		this.offset = 0;

		for (@Pc(22) int i = 0; i < blocks; i++) {
			@Pc(28) int v0 = this.mg4();
			@Pc(32) int v1 = this.mg4();
			@Pc(34) int sum = 0;
			@Pc(38) int rounds = 32;

			while (rounds-- > 0) {
				v0 += sum + key[sum & 0x3] ^ v1 + (v1 >>> 5 ^ v1 << 4);
				sum += 0x9E3779B9; // hello golden ratio
				v1 += v0 + (v0 >>> 5 ^ v0 << 4) ^ key[sum >>> 11 & 0x3] + sum;
			}

			this.offset -= 8;
			this.p4(v0);
			this.p4(v1);
		}
	}

	// get, 1 byte, add to
	@OriginalMember(owner = "client!bt", name = "q", descriptor = "(B)I")
	public final int g1add() {
		return this.bytes[this.offset++] - 128 & 0xFF;
	}

}
