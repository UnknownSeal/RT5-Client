import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public final class MapChunk extends Node {

	@OriginalMember(owner = "client!qt", name = "K", descriptor = "I")
	public final int anInt5547;

	@OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
	private final int sourceMinZ;

	@OriginalMember(owner = "client!qt", name = "F", descriptor = "I")
	public final int anInt5542;

	@OriginalMember(owner = "client!qt", name = "G", descriptor = "I")
	private final int displayLevel;

	@OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
	private final int sourceMinX;

	@OriginalMember(owner = "client!qt", name = "z", descriptor = "I")
	public final int anInt5537;

	@OriginalMember(owner = "client!qt", name = "t", descriptor = "I")
	private final int sourceMaxX;

	@OriginalMember(owner = "client!qt", name = "I", descriptor = "I")
	private final int sourceMaxZ;

	@OriginalMember(owner = "client!qt", name = "w", descriptor = "I")
	public final int anInt5534;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IIIIIIIII)V")
	public MapChunk(@OriginalArg(0) int arg0, @OriginalArg(1) int sourceMinX, @OriginalArg(2) int sourceMinZ, @OriginalArg(3) int sourceMaxX, @OriginalArg(4) int sourceMaxZ, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5547 = arg6;
		this.sourceMinZ = sourceMinZ;
		this.anInt5542 = arg7;
		this.displayLevel = arg0;
		this.sourceMinX = sourceMinX;
		this.anInt5537 = arg8;
		this.sourceMaxX = sourceMaxX;
		this.sourceMaxZ = sourceMaxZ;
		this.anInt5534 = arg5;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II[II)V")
	public void method5058(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int position) {
		arg1[2] = this.anInt5547 + arg0 - this.sourceMinZ;
		arg1[1] = position + this.anInt5534 - this.sourceMinX;
		arg1[0] = 0;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIB)Z")
	public boolean containsDisplay(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt5534 && arg1 <= this.anInt5542 && this.anInt5547 <= arg0 && arg0 <= this.anInt5537;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(II[II)V")
	public void convertDisplayToSource(@OriginalArg(0) int x, @OriginalArg(3) int z, @OriginalArg(2) int[] position) {
		position[0] = this.displayLevel;
		position[2] = this.sourceMinZ + z - this.anInt5547;
		position[1] = this.sourceMinX + x - this.anInt5534;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIB)Z")
	public boolean method5062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 == this.displayLevel && arg2 >= this.sourceMinX && arg2 <= this.sourceMaxX && arg1 >= this.sourceMinZ && this.sourceMaxZ >= arg1;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(IZI)Z")
	public boolean containsSource(@OriginalArg(2) int x, @OriginalArg(0) int z) {
		return x >= this.sourceMinX && x <= this.sourceMaxX && z >= this.sourceMinZ && z <= this.sourceMaxZ;
	}
}
