import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class ObjTypeList {

	@OriginalMember(owner = "client!sb", name = "Q", descriptor = "Lclient!io;")
	public static ObjTypeList objTypeList;
	@OriginalMember(owner = "client!io", name = "w", descriptor = "I")
	public int anInt2790;

	@OriginalMember(owner = "client!io", name = "m", descriptor = "Lclient!hu;")
	private final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!io", name = "s", descriptor = "Lclient!hu;")
	public final SoftLruHashTable aSoftLruHashTable_22 = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!io", name = "t", descriptor = "Lclient!hs;")
	public final Class97 aClass97_1 = new Class97(250);

	@OriginalMember(owner = "client!io", name = "u", descriptor = "Lclient!dt;")
	private final Class53 aClass53_1 = new Class53();

	@OriginalMember(owner = "client!io", name = "e", descriptor = "Lclient!r;")
	public final Js5 modelsArchive;

	@OriginalMember(owner = "client!io", name = "f", descriptor = "I")
	public final int anInt2781;

	@OriginalMember(owner = "client!io", name = "y", descriptor = "Lclient!be;")
	private final Class18 aClass18_1;

	@OriginalMember(owner = "client!io", name = "r", descriptor = "Lclient!r;")
	private final Js5 objArchive;

	@OriginalMember(owner = "client!io", name = "o", descriptor = "Z")
	private boolean allowMembers;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "I")
	public final int anInt2779;

	@OriginalMember(owner = "client!io", name = "v", descriptor = "[Ljava/lang/String;")
	private final String[] defaultOps;

	@OriginalMember(owner = "client!io", name = "x", descriptor = "[Ljava/lang/String;")
	private final String[] defaultIOps;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!dn;IZLclient!be;Lclient!r;Lclient!r;)V")
	public ObjTypeList(@OriginalArg(0) GameType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class18 arg3, @OriginalArg(4) Js5 arg4, @OriginalArg(5) Js5 arg5) {
		this.modelsArchive = arg5;
		this.anInt2781 = arg1;
		this.aClass18_1 = arg3;
		this.objArchive = arg4;
		this.allowMembers = arg2;
		if (this.objArchive == null) {
			this.anInt2779 = 0;
		} else {
			@Pc(54) int local54 = this.objArchive.capacity() - 1;
			this.anInt2779 = local54 * 256 + this.objArchive.getGroupCapacity(local54);
		}
		this.defaultOps = new String[] { null, null, LocalisedText.TAKE.getLocalisedText(this.anInt2781), null, null };
		this.defaultIOps = new String[] { null, null, null, null, LocalisedText.DROP.getLocalisedText(this.anInt2781) };
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)I")
	public static int getGroupID(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)I")
	public static int getFileID(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V")
	public void method2757() {
		@Pc(6) SoftLruHashTable local6 = this.types;
		synchronized (this.types) {
			this.types.clean(5);
		}
		local6 = this.aSoftLruHashTable_22;
		synchronized (this.aSoftLruHashTable_22) {
			this.aSoftLruHashTable_22.clean(5);
		}
		@Pc(42) Class97 local42 = this.aClass97_1;
		synchronized (this.aClass97_1) {
			this.aClass97_1.method2589();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIILclient!jo;Lclient!wm;III)Lclient!jd;")
	public Class13 method2758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) PlayerAppearance arg2, @OriginalArg(4) Class19 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass53_1.aBoolean128 = arg2 != null;
		this.aClass53_1.anInt1645 = arg6;
		this.aClass53_1.anInt1644 = arg1;
		this.aClass53_1.anInt1639 = arg3.anInt2836;
		this.aClass53_1.anInt1640 = arg4;
		this.aClass53_1.anInt1642 = arg5;
		this.aClass53_1.anInt1641 = arg0;
		return (Class13) this.aClass97_1.method2596(this.aClass53_1);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)Lclient!qf;")
	public ObjType get(@OriginalArg(0) int id) {
		@Pc(8) SoftLruHashTable local8 = this.types;
		@Pc(18) ObjType newType;
		synchronized (this.types) {
			newType = (ObjType) this.types.get((long) id);
		}
		if (newType != null) {
			return newType;
		}
		@Pc(44) byte[] bytes = this.objArchive.fetchFile(getGroupID(id), getFileID(id));
		newType = new ObjType();
		newType.id = id;
		newType.objTypeList = this;
		newType.ops = new String[] { null, null, LocalisedText.TAKE.getLocalisedText(this.anInt2781), null, null };
		newType.iOps = new String[] { null, null, null, null, LocalisedText.DROP.getLocalisedText(this.anInt2781) };
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		newType.postDecode();
		if (newType.certificateTemplate != -1) {
			newType.generateCertificate(this.get(newType.certificateLink), this.get(newType.certificateTemplate));
		}
		if (newType.lentLink != -1) {
			newType.generateLent(this.get(newType.lentLink), this.get(newType.lentTemplate));
		}
		if (!this.allowMembers && newType.members) {
			newType.name = LocalisedText.MEMBERS_OBJECT.getLocalisedText(this.anInt2781);
			newType.iOps = this.defaultIOps;
			newType.anIntArray364 = null;
			newType.team = 0;
			newType.stockMarket = false;
			newType.ops = this.defaultOps;
			if (newType.params != null) {
				@Pc(194) boolean local194 = false;
				for (@Pc(199) Node local199 = newType.params.head(); local199 != null; local199 = newType.params.next()) {
					@Pc(211) Class240 local211 = this.aClass18_1.method565((int) local199.key);
					if (local211.aBoolean476) {
						local199.unlink();
					} else {
						local194 = true;
					}
				}
				if (!local194) {
					newType.params = null;
				}
			}
		}
		@Pc(238) SoftLruHashTable local238 = this.types;
		synchronized (this.types) {
			this.types.put(id, newType);
			return newType;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public void method2760() {
		@Pc(6) Class97 local6 = this.aClass97_1;
		synchronized (this.aClass97_1) {
			this.aClass97_1.method2584();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
	public void clear() {
		@Pc(24) SoftLruHashTable local24 = this.types;
		synchronized (this.types) {
			this.types.clear();
		}
		local24 = this.aSoftLruHashTable_22;
		synchronized (this.aSoftLruHashTable_22) {
			this.aSoftLruHashTable_22.clear();
		}
		@Pc(54) Class97 local54 = this.aClass97_1;
		synchronized (this.aClass97_1) {
			this.aClass97_1.method2584();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZB)V")
	public void setAllowMembers(@OriginalArg(0) boolean allowMembers) {
		if (allowMembers != this.allowMembers) {
			this.allowMembers = allowMembers;
			this.clear();
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V")
	public void method2763() {
		@Pc(6) SoftLruHashTable local6 = this.types;
		synchronized (this.types) {
			this.types.method2621();
		}
		local6 = this.aSoftLruHashTable_22;
		synchronized (this.aSoftLruHashTable_22) {
			this.aSoftLruHashTable_22.method2621();
		}
		@Pc(40) Class97 local40 = this.aClass97_1;
		synchronized (this.aClass97_1) {
			this.aClass97_1.method2590();
		}
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(II)V")
	public void method2765(@OriginalArg(1) int arg0) {
		this.anInt2790 = arg0;
		@Pc(9) SoftLruHashTable local9 = this.aSoftLruHashTable_22;
		synchronized (this.aSoftLruHashTable_22) {
			this.aSoftLruHashTable_22.clear();
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
	public void method2767() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable_22;
		synchronized (this.aSoftLruHashTable_22) {
			this.aSoftLruHashTable_22.clear();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!ur;ILclient!wm;ZIZLclient!jo;ILclient!wm;IB)Lclient!jd;")
	public Class13 method2769(@OriginalArg(0) int arg0, @OriginalArg(1) Class130 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) PlayerAppearance arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class19 arg9, @OriginalArg(10) int arg10) {
		@Pc(22) Class13 local22 = this.method2758(arg8, arg0, arg7, arg3, arg5, arg10, arg2);
		if (local22 != null) {
			return local22;
		}
		@Pc(33) ObjType local33 = this.get(arg0);
		if (arg2 > 1 && local33.countObj != null) {
			@Pc(43) int local43 = -1;
			for (@Pc(45) int local45 = 0; local45 < 10; local45++) {
				if (arg2 >= local33.countCount[local45] && local33.countCount[local45] != 0) {
					local43 = local33.countObj[local45];
				}
			}
			if (local43 != -1) {
				local33 = this.get(local43);
			}
		}
		@Pc(97) int[] local97 = local33.method4780(arg1, arg7, arg3, arg5, arg9, arg8, arg10, arg2, arg6);
		if (local97 == null) {
			return null;
		}
		@Pc(111) Class13 local111;
		if (arg4) {
			local111 = arg9.method2884(local97, 36, 36, 32);
		} else {
			local111 = arg3.method2884(local97, 36, 36, 32);
		}
		if (!arg4) {
			@Pc(127) Class53 local127 = new Class53();
			local127.anInt1639 = arg3.anInt2836;
			local127.aBoolean128 = arg7 != null;
			local127.anInt1641 = arg8;
			local127.anInt1645 = arg2;
			local127.anInt1640 = arg5;
			local127.anInt1642 = arg10;
			local127.anInt1644 = arg0;
			this.aClass97_1.method2583(local127, local111);
		}
		return local111;
	}
}
