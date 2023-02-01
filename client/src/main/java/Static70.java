import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Z")
	public static boolean loaded = false;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Lclient!h;")
	public static final Class89 aClass89_58 = new Class89(48, 5);

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_57 = new Class145(15, -1);

	@OriginalMember(owner = "client!e", name = "o", descriptor = "[I")
	public static final int[] anIntArray112 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLclient!ac;Lclient!ac;BI)I")
	public static int method1786(@OriginalArg(0) boolean arg0, @OriginalArg(1) World arg1, @OriginalArg(2) World arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg3 == 1) {
			local11 = arg1.anInt78;
			local14 = arg2.anInt78;
			if (!arg0) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg3 == 2) {
			return Static233.compare(arg2.getCountry().name, arg1.getCountry().name, client.language);
		} else if (arg3 == 3) {
			if (arg1.activity.equals("-")) {
				if (arg2.activity.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.activity.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static233.compare(arg2.activity, arg1.activity, client.language);
			}
		} else if (arg3 == 4) {
			if (arg1.isLootShare()) {
				return arg2.isLootShare() ? 0 : 1;
			} else if (arg2.isLootShare()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg1.isQuickChat()) {
				return arg2.isQuickChat() ? 0 : 1;
			} else if (arg2.isQuickChat()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg1.isPvP()) {
				return arg2.isPvP() ? 0 : 1;
			} else if (arg2.isPvP()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg1.isMembers()) {
				return arg2.isMembers() ? 0 : 1;
			} else if (arg2.isMembers()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local11 = arg1.anInt83;
			local14 = arg2.anInt83;
			if (arg0) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg1.worldID - arg2.worldID;
		}
	}
}
