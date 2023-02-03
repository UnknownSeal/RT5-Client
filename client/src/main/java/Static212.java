import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
	public static int anInt3788;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
	public static int inTutorialIsland = 0;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "Lclient!qg;")
	public static final Packet inboundBuffer = new Packet(5000);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!nk;III)V")
	public static void method3725(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class78 local8 = arg0.method4108(Static190.aClass19_8);
		if (local8 == null) {
			return;
		}
		Static190.aClass19_8.method2895(arg1, arg2, arg1 + arg0.width, arg2 + arg0.height);
		if (Static146.anInt2703 >= 3) {
			Static190.aClass19_8.method2811(local8, arg1, arg2);
		} else {
			Static12.aSprite_2.method6397((float) arg1 + (float) arg0.width / 2.0F, (float) arg2 + (float) arg0.height / 2.0F, ((int) -Static277.aFloat67 & 0x3FFF) << 2, local8, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILclient!je;Lclient!wm;Lclient!jg;Lclient!np;I)V")
	public static void method3726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) WorldMapFont arg3, @OriginalArg(4) Class19 arg4, @OriginalArg(5) Class2_Sub20 arg5, @OriginalArg(6) Class164 arg6) {
		@Pc(14) int local14 = arg5.anInt2948 - arg0 / 2 - 5;
		@Pc(18) int local18 = arg2 + 2;
		if (arg6.anInt4437 != 0) {
			arg4.method2868(arg2 + arg1 * arg3.method2947() + 1 - local18, local14, local18, arg6.anInt4437, arg0 + 10);
		}
		if (arg6.anInt4417 != 0) {
			arg4.method2837(local18, local14, arg2 + arg3.method2947() * arg1 + 1 - local18, arg6.anInt4417, arg0 + 10);
		}
		@Pc(70) int local70 = arg6.anInt4431;
		if (arg5.aBoolean207 && arg6.anInt4406 != -1) {
			local70 = arg6.anInt4406;
		}
		for (@Pc(89) int local89 = 0; local89 < arg1; local89++) {
			@Pc(95) String local95 = Static287.aStringArray52[local89];
			if (arg1 - 1 > local89) {
				local95 = local95.substring(0, local95.length() - 4);
			}
			arg3.method2950(arg4, local95, arg5.anInt2948, arg2, local70);
			arg2 += arg3.method2947();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)Lclient!je;")
	public static WorldMapFont method3728(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static344.aFloat72 == 3.0D) {
				return Static74.font11;
			}
			if ((double) Static344.aFloat72 == 4.0D) {
				return Static107.font12;
			}
			if ((double) Static344.aFloat72 == 6.0D) {
				return Static2.font14;
			}
			if ((double) Static344.aFloat72 >= 8.0D) {
				return Static175.font17;
			}
		} else if (arg0 == 1) {
			if ((double) Static344.aFloat72 == 3.0D) {
				return Static2.font14;
			}
			if ((double) Static344.aFloat72 == 4.0D) {
				return Static175.font17;
			}
			if ((double) Static344.aFloat72 == 6.0D) {
				return Static249.font19;
			}
			if ((double) Static344.aFloat72 >= 8.0D) {
				return Static30.font22;
			}
		} else if (arg0 == 2) {
			if ((double) Static344.aFloat72 == 3.0D) {
				return Static249.font19;
			}
			if ((double) Static344.aFloat72 == 4.0D) {
				return Static30.font22;
			}
			if ((double) Static344.aFloat72 == 6.0D) {
				return Static27.font26;
			}
			if ((double) Static344.aFloat72 >= 8.0D) {
				return Static369.font30;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZLclient!ac;Lclient!ac;IBZ)I")
	public static int method3729(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) World arg2, @OriginalArg(3) World arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static70.method1786(arg5, arg2, arg3, arg4);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(32) int local32 = Static70.method1786(arg1, arg2, arg3, arg0);
			return arg1 ? -local32 : local32;
		}
	}
}
