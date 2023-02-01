import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class MixerListener extends Node {

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
	public int remaining;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
	public abstract void onUnlink();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!fi;)I")
	public abstract int execute(@OriginalArg(0) MixerPcmStream stream);
}
