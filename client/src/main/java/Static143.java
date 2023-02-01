import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "Lclient!s;")
	public static final Class210 aClass210_7 = new Class210(0, 4);

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_102 = new Class145(45, 3);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBZI)V")
	public static void setWindowMode(@OriginalArg(3) boolean replaceCannvas, @OriginalArg(1) int mode, @OriginalArg(0) int arg0, @OriginalArg(4) int arg3) {
		Static338.aLong214 = 0L;
		@Pc(12) int oldMode = Static144.getWindowMode();
		if (mode == 3 || oldMode == 3) {
			replaceCannvas = true;
		}
		if (!Static190.aClass19_8.method2840()) {
			replaceCannvas = true;
		}
		Static163.method3099(arg3, arg0, oldMode, mode, replaceCannvas);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)V")
	public static void method2679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static116.anInt2357 == 1) {
			Static259.method4426(Static32.aClass2_Sub5_2, arg1, arg0);
		} else if (Static116.anInt2357 == 2) {
			Static388.method6438(arg1, arg0);
		}
		Static116.anInt2357 = 0;
		Static32.aClass2_Sub5_2 = null;
	}
}
