import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class MonochromeImageCache {

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	private int size = 0;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	private int singleRow = -1;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Lclient!ld;")
	private LinkedList recentlyUsed = new LinkedList();

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Z")
	public boolean invalid = false;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	private final int height;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "[[I")
	private int[][] pixels;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[Lclient!se;")
	private MonochromeImageCacheEntry[] entries;

	static {
		new LocalisedText("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(III)V")
	public MonochromeImageCache(@OriginalArg(0) int capacity, @OriginalArg(1) int height, @OriginalArg(2) int width) {
		this.capacity = capacity;
		this.height = height;
		this.pixels = new int[this.capacity][width];
		this.entries = new MonochromeImageCacheEntry[this.height];
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public void clear() {
		for (@Pc(3) int i = 0; i < this.capacity; i++) {
			this.pixels[i] = null;
		}
		this.entries = null;
		this.pixels = null;
		this.recentlyUsed.clear();
		this.recentlyUsed = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
	public int[] get(@OriginalArg(0) int row) {
		if (this.capacity == this.height) {
			this.invalid = this.entries[row] == null;
			this.entries[row] = MonochromeImageCacheEntry.VALID;
			return this.pixels[row];
		} else if (this.capacity == 1) {
			this.invalid = row != this.singleRow;
			this.singleRow = row;
			return this.pixels[0];
		} else {
			@Pc(27) MonochromeImageCacheEntry entry = this.entries[row];
			if (entry == null) {
				this.invalid = true;
				if (this.capacity > this.size) {
					entry = new MonochromeImageCacheEntry(row, this.size);
					this.size++;
				} else {
					@Pc(52) MonochromeImageCacheEntry lruEntry = (MonochromeImageCacheEntry) this.recentlyUsed.tail();
					entry = new MonochromeImageCacheEntry(row, lruEntry.index);
					this.entries[lruEntry.row] = null;
					lruEntry.unlink();
				}
				this.entries[row] = entry;
			} else {
				this.invalid = false;
			}
			this.recentlyUsed.addHead(entry);
			return this.pixels[entry.index];
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)[[I")
	public int[][] get() {
		if (this.capacity != this.height) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int row = 0; row < this.capacity; row++) {
			this.entries[row] = MonochromeImageCacheEntry.VALID;
		}
		return this.pixels;
	}
}
