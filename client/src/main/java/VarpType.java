import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class VarpType {

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
	public int clientCode = 0;

	static {
		new LocalisedText("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!bt;)V")
	public void decode(@OriginalArg(1) Buffer buffer) {
		while (true) {
			@Pc(12) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(opcode, buffer);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILclient!bt;)V")
	private void decode(@OriginalArg(1) int opcode, @OriginalArg(2) Buffer buffer) {
		if (opcode == 5) {
			this.clientCode = buffer.g2();
		}
	}
}
