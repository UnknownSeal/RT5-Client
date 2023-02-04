import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "Lclient!nk;")
	public static Component aComponent_11;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
	public static int width;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_151 = new Class145(68, 3);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	public static void method3988() {
		for (@Pc(6) Class2_Sub5 local6 = (Class2_Sub5) Static129.A_LINKED_LIST___19.head(); local6 != null; local6 = (Class2_Sub5) Static129.A_LINKED_LIST___19.next()) {
			if (Static304.method5212(local6.anInt1005)) {
				Static391.method6453(local6);
			}
		}
		if (Static268.size == 1) {
			Static375.aBoolean477 = false;
			Static369.method6220(Static107.anInt2220, Static305.anInt5743, Static352.anInt6519, Static363.anInt6801);
			return;
		}
		Static369.method6220(Static107.anInt2220, Static305.anInt5743, Static352.anInt6519, Static363.anInt6801);
		@Pc(51) int local51 = Static113.aClass239_2.method6125(LocalisedText.CHOOSE_OPTION.getLocalisedText(client.language));
		for (@Pc(56) Class2_Sub5 local56 = (Class2_Sub5) Static129.A_LINKED_LIST___19.head(); local56 != null; local56 = (Class2_Sub5) Static129.A_LINKED_LIST___19.next()) {
			@Pc(62) int local62 = Static218.method1096(local56);
			if (local62 > local51) {
				local51 = local62;
			}
		}
		Static107.anInt2220 = local51 + 8;
		Static352.anInt6519 = Static268.size * 16 + (Static270.aBoolean371 ? 26 : 22);
	}
}
