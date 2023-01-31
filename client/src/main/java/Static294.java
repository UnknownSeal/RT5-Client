import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!qt", name = "v", descriptor = "Lclient!r;")
	public static Js5 aJs5_75;

	@OriginalMember(owner = "client!qt", name = "E", descriptor = "Z")
	public static boolean aBoolean392 = false;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILclient!r;)Lclient!ne;")
	public static Class2_Sub25 method5061(@OriginalArg(0) int arg0, @OriginalArg(2) Js5 arg1) {
		@Pc(15) byte[] local15 = arg1.method5081(arg0);
		return local15 == null ? null : new Class2_Sub25(local15);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!bt;II)V")
	public static void method5064(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
		if (Static317.aBufferedFile_6 == null) {
			return;
		}
		try {
			Static317.aBufferedFile_6.seek(0L);
			Static317.aBufferedFile_6.method5214(arg1, arg0.bytes, 24);
		} catch (@Pc(23) Exception local23) {
		}
	}
}
