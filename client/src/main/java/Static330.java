import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

    @OriginalMember(owner = "client!td", name = "U", descriptor = "[Lclient!tf;")
	public static Class6[] aClass6Array3;

	@OriginalMember(owner = "client!td", name = "V", descriptor = "[[[Lclient!f;")
	public static Class67[][][] aClass67ArrayArrayArray3;

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString62;

	@OriginalMember(owner = "client!td", name = "X", descriptor = "Z")
	public static boolean aBoolean419 = false;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIZ)B")
	public static byte method5652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(IB)Z")
	public static boolean method5653(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(IB)Lclient!uo;")
	public static ParticleEmitterType method5654(@OriginalArg(0) int id) {
		@Pc(10) ParticleEmitterType local10 = (ParticleEmitterType) Static233.types.get(id);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] bytes = Static289.archive.fetchFile(0, id);
		local10 = new ParticleEmitterType();
		if (bytes != null) {
			local10.decode(new Buffer(bytes));
		}
		local10.postDecode();
		Static233.types.put(id, local10);
		return local10;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!s;I)V")
	public static void method5655(@OriginalArg(0) Class210 arg0) {
		@Pc(12) int local12;
		@Pc(23) int local23;
		@Pc(32) int local32;
		@Pc(40) int local40;
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(181) Class11_Sub5_Sub3 local181;
		@Pc(49) int local49;
		@Pc(53) int local53;
		if (Static19.aClass210_1 == arg0) {
			local12 = Static212.inboundBuffer.g1();
			local23 = Static67.anInt1637 * 2 + (local12 >> 4 & 0xF);
			local32 = Static7.anInt7240 * 2 + (local12 & 0xF);
			local40 = local23 + Static212.inboundBuffer.g1b();
			local49 = local32 + Static212.inboundBuffer.g1b();
			local53 = Static212.inboundBuffer.g2b_dup();
			local57 = Static212.inboundBuffer.g2();
			local63 = Static212.inboundBuffer.g1() * 4;
			local69 = Static212.inboundBuffer.g1() * 4;
			local73 = Static212.inboundBuffer.g2();
			local77 = Static212.inboundBuffer.g2();
			local81 = Static212.inboundBuffer.g1();
			local85 = Static212.inboundBuffer.g1();
			if (local81 == 255) {
				local81 = -1;
			}
			if (local23 >= 0 && local32 >= 0 && Static373.anInt7033 * 2 > local23 && Static373.anInt7033 * 2 > local32 && local40 >= 0 && local49 >= 0 && Static242.anInt4449 * 2 > local40 && local49 < Static242.anInt4449 * 2 && local57 != 65535) {
				local40 *= 64;
				local49 = local49 * 64;
				local23 = local23 * 64;
				local32 *= 64;
				local181 = new Class11_Sub5_Sub3(local57, Static243.anInt4502, local23, local32, Static386.method6031(local23, local32, Static243.anInt4502) - local63, local73 - -Static114.loop, Static114.loop + local77, local81, local85, local53, local69);
				local181.method4396(Static386.method6031(local40, local49, Static243.anInt4502) - local69, local40, Static114.loop + local73, local49);
				Static332.A_LINKED_LIST___38.method3539(new Class2_Sub2_Sub9(local181));
			}
		} else if (arg0 == Static285.aClass210_12) {
			local12 = Static212.inboundBuffer.g1();
			local23 = (local12 >> 4 & 0x7) + Static67.anInt1637;
			local32 = (local12 & 0x7) + Static7.anInt7240;
			local40 = Static212.inboundBuffer.g2();
			local49 = Static212.inboundBuffer.g2();
			local53 = Static212.inboundBuffer.g2();
			if (Static120.aClass4_49 != null && local23 >= 0 && local32 >= 0 && local23 < Static373.anInt7033 && Static242.anInt4449 > local32) {
				@Pc(269) Class2_Sub32 local269 = (Class2_Sub32) Static120.aClass4_49.get((long) (local23 | Static243.anInt4502 << 28 | local32 << 14));
				if (local269 != null) {
					for (@Pc(277) Class2_Sub8 local277 = (Class2_Sub8) local269.aLinkedList_34.method3550(); local277 != null; local277 = (Class2_Sub8) local269.aLinkedList_34.method3551()) {
						if (local277.anInt1717 == (local40 & 0x7FFF) && local49 == local277.anInt1719) {
							local277.unlink();
							local277.anInt1719 = local53;
							Static137.method2550(local32, local23, local277, Static243.anInt4502);
							break;
						}
					}
					Static165.method3153(local23, Static243.anInt4502, local32);
				}
			}
		} else {
			@Pc(403) int local403;
			if (Static374.aClass210_16 == arg0) {
				local12 = Static212.inboundBuffer.g1();
				local23 = Static67.anInt1637 * 2 + (local12 >> 4 & 0xF);
				local32 = (local12 & 0xF) + Static7.anInt7240 * 2;
				local40 = Static212.inboundBuffer.g1b() + local23;
				local49 = local32 + Static212.inboundBuffer.g1b();
				local53 = Static212.inboundBuffer.g2b_dup();
				local57 = Static212.inboundBuffer.g2b_dup();
				local63 = Static212.inboundBuffer.g2();
				local69 = Static212.inboundBuffer.g1b();
				local73 = Static212.inboundBuffer.g1() * 4;
				local77 = Static212.inboundBuffer.g2();
				local81 = Static212.inboundBuffer.g2();
				local85 = Static212.inboundBuffer.g1();
				if (local85 == 255) {
					local85 = -1;
				}
				local403 = Static212.inboundBuffer.g1();
				if (local23 >= 0 && local32 >= 0 && local23 < Static373.anInt7033 * 2 && Static373.anInt7033 * 2 > local32 && local40 >= 0 && local49 >= 0 && local40 < Static242.anInt4449 * 2 && local49 < Static242.anInt4449 * 2 && local63 != 65535) {
					local32 = local32 * 64;
					local40 *= 64;
					local23 = local23 * 64;
					local49 *= 64;
					if (local53 != 0) {
						@Pc(483) int local483;
						@Pc(491) Class11_Sub5_Sub2 local491;
						@Pc(477) int local477;
						@Pc(487) int local487;
						if (local53 >= 0) {
							local477 = local53 - 1;
							local483 = local477 >> 11 & 0xF;
							local487 = local477 & 0x7FF;
							local491 = Static365.npcs[local487];
						} else {
							local477 = -local53 - 1;
							local483 = local477 >> 11 & 0xF;
							local487 = local477 & 0x7FF;
							if (Static234.anInt4226 == local487) {
								local491 = Static17.self;
							} else {
								local491 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local487];
							}
						}
						if (local491 != null) {
							@Pc(525) BasType local525 = local491.method4331();
							if (local525.equipmentTransforms != null && local525.equipmentTransforms[local483] != null) {
								local487 = local525.equipmentTransforms[local483][0];
								@Pc(547) int local547 = local525.equipmentTransforms[local483][2];
								@Pc(552) int local552 = local491.aClass248_7.method6440();
								@Pc(556) int local556 = Class19.anIntArray178[local552];
								@Pc(560) int local560 = Class19.COSINE[local552];
								@Pc(571) int local571 = local556 * local547 + local487 * local560 >> 15;
								@Pc(582) int local582 = local547 * local560 - local556 * local487 >> 15;
								local69 -= local525.equipmentTransforms[local483][1];
								local23 += local571;
								local32 += local582;
							}
						}
					}
					@Pc(628) Class11_Sub5_Sub3 local628 = new Class11_Sub5_Sub3(local63, Static243.anInt4502, local23, local32, Static386.method6031(local23, local32, Static243.anInt4502) - local69, Static114.loop + local77, local81 + Static114.loop, local85, local403, local57, local73);
					local628.method4396(Static386.method6031(local40, local49, Static243.anInt4502) - local73, local40, Static114.loop + local77, local49);
					Static332.A_LINKED_LIST___38.method3539(new Class2_Sub2_Sub9(local628));
				}
			} else if (Static27.aClass210_2 == arg0) {
				local12 = Static212.inboundBuffer.g1bneg();
				local23 = (local12 >> 4 & 0x7) + Static67.anInt1637;
				local32 = Static7.anInt7240 + (local12 & 0x7);
				local40 = Static212.inboundBuffer.ig2add();
				if (local23 >= 0 && local32 >= 0 && local23 < Static373.anInt7033 && local32 < Static242.anInt4449) {
					@Pc(713) Class2_Sub32 local713 = (Class2_Sub32) Static120.aClass4_49.get((long) (local23 | Static243.anInt4502 << 28 | local32 << 14));
					if (local713 != null) {
						for (@Pc(721) Class2_Sub8 local721 = (Class2_Sub8) local713.aLinkedList_34.method3550(); local721 != null; local721 = (Class2_Sub8) local713.aLinkedList_34.method3551()) {
							if ((local40 & 0x7FFF) == local721.anInt1717) {
								local721.unlink();
								break;
							}
						}
						if (local713.aLinkedList_34.method3549()) {
							local713.unlink();
						}
						Static165.method3153(local23, Static243.anInt4502, local32);
					}
				}
			} else if (Static140.aClass210_6 == arg0) {
				local12 = Static212.inboundBuffer.ig2();
				local23 = Static212.inboundBuffer.ig2add();
				local32 = Static212.inboundBuffer.g1sub();
				local40 = (local32 >> 4 & 0x7) + Static67.anInt1637;
				local49 = Static7.anInt7240 + (local32 & 0x7);
				local53 = Static212.inboundBuffer.ig2add();
				if (local40 >= 0 && local49 >= 0 && Static373.anInt7033 > local40 && local49 < Static242.anInt4449 && local23 != Static234.anInt4226) {
					Static137.method2550(local49, local40, new Class2_Sub8(local53, local12), Static243.anInt4502);
					Static165.method3153(local40, Static243.anInt4502, local49);
				}
			} else if (arg0 == Static143.aClass210_7) {
				local12 = Static212.inboundBuffer.g1bneg();
				local23 = local12 >> 2;
				local32 = local12 & 0x3;
				local40 = Static150.anIntArray174[local23];
				local49 = Static212.inboundBuffer.g2add();
				local53 = Static212.inboundBuffer.g1();
				local57 = Static67.anInt1637 + (local53 >> 4 & 0x7);
				local63 = Static7.anInt7240 + (local53 & 0x7);
				if (local57 >= 0 && local63 >= 0 && local57 < Static373.anInt7033 && Static242.anInt4449 > local63) {
					Static28.method900(local49, local40, local23, local57, local32, local63, Static243.anInt4502);
				}
			} else if (arg0 == Static359.aClass210_14) {
				@Pc(916) byte local916 = Static212.inboundBuffer.g1neg();
				local23 = Static212.inboundBuffer.g1();
				local32 = (local23 >> 4 & 0x7) + Static67.anInt1637;
				local40 = (local23 & 0x7) + Static7.anInt7240;
				local49 = Static212.inboundBuffer.g2b();
				@Pc(942) byte local942 = Static212.inboundBuffer.g1bsub();
				local57 = Static212.inboundBuffer.ig2add();
				local63 = Static212.inboundBuffer.ig2add();
				@Pc(954) byte local954 = Static212.inboundBuffer.g1neg();
				@Pc(958) byte local958 = Static212.inboundBuffer.g1neg();
				local77 = Static212.inboundBuffer.g1add();
				local81 = local77 >> 2;
				local85 = local77 & 0x3;
				local403 = Static212.inboundBuffer.g2();
				if (!Static190.aClass19_8.method2871()) {
					Static243.method4238(local32, local403, local954, local57, local958, local942, local916, local63, local49, local81, local85, local40, Static243.anInt4502);
				}
			} else if (arg0 == Static72.aClass210_3) {
				local12 = Static212.inboundBuffer.g2();
				local23 = Static212.inboundBuffer.g1();
				Static359.aClass202_4.method5162(local12).method1521(local23);
			} else if (Static110.aClass210_5 == arg0) {
				Static212.inboundBuffer.g1();
				local12 = Static212.inboundBuffer.g1();
				local23 = (local12 >> 4 & 0x7) + Static67.anInt1637;
				local32 = Static7.anInt7240 + (local12 & 0x7);
				local40 = Static212.inboundBuffer.g2();
				local49 = Static212.inboundBuffer.g1();
				local53 = Static212.inboundBuffer.ig3();
				@Pc(1055) String local1055 = Static212.inboundBuffer.gjstr();
				Static111.method2277(local40, local49, local53, local1055, Static243.anInt4502, local23, local32);
			} else if (arg0 == Static200.aClass210_9) {
				local12 = Static212.inboundBuffer.g2add();
				if (local12 == 65535) {
					local12 = -1;
				}
				local23 = Static212.inboundBuffer.g1sub();
				local32 = Static67.anInt1637 + (local23 >> 4 & 0x7);
				local40 = (local23 & 0x7) + Static7.anInt7240;
				local49 = Static212.inboundBuffer.g1sub();
				local53 = local49 >> 2;
				local57 = local49 & 0x3;
				local63 = Static150.anIntArray174[local53];
				Static391.method6451(local53, local12, local40, local63, local57, local32, Static243.anInt4502);
			} else if (arg0 == Static164.aClass210_8) {
				local12 = Static212.inboundBuffer.g1();
				local23 = Static67.anInt1637 + (local12 >> 4 & 0x7);
				local32 = Static7.anInt7240 + (local12 & 0x7);
				local40 = Static212.inboundBuffer.g2();
				local49 = Static212.inboundBuffer.g1();
				local53 = Static212.inboundBuffer.g2();
				if (local23 >= 0 && local32 >= 0 && Static373.anInt7033 > local23 && Static242.anInt4449 > local32) {
					local57 = local23 * 128 + 64;
					local63 = local32 * 128 + 64;
					@Pc(1208) Class11_Sub5_Sub4 local1208 = new Class11_Sub5_Sub4(local40, local53, Static114.loop, Static243.anInt4502, local57, Static386.method6031(local57, local63, Static243.anInt4502) - local49, local63, local23, local23, local32, local32);
					Static129.A_LINKED_LIST___20.method3539(new Class2_Sub2_Sub1(local1208));
				}
			} else if (Static333.aClass210_17 == arg0) {
				local12 = Static212.inboundBuffer.g1();
				local23 = (local12 >> 4 & 0x7) + Static67.anInt1637;
				local32 = (local12 & 0x7) + Static7.anInt7240;
				local40 = Static212.inboundBuffer.g2();
				if (local40 == 65535) {
					local40 = -1;
				}
				local49 = Static212.inboundBuffer.g1();
				local53 = local49 >> 4 & 0xF;
				local57 = local49 & 0x7;
				local63 = Static212.inboundBuffer.g1();
				local69 = Static212.inboundBuffer.g1();
				if (local23 >= 0 && local32 >= 0 && local23 < Static373.anInt7033 && Static242.anInt4449 > local32) {
					local73 = local53 + 1;
					if (local23 - local73 <= Static17.self.anIntArray316[0] && Static17.self.anIntArray316[0] <= local23 + local73 && Static17.self.anIntArray317[0] >= local32 - local73 && local32 + local73 >= Static17.self.anIntArray317[0] && Static218.aClass177_Sub1_2.anInt4882 != 0 && local57 > 0 && Static243.size < 50 && local40 != -1) {
						Static256.ids[Static243.size] = local40;
						Static329.loops[Static243.size] = local57;
						Static237.delays[Static243.size] = local63;
						Static196.sounds[Static243.size] = null;
						Static162.positions[Static243.size] = local53 + (local32 << 8) + (local23 << 16) + (Static243.anInt4502 << 24);
						Static223.anIntArray256[Static243.size] = local69;
						Static243.size++;
					}
				}
			} else if (arg0 == Static242.aClass210_10) {
				local12 = Static212.inboundBuffer.g1add();
				local23 = Static67.anInt1637 + (local12 >> 4 & 0x7);
				local32 = (local12 & 0x7) + Static7.anInt7240;
				local40 = Static212.inboundBuffer.g1bneg();
				local49 = local40 >> 2;
				local53 = local40 & 0x3;
				local57 = Static150.anIntArray174[local49];
				if (local23 >= 0 && local32 >= 0 && local23 < Static373.anInt7033 && Static242.anInt4449 > local32) {
					Static28.method900(-1, local57, local49, local23, local53, local32, Static243.anInt4502);
				}
			} else if (arg0 == Static272.aClass210_11) {
				local12 = Static212.inboundBuffer.g1();
				local23 = Static67.anInt1637 + (local12 >> 4 & 0x7);
				local32 = (local12 & 0x7) + Static7.anInt7240;
				local40 = local23 + Static212.inboundBuffer.g1b();
				local49 = local32 + Static212.inboundBuffer.g1b();
				local53 = Static212.inboundBuffer.g2b_dup();
				local57 = Static212.inboundBuffer.g2();
				local63 = Static212.inboundBuffer.g1() * 4;
				local69 = Static212.inboundBuffer.g1() * 4;
				local73 = Static212.inboundBuffer.g2();
				local77 = Static212.inboundBuffer.g2();
				local81 = Static212.inboundBuffer.g1();
				local85 = Static212.inboundBuffer.g1();
				if (local81 == 255) {
					local81 = -1;
				}
				if (local23 >= 0 && local32 >= 0 && Static373.anInt7033 > local23 && local32 < Static242.anInt4449 && local40 >= 0 && local49 >= 0 && local40 < Static373.anInt7033 && local49 < Static242.anInt4449 && local57 != 65535) {
					local32 = local32 * 128 + 64;
					local23 = local23 * 128 + 64;
					local49 = local49 * 128 + 64;
					local40 = local40 * 128 + 64;
					local181 = new Class11_Sub5_Sub3(local57, Static243.anInt4502, local23, local32, Static386.method6031(local23, local32, Static243.anInt4502) - local63, local73 + Static114.loop, local77 + Static114.loop, local81, local85, local53, local69);
					local181.method4396(Static386.method6031(local40, local49, Static243.anInt4502) - local69, local40, Static114.loop + local73, local49);
					Static332.A_LINKED_LIST___38.method3539(new Class2_Sub2_Sub9(local181));
				}
			} else if (Static109.aClass210_4 == arg0) {
				local12 = Static212.inboundBuffer.g2();
				local23 = Static212.inboundBuffer.g2add();
				local32 = Static212.inboundBuffer.g1();
				local40 = (local32 >> 4 & 0x7) + Static67.anInt1637;
				local49 = Static7.anInt7240 + (local32 & 0x7);
				if (local40 >= 0 && local49 >= 0 && local40 < Static373.anInt7033 && Static242.anInt4449 > local49) {
					Static137.method2550(local49, local40, new Class2_Sub8(local12, local23), Static243.anInt4502);
					Static165.method3153(local40, Static243.anInt4502, local49);
				}
			} else {
				Static262.report(null, "T3 - " + arg0);
				Static99.method2144();
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5656(@OriginalArg(1) String arg0) {
		@Pc(16) String local16 = Static170.method3228(Static80.method5984(arg0));
		if (local16 == null) {
			local16 = "";
		}
		return local16;
	}
}
