import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_266 = new Class145(23, -1);

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "Lclient!jm;")
	public static final Class116 types = new Class116(64);

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "[I")
	public static final int[] anIntArray494 = new int[1000];

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!ci;IBLjava/awt/Canvas;)Lclient!wm;")
	public static Class19 method6436(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2) {
		return new Class19_Sub2(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V")
	public static void loop() {
		try {
			if (Static235.state == 1) {
				@Pc(16) int volume = Static91.stream.getVolume();
				if (volume > 0 && Static91.stream.isValid()) {
					volume -= Static28.volumeFadeRate;
					if (volume < 0) {
						volume = 0;
					}
					Static91.stream.setVolume(volume);
				} else {
					Static91.stream.method4273();
					Static91.stream.clearInstrument();
					Static155.aClass2_Sub34_1 = null;
					Static164.aSoundBank_1 = null;
					if (Static116.songArchive == null) {
						Static235.state = 0;
					} else {
						Static235.state = 2;
					}
				}
			}
		} catch (@Pc(57) Exception exception) {
			exception.printStackTrace();
			Static91.stream.method4273();
			Static164.aSoundBank_1 = null;
			Static235.state = 0;
			Static116.songArchive = null;
			Static155.aClass2_Sub34_1 = null;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZI)V")
	public static void method6438(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static113.aClass239_2.method6125(LocalisedText.CHOOSE_OPTION.getLocalisedText(client.language));
		@Pc(24) int local24;
		for (@Pc(18) Class2_Sub5 local18 = (Class2_Sub5) Static129.A_LINKED_LIST___19.head(); local18 != null; local18 = (Class2_Sub5) Static129.A_LINKED_LIST___19.next()) {
			local24 = Static218.method1096(local18);
			if (local24 > local13) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static268.size * 16 + 21;
		@Pc(54) int local54 = arg0 - local13 / 2;
		if (local54 + local13 > GameShell.canvasWidth) {
			local54 = GameShell.canvasWidth - local13;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(77) int local77 = arg1;
		if (GameShell.canvasHeight < local24 + arg1) {
			local77 = GameShell.canvasHeight - local24;
		}
		if (local77 < 0) {
			local77 = 0;
		}
		Static305.anInt5743 = local54;
		Static107.anInt2220 = local13;
		Static352.anInt6519 = Static268.size * 16 + (Static270.aBoolean371 ? 26 : 22);
		Static363.anInt6801 = local77;
		Static375.aBoolean477 = true;
	}
}
