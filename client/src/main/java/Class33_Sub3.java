import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class33_Sub3 extends Class33 {

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class33_Sub3(@OriginalArg(0) Class19_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "()Z")
	@Override
	public boolean method5710() {
		return true;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)V")
	@Override
	public void method5713(@OriginalArg(0) boolean arg0) {
		this.aClass19_Sub1_35.method800(true);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	@Override
	public void method5711(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	@Override
	public void method5712(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!kq;)V")
	@Override
	public void method5709(@OriginalArg(0) Class8 arg0) {
		this.aClass19_Sub1_35.method848(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "()V")
	@Override
	public void method5714() {
		this.aClass19_Sub1_35.method800(false);
	}
}
