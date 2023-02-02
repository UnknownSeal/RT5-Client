import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class DirectByteArray extends ByteArray {

	@OriginalMember(owner = "client!st", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer buffer;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "([BZ)V")
	@Override
	public void set(@OriginalArg(0) byte[] bytes) {
		this.buffer = ByteBuffer.allocateDirect(bytes.length);
		this.buffer.position(0);
		this.buffer.put(bytes);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] get() {
		@Pc(10) byte[] bytes = new byte[this.buffer.capacity()];
		this.buffer.position(0);
		this.buffer.get(bytes);
		return bytes;
	}
}
