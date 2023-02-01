import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class TextureOpMonochromeFill extends TextureOp {

	@OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
	private int value;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public TextureOpMonochromeFill() {
		this(4096);
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
	private TextureOpMonochromeFill(@OriginalArg(0) int arg0) {
		super(0, true);
		this.value = 4096;
		this.value = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(0) int opcode) {
		if (opcode == 0) {
			this.value = (buffer.g1() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(14) int[] destination = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			Static403.fill(destination, 0, Static227.width, this.value);
		}
		return destination;
	}
}
