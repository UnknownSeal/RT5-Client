import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!kt", name = "V", descriptor = "[I")
	public static int[] npcGroupIDs;

	@OriginalMember(owner = "client!kt", name = "X", descriptor = "Lclient!wm;")
	public static Class19 aClass19_8;

	@OriginalMember(owner = "client!kt", name = "db", descriptor = "Lclient!bu;")
	public static Class29_Sub1 aClass29_Sub1_63;

	@OriginalMember(owner = "client!kt", name = "O", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_138 = new Class145(58, 2);

	@OriginalMember(owner = "client!kt", name = "Y", descriptor = "I")
	public static int anInt3541 = 1;

	@OriginalMember(owner = "client!kt", name = "cb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[100];

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIILclient!wm;)V")
	public static void method3499(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19 arg2) {
		Static65.aClass19_3 = arg2;
		Static332.aEnvironmentArrayArray3 = new Environment[arg1][arg0];
		if (Static209.skyboxTextures != null) {
			Static62.aClass42_5 = Static297.method5106(Static209.skyboxTextures[2], Static209.skyboxTextures[4], Static209.skyboxTextures[5], Static209.skyboxTextures[1], Static209.skyboxTextures[0], Static209.skyboxTextures[3]);
		}
		Static119.aEnvironment_1 = new Environment();
		Static20.method560();
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIII)V")
	public static void method3500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) DelayedStateChange local12 = DelayedStateChange.create(4, arg3);
		local12.pushServer();
		local12.anInt2290 = arg0;
		local12.anInt2284 = arg1;
		local12.anInt2289 = arg2;
	}

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)V")
	public static void method3501() {
		Static211.aClass13_13 = null;
		Static339.aClass13_18 = null;
		Static75.aClass13_5 = null;
		Static337.aClass13_17 = null;
		Static35.aClass13_3 = null;
		Static197.aClass13_12 = null;
		Static110.aClass13_6 = null;
		Static138.aClass13_8 = null;
	}
}
