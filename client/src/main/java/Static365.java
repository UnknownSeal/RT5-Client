import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!vh", name = "w", descriptor = "[Lclient!tf;")
	public static Class6[] aClass6Array4;

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "[Lclient!oe;")
	public static final Npc[] npcs = new Npc[32768];

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
	public static int anInt6832 = 0;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)I")
	public static int getModelCacheSize() {
		@Pc(5) SoftLruHashTable local5 = Static92.bodyModels;
		synchronized (Static92.bodyModels) {
			return Static92.bodyModels.size();
		}
	}
}
