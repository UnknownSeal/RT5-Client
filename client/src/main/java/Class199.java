import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class199 {

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_43 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!r;")
	private final Js5 aJs5_76;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	public final int anInt5596;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class199(@OriginalArg(0) GameType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs5_76 = arg2;
		if (this.aJs5_76 == null) {
			this.anInt5596 = 0;
		} else {
			this.anInt5596 = this.aJs5_76.getGroupCapacity(16);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public void method5107() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_43;
		synchronized (this.aSoftLruHashTable_43) {
			this.aSoftLruHashTable_43.method2614();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
	public void method5108() {
		@Pc(14) SoftLruHashTable local14 = this.aSoftLruHashTable_43;
		synchronized (this.aSoftLruHashTable_43) {
			this.aSoftLruHashTable_43.clean(5);
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public void method5111() {
		@Pc(14) SoftLruHashTable local14 = this.aSoftLruHashTable_43;
		synchronized (this.aSoftLruHashTable_43) {
			this.aSoftLruHashTable_43.method2621();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)Lclient!ok;")
	public Class171 method5113(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_43;
		@Pc(16) Class171 local16;
		synchronized (this.aSoftLruHashTable_43) {
			local16 = (Class171) this.aSoftLruHashTable_43.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aJs5_76.fetchFile(16, arg0);
		local16 = new Class171();
		if (local33 != null) {
			local16.method4369(new Buffer(local33));
		}
		@Pc(49) SoftLruHashTable local49 = this.aSoftLruHashTable_43;
		synchronized (this.aSoftLruHashTable_43) {
			this.aSoftLruHashTable_43.put((long) arg0, local16);
			return local16;
		}
	}
}
