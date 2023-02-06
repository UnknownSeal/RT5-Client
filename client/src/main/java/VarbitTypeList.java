import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class VarbitTypeList {

	@OriginalMember(owner = "client!so", name = "c", descriptor = "Lclient!km;")
	public static VarbitTypeList varbitTypeList;
	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!hu;")
	private SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!km", name = "c", descriptor = "Lclient!r;")
	private final Js5 archive;

	static {
		new LocalisedText("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public VarbitTypeList(@OriginalArg(2) Js5 archive) {
		this.archive = archive;
		if (this.archive != null) {
			@Pc(20) int group = this.archive.capacity() - 1;
			this.archive.getGroupCapacity(group);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V")
	public void method3389() {
		synchronized (this.types) {
			this.types.clean(5);
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)V")
	public void method3391(@OriginalArg(0) int arg0) {
		@Pc(7) SoftLruHashTable local7 = this.types;
		synchronized (this.types) {
			this.types.clear();
			this.types = new SoftLruHashTable(arg0);
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
	public void method3392() {
		@Pc(2) SoftLruHashTable local2 = this.types;
		synchronized (this.types) {
			this.types.method2621();
		}
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(II)Lclient!la;")
	public VarbitType get(@OriginalArg(0) int id) {
		@Pc(24) VarbitType local24;
		synchronized (this.types) {
			local24 = (VarbitType) this.types.get(id);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(45) byte[] bytes = this.archive.fetchFile(Static319.method5430(id), Static75.method1837(id));
		local24 = new VarbitType();
		if (bytes != null) {
			local24.decode(new Buffer(bytes));
		}
		synchronized (this.types) {
			this.types.put(id, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
	public void method3394() {
		@Pc(6) SoftLruHashTable local6 = this.types;
		synchronized (this.types) {
			this.types.clear();
		}
	}
}
