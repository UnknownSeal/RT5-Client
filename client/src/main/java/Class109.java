import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class109 {

	@OriginalMember(owner = "client!is", name = "h", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_23 = new SoftLruHashTable(128);

	@OriginalMember(owner = "client!is", name = "f", descriptor = "Lclient!r;")
	private final Js5 aJs5_43;

	static {
		new LocalisedText("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class109(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs5_43 = arg2;
		if (this.aJs5_43 != null) {
			@Pc(20) int local20 = this.aJs5_43.method5091() - 1;
			this.aJs5_43.method5080(local20);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IB)Lclient!ds;")
	public Class52 method2779(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_23;
		@Pc(16) Class52 local16;
		synchronized (this.aSoftLruHashTable_23) {
			local16 = (Class52) this.aSoftLruHashTable_23.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aJs5_43.fetchFile(Static266.method4497(arg0), Static121.method2393(arg0));
		local16 = new Class52();
		if (local37 != null) {
			local16.method1774(new Buffer(local37));
		}
		@Pc(61) SoftLruHashTable local61 = this.aSoftLruHashTable_23;
		synchronized (this.aSoftLruHashTable_23) {
			this.aSoftLruHashTable_23.put((long) arg0, local16);
			return local16;
		}
	}
}
