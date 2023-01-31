import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class GameType {

	@OriginalMember(owner = "client!of", name = "u", descriptor = "Lclient!dn;")
	public static final GameType GAME_TYPE_RUNESCAPE = new GameType("runescape", 0);
	@OriginalMember(owner = "client!fu", name = "P", descriptor = "Lclient!dn;")
	public static final GameType GAME_TYPE_STELLARDAWN = new GameType("stellardawn", 1);
	@OriginalMember(owner = "client!dn", name = "e", descriptor = "Ljava/lang/String;")
	public final String gameTypeString;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
	public final int gameTypeID;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public GameType(@OriginalArg(0) String gameTypeString, @OriginalArg(1) int gameTypeID) {
		this.gameTypeString = gameTypeString;
		this.gameTypeID = gameTypeID;
	}

	@OriginalMember(owner = "client!dn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
