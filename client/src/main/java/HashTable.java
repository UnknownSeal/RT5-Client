import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class HashTable {

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!ag;")
	private Node aClass2_9;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Lclient!ag;")
	private Node aClass2_10;

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
	private int anInt104 = 0;

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
	public Node method79() {
		@Pc(24) Node local24;
		if (this.anInt104 > 0 && this.buckets[this.anInt104 - 1] != this.aClass2_10) {
			local24 = this.aClass2_10;
			this.aClass2_10 = local24.next;
			return local24;
		}
		while (this.bucketCount > this.anInt104) {
			local24 = this.buckets[this.anInt104++].next;
			if (this.buckets[this.anInt104 - 1] != local24) {
				this.aClass2_10 = local24.next;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)Lclient!ag;")
	public Node method80() {
		this.anInt104 = 0;
		return this.method79();
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	public void method81() {
		for (@Pc(3) int local3 = 0; local3 < this.bucketCount; local3++) {
			@Pc(10) Node local10 = this.buckets[local3];
			while (true) {
				@Pc(13) Node local13 = local10.next;
				if (local13 == local10) {
					break;
				}
				local13.unlink();
			}
		}
		this.aClass2_10 = null;
		this.aClass2_9 = null;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)Lclient!ag;")
	public Node method82() {
		if (this.aClass2_9 == null) {
			return null;
		}
		@Pc(34) Node local34 = this.buckets[(int) ((long) (this.bucketCount - 1) & this.aLong10)];
		while (local34 != this.aClass2_9) {
			if (this.aClass2_9.key == this.aLong10) {
				@Pc(46) Node local46 = this.aClass2_9;
				this.aClass2_9 = this.aClass2_9.next;
				return local46;
			}
			this.aClass2_9 = this.aClass2_9.next;
		}
		this.aClass2_9 = null;
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
	public int method89() {
		return this.bucketCount;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(JI)Lclient!ag;")
	public Node method90(@OriginalArg(0) long arg0) {
		this.aLong10 = arg0;
		@Pc(23) Node local23 = this.buckets[(int) (arg0 & (long) (this.bucketCount - 1))];
		for (this.aClass2_9 = local23.next; this.aClass2_9 != local23; this.aClass2_9 = this.aClass2_9.next) {
			if (arg0 == this.aClass2_9.key) {
				@Pc(41) Node local41 = this.aClass2_9;
				this.aClass2_9 = this.aClass2_9.next;
				return local41;
			}
		}
		this.aClass2_9 = null;
		return null;
	}
}
