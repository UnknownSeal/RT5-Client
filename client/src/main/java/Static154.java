import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!is", name = "j", descriptor = "Lclient!oj;")
	public static Class170 aClass170_2;

	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public static int anInt2803 = 0;

	@OriginalMember(owner = "client!is", name = "i", descriptor = "I")
	public static int anInt2806 = 0;

	@OriginalMember(owner = "client!is", name = "k", descriptor = "I")
	public static int rectDebug = 0;

	@OriginalMember(owner = "client!is", name = "m", descriptor = "J")
	public static long aLong89 = 0L;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!kb;III[Z)V")
	public static void method2780(@OriginalArg(0) Class2_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static365.aClass6Array4 == Static186.aClass6Array2) {
			return;
		}
		@Pc(9) int local9 = Static330.aClass6Array3[arg1].method5727(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class6 local22 = Static330.aClass6Array3[local11];
				if (local22 != null) {
					local22.method5723(arg0, arg2, local9 - local22.method5727(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!oe;B)V")
	public static void remove(@OriginalArg(0) Npc npc) {
		for (@Pc(16) AreaSound areaSound = (AreaSound) Static363.npcSounds.head(); areaSound != null; areaSound = (AreaSound) Static363.npcSounds.next()) {
			if (npc == areaSound.npc) {
				if (areaSound.primarySystem != null) {
					client.soundStream.method2081(areaSound.primarySystem);
					areaSound.primarySystem = null;
				}
				areaSound.unlink();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)V")
	public static void method2783(@OriginalArg(0) int arg0) {
		Static199.anInt5756 = arg0;
		@Pc(7) SoftLruHashTable local7 = Static98.A_SOFT_LRU_HASH_TABLE___10;
		synchronized (Static98.A_SOFT_LRU_HASH_TABLE___10) {
			Static98.A_SOFT_LRU_HASH_TABLE___10.clear();
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IZZ)I")
	public static int method2784(@OriginalArg(0) int arg0) {
		@Pc(14) Inventory local14 = Static374.get(false, arg0);
		if (local14 == null) {
			return Static178.aClass51_3.get(arg0).anInt2488;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.types.length; local31++) {
			if (local14.types[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static178.aClass51_3.get(arg0).anInt2488 - local14.types.length;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "([I[I[IILclient!nh;)V")
	public static void method2785(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class11_Sub5_Sub2_Sub1 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(11) int local11 = arg0[local3];
			@Pc(15) int local15 = arg1[local3];
			@Pc(19) int local19 = arg2[local3];
			for (@Pc(21) int local21 = 0; local15 != 0 && local21 < arg3.aClass20Array3.length; local21++) {
				if ((local15 & 0x1) != 0) {
					if (local11 == -1) {
						arg3.aClass20Array3[local21] = null;
					} else {
						@Pc(46) SeqType local46 = SeqTypeList.seqTypeList.get(local11);
						@Pc(49) int local49 = local46.exactmove;
						@Pc(54) Class20 local54 = arg3.aClass20Array3[local21];
						if (local54 != null) {
							if (local54.anInt624 == local11) {
								if (local49 == 0) {
									local54 = arg3.aClass20Array3[local21] = null;
								} else if (local49 == 1) {
									local54.anInt628 = 0;
									local54.anInt629 = local19;
									local54.anInt625 = 0;
									local54.anInt627 = 1;
									local54.anInt626 = 0;
									Static1.method4(local46, Static17.self == arg3, arg3.aByte78, arg3.xFine, arg3.zFine, 0);
								} else if (local49 == 2) {
									local54.anInt626 = 0;
								}
							} else if (local46.priority >= SeqTypeList.seqTypeList.get(local54.anInt624).priority) {
								local54 = arg3.aClass20Array3[local21] = null;
							}
						}
						if (local54 == null) {
							local54 = arg3.aClass20Array3[local21] = new Class20();
							local54.anInt627 = 1;
							local54.anInt624 = local11;
							local54.anInt628 = 0;
							local54.anInt626 = 0;
							local54.anInt625 = 0;
							local54.anInt629 = local19;
							Static1.method4(local46, Static17.self == arg3, arg3.aByte78, arg3.xFine, arg3.zFine, 0);
						}
					}
				}
				local15 >>>= 0x1;
			}
		}
	}
}
