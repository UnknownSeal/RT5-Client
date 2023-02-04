import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "Z")
	public static boolean aBoolean485;

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
	public static int anInt7174 = 0;

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
	public static int anInt7178 = 0;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLclient!nh;)I")
	public static int method6414(@OriginalArg(1) Class11_Sub5_Sub2_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt4168;
		@Pc(12) BasType local12 = arg0.method4331();
		if (arg0.aBoolean317) {
			local8 = arg0.anInt4167;
		} else if (local12.runSeqID == arg0.anInt4585 || local12.runFollow180SeqID == arg0.anInt4585 || local12.runFollowCwSeqID == arg0.anInt4585 || local12.runFollowCcwSeqID == arg0.anInt4585) {
			local8 = arg0.anInt4196;
		} else if (local12.crawlSeqID == arg0.anInt4585 || local12.crawlFollow180SeqID == arg0.anInt4585 || local12.crawlFollowCwSeqID == arg0.anInt4585 || local12.crawlFollowCcwSeqID == arg0.anInt4585) {
			local8 = arg0.anInt4187;
		}
		return local8;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIB)V")
	public static void method6415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(18) int local18 = arg1 - arg2;
		@Pc(23) int local23 = arg0 - arg3;
		if (local18 == 0) {
			if (local23 != 0) {
				Static156.method2791(arg0, arg3, arg4, arg2);
			}
		} else if (local23 == 0) {
			Static129.method2434(arg2, arg4, arg3, arg1);
		} else {
			@Pc(55) int local55 = (local23 << 12) / local18;
			@Pc(64) int local64 = arg3 - (local55 * arg2 >> 12);
			@Pc(72) int local72;
			@Pc(80) int local80;
			if (Static28.anInt675 > arg2) {
				local72 = Static28.anInt675;
				local80 = (Static28.anInt675 * local55 >> 12) + local64;
			} else if (Static82.anInt1837 < arg2) {
				local72 = Static82.anInt1837;
				local80 = (local55 * Static82.anInt1837 >> 12) + local64;
			} else {
				local80 = arg3;
				local72 = arg2;
			}
			@Pc(106) int local106;
			@Pc(108) int local108;
			if (arg1 < Static28.anInt675) {
				local108 = (Static28.anInt675 * local55 >> 12) + local64;
				local106 = Static28.anInt675;
			} else if (arg1 <= Static82.anInt1837) {
				local106 = arg1;
				local108 = arg0;
			} else {
				local108 = (local55 * Static82.anInt1837 >> 12) + local64;
				local106 = Static82.anInt1837;
			}
			if (Static365.anInt6832 > local108) {
				local108 = Static365.anInt6832;
				local106 = (Static365.anInt6832 - local64 << 12) / local55;
			} else if (Static161.anInt2954 < local108) {
				local106 = (Static161.anInt2954 - local64 << 12) / local55;
				local108 = Static161.anInt2954;
			}
			if (local80 < Static365.anInt6832) {
				local80 = Static365.anInt6832;
				local72 = (Static365.anInt6832 - local64 << 12) / local55;
			} else if (Static161.anInt2954 < local80) {
				local72 = (Static161.anInt2954 - local64 << 12) / local55;
				local80 = Static161.anInt2954;
			}
			Static327.method5575(local106, local72, local108, local80, arg4);
		}
	}
}
