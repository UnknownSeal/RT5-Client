import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public abstract class ReferenceNodeFactory {

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "Lclient!hi;")
	public static final ReferenceNodeFactory SOFT_REFERENCE_NODE_FACTORY = createSoftReferenceFactory();

	static {
		new LocalisedText("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(B)Lclient!hi;")
	public static ReferenceNodeFactory createSoftReferenceFactory() {
		try {
			return (ReferenceNodeFactory) Class.forName("ReferenceNodeFactory_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable exception) {
			return null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!eu;)Lclient!eu;")
	public abstract ReferenceNode create(@OriginalArg(1) ReferenceNode node);
}
