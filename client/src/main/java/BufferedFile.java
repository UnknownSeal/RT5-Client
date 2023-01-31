import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class BufferedFile {

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "J")
	private long aLong169;

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
	private int anInt5728;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
	private int anInt5724 = 0;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "J")
	private long readPosition = -1L;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "J")
	private long writePosition = -1L;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "Lclient!rl;")
	private final FileOnDisk aFileOnDisk_4;

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "J")
	private long aLong172;

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "J")
	private long aLong173;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "[B")
	private final byte[] readBuffer;

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "[B")
	private final byte[] aByteArray74;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "J")
	private long virtualPosition;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!rl;II)V")
	public BufferedFile(@OriginalArg(0) FileOnDisk arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aFileOnDisk_4 = arg0;
		this.aLong173 = this.aLong172 = arg0.method5195();
		this.readBuffer = new byte[arg1];
		this.aByteArray74 = new byte[arg2];
		this.virtualPosition = 0L;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(JB)V")
	public void seek(@OriginalArg(0) long position) throws IOException {
		if (position < 0L) {
			throw new IOException("Invalid seek to " + position + " in file " + this.getFile());
		}
		this.virtualPosition = position;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II[BI)V")
	public void method5214(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.virtualPosition > this.aLong173) {
				this.aLong173 = (long) arg2 + this.virtualPosition;
			}
			if (this.writePosition != -1L && (this.virtualPosition < this.writePosition || (long) this.anInt5724 + this.writePosition < this.virtualPosition)) {
				this.method5218();
			}
			if (this.writePosition != -1L && this.writePosition + (long) this.aByteArray74.length < this.virtualPosition + (long) arg2) {
				@Pc(92) int local92 = (int) ((long) this.aByteArray74.length + this.writePosition - this.virtualPosition);
				Static403.copy(arg1, arg0, this.aByteArray74, (int) (this.virtualPosition - this.writePosition), local92);
				arg0 += local92;
				arg2 -= local92;
				this.virtualPosition += local92;
				this.anInt5724 = this.aByteArray74.length;
				this.method5218();
			}
			if (arg2 > this.aByteArray74.length) {
				if (this.virtualPosition != this.aLong169) {
					this.aFileOnDisk_4.method5196(this.virtualPosition);
					this.aLong169 = this.virtualPosition;
				}
				this.aFileOnDisk_4.write(arg1, arg2, arg0);
				this.aLong169 += arg2;
				if (this.aLong169 > this.aLong172) {
					this.aLong172 = this.aLong169;
				}
				@Pc(181) long local181 = -1L;
				@Pc(183) long local183 = -1L;
				if (this.virtualPosition >= this.readPosition && this.readPosition + (long) this.anInt5728 > this.virtualPosition) {
					local181 = this.virtualPosition;
				} else if (this.virtualPosition <= this.readPosition && this.virtualPosition + (long) arg2 > this.readPosition) {
					local181 = this.readPosition;
				}
				if ((long) arg2 + this.virtualPosition > this.readPosition && this.virtualPosition + (long) arg2 <= this.readPosition + (long) this.anInt5728) {
					local183 = (long) arg2 + this.virtualPosition;
				} else if (this.virtualPosition < (long) this.anInt5728 + this.readPosition && this.virtualPosition + (long) arg2 >= (long) this.anInt5728 + this.readPosition) {
					local183 = (long) this.anInt5728 + this.readPosition;
				}
				if (local181 > -1L && local183 > local181) {
					@Pc(319) int local319 = (int) (local183 - local181);
					Static403.copy(arg1, (int) ((long) arg0 + local181 - this.virtualPosition), this.readBuffer, (int) (local181 - this.readPosition), local319);
				}
				this.virtualPosition += arg2;
			} else if (arg2 > 0) {
				if (this.writePosition == -1L) {
					this.writePosition = this.virtualPosition;
				}
				Static403.copy(arg1, arg0, this.aByteArray74, (int) (this.virtualPosition - this.writePosition), arg2);
				this.virtualPosition += arg2;
				if ((long) this.anInt5724 < this.virtualPosition - this.writePosition) {
					this.anInt5724 = (int) (this.virtualPosition - this.writePosition);
				}
			}
		} catch (@Pc(407) IOException local407) {
			this.aLong169 = -1L;
			throw local407;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
	private void method5215() throws IOException {
		this.anInt5728 = 0;
		if (this.virtualPosition != this.aLong169) {
			this.aFileOnDisk_4.method5196(this.virtualPosition);
			this.aLong169 = this.virtualPosition;
		}
		this.readPosition = this.virtualPosition;
		while (this.anInt5728 < this.readBuffer.length) {
			@Pc(49) int local49 = this.readBuffer.length - this.anInt5728;
			if (local49 > 200000000) {
				local49 = 200000000;
			}
			@Pc(66) int local66 = this.aFileOnDisk_4.method5193(local49, this.anInt5728, this.readBuffer);
			if (local66 == -1) {
				break;
			}
			this.anInt5728 += local66;
			this.aLong169 += local66;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Ljava/io/File;")
	private File getFile() {
		return this.aFileOnDisk_4.method5197();
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)J")
	public long length() {
		return this.aLong173;
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)V")
	private void method5218() throws IOException {
		if (this.writePosition == -1L) {
			return;
		}
		if (this.aLong169 != this.writePosition) {
			this.aFileOnDisk_4.method5196(this.writePosition);
			this.aLong169 = this.writePosition;
		}
		this.aFileOnDisk_4.write(this.aByteArray74, this.anInt5724, 0);
		this.aLong169 += this.anInt5724;
		if (this.aLong172 < this.aLong169) {
			this.aLong172 = this.aLong169;
		}
		@Pc(64) long local64 = -1L;
		@Pc(66) long local66 = -1L;
		if (this.writePosition >= this.readPosition && this.writePosition < (long) this.anInt5728 + this.readPosition) {
			local64 = this.writePosition;
		} else if (this.readPosition >= this.writePosition && (long) this.anInt5724 + this.writePosition > this.readPosition) {
			local64 = this.readPosition;
		}
		if (this.readPosition < (long) this.anInt5724 + this.writePosition && this.readPosition + (long) this.anInt5728 >= (long) this.anInt5724 + this.writePosition) {
			local66 = this.writePosition + (long) this.anInt5724;
		} else if ((long) this.anInt5728 + this.readPosition > this.writePosition && (long) this.anInt5728 + this.readPosition <= this.writePosition - -((long) this.anInt5724)) {
			local66 = (long) this.anInt5728 + this.readPosition;
		}
		if (local64 > -1L && local66 > local64) {
			@Pc(199) int local199 = (int) (local66 - local64);
			Static403.copy(this.aByteArray74, (int) (local64 - this.writePosition), this.readBuffer, (int) (local64 - this.readPosition), local199);
		}
		this.writePosition = -1L;
		this.anInt5724 = 0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "([BB)V")
	public void method5219(@OriginalArg(0) byte[] arg0) throws IOException {
		this.read(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "([BZII)V")
	public void read(@OriginalArg(0) byte[] bytes, @OriginalArg(2) int arg1, @OriginalArg(3) int length) throws IOException {
		try {
			if (bytes.length < length) {
				throw new ArrayIndexOutOfBoundsException(length - bytes.length);
			}
			if (this.writePosition != -1L && this.virtualPosition >= this.writePosition && this.virtualPosition + (long) length <= this.writePosition + (long) this.anInt5724) {
				Static403.copy(this.aByteArray74, (int) (this.virtualPosition - this.writePosition), bytes, 0, length);
				this.virtualPosition += length;
				return;
			}
			@Pc(86) long originalPosition = this.virtualPosition;
			@Pc(90) int originalLength = length;
			if (this.virtualPosition >= this.readPosition && this.virtualPosition < this.readPosition + (long) this.anInt5728) {
				@Pc(119) int n = (int) ((long) this.anInt5728 + this.readPosition - this.virtualPosition);
				if (n > length) {
					n = length;
				}
				Static403.copy(this.readBuffer, (int) (this.virtualPosition - this.readPosition), bytes, 0, n);
				arg1 = n;
				this.virtualPosition += n;
				length -= n;
			}
			if (this.readBuffer.length < length) {
				this.aFileOnDisk_4.method5196(this.virtualPosition);
				this.aLong169 = this.virtualPosition;
				while (length > 0) {
					int local119 = this.aFileOnDisk_4.method5193(length, arg1, bytes);
					if (local119 == -1) {
						break;
					}
					this.virtualPosition += local119;
					length -= local119;
					this.aLong169 += local119;
					arg1 += local119;
				}
			} else if (length > 0) {
				this.method5215();
				int local119 = length;
				if (length > this.anInt5728) {
					local119 = this.anInt5728;
				}
				Static403.copy(this.readBuffer, 0, bytes, arg1, local119);
				arg1 += local119;
				this.virtualPosition += local119;
				length -= local119;
			}
			if (this.writePosition != -1L) {
				if (this.writePosition > this.virtualPosition && length > 0) {
					int local119 = (int) (this.writePosition - this.virtualPosition) + arg1;
					if (length + arg1 < local119) {
						local119 = arg1 + length;
					}
					while (local119 > arg1) {
						length--;
						bytes[arg1++] = 0;
						this.virtualPosition++;
					}
				}
				@Pc(307) long local307 = -1L;
				@Pc(309) long local309 = -1L;
				if (originalPosition <= this.writePosition && this.writePosition < originalPosition + (long) originalLength) {
					local307 = this.writePosition;
				} else if (this.writePosition <= originalPosition && originalPosition < this.writePosition + (long) this.anInt5724) {
					local307 = originalPosition;
				}
				if (this.writePosition + (long) this.anInt5724 > originalPosition && (long) this.anInt5724 + this.writePosition <= originalPosition - -((long) originalLength)) {
					local309 = this.writePosition + (long) this.anInt5724;
				} else if ((long) originalLength + originalPosition > this.writePosition && (long) originalLength + originalPosition <= this.writePosition - -((long) this.anInt5724)) {
					local309 = originalPosition + (long) originalLength;
				}
				if (local307 > -1L && local307 < local309) {
					@Pc(431) int local431 = (int) (local309 - local307);
					Static403.copy(this.aByteArray74, (int) (local307 - this.writePosition), bytes, (int) (local307 - originalPosition), local431);
					if (this.virtualPosition < local309) {
						length = (int) ((long) length + this.virtualPosition - local309);
						this.virtualPosition = local309;
					}
				}
			}
		} catch (@Pc(473) IOException local473) {
			this.aLong169 = -1L;
			throw local473;
		}
		if (length > 0) {
			throw new EOFException();
		}
	}
}
