import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class55 {

	@OriginalMember(owner = "client!e", name = "c", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_7 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!r;")
	private final Js5 aJs5_17;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!r;")
	public final Js5 aJs5_16;

	static {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			aRectangleArray1[local6] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V")
	public Class55(@OriginalArg(0) GameType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aJs5_17 = arg2;
		this.aJs5_16 = arg3;
		this.aJs5_17.getGroupCapacity(3);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public void method1781() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_7;
		synchronized (this.aSoftLruHashTable_7) {
			this.aSoftLruHashTable_7.method2621();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public void method1782() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_7;
		synchronized (this.aSoftLruHashTable_7) {
			this.aSoftLruHashTable_7.method2614();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Lclient!ge;")
	public Class80 method1784(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_7;
		@Pc(16) Class80 local16;
		synchronized (this.aSoftLruHashTable_7) {
			local16 = (Class80) this.aSoftLruHashTable_7.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aJs5_17.fetchFile(3, arg0);
		local16 = new Class80();
		local16.aClass55_2 = this;
		if (local33 != null) {
			local16.method2271(new Buffer(local33));
		}
		@Pc(57) SoftLruHashTable local57 = this.aSoftLruHashTable_7;
		synchronized (this.aSoftLruHashTable_7) {
			this.aSoftLruHashTable_7.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)V")
	public void method1785() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_7;
		synchronized (this.aSoftLruHashTable_7) {
			this.aSoftLruHashTable_7.clean(5);
		}
	}
}
