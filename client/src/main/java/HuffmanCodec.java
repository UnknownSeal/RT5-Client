import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class HuffmanCodec {

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "[I")
	private final int[] codewords;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "[B")
	private final byte[] bits;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "[I")
	private int[] symbolTree;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "([B)V")
	public HuffmanCodec(@OriginalArg(0) byte[] bits) {
		@Pc(16) int[] nextCodewords = new int[33];
		@Pc(6) int symbols = bits.length;
		this.codewords = new int[symbols];
		this.bits = bits;
		this.symbolTree = new int[8];
		@Pc(22) int nextNode = 0;
		for (@Pc(24) int symbol = 0; symbol < symbols; symbol++) {
			@Pc(30) byte codewordBits = bits[symbol];
			if (codewordBits != 0) {
				@Pc(42) int bit = 0x1 << 32 - codewordBits;
				@Pc(46) int codeword = nextCodewords[codewordBits];
				this.codewords[symbol] = codeword;
				@Pc(61) int nextcodeWord;
				if ((codeword & bit) == 0) {
					for (@Pc(67) int i = codewordBits - 1; i >= 1; i--) {
						@Pc(73) int nextCodeword2 = nextCodewords[i];
						if (nextCodeword2 != codeword) {
							break;
						}
						@Pc(85) int bit2 = 0x1 << 32 - i;
						if ((bit2 & nextCodeword2) != 0) {
							nextCodewords[i] = nextCodewords[i - 1];
							break;
						}
						nextCodewords[i] = nextCodeword2 | bit2;
					}
					nextcodeWord = codeword | bit;
				} else {
					nextcodeWord = nextCodewords[codewordBits - 1];
				}
				nextCodewords[codewordBits] = nextcodeWord;
				for (int i = codewordBits + 1; i <= 32; i++) {
					if (nextCodewords[i] == codeword) {
						nextCodewords[i] = nextcodeWord;
					}
				}
				int node = 0;
				for (int i = 0; i < codewordBits; i++) {
					@Pc(152) int bit2 = Integer.MIN_VALUE >>> i;
					if ((bit2 & codeword) == 0) {
						node++;
					} else {
						if (this.symbolTree[node] == 0) {
							this.symbolTree[node] = nextNode;
						}
						node = this.symbolTree[node];
					}
					if (this.symbolTree.length <= node) {
						@Pc(194) int[] newSymbolTree = new int[this.symbolTree.length * 2];
						for (@Pc(196) int j = 0; j < this.symbolTree.length; j++) {
							newSymbolTree[j] = this.symbolTree[j];
						}
						this.symbolTree = newSymbolTree;
					}
				}
				if (nextNode <= node) {
					nextNode = node + 1;
				}
				this.symbolTree[node] = ~symbol;
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "([B[BIIII)I")
	public int encode(@OriginalArg(0) byte[] destination, @OriginalArg(1) byte[] source, @OriginalArg(3) int sourceOffset, @OriginalArg(4) int destinationOffset, @OriginalArg(5) int length) {
		@Pc(7) int previousCodeword = 0;
		@Pc(15) int position = destinationOffset << 3;
		while (sourceOffset < length) {
			@Pc(23) int symbol = source[sourceOffset] & 0xFF;
			@Pc(28) int codeword = this.codewords[symbol];
			@Pc(33) byte codewordBits = this.bits[symbol];
			if (codewordBits == 0) {
				throw new RuntimeException("No codeword for data value " + symbol);
			}
			@Pc(50) int bytePosition = position >> 3;
			@Pc(54) int bitPosition = position & 0x7;
			previousCodeword &= -bitPosition >> 31;
			@Pc(71) int endBytePosition = (codewordBits + bitPosition - 1 >> 3) + bytePosition;
			@Pc(72) int bitPosition2 = bitPosition + 24;
			destination[bytePosition] = (byte) (previousCodeword |= codeword >>> bitPosition2);
			if (endBytePosition > bytePosition) {
				bitPosition = bitPosition2 - 8;
				bytePosition++;
				destination[bytePosition] = (byte) (previousCodeword = codeword >>> bitPosition);
				if (bytePosition < endBytePosition) {
					bitPosition -= 8;
					bytePosition++;
					destination[bytePosition] = (byte) (previousCodeword = codeword >>> bitPosition);
					if (bytePosition < endBytePosition) {
						bitPosition -= 8;
						bytePosition++;
						destination[bytePosition] = (byte) (previousCodeword = codeword >>> bitPosition);
						if (bytePosition < endBytePosition) {
							bitPosition -= 8;
							bytePosition++;
							destination[bytePosition] = (byte) (previousCodeword = codeword << -bitPosition);
						}
					}
				}
			}
			position += codewordBits;
			sourceOffset++;
		}
		return (position + 7 >> 3) - destinationOffset;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I[BIII[B)I")
	public int decode(@OriginalArg(0) int length, @OriginalArg(1) byte[] destination, @OriginalArg(2) int destinationOffset, @OriginalArg(3) int sourceOffset, @OriginalArg(5) byte[] source) {
		if (length == 0) {
			return 0;
		}
		@Pc(18) int node = 0;
		@Pc(20) int sourcePosition = sourceOffset;
		while (true) {
			@Pc(24) byte b = source[sourcePosition];
			if (b >= 0) {
				node++;
			} else {
				node = this.symbolTree[node];
			}
			@Pc(43) int node2;
			if ((node2 = this.symbolTree[node]) < 0) {
				destination[destinationOffset++] = (byte) ~node2;
				if (destinationOffset >= length) {
					break;
				}
				node = 0;
			}
			if ((b & 0x40) == 0) {
				node++;
			} else {
				node = this.symbolTree[node];
			}
			@Pc(82) int node3;
			if ((node3 = this.symbolTree[node]) < 0) {
				destination[destinationOffset++] = (byte) ~node3;
				if (destinationOffset >= length) {
					break;
				}
				node = 0;
			}
			if ((b & 0x20) == 0) {
				node++;
			} else {
				node = this.symbolTree[node];
			}
			@Pc(124) int node4;
			if ((node4 = this.symbolTree[node]) < 0) {
				destination[destinationOffset++] = (byte) ~node4;
				if (destinationOffset >= length) {
					break;
				}
				node = 0;
			}
			if ((b & 0x10) == 0) {
				node++;
			} else {
				node = this.symbolTree[node];
			}
			@Pc(163) int node5;
			if ((node5 = this.symbolTree[node]) < 0) {
				destination[destinationOffset++] = (byte) ~node5;
				if (destinationOffset >= length) {
					break;
				}
				node = 0;
			}
			if ((b & 0x8) == 0) {
				node++;
			} else {
				node = this.symbolTree[node];
			}
			@Pc(202) int node6;
			if ((node6 = this.symbolTree[node]) < 0) {
				destination[destinationOffset++] = (byte) ~node6;
				if (destinationOffset >= length) {
					break;
				}
				node = 0;
			}
			if ((b & 0x4) == 0) {
				node++;
			} else {
				node = this.symbolTree[node];
			}
			@Pc(238) int node7;
			if ((node7 = this.symbolTree[node]) < 0) {
				destination[destinationOffset++] = (byte) ~node7;
				if (destinationOffset >= length) {
					break;
				}
				node = 0;
			}
			if ((b & 0x2) == 0) {
				node++;
			} else {
				node = this.symbolTree[node];
			}
			@Pc(273) int node8;
			if ((node8 = this.symbolTree[node]) < 0) {
				destination[destinationOffset++] = (byte) ~node8;
				if (destinationOffset >= length) {
					break;
				}
				node = 0;
			}
			if ((b & 0x1) == 0) {
				node++;
			} else {
				node = this.symbolTree[node];
			}
			@Pc(308) int local308;
			if ((local308 = this.symbolTree[node]) < 0) {
				destination[destinationOffset++] = (byte) ~local308;
				if (destinationOffset >= length) {
					break;
				}
				node = 0;
			}
			sourcePosition++;
		}
		return sourcePosition + 1 - sourceOffset;
	}
}
