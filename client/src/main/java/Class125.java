import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class125 {

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "Lclient!hu;")
	private SoftLruHashTable aSoftLruHashTable_26 = new SoftLruHashTable(128);

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "Lclient!hu;")
	public SoftLruHashTable aSoftLruHashTable_27 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "Lclient!r;")
	private final Js5 aJs5_49;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "Lclient!r;")
	public final Js5 aJs5_50;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V")
	public Class125(@OriginalArg(0) GameType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aJs5_49 = arg2;
		this.aJs5_50 = arg3;
		this.aJs5_49.getGroupCapacity(36);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	public void method3372() {
		@Pc(11) SoftLruHashTable local11 = this.aSoftLruHashTable_26;
		synchronized (this.aSoftLruHashTable_26) {
			this.aSoftLruHashTable_26.method2621();
		}
		local11 = this.aSoftLruHashTable_27;
		synchronized (this.aSoftLruHashTable_27) {
			this.aSoftLruHashTable_27.method2621();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V")
	public void method3375() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_26;
		synchronized (this.aSoftLruHashTable_26) {
			this.aSoftLruHashTable_26.clean(5);
		}
		local2 = this.aSoftLruHashTable_27;
		synchronized (this.aSoftLruHashTable_27) {
			this.aSoftLruHashTable_27.clean(5);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
	public void method3376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aSoftLruHashTable_26 = new SoftLruHashTable(arg1);
		this.aSoftLruHashTable_27 = new SoftLruHashTable(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)Lclient!np;")
	public Class164 method3378(@OriginalArg(1) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_26;
		@Pc(16) Class164 local16;
		synchronized (this.aSoftLruHashTable_26) {
			local16 = (Class164) this.aSoftLruHashTable_26.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aJs5_49.fetchFile(36, arg0);
		local16 = new Class164();
		local16.anInt4430 = arg0;
		local16.aClass125_2 = this;
		if (local33 != null) {
			local16.method4181(new Buffer(local33));
		}
		local16.method4186();
		@Pc(65) SoftLruHashTable local65 = this.aSoftLruHashTable_26;
		synchronized (this.aSoftLruHashTable_26) {
			this.aSoftLruHashTable_26.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
	public void method3379() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_26;
		synchronized (this.aSoftLruHashTable_26) {
			this.aSoftLruHashTable_26.clear();
		}
		local2 = this.aSoftLruHashTable_27;
		synchronized (this.aSoftLruHashTable_27) {
			this.aSoftLruHashTable_27.clear();
		}
	}
}
