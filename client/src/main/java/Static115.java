import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
	public static int anInt3837;

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_147 = new Class145(54, 8);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)V")
	public static void method3808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1008) {
			ScriptRunner.method3595(Static138.aClass16_3, arg0, arg2);
		} else if (arg1 == 1002) {
			ScriptRunner.method3595(Static192.aClass16_5, arg0, arg2);
		} else if (arg1 == 1012) {
			ScriptRunner.method3595(Static250.aClass16_6, arg0, arg2);
		} else if (arg1 == 1003) {
			ScriptRunner.method3595(Static320.aClass16_8, arg0, arg2);
		} else if (arg1 == 1007) {
			ScriptRunner.method3595(Static135.aClass16_2, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)Lclient!jg;")
	public static Class2_Sub20 method3828() {
		if (Static344.A_LINKED_LIST___36 == null || Static116.aClass75_1 == null) {
			return null;
		}
		for (@Pc(16) Class2_Sub20 local16 = (Class2_Sub20) Static116.aClass75_1.method2178(); local16 != null; local16 = (Class2_Sub20) Static116.aClass75_1.method2178()) {
			@Pc(24) Class164 local24 = Static344.aClass125_4.method3378(local16.anInt2947);
			if (local24 != null && local24.aBoolean302 && local24.method4179(Static344.anInterface11_2)) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3840(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static91.method1960(Static13.aClass145_18);
			Static257.aClass2_Sub4_Sub2_4.p1(Static27.method872(arg0));
			Static257.aClass2_Sub4_Sub2_4.pjstr(arg0);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[Lclient!nk;I)V")
	public static void method3846(@OriginalArg(0) int arg0, @OriginalArg(1) Component[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Component local9 = arg1[local3];
			if (local9 != null) {
				if (local9.type == 0) {
					if (local9.aComponentArray2 != null) {
						method3846(arg0, local9.aComponentArray2);
					}
					@Pc(30) Class2_Sub7 local30 = (Class2_Sub7) Static329.aClass4_130.get((long) local9.id);
					if (local30 != null) {
						Static392.method6459(local30.anInt1370, arg0);
					}
				}
				@Pc(49) Class2_Sub13 local49;
				if (arg0 == 0 && local9.anObjectArray34 != null) {
					local49 = new Class2_Sub13();
					local49.aComponent_3 = local9;
					local49.anObjectArray4 = local9.anObjectArray34;
					ScriptRunner.method3590(local49);
				}
				if (arg0 == 1 && local9.anObjectArray11 != null) {
					if (local9.createdComponentID >= 0) {
						@Pc(75) Component local75 = Static6.method140(local9.id);
						if (local75 == null || local75.aComponentArray2 == null || local75.aComponentArray2.length <= local9.createdComponentID || local75.aComponentArray2[local9.createdComponentID] != local9) {
							continue;
						}
					}
					local49 = new Class2_Sub13();
					local49.anObjectArray4 = local9.anObjectArray11;
					local49.aComponent_3 = local9;
					ScriptRunner.method3590(local49);
				}
			}
		}
	}
}
