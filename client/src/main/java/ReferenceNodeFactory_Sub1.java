import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class ReferenceNodeFactory_Sub1 extends ReferenceNodeFactory {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!eu;)Lclient!eu;")
	@Override
	public ReferenceNode create(@OriginalArg(1) ReferenceNode node) {
		return new Class2_Sub2_Sub6_Sub1(node.get(), node.anInt6636);
	}
}
