import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class2_Sub12_Sub2 extends Class2_Sub12 {

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "Lclient!ld;")
	private final LinkedList aLinkedList_16 = new LinkedList();

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "Lclient!ld;")
	private final LinkedList aLinkedList_17 = new LinkedList();

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
	private int anInt2000 = 0;

	@OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
	private int anInt1999 = -1;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4972(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1999 < 0) {
				this.method2082(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2000 + arg2 < this.anInt1999) {
				this.anInt2000 += arg2;
				this.method2082(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1999 - this.anInt2000;
			this.method2082(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2000 += local33;
			this.method2077();
			@Pc(60) Class2_Sub30 local60 = (Class2_Sub30) this.aLinkedList_17.head();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4695(this);
				if (local68 < 0) {
					local60.anInt5127 = 0;
					this.method2078(local60);
				} else {
					local60.anInt5127 = local68;
					this.method2080(local60.next, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "()Lclient!ll;")
	@Override
	public Class2_Sub12 method4977() {
		return (Class2_Sub12) this.aLinkedList_16.head();
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "()V")
	private void method2077() {
		if (this.anInt2000 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub30 local8 = (Class2_Sub30) this.aLinkedList_17.head(); local8 != null; local8 = (Class2_Sub30) this.aLinkedList_17.next()) {
			local8.anInt5127 -= this.anInt2000;
		}
		this.anInt1999 -= this.anInt2000;
		this.anInt2000 = 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!qa;)V")
	private void method2078(@OriginalArg(0) Class2_Sub30 arg0) {
		arg0.unlink();
		arg0.method4694();
		@Pc(9) Node local9 = this.aLinkedList_17.sentinel.next;
		if (local9 == this.aLinkedList_17.sentinel) {
			this.anInt1999 = -1;
		} else {
			this.anInt1999 = ((Class2_Sub30) local9).anInt5127;
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4973(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1999 < 0) {
				this.method2079(arg0);
				return;
			}
			if (this.anInt2000 + arg0 < this.anInt1999) {
				this.anInt2000 += arg0;
				this.method2079(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1999 - this.anInt2000;
			this.method2079(local29);
			arg0 -= local29;
			this.anInt2000 += local29;
			this.method2077();
			@Pc(50) Class2_Sub30 local50 = (Class2_Sub30) this.aLinkedList_17.head();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4695(this);
				if (local58 < 0) {
					local50.anInt5127 = 0;
					this.method2078(local50);
				} else {
					local50.anInt5127 = local58;
					this.method2080(local50.next, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	private void method2079(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub12 local5 = (Class2_Sub12) this.aLinkedList_16.head(); local5 != null; local5 = (Class2_Sub12) this.aLinkedList_16.next()) {
			local5.method4973(arg0);
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "()I")
	@Override
	public int method4976() {
		return 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ag;Lclient!qa;)V")
	private void method2080(@OriginalArg(0) Node arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		while (arg0 != this.aLinkedList_17.sentinel && ((Class2_Sub30) arg0).anInt5127 <= arg1.anInt5127) {
			arg0 = arg0.next;
		}
		Static97.method2100(arg1, arg0);
		this.anInt1999 = ((Class2_Sub30) this.aLinkedList_17.sentinel.next).anInt5127;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ll;)V")
	public synchronized void method2081(@OriginalArg(0) Class2_Sub12 arg0) {
		arg0.unlink();
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "([III)V")
	private void method2082(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub12 local5 = (Class2_Sub12) this.aLinkedList_16.head(); local5 != null; local5 = (Class2_Sub12) this.aLinkedList_16.next()) {
			local5.method4974(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()Lclient!ll;")
	@Override
	public Class2_Sub12 method4971() {
		return (Class2_Sub12) this.aLinkedList_16.next();
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(Lclient!ll;)V")
	public synchronized void method2083(@OriginalArg(0) Class2_Sub12 arg0) {
		this.aLinkedList_16.addHead(arg0);
	}
}
