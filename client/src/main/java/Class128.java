import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class128 {

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!hu;")
	private SoftLruHashTable aSoftLruHashTable_28 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!km", name = "c", descriptor = "Lclient!r;")
	private final Js5 aJs5_51;

	static {
		new LocalisedText("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class128(@OriginalArg(0) GameType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs5_51 = arg2;
		if (this.aJs5_51 != null) {
			@Pc(20) int local20 = this.aJs5_51.capacity() - 1;
			this.aJs5_51.getGroupCapacity(local20);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V")
	public void method3389() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_28;
		synchronized (this.aSoftLruHashTable_28) {
			this.aSoftLruHashTable_28.clean(5);
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)V")
	public void method3391(@OriginalArg(0) int arg0) {
		@Pc(7) SoftLruHashTable local7 = this.aSoftLruHashTable_28;
		synchronized (this.aSoftLruHashTable_28) {
			this.aSoftLruHashTable_28.clear();
			this.aSoftLruHashTable_28 = new SoftLruHashTable(arg0);
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
	public void method3392() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_28;
		synchronized (this.aSoftLruHashTable_28) {
			this.aSoftLruHashTable_28.method2621();
		}
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(II)Lclient!la;")
	public Class134 method3393(@OriginalArg(0) int arg0) {
		@Pc(14) SoftLruHashTable local14 = this.aSoftLruHashTable_28;
		@Pc(24) Class134 local24;
		synchronized (this.aSoftLruHashTable_28) {
			local24 = (Class134) this.aSoftLruHashTable_28.get((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(45) byte[] local45 = this.aJs5_51.fetchFile(Static319.method5430(arg0), Static75.method1837(arg0));
		local24 = new Class134();
		if (local45 != null) {
			local24.method3508(new Buffer(local45));
		}
		@Pc(61) SoftLruHashTable local61 = this.aSoftLruHashTable_28;
		synchronized (this.aSoftLruHashTable_28) {
			this.aSoftLruHashTable_28.put((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
	public void method3394() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_28;
		synchronized (this.aSoftLruHashTable_28) {
			this.aSoftLruHashTable_28.clear();
		}
	}
}
