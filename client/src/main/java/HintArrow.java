import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public final class HintArrow {

	@OriginalMember(owner = "client!go", name = "a", descriptor = "I")
	public int anInt2349;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "I")
	public int xOffset;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "I")
	public int anInt2352;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "I")
	public int target;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "I")
	public int type;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	public int zOffset;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "I")
	public int anInt2359;

	@OriginalMember(owner = "client!go", name = "r", descriptor = "I")
	public int anInt2362;

	@OriginalMember(owner = "client!go", name = "t", descriptor = "I")
	public int headIcon;

	@OriginalMember(owner = "client!go", name = "u", descriptor = "I")
	public int anInt2364;

	@OriginalMember(owner = "client!go", name = "o", descriptor = "I")
	public int model = -1;

	static {
		new LocalisedText("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}
}
