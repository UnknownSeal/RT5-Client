import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class241 {

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_64 = new SoftLruHashTable(128);

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "Lclient!r;")
	private final Class197 aClass197_93;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class241(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_93 = arg2;
		this.aClass197_93.method5080(1);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	public void method6267() {
		@Pc(14) SoftLruHashTable local14 = this.aSoftLruHashTable_64;
		synchronized (this.aSoftLruHashTable_64) {
			this.aSoftLruHashTable_64.method2621();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB)V")
	public void method6268() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_64;
		synchronized (this.aSoftLruHashTable_64) {
			this.aSoftLruHashTable_64.clean(5);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public void method6269() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_64;
		synchronized (this.aSoftLruHashTable_64) {
			this.aSoftLruHashTable_64.method2614();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)Lclient!tq;")
	public Class225 method6270(@OriginalArg(1) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_64;
		@Pc(16) Class225 local16;
		synchronized (this.aSoftLruHashTable_64) {
			local16 = (Class225) this.aSoftLruHashTable_64.method2612((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_93.fetchFile(1, arg0);
		local16 = new Class225();
		if (local33 != null) {
			local16.method5772(new Buffer(local33));
		}
		@Pc(49) SoftLruHashTable local49 = this.aSoftLruHashTable_64;
		synchronized (this.aSoftLruHashTable_64) {
			this.aSoftLruHashTable_64.method2624((long) arg0, local16);
			return local16;
		}
	}
}
