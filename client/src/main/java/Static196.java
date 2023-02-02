import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
	public static int anInt3318;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_131 = new Class145(52, 12);

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "[Lclient!wk;")
	public static final SynthSound[] sounds = new SynthSound[50];

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
	public static int anInt3317 = -1;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray31 = new boolean[100];

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)Z")
	public static boolean method3309() {
		try {
			if (Static235.state == 2) {
				if (Static155.aClass2_Sub34_1 == null) {
					Static155.aClass2_Sub34_1 = Static406.method5447(Static116.songArchive, Static105.songGroupID, Static341.songFileID);
					if (Static155.aClass2_Sub34_1 == null) {
						return false;
					}
				}
				if (Static164.aSoundBank_1 == null) {
					Static164.aSoundBank_1 = new SoundBank(Static123.synthArchive, Static177.vorbisArchive);
				}
				if (Static91.stream.method4280(Static164.aSoundBank_1, Static155.aClass2_Sub34_1, Static111.instrumentsArchive)) {
					Static91.stream.method4270();
					Static91.stream.setVolume(Static356.volume);
					Static91.stream.method4272(Static155.aClass2_Sub34_1, Static384.aBoolean485);
					Static155.aClass2_Sub34_1 = null;
					Static116.songArchive = null;
					Static164.aSoundBank_1 = null;
					Static235.state = 0;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static91.stream.method4273();
			Static235.state = 0;
			Static164.aSoundBank_1 = null;
			Static116.songArchive = null;
			Static155.aClass2_Sub34_1 = null;
		}
		return false;
	}
}
