import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static151 {

	@OriginalMember(owner = "client!im", name = "D", descriptor = "I")
	public static int anInt2772;

	@OriginalMember(owner = "client!im", name = "G", descriptor = "I")
	public static int anInt2773 = 0;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(III)V")
	public static void method2756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (client.game == GameType.GAME_TYPE_STELLARDAWN) {
			if (Static322.method5481(false, -2, arg0, 0, 1, arg1, 1, 0)) {
				return;
			}
			Static322.method5481(false, -3, arg0, 0, 1, arg1, 1, 0);
		} else if (Static322.method5481(false, -3, arg0, 0, 1, arg1, 1, 0)) {
			return;
		} else {
			Static322.method5481(false, -2, arg0, 0, 1, arg1, 1, 0);
		}
	}
}
