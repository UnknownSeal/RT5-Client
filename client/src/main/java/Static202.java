import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

    @OriginalMember(owner = "client!lq", name = "J", descriptor = "[I")
	public static int[] anIntArray220;

	@OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
	public static int anInt3714 = -1;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method3675(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(45) StringBuffer local45 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local45.append(Static349.aCharArray6[(int) (local52 - arg0 * 37L)]);
			}
			return local45.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V")
	public static void method3677(@OriginalArg(1) int arg0) {
		Static25.anInt648 = arg0;
		Static48.A_SOFT_LRU_HASH_TABLE___3.clear();
	}
}
