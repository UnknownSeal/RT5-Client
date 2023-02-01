import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class2_Sub41 extends Node {

	@OriginalMember(owner = "client!we", name = "u", descriptor = "[I")
	public int[] anIntArray488 = new int[1];

	@OriginalMember(owner = "client!we", name = "x", descriptor = "[I")
	public int[] anIntArray489 = new int[] { -1 };

	static {
		new LocalisedText("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIZLclient!nb;IILclient!jo;Lclient!wm;)Lclient!gn;")
	public Model method6359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class157 arg4, @OriginalArg(6) int arg5, @OriginalArg(8) Class117 arg6, @OriginalArg(9) Class19 arg7) {
		@Pc(7) Model local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) BasType local11 = null;
		if (arg2 != -1) {
			local11 = Static59.aClass7_1.method245(arg2);
		}
		@Pc(23) int[] local23 = this.anIntArray489;
		if (local11 != null && local11.anIntArray425 != null) {
			local23 = new int[local11.anIntArray425.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray425.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray425[local35];
				if (local42 >= 0 && this.anIntArray489.length > local42) {
					local23[local35] = this.anIntArray489[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(70) boolean local70 = false;
		@Pc(77) boolean local77 = false;
		@Pc(79) boolean local79 = false;
		@Pc(81) int local81 = -1;
		@Pc(83) int local83 = -1;
		@Pc(85) int local85 = 0;
		@Pc(87) Class2_Sub2_Sub13 local87 = null;
		@Pc(89) Class2_Sub2_Sub13 local89 = null;
		if (arg4 != null) {
			local81 = arg4.anIntArray262[arg0];
			local9 = 1056;
			@Pc(104) int local104 = local81 >>> 16;
			local81 &= 0xFFFF;
			local87 = Static39.aClass85_1.method2368(local104);
			if (local87 != null) {
				local77 = local87.method4236(local81) | false;
				local70 = local87.method4234(local81) | false;
				local79 = arg4.aBoolean263 | false;
			}
			if ((arg4.aBoolean264 || Static318.forceTween) && arg5 != -1 && arg4.anIntArray262.length > arg5) {
				local85 = arg4.anIntArray261[arg0];
				local83 = arg4.anIntArray262[arg5];
				@Pc(166) int local166 = local83 >>> 16;
				local83 &= 0xFFFF;
				if (local166 == local104) {
					local89 = local87;
				} else {
					local89 = Static39.aClass85_1.method2368(local83 >>> 16);
				}
				if (local89 != null) {
					local77 |= local89.method4236(local83);
					local70 |= local89.method4234(local83);
				}
			}
			if (local77) {
				local9 = 1184;
			}
			if (local70) {
				local9 |= 0x100;
			}
			if (local79) {
				local9 |= 0x200;
			}
		}
		@Pc(230) long local230 = this.method6362(arg6 == null ? null : arg6.anIntArray194, local23, arg3, arg2);
		if (Static48.A_SOFT_LRU_HASH_TABLE___3 != null) {
			local7 = (Model) Static48.A_SOFT_LRU_HASH_TABLE___3.get(local230);
		}
		if (local7 == null || arg7.method2863(local7.method3826(), local9) != 0) {
			if (local7 != null) {
				local9 = arg7.method2806(local9, local7.method3826());
			}
			@Pc(259) int local259 = local9;
			@Pc(261) boolean local261 = false;
			for (@Pc(263) int local263 = 0; local263 < local23.length; local263++) {
				if (local23[local263] != -1 && !Static313.aClass107_2.get(local23[local263]).method4769(arg3)) {
					local261 = true;
				}
			}
			if (local261) {
				return null;
			}
			@Pc(300) Class185[] local300 = new Class185[local23.length];
			for (@Pc(302) int local302 = 0; local302 < local23.length; local302++) {
				if (local23[local302] != -1) {
					local300[local302] = Static313.aClass107_2.get(local23[local302]).method4778(arg3);
				}
			}
			@Pc(354) int local354;
			if (local11 != null && local11.equipmentTransforms != null) {
				for (@Pc(334) int local334 = 0; local334 < local11.equipmentTransforms.length; local334++) {
					if (local11.equipmentTransforms[local334] != null && local300[local334] != null) {
						local354 = local11.equipmentTransforms[local334][0];
						@Pc(361) int local361 = local11.equipmentTransforms[local334][1];
						@Pc(368) int local368 = local11.equipmentTransforms[local334][2];
						@Pc(375) int local375 = local11.equipmentTransforms[local334][3];
						@Pc(382) int local382 = local11.equipmentTransforms[local334][4];
						@Pc(389) int local389 = local11.equipmentTransforms[local334][5];
						if (local375 != 0 || local382 != 0 || local389 != 0) {
							local300[local334].method4663(local382, local389, local375);
						}
						if (local354 != 0 || local361 != 0 || local368 != 0) {
							local300[local334].translate(local354, local368, local361);
						}
					}
				}
			}
			@Pc(442) Class185 local442 = new Class185(local300, local300.length);
			if (arg6 != null) {
				local259 = local9 | 0x2000;
			}
			local7 = arg7.method2864(local442, local259, Static25.anInt648, 64, 850);
			if (arg6 != null) {
				for (local354 = 0; local354 < 5; local354++) {
					if (arg6.anIntArray194[local354] < Static353.aShortArrayArray7[local354].length) {
						local7.method3837(Static10.sourceBodyColors[local354], Static353.aShortArrayArray7[local354][arg6.anIntArray194[local354]]);
					}
					if (arg6.anIntArray194[local354] < Static186.aShortArrayArray6[local354].length) {
						local7.method3837(Static43.aShortArray20[local354], Static186.aShortArrayArray6[local354][arg6.anIntArray194[local354]]);
					}
				}
			}
			if (Static48.A_SOFT_LRU_HASH_TABLE___3 != null) {
				local7.method3813(local9);
				Static48.A_SOFT_LRU_HASH_TABLE___3.put(local230, local7);
			}
		}
		if (arg4 == null || local87 == null) {
			return local7;
		} else {
			@Pc(536) Model local536 = local7.method3799((byte) 1, local9, true);
			local536.method3827(local85, local89, local83, arg4.aBoolean263, arg1 - 1, local81, local87, 0);
			return local536;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([II[IZI)J")
	private long method6362(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) long[] local7 = Buffer.CRC64_TABLE;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3 >> 8)) & 0xFFL)];
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg3 ^ local25) & 0xFFL)];
		for (@Pc(41) int local41 = 0; local41 < arg1.length; local41++) {
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg1[local41] >> 24) ^ local9) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg1[local41] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg1[local41] >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) arg1[local41] ^ local9) & 0xFFL)];
		}
		if (arg0 != null) {
			for (@Pc(126) int local126 = 0; local126 < 5; local126++) {
				local9 = local7[(int) ((local9 ^ (long) arg0[local126]) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local7[(int) ((local9 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)] ^ local9 >>> 8;
	}
}
