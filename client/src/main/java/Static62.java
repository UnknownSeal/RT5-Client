import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
	public static int anInt2395;

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "[I")
	public static int[] underwaterLocGroupIDs;

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "Lclient!rc;")
	public static Class42 aClass42_5;

	@OriginalMember(owner = "client!dm", name = "r", descriptor = "[Lclient!jd;")
	public static Sprite[] aSpriteArray9;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLclient!r;)V")
	public static void method2390(@OriginalArg(1) Js5 arg0) {
		Static183.anInt80 = arg0.getGroupID("p11_full");
		Static371.anInt7014 = arg0.getGroupID("p12_full");
		Static80.anInt6679 = arg0.getGroupID("b12_full");
		Static373.anInt7028 = arg0.getGroupID("hitmarks");
		Static192.anInt3545 = arg0.getGroupID("hitbar_default");
		Static256.anInt4745 = arg0.getGroupID("timerbar_default");
		Static382.anInt7140 = arg0.getGroupID("headicons_pk");
		Static166.anInt3193 = arg0.getGroupID("headicons_prayer");
		Static390.anInt7206 = arg0.getGroupID("hint_headicons");
		Static363.anInt6792 = arg0.getGroupID("hint_mapmarkers");
		Static237.anInt4324 = arg0.getGroupID("mapflag");
		Static155.anInt2811 = arg0.getGroupID("cross");
		Static326.anInt6236 = arg0.getGroupID("mapdots");
		Static169.anInt3205 = arg0.getGroupID("scrollbar");
		Static102.anInt3590 = arg0.getGroupID("name_icons");
		Static32.anInt798 = arg0.getGroupID("floorshadows");
		Static139.anInt2594 = arg0.getGroupID("compass");
		Static322.anInt6031 = arg0.getGroupID("otherlevel");
		Static373.anInt7030 = arg0.getGroupID("hint_mapedge");
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBIIIZ)V")
	public static void method2391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) long local14 = (long) (arg2 | (arg4 ? Integer.MIN_VALUE : 0));
		@Pc(20) Inventory local20 = (Inventory) Static353.aClass4_136.get(local14);
		if (local20 == null) {
			local20 = new Inventory();
			Static353.aClass4_136.put(local20, local14);
		}
		if (local20.types.length <= arg0) {
			@Pc(50) int[] local50 = new int[arg0 + 1];
			@Pc(55) int[] local55 = new int[arg0 + 1];
			for (@Pc(57) int local57 = 0; local57 < local20.types.length; local57++) {
				local50[local57] = local20.types[local57];
				local55[local57] = local20.count[local57];
			}
			for (@Pc(83) int local83 = local20.types.length; local83 < arg0; local83++) {
				local50[local83] = -1;
				local55[local83] = 0;
			}
			local20.count = local55;
			local20.types = local50;
		}
		local20.types[arg0] = arg3;
		local20.count[arg0] = arg1;
	}
}
