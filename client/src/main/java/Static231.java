import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
	public static int anInt4071;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "[I")
	public static final int[] anIntArray265 = new int[1000];

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "Lclient!kk;")
	public static final Class127 aClass127_7 = new Class127("LOCAL", 4);

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "Lclient!h;")
	public static Class89 packetInbound = null;

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
	public static int anInt4079 = 999999;

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "[Lclient!bt;")
	public static final Buffer[] aClass2_Sub4Array1 = new Buffer[2048];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIBI)V")
	public static void method4021(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(11) int local11 = arg1 << 3;
		Static31.aFloat28 = local3;
		Static277.aFloat67 = local11;
		if (Static314.anInt5911 == 2) {
			Static342.anInt5657 = 0;
			Static265.anInt4857 = local3;
			Static4.anInt87 = local11;
		}
		Static338.method6140();
		Static100.aBoolean156 = true;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IJ)V")
	public static void sleep(@OriginalArg(1) long millis) {
		if (millis <= 0L) {
			return;
		}
		if (millis % 10L == 0L) {
			Static270.sleepUninterruptibly(millis - 1L);
			Static270.sleepUninterruptibly(1L);
		} else {
			Static270.sleepUninterruptibly(millis);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)I")
	public static int method4023(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(25) int local25 = (local7 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local7 & 0xFF0000) >>> 8;
		@Pc(30) int local30 = 255 - local7;
		return (((arg0 & 0xFF00FF) * local30 & 0xFF00FF00 | local30 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local25;
	}
}
