import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_251 = new Class145(72, 7);

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!gd;")
	public static final LocalisedText A_TRANSLATABLE_STRING___145 = new LocalisedText("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
	public static int anInt6999 = 2;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIILclient!nk;Lclient!kf;IB)V")
	public static void method6248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Component arg5, @OriginalArg(6) Class78 arg6, @OriginalArg(7) int arg7) {
		@Pc(19) int local19 = arg2 * arg2 + arg3 * arg3;
		if (local19 > arg1) {
			return;
		}
		@Pc(37) int local37 = Math.min(arg5.width / 2, arg5.height / 2);
		if (local37 * local37 >= local19) {
			Static376.renderDot(arg6, arg2, arg7, arg3, Static123.aClass13Array10[arg0], arg4, arg5);
			return;
		}
		local37 -= 10;
		@Pc(66) int local66;
		if (Static314.anInt5911 == 4) {
			local66 = (int) Static277.aFloat67 & 0x3FFF;
		} else {
			local66 = (int) Static277.aFloat67 + Static6.anInt158 & 0x3FFF;
		}
		@Pc(77) int local77 = Class19.anIntArray178[local66];
		@Pc(81) int local81 = Class19.COSINE[local66];
		if (Static314.anInt5911 != 4) {
			local77 = local77 * 256 / (Static97.anInt2005 + 256);
			local81 = local81 * 256 / (Static97.anInt2005 + 256);
		}
		@Pc(112) int local112 = local81 * arg2 + arg3 * local77 >> 15;
		@Pc(123) int local123 = arg3 * local81 - arg2 * local77 >> 15;
		@Pc(129) double local129 = Math.atan2((double) local112, (double) local123);
		@Pc(136) int local136 = (int) (Math.sin(local129) * (double) local37);
		@Pc(143) int local143 = (int) ((double) local37 * Math.cos(local129));
		Static116.aClass13Array8[arg0].method6385((float) arg5.width / 2.0F + (float) arg7 + (float) local136, (float) -local143 + (float) arg5.height / 2.0F + (float) arg4, 4096, (int) (-local129 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!qg;)V")
	public static void method6251(@OriginalArg(1) Packet arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static325.anInt6079; local15++) {
			@Pc(21) int local21 = Static52.anIntArray100[local15];
			@Pc(25) Class11_Sub5_Sub2_Sub1 local25 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local21];
			@Pc(29) int local29 = arg0.g1();
			if ((local29 & 0x2) != 0) {
				local29 += arg0.g1() << 8;
			}
			Static303.method5211(arg0, local21, local25, local29);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void report(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String suffix) {
		try {
			@Pc(7) String message = "";
			if (arg0 != null) {
				message = Static174.toString(arg0);
			}
			if (suffix != null) {
				if (arg0 != null) {
					message = message + " | ";
				}
				message = message + suffix;
			}
			Static342.method5152(message);
			message = Static200.method3646(message, "%3a", ":");
			message = Static200.method3646(message, "%40", "@");
			message = Static200.method3646(message, "%26", "&");
			message = Static200.method3646(message, "%23", "#");
			if (Static392.aClass152_6.applet != null) {
				@Pc(103) PrivelegedRequest local103 = Static392.aClass152_6.method3765(new URL(Static392.aClass152_6.applet.getCodeBase(), "clienterror.ws?c=" + Static277.clientVersion + "&u=" + Static241.aLong130 + "&v1=" + Static215.aString33 + "&v2=" + Static215.aString34 + "&e=" + message));
				while (local103.status == 0) {
					Static231.sleep(1L);
				}
				if (local103.status == 1) {
					@Pc(121) DataInputStream local121 = (DataInputStream) local103.result;
					local121.read();
					local121.close();
				}
			}
		} catch (@Pc(133) Exception local133) {
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
	public static void method6253() {
		Static217.method3794(Static218.aClass177_Sub1_2.anInt4883);
		@Pc(18) int local18 = (Static136.anInt6778 >> 10) + (Static164.originX >> 3);
		@Pc(27) int local27 = (Static211.anInt3777 >> 10) + (Static148.originZ >> 3);
		Static355.anInt6585 = Static17.self.aByte78 = 0;
		Static17.self.method4063(8, 8);
		Static51.underwaterMapGroupIDs = new int[18];
		Static106.mapBytes = new byte[18][];
		Static232.underwaterMapBytes = new byte[18][];
		Static82.locBytes = new byte[18][];
		Static62.underwaterLocGroupIDs = new int[18];
		Static270.underwaterLocBytes = new byte[18][];
		Static190.npcGroupIDs = new int[18];
		Static221.mapGroupIDs = new int[18];
		Static210.npcBytes = new byte[18][];
		Static374.locGroupIDs = new int[18];
		Static291.mapSquares = new int[18];
		Static277.xteaKeys = new int[18][4];
		@Pc(78) int i = 0;
		@Pc(97) int mapZ;
		for (@Pc(87) int mapX = (local18 - (Static373.anInt7033 >> 4)) / 8; mapX <= ((Static373.anInt7033 >> 4) + local18) / 8; mapX++) {
			for (mapZ = (local27 - (Static242.anInt4449 >> 4)) / 8; mapZ <= (local27 + (Static242.anInt4449 >> 4)) / 8; mapZ++) {
				@Pc(105) int mapSquare = (mapX << 8) + mapZ;
				Static291.mapSquares[i] = mapSquare;
				Static221.mapGroupIDs[i] = Static288.js5Archive5.getGroupID("m" + mapX + "_" + mapZ);
				Static374.locGroupIDs[i] = Static288.js5Archive5.getGroupID("l" + mapX + "_" + mapZ);
				Static190.npcGroupIDs[i] = Static288.js5Archive5.getGroupID("n" + mapX + "_" + mapZ);
				Static51.underwaterMapGroupIDs[i] = Static288.js5Archive5.getGroupID("um" + mapX + "_" + mapZ);
				Static62.underwaterLocGroupIDs[i] = Static288.js5Archive5.getGroupID("ul" + mapX + "_" + mapZ);
				if (Static190.npcGroupIDs[i] == -1) {
					Static221.mapGroupIDs[i] = -1;
					Static374.locGroupIDs[i] = -1;
					Static51.underwaterMapGroupIDs[i] = -1;
					Static62.underwaterLocGroupIDs[i] = -1;
				}
				i++;
			}
		}
		for (mapZ = i; mapZ < Static190.npcGroupIDs.length; mapZ++) {
			Static190.npcGroupIDs[mapZ] = -1;
			Static221.mapGroupIDs[mapZ] = -1;
			Static374.locGroupIDs[mapZ] = -1;
			Static51.underwaterMapGroupIDs[mapZ] = -1;
			Static62.underwaterLocGroupIDs[mapZ] = -1;
		}
		Static373.method6266(true, local18, false, local27);
	}
}
