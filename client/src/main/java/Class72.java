import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class72 {

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "Lclient!hu;")
	private final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
	public int anInt2060 = 0;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Lclient!r;")
	private final Js5 aJs5_22;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
	public final int anInt2059;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class72(@OriginalArg(0) GameType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs5_22 = arg2;
		this.anInt2059 = this.aJs5_22.getGroupCapacity(4);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)V")
	public void clean() {
		@Pc(10) SoftLruHashTable local10 = this.types;
		synchronized (this.types) {
			this.types.clean(5);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	public void method2103() {
		@Pc(6) SoftLruHashTable local6 = this.types;
		synchronized (this.types) {
			this.types.method2614();
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)Lclient!mg;")
	public Class148 method2105(@OriginalArg(1) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.types;
		@Pc(16) Class148 local16;
		synchronized (this.types) {
			local16 = (Class148) this.types.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aJs5_22.fetchFile(4, arg0);
		local16 = new Class148();
		local16.aClass72_4 = this;
		local16.anInt3756 = arg0;
		if (local41 != null) {
			local16.method3717(new Buffer(local41));
		}
		local16.method3715();
		@Pc(66) SoftLruHashTable local66 = this.types;
		synchronized (this.types) {
			this.types.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public void method2108() {
		@Pc(6) SoftLruHashTable local6 = this.types;
		synchronized (this.types) {
			this.types.method2621();
		}
	}
}
