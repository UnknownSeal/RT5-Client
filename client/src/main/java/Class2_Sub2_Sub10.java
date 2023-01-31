import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public abstract class Class2_Sub2_Sub10 extends SecondaryNode {

	@OriginalMember(owner = "client!ut", name = "F", descriptor = "Z")
	public boolean aBoolean417;

	@OriginalMember(owner = "client!ut", name = "H", descriptor = "Z")
	public boolean urgent;

	@OriginalMember(owner = "client!ut", name = "E", descriptor = "Z")
	public volatile boolean incomplete = true;

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "(B)[B")
	public abstract byte[] getData();

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)I")
	public abstract int method5650();
}
