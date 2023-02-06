import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class116 {

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Lclient!tl;")
	private SecondaryNode aClass2_Sub2_32 = new SecondaryNode();

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "Lclient!wc;")
	private final SecondaryLinkedList queue = new SecondaryLinkedList();

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
	private final int anInt3150;

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
	private int available;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "Lclient!ad;")
	private final HashTable table;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I)V")
	public Class116(@OriginalArg(0) int arg0) {
		this.anInt3150 = arg0;
		this.available = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.table = new HashTable(local19);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(JB)Lclient!tl;")
	public SecondaryNode get(@OriginalArg(0) long key) {
		@Pc(15) SecondaryNode value = (SecondaryNode) this.table.get(key);
		if (value != null) {
			this.queue.addTail(value);
		}
		return value;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V")
	public void method3152() {
		this.queue.clear();
		this.table.clear();
		this.aClass2_Sub2_32 = new SecondaryNode();
		this.available = this.anInt3150;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!tl;J)V")
	public void put(@OriginalArg(2) long key, @OriginalArg(1) SecondaryNode value) {
		if (this.available == 0) {
			@Pc(7) SecondaryNode node = this.queue.removeHead();
			node.unlink();
			node.unlinkSecondary();
			if (this.aClass2_Sub2_32 == node) {
				node = this.queue.removeHead();
				node.unlink();
				node.unlinkSecondary();
			}
		} else {
			this.available--;
		}
		this.table.put(value, key);
		this.queue.addTail(value);
	}
}
