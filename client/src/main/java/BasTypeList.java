import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class BasTypeList {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Lclient!ak;")
	public static BasTypeList basTypeList;
	@OriginalMember(owner = "client!ak", name = "i", descriptor = "Lclient!hu;")
	private final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "Lclient!r;")
	private final Js5 archive;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public BasTypeList(@OriginalArg(2) Js5 archive) {
		this.archive = archive;
		this.archive.getGroupCapacity(32);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
	public void method241() {
		@Pc(11) SoftLruHashTable local11 = this.types;
		synchronized (this.types) {
			this.types.clear();
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	public void method242() {
		@Pc(2) SoftLruHashTable local2 = this.types;
		synchronized (this.types) {
			this.types.method2621();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V")
	public void method243() {
		@Pc(2) SoftLruHashTable local2 = this.types;
		synchronized (this.types) {
			this.types.clean(5);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lclient!ti;")
	public BasType get(@OriginalArg(0) int id) {
		@Pc(16) BasType type;
		synchronized (this.types) {
			type = (BasType) this.types.get(id);
		}
		if (type != null) {
			return type;
		}
		@Pc(33) byte[] bytes = this.archive.fetchFile(32, id);
		type = new BasType();
		if (bytes != null) {
			type.decode(new Buffer(bytes));
		}
		synchronized (this.types) {
			this.types.put(id, type);
			return type;
		}
	}
}
