import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "Lclient!rb;")
	public static Class199 aClass199_1;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Lclient!ld;")
	public static final LinkedList A_LINKED_LIST___13 = new LinkedList();

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
	public static final int anInt1462 = 1401;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method1611() {
		if (Static347.anInt6442 == 10 || Static347.anInt6442 == 28) {
			Static387.method2835(5000, Static136.anInt6778 >> 10, Static211.anInt3777 >> 10);
		} else {
			@Pc(31) int local31 = Static17.self.anIntArray316[0] >> 3;
			@Pc(38) int local38 = Static17.self.anIntArray317[0] >> 3;
			if (local31 >= 0 && local31 < Static373.anInt7033 >> 3 && local38 >= 0 && Static242.anInt4449 >> 3 > local38) {
				Static387.method2835(5000, local31, local38);
			} else {
				Static387.method2835(0, Static373.anInt7033 >> 4, Static242.anInt4449 >> 4);
			}
		}
		Static140.method2623();
		Static291.method5028();
		Static248.method4340();
		Static50.method1530();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method1614() {
		if (Static18.aPrivelegedRequest_2 == null) {
			return;
		}
		if (Static18.aPrivelegedRequest_2.status == 1) {
			Static18.aPrivelegedRequest_2 = null;
			return;
		}
		if (Static18.aPrivelegedRequest_2.status == 2) {
			Static234.method4094(Static17.aSignLink_4, 2, Static257.aString39);
			Static18.aPrivelegedRequest_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
	public static void method1616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class2_Sub19 local10 = (Class2_Sub19) Static83.A_LINKED_LIST___14.head(); local10 != null; local10 = (Class2_Sub19) Static83.A_LINKED_LIST___14.next()) {
			Static337.method5705(arg2, arg3, local10, arg1, arg0);
		}
		for (@Pc(33) Class2_Sub19 local33 = (Class2_Sub19) Static363.A_LINKED_LIST___39.head(); local33 != null; local33 = (Class2_Sub19) Static363.A_LINKED_LIST___39.next()) {
			@Pc(37) byte local37 = 1;
			@Pc(42) BasType local42 = local33.aClass11_Sub5_Sub2_Sub2_1.method4331();
			if (local33.aClass11_Sub5_Sub2_Sub2_1.aBoolean317) {
				local37 = 0;
			} else if (local42.runSeqID == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4585 || local42.anInt6292 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4585 || local42.anInt6301 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4585 || local42.anInt6271 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4585) {
				local37 = 2;
			} else if (local42.crawlSeqID == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4585 || local33.aClass11_Sub5_Sub2_Sub2_1.anInt4585 == local42.anInt6299 || local42.anInt6267 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4585 || local42.anInt6284 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4585) {
				local37 = 3;
			}
			if (local37 != local33.anInt2900) {
				@Pc(133) int local133 = Static340.method5763(local33.aClass11_Sub5_Sub2_Sub2_1);
				if (local133 != local33.anInt2894) {
					if (local33.aClass2_Sub12_Sub4_3 != null) {
						client.soundStream.method2081(local33.aClass2_Sub12_Sub4_3);
						local33.aClass2_Sub12_Sub4_3 = null;
					}
					local33.anInt2894 = local133;
				}
				local33.anInt2900 = local37;
			}
			local33.anInt2899 = local33.aClass11_Sub5_Sub2_Sub2_1.xFine;
			local33.anInt2896 = local33.aClass11_Sub5_Sub2_Sub2_1.xFine + local33.aClass11_Sub5_Sub2_Sub2_1.method4327() * 64;
			local33.anInt2910 = local33.aClass11_Sub5_Sub2_Sub2_1.zFine;
			local33.anInt2904 = local33.aClass11_Sub5_Sub2_Sub2_1.zFine + local33.aClass11_Sub5_Sub2_Sub2_1.method4327() * 64;
			Static337.method5705(arg2, arg3, local33, arg1, arg0);
		}
		for (@Pc(208) Class2_Sub19 local208 = (Class2_Sub19) Static232.aClass4_86.head(); local208 != null; local208 = (Class2_Sub19) Static232.aClass4_86.next()) {
			@Pc(212) byte local212 = 1;
			@Pc(217) BasType local217 = local208.aClass11_Sub5_Sub2_Sub1_2.method4331();
			if (local208.aClass11_Sub5_Sub2_Sub1_2.aBoolean317) {
				local212 = 0;
			} else if (local208.aClass11_Sub5_Sub2_Sub1_2.anInt4585 == local217.runSeqID || local208.aClass11_Sub5_Sub2_Sub1_2.anInt4585 == local217.anInt6292 || local208.aClass11_Sub5_Sub2_Sub1_2.anInt4585 == local217.anInt6301 || local217.anInt6271 == local208.aClass11_Sub5_Sub2_Sub1_2.anInt4585) {
				local212 = 2;
			} else if (local217.crawlSeqID == local208.aClass11_Sub5_Sub2_Sub1_2.anInt4585 || local217.anInt6299 == local208.aClass11_Sub5_Sub2_Sub1_2.anInt4585 || local208.aClass11_Sub5_Sub2_Sub1_2.anInt4585 == local217.anInt6267 || local217.anInt6284 == local208.aClass11_Sub5_Sub2_Sub1_2.anInt4585) {
				local212 = 3;
			}
			if (local212 != local208.anInt2900) {
				@Pc(300) int local300 = Static384.method6414(local208.aClass11_Sub5_Sub2_Sub1_2);
				if (local300 != local208.anInt2894) {
					if (local208.aClass2_Sub12_Sub4_3 != null) {
						client.soundStream.method2081(local208.aClass2_Sub12_Sub4_3);
						local208.aClass2_Sub12_Sub4_3 = null;
					}
					local208.anInt2894 = local300;
				}
				local208.anInt2900 = local212;
			}
			local208.anInt2899 = local208.aClass11_Sub5_Sub2_Sub1_2.xFine;
			local208.anInt2896 = local208.aClass11_Sub5_Sub2_Sub1_2.xFine + local208.aClass11_Sub5_Sub2_Sub1_2.method4327() * 64;
			local208.anInt2910 = local208.aClass11_Sub5_Sub2_Sub1_2.zFine;
			local208.anInt2904 = local208.aClass11_Sub5_Sub2_Sub1_2.zFine + local208.aClass11_Sub5_Sub2_Sub1_2.method4327() * 64;
			Static337.method5705(arg2, arg3, local208, arg1, arg0);
		}
	}
}
