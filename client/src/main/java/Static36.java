import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static36 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public static int anInt925;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_34 = new Class145(2, 8);

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "[B")
	public static final byte[] aByteArray7 = new byte[2048];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BIB)I")
	public static int method1111(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Buffer.crc32(arg1, 0, arg0);
	}
}
