import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class202 {

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
	public int anInt5669;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "Z")
	public boolean aBoolean400 = false;

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "Lclient!hu;")
	private SoftLruHashTable aSoftLruHashTable_45 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "Lclient!hu;")
	public final SoftLruHashTable aSoftLruHashTable_46 = new SoftLruHashTable(500);

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "Lclient!hu;")
	public final SoftLruHashTable aSoftLruHashTable_47 = new SoftLruHashTable(30);

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "Lclient!hu;")
	public final SoftLruHashTable aSoftLruHashTable_48 = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "Lclient!r;")
	private final Js5 aJs5_79;

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "Z")
	public boolean aBoolean401;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "Lclient!r;")
	public final Js5 aJs5_78;

	static {
		new LocalisedText("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!dn;IZLclient!r;Lclient!r;)V")
	public Class202(@OriginalArg(0) GameType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Js5 arg3, @OriginalArg(4) Js5 arg4) {
		this.aJs5_79 = arg3;
		this.aBoolean401 = arg2;
		this.aJs5_78 = arg4;
		if (this.aJs5_79 != null) {
			@Pc(47) int local47 = this.aJs5_79.capacity() - 1;
			this.aJs5_79.getGroupCapacity(local47);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
	public void method5154(@OriginalArg(0) int arg0) {
		this.anInt5669 = arg0;
		@Pc(9) SoftLruHashTable local9 = this.aSoftLruHashTable_46;
		synchronized (this.aSoftLruHashTable_46) {
			this.aSoftLruHashTable_46.clear();
		}
		local9 = this.aSoftLruHashTable_47;
		synchronized (this.aSoftLruHashTable_47) {
			this.aSoftLruHashTable_47.clear();
		}
		local9 = this.aSoftLruHashTable_48;
		synchronized (this.aSoftLruHashTable_48) {
			this.aSoftLruHashTable_48.clear();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BZ)V")
	public void setAllowMembers(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean401) {
			this.aBoolean401 = arg0;
			this.method5158();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
	public void method5157() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_45;
		synchronized (this.aSoftLruHashTable_45) {
			this.aSoftLruHashTable_45.method2621();
		}
		local2 = this.aSoftLruHashTable_46;
		synchronized (this.aSoftLruHashTable_46) {
			this.aSoftLruHashTable_46.method2621();
		}
		local2 = this.aSoftLruHashTable_47;
		synchronized (this.aSoftLruHashTable_47) {
			this.aSoftLruHashTable_47.method2621();
		}
		local2 = this.aSoftLruHashTable_48;
		synchronized (this.aSoftLruHashTable_48) {
			this.aSoftLruHashTable_48.method2621();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public void method5158() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_45;
		synchronized (this.aSoftLruHashTable_45) {
			this.aSoftLruHashTable_45.clear();
		}
		local2 = this.aSoftLruHashTable_46;
		synchronized (this.aSoftLruHashTable_46) {
			this.aSoftLruHashTable_46.clear();
		}
		local2 = this.aSoftLruHashTable_47;
		synchronized (this.aSoftLruHashTable_47) {
			this.aSoftLruHashTable_47.clear();
		}
		local2 = this.aSoftLruHashTable_48;
		synchronized (this.aSoftLruHashTable_48) {
			this.aSoftLruHashTable_48.clear();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)V")
	public void method5159(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean400) {
			this.aBoolean400 = arg0;
			this.method5158();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)V")
	public void method5160(@OriginalArg(0) int arg0) {
		this.aSoftLruHashTable_45 = new SoftLruHashTable(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V")
	public void method5161() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_45;
		synchronized (this.aSoftLruHashTable_45) {
			this.aSoftLruHashTable_45.clean(5);
		}
		local6 = this.aSoftLruHashTable_46;
		synchronized (this.aSoftLruHashTable_46) {
			this.aSoftLruHashTable_46.clean(5);
		}
		local6 = this.aSoftLruHashTable_47;
		synchronized (this.aSoftLruHashTable_47) {
			this.aSoftLruHashTable_47.clean(5);
		}
		local6 = this.aSoftLruHashTable_48;
		synchronized (this.aSoftLruHashTable_48) {
			this.aSoftLruHashTable_48.clean(5);
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(IB)Lclient!ct;")
	public Class41 method5162(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_45;
		@Pc(16) Class41 local16;
		synchronized (this.aSoftLruHashTable_45) {
			local16 = (Class41) this.aSoftLruHashTable_45.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aJs5_79.fetchFile(Static324.method5539(arg0), Static381.method6347(arg0));
		local16 = new Class41();
		local16.anInt1351 = arg0;
		local16.aClass202_1 = this;
		if (local37 != null) {
			local16.method1526(new Buffer(local37));
		}
		local16.method1516();
		if (local16.aBoolean105) {
			local16.anInt1324 = 0;
			local16.aBoolean114 = false;
		}
		if (!this.aBoolean401 && local16.aBoolean111) {
			local16.anIntArray96 = null;
			local16.aStringArray10 = null;
		}
		@Pc(91) SoftLruHashTable local91 = this.aSoftLruHashTable_45;
		synchronized (this.aSoftLruHashTable_45) {
			this.aSoftLruHashTable_45.put((long) arg0, local16);
			return local16;
		}
	}
}
