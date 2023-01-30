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
	public static int method6116() {
		@Pc(5) SoftLruHashTable local5 = Static92.A_SOFT_LRU_HASH_TABLE___9;
		synchronized (Static92.A_SOFT_LRU_HASH_TABLE___9) {
			return Static92.A_SOFT_LRU_HASH_TABLE___9.method2613();
		}
	}
}
