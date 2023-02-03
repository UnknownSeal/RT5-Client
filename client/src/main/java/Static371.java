import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!vo", name = "y", descriptor = "Lclient!jd;")
	public static Sprite aSprite_20;

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
	public static int anInt7014;

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString68 = null;

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "Lclient!h;")
	public static final Class89 aClass89_243 = new Class89(89, 6);

	@OriginalMember(owner = "client!vo", name = "z", descriptor = "Lclient!h;")
	public static final Class89 aClass89_244 = new Class89(33, 15);

	@OriginalMember(owner = "client!vo", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray66 = new String[100];

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIZLclient!nk;)V")
	public static void method6255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Component arg3) {
		@Pc(8) int local8 = arg3.width;
		@Pc(11) int local11 = arg3.height;
		if (arg3.widthMode == 0) {
			arg3.width = arg3.anInt4294;
		} else if (arg3.widthMode == 1) {
			arg3.width = arg1 - arg3.anInt4294;
		} else if (arg3.widthMode == 2) {
			arg3.width = arg1 * arg3.anInt4294 >> 14;
		}
		if (arg3.heightMode == 0) {
			arg3.height = arg3.anInt4289;
		} else if (arg3.heightMode == 1) {
			arg3.height = arg0 - arg3.anInt4289;
		} else if (arg3.heightMode == 2) {
			arg3.height = arg0 * arg3.anInt4289 >> 14;
		}
		if (arg3.widthMode == 4) {
			arg3.width = arg3.height * arg3.anInt4243 / arg3.anInt4291;
		}
		if (arg3.heightMode == 4) {
			arg3.height = arg3.anInt4291 * arg3.width / arg3.anInt4243;
		}
		if (Static18.qaOpTest && (Static45.getServerActiveProperties(arg3).anInt1758 != 0 || arg3.type == 0)) {
			if (arg3.height < 5 && arg3.width < 5) {
				arg3.height = 5;
				arg3.width = 5;
			} else {
				if (arg3.width <= 0) {
					arg3.width = 5;
				}
				if (arg3.height <= 0) {
					arg3.height = 5;
				}
			}
		}
		if (arg3.anInt4273 == Static199.anInt5755) {
			Static20.aComponent_1 = arg3;
		}
		if (arg2 && arg3.onResize != null && (arg3.width != local8 || local11 != arg3.height)) {
			@Pc(191) HookRequest local191 = new HookRequest();
			local191.source = arg3;
			local191.arguments = arg3.onResize;
			Static274.A_LINKED_LIST___30.addTail(local191);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(JILclient!wm;)V")
	public static void method6256(@OriginalArg(0) long arg0, @OriginalArg(2) Class19 arg1) {
		Static116.anInt2360 = 0;
		Static336.anInt6313 = Static311.anInt5809;
		Static311.anInt5809 = 0;
		@Pc(16) long local16 = MonotonicClock.currentTimeMillis();
		for (@Pc(21) Class12_Sub5 local21 = (Class12_Sub5) Static131.aClass36_4.method1415(); local21 != null; local21 = (Class12_Sub5) Static131.aClass36_4.method1420()) {
			if (local21.method4351(arg1, arg0)) {
				Static116.anInt2360++;
			}
		}
		if (Static289.aBoolean391 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static131.aClass36_4.method1419() + ", running: " + Static116.anInt2360 + ". Particles: " + Static311.anInt5809 + ". Time taken: " + (MonotonicClock.currentTimeMillis() - local16) + "ms");
		}
	}

}
