import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!ld;BLclient!wm;II)V")
	public static void method5207(@OriginalArg(0) LinkedList arg0, @OriginalArg(2) Class19 arg1) {
		Static197.aLinkedList_24.clear();
		if (Static175.aBoolean225) {
			return;
		}
		for (@Pc(20) Class2_Sub20 local20 = (Class2_Sub20) arg0.head(); local20 != null; local20 = (Class2_Sub20) arg0.next()) {
			@Pc(28) Class164 local28 = Static344.aClass125_4.method3378(local20.anInt2947);
			if (Static101.method2164(local28)) {
				@Pc(40) boolean local40 = Static286.method4922(local20, arg1, local28);
				if (local40) {
					Static240.method4183(local20, local28, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(III)I")
	public static int method5208(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return (arg0 & 0xFF80) + local22;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(Z)V")
	public static void method5209() {
		@Pc(11) int local11 = Static31.anInt751;
		@Pc(13) int[] local13 = Static85.anIntArray121;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			@Pc(23) Class11_Sub5_Sub2_Sub1 local23 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local13[local15]];
			if (local23 != null && local23.anInt4636 > 0) {
				local23.anInt4636--;
				if (local23.anInt4636 == 0) {
					local23.aString50 = null;
				}
			}
		}
		for (@Pc(49) int local49 = 0; local49 < Static166.size; local49++) {
			@Pc(55) int local55 = Static211.ids[local49];
			@Pc(59) Npc local59 = Static365.npcs[local55];
			if (local59 != null && local59.anInt4636 > 0) {
				local59.anInt4636--;
				if (local59.anInt4636 == 0) {
					local59.aString50 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZ)V")
	public static void setVolume(@OriginalArg(0) int volume) {
		if (Static235.state == 0) {
			Static91.stream.setVolume(volume);
		} else {
			Static356.volume = volume;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!qg;BILclient!nh;I)V")
	public static void method5211(@OriginalArg(0) Packet arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11_Sub5_Sub2_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(11) byte local11 = -1;
		if ((arg3 & 0x20) != 0) {
			Static335.aByteArray92[arg1] = arg0.g1badd();
		}
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(43) int local43;
		if ((arg3 & 0x8) != 0) {
			local32 = arg0.g2add();
			local36 = arg0.g1bneg();
			local40 = arg0.g1();
			local43 = arg0.offset;
			@Pc(51) boolean local51 = (local32 & 0x8000) != 0;
			if (arg2.aString41 != null && arg2.appearance != null) {
				@Pc(59) boolean local59 = false;
				if (local36 <= 1) {
					if (!local51 && (Static56.aBoolean123 && !Static101.aBoolean159 || Static109.aBoolean166)) {
						local59 = true;
					} else if (Static105.method2208(arg2.aString41)) {
						local59 = true;
					}
				}
				if (!local59 && Static212.inTutorialIsland == 0) {
					Static89.aClass2_Sub4_2.offset = 0;
					arg0.ipadata(Static89.aClass2_Sub4_2.bytes, local40);
					Static89.aClass2_Sub4_2.offset = 0;
					@Pc(107) int local107 = -1;
					@Pc(117) String local117;
					if (local51) {
						local32 &= 0x7FFF;
						@Pc(127) QuickChatPhrase local127 = Static290.method5026(Static89.aClass2_Sub4_2);
						local107 = local127.id;
						local117 = local127.type.decodeMessage(Static89.aClass2_Sub4_2);
					} else {
						local117 = Static153.method2772(Static308.method5275(Static89.aClass2_Sub4_2));
					}
					arg2.aString50 = local117.trim();
					arg2.anInt4600 = local32 & 0xFF;
					arg2.anInt4618 = local32 >> 8;
					arg2.anInt4636 = 150;
					@Pc(167) int local167;
					if (local36 == 1 || local36 == 2) {
						local167 = local51 ? 17 : 1;
					} else {
						local167 = local51 ? 17 : 2;
					}
					if (local36 == 2) {
						Static220.add(0, null, local117, local107, local167, "<img=1>" + arg2.method4069(), "<img=1>" + arg2.method4071());
					} else if (local36 == 1) {
						Static220.add(0, null, local117, local107, local167, "<img=0>" + arg2.method4069(), "<img=0>" + arg2.method4071());
					} else {
						Static220.add(0, null, local117, local107, local167, arg2.method4069(), arg2.method4071());
					}
				}
			}
			arg0.offset = local43 + local40;
		}
		@Pc(283) int local283;
		@Pc(289) int local289;
		if ((arg3 & 0x400) != 0) {
			local32 = arg0.g1sub();
			@Pc(275) int[] local275 = new int[local32];
			@Pc(278) int[] local278 = new int[local32];
			@Pc(281) int[] local281 = new int[local32];
			for (local283 = 0; local283 < local32; local283++) {
				local289 = arg0.ig2();
				if (local289 == 65535) {
					local289 = -1;
				}
				local275[local283] = local289;
				local278[local283] = arg0.g1bneg();
				local281[local283] = arg0.ig2();
			}
			Static154.method2785(local275, local281, local278, arg2);
		}
		if ((arg3 & 0x1) != 0) {
			local32 = arg0.g1sub();
			@Pc(337) byte[] local337 = new byte[local32];
			@Pc(342) Buffer local342 = new Buffer(local337);
			arg0.igdata(local337, local32);
			Static231.aClass2_Sub4Array1[arg1] = local342;
			arg2.method4065(local342);
		}
		if ((arg3 & 0x10) != 0) {
			local32 = arg0.g2add();
			if (local32 == 65535) {
				local32 = -1;
			}
			arg2.anInt4611 = local32;
		}
		if ((arg3 & 0x4) != 0) {
			local32 = arg0.ig2add();
			if (local32 == 65535) {
				local32 = -1;
			}
			local36 = arg0.g1add();
			Static337.animate(arg2, local36, local32);
		}
		if ((arg3 & 0x100) != 0) {
			arg2.anInt4615 = arg0.g1badd();
			arg2.anInt4588 = arg0.g1badd();
			arg2.anInt4577 = arg0.g1bsub();
			arg2.anInt4599 = arg0.g1b();
			arg2.anInt4622 = arg0.g2add() + Static114.loop;
			arg2.anInt4584 = arg0.g2add() + Static114.loop;
			arg2.anInt4614 = arg0.g1bneg();
			arg2.anInt4642 = 0;
			if (arg2.aBoolean276) {
				arg2.anInt4577 += arg2.anInt4169;
				arg2.anInt4615 += arg2.anInt4169;
				arg2.anInt4588 += arg2.anInt4181;
				arg2.movementQueueSize = 0;
				arg2.anInt4599 += arg2.anInt4181;
			} else {
				arg2.anInt4588 += arg2.anIntArray317[0];
				arg2.anInt4599 += arg2.anIntArray317[0];
				arg2.movementQueueSize = 1;
				arg2.anInt4577 += arg2.anIntArray316[0];
				arg2.anInt4615 += arg2.anIntArray316[0];
			}
		}
		if ((arg3 & 0x1000) != 0) {
			local32 = arg0.g2();
			arg2.anInt4578 = arg0.g1add();
			arg2.anInt4591 = arg0.g1sub();
			arg2.anInt4623 = local32 & 0x7FFF;
			arg2.aBoolean319 = (local32 & 0x8000) != 0;
			arg2.anInt4621 = arg2.anInt4623 + Static114.loop + arg2.anInt4578;
		}
		if ((arg3 & 0x80) != 0) {
			arg2.anInt4174 = arg0.g2();
			if (arg2.movementQueueSize == 0) {
				arg2.method4324(arg2.anInt4174);
				arg2.anInt4174 = -1;
			}
		}
		if ((arg3 & 0x200) != 0) {
			arg2.aString50 = arg0.gjstr();
			if (arg2.aString50.charAt(0) == '~') {
				arg2.aString50 = arg2.aString50.substring(1);
				Static33.method4199(arg2.method4071(), 0, arg2.aString50, 2, arg2.method4069());
			} else if (Static17.self == arg2) {
				Static33.method4199(arg2.method4071(), 0, arg2.aString50, 2, arg2.method4069());
			}
			arg2.anInt4600 = 0;
			arg2.anInt4618 = 0;
			arg2.anInt4636 = 150;
		}
		if ((arg3 & 0x2000) != 0) {
			local32 = arg0.ig2add();
			local36 = arg0.mg4();
			if (local32 == 65535) {
				local32 = -1;
			}
			@Pc(690) boolean local690 = true;
			@Pc(780) Class157 local780;
			if (local32 != -1 && arg2.anInt4594 != -1) {
				@Pc(707) Class91 local707;
				if (local32 == arg2.anInt4594) {
					local707 = Static322.aClass211_2.method5406(local32);
					if (local707.aBoolean177 && local707.anInt2448 != -1) {
						@Pc(723) Class157 local723 = Static39.aClass85_1.method2371(local707.anInt2448);
						local289 = local723.anInt4022;
						if (local289 == 0) {
							local690 = false;
						} else if (local289 == 1) {
							local690 = true;
						} else if (local289 == 2) {
							arg2.anInt4598 = 0;
							local690 = false;
						}
					}
				} else {
					local707 = Static322.aClass211_2.method5406(local32);
					@Pc(763) Class91 local763 = Static322.aClass211_2.method5406(arg2.anInt4594);
					if (local707.anInt2448 != -1 && local763.anInt2448 != -1) {
						local780 = Static39.aClass85_1.method2371(local707.anInt2448);
						@Pc(786) Class157 local786 = Static39.aClass85_1.method2371(local763.anInt2448);
						if (local780.anInt4023 < local786.anInt4023) {
							local690 = false;
						}
					}
				}
			}
			if (local690) {
				arg2.anInt4639 = local36 >> 16;
				local43 = Static114.loop;
				arg2.anInt4594 = local32;
				arg2.anInt4595 = (local36 & 0xFFFF) + local43;
				arg2.anInt4582 = 0;
				arg2.anInt4620 = 0;
				arg2.anInt4612 = 1;
				if (arg2.anInt4595 > local43) {
					arg2.anInt4582 = -1;
				}
				if (arg2.anInt4594 != -1 && local43 == arg2.anInt4595) {
					local283 = Static322.aClass211_2.method5406(arg2.anInt4594).anInt2448;
					if (local283 != -1) {
						local780 = Static39.aClass85_1.method2371(local283);
						if (local780 != null && local780.anIntArray262 != null) {
							Static1.method4(local780, arg2 == Static17.self, arg2.aByte78, arg2.xFine, arg2.zFine, 0);
						}
					}
				}
			}
		}
		if ((arg3 & 0x40) != 0) {
			local32 = arg0.gsmarts();
			local36 = arg0.g1sub();
			arg2.method4333(local36, local32, Static114.loop);
			arg2.anInt4606 = Static114.loop + 300;
			arg2.anInt4631 = arg0.g1bneg();
		}
		if ((arg3 & 0x800) != 0) {
			local32 = Static114.loop;
			local36 = arg0.gsmarts();
			local40 = arg0.g1sub();
			arg2.method4333(local40, local36, local32);
		}
		if ((arg3 & 0x4000) != 0) {
			local11 = arg0.g1bsub();
		}
		if (!arg2.aBoolean276) {
			return;
		}
		if (local11 == 127) {
			arg2.method4063(arg2.anInt4169, arg2.anInt4181);
			return;
		}
		@Pc(964) byte local964;
		if (local11 == -1) {
			local964 = Static335.aByteArray92[arg1];
		} else {
			local964 = local11;
		}
		arg2.method4067(arg2.anInt4181, arg2.anInt4169, local964);
	}
}
