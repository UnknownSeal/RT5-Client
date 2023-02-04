import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_65 = new Class145(10, 8);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(CB)Z")
	public static boolean method1908(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(37) char[] local37 = Static172.CP1252_TABLE;
			for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
				@Pc(45) char local45 = local37[local39];
				if (arg0 == local45) {
					return true;
				}
			}
		}
		return false;
	}

}
