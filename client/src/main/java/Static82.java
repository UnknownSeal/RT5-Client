import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!em", name = "b", descriptor = "[[B")
	public static byte[][] locBytes;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "Lclient!h;")
	public static final Class89 aClass89_66 = new Class89(56, -1);

	@OriginalMember(owner = "client!em", name = "f", descriptor = "Lclient!h;")
	public static final Class89 aClass89_67 = new Class89(35, -2);

	@OriginalMember(owner = "client!em", name = "g", descriptor = "I")
	public static int anInt1835 = 0;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_64 = new Class145(25, 2);

	@OriginalMember(owner = "client!em", name = "i", descriptor = "I")
	public static int length = 0;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "[I")
	public static final int[] anIntArray120 = new int[13];

	@OriginalMember(owner = "client!em", name = "k", descriptor = "I")
	public static int anInt1837 = 100;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZIZ)V")
	public static void method1902(@OriginalArg(0) boolean arg0) {
		Static173.anInt3338--;
		if (Static173.anInt3338 == 0) {
			Static181.anIntArray204 = null;
		}
		if (!arg0) {
			return;
		}
		Static81.anInt3709--;
		if (Static81.anInt3709 == 0) {
			Static59.anIntArray107 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)V")
	public static void closeWidget() {
		Static91.method1960(Static186.aClass145_145);
		for (@Pc(21) SubInterface local21 = (SubInterface) Static329.subInterfaces.head(); local21 != null; local21 = (SubInterface) Static329.subInterfaces.next()) {
			if (!local21.isLinked()) {
				local21 = (SubInterface) Static329.subInterfaces.head();
				if (local21 == null) {
					break;
				}
			}
			if (local21.type == 0) {
				Static276.method4654(true, local21, true);
			}
		}
		if (Static192.aComponent_8 != null) {
			Static200.redraw(Static192.aComponent_8);
			Static192.aComponent_8 = null;
		}
	}
}
