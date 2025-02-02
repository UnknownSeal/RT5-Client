import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class StringNode extends Node {

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "Ljava/lang/String;")
	public final String value;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public StringNode(@OriginalArg(0) String arg0) {
		this.value = arg0;
	}
}
