import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "d", descriptor = "J")
	public static long aLong1 = 0L;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method2() {
		@Pc(8) int local8 = Static210.npcBytes.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static210.npcBytes[local10] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static48.anInt1254; local25++) {
					if (Static266.anIntArray334[local25] == Static291.mapSquares[local10]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static266.anIntArray334[Static48.anInt1254] = Static291.mapSquares[local10];
					local23 = Static48.anInt1254++;
				}
				@Pc(65) Buffer local65 = new Buffer(Static210.npcBytes[local10]);
				@Pc(67) int local67 = 0;
				while (Static210.npcBytes[local10].length > local65.offset && local67 < 511 && Static166.size < 1023) {
					@Pc(88) int id = local23 | local67++ << 6;
					@Pc(92) int local92 = local65.g2();
					@Pc(96) int local96 = local92 >> 14;
					@Pc(102) int local102 = local92 >> 7 & 0x3F;
					@Pc(106) int local106 = local92 & 0x3F;
					@Pc(119) int local119 = local102 + (Static291.mapSquares[local10] >> 8) * 64 - Static164.originX;
					@Pc(132) int local132 = local106 + (Static291.mapSquares[local10] & 0xFF) * 64 - Static148.originZ;
					@Pc(139) NpcType type = Static6.aClass219_1.get(local65.g2());
					if (Static365.npcs[id] == null && (type.defaultmode & 0x1) > 0 && Static44.visibleLevel == local96 && local119 >= 0 && local119 + type.size < Static373.anInt7033 && local132 >= 0 && local132 + type.size < Static242.anInt4449) {
						Static365.npcs[id] = new Npc();
						Static365.npcs[id].anInt4619 = id;
						@Pc(187) Npc npc = Static365.npcs[id];
						Static211.ids[Static166.size++] = id;
						npc.lastSeenLoop = Static114.loop;
						npc.setType(type);
						npc.setSize(npc.type.size);
						npc.anInt4604 = npc.type.rotationspeed << 3;
						if (npc.anInt4604 == 0) {
							npc.method4329(0);
						} else {
							npc.method4329(npc.type.spawndirection + 4 << 11 & 0x3863);
						}
						npc.method4338(npc.method4327(), local96, local119, true, local132);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZIZBLjava/lang/String;IILjava/lang/String;IJ)V")
	public static void add(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) long arg9) {
		if (!Static375.aBoolean477 && Static268.size < 500) {
			@Pc(16) int local16 = arg8 == -1 ? Static107.anInt2219 : arg8;
			@Pc(30) Class2_Sub5 local30 = new Class2_Sub5(arg4, arg7, local16, arg6, arg0, arg9, arg5, arg2, arg1, arg3);
			Static129.A_LINKED_LIST___19.addTail(local30);
			Static268.size++;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!nb;ZIIIII)V")
	public static void method4(@OriginalArg(0) Class157 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static243.size >= 50 || (arg0 == null || arg0.soundeffect == null || arg0.soundeffect.length <= arg5 || arg0.soundeffect[arg5] == null)) {
			return;
		}
		@Pc(36) int local36 = arg0.soundeffect[arg5][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(65) int local65;
		if (arg0.soundeffect[arg5].length > 1) {
			local65 = (int) ((double) arg0.soundeffect[arg5].length * Math.random());
			if (local65 > 0) {
				local40 = arg0.soundeffect[arg5][local65];
			}
		}
		@Pc(78) int local78 = local36 & 0x1F;
		if (local78 == 0) {
			if (arg1) {
				Static29.play(0, local40, local46, 255);
			}
		} else if (Static218.preferences.areaSoundsVolume != 0) {
			Static256.ids[Static243.size] = local40;
			Static329.loops[Static243.size] = local46;
			Static237.delays[Static243.size] = 0;
			Static196.sounds[Static243.size] = null;
			Static223.anIntArray256[Static243.size] = 255;
			local65 = (arg3 - 64) / 128;
			@Pc(136) int local136 = (arg4 - 64) / 128;
			Static162.positions[Static243.size] = local78 + (local136 << 8) + (arg2 << 24) + (local65 << 16);
			Static243.size++;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!qg;I)V")
	public static void method5(@OriginalArg(0) Packet arg0) {
		@Pc(7) int local7 = 0;
		arg0.accessBits();
		@Pc(20) int local20;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < Static31.anInt751; local14++) {
			local20 = Static85.anIntArray121[local14];
			if ((Static36.aByteArray7[local20] & 0x1) == 0) {
				if (local7 > 0) {
					Static36.aByteArray7[local20] = (byte) (Static36.aByteArray7[local20] | 0x2);
					local7--;
				} else {
					local48 = arg0.gBit(1);
					if (local48 == 0) {
						local7 = Static100.method2161(arg0);
						Static36.aByteArray7[local20] = (byte) (Static36.aByteArray7[local20] | 0x2);
					} else {
						Static7.method6463(arg0, local20);
					}
				}
			}
		}
		arg0.accessBytes();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.accessBits();
		@Pc(126) int local126;
		for (local20 = 0; local20 < Static31.anInt751; local20++) {
			local48 = Static85.anIntArray121[local20];
			if ((Static36.aByteArray7[local48] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static36.aByteArray7[local48] = (byte) (Static36.aByteArray7[local48] | 0x2);
				} else {
					local126 = arg0.gBit(1);
					if (local126 == 0) {
						local7 = Static100.method2161(arg0);
						Static36.aByteArray7[local48] = (byte) (Static36.aByteArray7[local48] | 0x2);
					} else {
						Static7.method6463(arg0, local48);
					}
				}
			}
		}
		arg0.accessBytes();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.accessBits();
		@Pc(210) int local210;
		for (local48 = 0; local48 < Static192.anInt3547; local48++) {
			local126 = Static239.anIntArray284[local48];
			if ((Static36.aByteArray7[local126] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static36.aByteArray7[local126] = (byte) (Static36.aByteArray7[local126] | 0x2);
				} else {
					local210 = arg0.gBit(1);
					if (local210 == 0) {
						local7 = Static100.method2161(arg0);
						Static36.aByteArray7[local126] = (byte) (Static36.aByteArray7[local126] | 0x2);
					} else if (Static386.method6032(arg0, local126)) {
						Static36.aByteArray7[local126] = (byte) (Static36.aByteArray7[local126] | 0x2);
					}
				}
			}
		}
		arg0.accessBytes();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.accessBits();
		for (local126 = 0; local126 < Static192.anInt3547; local126++) {
			local210 = Static239.anIntArray284[local126];
			if ((Static36.aByteArray7[local210] & 0x1) == 0) {
				if (local7 > 0) {
					Static36.aByteArray7[local210] = (byte) (Static36.aByteArray7[local210] | 0x2);
					local7--;
				} else {
					@Pc(301) int local301 = arg0.gBit(1);
					if (local301 == 0) {
						local7 = Static100.method2161(arg0);
						Static36.aByteArray7[local210] = (byte) (Static36.aByteArray7[local210] | 0x2);
					} else if (Static386.method6032(arg0, local210)) {
						Static36.aByteArray7[local210] = (byte) (Static36.aByteArray7[local210] | 0x2);
					}
				}
			}
		}
		arg0.accessBytes();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static31.anInt751 = 0;
		Static192.anInt3547 = 0;
		for (local210 = 1; local210 < 2048; local210++) {
			Static36.aByteArray7[local210] = (byte) (Static36.aByteArray7[local210] >> 1);
			@Pc(366) Class11_Sub5_Sub2_Sub1 local366 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local210];
			if (local366 == null) {
				Static239.anIntArray284[Static192.anInt3547++] = local210;
			} else {
				Static85.anIntArray121[Static31.anInt751++] = local210;
			}
		}
	}
}
