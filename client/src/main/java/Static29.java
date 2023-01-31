import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
	public static int anInt722;

	@OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
	public static int anInt721 = -1;

	@OriginalMember(owner = "client!bm", name = "S", descriptor = "J")
	public static long previousGC = 0L;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIILclient!el;)V")
	public static void method938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub2 arg3) {
		@Pc(4) Class67 local4 = Static266.method4499(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub2_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZIII)V")
	public static void play(@OriginalArg(0) int loops, @OriginalArg(2) int arg1, @OriginalArg(3) int delay, @OriginalArg(4) int id) {
		if (Static218.aClass177_Sub1_2.anInt4888 == 0 || loops == 0 || Static243.size >= 50 || id == -1) {
			return;
		}
		Static256.ids[Static243.size] = id;
		Static329.loops[Static243.size] = loops;
		Static237.delays[Static243.size] = delay;
		Static196.sounds[Static243.size] = null;
		Static162.positions[Static243.size] = 0;
		Static223.anIntArray256[Static243.size] = arg1;
		Static243.size++;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)I")
	public static int bitCountFast(@OriginalArg(0) int v) {
		@Pc(14) int a = (v >>> 1 & 0xD5555555) + (v & 0x55555555);
		@Pc(24) int b = ((a & 0xCCCCCCCD) >>> 2) + (a & 0x33333333);
		@Pc(32) int c = (b >>> 4) + b & 0xF0F0F0F;
		@Pc(43) int d = (c >>> 8) + c;
		@Pc(49) int e = (d >>> 16) + d;
		return e & 0xFF;
	}
}
