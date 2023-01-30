import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class246 {

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!tl;")
	private SecondaryNode cursor;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!tl;")
	private final SecondaryNode sentinel = new SecondaryNode();

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class246() {
		this.sentinel.secondaryPrevious = this.sentinel;
		this.sentinel.secondaryNext = this.sentinel;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Lclient!tl;")
	public SecondaryNode next() {
		@Pc(6) SecondaryNode node = this.cursor;
		if (this.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.secondaryNext;
			return node;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lclient!tl;")
	public SecondaryNode head() {
		@Pc(14) SecondaryNode node = this.sentinel.secondaryNext;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.secondaryNext;
			return node;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
	public int method6337() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) SecondaryNode local11 = this.sentinel.secondaryNext; local11 != this.sentinel; local11 = local11.secondaryNext) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Lclient!tl;")
	public SecondaryNode removeHead() {
		@Pc(7) SecondaryNode local7 = this.sentinel.secondaryNext;
		if (this.sentinel == local7) {
			return null;
		} else {
			local7.unlinkSecondary();
			return local7;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!tl;)V")
	public void addTail(@OriginalArg(1) SecondaryNode node) {
		if (node.secondaryPrevious != null) {
			node.unlinkSecondary();
		}
		node.secondaryPrevious = this.sentinel.secondaryPrevious;
		node.secondaryNext = this.sentinel;
		node.secondaryPrevious.secondaryNext = node;
		node.secondaryNext.secondaryPrevious = node;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
	public void clear() {
		while (true) {
			@Pc(9) SecondaryNode node = this.sentinel.secondaryNext;
			if (node == this.sentinel) {
				this.cursor = null;
				return;
			}
			node.unlinkSecondary();
		}
	}
}
