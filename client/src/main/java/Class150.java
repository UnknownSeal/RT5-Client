import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class150 {

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_32 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "Lclient!hu;")
	public final SoftLruHashTable aSoftLruHashTable_33 = new SoftLruHashTable(2);

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "Lclient!r;")
	public final Class197 aClass197_56;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "Lclient!r;")
	private final Class197 aClass197_55;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V")
	public Class150(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2, @OriginalArg(3) Class197 arg3) {
		this.aClass197_56 = arg3;
		this.aClass197_55 = arg2;
		this.aClass197_55.method5080(33);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	public void method3727() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_32;
		synchronized (this.aSoftLruHashTable_32) {
			this.aSoftLruHashTable_32.method2621();
		}
		local2 = this.aSoftLruHashTable_33;
		synchronized (this.aSoftLruHashTable_33) {
			this.aSoftLruHashTable_33.method2621();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Lclient!te;")
	public Class220 method3730(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_32;
		@Pc(16) Class220 local16;
		synchronized (this.aSoftLruHashTable_32) {
			local16 = (Class220) this.aSoftLruHashTable_32.method2612((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_55.fetchFile(33, arg0);
		local16 = new Class220();
		local16.aClass150_4 = this;
		if (local33 != null) {
			local16.method5660(new Buffer(local33));
		}
		@Pc(60) SoftLruHashTable local60 = this.aSoftLruHashTable_32;
		synchronized (this.aSoftLruHashTable_32) {
			this.aSoftLruHashTable_32.method2624((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(BI)V")
	public void method3731() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_32;
		synchronized (this.aSoftLruHashTable_32) {
			this.aSoftLruHashTable_32.clean(5);
		}
		local2 = this.aSoftLruHashTable_33;
		synchronized (this.aSoftLruHashTable_33) {
			this.aSoftLruHashTable_33.clean(5);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	public void method3732() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_32;
		synchronized (this.aSoftLruHashTable_32) {
			this.aSoftLruHashTable_32.method2614();
		}
		local6 = this.aSoftLruHashTable_33;
		synchronized (this.aSoftLruHashTable_33) {
			this.aSoftLruHashTable_33.method2614();
		}
	}
}
