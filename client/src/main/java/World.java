import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class World extends AbstractWorld {

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
	public int worldID;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Ljava/lang/String;")
	public String activity;

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Ljava/lang/String;")
	public String hostname;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
	public int anInt83 = -1;

	static {
		new LocalisedText("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)Lclient!kh;")
	public Country getCountry() {
		return Static363.countries[super.country];
	}
}
