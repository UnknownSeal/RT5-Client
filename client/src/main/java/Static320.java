import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static320 {

	@OriginalMember(owner = "client!sm", name = "A", descriptor = "Lclient!ii;")
	public static Class104 aClass104_2;

	@OriginalMember(owner = "client!sm", name = "D", descriptor = "I")
	public static int anInt6007;

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_8 = new Class16("", 13);

	@OriginalMember(owner = "client!sm", name = "w", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger MODULUS = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
	public static int anInt6005 = 0;

	@OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
	public static int anInt6006 = 0;

	@OriginalMember(owner = "client!sm", name = "B", descriptor = "Lclient!h;")
	public static final Class89 aClass89_214 = new Class89(93, 5);

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
	public static void method5460() {
		Static133.A_SOFT_LRU_HASH_TABLE___17.method2621();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
	public static String method5461(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static139.method2594(arg0);
	}
}
