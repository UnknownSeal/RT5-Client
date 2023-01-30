import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public final class Class11_Sub3_Sub1 extends Class11_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!eq", name = "C", descriptor = "Lclient!cj;")
	public Class11_Sub3 aClass11_Sub3_1;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(IIIIILclient!cj;)V")
	public Class11_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class11_Sub3 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static58.method1632(arg1, arg0));
		this.aClass11_Sub3_1 = arg5;
	}

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "(I)I")
	@Override
	public int method5747() {
		return 0;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6072(@OriginalArg(0) Class19 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!wm;I)V")
	@Override
	public void method6082(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6085() {
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)I")
	@Override
	public int method6083() {
		return 0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;")
	@Override
	public Model method6087(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
	@Override
	public void method6081() {
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6069(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)I")
	@Override
	public int method6084() {
		return 0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)I")
	@Override
	public int method6080() {
		return 0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BLclient!wm;)V")
	@Override
	public void method6086(@OriginalArg(1) Class19 arg0) {
	}
}
