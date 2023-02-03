import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLclient!mr;)I")
	public static int method6018(@OriginalArg(1) Class11_Sub5_Sub2 arg0) {
		if (arg0.anInt4604 == 0) {
			return 0;
		}
		@Pc(54) int local54;
		@Pc(61) int local61;
		if (arg0.anInt4611 != -1) {
			@Pc(22) Class11_Sub5_Sub2 local22 = null;
			if (arg0.anInt4611 < 32768) {
				local22 = Static365.npcs[arg0.anInt4611];
			} else if (arg0.anInt4611 >= 32768) {
				local22 = Static12.aClass11_Sub5_Sub2_Sub1Array1[arg0.anInt4611 - 32768];
			}
			if (local22 != null) {
				local54 = arg0.xFine - local22.xFine;
				local61 = arg0.zFine - local22.zFine;
				if (local54 != 0 || local61 != 0) {
					arg0.method4324((int) (Math.atan2((double) local54, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class11_Sub5_Sub2_Sub1) {
			@Pc(160) Class11_Sub5_Sub2_Sub1 local160 = (Class11_Sub5_Sub2_Sub1) arg0;
			if (local160.anInt4174 != -1 && (local160.movementQueueSize == 0 || local160.anInt4641 > 0)) {
				local160.method4324(local160.anInt4174);
				local160.anInt4174 = -1;
			}
		} else if (arg0 instanceof Npc) {
			@Pc(90) Npc local90 = (Npc) arg0;
			if (local90.anInt4663 != -1 && (local90.movementQueueSize == 0 || local90.anInt4641 > 0)) {
				local54 = local90.xFine - (local90.anInt4663 - Static164.originX - Static164.originX) * 64;
				local61 = local90.zFine - (local90.anInt4657 - Static148.originZ - Static148.originZ) * 64;
				if (local54 != 0 || local61 != 0) {
					local90.method4324((int) (Math.atan2((double) local54, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
				local90.anInt4663 = -1;
			}
		}
		return arg0.method4326();
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
	public static void method6020() {
		Static48.A_SOFT_LRU_HASH_TABLE___3.clear();
	}
}
