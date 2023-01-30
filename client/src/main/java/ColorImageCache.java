import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class ColorImageCache {

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
	private int singleRow = -1;

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
	private int size = 0;

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "Lclient!ld;")
	private LinkedList recentlyUsed = new LinkedList();

	@OriginalMember(owner = "client!vs", name = "w", descriptor = "Z")
	public boolean invalid = false;

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
	private final int height;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "[[[I")
	private int[][][] pixels;

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "[Lclient!wh;")
	private ColorImageCacheEntry[] entries;

	static {
		new LocalisedText("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(III)V")
	public ColorImageCache(@OriginalArg(0) int capacity, @OriginalArg(1) int height, @OriginalArg(2) int width) {
		this.capacity = capacity;
		this.height = height;
		this.pixels = new int[this.capacity][3][width];
		this.entries = new ColorImageCacheEntry[this.height];
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)[[I")
	public int[][] get(@OriginalArg(0) int row) {
		if (this.height == this.capacity) {
			this.invalid = this.entries[row] == null;
			this.entries[row] = ColorImageCacheEntry.VALID;
			return this.pixels[row];
		} else if (this.capacity == 1) {
			this.invalid = row != this.singleRow;
			this.singleRow = row;
			return this.pixels[0];
		} else {
			@Pc(30) ColorImageCacheEntry entry = this.entries[row];
			if (entry == null) {
				this.invalid = true;
				if (this.capacity <= this.size) {
					@Pc(55) ColorImageCacheEntry lruEntry = (ColorImageCacheEntry) this.recentlyUsed.tail();
					entry = new ColorImageCacheEntry(row, lruEntry.index);
					this.entries[lruEntry.row] = null;
					lruEntry.unlink();
				} else {
					entry = new ColorImageCacheEntry(row, this.size);
					this.size++;
				}
				this.entries[row] = entry;
			} else {
				this.invalid = false;
			}
			this.recentlyUsed.addHead(entry);
			return this.pixels[entry.index];
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)[[[I")
	public int[][][] get() {
		if (this.capacity != this.height) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(28) int row = 0; row < this.capacity; row++) {
			this.entries[row] = ColorImageCacheEntry.VALID;
		}
		return this.pixels;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
	public void clear() {
		for (@Pc(3) int i = 0; i < this.capacity; i++) {
			this.pixels[i][0] = null;
			this.pixels[i][1] = null;
			this.pixels[i][2] = null;
			this.pixels[i] = null;
		}
		this.entries = null;
		this.pixels = null;
		this.recentlyUsed.clear();
		this.recentlyUsed = null;
	}
}
