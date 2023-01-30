import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class233 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_60 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "Lclient!r;")
	private final Js5 aJs5_91;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class233(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs5_91 = arg2;
		if (this.aJs5_91 != null) {
			this.aJs5_91.method5080(35);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public void method5880() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_60;
		synchronized (this.aSoftLruHashTable_60) {
			this.aSoftLruHashTable_60.method2614();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
	public void method5881() {
		@Pc(10) SoftLruHashTable local10 = this.aSoftLruHashTable_60;
		synchronized (this.aSoftLruHashTable_60) {
			this.aSoftLruHashTable_60.method2621();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V")
	public void method5883() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_60;
		synchronized (this.aSoftLruHashTable_60) {
			this.aSoftLruHashTable_60.clean(5);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)Lclient!ud;")
	public Class230 method5884(@OriginalArg(1) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_60;
		@Pc(16) Class230 local16;
		synchronized (this.aSoftLruHashTable_60) {
			local16 = (Class230) this.aSoftLruHashTable_60.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aJs5_91.fetchFile(35, arg0);
		local16 = new Class230();
		if (local33 != null) {
			local16.method5835(new Buffer(local33));
		}
		local16.method5833();
		@Pc(52) SoftLruHashTable local52 = this.aSoftLruHashTable_60;
		synchronized (this.aSoftLruHashTable_60) {
			this.aSoftLruHashTable_60.put((long) arg0, local16);
			return local16;
		}
	}
}
