import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
	public static int anInt2792;

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_109 = new Class145(4, 8);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)[Lclient!rt;")
	public static GameMode[] method2770() {
		return new GameMode[] { GameMode.GAME_MODE_LIVE, GameMode.GAME_MODE_RC, GameMode.GAME_MODE_WIP};
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method2772(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(40) StringBuffer local40 = new StringBuffer(local8 + local10);
		for (@Pc(50) int local50 = 0; local50 < local8; local50++) {
			@Pc(56) char local56 = arg0.charAt(local50);
			if (local56 == '<') {
				local40.append("<lt>");
			} else if (local56 == '>') {
				local40.append("<gt>");
			} else {
				local40.append(local56);
			}
		}
		return local40.toString();
	}
}
