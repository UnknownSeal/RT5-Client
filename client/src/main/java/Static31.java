import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "Lclient!h;")
	public static final Class89 aClass89_27 = new Class89(76, -1);

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "F")
	public static float aFloat28 = 1024.0F;

	@OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
	public static int anInt751 = 0;

	@OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
	public static int anInt752 = -1;

	@OriginalMember(owner = "client!bp", name = "y", descriptor = "Z")
	public static boolean aBoolean68 = false;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)V")
	public static void method944() {
		@Pc(5) SoftLruHashTable local5 = Static92.bodyModels;
		synchronized (Static92.bodyModels) {
			Static92.bodyModels.clean(5);
		}
		local5 = Static349.A_SOFT_LRU_HASH_TABLE___58;
		synchronized (Static349.A_SOFT_LRU_HASH_TABLE___58) {
			Static349.A_SOFT_LRU_HASH_TABLE___58.clean(5);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZLjava/awt/Component;I)Lclient!lh;")
	public static Class119 method948(@OriginalArg(1) Component arg0) {
		return new Class119_Sub1(arg0, true);
	}
}
