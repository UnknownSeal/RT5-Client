import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class18 {

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Lclient!hu;")
	private final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!r;")
	private final Js5 archive;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class18(@OriginalArg(2) Js5 arg2) {
		this.archive = arg2;
		if (this.archive != null) {
			this.archive.getGroupCapacity(11);
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public void method563() {
		@Pc(2) SoftLruHashTable local2 = this.types;
		synchronized (this.types) {
			this.types.clear();
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	public void method564() {
		@Pc(14) SoftLruHashTable local14 = this.types;
		synchronized (this.types) {
			this.types.method2621();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lclient!vp;")
	public Class240 get(@OriginalArg(1) int id) {
		@Pc(21) Class240 local21;
		synchronized (this.types) {
			local21 = (Class240) this.types.get(id);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] bytes = this.archive.fetchFile(11, id);
		local21 = new Class240();
		if (bytes != null) {
			local21.decode(new Buffer(bytes));
		}
		synchronized (this.types) {
			this.types.put(id, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)V")
	public void method566() {
		@Pc(6) SoftLruHashTable local6 = this.types;
		synchronized (this.types) {
			this.types.clean(5);
		}
	}
}
