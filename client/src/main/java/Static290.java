import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "Lclient!bi;")
	public static Class22 aClass22_3;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
	public static int bufferLength = 0;

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
	public static int anInt5498 = -1;

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "[Lclient!q;")
	public static final Class187[] aClass187Array1 = new Class187[6];

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString56 = null;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V")
	public static void method5022(@OriginalArg(0) int arg0) {
		@Pc(8) DelayedStateChange local8 = DelayedStateChange.create(2, arg0);
		local8.pushClient();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	public static void setTutorialIsland() {
		Static212.inTutorialIsland = 0;
		@Pc(17) int x = (Static17.self.xFine >> 7) + Static164.originX;
		@Pc(24) int z = Static148.originZ + (Static17.self.zFine >> 7);
		if (x >= 3053 && x <= 3156 && z >= 3056 && z <= 3136) {
			Static212.inTutorialIsland = 1;
		}
		if (x >= 3072 && x <= 3118 && z >= 9492 && z <= 9535) {
			Static212.inTutorialIsland = 1;
		}
		if (Static212.inTutorialIsland == 1 && x >= 3139 && x <= 3199 && z >= 3008 && z <= 3062) {
			Static212.inTutorialIsland = 0;
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	public static void method5025() {
		Static91.method1960(Static13.aClass145_18);
		Static257.outboundBuffer.p1(0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!bt;)Lclient!gr;")
	public static QuickChatPhrase method5026(@OriginalArg(1) Buffer arg0) {
		@Pc(15) QuickChatPhrase local15 = new QuickChatPhrase();
		local15.id = arg0.g2();
		local15.type = Static146.get(local15.id);
		return local15;
	}
}
