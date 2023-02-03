import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public final class EnumStringEntry extends Node {

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "Ljava/lang/String;")
	public final String value;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public EnumStringEntry(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.value = arg0;
	}
}
