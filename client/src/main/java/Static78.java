import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
	public static int anInt6309;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "Lclient!r;")
	public static Js5 aJs5_89;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lclient!h;")
	public static final Class89 aClass89_223 = new Class89(15, 10);

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "S")
	public static short aShort86 = 1;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "Lclient!h;")
	public static final Class89 aClass89_224 = new Class89(31, 8);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)V")
	public static void method5696(@OriginalArg(1) int arg0) {
		Static77.anInt1763 = -1;
		Static96.anInt2003 = arg0;
		Static77.anInt1763 = -1;
		Static298.method2422();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)C")
	public static char decodeChar(@OriginalArg(1) byte charByte) {
		@Pc(12) int codepoint = charByte & 0xFF;
		if (codepoint == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(codepoint, 16) + " provided");
		}
		if (codepoint >= 128 && codepoint < 160) {
			@Pc(43) char c = Static172.CP1252_TABLE[codepoint - 128];
			if (c == '\u0000') {
				c = '?';
			}
			codepoint = c;
		}
		return (char) codepoint;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!wm;ILclient!mg;)I")
	public static int method5698(@OriginalArg(0) Class19 arg0, @OriginalArg(2) Class148 arg1) {
		if (arg1.anInt3757 != -1) {
			return arg1.anInt3757;
		}
		if (arg1.anInt3762 != -1) {
			@Pc(30) Class229 local30 = arg0.anInterface2_5.method2658(arg0.method2871() ? arg1.anInt3762 : arg1.anInt3759);
			if (!local30.aBoolean438) {
				return local30.aShort87;
			}
		}
		return arg1.anInt3769;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(IB)V")
	public static void method5700(@OriginalArg(0) int arg0) {
		Static335.method5693();
		Static296.method5103();
		Static252.method4364(true, arg0);
		Static236.method4101(client.js5Archive8, client.js5Archive13, Static190.aClass19_8);
		Static44.method1358(Static190.aClass19_8, client.js5Archive8);
		Static144.method2691(Static124.aSpriteArray27);
		Static190.method3501();
		Static98.method2107();
		if (client.gameState == 10) {
			Static50.method1525(false);
		} else if (client.gameState == 30) {
			Static336.method5704(25);
			return;
		} else if (client.gameState == 5) {
			Static348.method5829(client.js5Archive8, Static190.aClass19_8);
			return;
		}
	}
}
