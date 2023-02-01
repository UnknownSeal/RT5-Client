import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static249 {

	@OriginalMember(owner = "client!of", name = "A", descriptor = "Lclient!je;")
	public static WorldMapFont font19;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V")
	public static void method4148(@OriginalArg(0) int arg0) {
		if (Static305.anIntArray386 == null || arg0 > Static305.anIntArray386.length) {
			Static305.anIntArray386 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIILclient!r;ZI)V")
	public static void playFadeOut(@OriginalArg(0) int arg0, @OriginalArg(4) Js5 arg1, @OriginalArg(6) int arg2) {
		Static341.songFileID = 0;
		Static116.songArchive = arg1;
		Static105.songGroupID = arg2;
		Static28.volumeFadeRate = 2;
		Static356.volume = arg0;
		Static235.state = 1;
		Static384.aBoolean485 = false;
	}
}
