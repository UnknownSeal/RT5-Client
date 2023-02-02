import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public abstract class ByteArray {

	@OriginalMember(owner = "client!i", name = "X", descriptor = "Z")
	public static boolean directBuffersUnsupported = false;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
	public static Object wrap(@OriginalArg(2) byte[] bytes) {
		if (bytes == null) {
			return null;
		}
		if (bytes.length > 136 && !directBuffersUnsupported) {
			try {
				@Pc(18) ByteArray array = (ByteArray) Class.forName("DirectByteArray").getDeclaredConstructor().newInstance();
				array.set(bytes);
				return array;
			} catch (@Pc(25) Throwable exception) {
				directBuffersUnsupported = true;
			}
		}
		return bytes;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BZLjava/lang/Object;)[B")
	public static byte[] unwrap(@OriginalArg(1) boolean copy, @OriginalArg(2) Object ingoing) {
		if (ingoing == null) {
			return null;
		} else if (ingoing instanceof byte[]) {
			@Pc(13) byte[] bytes = (byte[]) ingoing;
			return copy ? copy(bytes) : bytes;
		} else if (ingoing instanceof ByteArray) {
			@Pc(27) ByteArray array = (ByteArray) ingoing;
			return array.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([BI)[B")
	public static byte[] copy(@OriginalArg(0) byte[] ingoing) {
		@Pc(6) int length = ingoing.length;
		@Pc(17) byte[] outgoing = new byte[length];
		Static403.copy(ingoing, 0, outgoing, 0, length);
		return outgoing;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)[B")
	public abstract byte[] get();

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([BZ)V")
	public abstract void set(@OriginalArg(0) byte[] bytes);
}
