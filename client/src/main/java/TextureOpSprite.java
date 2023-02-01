import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public class TextureOpSprite extends TextureOp {

	@OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
	protected int width;

	@OriginalMember(owner = "client!ek", name = "U", descriptor = "[I")
	protected int[] pixels;

	@OriginalMember(owner = "client!ek", name = "bb", descriptor = "I")
	protected int height;

	@OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
	private int spriteID = -1;

	static {
		new LocalisedText(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	public TextureOpSprite() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(0) int opcode) {
		if (opcode == 0) {
			this.spriteID = buffer.g2();
		}
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)Z")
	protected final boolean loadSprite() {
		if (this.pixels != null) {
			return true;
		} else if (this.spriteID >= 0) {
			@Pc(34) SoftwareSprite sprite = Static123.spriteGroupID >= 0 ? Static396.loadSoftwareSprite(Static111.spritesArchive, Static123.spriteGroupID, this.spriteID) : Static396.loadSoftwareSpriteAutoDetect(Static111.spritesArchive, this.spriteID);
			sprite.trim();
			this.pixels = sprite.method1685();
			this.height = sprite.anInt1533;
			this.width = sprite.anInt1531;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	@Override
	public final void clearImageCache() {
		super.clearImageCache();
		this.pixels = null;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)I")
	@Override
	public final int getSpriteID() {
		return this.spriteID;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(17) int[][] destination = super.colorImageCache.get(y);
		if (super.colorImageCache.invalid && this.loadSprite()) {
			@Pc(29) int[] destinationRed = destination[0];
			@Pc(33) int[] destinationGreen = destination[1];
			@Pc(37) int[] destinationBlue = destination[2];
			@Pc(57) int index = (Static24.height == this.height ? y : y * this.height / Static24.height) * this.width;
			@Pc(67) int x;
			@Pc(75) int sourceX;
			if (this.width == Static227.width) {
				for (x = 0; x < Static227.width; x++) {
					sourceX = this.pixels[index++];
					destinationBlue[x] = (sourceX & 0xFF) << 4;
					destinationGreen[x] = sourceX >> 4 & 0xFF0;
					destinationRed[x] = sourceX >> 12 & 0xFF0;
				}
			} else {
				for (x = 0; x < Static227.width; x++) {
					sourceX = x * this.width / Static227.width;
					@Pc(124) int color = this.pixels[index + sourceX];
					destinationBlue[x] = (color & 0xFF) << 4;
					destinationGreen[x] = color >> 4 & 0xFF0;
					destinationRed[x] = color >> 12 & 0xFF0;
				}
			}
		}
		return destination;
	}
}
