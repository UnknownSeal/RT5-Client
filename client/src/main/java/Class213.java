import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class213 {

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_52 = new SoftLruHashTable(16);

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Lclient!r;")
	private final Js5 aJs5_83;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class213(@OriginalArg(0) GameType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs5_83 = arg2;
		this.aJs5_83.getGroupCapacity(29);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	public void method5421() {
		@Pc(10) SoftLruHashTable local10 = this.aSoftLruHashTable_52;
		synchronized (this.aSoftLruHashTable_52) {
			this.aSoftLruHashTable_52.method2621();
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V")
	public void method5422() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_52;
		synchronized (this.aSoftLruHashTable_52) {
			this.aSoftLruHashTable_52.clean(5);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILclient!ng;IB)Lclient!dd;")
	public Class43 method5423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class160 arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class112[] local7 = null;
		@Pc(19) Class245 local19 = this.method5426(arg0);
		if (local19.anIntArray484 != null) {
			local7 = new Class112[local19.anIntArray484.length];
			for (@Pc(29) int local29 = 0; local29 < local7.length; local29++) {
				@Pc(41) Class101 local41 = arg3.method4030(local19.anIntArray484[local29]);
				local7[local29] = new Class112(local41.anInt2692, local41.anInt2686, local41.anInt2695, local41.anInt2698, local41.anInt2693, local41.anInt2690, local41.anInt2687, local41.aBoolean191);
			}
		}
		return new Class43(local19.anInt7072, local7, local19.anInt7078, arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
	public void method5425() {
		@Pc(12) SoftLruHashTable local12 = this.aSoftLruHashTable_52;
		synchronized (this.aSoftLruHashTable_52) {
			this.aSoftLruHashTable_52.method2614();
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)Lclient!wa;")
	private Class245 method5426(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_52;
		@Pc(24) Class245 local24;
		synchronized (this.aSoftLruHashTable_52) {
			local24 = (Class245) this.aSoftLruHashTable_52.get((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(41) byte[] local41 = this.aJs5_83.fetchFile(29, arg0);
		local24 = new Class245();
		if (local41 != null) {
			local24.method6314(new Buffer(local41));
		}
		local6 = this.aSoftLruHashTable_52;
		synchronized (this.aSoftLruHashTable_52) {
			this.aSoftLruHashTable_52.put((long) arg0, local24);
			return local24;
		}
	}
}
