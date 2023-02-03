import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
	public static int anInt366;

	@OriginalMember(owner = "client!ar", name = "U", descriptor = "[Lclient!jd;")
	public static Sprite[] aSpriteArray3;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String formatHttpDate(@OriginalArg(1) long arg0) {
		Static376.gmtCalendar.setTime(new Date(arg0));
		@Pc(13) int day = Static376.gmtCalendar.get(Calendar.DAY_OF_WEEK);
		@Pc(24) int date = Static376.gmtCalendar.get(Calendar.DATE);
		@Pc(28) int month = Static376.gmtCalendar.get(Calendar.MONTH);
		@Pc(32) int year = Static376.gmtCalendar.get(Calendar.YEAR);
		@Pc(36) int hour = Static376.gmtCalendar.get(Calendar.HOUR_OF_DAY);
		@Pc(40) int minute = Static376.gmtCalendar.get(Calendar.MINUTE);
		@Pc(44) int second = Static376.gmtCalendar.get(Calendar.SECOND);
		return Static326.DAYS[day - 1] + ", " + date / 10 + date % 10 + "-" + Static3.MONTHS[month] + "-" + year + " " + hour / 10 + hour % 10 + ":" + minute / 10 + minute % 10 + ":" + second / 10 + second % 10 + " GMT";
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(IIB)V")
	public static void method394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static77.anInt1763 = arg0 - Static344.anInt6055;
		Static238.anInt4328 = arg1 - Static344.anInt6057;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!ct;IILclient!wm;Z)V")
	public static void method395(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class19 arg4) {
		@Pc(9) Class146 local9 = Static320.aClass104_2.method2708(arg1.anInt1316);
		if (local9.anInt3751 == -1) {
			return;
		}
		if (arg1.aBoolean115) {
			@Pc(27) int local27 = arg0 + arg1.anInt1309;
			arg0 = local27 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(39) Sprite local39 = local9.method3710(arg1.aBoolean118, arg0, arg4);
		if (local39 == null) {
			return;
		}
		@Pc(45) int local45 = arg1.anInt1356;
		@Pc(48) int local48 = arg1.anInt1327;
		if ((arg0 & 0x1) == 1) {
			local45 = arg1.anInt1327;
			local48 = arg1.anInt1356;
		}
		@Pc(62) int local62 = local39.method6398();
		@Pc(65) int local65 = local39.method6383();
		if (local9.aBoolean243) {
			local65 = local48 * 4;
			local62 = local45 * 4;
		}
		if (local9.anInt3752 == 0) {
			local39.method6387(arg3, arg2 - (local48 - 1) * 4, local62, local65);
		} else {
			local39.method6394(arg3, arg2 + 4 - local48 * 4, local62, local65, 1, local9.anInt3752 | 0xFF000000, 1);
		}
	}
}
