import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString57;

	@OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
	public static int anInt5780 = 0;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZ)V")
	public static void method5254(@OriginalArg(0) int arg0) {
		if (!Static218.preferences.customCursors) {
			arg0 = -1;
		}
		if (Static29.anInt721 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class220 local25 = Static221.aClass150_3.method3730(arg0);
			@Pc(29) SoftwareSprite local29 = local25.method5657();
			if (local29 == null) {
				arg0 = -1;
			} else {
				GameShell.signlink.method3769(local29.method1680(), new Point(local25.anInt6203, local25.anInt6200), local29.method1685(), GameShell.canvas, local29.method1683());
				Static29.anInt721 = arg0;
			}
		}
		if (arg0 == -1 && Static29.anInt721 != -1) {
			GameShell.signlink.method3769(-1, new Point(), null, GameShell.canvas, -1);
			Static29.anInt721 = -1;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILclient!oe;BI)V")
	public static void method5255(@OriginalArg(0) int arg0, @OriginalArg(1) Npc arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt4597 && arg0 != -1) {
			@Pc(78) Class157 local78 = Static39.aClass85_1.method2371(arg0);
			@Pc(81) int local81 = local78.exactmove;
			if (local81 == 1) {
				arg1.anInt4592 = 1;
				arg1.anInt4624 = 0;
				arg1.anInt4607 = 0;
				arg1.anInt4590 = arg2;
				arg1.anInt4598 = 0;
				Static1.method4(local78, false, arg1.aByte78, arg1.xFine, arg1.zFine, arg1.anInt4607);
			}
			if (local81 == 2) {
				arg1.anInt4598 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt4597 == -1 || Static39.aClass85_1.method2371(arg0).priority >= Static39.aClass85_1.method2371(arg1.anInt4597).priority) {
			arg1.anInt4597 = arg0;
			arg1.anInt4598 = 0;
			arg1.anInt4607 = 0;
			arg1.anInt4624 = 0;
			arg1.anInt4592 = 1;
			arg1.anInt4590 = arg2;
			arg1.anInt4642 = arg1.movementQueueSize;
			if (arg1.anInt4597 != -1) {
				Static1.method4(Static39.aClass85_1.method2371(arg1.anInt4597), false, arg1.aByte78, arg1.xFine, arg1.zFine, arg1.anInt4607);
			}
		}
	}

}
