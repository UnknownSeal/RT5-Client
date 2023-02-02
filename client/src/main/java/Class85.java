import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class85 {

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_14 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!gp", name = "q", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_15 = new SoftLruHashTable(100);

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "Lclient!r;")
	private final Js5 aJs5_27;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;Lclient!r;)V")
	public Class85(@OriginalArg(0) GameType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3, @OriginalArg(4) Js5 arg4) {
		this.aJs5_27 = arg2;
		if (this.aJs5_27 != null) {
			@Pc(26) int local26 = this.aJs5_27.capacity() - 1;
			this.aJs5_27.getGroupCapacity(local26);
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
	public Class157 method2371(@OriginalArg(1) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_14;
		@Pc(16) Class157 local16;
		synchronized (this.aSoftLruHashTable_14) {
			local16 = (Class157) this.aSoftLruHashTable_14.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aJs5_27.fetchFile(Static98.method2104(arg0), Static341.method5767(arg0));
		local16 = new Class157();
		local16.anInt4028 = arg0;
		local16.aClass85_2 = this;
		if (local37 != null) {
			local16.method3992(new Buffer(local37));
		}
		local16.method3990();
		@Pc(64) SoftLruHashTable local64 = this.aSoftLruHashTable_14;
		synchronized (this.aSoftLruHashTable_14) {
			this.aSoftLruHashTable_14.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
	public void method2373() {
		@Pc(8) SoftLruHashTable local8 = this.aSoftLruHashTable_14;
		synchronized (this.aSoftLruHashTable_14) {
			this.aSoftLruHashTable_14.method2614();
		}
		local8 = this.aSoftLruHashTable_15;
		synchronized (this.aSoftLruHashTable_15) {
			this.aSoftLruHashTable_15.method2614();
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
	public void method2374() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_14;
		synchronized (this.aSoftLruHashTable_14) {
			this.aSoftLruHashTable_14.method2621();
		}
		local2 = this.aSoftLruHashTable_15;
		synchronized (this.aSoftLruHashTable_15) {
			this.aSoftLruHashTable_15.method2621();
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZI)V")
	public void method2375() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_14;
		synchronized (this.aSoftLruHashTable_14) {
			this.aSoftLruHashTable_14.clean(5);
		}
		local6 = this.aSoftLruHashTable_15;
		synchronized (this.aSoftLruHashTable_15) {
			this.aSoftLruHashTable_15.clean(5);
		}
	}
}
