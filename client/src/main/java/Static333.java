import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "Lclient!jd;")
	public static Sprite aSprite_21;

	@OriginalMember(owner = "client!tg", name = "K", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray67;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "Lclient!hu;")
	public static final SoftLruHashTable A_SOFT_LRU_HASH_TABLE___65 = new SoftLruHashTable(20);

	@OriginalMember(owner = "client!tg", name = "I", descriptor = "Lclient!s;")
	public static final Class210 aClass210_17 = new Class210(10, 6);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Z")
	public static boolean method6317() {
		return Static14.aBoolean24;
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)I")
	public static int getTargetZoom() {
		if ((double) Static344.targetZoom == 3.0D) {
			return 37;
		} else if ((double) Static344.targetZoom == 4.0D) {
			return 50;
		} else if ((double) Static344.targetZoom == 6.0D) {
			return 75;
		} else if ((double) Static344.targetZoom == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!r;)I")
	public static int getReady(@OriginalArg(1) Js5 archive) {
		@Pc(5) int ready = 0;
		if (archive.isFileReady(Static75.anInt1736)) {
			ready++;
		}
		if (archive.isFileReady(Static265.anInt4856)) {
			ready++;
		}
		return ready;
	}
}
