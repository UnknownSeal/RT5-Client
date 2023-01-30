import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class Node {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!ag;")
	public Node next;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "J")
	public long key;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Lclient!ag;")
	public Node previous;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Z")
	public final boolean isLinked() {
		return this.previous != null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public final void unlink() {
		if (this.previous != null) {
			this.previous.next = this.next;
			this.next.previous = this.previous;
			this.previous = null;
			this.next = null;
		}
	}
}
