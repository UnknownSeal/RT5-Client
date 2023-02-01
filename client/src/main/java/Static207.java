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
		@Pc(11) Component local11 = getCreatedComponent(Static337.anInt6317, Static214.anInt3792);
		if (local11 != null && local11.onUseWith != null) {
			@Pc(20) HookRequest local20 = new HookRequest();
			local20.source = local11;
			local20.arguments = local11.onUseWith;
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
			local11 = arg0.dragComponent;
		}
		return local11;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)[Lclient!oj;")
	public static Class170[] method3703() {
		return new Class170[] { Static171.aClass170_3, Static329.aClass170_4, Static12.aClass170_1 };
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)Lclient!nk;")
	public static Component getCreatedComponent(@OriginalArg(0) int componentID, @OriginalArg(1) int createdComponentID) {
		@Pc(7) Component component = Static6.getComponent(componentID);
		if (createdComponentID == -1) {
			return component;
		} else if (component == null || component.createdComponent == null || createdComponentID >= component.createdComponent.length) {
			return null;
		} else {
			return component.createdComponent[createdComponentID];
		}
	}
}
