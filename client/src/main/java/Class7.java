import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class7 {

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "Lclient!hu;")
	private final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "Lclient!r;")
	private final Js5 archive;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class7(@OriginalArg(0) GameType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.archive = arg2;
		this.archive.getGroupCapacity(32);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
	public void method241() {
		@Pc(11) SoftLruHashTable local11 = this.types;
		synchronized (this.types) {
			this.types.method2614();
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	public void method242() {
		@Pc(2) SoftLruHashTable local2 = this.types;
		synchronized (this.types) {
			this.types.method2621();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V")
	public void method243() {
		@Pc(2) SoftLruHashTable local2 = this.types;
		synchronized (this.types) {
			this.types.clean(5);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lclient!ti;")
	public BasType method245(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.types;
		@Pc(16) BasType local16;
		synchronized (this.types) {
			local16 = (BasType) this.types.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] data = this.archive.fetchFile(32, arg0);
		local16 = new BasType();
		if (data != null) {
			local16.decode(new Buffer(data));
		}
		@Pc(49) SoftLruHashTable local49 = this.types;
		synchronized (this.types) {
			this.types.put((long) arg0, local16);
			return local16;
		}
	}
}
