import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!du", name = "b", descriptor = "Z")
	public static boolean aBoolean129 = true;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IZ)V")
	public static void readNpcInfoPacket(@OriginalArg(1) boolean arg0) {
		Static242.removedCount = 0;
		Static343.extendedCount = 0;
		Static315.readNpcInfo();
		Static17.method4209(arg0);
		Static236.method4111();

		for (@Pc(18) int i = 0; i < Static242.removedCount; i++) {
			@Pc(24) int id = Static17.removeIDs[i];
			if (Static114.loop != Static365.npcs[id].lastSeenLoop) {
				if (Static365.npcs[id].type.hasAreaSound()) {
					Static154.remove(Static365.npcs[id]);
				}
				Static365.npcs[id].setType(null);
				Static365.npcs[id] = null;
			}
		}
		if (Static212.inboundBuffer.offset != Static82.length) {
			throw new RuntimeException("gnp1 pos:" + Static212.inboundBuffer.offset + " psize:" + Static82.length);
		}
		for (int i = 0; i < Static166.size; i++) {
			if (Static365.npcs[Static211.ids[i]] == null) {
				throw new RuntimeException("gnp2 pos:" + i + " size:" + Static166.size);
			}
		}
	}
}
