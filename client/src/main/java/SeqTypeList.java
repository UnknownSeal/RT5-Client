import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class SeqTypeList {

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "Lclient!gp;")
	public static SeqTypeList seqTypeList;
	@OriginalMember(owner = "client!gp", name = "f", descriptor = "Lclient!hu;")
	private final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!gp", name = "q", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_15 = new SoftLruHashTable(100);

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "Lclient!r;")
	private final Js5 archive;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;Lclient!r;)V")
	public SeqTypeList(@OriginalArg(2) Js5 archive, @OriginalArg(3) Js5 arg3, @OriginalArg(4) Js5 arg4) {
		this.archive = archive;
		if (this.archive != null) {
			@Pc(26) int group = this.archive.capacity() - 1;
			this.archive.getGroupCapacity(group);
		}
		Static81.method3664(arg3, arg4);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)Lclient!nt;")
	public Class2_Sub2_Sub13 method2368(@OriginalArg(1) int arg0) {
		@Pc(12) SoftLruHashTable local12 = this.aSoftLruHashTable_15;
		@Pc(22) Class2_Sub2_Sub13 local22;
		synchronized (this.aSoftLruHashTable_15) {
			local22 = (Class2_Sub2_Sub13) this.aSoftLruHashTable_15.get((long) arg0);
			if (local22 == null) {
				local22 = new Class2_Sub2_Sub13(arg0);
				this.aSoftLruHashTable_15.put((long) arg0, local22);
			}
		}
		synchronized (local22) {
			return local22.method4239() ? local22 : null;
		}
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(II)Lclient!nb;")
	public SeqType get(@OriginalArg(1) int id) {
		@Pc(16) SeqType type;
		synchronized (this.types) {
			type = (SeqType) this.types.get(id);
		}
		if (type != null) {
			return type;
		}
		@Pc(37) byte[] bytes = this.archive.fetchFile(Static98.method2104(id), Static341.method5767(id));
		type = new SeqType();
		type.anInt4028 = id;
		type.aSeqTypeList_2 = this;
		if (bytes != null) {
			type.decode(new Buffer(bytes));
		}
		type.postDecode();
		synchronized (this.types) {
			this.types.put(id, type);
			return type;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
	public void method2373() {
		@Pc(8) SoftLruHashTable local8 = this.types;
		synchronized (this.types) {
			this.types.clear();
		}
		local8 = this.aSoftLruHashTable_15;
		synchronized (this.aSoftLruHashTable_15) {
			this.aSoftLruHashTable_15.clear();
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
	public void method2374() {
		@Pc(2) SoftLruHashTable local2 = this.types;
		synchronized (this.types) {
			this.types.method2621();
		}
		local2 = this.aSoftLruHashTable_15;
		synchronized (this.aSoftLruHashTable_15) {
			this.aSoftLruHashTable_15.method2621();
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZI)V")
	public void method2375() {
		@Pc(6) SoftLruHashTable local6 = this.types;
		synchronized (this.types) {
			this.types.clean(5);
		}
		local6 = this.aSoftLruHashTable_15;
		synchronized (this.aSoftLruHashTable_15) {
			this.aSoftLruHashTable_15.clean(5);
		}
	}
}
