import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Map extends SecondaryNode {

	@OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
	public int anInt6864 = -1;

	@OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
	public int anInt6863 = 12800;

	@OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
	public int anInt6874 = 0;

	@OriginalMember(owner = "client!vj", name = "U", descriptor = "Z")
	public boolean valid = true;

	@OriginalMember(owner = "client!vj", name = "K", descriptor = "I")
	public int anInt6870 = 12800;

	@OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
	public int anInt6875 = -1;

	@OriginalMember(owner = "client!vj", name = "G", descriptor = "I")
	public int anInt6868 = 0;

	@OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
	public final int anInt6869;

	@OriginalMember(owner = "client!vj", name = "P", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "client!vj", name = "M", descriptor = "I")
	public final int anInt6872;

	@OriginalMember(owner = "client!vj", name = "R", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "client!vj", name = "H", descriptor = "Lclient!ld;")
	public final LinkedList chunks;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Map(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6869 = arg0;
		this.valid = arg5;
		this.anInt6875 = arg6;
		this.aString66 = arg2;
		this.anInt6864 = arg4;
		this.anInt6872 = arg3;
		this.aString67 = arg1;
		if (this.anInt6875 == 255) {
			this.anInt6875 = 0;
		}
		this.chunks = new LinkedList();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBLclient!r;)Lclient!vj;")
	public static Map create(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Js5 arg2) {
		@Pc(14) Buffer buffer = new Buffer(arg2.fetchFile(arg1, arg0));
		@Pc(54) Map map = new Map(arg0, buffer.gjstr(), buffer.gjstr(), buffer.mg4(), buffer.mg4(), buffer.g1() == 1, buffer.g1(), buffer.g1());
		@Pc(58) int length = buffer.g1();
		for (@Pc(60) int i = 0; i < length; i++) {
			map.chunks.addTail(new MapChunk(buffer.g1(), buffer.g2(), buffer.g2(), buffer.g2(), buffer.g2(), buffer.g2(), buffer.g2(), buffer.g2(), buffer.g2()));
		}
		map.computeBounds();
		return map;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[III)Z")
	public boolean method6144(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(17) MapChunk local17 = (MapChunk) this.chunks.head(); local17 != null; local17 = (MapChunk) this.chunks.next()) {
			if (local17.method5062(arg0, arg3, arg2)) {
				local17.method5058(arg3, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBI)Z")
	public boolean containsSource(@OriginalArg(2) int x, @OriginalArg(0) int z) {
		for (@Pc(11) MapChunk mapChunk = (MapChunk) this.chunks.head(); mapChunk != null; mapChunk = (MapChunk) this.chunks.next()) {
			if (mapChunk.containsSource(x, z)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([IIII)Z")
	public boolean method6148(@OriginalArg(0) int[] position, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) MapChunk mapChunk = (MapChunk) this.chunks.head(); mapChunk != null; mapChunk = (MapChunk) this.chunks.next()) {
			if (mapChunk.containsDisplay(arg1, arg2)) {
				mapChunk.convertDisplayToSource(arg2, arg1, position);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
	public void computeBounds() {
		this.anInt6870 = 12800;
		this.anInt6863 = 12800;
		this.anInt6868 = 0;
		this.anInt6874 = 0;
		for (@Pc(28) MapChunk mapChunk = (MapChunk) this.chunks.head(); mapChunk != null; mapChunk = (MapChunk) this.chunks.next()) {
			if (this.anInt6874 < mapChunk.anInt5537) {
				this.anInt6874 = mapChunk.anInt5537;
			}
			if (mapChunk.anInt5547 < this.anInt6863) {
				this.anInt6863 = mapChunk.anInt5547;
			}
			if (this.anInt6868 < mapChunk.anInt5542) {
				this.anInt6868 = mapChunk.anInt5542;
			}
			if (this.anInt6870 > mapChunk.anInt5534) {
				this.anInt6870 = mapChunk.anInt5534;
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZII[I)Z")
	public boolean method6150(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(16) MapChunk local16 = (MapChunk) this.chunks.head(); local16 != null; local16 = (MapChunk) this.chunks.next()) {
			if (local16.containsSource(arg0, arg1)) {
				local16.method5058(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}
}
