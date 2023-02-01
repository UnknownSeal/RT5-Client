import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
	public static int anInt5351;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "Z")
	public static boolean loaded;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
	public static int anInt5352;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "Lclient!r;")
	public static Js5 aJs5_68;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIB)V")
	public static void method4874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) DelayedStateChange local16 = DelayedStateChange.create(15, 0);
		local16.pushServer();
		local16.anInt2290 = arg1;
		local16.anInt2289 = arg0;
	}

}
