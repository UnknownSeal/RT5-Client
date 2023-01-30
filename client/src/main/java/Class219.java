import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class219 {

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
	public int anInt6108;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "Lclient!hu;")
	private final SoftLruHashTable aSoftLruHashTable_53 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Lclient!hu;")
	public final SoftLruHashTable aSoftLruHashTable_54 = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "Lclient!hu;")
	public final SoftLruHashTable aSoftLruHashTable_55 = new SoftLruHashTable(5);

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "Lclient!r;")
	private final Js5 aJs5_87;

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "Lclient!r;")
	public final Js5 aJs5_88;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Z")
	public boolean aBoolean410;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!dn;IZLclient!r;Lclient!r;)V")
	public Class219(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Js5 arg3, @OriginalArg(4) Js5 arg4) {
		this.aJs5_87 = arg3;
		this.aJs5_88 = arg4;
		this.aBoolean410 = arg2;
		if (this.aJs5_87 != null) {
			@Pc(38) int local38 = this.aJs5_87.method5091() - 1;
			this.aJs5_87.method5080(local38);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Lclient!fk;")
	public NpcType get(@OriginalArg(0) int id) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_53;
		@Pc(16) NpcType local16;
		synchronized (this.aSoftLruHashTable_53) {
			local16 = (NpcType) this.aSoftLruHashTable_53.get((long) id);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] data = this.aJs5_87.fetchFile(Static65.method1732(id), Static349.method5830(id));
		local16 = new NpcType();
		local16.aClass219_2 = this;
		local16.anInt2048 = id;
		if (data != null) {
			local16.decode(new Buffer(data));
		}
		local16.method2089();
		@Pc(67) SoftLruHashTable local67 = this.aSoftLruHashTable_53;
		synchronized (this.aSoftLruHashTable_53) {
			this.aSoftLruHashTable_53.put((long) id, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	public void method5570() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_53;
		synchronized (this.aSoftLruHashTable_53) {
			this.aSoftLruHashTable_53.method2614();
		}
		local2 = this.aSoftLruHashTable_54;
		synchronized (this.aSoftLruHashTable_54) {
			this.aSoftLruHashTable_54.method2614();
		}
		local2 = this.aSoftLruHashTable_55;
		synchronized (this.aSoftLruHashTable_55) {
			this.aSoftLruHashTable_55.method2614();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
	public void method5571() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable_54;
		synchronized (this.aSoftLruHashTable_54) {
			this.aSoftLruHashTable_54.method2614();
		}
		local6 = this.aSoftLruHashTable_55;
		synchronized (this.aSoftLruHashTable_55) {
			this.aSoftLruHashTable_55.method2614();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZB)V")
	public void setAllowMembers(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean410) {
			this.aBoolean410 = arg0;
			this.method5570();
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
	public void method5574() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_53;
		synchronized (this.aSoftLruHashTable_53) {
			this.aSoftLruHashTable_53.clean(5);
		}
		local2 = this.aSoftLruHashTable_54;
		synchronized (this.aSoftLruHashTable_54) {
			this.aSoftLruHashTable_54.clean(5);
		}
		local2 = this.aSoftLruHashTable_55;
		synchronized (this.aSoftLruHashTable_55) {
			this.aSoftLruHashTable_55.clean(5);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)V")
	public void method5577(@OriginalArg(1) int arg0) {
		this.anInt6108 = arg0;
		@Pc(9) SoftLruHashTable local9 = this.aSoftLruHashTable_54;
		synchronized (this.aSoftLruHashTable_54) {
			this.aSoftLruHashTable_54.method2614();
		}
		local9 = this.aSoftLruHashTable_55;
		synchronized (this.aSoftLruHashTable_55) {
			this.aSoftLruHashTable_55.method2614();
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
	public void method5578() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_53;
		synchronized (this.aSoftLruHashTable_53) {
			this.aSoftLruHashTable_53.method2621();
		}
		local2 = this.aSoftLruHashTable_54;
		synchronized (this.aSoftLruHashTable_54) {
			this.aSoftLruHashTable_54.method2621();
		}
		local2 = this.aSoftLruHashTable_55;
		synchronized (this.aSoftLruHashTable_55) {
			this.aSoftLruHashTable_55.method2621();
		}
	}
}
