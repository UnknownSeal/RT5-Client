import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_134 = new Class145(57, 8);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method3371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 >= Static28.anInt675 && Static82.anInt1837 >= arg5 && Static365.anInt6832 <= arg2 && Static161.anInt2954 >= arg1) {
			Static34.method4819(arg1, arg4, arg0, arg5, arg6, arg2, arg3);
		} else {
			Static383.method6379(arg5, arg3, arg2, arg0, arg4, arg1, arg6);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)V")
	public static void method3374(@OriginalArg(0) boolean arg0) {
		Static220.aBoolean252 = arg0;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(23) int local23;
		@Pc(36) boolean local36;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(59) int local59;
		if (!Static220.aBoolean252) {
			local13 = Static212.inboundBuffer.ig2();
			local17 = Static212.inboundBuffer.g2();
			local23 = Static212.inboundBuffer.g1();
			local36 = Static212.inboundBuffer.g1bneg() == 1;
			Static217.method3794(local23);
			local44 = (Static82.anInt1836 - Static212.inboundBuffer.offset) / 16;
			Static277.xteaKeys = new int[local44][4];
			for (local48 = 0; local48 < local44; local48++) {
				for (local52 = 0; local52 < 4; local52++) {
					Static277.xteaKeys[local48][local52] = Static212.inboundBuffer.mg4();
				}
			}
			Static106.mapBytes = new byte[local44][];
			Static51.underwaterMapGroupIDs = new int[local44];
			Static82.locBytes = new byte[local44][];
			Static232.underwaterMapBytes = new byte[local44][];
			Static374.locGroupIDs = new int[local44];
			Static221.mapGroupIDs = new int[local44];
			Static291.mapSquares = new int[local44];
			Static62.underwaterLocGroupIDs = new int[local44];
			Static270.underwaterLocBytes = new byte[local44][];
			Static210.npcBytes = null;
			Static190.npcGroupIDs = null;
			local44 = 0;
			for (local52 = (local13 - (Static373.anInt7033 >> 4)) / 8; local52 <= (local13 + (Static373.anInt7033 >> 4)) / 8; local52++) {
				for (local59 = (local17 - (Static242.anInt4449 >> 4)) / 8; local59 <= (local17 + (Static242.anInt4449 >> 4)) / 8; local59++) {
					Static291.mapSquares[local44] = (local52 << 8) + local59;
					Static221.mapGroupIDs[local44] = Static288.js5Archive5.getGroupID("m" + local52 + "_" + local59);
					Static374.locGroupIDs[local44] = Static288.js5Archive5.getGroupID("l" + local52 + "_" + local59);
					Static51.underwaterMapGroupIDs[local44] = Static288.js5Archive5.getGroupID("um" + local52 + "_" + local59);
					Static62.underwaterLocGroupIDs[local44] = Static288.js5Archive5.getGroupID("ul" + local52 + "_" + local59);
					local44++;
				}
			}
			Static373.method6266(false, local13, local36, local17);
			return;
		}
		local13 = Static212.inboundBuffer.g2();
		local17 = Static212.inboundBuffer.ig2();
		local23 = Static212.inboundBuffer.g1bneg();
		local36 = Static212.inboundBuffer.g1bneg() == 1;
		Static217.method3794(local23);
		Static212.inboundBuffer.accessBits();
		for (local44 = 0; local44 < 4; local44++) {
			for (local48 = 0; local48 < Static373.anInt7033 >> 3; local48++) {
				for (local52 = 0; local52 < Static242.anInt4449 >> 3; local52++) {
					local59 = Static212.inboundBuffer.gBit(1);
					if (local59 == 1) {
						Static310.anIntArrayArrayArray12[local44][local48][local52] = Static212.inboundBuffer.gBit(26);
					} else {
						Static310.anIntArrayArrayArray12[local44][local48][local52] = -1;
					}
				}
			}
		}
		Static212.inboundBuffer.accessBytes();
		local48 = (Static82.anInt1836 - Static212.inboundBuffer.offset) / 16;
		Static277.xteaKeys = new int[local48][4];
		for (local52 = 0; local52 < local48; local52++) {
			for (local59 = 0; local59 < 4; local59++) {
				Static277.xteaKeys[local52][local59] = Static212.inboundBuffer.mg4();
			}
		}
		Static374.locGroupIDs = new int[local48];
		Static62.underwaterLocGroupIDs = new int[local48];
		Static232.underwaterMapBytes = new byte[local48][];
		Static270.underwaterLocBytes = new byte[local48][];
		Static106.mapBytes = new byte[local48][];
		Static190.npcGroupIDs = null;
		Static221.mapGroupIDs = new int[local48];
		Static210.npcBytes = null;
		Static51.underwaterMapGroupIDs = new int[local48];
		Static291.mapSquares = new int[local48];
		Static82.locBytes = new byte[local48][];
		local48 = 0;
		for (local59 = 0; local59 < 4; local59++) {
			for (@Pc(195) int local195 = 0; local195 < Static373.anInt7033 >> 3; local195++) {
				for (@Pc(199) int local199 = 0; local199 < Static242.anInt4449 >> 3; local199++) {
					@Pc(209) int local209 = Static310.anIntArrayArrayArray12[local59][local195][local199];
					if (local209 != -1) {
						@Pc(219) int local219 = local209 >> 14 & 0x3FF;
						@Pc(225) int local225 = local209 >> 3 & 0x7FF;
						@Pc(235) int local235 = local225 / 8 + (local219 / 8 << 8);
						for (@Pc(237) int local237 = 0; local237 < local48; local237++) {
							if (local235 == Static291.mapSquares[local237]) {
								local235 = -1;
								break;
							}
						}
						if (local235 != -1) {
							Static291.mapSquares[local48] = local235;
							@Pc(270) int local270 = local235 >> 8 & 0xFF;
							@Pc(274) int local274 = local235 & 0xFF;
							Static221.mapGroupIDs[local48] = Static288.js5Archive5.getGroupID("m" + local270 + "_" + local274);
							Static374.locGroupIDs[local48] = Static288.js5Archive5.getGroupID("l" + local270 + "_" + local274);
							Static51.underwaterMapGroupIDs[local48] = Static288.js5Archive5.getGroupID("um" + local270 + "_" + local274);
							Static62.underwaterLocGroupIDs[local48] = Static288.js5Archive5.getGroupID("ul" + local270 + "_" + local274);
							local48++;
						}
					}
				}
			}
		}
		Static373.method6266(false, local13, local36, local17);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([Lclient!nk;II)V")
	public static void method3377(@OriginalArg(0) Component[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Component local13 = arg0[local7];
			if (local13 != null && arg1 == local13.layer && !Static45.method1403(local13)) {
				if (local13.type == 0) {
					method3377(arg0, local13.id);
					if (local13.createdComponent != null) {
						method3377(local13.createdComponent, local13.id);
					}
					@Pc(51) Class2_Sub7 local51 = (Class2_Sub7) Static329.aClass4_130.get((long) local13.id);
					if (local51 != null) {
						Static232.method4027(local51.anInt1370);
					}
				}
				if (local13.type == 6 && local13.modelSeqID != -1) {
					@Pc(71) Class157 local71 = Static39.aClass85_1.method2371(local13.modelSeqID);
					if (local71 != null) {
						local13.anInt4283 += Static165.anInt3148;
						while (local71.anIntArray261[local13.anInt4247] < local13.anInt4283) {
							local13.anInt4283 -= local71.anIntArray261[local13.anInt4247];
							local13.anInt4247++;
							if (local71.anIntArray262.length <= local13.anInt4247) {
								local13.anInt4247 -= local71.anInt4032;
								if (local13.anInt4247 < 0 || local13.anInt4247 >= local71.anIntArray262.length) {
									local13.anInt4247 = 0;
								}
							}
							local13.anInt4316 = local13.anInt4247 + 1;
							if (local71.anIntArray262.length <= local13.anInt4316) {
								local13.anInt4316 -= local71.anInt4032;
								if (local13.anInt4316 < 0 || local13.anInt4316 >= local71.anIntArray262.length) {
									local13.anInt4316 = -1;
								}
							}
							Static200.redraw(local13);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)I")
	public static int method3380(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return ((arg0 >> 2 & 0x3F) << 10) + (arg2 >> 5 << 7) + (arg1 >> 1);
	}
}
