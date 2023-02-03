import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class211 {

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
	public int anInt5958;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Lclient!hu;")
	private final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Lclient!hu;")
	public final SoftLruHashTable aSoftLruHashTable_51 = new SoftLruHashTable(30);

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "Lclient!r;")
	private final Js5 archive;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!r;")
	public final Js5 aJs5_81;

	static {
		new LocalisedText(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
		new LocalisedText("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V")
	public Class211(@OriginalArg(0) GameType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.archive = arg2;
		this.aJs5_81 = arg3;
		@Pc(26) int local26 = this.archive.capacity() - 1;
		this.archive.getGroupCapacity(local26);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Lclient!hf;")
	public Class91 get(@OriginalArg(0) int id) {
		@Pc(6) SoftLruHashTable local6 = this.types;
		@Pc(25) Class91 local25;
		synchronized (this.types) {
			local25 = (Class91) this.types.get(id);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(48) byte[] bytes = this.archive.fetchFile(Static117.getGroupID(id), Static298.getFileID(id));
		local25 = new Class91();
		local25.aClass211_1 = this;
		local25.id = id;
		if (bytes != null) {
			local25.decode(new Buffer(bytes));
		}
		local6 = this.types;
		synchronized (this.types) {
			this.types.put(id, local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public void method5407() {
		@Pc(2) SoftLruHashTable local2 = this.types;
		synchronized (this.types) {
			this.types.method2621();
		}
		local2 = this.aSoftLruHashTable_51;
		synchronized (this.aSoftLruHashTable_51) {
			this.aSoftLruHashTable_51.method2621();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
	public void method5409() {
		@Pc(6) SoftLruHashTable local6 = this.types;
		synchronized (this.types) {
			this.types.clear();
		}
		local6 = this.aSoftLruHashTable_51;
		synchronized (this.aSoftLruHashTable_51) {
			this.aSoftLruHashTable_51.clear();
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V")
	public void method5410() {
		@Pc(14) SoftLruHashTable local14 = this.types;
		synchronized (this.types) {
			this.types.clean(5);
		}
		local14 = this.aSoftLruHashTable_51;
		synchronized (this.aSoftLruHashTable_51) {
			this.aSoftLruHashTable_51.clean(5);
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)V")
	public void method5411(@OriginalArg(1) int arg0) {
		this.anInt5958 = arg0;
		@Pc(13) SoftLruHashTable local13 = this.aSoftLruHashTable_51;
		synchronized (this.aSoftLruHashTable_51) {
			this.aSoftLruHashTable_51.clear();
		}
	}
}
