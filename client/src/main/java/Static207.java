import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
	public static int anInt3746;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!ld;")
	public static final LinkedList A_LINKED_LIST___25 = new LinkedList();

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!h;")
	public static final Class89 aClass89_154 = new Class89(81, 8);

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!ld;")
	public static LinkedList aLinkedList_26 = new LinkedList();

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "[I")
	public static final int[] anIntArray225 = new int[8];

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method3698() {
		if (!Static330.aBoolean419) {
			return;
		}
		@Pc(11) Component local11 = method3704(Static337.anInt6317, Static214.anInt3792);
		if (local11 != null && local11.onUseWith != null) {
			@Pc(20) Class2_Sub13 local20 = new Class2_Sub13();
			local20.aComponent_3 = local11;
			local20.anObjectArray4 = local11.onUseWith;
			ScriptRunner.method3590(local20);
		}
		Static330.aBoolean419 = false;
		Static107.anInt2219 = -1;
		Static196.anInt3317 = -1;
		if (local11 != null) {
			Static200.redraw(local11);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void add(@OriginalArg(1) String arg0) {
		Static33.method4199("", 0, arg0, 0, "");
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!nk;B)Lclient!nk;")
	public static Component method3702(@OriginalArg(0) Component arg0) {
		@Pc(11) Component local11 = Static45.method1413(arg0);
		if (local11 == null) {
			local11 = arg0.aComponent_12;
		}
		return local11;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)[Lclient!oj;")
	public static Class170[] method3703() {
		return new Class170[] { Static171.aClass170_3, Static329.aClass170_4, Static12.aClass170_1 };
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)Lclient!nk;")
	public static Component method3704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Component local7 = Static6.getComponent(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.createdComponent == null || arg1 >= local7.createdComponent.length) {
			return null;
		} else {
			return local7.createdComponent[arg1];
		}
	}
}
