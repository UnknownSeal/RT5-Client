import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class SubInterface extends Node {

	@OriginalMember(owner = "client!cu", name = "x", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!cu", name = "A", descriptor = "I")
	public int type;

	static {
		new LocalisedText("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}
}
