import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class IdentityKitTypeList {

	@OriginalMember(owner = "client!e", name = "c", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];
	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!e;")
	public static IdentityKitTypeList identityKitTypeList;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!hu;")
	private final SoftLruHashTable type = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!r;")
	private final Js5 archive;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!r;")
	public final Js5 modelsArchive;

	static {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			aRectangleArray1[local6] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V")
	public IdentityKitTypeList(@OriginalArg(0) GameType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 archive, @OriginalArg(3) Js5 modelsArchive) {
		this.archive = archive;
		this.modelsArchive = modelsArchive;
		this.archive.getGroupCapacity(3);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public void method1781() {
		@Pc(6) SoftLruHashTable local6 = this.type;
		synchronized (this.type) {
			this.type.method2621();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public void method1782() {
		@Pc(6) SoftLruHashTable local6 = this.type;
		synchronized (this.type) {
			this.type.clear();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Lclient!ge;")
	public IdentityKitType get(@OriginalArg(0) int id) {
		@Pc(6) SoftLruHashTable local6 = this.type;
		@Pc(16) IdentityKitType type;
		synchronized (this.type) {
			type = (IdentityKitType) this.type.get(id);
		}
		if (type != null) {
			return type;
		}
		@Pc(33) byte[] bytes = this.archive.fetchFile(3, id);
		type = new IdentityKitType();
		type.identityKitTypeList = this;
		if (bytes != null) {
			type.decode(new Buffer(bytes));
		}
		@Pc(57) SoftLruHashTable local57 = this.type;
		synchronized (this.type) {
			this.type.put(id, type);
			return type;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)V")
	public void method1785() {
		@Pc(6) SoftLruHashTable local6 = this.type;
		synchronized (this.type) {
			this.type.clean(5);
		}
	}
}
