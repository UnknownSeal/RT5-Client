import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class2_Sub3_Sub35 extends TextureOp {

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
	private int anInt6433;

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
	private int anInt6435;

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
	private int anInt6436 = -1;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub35() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method6474(arg0, arg1);
		if (this.anInt6436 >= 0 && Static259.anInterface2_6 != null) {
			@Pc(28) int local28 = Static259.anInterface2_6.method2658(this.anInt6436).aBoolean441 ? 64 : 128;
			this.anIntArray435 = Static259.anInterface2_6.method2659(this.anInt6436, false, local28, 1.0F, local28);
			this.anInt6435 = local28;
			this.anInt6433 = local28;
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)I")
	@Override
	public int method6481() {
		return this.anInt6436;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	@Override
	public void method6476() {
		super.method6476();
		this.anIntArray435 = null;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method6478(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass243_41.method6276(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(35) int local35 = this.anInt6435 * (Static24.anInt638 == this.anInt6433 ? arg0 : arg0 * this.anInt6433 / Static24.anInt638);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(57) int local57;
			@Pc(65) int local65;
			if (this.anInt6435 == Static227.anInt4036) {
				for (local57 = 0; local57 < Static227.anInt4036; local57++) {
					local65 = this.anIntArray435[local35++];
					local47[local57] = (local65 & 0xFF) << 4;
					local43[local57] = local65 >> 4 & 0xFF0;
					local39[local57] = local65 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static227.anInt4036; local57++) {
					local65 = this.anInt6435 * local57 / Static227.anInt4036;
					@Pc(117) int local117 = this.anIntArray435[local35 + local65];
					local47[local57] = (local117 & 0xFF) << 4;
					local43[local57] = local117 >> 4 & 0xFF0;
					local39[local57] = local117 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6483(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt6436 = arg1.g2();
		}
	}
}
