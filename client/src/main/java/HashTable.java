import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class HashTable {

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!ag;")
	private Node searchCursor;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "J")
	private long searchKey;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Lclient!ag;")
	private Node iteratorCursor;

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
	private int iteratorBucket = 0;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "[Lclient!ag;")
	public final Node[] buckets;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
	public final int bucketCount;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(I)V")
	public HashTable(@OriginalArg(0) int arg0) {
		this.buckets = new Node[arg0];
		this.bucketCount = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Node local23 = this.buckets[local13] = new Node();
			local23.next = local23;
			local23.previous = local23;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)Lclient!ag;")
	public Node next() {
		@Pc(24) Node node;
		if (this.iteratorBucket > 0 && this.buckets[this.iteratorBucket - 1] != this.iteratorCursor) {
			node = this.iteratorCursor;
			this.iteratorCursor = node.next;
			return node;
		}
		while (this.bucketCount > this.iteratorBucket) {
			node = this.buckets[this.iteratorBucket++].next;
			if (this.buckets[this.iteratorBucket - 1] != node) {
				this.iteratorCursor = node.next;
				return node;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)Lclient!ag;")
	public Node head() {
		this.iteratorBucket = 0;
		return this.next();
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	public void clear() {
		for (@Pc(3) int i = 0; i < this.bucketCount; i++) {
			@Pc(10) Node sentinel = this.buckets[i];
			while (true) {
				@Pc(13) Node node = sentinel.next;
				if (node == sentinel) {
					break;
				}
				node.unlink();
			}
		}
		this.iteratorCursor = null;
		this.searchCursor = null;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)Lclient!ag;")
	public Node nextWithKey() {
		if (this.searchCursor == null) {
			return null;
		}
		@Pc(34) Node sentinel = this.buckets[(int) ((long) (this.bucketCount - 1) & this.searchKey)];
		while (sentinel != this.searchCursor) {
			if (this.searchCursor.key == this.searchKey) {
				@Pc(46) Node node = this.searchCursor;
				this.searchCursor = this.searchCursor.next;
				return node;
			}
			this.searchCursor = this.searchCursor.next;
		}
		this.searchCursor = null;
		return null;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)I")
	public int method83() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.bucketCount; local14++) {
			@Pc(21) Node local21 = this.buckets[local14];
			for (@Pc(24) Node local24 = local21.next; local24 != local21; local24 = local24.next) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([Lclient!ag;I)I")
	public int method84(@OriginalArg(0) Node[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.bucketCount; local9++) {
			@Pc(16) Node local16 = this.buckets[local9];
			for (@Pc(19) Node local19 = local16.next; local19 != local16; local19 = local19.next) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLclient!ag;J)V")
	public void put(@OriginalArg(1) Node value, @OriginalArg(2) long key) {
		if (value.previous != null) {
			value.unlink();
		}
		@Pc(28) Node sentinel = this.buckets[(int) ((long) (this.bucketCount - 1) & key)];
		value.next = sentinel;
		value.previous = sentinel.previous;
		value.previous.next = value;
		value.key = key;
		value.next.previous = value;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)I")
	public int getBucketCount() {
		return this.bucketCount;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(JI)Lclient!ag;")
	public Node get(@OriginalArg(0) long key) {
		this.searchKey = key;
		@Pc(23) Node sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];
		for (this.searchCursor = sentinel.next; this.searchCursor != sentinel; this.searchCursor = this.searchCursor.next) {
			if (this.searchCursor.key == key) {
				@Pc(41) Node value = this.searchCursor;
				this.searchCursor = this.searchCursor.next;
				return value;
			}
		}
		this.searchCursor = null;
		return null;
	}
}
