import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!tj", name = "r", descriptor = "Lclient!r;")
	public static Js5 aJs5_90;

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "Lclient!vq;")
	public static Class241 aClass241_5;

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "Lclient!h;")
	public static final Class89 aClass89_225 = new Class89(45, 1);

	@OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
	public static int anInt6313 = 0;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(IB)V")
	public static void method5704(@OriginalArg(0) int arg0) {
		if (Static347.anInt6442 == arg0) {
			return;
		}
		if (Static347.anInt6442 == 0) {
			Static103.clear();
		}
		if (arg0 == 40) {
			Static230.method4013();
		}
		if (arg0 != 40 && Static246.aBufferedSocket_2 != null) {
			Static246.aBufferedSocket_2.close();
			Static246.aBufferedSocket_2 = null;
		}
		if (Static347.anInt6442 == 25 || Static347.anInt6442 == 28) {
			Static289.aJs5_71.discardUnpacked = 2;
			Static226.aJs5_61.discardUnpacked = 2;
			Static391.aJs5_96.discardUnpacked = 2;
			Static216.aJs5_57.discardUnpacked = 2;
			Static61.aJs5_12.discardUnpacked = 2;
			Static139.aJs5_35.discardUnpacked = 2;
			Static173.aJs5_45.discardUnpacked = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static305.anInt5742 = 0;
			Static144.anInt2694 = 0;
			Static65.anInt1588 = 1;
			Static246.anInt4505 = 0;
			Static190.anInt3541 = 1;
			Static241.method4191(true);
			Static289.aJs5_71.discardUnpacked = 1;
			Static226.aJs5_61.discardUnpacked = 1;
			Static391.aJs5_96.discardUnpacked = 1;
			Static216.aJs5_57.discardUnpacked = 1;
			Static61.aJs5_12.discardUnpacked = 1;
			Static139.aJs5_35.discardUnpacked = 1;
			Static173.aJs5_45.discardUnpacked = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static322.topBannerRefresh();
		}
		if (arg0 == 5) {
			Static348.method5829(Static30.aJs5_5, Static190.aClass19_8);
		} else {
			Static67.clear();
		}
		@Pc(146) boolean local146 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(165) boolean local165 = Static347.anInt6442 == 5 || Static347.anInt6442 == 10 || Static347.anInt6442 == 28;
		if (local146 != local165) {
			if (local146) {
				Static171.anInt3268 = Static97.anInt2049;
				if (Static218.aClass177_Sub1_2.musicVolume == 0) {
					Static174.method1507();
				} else {
					Static249.playFadeOut(Static218.aClass177_Sub1_2.musicVolume, Static101.aJs5_23, Static97.anInt2049);
				}
				client.js5NetQueue.writeLoggedIn(false);
			} else {
				Static174.method1507();
				client.js5NetQueue.writeLoggedIn(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static190.aClass19_8.method2804();
		}
		Static347.anInt6442 = arg0;
	}
}
