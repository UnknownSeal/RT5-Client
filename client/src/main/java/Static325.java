import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static325 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "Lclient!o;")
	public static QuickChatCommandDecoder anQuickChatCommandDecoder_1 = null;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
	public static int anInt6079 = 0;

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_220 = new Class145(30, -1);

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "[I")
	public static final int[] anIntArray413 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "[I")
	public static final int[] baseLevels = new int[25];

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!o;Lclient!r;Lclient!r;B)V")
	public static void method5543(@OriginalArg(0) QuickChatCommandDecoder arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Js5 arg2) {
		Static137.archive = arg1;
		anQuickChatCommandDecoder_1 = arg0;
		Static308.globalArchive = arg2;
		if (Static137.archive != null) {
			Static21.capacity = Static137.archive.getGroupCapacity(1);
		}
		if (Static308.globalArchive != null) {
			Static361.globalCapacity = Static308.globalArchive.getGroupCapacity(1);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BII)Z")
	public static boolean method5544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static359.aByteArrayArrayArray16[1][arg1][arg0] & 0x2) != 0;
	}
}
