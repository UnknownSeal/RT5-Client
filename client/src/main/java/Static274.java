import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static274 {

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "Lclient!ci;")
	public static Interface2 anInterface2_7;

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "[I")
	public static int[] anIntArray352;

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "Lclient!ld;")
	public static final LinkedList A_LINKED_LIST___30 = new LinkedList();

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLclient!nk;I)I")
	public static int method4630(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1) {
		if (!Static45.method1404(arg0).method1854(arg1) && arg0.anObjectArray27 == null) {
			return -1;
		} else if (arg0.opCursors == null || arg0.opCursors.length <= arg1) {
			return -1;
		} else {
			return arg0.opCursors[arg1];
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!kk;)Z")
	public static boolean method4637(@OriginalArg(1) Class127 arg0) {
		return Static125.aClass127_8 == arg0 || Static27.aClass127_1 == arg0 || Static45.aClass127_2 == arg0 || Static48.aClass127_3 == arg0;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)I")
	public static int method4640(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
