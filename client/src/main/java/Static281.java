import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Lclient!wj;")
	public static final Class236 aClass236_1 = Static17.method4213();

	@OriginalMember(owner = "client!qf", name = "qb", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(III)Z")
	public static boolean method4784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static375.aBoolean477) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static26.aComponentArrayArray1[local13] == null || Static26.aComponentArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(35) Component local35 = Static26.aComponentArrayArray1[local13][local17];
		@Pc(51) Class2_Sub5 local51;
		if (arg0 == -1 && local35.type == 0) {
			for (local51 = (Class2_Sub5) Static129.A_LINKED_LIST___19.head(); local51 != null; local51 = (Class2_Sub5) Static129.A_LINKED_LIST___19.next()) {
				if (local51.anInt1005 == 11 || local51.anInt1005 == 1011 || local51.anInt1005 == 49 || local51.anInt1005 == 45 || local51.anInt1005 == 30) {
					for (@Pc(133) Component local133 = Static6.getComponent(local51.anInt1009); local133 != null; local133 = Static7.method6464(local133)) {
						if (local35.id == local133.id) {
							return true;
						}
					}
				}
			}
		} else {
			for (local51 = (Class2_Sub5) Static129.A_LINKED_LIST___19.head(); local51 != null; local51 = (Class2_Sub5) Static129.A_LINKED_LIST___19.next()) {
				if (local51.anInt1006 == arg0 && local35.id == local51.anInt1009 && (local51.anInt1005 == 11 || local51.anInt1005 == 1011 || local51.anInt1005 == 49 || local51.anInt1005 == 45 || local51.anInt1005 == 30)) {
					return true;
				}
			}
		}
		return false;
	}
}
