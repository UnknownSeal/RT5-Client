import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "[Lclient!ac;")
	public static World[] worlds;

	@OriginalMember(owner = "client!r", name = "w", descriptor = "I")
	public static int anInt5567 = 0;

	@OriginalMember(owner = "client!r", name = "H", descriptor = "Lclient!ld;")
	public static final LinkedList A_LINKED_LIST___32 = new LinkedList();

	@OriginalMember(owner = "client!r", name = "O", descriptor = "[I")
	public static final int[] anIntArray375 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(B)V")
	public static void method5093() {
		Static65.anIntArray110 = null;
		Static274.anIntArray352 = null;
		Static322.anIntArray404 = null;
		Static263.aBoolean330 = false;
		Static375.anIntArray481 = null;
		Static332.anIntArray428 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!nk;ZLclient!nk;)V")
	public static void method5095(@OriginalArg(0) Component arg0, @OriginalArg(2) Component arg1) {
		Static91.method1960(Static387.aClass145_110);
		Static257.outboundBuffer.p4(arg1.id);
		Static257.outboundBuffer.ip2add(arg1.objId);
		Static257.outboundBuffer.p2add(arg1.createdComponentID);
		Static257.outboundBuffer.mp4(arg0.id);
		Static257.outboundBuffer.ip2add(arg0.objId);
		Static257.outboundBuffer.ip2_dup(arg0.createdComponentID);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IB)Lclient!js;")
	public static ClientScript get(@OriginalArg(0) int id) {
		@Pc(15) ClientScript script = (ClientScript) Static261.scripts.get(id);
		if (script != null) {
			return script;
		}
		@Pc(25) byte[] bytes = client.js5Archive12.fetchFile(id, 0);
		if (bytes == null || bytes.length <= 1) {
			return null;
		} else {
			script = ClientScript.decode(bytes);
			Static261.scripts.put(id, script);
			return script;
		}
	}
}
