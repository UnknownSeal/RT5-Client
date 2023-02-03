import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class GzipDecompressor {

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater inflater;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	public GzipDecompressor() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(III)V")
	private GzipDecompressor(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([BILclient!bt;)V")
	public void gUnzip(@OriginalArg(0) byte[] bytes, @OriginalArg(2) Buffer buffer) {
		if (buffer.bytes[buffer.offset] != 31 || buffer.bytes[buffer.offset + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.inflater == null) {
			this.inflater = new Inflater(true);
		}
		try {
			this.inflater.setInput(buffer.bytes, buffer.offset + 10, -buffer.offset + -18 + buffer.bytes.length);
			this.inflater.inflate(bytes);
		} catch (@Pc(60) Exception exception) {
			this.inflater.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.inflater.reset();
	}
}
