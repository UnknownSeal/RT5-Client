import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "Z")
	public static boolean forceTween = false;

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
	public static int anInt5968 = -2;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLclient!cf;)Ljava/lang/String;")
	public static String method5420(@OriginalArg(1) Class2_Sub5 arg0) {
		return arg0.aString11 == null || arg0.aString11.length() <= 0 ? arg0.aString10 : arg0.aString10 + LocalisedText.MINI_SEPARATOR.getLocalisedText(client.language) + arg0.aString11;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
	public static void method5424() {
		@Pc(12) FileOnDisk local12 = null;
		try {
			@Pc(16) PrivelegedRequest local16 = GameShell.signlink.method3755();
			while (local16.status == 0) {
				Static231.sleep(1L);
			}
			if (local16.status == 1) {
				local12 = (FileOnDisk) local16.result;
				@Pc(40) byte[] local40 = new byte[(int) local12.method5195()];
				@Pc(55) int local55;
				for (@Pc(42) int local42 = 0; local42 < local40.length; local42 += local55) {
					local55 = local12.method5193(local40.length - local42, local42, local40);
					if (local55 == -1) {
						throw new IOException("EOF");
					}
				}
				Static180.method3367(new Buffer(local40));
			}
		} catch (@Pc(82) Exception local82) {
		}
		try {
			if (local12 != null) {
				local12.close();
			}
		} catch (@Pc(89) Exception local89) {
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method5428(@OriginalArg(1) Class19 arg0) {
		if (Static142.A_LINKED_LIST___21.method3542() == 0) {
			return;
		}
		@Pc(50) Class2_Sub17 local50;
		if (Static77.anInt1762 == 0) {
			for (local50 = (Class2_Sub17) Static142.A_LINKED_LIST___21.head(); local50 != null; local50 = (Class2_Sub17) Static142.A_LINKED_LIST___21.next()) {
				Static313.aClass107_2.method2769(local50.anInt2541, Static200.aClass130_3, local50.anInt2539, arg0, false, local50.anInt2535, false, local50.aBoolean183 ? Static17.self.appearance : null, local50.anInt2537, arg0, local50.anInt2538);
				local50.unlink();
			}
			Static98.method2107();
			return;
		}
		if (Static179.aClass19_5 == null) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(36, 32);
			Static179.aClass19_5 = Static387.method2822(0, GameShell.signlink, Static128.anInterface2_4, local18, 0);
			Static76.aClass130_2 = Static179.aClass19_5.method2857(Static101.method2165(Static183.anInt80, client.js5Archive13), Static396.method1688(client.js5Archive8, Static183.anInt80));
		}
		for (local50 = (Class2_Sub17) Static142.A_LINKED_LIST___21.head(); local50 != null; local50 = (Class2_Sub17) Static142.A_LINKED_LIST___21.next()) {
			Static313.aClass107_2.method2769(local50.anInt2541, Static76.aClass130_2, local50.anInt2539, arg0, false, local50.anInt2535, false, local50.aBoolean183 ? Static17.self.appearance : null, local50.anInt2537, Static179.aClass19_5, local50.anInt2538);
			local50.unlink();
		}
	}
}
