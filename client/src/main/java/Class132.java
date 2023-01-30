import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class132 {

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_29 = new SoftLruHashTable(256);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "Lclient!r;")
	private final Js5 aJs5_53;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class132(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs5_53 = arg2;
		this.aJs5_53.method5080(26);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BI)Lclient!ck;")
	public Class2_Sub2_Sub3 method3470(@OriginalArg(1) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_29;
		@Pc(16) Class2_Sub2_Sub3 local16;
		synchronized (this.aSoftLruHashTable_29) {
			local16 = (Class2_Sub2_Sub3) this.aSoftLruHashTable_29.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aJs5_53.fetchFile(26, arg0);
		local16 = new Class2_Sub2_Sub3();
		if (local38 != null) {
			local16.method1345(new Buffer(local38));
		}
		@Pc(54) SoftLruHashTable local54 = this.aSoftLruHashTable_29;
		synchronized (this.aSoftLruHashTable_29) {
			this.aSoftLruHashTable_29.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(BI)V")
	public void method3471() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_29;
		synchronized (this.aSoftLruHashTable_29) {
			this.aSoftLruHashTable_29.clean(5);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
	public void method3472() {
		@Pc(11) SoftLruHashTable local11 = this.aSoftLruHashTable_29;
		synchronized (this.aSoftLruHashTable_29) {
			this.aSoftLruHashTable_29.method2621();
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
	public void method3474() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_29;
		synchronized (this.aSoftLruHashTable_29) {
			this.aSoftLruHashTable_29.method2614();
		}
	}
}
