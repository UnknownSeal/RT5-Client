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
	private long physicalPosition;

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
	private int readLength;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
	private int writeLength = 0;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "J")
	private long readPosition = -1L;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "J")
	private long writePosition = -1L;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "Lclient!rl;")
	private final FileOnDisk file;

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "J")
	private long physicalLength;

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "J")
	private long virtualLength;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "[B")
	private final byte[] readBuffer;

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "[B")
	private final byte[] writeBuffer;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "J")
	private long virtualPosition;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!rl;II)V")
	public BufferedFile(@OriginalArg(0) FileOnDisk file, @OriginalArg(1) int byteBufferSize, @OriginalArg(2) int writeBufferSize) throws IOException {
		this.file = file;
		this.virtualLength = this.physicalLength = file.length();
		this.readBuffer = new byte[byteBufferSize];
		this.writeBuffer = new byte[writeBufferSize];
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
	public void write(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int length) throws IOException {
		try {
			if (this.virtualPosition + (long) length > this.virtualLength) {
				this.virtualLength = this.virtualPosition + (long) length;
			}
			if (this.writePosition != -1L && (this.virtualPosition < this.writePosition || (long) this.writeLength + this.writePosition < this.virtualPosition)) {
				this.flush();
			}
			if (this.writePosition != -1L && this.writePosition + (long) this.writeBuffer.length < this.virtualPosition + (long) length) {
				@Pc(92) int n = (int) ((long) this.writeBuffer.length + this.writePosition - this.virtualPosition);
				Static403.copy(arg1, arg0, this.writeBuffer, (int) (this.virtualPosition - this.writePosition), n);
				arg0 += n;
				length -= n;
				this.virtualPosition += n;
				this.writeLength = this.writeBuffer.length;
				this.flush();
			}
			if (length > this.writeBuffer.length) {
				if (this.virtualPosition != this.physicalPosition) {
					this.file.seek(this.virtualPosition);
					this.physicalPosition = this.virtualPosition;
				}
				this.file.write(arg1, length, arg0);
				this.physicalPosition += length;
				if (this.physicalPosition > this.physicalLength) {
					this.physicalLength = this.physicalPosition;
				}
				@Pc(181) long local181 = -1L;
				@Pc(183) long local183 = -1L;
				if (this.virtualPosition >= this.readPosition && this.readPosition + (long) this.readLength > this.virtualPosition) {
					local181 = this.virtualPosition;
				} else if (this.virtualPosition <= this.readPosition && this.virtualPosition + (long) length > this.readPosition) {
					local181 = this.readPosition;
				}
				if ((long) length + this.virtualPosition > this.readPosition && this.virtualPosition + (long) length <= this.readPosition + (long) this.readLength) {
					local183 = (long) length + this.virtualPosition;
				} else if (this.virtualPosition < (long) this.readLength + this.readPosition && this.virtualPosition + (long) length >= (long) this.readLength + this.readPosition) {
					local183 = (long) this.readLength + this.readPosition;
				}
				if (local181 > -1L && local183 > local181) {
					@Pc(319) int local319 = (int) (local183 - local181);
					Static403.copy(arg1, (int) ((long) arg0 + local181 - this.virtualPosition), this.readBuffer, (int) (local181 - this.readPosition), local319);
				}
				this.virtualPosition += length;
			} else if (length > 0) {
				if (this.writePosition == -1L) {
					this.writePosition = this.virtualPosition;
				}
				Static403.copy(arg1, arg0, this.writeBuffer, (int) (this.virtualPosition - this.writePosition), length);
				this.virtualPosition += length;
				if ((long) this.writeLength < this.virtualPosition - this.writePosition) {
					this.writeLength = (int) (this.virtualPosition - this.writePosition);
				}
			}
		} catch (@Pc(407) IOException exception) {
			this.physicalPosition = -1L;
			throw exception;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
	private void fill() throws IOException {
		this.readLength = 0;
		if (this.virtualPosition != this.physicalPosition) {
			this.file.seek(this.virtualPosition);
			this.physicalPosition = this.virtualPosition;
		}
		this.readPosition = this.virtualPosition;
		while (this.readLength < this.readBuffer.length) {
			@Pc(49) int length = this.readBuffer.length - this.readLength;
			if (length > 200000000) {
				length = 200000000;
			}
			@Pc(66) int n = this.file.read(length, this.readLength, this.readBuffer);
			if (n == -1) {
				break;
			}
			this.readLength += n;
			this.physicalPosition += n;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Ljava/io/File;")
	private File getFile() {
		return this.file.getFile();
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)J")
	public long length() {
		return this.virtualLength;
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)V")
	private void flush() throws IOException {
		if (this.writePosition == -1L) {
			return;
		}
		if (this.physicalPosition != this.writePosition) {
			this.file.seek(this.writePosition);
			this.physicalPosition = this.writePosition;
		}
		this.file.write(this.writeBuffer, this.writeLength, 0);
		this.physicalPosition += this.writeLength;
		if (this.physicalLength < this.physicalPosition) {
			this.physicalLength = this.physicalPosition;
		}
		@Pc(64) long local64 = -1L;
		@Pc(66) long local66 = -1L;
		if (this.writePosition >= this.readPosition && this.writePosition < (long) this.readLength + this.readPosition) {
			local64 = this.writePosition;
		} else if (this.readPosition >= this.writePosition && (long) this.writeLength + this.writePosition > this.readPosition) {
			local64 = this.readPosition;
		}
		if (this.readPosition < (long) this.writeLength + this.writePosition && this.readPosition + (long) this.readLength >= (long) this.writeLength + this.writePosition) {
			local66 = this.writePosition + (long) this.writeLength;
		} else if ((long) this.readLength + this.readPosition > this.writePosition && (long) this.readLength + this.readPosition <= this.writePosition - -((long) this.writeLength)) {
			local66 = (long) this.readLength + this.readPosition;
		}
		if (local64 > -1L && local66 > local64) {
			@Pc(199) int local199 = (int) (local66 - local64);
			Static403.copy(this.writeBuffer, (int) (local64 - this.writePosition), this.readBuffer, (int) (local64 - this.readPosition), local199);
		}
		this.writePosition = -1L;
		this.writeLength = 0;
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
			if (this.writePosition != -1L && this.virtualPosition >= this.writePosition && this.virtualPosition + (long) length <= this.writePosition + (long) this.writeLength) {
				Static403.copy(this.writeBuffer, (int) (this.virtualPosition - this.writePosition), bytes, 0, length);
				this.virtualPosition += length;
				return;
			}
			@Pc(86) long originalPosition = this.virtualPosition;
			@Pc(90) int originalLength = length;
			if (this.virtualPosition >= this.readPosition && this.virtualPosition < this.readPosition + (long) this.readLength) {
				@Pc(119) int n = (int) ((long) this.readLength + this.readPosition - this.virtualPosition);
				if (n > length) {
					n = length;
				}
				Static403.copy(this.readBuffer, (int) (this.virtualPosition - this.readPosition), bytes, 0, n);
				arg1 = n;
				this.virtualPosition += n;
				length -= n;
			}
			if (this.readBuffer.length < length) {
				this.file.seek(this.virtualPosition);
				this.physicalPosition = this.virtualPosition;
				while (length > 0) {
					int local119 = this.file.read(length, arg1, bytes);
					if (local119 == -1) {
						break;
					}
					this.virtualPosition += local119;
					length -= local119;
					this.physicalPosition += local119;
					arg1 += local119;
				}
			} else if (length > 0) {
				this.fill();
				int local119 = length;
				if (length > this.readLength) {
					local119 = this.readLength;
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
				} else if (this.writePosition <= originalPosition && originalPosition < this.writePosition + (long) this.writeLength) {
					local307 = originalPosition;
				}
				if (this.writePosition + (long) this.writeLength > originalPosition && (long) this.writeLength + this.writePosition <= originalPosition - -((long) originalLength)) {
					local309 = this.writePosition + (long) this.writeLength;
				} else if ((long) originalLength + originalPosition > this.writePosition && (long) originalLength + originalPosition <= this.writePosition - -((long) this.writeLength)) {
					local309 = originalPosition + (long) originalLength;
				}
				if (local307 > -1L && local307 < local309) {
					@Pc(431) int local431 = (int) (local309 - local307);
					Static403.copy(this.writeBuffer, (int) (local307 - this.writePosition), bytes, (int) (local307 - originalPosition), local431);
					if (this.virtualPosition < local309) {
						length = (int) ((long) length + this.virtualPosition - local309);
						this.virtualPosition = local309;
					}
				}
			}
		} catch (@Pc(473) IOException local473) {
			this.physicalPosition = -1L;
			throw local473;
		}
		if (length > 0) {
			throw new EOFException();
		}
	}
}
