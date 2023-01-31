import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Js5NetRequest extends Class2_Sub2_Sub10 {

	@OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
	public int anInt3083;

	@OriginalMember(owner = "client!jj", name = "Q", descriptor = "B")
	public byte trailerLength;

	@OriginalMember(owner = "client!jj", name = "T", descriptor = "Lclient!bt;")
	public Buffer data;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] getData() {
		if (super.incomplete || this.data.bytes.length - this.trailerLength > this.data.offset) {
			throw new RuntimeException();
		}
		return this.data.bytes;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)I")
	@Override
	public int method5650() {
		return this.data == null ? 0 : this.data.offset * 100 / (this.data.bytes.length - this.trailerLength);
	}
}
