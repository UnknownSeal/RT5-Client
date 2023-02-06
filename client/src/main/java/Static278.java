import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "Z")
	public static boolean aBoolean377 = false;

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "[Lclient!bp;")
	public static final ParticleEffectorType[] A_PARTICLE_EFFECTOR_TYPE_ARRAY_1 = new ParticleEffectorType[16];

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int hashCode(@OriginalArg(0) String string) {
		@Pc(10) int hash = 0;
		@Pc(8) int length = string.length();
		for (@Pc(12) int i = 0; i < length; i++) {
			hash = (hash << 5) + Static234.encodeChar(string.charAt(i)) - hash;
		}
		return hash;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
	public static void method4722(@OriginalArg(1) int arg0) {
		@Pc(12) DelayedStateChange local12 = DelayedStateChange.create(6, arg0);
		local12.pushClient();
	}
}
