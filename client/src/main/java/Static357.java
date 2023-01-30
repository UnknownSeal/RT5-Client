import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static357 {

	@OriginalMember(owner = "client!uq", name = "jb", descriptor = "[[I")
	public static int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!uq", name = "db", descriptor = "Lclient!gd;")
	public static final LocalisedText A_TRANSLATABLE_STRING___137 = new LocalisedText("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!uq", name = "fb", descriptor = "[Z")
	public static final boolean[] aBooleanArray59 = new boolean[100];

	@OriginalMember(owner = "client!uq", name = "gb", descriptor = "Lclient!gd;")
	public static final LocalisedText A_TRANSLATABLE_STRING___138 = new LocalisedText("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!uq", name = "ib", descriptor = "I")
	public static int anInt6683 = 0;

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)I")
	public static int method5986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static82.anIntArrayArray16 == null ? 0 : Static82.anIntArrayArray16[arg0][arg1] & 0xFFFFFF;
	}
}
