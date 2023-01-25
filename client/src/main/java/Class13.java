import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public abstract class Class13 {

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	protected Class13() {
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "()I")
	public abstract int method6381();

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!kf;II)V")
	public abstract void method6382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "()I")
	public abstract int method6383();

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
	public final void method6384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method6400(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFII)V")
	public final void method6385(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method6392(arg0, arg1, (float) this.method6398() / 2.0F, (float) this.method6383() / 2.0F, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFFFLclient!kf;II)V")
	protected abstract void method6386(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class78 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V")
	public final void method6387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method6394(arg0, arg1, arg2, arg3, 0, 0, 1);
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "()I")
	public abstract int method6388();

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIII)V")
	public abstract void method6389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IIII)V")
	public abstract void method6390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
	public abstract void method6391(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFIIIII)V")
	private void method6392(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method6398() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method6398() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method6383() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method6383() - arg3) * local23) / 4096.0F + arg1;
		this.method6393(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void method6393(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFIILclient!kf;II)V")
	public final void method6395(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class78 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method6398() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method6398() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method6383() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method6383() - arg3) * local23) / 4096.0F + arg1;
		this.method6386(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method6396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFIILclient!kf;II)V")
	public final void method6397(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class78 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method6395(arg0, arg1, (float) this.method6398() / 2.0F, (float) this.method6383() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "()I")
	public abstract int method6398();

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFIIIII)V")
	public final void method6399(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method6392(arg0, arg1, (float) this.method6398() / 2.0F, (float) this.method6383() / 2.0F, arg2, arg3, 1, arg4);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)V")
	public abstract void method6400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
