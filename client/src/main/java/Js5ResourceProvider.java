import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class Js5ResourceProvider {

	static {
		new LocalisedText("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
	protected Js5ResourceProvider() {
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)Lclient!ra;")
	public abstract Js5Index fetchIndex();

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
	public abstract void method885(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)I")
	public abstract int getPercentageComplete(@OriginalArg(0) int group);

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(II)[B")
	public abstract byte[] fetchGroup(@OriginalArg(0) int group);
}
