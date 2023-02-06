import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class SkyBoxTypeList {

	@OriginalMember(owner = "client!ai", name = "R", descriptor = "Lclient!sj;")
	public static SkyBoxTypeList skyBoxTypeList;
	@OriginalMember(owner = "client!sj", name = "c", descriptor = "Lclient!hu;")
	private final SoftLruHashTable types = new SoftLruHashTable(16);

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Lclient!r;")
	private final Js5 archive;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public SkyBoxTypeList(@OriginalArg(2) Js5 archive) {
		this.archive = archive;
		this.archive.getGroupCapacity(29);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	public void method5421() {
		@Pc(10) SoftLruHashTable local10 = this.types;
		synchronized (this.types) {
			this.types.method2621();
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V")
	public void method5422() {
		@Pc(2) SoftLruHashTable local2 = this.types;
		synchronized (this.types) {
			this.types.clean(5);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILclient!ng;IB)Lclient!dd;")
	public SkyBox getSkyBox(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) SkyBoxSphereTypeList arg3, @OriginalArg(4) int arg4) {
		@Pc(7) SkyBoxSphere[] local7 = null;
		@Pc(19) SkyBoxType local19 = this.get(arg0);
		if (local19.spheres != null) {
			local7 = new SkyBoxSphere[local19.spheres.length];
			for (@Pc(29) int i = 0; i < local7.length; i++) {
				@Pc(41) SkyBoxSphereType sphereType = arg3.get(local19.spheres[i]);
				local7[i] = new SkyBoxSphere(sphereType.anInt2692, sphereType.anInt2686, sphereType.anInt2695, sphereType.anInt2698, sphereType.anInt2693, sphereType.anInt2690, sphereType.anInt2687, sphereType.aBoolean191);
			}
		}
		return new SkyBox(local19.textureID, local7, local19.defaultSphereIndex, arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
	public void method5425() {
		@Pc(12) SoftLruHashTable local12 = this.types;
		synchronized (this.types) {
			this.types.clear();
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)Lclient!wa;")
	private SkyBoxType get(@OriginalArg(0) int id) {
		@Pc(24) SkyBoxType type;
		synchronized (this.types) {
			type = (SkyBoxType) this.types.get(id);
		}
		if (type != null) {
			return type;
		}
		@Pc(41) byte[] bytes = this.archive.fetchFile(29, id);
		type = new SkyBoxType();
		if (bytes != null) {
			type.decode(new Buffer(bytes));
		}
		synchronized (this.types) {
			this.types.put(id, type);
			return type;
		}
	}
}
