import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class2_Sub3_Sub13 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method6484(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass158_41.method3995(arg0);
		if (super.aClass158_41.aBoolean265) {
			Static403.method4609(local14, 0, Static227.anInt4036, Static16.anIntArray322[arg0]);
		}
		return local14;
	}
}
