import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class193 {

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "Lclient!r;")
	private final Js5 archive;

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
	public final int capacity;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class193(@OriginalArg(2) Js5 archive) {
		new SoftLruHashTable(64);
		this.archive = archive;
		this.capacity = this.archive.getGroupCapacity(15);
	}
}
