import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class EnumTypeList {

	@OriginalMember(owner = "client!hu", name = "t", descriptor = "Lclient!is;")
	public static EnumTypeList enumTypeList;
	@OriginalMember(owner = "client!is", name = "h", descriptor = "Lclient!hu;")
	private final SoftLruHashTable types = new SoftLruHashTable(128);

	@OriginalMember(owner = "client!is", name = "f", descriptor = "Lclient!r;")
	private final Js5 archive;

	static {
		new LocalisedText("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public EnumTypeList(@OriginalArg(0) GameType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 archive) {
		this.archive = archive;
		if (this.archive != null) {
			@Pc(20) int capacity = this.archive.capacity() - 1;
			this.archive.getGroupCapacity(capacity);
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)I")
	public static int getGroupID(@OriginalArg(0) int id) {
		return id >>> 8;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)I")
	public static int getFileID(@OriginalArg(1) int id) {
		return id & 0xFF;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IB)Lclient!ds;")
	public EnumType get(@OriginalArg(0) int id) {
		@Pc(6) SoftLruHashTable local6 = this.types;
		@Pc(16) EnumType type;
		synchronized (this.types) {
			type = (EnumType) this.types.get(id);
		}
		if (type != null) {
			return type;
		}
		@Pc(37) byte[] bytes = this.archive.fetchFile(getGroupID(id), getFileID(id));
		type = new EnumType();
		if (bytes != null) {
			type.decode(new Buffer(bytes));
		}
		@Pc(61) SoftLruHashTable local61 = this.types;
		synchronized (this.types) {
			this.types.put(id, type);
			return type;
		}
	}
}
