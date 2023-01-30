import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class51 {

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_6 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "Lclient!r;")
	private final Js5 aJs5_15;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class51(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs5_15 = arg2;
		this.aJs5_15.method5080(5);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)Lclient!hl;")
	public Class2_Sub2_Sub8 method1706(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_6;
		@Pc(16) Class2_Sub2_Sub8 local16;
		synchronized (this.aSoftLruHashTable_6) {
			local16 = (Class2_Sub2_Sub8) this.aSoftLruHashTable_6.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aJs5_15.fetchFile(5, arg0);
		local16 = new Class2_Sub2_Sub8();
		if (local38 != null) {
			local16.method2501(new Buffer(local38));
		}
		@Pc(54) SoftLruHashTable local54 = this.aSoftLruHashTable_6;
		synchronized (this.aSoftLruHashTable_6) {
			this.aSoftLruHashTable_6.put((long) arg0, local16);
			return local16;
		}
	}
}
