import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public final class GameMode {

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "Lclient!rt;")
	public static final GameMode GAME_MODE_LIVE = new GameMode("LIVE", 0);
	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!rt;")
	public static final GameMode GAME_MODE_RC = new GameMode("RC", 1);
	@OriginalMember(owner = "client!us", name = "T", descriptor = "Lclient!rt;")
	public static final GameMode GAME_MODE_WIP = new GameMode("WIP", 2);
	@OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
	public final int gameModeID;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public GameMode(@OriginalArg(0) String gameModeString, @OriginalArg(1) int gameModeID) {
		this.gameModeID = gameModeID;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)I")
	public int getGameModeID() {
		return this.gameModeID;
	}

	@OriginalMember(owner = "client!rt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
