import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!q", name = "l", descriptor = "[[I")
	public static int[][] xteaKeys;

	@OriginalMember(owner = "client!q", name = "p", descriptor = "I")
	public static int clientVersion;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Lclient!ld;")
	public static final LinkedList A_LINKED_LIST___31 = new LinkedList();

	@OriginalMember(owner = "client!q", name = "o", descriptor = "[I")
	public static final int[] anIntArray361 = new int[250];

	@OriginalMember(owner = "client!q", name = "q", descriptor = "F")
	public static float aFloat67 = 0.0F;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIB)V")
	public static void method4679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) DelayedStateChange local12 = Static316.create(8, arg2);
		local12.pushServer();
		local12.anInt2289 = arg1;
		local12.anInt2284 = arg3;
		local12.anInt2290 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method4680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Component local8 = Static207.method3704(arg0, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.onOptionClick != null) {
			@Pc(18) Class2_Sub13 local18 = new Class2_Sub13();
			local18.anObjectArray4 = local8.onOptionClick;
			local18.anInt2118 = arg1;
			local18.aComponent_3 = local8;
			local18.aString20 = arg2;
			ScriptRunner.method3590(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt4273 != 0) {
			local35 = Static7.method6471(local8);
		}
		if (!local35 || !Static45.getServerActiveProperties(local8).method1854(arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static91.method1960(Static122.aClass145_89);
			Static185.method3397(arg3, local8.objId, arg0);
		}
		if (arg1 == 2) {
			Static91.method1960(Static153.aClass145_109);
			Static185.method3397(arg3, local8.objId, arg0);
		}
		if (arg1 == 3) {
			Static91.method1960(Static36.aClass145_34);
			Static185.method3397(arg3, local8.objId, arg0);
		}
		if (arg1 == 4) {
			Static91.method1960(Static373.aClass145_254);
			Static185.method3397(arg3, local8.objId, arg0);
		}
		if (arg1 == 5) {
			Static91.method1960(Static112.aClass145_86);
			Static185.method3397(arg3, local8.objId, arg0);
		}
		if (arg1 == 6) {
			Static91.method1960(Static181.aClass145_134);
			Static185.method3397(arg3, local8.objId, arg0);
		}
		if (arg1 == 7) {
			Static91.method1960(Static84.aClass145_65);
			Static185.method3397(arg3, local8.objId, arg0);
		}
		if (arg1 == 8) {
			Static91.method1960(Static150.aClass145_107);
			Static185.method3397(arg3, local8.objId, arg0);
		}
		if (arg1 == 9) {
			Static91.method1960(Static115.aClass145_147);
			Static185.method3397(arg3, local8.objId, arg0);
		}
		if (arg1 == 10) {
			Static91.method1960(Static322.aClass145_218);
			Static185.method3397(arg3, local8.objId, arg0);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!mr;B)V")
	public static void method4681(@OriginalArg(0) Class11_Sub5_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt4584 == Static114.loop || arg0.anInt4597 == -1 || arg0.anInt4590 != 0) {
			local5 = true;
		} else {
			@Pc(25) Class157 local25 = Static39.aClass85_1.method2371(arg0.anInt4597);
			if (local25.aBoolean264 || arg0.anInt4624 + 1 > local25.anIntArray261[arg0.anInt4607]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(57) int local57 = arg0.anInt4584 - arg0.anInt4622;
			@Pc(63) int local63 = Static114.loop - arg0.anInt4622;
			@Pc(75) int local75 = arg0.anInt4615 * 128 + arg0.method4327() * 64;
			@Pc(86) int local86 = arg0.anInt4588 * 128 + arg0.method4327() * 64;
			@Pc(97) int local97 = arg0.anInt4577 * 128 + arg0.method4327() * 64;
			@Pc(109) int local109 = arg0.anInt4599 * 128 + arg0.method4327() * 64;
			arg0.xFine = ((local57 - local63) * local75 + local63 * local97) / local57;
			arg0.zFine = ((local57 - local63) * local86 + local63 * local109) / local57;
		}
		arg0.anInt4641 = 0;
		if (arg0.anInt4614 == 0) {
			arg0.method4329(8192);
		}
		if (arg0.anInt4614 == 1) {
			arg0.method4329(12288);
		}
		if (arg0.anInt4614 == 2) {
			arg0.method4329(0);
		}
		if (arg0.anInt4614 == 3) {
			arg0.method4329(4096);
		}
	}
}
