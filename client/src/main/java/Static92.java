import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	public static int anInt1914;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!hu;")
	public static final SoftLruHashTable bodyModels = new SoftLruHashTable(260);

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	public static int anInt1913 = 0;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "Lclient!hg;")
	public static final Class92 aClass92_1 = new Class92();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([I[ILclient!oe;I[I)V")
	public static void method1966(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Npc arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) int local9 = arg0[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg3[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg2.aClass20Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg2.aClass20Array3[local19] = null;
					} else {
						@Pc(41) SeqType local41 = Static39.aClass85_1.method2371(local9);
						@Pc(44) int local44 = local41.exactmove;
						@Pc(49) Class20 local49 = arg2.aClass20Array3[local19];
						if (local49 != null) {
							if (local9 == local49.anInt624) {
								if (local44 == 0) {
									local49 = arg2.aClass20Array3[local19] = null;
								} else if (local44 == 1) {
									local49.anInt626 = 0;
									local49.anInt625 = 0;
									local49.anInt629 = local17;
									local49.anInt628 = 0;
									local49.anInt627 = 1;
									Static1.method4(local41, false, arg2.aByte78, arg2.xFine, arg2.zFine, 0);
								} else if (local44 == 2) {
									local49.anInt626 = 0;
								}
							} else if (local41.priority >= Static39.aClass85_1.method2371(local49.anInt624).priority) {
								local49 = arg2.aClass20Array3[local19] = null;
							}
						}
						if (local49 == null) {
							local49 = arg2.aClass20Array3[local19] = new Class20();
							local49.anInt625 = 0;
							local49.anInt627 = 1;
							local49.anInt628 = 0;
							local49.anInt624 = local9;
							local49.anInt626 = 0;
							local49.anInt629 = local17;
							Static1.method4(local41, false, arg2.aByte78, arg2.xFine, arg2.zFine, 0);
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!nk;Lclient!wm;IIB)V")
	public static void render(@OriginalArg(0) Component arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class78 local14 = arg0.method4108(arg1);
		if (local14 == null) {
			return;
		}
		arg1.method2895(arg3, arg2, arg3 + arg0.width, arg0.height + arg2);
		if (Static146.anInt2703 == 2 || Static146.anInt2703 == 5 || Static292.aClass13_15 == null) {
			arg1.method2811(local14, arg3, arg2);
			return;
		}
		@Pc(61) int local61;
		@Pc(58) int local58;
		@Pc(69) int local69;
		@Pc(55) int local55;
		if (Static314.anInt5911 == 4) {
			local58 = Static348.anInt6448;
			local55 = 4096;
			local69 = (int) -Static277.aFloat67 & 0x3FFF;
			local61 = Static394.anInt7264;
		} else {
			local55 = 4096 - Static97.anInt2005 * 16;
			local58 = Static17.self.zFine;
			local61 = Static17.self.xFine;
			local69 = Static6.anInt158 + (int) -Static277.aFloat67 & 0x3FFF;
		}
		@Pc(96) int local96 = local61 / 32 + 48 - (Static373.anInt7033 + -104) * 2;
		@Pc(115) int local115 = Static242.anInt4449 * 4 + 48 - (Static242.anInt4449 - 104) * 2 - local58 / 32;
		Static292.aClass13_15.method6395((float) arg0.width / 2.0F + (float) arg3, (float) arg0.height / 2.0F + (float) arg2, (float) local96, (float) local115, local55, local69 << 2, local14, arg3, arg2);
		@Pc(165) int local165;
		@Pc(174) int local174;
		@Pc(185) int local185;
		@Pc(196) int local196;
		for (@Pc(149) IntNode local149 = (IntNode) Static56.A_LINKED_LIST___13.head(); local149 != null; local149 = (IntNode) Static56.A_LINKED_LIST___13.next()) {
			@Pc(154) int local154 = local149.value;
			local165 = (Static34.aMapElementList_3.positions[local154] >> 14 & 0x3FFF) - Static164.originX;
			local174 = (Static34.aMapElementList_3.positions[local154] & 0x3FFF) - Static148.originZ;
			local185 = local165 * 4 + 2 - local61 / 32;
			local196 = local174 * 4 + 2 - local58 / 32;
			Static216.method3775(arg3, arg0, Static34.aMapElementList_3.elements[local154], arg1, local196, local14, local185, arg2);
		}
		for (local165 = 0; local165 < Static387.anInt2831; local165++) {
			local174 = Static388.anIntArray494[local165] * 4 + 2 - local61 / 32;
			local185 = Static183.anIntArray2[local165] * 4 + 2 - local58 / 32;
			@Pc(253) Class41 local253 = Static359.aClass202_4.method5162(Static231.anIntArray265[local165]);
			if (local253.anIntArray94 != null) {
				local253 = local253.method1533(Static214.aClass226_1);
				if (local253 == null || local253.anInt1306 == -1) {
					continue;
				}
			}
			Static216.method3775(arg3, arg0, local253.anInt1306, arg1, local185, local14, local174, arg2);
		}
		for (@Pc(293) Class2_Sub32 local293 = (Class2_Sub32) Static120.aClass4_49.head(); local293 != null; local293 = (Class2_Sub32) Static120.aClass4_49.next()) {
			local185 = (int) (local293.key >> 28 & 0x3L);
			if (local185 == Static343.anInt6389) {
				local196 = (int) (local293.key & 0x3FFFL) * 4 + 2 - local61 / 32;
				@Pc(337) int local337 = (int) (local293.key >> 14 & 0x3FFFL) * 4 + 2 - local58 / 32;
				Static376.renderDot(local14, local196, arg3, local337, Static76.mapDots[0], arg2, arg0);
			}
		}
		@Pc(410) int local410;
		for (local185 = 0; local185 < Static166.size; local185++) {
			@Pc(365) Npc local365 = Static365.npcs[Static211.ids[local185]];
			if (local365 != null && local365.method4335() && local365.aByte78 == Static17.self.aByte78) {
				@Pc(383) NpcType type = local365.type;
				if (type != null && type.multiNpcs != null) {
					type = type.getMultiNpc(Static214.aClass226_1);
				}
				if (type != null && type.minimapdisplay && type.interactive) {
					local410 = local365.xFine / 32 - local61 / 32;
					@Pc(419) int local419 = local365.zFine / 32 - local58 / 32;
					if (type.mapelement == -1) {
						Static376.renderDot(local14, local410, arg3, local419, Static76.mapDots[1], arg2, arg0);
					} else {
						Static216.method3775(arg3, arg0, type.mapelement, arg1, local419, local14, local410, arg2);
					}
				}
			}
		}
		local196 = Static31.anInt751;
		@Pc(455) int[] local455 = Static85.anIntArray121;
		@Pc(489) int local489;
		@Pc(498) int local498;
		@Pc(502) int local502;
		for (local410 = 0; local410 < local196; local410++) {
			@Pc(465) Class11_Sub5_Sub2_Sub1 local465 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local455[local410]];
			if (local465 != null && local465.method4064() && Static17.self != local465 && local465.aByte78 == Static17.self.aByte78) {
				local489 = local465.xFine / 32 - local61 / 32;
				local498 = local465.zFine / 32 - local58 / 32;
				@Pc(500) boolean local500 = false;
				for (local502 = 0; local502 < Static384.anInt7178; local502++) {
					if (local465.aString41.equals(Static17.aStringArray43[local502]) && Static265.anIntArray333[local502] != 0) {
						local500 = true;
						break;
					}
				}
				@Pc(528) boolean local528 = false;
				for (@Pc(530) int local530 = 0; local530 < Static186.anInt3730; local530++) {
					if (local465.aString41.equals(Static47.aClass214Array1[local530].aString60)) {
						local528 = true;
						break;
					}
				}
				@Pc(550) boolean local550 = false;
				if (Static17.self.anInt4193 != 0 && local465.anInt4193 != 0 && local465.anInt4193 == Static17.self.anInt4193) {
					local550 = true;
				}
				if (local500) {
					Static376.renderDot(local14, local489, arg3, local498, Static76.mapDots[3], arg2, arg0);
				} else if (local528) {
					Static376.renderDot(local14, local489, arg3, local498, Static76.mapDots[5], arg2, arg0);
				} else if (local550) {
					Static376.renderDot(local14, local489, arg3, local498, Static76.mapDots[4], arg2, arg0);
				} else {
					Static376.renderDot(local14, local489, arg3, local498, Static76.mapDots[2], arg2, arg0);
				}
			}
		}
		@Pc(636) Class84[] local636 = Static50.aClass84Array1;
		@Pc(728) int local728;
		for (local489 = 0; local489 < local636.length; local489++) {
			@Pc(644) Class84 local644 = local636[local489];
			if (local644 != null && local644.anInt2355 != 0 && Static114.loop % 20 < 10) {
				@Pc(699) int local699;
				if (local644.anInt2355 == 1 && local644.anInt2354 >= 0 && local644.anInt2354 < Static365.npcs.length) {
					@Pc(677) Npc local677 = Static365.npcs[local644.anInt2354];
					if (local677 != null) {
						local502 = local677.xFine / 32 - local61 / 32;
						local699 = local677.zFine / 32 - local58 / 32;
						Static262.method6248(local644.anInt2363, 360000, local502, local699, arg2, arg0, local14, arg3);
					}
				}
				if (local644.anInt2355 == 2) {
					local728 = (local644.anInt2352 - Static164.originX) * 4 + 2 - local61 / 32;
					local502 = (local644.anInt2364 - Static148.originZ) * 4 + 2 - local58 / 32;
					local699 = local644.anInt2349 * 4;
					local699 *= local699;
					Static262.method6248(local644.anInt2363, local699, local728, local502, arg2, arg0, local14, arg3);
				}
				if (local644.anInt2355 == 10 && local644.anInt2354 >= 0 && Static12.aClass11_Sub5_Sub2_Sub1Array1.length > local644.anInt2354) {
					@Pc(786) Class11_Sub5_Sub2_Sub1 local786 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local644.anInt2354];
					if (local786 != null) {
						local502 = local786.xFine / 32 - local61 / 32;
						local699 = local786.zFine / 32 - local58 / 32;
						Static262.method6248(local644.anInt2363, 360000, local502, local699, arg2, arg0, local14, arg3);
					}
				}
			}
		}
		if (Static314.anInt5911 == 4) {
			return;
		}
		if (Static358.anInt6550 != 0) {
			local498 = Static358.anInt6550 * 4 + Static17.self.method4327() * 2 + 2 - local61 / 32 - 2;
			local728 = Static312.anInt5844 * 4 + Static17.self.method4327() * 2 + 2 - local58 / 32 - 2;
			Static376.renderDot(local14, local498, arg3, local728, Static352.aClass13Array25[Static370.aBoolean474 ? 1 : 0], arg2, arg0);
		}
		arg1.method2868(3, arg3 + arg0.width / 2 - 1, arg2 + arg0.height / 2 - 1, -1, 3);
	}
}
