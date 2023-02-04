import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static380 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIILclient!nk;)V")
	public static void dragPickUp(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component component) {
		if (Static375.aComponent_14 != null || Static375.aBoolean477 || (component == null || Static207.method3702(component) == null)) {
			return;
		}
		Static375.aComponent_14 = component;
		Static301.aComponent_13 = Static207.method3702(component);
		Static129.anInt2458 = 0;
		Static57.aBoolean124 = false;
		Static392.anInt7228 = arg1;
		Static18.anInt530 = arg0;
	}
}
