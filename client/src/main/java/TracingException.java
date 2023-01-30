import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class TracingException extends RuntimeException {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "Ljava/lang/String;")
	public String cause;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Ljava/lang/Throwable;")
	public final Throwable message;

	static {
		new LocalisedText("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	public TracingException(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.cause = arg1;
		this.message = arg0;
	}
}
