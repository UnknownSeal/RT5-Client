import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "[I")
	public static final int[] anIntArray161 = new int[14];

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_92 = new Class145(36, 3);

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "Z")
	public static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "Z")
	public static boolean aBoolean180 = false;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "[I")
	public static final int[] phraseIDs = new int[100];

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
	public static int anInt2468 = -2;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)Lclient!rt;")
	public static GameMode method2484(@OriginalArg(0) int arg0) {
		@Pc(8) GameMode[] local8 = Static153.method2770();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) GameMode local21 = local8[local15];
			if (local21.gameModeID == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean isInt(@OriginalArg(1) String s) {
		return Static340.isIntInternal(s);
	}
}
