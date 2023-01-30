import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class ByteArray_Sub1 extends ByteArray {

	@OriginalMember(owner = "client!st", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "([BZ)V")
	@Override
	public void set(@OriginalArg(0) byte[] bytes) {
		this.aByteBuffer5 = ByteBuffer.allocateDirect(bytes.length);
		this.aByteBuffer5.position(0);
		this.aByteBuffer5.put(bytes);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] get() {
		@Pc(10) byte[] local10 = new byte[this.aByteBuffer5.capacity()];
		this.aByteBuffer5.position(0);
		this.aByteBuffer5.get(local10);
		return local10;
	}
}
