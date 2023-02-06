import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class VarpTypeList {

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "Lclient!rb;")
	public static VarpTypeList varpTypeList;
	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!hu;")
	private final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!r;")
	private final Js5 archive;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	public final int capacity;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public VarpTypeList(@OriginalArg(2) Js5 archive) {
		this.archive = archive;
		if (this.archive == null) {
			this.capacity = 0;
		} else {
			this.capacity = this.archive.getGroupCapacity(16);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public void clear() {
		synchronized (this.types) {
			this.types.clear();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
	public void clean() {
		synchronized (this.types) {
			this.types.clean(5);
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public void method5111() {
		synchronized (this.types) {
			this.types.method2621();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)Lclient!ok;")
	public VarpType get(@OriginalArg(0) int id) {
		@Pc(16) VarpType type;
		synchronized (this.types) {
			type = (VarpType) this.types.get(id);
		}
		if (type != null) {
			return type;
		}
		@Pc(33) byte[] bytes = this.archive.fetchFile(16, id);
		type = new VarpType();
		if (bytes != null) {
			type.decode(new Buffer(bytes));
		}
		synchronized (this.types) {
			this.types.put(id, type);
			return type;
		}
	}
}
