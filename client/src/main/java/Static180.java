import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	public static int anInt3404;

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
	public static int anInt3408 = 0;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
	public static final int anInt3410 = 205;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIZIILclient!r;)V")
	public static void playFadeOut(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Js5 archive) {
		Static384.aBoolean485 = false;
		Static116.songArchive = archive;
		Static105.songGroupID = arg0;
		Static341.songFileID = 0;
		Static356.volume = arg2;
		Static235.state = 1;
		Static28.volumeFadeRate = Static91.stream.getVolume() / arg1;
		if (Static28.volumeFadeRate < 1) {
			Static28.volumeFadeRate = 1;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!bt;)V")
	public static void method3367(@OriginalArg(1) Buffer arg0) {
		if (arg0.bytes.length - arg0.offset < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.g1();
		if (local21 < 0 || local21 > 1 || arg0.bytes.length - arg0.offset < 2) {
			return;
		}
		@Pc(43) int local43 = arg0.g2();
		if (arg0.bytes.length - arg0.offset != local43 * 6) {
			return;
		}
		while (true) {
			@Pc(59) int local59;
			@Pc(63) int local63;
			do {
				do {
					do {
						if (arg0.offset >= arg0.bytes.length) {
							return;
						}
						local59 = arg0.g2();
						local63 = arg0.mg4();
					} while (Static75.anIntArray117.length <= local59);
				} while (!Static89.aBooleanArray18[local59]);
			} while (Static162.aClass45_1.method1623(local59).aChar2 == '1' && (local63 < -1 || local63 > 1));
			Static75.anIntArray117[local59] = local63;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!r;Lclient!r;Lclient!r;Lclient!od;I)Z")
	public static boolean init(@OriginalArg(3) MidiPcmStream stream, @OriginalArg(1) Js5 instrumentsArchive, @OriginalArg(0) Js5 vorbisArchive, @OriginalArg(2) Js5 synthArchive) {
		Static91.stream = stream;
		Static123.synthArchive = synthArchive;
		Static177.vorbisArchive = vorbisArchive;
		Static111.instrumentsArchive = instrumentsArchive;
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	public static void method3369() {
		Static133.A_SOFT_LRU_HASH_TABLE___17.clean(5);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)[Lclient!vr;")
	public static Class242[] method3370() {
		return new Class242[] { Static43.aClass242_1, Static43.aClass242_2, Static43.aClass242_3, Static43.aClass242_4, Static43.aClass242_5, Static43.aClass242_6, Static43.aClass242_7, Static43.aClass242_8, Static43.aClass242_9, Static43.aClass242_10 };
	}
}
