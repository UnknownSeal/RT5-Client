import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!da", name = "i", descriptor = "I")
	public static int anInt3966 = 0;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "I")
	public static int anInt3971 = 0;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
	public static void method3951(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) DelayedStateChange local12 = Static316.create(5, arg1);
		local12.pushServer();
		local12.anInt2289 = arg0;
	}
}
