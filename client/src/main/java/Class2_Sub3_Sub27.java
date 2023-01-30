import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class2_Sub3_Sub27 extends TextureOp {

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		return Static334.anIntArray424;
	}
}
