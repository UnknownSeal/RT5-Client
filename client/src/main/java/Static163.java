import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!jj", name = "S", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23;

	@OriginalMember(owner = "client!jj", name = "Y", descriptor = "Lclient!ku;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!jj", name = "U", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_116 = new Class145(34, -1);

	@OriginalMember(owner = "client!jj", name = "W", descriptor = "I")
	public static int anInt3086 = 0;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIIIIZ)V")
	public static void method3099(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg4) {
			Static335.method5693();
		}
		if (GameShell.fullScreenFrame != null && (arg3 != 3 || arg0 != Static218.preferences.anInt4884 || Static218.preferences.anInt4893 != arg1)) {
			Static17.method4214(GameShell.fullScreenFrame, GameShell.signlink);
			GameShell.fullScreenFrame = null;
		}
		if (arg3 == 3 && GameShell.fullScreenFrame == null) {
			GameShell.fullScreenFrame = Static5.method85(arg1, GameShell.signlink, arg0, 0);
			if (GameShell.fullScreenFrame != null) {
				Static218.preferences.anInt4893 = arg1;
				Static218.preferences.anInt4884 = arg0;
				Static218.preferences.write(GameShell.signlink);
			}
		}
		if (arg3 == 3 && GameShell.fullScreenFrame == null) {
			method3099(-1, -1, arg2, Static218.preferences.anInt4894, true);
			return;
		}
		@Pc(81) Container local81;
		@Pc(88) Insets local88;
		if (GameShell.fullScreenFrame != null) {
			Static142.anInt2663 = arg0;
			Static178.anInt2319 = arg1;
			local81 = GameShell.fullScreenFrame;
		} else if (GameShell.frame == null) {
			local81 = GameShell.signlink.applet;
			Static142.anInt2663 = local81.getSize().width;
			Static178.anInt2319 = local81.getSize().height;
		} else {
			local88 = GameShell.frame.getInsets();
			@Pc(96) int local96 = local88.left + local88.right;
			Static142.anInt2663 = GameShell.frame.getSize().width - local96;
			Static178.anInt2319 = GameShell.frame.getSize().height - local88.bottom - local88.top;
			local81 = GameShell.frame;
		}
		@Pc(159) int local159;
		if (arg3 == 1) {
			GameShell.leftMargin = (Static142.anInt2663 - Static254.anInt4701) / 2;
			GameShell.canvasWidth = Static254.anInt4701;
			GameShell.canvasHeight = Static263.anInt4834;
			GameShell.topMargin = 0;
		} else if (GameShell.maxMemory < 96 && Static77.anInt1762 == 0) {
			local159 = Static142.anInt2663 > 1024 ? 1024 : Static142.anInt2663;
			GameShell.canvasWidth = local159;
			@Pc(170) int local170 = Static178.anInt2319 <= 768 ? Static178.anInt2319 : 768;
			GameShell.leftMargin = (Static142.anInt2663 - local159) / 2;
			GameShell.topMargin = 0;
			GameShell.canvasHeight = local170;
		} else {
			GameShell.canvasWidth = Static142.anInt2663;
			GameShell.leftMargin = 0;
			GameShell.canvasHeight = Static178.anInt2319;
			GameShell.topMargin = 0;
		}
		if (Static189.aClass127_6 != Static121.aClass127_4) {
			@Pc(206) boolean local206;
			if (GameShell.canvasWidth < 1024 && GameShell.canvasHeight < 768) {
				local206 = true;
			} else {
				local206 = false;
			}
		}
		if (arg4) {
			Static78.method5700(Static77.anInt1762);
		} else {
			GameShell.canvas.setSize(GameShell.canvasWidth, GameShell.canvasHeight);
			if (Static190.aClass19_8 != null) {
				Static190.aClass19_8.method2803();
			}
			if (GameShell.frame == local81) {
				local88 = GameShell.frame.getInsets();
				GameShell.canvas.setLocation(GameShell.leftMargin + local88.left, local88.top + GameShell.topMargin);
			} else {
				GameShell.canvas.setLocation(GameShell.leftMargin, GameShell.topMargin);
			}
		}
		if (arg3 >= 2) {
			Static363.aBoolean464 = true;
		} else {
			Static363.aBoolean464 = false;
		}
		if (Static139.topLevelInterface != -1) {
			Static60.method891(true);
		}
		if (Static335.socket != null && (client.gameState == 30 || client.gameState == 25)) {
			Static93.method2002();
		}
		for (local159 = 0; local159 < 100; local159++) {
			Static357.aBooleanArray59[local159] = true;
		}
		GameShell.fullRedraw = true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3101(@OriginalArg(1) String arg0) {
		if (Static47.aClass214Array1 != null) {
			Static91.method1960(Static70.aClass145_57);
			Static257.outboundBuffer.p1(Static27.method872(arg0));
			Static257.outboundBuffer.pjstr(arg0);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!nk;)Ljava/lang/String;")
	public static String method3103(@OriginalArg(1) Component arg0) {
		if (Static45.getServerActiveProperties(arg0).getTargetMask() == 0) {
			return null;
		} else if (arg0.opCircumfix == null || arg0.opCircumfix.trim().length() == 0) {
			return Static18.qaOpTest ? "Hidden-use" : null;
		} else {
			return arg0.opCircumfix;
		}
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V")
	public static void method3104() {
		if (Static3.aBoolean5) {
			return;
		}
		Static175.method3324(Static390.aClass67ArrayArrayArray5);
		if (Static90.aClass67ArrayArrayArray4 != null) {
			Static175.method3324(Static90.aClass67ArrayArrayArray4);
		}
		Static3.aBoolean5 = true;
	}
}
