import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public final class IntNode extends Node {

	@OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
	public final int value;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
	public IntNode(@OriginalArg(0) int arg0) {
		this.value = arg0;
	}
}
