import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
	public static int anInt1549 = -1;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)[Lclient!oi;")
	public static Class169[] method1703() {
		if (Static232.aClass169Array1 == null) {
			@Pc(15) Class169[] local15 = Static110.method2265(GameShell.signlink);
			@Pc(19) Class169[] local19 = new Class169[local15.length];
			@Pc(21) int local21 = 0;
			@Pc(75) int local75;
			@Pc(81) Class169 local81;
			label63: for (@Pc(23) int local23 = 0; local23 < local15.length; local23++) {
				@Pc(29) Class169 local29 = local15[local23];
				if ((local29.anInt4687 <= 0 || local29.anInt4687 >= 24) && local29.anInt4685 >= 800 && local29.anInt4684 >= 600 && (GameShell.maxMemory >= 96 || Static77.anInt1762 != 0 || local29.anInt4685 <= 1024 && local29.anInt4684 <= 768)) {
					for (local75 = 0; local75 < local21; local75++) {
						local81 = local19[local75];
						if (local29.anInt4685 == local81.anInt4685 && local81.anInt4684 == local29.anInt4684) {
							if (local29.anInt4687 > local81.anInt4687) {
								local19[local75] = local29;
							}
							continue label63;
						}
					}
					local19[local21] = local29;
					local21++;
				}
			}
			Static232.aClass169Array1 = new Class169[local21];
			Static403.method4608(local19, 0, Static232.aClass169Array1, 0, local21);
			@Pc(145) int[] local145 = new int[Static232.aClass169Array1.length];
			for (local75 = 0; local75 < Static232.aClass169Array1.length; local75++) {
				local81 = Static232.aClass169Array1[local75];
				local145[local75] = local81.anInt4684 * local81.anInt4685;
			}
			Static226.method3983(Static232.aClass169Array1, local145);
		}
		return Static232.aClass169Array1;
	}
}
