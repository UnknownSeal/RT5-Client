import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class LinkedList {

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Lclient!ag;")
	private Node cursor;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!ag;")
	public final Node sentinel = new Node();

	static {
		new LocalisedText("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public LinkedList() {
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ag;B)V")
	public void method3539(@OriginalArg(0) Node arg0) {
		if (arg0.previous != null) {
			arg0.unlink();
		}
		arg0.next = this.sentinel;
		arg0.previous = this.sentinel.previous;
		arg0.previous.next = arg0;
		arg0.next.previous = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ld;I)V")
	public void method3541(@OriginalArg(0) LinkedList arg0) {
		this.method3545(arg0, this.sentinel.next);
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)I")
	public int method3542() {
		@Pc(11) int local11 = 0;
		@Pc(15) Node local15 = this.sentinel.next;
		while (this.sentinel != local15) {
			local15 = local15.next;
			local11++;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public void clear() {
		while (true) {
			@Pc(5) Node node = this.sentinel.next;
			if (node == this.sentinel) {
				this.cursor = null;
				return;
			}
			node.unlink();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!ag;)V")
	public void addHead(@OriginalArg(1) Node node) {
		if (node.previous != null) {
			node.unlink();
		}
		node.next = this.sentinel.next;
		node.previous = this.sentinel;
		node.previous.next = node;
		node.next.previous = node;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ld;BLclient!ag;)V")
	private void method3545(@OriginalArg(0) LinkedList arg0, @OriginalArg(2) Node arg1) {
		@Pc(7) Node local7 = this.sentinel.previous;
		this.sentinel.previous = arg1.previous;
		arg1.previous.next = this.sentinel;
		if (arg1 != this.sentinel) {
			arg1.previous = arg0.sentinel.previous;
			arg1.previous.next = arg1;
			arg0.sentinel.previous = local7;
			local7.next = arg0.sentinel;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)Lclient!ag;")
	public Node method3546() {
		@Pc(6) Node local6 = this.cursor;
		if (this.sentinel == local6) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = local6.previous;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)Lclient!ag;")
	public Node tail() {
		@Pc(12) Node node = this.sentinel.previous;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.previous;
			return node;
		}
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)Lclient!ag;")
	public Node method3548() {
		@Pc(7) Node local7 = this.sentinel.next;
		if (this.sentinel == local7) {
			return null;
		} else {
			local7.unlink();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)Z")
	public boolean method3549() {
		return this.sentinel == this.sentinel.next;
	}

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "(B)Lclient!ag;")
	public Node method3550() {
		@Pc(14) Node local14 = this.sentinel.next;
		if (local14 == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = local14.next;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)Lclient!ag;")
	public Node method3551() {
		@Pc(13) Node local13 = this.cursor;
		if (local13 == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = local13.next;
			return local13;
		}
	}
}
