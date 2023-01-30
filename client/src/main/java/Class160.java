import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class160 {

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_35 = new SoftLruHashTable(16);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Lclient!r;")
	private final Class197 aClass197_62;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class160(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_62 = arg2;
		this.aClass197_62.method5080(30);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V")
	public void method4028() {
		@Pc(11) SoftLruHashTable local11 = this.aSoftLruHashTable_35;
		synchronized (this.aSoftLruHashTable_35) {
			this.aSoftLruHashTable_35.clean(5);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
	public void method4029() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_35;
		synchronized (this.aSoftLruHashTable_35) {
			this.aSoftLruHashTable_35.method2621();
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)Lclient!ie;")
	public Class101 method4030(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_35;
		@Pc(16) Class101 local16;
		synchronized (this.aSoftLruHashTable_35) {
			local16 = (Class101) this.aSoftLruHashTable_35.method2612((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass197_62.fetchFile(30, arg0);
		local16 = new Class101();
		if (local38 != null) {
			local16.method2694(new Buffer(local38));
		}
		@Pc(56) SoftLruHashTable local56 = this.aSoftLruHashTable_35;
		synchronized (this.aSoftLruHashTable_35) {
			this.aSoftLruHashTable_35.method2624((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
	public void method4032() {
		@Pc(7) SoftLruHashTable local7 = this.aSoftLruHashTable_35;
		synchronized (this.aSoftLruHashTable_35) {
			this.aSoftLruHashTable_35.method2614();
		}
	}
}
