import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class115 {

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "Lclient!tl;")
	private SecondaryNode aClass2_Sub2_25;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "J")
	private long aLong92;

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
	private final int anInt2961;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "[Lclient!tl;")
	private final SecondaryNode[] aClass2_Sub2Array1;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V")
	public Class115(@OriginalArg(0) int arg0) {
		this.anInt2961 = arg0;
		this.aClass2_Sub2Array1 = new SecondaryNode[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) SecondaryNode local20 = this.aClass2_Sub2Array1[local10] = new SecondaryNode();
			local20.secondaryNext = local20;
			local20.secondaryPrevious = local20;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IJ)Lclient!tl;")
	public SecondaryNode method2973(@OriginalArg(1) long arg0) {
		this.aLong92 = arg0;
		@Pc(26) SecondaryNode local26 = this.aClass2_Sub2Array1[(int) (arg0 & (long) (this.anInt2961 - 1))];
		for (this.aClass2_Sub2_25 = local26.secondaryNext; this.aClass2_Sub2_25 != local26; this.aClass2_Sub2_25 = this.aClass2_Sub2_25.secondaryNext) {
			if (this.aClass2_Sub2_25.secondaryKey == arg0) {
				@Pc(41) SecondaryNode local41 = this.aClass2_Sub2_25;
				this.aClass2_Sub2_25 = this.aClass2_Sub2_25.secondaryNext;
				return local41;
			}
		}
		this.aClass2_Sub2_25 = null;
		return null;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Lclient!tl;")
	public SecondaryNode method2974() {
		if (this.aClass2_Sub2_25 == null) {
			return null;
		}
		@Pc(28) SecondaryNode local28 = this.aClass2_Sub2Array1[(int) ((long) (this.anInt2961 - 1) & this.aLong92)];
		while (local28 != this.aClass2_Sub2_25) {
			if (this.aLong92 == this.aClass2_Sub2_25.secondaryKey) {
				@Pc(40) SecondaryNode local40 = this.aClass2_Sub2_25;
				this.aClass2_Sub2_25 = this.aClass2_Sub2_25.secondaryNext;
				return local40;
			}
			this.aClass2_Sub2_25 = this.aClass2_Sub2_25.secondaryNext;
		}
		this.aClass2_Sub2_25 = null;
		return null;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IJLclient!tl;)V")
	public void method2977(@OriginalArg(1) long arg0, @OriginalArg(2) SecondaryNode arg1) {
		if (arg1.secondaryPrevious != null) {
			arg1.unlinkSecondary();
		}
		@Pc(21) SecondaryNode local21 = this.aClass2_Sub2Array1[(int) (arg0 & (long) (this.anInt2961 - 1))];
		arg1.secondaryPrevious = local21.secondaryPrevious;
		arg1.secondaryNext = local21;
		arg1.secondaryPrevious.secondaryNext = arg1;
		arg1.secondaryNext.secondaryPrevious = arg1;
		arg1.secondaryKey = arg0;
	}
}
