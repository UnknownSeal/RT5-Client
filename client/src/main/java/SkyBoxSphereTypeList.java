import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class SkyBoxSphereTypeList {

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "Lclient!ng;")
	public static SkyBoxSphereTypeList skyBoxSphereTypeList;
	@OriginalMember(owner = "client!ng", name = "f", descriptor = "Lclient!hu;")
	private final SoftLruHashTable types = new SoftLruHashTable(16);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Lclient!r;")
	private final Js5 archive;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public SkyBoxSphereTypeList(@OriginalArg(2) Js5 archive) {
		this.archive = archive;
		this.archive.getGroupCapacity(30);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V")
	public void method4028() {
		@Pc(11) SoftLruHashTable local11 = this.types;
		synchronized (this.types) {
			this.types.clean(5);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
	public void method4029() {
		@Pc(6) SoftLruHashTable local6 = this.types;
		synchronized (this.types) {
			this.types.method2621();
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)Lclient!ie;")
	public SkyBoxSphereType get(@OriginalArg(0) int id) {
		@Pc(16) SkyBoxSphereType type;
		synchronized (this.types) {
			type = (SkyBoxSphereType) this.types.get(id);
		}
		if (type != null) {
			return type;
		}
		@Pc(38) byte[] bytes = this.archive.fetchFile(30, id);
		type = new SkyBoxSphereType();
		if (bytes != null) {
			type.decode(new Buffer(bytes));
		}
		synchronized (this.types) {
			this.types.put(id, type);
			return type;
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
	public void method4032() {
		@Pc(7) SoftLruHashTable local7 = this.types;
		synchronized (this.types) {
			this.types.clear();
		}
	}
}
