import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!nn", name = "C", descriptor = "[I")
	public static final int[] anIntArray284 = new int[2048];

	@OriginalMember(owner = "client!nn", name = "V", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_158 = new Class145(78, 5);

	@OriginalMember(owner = "client!nn", name = "W", descriptor = "[I")
	public static final int[] anIntArray285 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)V")
	public static void method4151(@OriginalArg(1) boolean arg0) {
		for (@Pc(12) Class2_Sub19 local12 = (Class2_Sub19) Static83.A_LINKED_LIST___14.head(); local12 != null; local12 = (Class2_Sub19) Static83.A_LINKED_LIST___14.next()) {
			if (local12.aClass2_Sub12_Sub4_3 != null) {
				client.soundStream.method2081(local12.aClass2_Sub12_Sub4_3);
				local12.aClass2_Sub12_Sub4_3 = null;
			}
			if (local12.aClass2_Sub12_Sub4_2 != null) {
				client.soundStream.method2081(local12.aClass2_Sub12_Sub4_2);
				local12.aClass2_Sub12_Sub4_2 = null;
			}
			local12.unlink();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(55) Class2_Sub19 local55 = (Class2_Sub19) Static363.A_LINKED_LIST___39.head(); local55 != null; local55 = (Class2_Sub19) Static363.A_LINKED_LIST___39.next()) {
			if (local55.aClass2_Sub12_Sub4_3 != null) {
				client.soundStream.method2081(local55.aClass2_Sub12_Sub4_3);
				local55.aClass2_Sub12_Sub4_3 = null;
			}
			local55.unlink();
		}
		for (@Pc(82) Class2_Sub19 local82 = (Class2_Sub19) Static232.aClass4_86.head(); local82 != null; local82 = (Class2_Sub19) Static232.aClass4_86.next()) {
			if (local82.aClass2_Sub12_Sub4_3 != null) {
				client.soundStream.method2081(local82.aClass2_Sub12_Sub4_3);
				local82.aClass2_Sub12_Sub4_3 = null;
			}
			local82.unlink();
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!wm;B)V")
	public static void method4155(@OriginalArg(0) Class19 arg0) {
		if (Static17.self.aByte78 != Static343.anInt6389 && (Static330.aClass67ArrayArrayArray3 != null && Static49.method1472(arg0, Static17.self.aByte78))) {
			Static343.anInt6389 = Static17.self.aByte78;
		}
	}
}
