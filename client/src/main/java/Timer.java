import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public abstract class Timer {

	static {
		new LocalisedText("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
		new LocalisedText("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)Lclient!as;")
	public static Timer create() {
		try {
			return new MiscTimer();
		} catch (@Pc(8) Throwable exception) {
			try {
				return (Timer) Class.forName("NanoTimer").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable exceptionThrowable) {
				return new MillisTimer();
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)J")
	public abstract long time();

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(I)V")
	public abstract void reset();

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZI)I")
	public abstract int sleep(@OriginalArg(1) int timePerFrame);
}
