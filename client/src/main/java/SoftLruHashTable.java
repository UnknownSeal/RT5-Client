import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class SoftLruHashTable {

	@OriginalMember(owner = "client!hu", name = "w", descriptor = "Lclient!wc;")
	private final SecondaryLinkedList queue = new SecondaryLinkedList();

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
	private int available;

	@OriginalMember(owner = "client!hu", name = "y", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "Lclient!ad;")
	private final HashTable table;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(I)V")
	public SoftLruHashTable(@OriginalArg(0) int capacity) {
		this.available = capacity;
		this.capacity = capacity;
		@Pc(14) int bucketCount;
		for (bucketCount = 1; bucketCount + bucketCount < capacity; bucketCount += bucketCount) {
		}
		this.table = new HashTable(bucketCount);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object get(@OriginalArg(1) long arg0) {
		@Pc(10) ReferenceNode local10 = (ReferenceNode) this.table.get(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(25) Object local25 = local10.get();
		if (local25 == null) {
			local10.unlink();
			local10.unlinkSecondary();
			this.available += local10.anInt6636;
			return null;
		}
		if (local10.isSoft()) {
			@Pc(53) Class2_Sub2_Sub6_Sub2 local53 = new Class2_Sub2_Sub6_Sub2(local25, local10.anInt6636);
			this.table.put(local53, local10.key);
			this.queue.addTail(local53);
			local53.secondaryKey = 0L;
			local10.unlink();
			local10.unlinkSecondary();
		} else {
			this.queue.addTail(local10);
			local10.secondaryKey = 0L;
		}
		return local25;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)I")
	public int size() {
		@Pc(7) int size = 0;
		for (@Pc(18) ReferenceNode node = (ReferenceNode) this.queue.head(); node != null; node = (ReferenceNode) this.queue.next()) {
			if (!node.isSoft()) {
				size++;
			}
		}
		return size;
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V")
	public void clear() {
		this.queue.clear();
		this.table.clear();
		this.available = this.capacity;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V")
	public void clean(@OriginalArg(0) int maxAge) {
		if (ReferenceNodeFactory.SOFT_REFERENCE_NODE_FACTORY == null) {
			return;
		}
		for (@Pc(9) ReferenceNode node = (ReferenceNode) this.queue.head(); node != null; node = (ReferenceNode) this.queue.next()) {
			if (node.isSoft()) {
				if (node.get() == null) {
					node.unlink();
					node.unlinkSecondary();
					this.available++;
				}
			} else if (++node.secondaryKey > (long) maxAge) {
				@Pc(35) ReferenceNode softNode = ReferenceNodeFactory.SOFT_REFERENCE_NODE_FACTORY.create(node);
				this.table.put(softNode, node.key);
				Static145.insertAfter(softNode, node);
				node.unlink();
				node.unlinkSecondary();
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)I")
	public int method2616() {
		return this.available;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IILjava/lang/Object;J)V")
	private void method2617(@OriginalArg(2) Object arg0, @OriginalArg(3) long arg1) {
		if (this.capacity < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2626(arg1);
		this.available--;
		while (this.available < 0) {
			@Pc(36) ReferenceNode local36 = (ReferenceNode) this.queue.removeHead();
			this.method2625(local36);
		}
		@Pc(49) Class2_Sub2_Sub6_Sub2 local49 = new Class2_Sub2_Sub6_Sub2(arg0, 1);
		this.table.put(local49, arg1);
		this.queue.addTail(local49);
		local49.secondaryKey = 0;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method2618() {
		@Pc(17) ReferenceNode local17 = (ReferenceNode) this.table.next();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.get();
			if (local23 != null) {
				return local23;
			}
			@Pc(27) ReferenceNode local27 = local17;
			local17 = (ReferenceNode) this.table.next();
			local27.unlink();
			local27.unlinkSecondary();
			this.available += local17.anInt6636;
		}
		return null;
	}

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method2619() {
		@Pc(11) ReferenceNode local11 = (ReferenceNode) this.table.head();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.get();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) ReferenceNode local23 = local11;
			local11 = (ReferenceNode) this.table.next();
			local23.unlink();
			local23.unlinkSecondary();
			this.available += local11.anInt6636;
		}
		return null;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)I")
	public int method2620() {
		return this.capacity;
	}

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "(I)V")
	public void method2621() {
		for (@Pc(14) ReferenceNode local14 = (ReferenceNode) this.queue.head(); local14 != null; local14 = (ReferenceNode) this.queue.next()) {
			if (local14.isSoft()) {
				local14.unlink();
				local14.unlinkSecondary();
				this.available += local14.anInt6636;
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void put(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method2617(arg1, arg0);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZLclient!eu;)V")
	private void method2625(@OriginalArg(1) ReferenceNode arg0) {
		if (arg0 != null) {
			arg0.unlink();
			arg0.unlinkSecondary();
			this.available += arg0.anInt6636;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(JI)V")
	private void method2626(@OriginalArg(0) long arg0) {
		@Pc(14) ReferenceNode local14 = (ReferenceNode) this.table.get(arg0);
		this.method2625(local14);
	}
}
