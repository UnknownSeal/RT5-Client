import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bu", name = "K", descriptor = "Lclient!jd;")
	public static Class13 aClass13_3;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IC)Z")
	public static boolean method1103(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)Z")
	public static boolean method1106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static165.anIntArrayArrayArray9[arg0][arg1][arg2];
		if (local7 == -Static193.anInt3556) {
			return false;
		} else if (local7 == Static193.anInt3556) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static322.anInt6029;
			@Pc(26) int local26 = arg2 << Static322.anInt6029;
			if (Static46.method1423(local22 + 1, Static365.aClass6Array4[arg0].method5718(arg1, arg2), local26 + 1) && Static46.method1423(local22 + Static256.anInt4716 - 1, Static365.aClass6Array4[arg0].method5718(arg1 + 1, arg2), local26 + 1) && Static46.method1423(local22 + Static256.anInt4716 - 1, Static365.aClass6Array4[arg0].method5718(arg1 + 1, arg2 + 1), local26 + Static256.anInt4716 - 1) && Static46.method1423(local22 + 1, Static365.aClass6Array4[arg0].method5718(arg1, arg2 + 1), local26 + Static256.anInt4716 - 1)) {
				Static165.anIntArrayArrayArray9[arg0][arg1][arg2] = Static193.anInt3556;
				return true;
			} else {
				Static165.anIntArrayArrayArray9[arg0][arg1][arg2] = -Static193.anInt3556;
				return false;
			}
		}
	}
}
