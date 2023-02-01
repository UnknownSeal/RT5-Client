import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class TextureOpColorFill extends TextureOp {

	@OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
	private int green;

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
	private int red;

	@OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
	private int blue;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
	private TextureOpColorFill(@OriginalArg(0) int arg0) {
		super(0, false);
		this.setColor(arg0);
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public TextureOpColorFill() {
		this(0);
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(IB)V")
	private void setColor(@OriginalArg(0) int color) {
		this.red = color >> 12 & 0xFF0;
		this.green = color >> 4 & 0xFF0;
		this.blue = (color & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(11) int[][] desination = super.colorImageCache.get(y);
		if (super.colorImageCache.invalid) {
			@Pc(27) int[] red = desination[0];
			@Pc(31) int[] green = desination[1];
			@Pc(35) int[] blue = desination[2];
			for (@Pc(37) int x = 0; x < Static227.width; x++) {
				red[x] = this.red;
				green[x] = this.green;
				blue[x] = this.blue;
			}
		}
		return desination;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(0) int opcode) {
		if (opcode == 0) {
			this.setColor(buffer.ig3());
		}
	}
}
