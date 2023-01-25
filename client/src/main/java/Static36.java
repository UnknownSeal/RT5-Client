import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static36 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public static int anInt925;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Lclient!mc;")
	public static Class145 aClass145_34 = new Class145(2, 8);

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Lclient!h;")
	public static Class89 aClass89_31 = new Class89(3, 3);

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "[B")
	public static byte[] aByteArray7 = new byte[2048];

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Lclient!gd;")
	public static Class79 aClass79_22 = new Class79("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
	public static void method1110() {
		aByteArray7 = null;
		aClass79_22 = null;
		aClass89_31 = null;
		aClass145_34 = null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BIB)I")
	public static int method1111(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static80.method5980(arg1, 0, arg0);
	}
}
