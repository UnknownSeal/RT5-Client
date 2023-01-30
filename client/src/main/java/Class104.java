import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class104 {

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "Lclient!hu;")
	private SoftLruHashTable aSoftLruHashTable_19 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "Lclient!hu;")
	public SoftLruHashTable aSoftLruHashTable_20 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!r;")
	public final Js5 aJs5_39;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Lclient!r;")
	private final Js5 aJs5_40;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V")
	public Class104(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aJs5_39 = arg3;
		this.aJs5_40 = arg2;
		this.aJs5_40.method5080(34);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZI)V")
	public void method2702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aSoftLruHashTable_19 = new SoftLruHashTable(arg0);
		this.aSoftLruHashTable_20 = new SoftLruHashTable(arg1);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V")
	public void method2704() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_19;
		synchronized (this.aSoftLruHashTable_19) {
			this.aSoftLruHashTable_19.clean(5);
		}
		local6 = this.aSoftLruHashTable_20;
		synchronized (this.aSoftLruHashTable_20) {
			this.aSoftLruHashTable_20.clean(5);
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V")
	public void method2705() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_19;
		synchronized (this.aSoftLruHashTable_19) {
			this.aSoftLruHashTable_19.method2621();
		}
		local2 = this.aSoftLruHashTable_20;
		synchronized (this.aSoftLruHashTable_20) {
			this.aSoftLruHashTable_20.method2621();
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)V")
	public void method2707() {
		@Pc(8) SoftLruHashTable local8 = this.aSoftLruHashTable_19;
		synchronized (this.aSoftLruHashTable_19) {
			this.aSoftLruHashTable_19.method2614();
		}
		local8 = this.aSoftLruHashTable_20;
		synchronized (this.aSoftLruHashTable_20) {
			this.aSoftLruHashTable_20.method2614();
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Lclient!md;")
	public Class146 method2708(@OriginalArg(1) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_19;
		@Pc(16) Class146 local16;
		synchronized (this.aSoftLruHashTable_19) {
			local16 = (Class146) this.aSoftLruHashTable_19.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aJs5_40.fetchFile(34, arg0);
		local16 = new Class146();
		local16.aClass104_1 = this;
		if (local33 != null) {
			local16.method3705(new Buffer(local33));
		}
		@Pc(52) SoftLruHashTable local52 = this.aSoftLruHashTable_19;
		synchronized (this.aSoftLruHashTable_19) {
			this.aSoftLruHashTable_19.put((long) arg0, local16);
			return local16;
		}
	}
}
