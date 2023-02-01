import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class HookRequest extends Node {

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "[Ljava/lang/Object;")
	public Object[] arguments;

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "Lclient!nk;")
	public Component source;

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
	public int keyCode;

	@OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
	public int keyChar;

	@OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
	public int mouseX;

	@OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
	public int mouseY;

	@OriginalMember(owner = "client!fn", name = "C", descriptor = "Lclient!nk;")
	public Component target;

	@OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
	public int op;

	@OriginalMember(owner = "client!fn", name = "G", descriptor = "Ljava/lang/String;")
	public String opBase;

	@OriginalMember(owner = "client!fn", name = "H", descriptor = "Z")
	public boolean aBoolean157;
}
