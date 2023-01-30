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
	protected ColorImageCache colorImageCache;

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "Lclient!nc;")
	protected MonochromeImageCache monochromeImageCache;

	@OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
	public int imageCacheCapacity;

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
			return new TextureOpMonochromeFill();
		} else if (type == 1) {
			return new TextureOpColorFill();
		} else if (type == 2) {
			return new TextureOpHorizontalGradient();
		} else if (type == 3) {
			return new TextureOpVerticalGradient();
		} else if (type == 4) {
			return new TextureOpBricks();
		} else if (type == 5) {
			return new TextureOpBoxBlur();
		} else if (type == 6) {
			return new TextureOpClamp();
		} else if (type == 7) {
			return new TextureOpCombine();
		} else if (type == 8) {
			return new TextureOpCurve();
		} else if (type == 9) {
			return new TextureOpFlip();
		} else if (type == 10) {
			return new TextureOpColorGradient();
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
			return new TextureOp37();
		} else if (type == 38) {
			return new TextureOpLineNoise();
		} else if (type == 39) {
			return new TextureOpSprite();
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
	protected final int[] getChildMonochromeOutput(@OriginalArg(0) int index, @OriginalArg(2) int y) {
		return this.childOps[index].monochrome ? this.childOps[index].getMonochromeOutput(y) : this.childOps[index].getColorOutput(y)[0];
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)V")
	public void createImageCache(@OriginalArg(0) int height, @OriginalArg(1) int width) {
		@Pc(12) int capacity = this.imageCacheCapacity == 255 ? height : this.imageCacheCapacity;
		if (this.monochrome) {
			this.monochromeImageCache = new MonochromeImageCache(capacity, height, width);
		} else {
			this.colorImageCache = new ColorImageCache(capacity, height, width);
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	public void clearImageCache() {
		if (this.monochrome) {
			this.monochromeImageCache.clear();
			this.monochromeImageCache = null;
		} else {
			this.colorImageCache.clear();
			this.colorImageCache = null;
		}
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)I")
	public int getSpriteID() {
		return -1;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(IB)[[I")
	public int[][] getColorOutput(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)V")
	public void postDecode() {
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)I")
	public int getTextureID() {
		return -1;
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(IZI)[[I")
	protected final int[][] getChildColorOutput(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.childOps[arg0].monochrome) {
			@Pc(22) int[] local22 = this.childOps[arg0].getMonochromeOutput(arg1);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.childOps[arg0].getColorOutput(arg1);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!bt;I)V")
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)[I")
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
