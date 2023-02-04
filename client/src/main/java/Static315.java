import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!se", name = "t", descriptor = "I")
	public static int anInt5930;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	public static void method5380() {
		Static295.A_LINKED_LIST___32.clear();
		for (@Pc(13) Class2_Sub5 local13 = (Class2_Sub5) Static129.A_LINKED_LIST___19.head(); local13 != null; local13 = (Class2_Sub5) Static129.A_LINKED_LIST___19.next()) {
			if (local13.anInt1005 < 1000) {
				local13.unlink();
				Static295.A_LINKED_LIST___32.addTail(local13);
			}
		}
		Static295.A_LINKED_LIST___32.method3541(Static129.A_LINKED_LIST___19);
		@Pc(41) int local41 = -1;
		if (Static370.aClass2_Sub24_1 != null) {
			local41 = Static370.aClass2_Sub24_1.method5246();
		}
		if (!Static375.aBoolean477) {
			if (local41 == 0 && (Static232.anInt4087 == 1 && Static268.size > 2 || Static208.method3709())) {
				local41 = 2;
			}
			if (local41 == 2 && Static268.size > 0 && Static370.aClass2_Sub24_1 != null) {
				if (Static375.aComponent_14 == null && Static348.anInt6449 == 0) {
					Static388.method6438(Static370.aClass2_Sub24_1.method5242(), Static370.aClass2_Sub24_1.method5241());
				} else {
					Static116.anInt2357 = 2;
				}
			}
			if (local41 == 0 && Static268.size > 0) {
				Static145.method2695();
			}
			if (Static375.aComponent_14 == null && Static348.anInt6449 == 0) {
				Static116.anInt2357 = 0;
				Static32.aClass2_Sub5_2 = null;
			}
			return;
		}
		@Pc(57) int local57;
		@Pc(61) int local61;
		if (local41 == -1) {
			local57 = Static226.aClass119_1.method3303();
			local61 = Static226.aClass119_1.method3312();
			if (local57 < Static305.anInt5743 - 10 || local57 > Static107.anInt2220 + Static305.anInt5743 + 10 || local61 < Static363.anInt6801 - 10 || local61 > Static363.anInt6801 + Static352.anInt6519 + 10) {
				Static375.aBoolean477 = false;
				Static369.method6220(Static107.anInt2220, Static305.anInt5743, Static352.anInt6519, Static363.anInt6801);
			}
		}
		if (local41 != 0) {
			return;
		}
		local57 = Static305.anInt5743;
		local61 = Static363.anInt6801;
		@Pc(117) int local117 = Static107.anInt2220;
		@Pc(121) int local121 = Static370.aClass2_Sub24_1.method5242();
		@Pc(125) int local125 = Static370.aClass2_Sub24_1.method5241();
		@Pc(127) int local127 = -1;
		@Pc(145) int local145;
		for (@Pc(129) int local129 = 0; local129 < Static268.size; local129++) {
			if (Static270.aBoolean371) {
				local145 = local61 + (Static268.size - (local129 + 1)) * 16 + 33;
				if (local57 < local121 && local57 + local117 > local121 && local125 > local145 - 13 && local145 + 4 > local125) {
					local127 = local129;
				}
			} else {
				local145 = local61 + (-local129 + -1 + Static268.size) * 16 + 31;
				if (local57 < local121 && local121 < local117 + local57 && local145 - 13 < local125 && local125 < local145 + 3) {
					local127 = local129;
				}
			}
		}
		if (local127 != -1) {
			local145 = 0;
			@Pc(232) Class75 local232 = new Class75(Static129.A_LINKED_LIST___19);
			for (@Pc(237) Class2_Sub5 local237 = (Class2_Sub5) local232.method2181(); local237 != null; local237 = (Class2_Sub5) local232.method2178()) {
				if (local145 == local127) {
					Static259.method4426(local237, local121, local125);
				}
				local145++;
			}
		}
		Static375.aBoolean477 = false;
		Static369.method6220(Static107.anInt2220, Static305.anInt5743, Static352.anInt6519, Static363.anInt6801);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	public static void readNpcInfo() {
		Static212.inboundBuffer.accessBits();
		@Pc(13) int size = Static212.inboundBuffer.gBit(8);

		if (size < Static166.size) {
			for (@Pc(18) int i = size; i < Static166.size; i++) {
				Static17.removeIDs[Static242.removedCount++] = Static211.ids[i];
			}
		}
		if (Static166.size < size) {
			throw new RuntimeException("gnpov1");
		}
		Static166.size = 0;
		for (int i = 0; i < size; i++) {
			@Pc(64) int id = Static211.ids[i];
			@Pc(68) Npc npc = Static365.npcs[id];
			@Pc(73) int updated = Static212.inboundBuffer.gBit(1);
			if (updated == 0) {
				Static211.ids[Static166.size++] = id;
				npc.lastSeenLoop = Static114.loop;
			} else {
				@Pc(96) int type = Static212.inboundBuffer.gBit(2);
				if (type == 0) {
					Static211.ids[Static166.size++] = id;
					npc.lastSeenLoop = Static114.loop;
					Static277.extendedIDs[Static343.extendedCount++] = id;
				} else if (type == 1) {
					Static211.ids[Static166.size++] = id;
					npc.lastSeenLoop = Static114.loop;
					@Pc(140) int direction = Static212.inboundBuffer.gBit(3);
					npc.move(1, direction);
					@Pc(150) int extended = Static212.inboundBuffer.gBit(1);
					if (extended == 1) {
						Static277.extendedIDs[Static343.extendedCount++] = id;
					}
				} else if (type == 2) {
					Static211.ids[Static166.size++] = id;
					npc.lastSeenLoop = Static114.loop;
					if (Static212.inboundBuffer.gBit(1) == 1) {
						int firstDirection = Static212.inboundBuffer.gBit(3);
						npc.move(2, firstDirection);
						int secondDirection = Static212.inboundBuffer.gBit(3);
						npc.move(2, secondDirection);
					} else {
						int directed = Static212.inboundBuffer.gBit(3);
						npc.move(0, directed);
					}
					int extended = Static212.inboundBuffer.gBit(1);
					if (extended == 1) {
						Static277.extendedIDs[Static343.extendedCount++] = id;
					}
				} else if (type == 3) {
					Static17.removeIDs[Static242.removedCount++] = id;
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)Lclient!oo;")
	public static Class12_Sub6 method5382() {
		@Pc(8) Class12_Sub6 local8 = (Class12_Sub6) Static352.aClass36_9.method1424();
		if (local8 == null) {
			return new Class12_Sub6();
		} else {
			Static285.anInt5374--;
			return local8;
		}
	}
}
