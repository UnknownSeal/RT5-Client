import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "Lclient!pe;")
	public static Preferences preferences;

	@OriginalMember(owner = "client!mo", name = "C", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
	public static int bufferOffset = 0;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZLclient!r;)Lclient!vi;")
	public static Class239 method1088(@OriginalArg(0) int arg0, @OriginalArg(2) Js5 arg1) {
		@Pc(13) byte[] local13 = arg1.fetchFile(arg0);
		return local13 == null ? null : new Class239(local13);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)I")
	public static int getTotal() {
		return 6;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!cf;)I")
	public static int method1096(@OriginalArg(1) Class2_Sub5 arg0) {
		@Pc(12) String local12 = Static318.method5420(arg0);
		@Pc(14) int[] local14 = null;
		if (Static298.method2425(arg0.anInt1005)) {
			local14 = Static313.aClass107_2.get((int) arg0.aLong30).anIntArray364;
		} else if (arg0.anInt1008 != -1) {
			local14 = Static313.aClass107_2.get(arg0.anInt1008).anIntArray364;
		} else if (Static297.method5110(arg0.anInt1005)) {
			@Pc(46) Npc local46 = Static365.npcs[(int) arg0.aLong30];
			if (local46 != null) {
				@Pc(51) NpcType local51 = local46.type;
				if (local51.multiNpcs != null) {
					local51 = local51.getMultiNpc(Static214.aClass226_1);
				}
				if (local51 != null) {
					local14 = local51.anIntArray131;
				}
			}
		} else if (Static241.method4189(arg0.anInt1005)) {
			@Pc(83) Class41 local83;
			if (arg0.anInt1005 == 1010) {
				local83 = Static359.aClass202_4.method5162((int) arg0.aLong30);
			} else {
				local83 = Static359.aClass202_4.method5162((int) (arg0.aLong30 >>> 32 & 0x7FFFFFFFL));
			}
			if (local83.anIntArray94 != null) {
				local83 = local83.method1533(Static214.aClass226_1);
			}
			if (local83 != null) {
				local14 = local83.anIntArray96;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static158.method2938(local14);
		}
		@Pc(135) int local135 = Static113.aClass239_2.method6126(Static134.aClass13Array12, local12);
		if (arg0.aBoolean82) {
			local135 += Static119.aClass13_7.method6388() + 4;
		}
		return local135;
	}
}
