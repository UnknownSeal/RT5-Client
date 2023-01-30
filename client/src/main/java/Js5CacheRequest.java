import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Js5CacheRequest extends Class2_Sub2_Sub10 {

	@OriginalMember(owner = "client!td", name = "L", descriptor = "Lclient!rq;")
	public Cache cache;

	@OriginalMember(owner = "client!td", name = "W", descriptor = "I")
	public int type;

	@OriginalMember(owner = "client!td", name = "Z", descriptor = "[B")
	public byte[] data;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)I")
	@Override
	public int method5650() {
		return super.aBoolean416 ? 0 : 100;
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] method5647() {
		if (super.aBoolean416) {
			throw new RuntimeException();
		}
		return this.data;
	}
}
