import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class ColorImageCacheEntry extends Node {

	@OriginalMember(owner = "client!wh", name = "A", descriptor = "[Lclient!cm;")
	public static final Class36[] aClass36Array1 = new Class36[5];
	@OriginalMember(owner = "client!km", name = "j", descriptor = "Lclient!wh;")
	public static final ColorImageCacheEntry VALID = new ColorImageCacheEntry(0, 0);

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
	public final int index;

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
	public final int row;

	static {
		for (@Pc(14) int local14 = 0; local14 < aClass36Array1.length; local14++) {
			aClass36Array1[local14] = new Class36();
		}
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(II)V")
	public ColorImageCacheEntry(@OriginalArg(0) int row, @OriginalArg(1) int index) {
		this.row = row;
		this.index = index;
	}
}
