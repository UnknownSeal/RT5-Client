import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
	public static int minID;

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "[I")
	public static int[] anIntArray481;

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "[I")
	public static int[] anIntArray483;

	@OriginalMember(owner = "client!vs", name = "z", descriptor = "J")
	public static long aLong222;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "Lclient!nk;")
	public static Component aComponent_14 = null;

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "[I")
	public static final int[] anIntArray482 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray64 = new boolean[100];

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "J")
	public static long aLong221 = -1L;

	@OriginalMember(owner = "client!vs", name = "u", descriptor = "Z")
	public static boolean aBoolean477 = false;

	@OriginalMember(owner = "client!vs", name = "x", descriptor = "Lclient!h;")
	public static final Class89 aClass89_246 = new Class89(75, 0);

	@OriginalMember(owner = "client!vs", name = "y", descriptor = "I")
	public static int anInt7051 = 0;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB)Z")
	public static boolean switchWorld(@OriginalArg(0) int id) {
		@Pc(7) World world = Static7.get(id);
		if (world == null) {
			return false;
		} else if (Static215.anInt3795 == 3) {
			@Pc(39) String local39 = "";
			if (Static121.aClass127_4 != Static189.aClass127_6) {
				local39 = ":" + (world.worldID + 7000);
			}
			@Pc(55) String local55 = "";
			if (client.settings != null) {
				local55 = "/p=" + client.settings;
			}
			@Pc(109) String url = "http://" + world.hostname + local39 + "/l=" + client.language + "/a=" + Static165.anInt3149 + local55 + "/j" + (Static276.aBoolean375 ? "1" : "0") + ",o" + (Static237.aBoolean298 ? "1" : "0") + ",a2";
			try {
				Static144.instance.getAppletContext().showDocument(new URL(url), "_self");
				return true;
			} catch (@Pc(119) Exception exception) {
				return false;
			}
		} else {
			client.worldID = world.worldID;
			client.hostname = world.hostname;
			if (Static121.aClass127_4 != Static189.aClass127_6) {
				client.defaultPort = client.worldID + 40000;
				client.alternatePort = client.worldID + 50000;
				client.port = client.defaultPort;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
	public static void method6280() {
		Static263.aBoolean330 = true;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BII)V")
	public static void method6281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) DelayedStateChange local8 = Static316.create(13, arg1);
		local8.pushServer();
		local8.anInt2289 = arg0;
	}
}
