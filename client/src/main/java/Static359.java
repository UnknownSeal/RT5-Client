import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!us", name = "B", descriptor = "I")
	public static int anInt6697;

	@OriginalMember(owner = "client!us", name = "H", descriptor = "I")
	public static int anInt6702;

	@OriginalMember(owner = "client!us", name = "V", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!us", name = "R", descriptor = "Lclient!s;")
	public static final Class210 aClass210_14 = new Class210(14, 14);

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(Z)V")
	public static void method6008() {
		@Pc(12) DelayedStateChange local12 = DelayedStateChange.create(15, 0);
		local12.pushClient();
	}
}
