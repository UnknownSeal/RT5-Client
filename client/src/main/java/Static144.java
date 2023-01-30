import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "Lclient!client;")
	public static client instance;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
	public static int anInt2694 = 0;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "Lclient!h;")
	public static final Class89 aClass89_112 = new Class89(38, 14);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
	public static void method2690() {
		for (@Pc(14) Class2_Sub37 local14 = (Class2_Sub37) Static207.aClass135_26.method3550(); local14 != null; local14 = (Class2_Sub37) Static207.aClass135_26.method3551()) {
			if (local14.anInt6485 == -1) {
				local14.anInt6488 = 0;
				Static83.method1906(local14);
			} else {
				local14.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([Lclient!jd;I)V")
	public static void method2691(@OriginalArg(0) Class13[] arg0) {
		Static361.anInt6770 = arg0.length;
		Static134.aClass13Array12 = new Class13[Static361.anInt6770 + 10];
		Static72.anIntArray114 = new int[Static361.anInt6770 + 10];
		Static403.method4608(arg0, 0, Static134.aClass13Array12, 0, Static361.anInt6770);
		for (@Pc(31) int local31 = 0; local31 < Static361.anInt6770; local31++) {
			Static72.anIntArray114[local31] = Static134.aClass13Array12[local31].method6383();
		}
		for (@Pc(50) int local50 = Static361.anInt6770; local50 < Static134.aClass13Array12.length; local50++) {
			Static72.anIntArray114[local50] = 12;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I")
	public static int method2692() {
		if (Static363.aFrame2 == null) {
			return Static363.aBoolean464 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
