import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_7 = new Class16("", 17);

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)I")
	public static int method5276(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = (local15 * local15 * 15731 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	public static void method5277() {
		if (Static139.topLevelInterface == -1) {
			return;
		}
		@Pc(20) int local20 = Static226.aClass119_1.method3303();
		@Pc(24) int local24 = Static226.aClass119_1.method3312();
		if (Static370.aClass2_Sub24_1 != null) {
			local20 = Static370.aClass2_Sub24_1.method5242();
			local24 = Static370.aClass2_Sub24_1.method5241();
		}
		Static257.method3926(0, GameShell.canvasHeight, GameShell.canvasWidth, 0, 0, local20, Static139.topLevelInterface, local24, 0);
		if (Static227.aComponent_11 != null) {
			Static12.method280(local20, local24);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method5278(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static301.anInt5700 >= 100) {
			Static207.add(LocalisedText.IGNORE_LIST_FULL.getLocalisedText(client.language));
			return;
		}
		@Pc(22) String local22 = Static135.method2537(arg0);
		if (local22 == null) {
			return;
		}
		@Pc(65) String local65;
		for (@Pc(27) int local27 = 0; local27 < Static301.anInt5700; local27++) {
			@Pc(35) String local35 = Static135.method2537(Static226.aStringArray35[local27]);
			if (local35 != null && local35.equals(local22)) {
				Static207.add(arg0 + LocalisedText.IGNORE_LIST_ALREADY_EXISTS.getLocalisedText(client.language));
				return;
			}
			if (Static371.aStringArray66[local27] != null) {
				local65 = Static135.method2537(Static371.aStringArray66[local27]);
				if (local65 != null && local65.equals(local22)) {
					Static207.add(arg0 + LocalisedText.IGNORE_LIST_ALREADY_EXISTS.getLocalisedText(client.language));
					return;
				}
			}
		}
		for (@Pc(95) int local95 = 0; local95 < Static384.anInt7178; local95++) {
			local65 = Static135.method2537(Static17.aStringArray43[local95]);
			if (local65 != null && local65.equals(local22)) {
				Static207.add(LocalisedText.PLEASE_REMOVE_1.getLocalisedText(client.language) + arg0 + LocalisedText.FROM_YOUR_FRIEND_LIST_FIRST.getLocalisedText(client.language));
				return;
			}
			if (Static319.aStringArray54[local95] != null) {
				@Pc(138) String local138 = Static135.method2537(Static319.aStringArray54[local95]);
				if (local138 != null && local138.equals(local22)) {
					Static207.add(LocalisedText.PLEASE_REMOVE_1.getLocalisedText(client.language) + arg0 + LocalisedText.FROM_YOUR_FRIEND_LIST_FIRST.getLocalisedText(client.language));
					return;
				}
			}
		}
		if (Static135.method2537(Static17.self.aString41).equals(local22)) {
			Static207.add(LocalisedText.IGNORE_LIST_ADD_SELF.getLocalisedText(client.language));
		} else {
			Static91.method1960(Static192.aClass145_139);
			Static257.aClass2_Sub4_Sub2_4.p1(Static27.method872(arg0) + 1);
			Static257.aClass2_Sub4_Sub2_4.pjstr(arg0);
			Static257.aClass2_Sub4_Sub2_4.p1(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
	public static void method5279() {
		Static146.anInt2703 = 0;
		Static312.anInt5844 = -1;
		Static358.anInt6550 = -1;
	}
}
