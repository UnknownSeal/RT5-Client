import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class18 {

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_2 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!r;")
	private final Class197 aClass197_2;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class18(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_2 = arg2;
		if (this.aClass197_2 != null) {
			this.aClass197_2.method5080(11);
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public void method563() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_2;
		synchronized (this.aSoftLruHashTable_2) {
			this.aSoftLruHashTable_2.method2614();
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	public void method564() {
		@Pc(14) SoftLruHashTable local14 = this.aSoftLruHashTable_2;
		synchronized (this.aSoftLruHashTable_2) {
			this.aSoftLruHashTable_2.method2621();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lclient!vp;")
	public Class240 method565(@OriginalArg(1) int arg0) {
		@Pc(11) SoftLruHashTable local11 = this.aSoftLruHashTable_2;
		@Pc(21) Class240 local21;
		synchronized (this.aSoftLruHashTable_2) {
			local21 = (Class240) this.aSoftLruHashTable_2.method2612((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass197_2.fetchFile(11, arg0);
		local21 = new Class240();
		if (local38 != null) {
			local21.method6260(new Buffer(local38));
		}
		@Pc(54) SoftLruHashTable local54 = this.aSoftLruHashTable_2;
		synchronized (this.aSoftLruHashTable_2) {
			this.aSoftLruHashTable_2.method2624((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)V")
	public void method566() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_2;
		synchronized (this.aSoftLruHashTable_2) {
			this.aSoftLruHashTable_2.clean(5);
		}
	}
}
