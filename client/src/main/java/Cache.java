import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Cache {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[B")
	public static final byte[] buffer = new byte[520];
	@OriginalMember(owner = "client!rq", name = "e", descriptor = "Lclient!rn;")
	private BufferedFile index = null;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
	private int maxLength = 65000;

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "Lclient!rn;")
	private BufferedFile data = null;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
	private final int archive;

	static {
		new LocalisedText(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
		new LocalisedText(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(ILclient!rn;Lclient!rn;I)V")
	public Cache(@OriginalArg(0) int archive, @OriginalArg(1) BufferedFile data, @OriginalArg(2) BufferedFile index, @OriginalArg(3) int maxLength) {
		this.index = index;
		this.maxLength = maxLength;
		this.data = data;
		this.archive = archive;
	}

	@OriginalMember(owner = "client!rq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.archive;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I[BBI)Z")
	public boolean write(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) BufferedFile local6 = this.data;
		synchronized (this.data) {
			if (arg0 < 0 || this.maxLength < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method5259(true, arg0, arg2, arg1);
			if (!local35) {
				local35 = this.method5259(false, arg0, arg2, arg1);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZIII[B)Z")
	private boolean method5259(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(13) BufferedFile local13 = this.data;
		synchronized (this.data) {
			try {
				@Pc(27) int local27;
				if (arg0) {
					if ((long) (arg2 * 6 + 6) > this.index.length()) {
						return false;
					}
					this.index.seek((long) (arg2 * 6));
					this.index.read(buffer, 0, 6);
					local27 = (buffer[5] & 0xFF) + ((buffer[4] & 0xFF) << 8) + ((buffer[3] & 0xFF) << 16);
					if (local27 <= 0 || (long) local27 > this.data.length() / 520L) {
						return false;
					}
				} else {
					local27 = (int) ((this.data.length() + 519L) / 520L);
					if (local27 == 0) {
						local27 = 1;
					}
				}
				buffer[1] = (byte) (arg1 >> 8);
				buffer[3] = (byte) (local27 >> 16);
				buffer[2] = (byte) arg1;
				buffer[0] = (byte) (arg1 >> 16);
				buffer[4] = (byte) (local27 >> 8);
				buffer[5] = (byte) local27;
				this.index.seek((long) (arg2 * 6));
				this.index.write(0, buffer, 6);
				@Pc(168) int local168 = 0;
				@Pc(170) int local170 = 0;
				while (local168 < arg1) {
					@Pc(174) int local174 = 0;
					@Pc(209) int local209;
					if (arg0) {
						this.data.seek((long) (local27 * 520));
						try {
							this.data.read(buffer, 0, 8);
						} catch (@Pc(193) EOFException local193) {
							return true;
						}
						local209 = (buffer[1] & 0xFF) + ((buffer[0] & 0xFF) << 8);
						@Pc(223) int local223 = (buffer[3] & 0xFF) + ((buffer[2] & 0xFF) << 8);
						local174 = ((buffer[4] & 0xFF) << 16) + (((buffer[5] & 0xFF) << 8) + (buffer[6] & 0xFF));
						@Pc(252) int local252 = buffer[7] & 0xFF;
						if (local209 != arg2 || local170 != local223 || this.archive != local252) {
							return false;
						}
						if (local174 < 0 || this.data.length() / 520L < (long) local174) {
							return false;
						}
					}
					if (local174 == 0) {
						arg0 = false;
						local174 = (int) ((this.data.length() + 519L) / 520L);
						if (local174 == 0) {
							local174++;
						}
						if (local174 == local27) {
							local174++;
						}
					}
					buffer[3] = (byte) local170;
					if (arg1 - local168 <= 512) {
						local174 = 0;
					}
					buffer[0] = (byte) (arg2 >> 8);
					buffer[1] = (byte) arg2;
					buffer[2] = (byte) (local170 >> 8);
					buffer[7] = (byte) this.archive;
					buffer[4] = (byte) (local174 >> 16);
					buffer[5] = (byte) (local174 >> 8);
					buffer[6] = (byte) local174;
					this.data.seek((long) (local27 * 520));
					this.data.write(0, buffer, 8);
					local209 = arg1 - local168;
					if (local209 > 512) {
						local209 = 512;
					}
					this.data.write(local168, arg3, local209);
					local168 += local209;
					local27 = local174;
					local170++;
				}
				return true;
			} catch (@Pc(433) IOException local433) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)[B")
	public byte[] read(@OriginalArg(1) int group) {
		@Pc(8) BufferedFile local8 = this.data;
		synchronized (this.data) {
			try {
				if (this.index.length() < (long) (group * 6 + 6)) {
					return null;
				}
				this.index.seek((long) (group * 6));
				this.index.read(buffer, 0, 6);
				@Pc(65) int length = (buffer[2] & 0xFF) + ((buffer[0] & 0xFF) << 16) + ((buffer[1] & 0xFF) << 8);
				@Pc(88) int block = ((buffer[3] & 0xFF) << 16) - (-((buffer[4] & 0xFF) << 8) - (buffer[5] & 0xFF));
				if (length < 0 || length > this.maxLength) {
					return null;
				} else if (block > 0 && this.data.length() / 520L >= (long) block) {
					@Pc(128) byte[] bytes = new byte[length];
					@Pc(130) int offset = 0;
					@Pc(140) int blockNumber = 0;
					while (length > offset) {
						if (block == 0) {
							return null;
						}
						this.data.seek((long) (block * 520));
						@Pc(163) int blockSize = length - offset;
						if (blockSize > 512) {
							blockSize = 512;
						}
						this.data.read(buffer, 0, blockSize + 8);
						@Pc(191) int local191 = (buffer[1] & 0xFF) + ((buffer[0] & 0xFF) << 8);
						@Pc(206) int local206 = ((buffer[2] & 0xFF) << 8) + (buffer[3] & 0xFF);
						@Pc(228) int local228 = (buffer[6] & 0xFF) + ((buffer[5] & 0xFF) << 8) + ((buffer[4] & 0xFF) << 16);
						@Pc(234) int local234 = buffer[7] & 0xFF;
						if (group == local191 && local206 == blockNumber && this.archive == local234) {
							if (local228 >= 0 && this.data.length() / 520L >= (long) local228) {
								for (@Pc(278) int local278 = 0; local278 < blockSize; local278++) {
									bytes[offset++] = buffer[local278 + 8];
								}
								blockNumber++;
								block = local228;
								continue;
							}
							return null;
						}
						return null;
					}
					return bytes;
				} else {
					return null;
				}
			} catch (@Pc(306) IOException local306) {
				return null;
			}
		}
	}
}
