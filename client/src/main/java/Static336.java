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
		if (client.gameState == arg0) {
			return;
		}
		if (client.gameState == 0) {
			Static103.clear();
		}
		if (arg0 == 40) {
			Static230.method4013();
		}
		if (arg0 != 40 && Static246.aBufferedSocket_2 != null) {
			Static246.aBufferedSocket_2.close();
			Static246.aBufferedSocket_2 = null;
		}
		if (client.gameState == 25 || client.gameState == 28) {
			client.js5Archive2.discardUnpacked = 2;
			client.js5Archive17.discardUnpacked = 2;
			client.js5Archive16.discardUnpacked = 2;
			client.js5Archive18.discardUnpacked = 2;
			client.js5Archive19.discardUnpacked = 2;
			client.js5Archive20.discardUnpacked = 2;
			client.js5Archive21.discardUnpacked = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static305.anInt5742 = 0;
			Static144.anInt2694 = 0;
			Static65.anInt1588 = 1;
			Static246.anInt4505 = 0;
			Static190.anInt3541 = 1;
			Static241.method4191(true);
			client.js5Archive2.discardUnpacked = 1;
			client.js5Archive17.discardUnpacked = 1;
			client.js5Archive16.discardUnpacked = 1;
			client.js5Archive18.discardUnpacked = 1;
			client.js5Archive19.discardUnpacked = 1;
			client.js5Archive20.discardUnpacked = 1;
			client.js5Archive21.discardUnpacked = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static322.topBannerRefresh();
		}
		if (arg0 == 5) {
			Static348.method5829(client.js5Archive8, Static190.aClass19_8);
		} else {
			Static67.clear();
		}
		@Pc(146) boolean local146 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(165) boolean local165 = client.gameState == 5 || client.gameState == 10 || client.gameState == 28;
		if (local146 != local165) {
			if (local146) {
				Static171.groupID = Static97.titleSong;
				if (Static218.preferences.musicVolume == 0) {
					Static174.method1507();
				} else {
					Static249.playFadeOut(Static218.preferences.musicVolume, client.js5Archive6, Static97.titleSong);
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
		client.gameState = arg0;
	}
}
