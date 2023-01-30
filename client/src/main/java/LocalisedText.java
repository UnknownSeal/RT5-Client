import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class LocalisedText {

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "Lclient!gd;")
    public static final LocalisedText LENT_ITEM_RETURN = new LocalisedText("Discard", "Ablegen", "Jeter", "Descartar");
    @OriginalMember(owner = "client!we", name = "C", descriptor = "Lclient!gd;")
    public static final LocalisedText FACEHERE = new LocalisedText("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");
    @OriginalMember(owner = "client!gd", name = "f", descriptor = "[Ljava/lang/String;")
	private final String[] localisedText;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public LocalisedText(@OriginalArg(0) String english, @OriginalArg(1) String german, @OriginalArg(2) String french, @OriginalArg(3) String portuguese) {
		this.localisedText = new String[] { english, german, french, portuguese };
	}

	@OriginalMember(owner = "client!gd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	/*
	 * Language index
	 * 0 - English
	 * 1 - German
	 * 2 - French
	 * 3 - Portuguese
	 */
	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String getLocalisedText(@OriginalArg(0) int language) {
		return this.localisedText[language];
	}
}
