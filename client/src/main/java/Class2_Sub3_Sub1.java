import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class2_Sub3_Sub1 extends TextureOp {

	@OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub1() {
		this(4096);
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
	private Class2_Sub3_Sub1(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt164 = 4096;
		this.anInt164 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6483(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt164 = (arg1.g1() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(14) int[] local14 = super.aClass158_41.method3995(y);
		if (super.aClass158_41.aBoolean265) {
			Static403.method4609(local14, 0, Static227.anInt4036, this.anInt164);
		}
		return local14;
	}
}
