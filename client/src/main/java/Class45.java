import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class45 {

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_4 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!df", name = "j", descriptor = "Lclient!r;")
	private final Js5 aJs5_10;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "I")
	public final int anInt1466;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class45(@OriginalArg(0) GameType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs5_10 = arg2;
		this.anInt1466 = this.aJs5_10.method5080(19);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)Lclient!cr;")
	public Class40 method1623(@OriginalArg(1) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_4;
		@Pc(16) Class40 local16;
		synchronized (this.aSoftLruHashTable_4) {
			local16 = (Class40) this.aSoftLruHashTable_4.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aJs5_10.fetchFile(19, arg0);
		local16 = new Class40();
		if (local33 != null) {
			local16.method1468(new Buffer(local33));
		}
		@Pc(54) SoftLruHashTable local54 = this.aSoftLruHashTable_4;
		synchronized (this.aSoftLruHashTable_4) {
			this.aSoftLruHashTable_4.put((long) arg0, local16);
			return local16;
		}
	}
}
