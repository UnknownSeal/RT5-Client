import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public abstract class TextureOp extends Node {

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "[I")
	public static int[] COSINE;
	@OriginalMember(owner = "client!il", name = "V", descriptor = "[I")
	public static int[] SINE;
	@OriginalMember(owner = "client!jq", name = "x", descriptor = "Lclient!vs;")
	protected Class243 aClass243_41;

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "Lclient!nc;")
	protected Class158 aClass158_41;

	@OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
	public int anInt7251;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "[Lclient!jq;")
	public final TextureOp[] childOps;

	@OriginalMember(owner = "client!jq", name = "M", descriptor = "Z")
	public boolean monochrome;

	static {
		new LocalisedText("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(IZ)V")
	protected TextureOp(@OriginalArg(0) int childOpsCount, @OriginalArg(1) boolean monochrome) {
		this.childOps = new TextureOp[childOpsCount];
		this.monochrome = monochrome;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Lclient!jq;")
	public static TextureOp create(@OriginalArg(0) int type) {
		if (type == 0) {
			return new Class2_Sub3_Sub1();
		} else if (type == 1) {
			return new Class2_Sub3_Sub23();
		} else if (type == 2) {
			return new Class2_Sub3_Sub27();
		} else if (type == 3) {
			return new Class2_Sub3_Sub13();
		} else if (type == 4) {
			return new Class2_Sub3_Sub25();
		} else if (type == 5) {
			return new Class2_Sub3_Sub4();
		} else if (type == 6) {
			return new Class2_Sub3_Sub15();
		} else if (type == 7) {
			return new Class2_Sub3_Sub30();
		} else if (type == 8) {
			return new Class2_Sub3_Sub39();
		} else if (type == 9) {
			return new Class2_Sub3_Sub2();
		} else if (type == 10) {
			return new Class2_Sub3_Sub20();
		} else if (type == 11) {
			return new Class2_Sub3_Sub22();
		} else if (type == 12) {
			return new Class2_Sub3_Sub17();
		} else if (type == 13) {
			return new Class2_Sub3_Sub21();
		} else if (type == 14) {
			return new Class2_Sub3_Sub26();
		} else if (type == 15) {
			return new Class2_Sub3_Sub18();
		} else if (type == 16) {
			return new Class2_Sub3_Sub32();
		} else if (type == 17) {
			return new Class2_Sub3_Sub29();
		} else if (type == 18) {
			return new Class2_Sub3_Sub10_Sub1();
		} else if (type == 19) {
			return new Class2_Sub3_Sub31();
		} else if (type == 20) {
			return new Class2_Sub3_Sub38();
		} else if (type == 21) {
			return new Class2_Sub3_Sub16();
		} else if (type == 22) {
			return new Class2_Sub3_Sub8();
		} else if (type == 23) {
			return new Class2_Sub3_Sub9();
		} else if (type == 24) {
			return new Class2_Sub3_Sub24();
		} else if (type == 25) {
			return new Class2_Sub3_Sub14();
		} else if (type == 26) {
			return new Class2_Sub3_Sub12();
		} else if (type == 27) {
			return new Class2_Sub3_Sub33();
		} else if (type == 28) {
			return new Class2_Sub3_Sub36();
		} else if (type == 29) {
			return new Class2_Sub3_Sub37();
		} else if (type == 30) {
			return new Class2_Sub3_Sub34();
		} else if (type == 31) {
			return new Class2_Sub3_Sub11();
		} else if (type == 32) {
			return new Class2_Sub3_Sub19();
		} else if (type == 33) {
			return new Class2_Sub3_Sub5();
		} else if (type == 34) {
			return new Class2_Sub3_Sub6();
		} else if (type == 35) {
			return new Class2_Sub3_Sub3();
		} else if (type == 36) {
			return new Class2_Sub3_Sub35();
		} else if (type == 37) {
			return new Class2_Sub3_Sub28();
		} else if (type == 38) {
			return new Class2_Sub3_Sub7();
		} else if (type == 39) {
			return new Class2_Sub3_Sub10();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(IB)I")
	public static int perlinFade(@OriginalArg(0) int t) {
		@Pc(13) int cube = t * (t * t >> 12) >> 12;
		@Pc(19) int mul6Sub15 = t * 6 - 61440;
		@Pc(32) int mulTAdd10 = (t * mul6Sub15 >> 12) + 40960;
		return mulTAdd10 * cube >> 12;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Z)V")
	public static void createTrigonometryTables() {
		if (SINE != null && COSINE != null) {
			return;
		}
		SINE = new int[256];
		COSINE = new int[256];
		for (@Pc(17) int i = 0; i < 256; i++) {
			@Pc(26) double radians = (double) i / 255.0D * 6.283185307179586D;
			SINE[i] = (int) (Math.sin(radians) * 4096.0D);
			COSINE[i] = (int) (Math.cos(radians) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(IZI)[I")
	protected final int[] method6472(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.childOps[arg0].monochrome ? this.childOps[arg0].getMonochromeOutput(arg1) : this.childOps[arg0].method6478(arg1)[0];
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)V")
	public void method6474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt7251 == 255 ? arg0 : this.anInt7251;
		if (this.monochrome) {
			this.aClass158_41 = new Class158(local12, arg0, arg1);
		} else {
			this.aClass243_41 = new Class243(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	public void method6476() {
		if (this.monochrome) {
			this.aClass158_41.method3993();
			this.aClass158_41 = null;
		} else {
			this.aClass243_41.method6282();
			this.aClass243_41 = null;
		}
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)I")
	public int method6477() {
		return -1;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(IB)[[I")
	public int[][] method6478(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)V")
	public void method6479() {
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)I")
	public int method6481() {
		return -1;
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(IZI)[[I")
	protected final int[][] method6482(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.childOps[arg0].monochrome) {
			@Pc(22) int[] local22 = this.childOps[arg0].getMonochromeOutput(arg1);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.childOps[arg0].method6478(arg1);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!bt;I)V")
	public void method6483(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)[I")
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
