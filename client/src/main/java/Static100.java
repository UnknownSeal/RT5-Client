import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
	public static int anInt2111 = -1;

	@OriginalMember(owner = "client!fn", name = "D", descriptor = "Z")
	public static boolean aBoolean156 = true;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIILclient!mr;I)V")
	public static void method2160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub5_Sub2 arg3) {
		@Pc(16) BasType local16 = arg3.method4331();
		@Pc(26) int local26 = arg3.anInt4616 - arg3.aClass248_7.anInt7197 & 0x3FFF;
		if (arg2 == -1) {
			if (local26 != 0 || arg3.anInt4605 > 25) {
				arg3.aBoolean317 = false;
				if (arg0 < 0 && local16.readyCcwSeqID != -1) {
					arg3.anInt4585 = local16.readyCcwSeqID;
				} else if (arg0 <= 0 || local16.readyCwSeqID == -1) {
					arg3.anInt4585 = local16.walkSeqID;
				} else {
					arg3.anInt4585 = local16.readyCwSeqID;
				}
			} else if (!arg3.aBoolean317 || !local16.method5691(arg3.anInt4585)) {
				arg3.anInt4585 = local16.method5695();
				arg3.aBoolean317 = arg3.anInt4585 != -1;
			}
		} else if (arg3.anInt4611 != -1 && (local26 >= 10240 || local26 <= 2048)) {
			@Pc(225) int local225 = Static369.anIntArray479[arg1] - arg3.aClass248_7.anInt7197 & 0x3FFF;
			if (arg2 == 2 && local16.runSeqID != -1) {
				if (local225 > 2048 && local225 <= 6144 && local16.runFollowCwSeqID != -1) {
					arg3.anInt4585 = local16.runFollowCwSeqID;
				} else if (local225 >= 10240 && local225 < 14336 && local16.runFollowCcwSeqID != -1) {
					arg3.anInt4585 = local16.runFollowCcwSeqID;
				} else if (local225 <= 6144 || local225 >= 10240 || local16.runFollow180SeqID == -1) {
					arg3.anInt4585 = local16.runSeqID;
				} else {
					arg3.anInt4585 = local16.runFollow180SeqID;
				}
			} else if (arg2 == 0 && local16.crawlSeqID != -1) {
				if (local225 > 2048 && local225 <= 6144 && local16.crawlFollowCwSeqID != -1) {
					arg3.anInt4585 = local16.crawlFollowCwSeqID;
				} else if (local225 >= 10240 && local225 < 14336 && local16.crawlFollowCcwSeqID != -1) {
					arg3.anInt4585 = local16.crawlFollowCcwSeqID;
				} else if (local225 <= 6144 || local225 >= 10240 || local16.crawlFollow180SeqID == -1) {
					arg3.anInt4585 = local16.crawlSeqID;
				} else {
					arg3.anInt4585 = local16.crawlFollow180SeqID;
				}
			} else if (local225 > 2048 && local225 <= 6144 && local16.walkFollowCwSeqID != -1) {
				arg3.anInt4585 = local16.walkFollowCwSeqID;
			} else if (local225 >= 10240 && local225 < 14336 && local16.walkFollowCcwSeqID != -1) {
				arg3.anInt4585 = local16.walkFollowCcwSeqID;
			} else if (local225 <= 6144 || local225 >= 10240 || local16.walkFollow180SeqID == -1) {
				arg3.anInt4585 = local16.walkSeqID;
			} else {
				arg3.anInt4585 = local16.walkFollow180SeqID;
			}
			arg3.aBoolean317 = false;
		} else if (local26 == 0 && arg3.anInt4605 <= 25) {
			if (arg2 == 2 && local16.runSeqID != -1) {
				arg3.anInt4585 = local16.runSeqID;
			} else if (arg2 == 0 && local16.crawlSeqID != -1) {
				arg3.anInt4585 = local16.crawlSeqID;
			} else {
				arg3.anInt4585 = local16.walkSeqID;
			}
			arg3.aBoolean317 = false;
		} else {
			if (arg2 == 2 && local16.runSeqID != -1) {
				if (arg0 < 0 && local16.runCcwSeqID != -1) {
					arg3.anInt4585 = local16.runCcwSeqID;
				} else if (arg0 <= 0 || local16.runCwSeqID == -1) {
					arg3.anInt4585 = local16.runSeqID;
				} else {
					arg3.anInt4585 = local16.runCwSeqID;
				}
			} else if (arg2 == 0 && local16.crawlSeqID != -1) {
				if (arg0 < 0 && local16.crawlCcwSeqID != -1) {
					arg3.anInt4585 = local16.crawlCcwSeqID;
				} else if (arg0 <= 0 || local16.crawlCwSeqID == -1) {
					arg3.anInt4585 = local16.crawlSeqID;
				} else {
					arg3.anInt4585 = local16.crawlCwSeqID;
				}
			} else if (arg0 < 0 && local16.walkCcwSeqID != -1) {
				arg3.anInt4585 = local16.walkCcwSeqID;
			} else if (arg0 <= 0 || local16.walkCwSeqID == -1) {
				arg3.anInt4585 = local16.walkSeqID;
			} else {
				arg3.anInt4585 = local16.walkCwSeqID;
			}
			arg3.aBoolean317 = false;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!qg;B)I")
	public static int method2161(@OriginalArg(0) Packet arg0) {
		@Pc(10) int local10 = arg0.gBit(2);
		@Pc(22) int local22;
		if (local10 == 0) {
			local22 = 0;
		} else if (local10 == 1) {
			local22 = arg0.gBit(5);
		} else if (local10 == 2) {
			local22 = arg0.gBit(8);
		} else {
			local22 = arg0.gBit(11);
		}
		return local22;
	}
}
