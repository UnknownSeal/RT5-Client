import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static325 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "Lclient!o;")
	public static Interface9 anInterface9_1 = null;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
	public static int anInt6079 = 0;

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_220 = new Class145(30, -1);

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "[I")
	public static final int[] anIntArray413 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "[I")
	public static final int[] baseLevels = new int[25];

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!o;Lclient!r;Lclient!r;B)V")
	public static void method5543(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Js5 arg2) {
		Static137.archive = arg1;
		anInterface9_1 = arg0;
		Static308.globalArchive = arg2;
		if (Static137.archive != null) {
			Static21.capacity = Static137.archive.method5080(1);
		}
		if (Static308.globalArchive != null) {
			Static361.globalCapacity = Static308.globalArchive.method5080(1);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BII)Z")
	public static boolean method5544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static359.aByteArrayArrayArray16[1][arg1][arg0] & 0x2) != 0;
	}
}
