import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class190 {

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_41 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "Lclient!r;")
	private final Js5 aJs5_69;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class190(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs5_69 = arg2;
		this.aJs5_69.method5080(31);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lclient!et;")
	public Class66 method4877(@OriginalArg(0) int arg0) {
		@Pc(11) SoftLruHashTable local11 = this.aSoftLruHashTable_41;
		@Pc(21) Class66 local21;
		synchronized (this.aSoftLruHashTable_41) {
			local21 = (Class66) this.aSoftLruHashTable_41.get((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aJs5_69.fetchFile(31, arg0);
		local21 = new Class66();
		if (local38 != null) {
			local21.method1936(new Buffer(local38));
		}
		@Pc(54) SoftLruHashTable local54 = this.aSoftLruHashTable_41;
		synchronized (this.aSoftLruHashTable_41) {
			this.aSoftLruHashTable_41.put((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)V")
	public void method4878() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_41;
		synchronized (this.aSoftLruHashTable_41) {
			this.aSoftLruHashTable_41.clean(5);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
	public void method4883() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_41;
		synchronized (this.aSoftLruHashTable_41) {
			this.aSoftLruHashTable_41.method2621();
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public void method4884() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_41;
		synchronized (this.aSoftLruHashTable_41) {
			this.aSoftLruHashTable_41.method2614();
		}
	}
}
