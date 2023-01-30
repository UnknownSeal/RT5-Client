import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class211 {

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
	public int anInt5958;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_50 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Lclient!hu;")
	public final SoftLruHashTable aSoftLruHashTable_51 = new SoftLruHashTable(30);

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "Lclient!r;")
	private final Class197 aClass197_82;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!r;")
	public final Class197 aClass197_81;

	static {
		new LocalisedText(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
		new LocalisedText("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V")
	public Class211(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2, @OriginalArg(3) Class197 arg3) {
		this.aClass197_82 = arg2;
		this.aClass197_81 = arg3;
		@Pc(26) int local26 = this.aClass197_82.method5091() - 1;
		this.aClass197_82.method5080(local26);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Lclient!hf;")
	public Class91 method5406(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_50;
		@Pc(25) Class91 local25;
		synchronized (this.aSoftLruHashTable_50) {
			local25 = (Class91) this.aSoftLruHashTable_50.method2612((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(48) byte[] local48 = this.aClass197_82.fetchFile(Static117.method2370(arg0), Static298.method2427(arg0));
		local25 = new Class91();
		local25.aClass211_1 = this;
		local25.anInt2453 = arg0;
		if (local48 != null) {
			local25.method2430(new Buffer(local48));
		}
		local6 = this.aSoftLruHashTable_50;
		synchronized (this.aSoftLruHashTable_50) {
			this.aSoftLruHashTable_50.method2624((long) arg0, local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public void method5407() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_50;
		synchronized (this.aSoftLruHashTable_50) {
			this.aSoftLruHashTable_50.method2621();
		}
		local2 = this.aSoftLruHashTable_51;
		synchronized (this.aSoftLruHashTable_51) {
			this.aSoftLruHashTable_51.method2621();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
	public void method5409() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_50;
		synchronized (this.aSoftLruHashTable_50) {
			this.aSoftLruHashTable_50.method2614();
		}
		local6 = this.aSoftLruHashTable_51;
		synchronized (this.aSoftLruHashTable_51) {
			this.aSoftLruHashTable_51.method2614();
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V")
	public void method5410() {
		@Pc(14) SoftLruHashTable local14 = this.aSoftLruHashTable_50;
		synchronized (this.aSoftLruHashTable_50) {
			this.aSoftLruHashTable_50.clean(5);
		}
		local14 = this.aSoftLruHashTable_51;
		synchronized (this.aSoftLruHashTable_51) {
			this.aSoftLruHashTable_51.clean(5);
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)V")
	public void method5411(@OriginalArg(1) int arg0) {
		this.anInt5958 = arg0;
		@Pc(13) SoftLruHashTable local13 = this.aSoftLruHashTable_51;
		synchronized (this.aSoftLruHashTable_51) {
			this.aSoftLruHashTable_51.method2614();
		}
	}
}
