import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
	public static int anInt6376;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "[I")
	public static final int[] anIntArray429 = new int[14];

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V")
	public static void method5766(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static330.aClass67ArrayArrayArray3 = Static90.aClass67ArrayArrayArray4;
			Static365.aClass6Array4 = Static186.aClass6Array2;
		} else {
			Static330.aClass67ArrayArrayArray3 = Static390.aClass67ArrayArrayArray5;
			Static365.aClass6Array4 = Static330.aClass6Array3;
		}
		Static92.anInt1914 = Static330.aClass67ArrayArrayArray3.length;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)I")
	public static int method5767(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void clickPlayerOption(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static31.anInt751;
		@Pc(9) int[] local9 = Static85.anIntArray121;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class11_Sub5_Sub2_Sub1 local21 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local9[local13]];
			if (local21 != null && Static17.self != local21 && local21.aString41 != null && local21.aString41.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					Static91.method1960(Static7.aClass145_267);
					Static257.aClass2_Sub4_Sub2_4.p1(0);
					Static257.aClass2_Sub4_Sub2_4.ip2add(local9[local13]);
				} else if (arg0 == 4) {
					Static91.method1960(Static183.aClass145_7);
					Static257.aClass2_Sub4_Sub2_4.p1neg(0);
					Static257.aClass2_Sub4_Sub2_4.ip2_dup(local9[local13]);
				} else if (arg0 == 5) {
					Static91.method1960(Static132.aClass145_92);
					Static257.aClass2_Sub4_Sub2_4.ip2_dup(local9[local13]);
					Static257.aClass2_Sub4_Sub2_4.p1sub(0);
				} else if (arg0 == 6) {
					Static91.method1960(Static143.aClass145_102);
					Static257.aClass2_Sub4_Sub2_4.ip2_dup(local9[local13]);
					Static257.aClass2_Sub4_Sub2_4.p1add(0);
				} else if (arg0 == 7) {
					Static91.method1960(Static21.aClass145_25);
					Static257.aClass2_Sub4_Sub2_4.p1sub(0);
					Static257.aClass2_Sub4_Sub2_4.ip2add(local9[local13]);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static207.add(LocalisedText.UNABLE_TO_FIND.getLocalisedText(client.language) + arg1);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[IIJ)Ljava/lang/String;")
	public static String decodeCommand(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		if (Static325.anInterface9_1 != null) {
			@Pc(17) String local17 = Static325.anInterface9_1.method2360(arg2, arg0, arg1);
			if (local17 != null) {
				return local17;
			}
		}
		return Long.toString(arg2);
	}
}
