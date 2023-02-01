import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class MixerPcmStream extends PcmStream {

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "Lclient!ld;")
	private final LinkedList subStreams = new LinkedList();

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "Lclient!ld;")
	private final LinkedList listener = new LinkedList();

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
	private int offset = 0;

	@OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
	private int remaining = -1;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void read(@OriginalArg(0) int[] samples, @OriginalArg(1) int offset, @OriginalArg(2) int length) {
		do {
			if (this.remaining < 0) {
				this.readSubStreams(samples, offset, length);
				return;
			}
			if (this.offset + length < this.remaining) {
				this.offset += length;
				this.readSubStreams(samples, offset, length);
				return;
			}
			@Pc(33) int n = this.remaining - this.offset;
			this.readSubStreams(samples, offset, n);
			offset += n;
			length -= n;
			this.offset += n;
			this.normalise();
			@Pc(60) MixerListener listener = (MixerListener) this.listener.head();
			synchronized (listener) {
				@Pc(68) int remaining = listener.execute(this);
				if (remaining < 0) {
					listener.remaining = 0;
					this.removeListener(listener);
				} else {
					listener.remaining = remaining;
					this.addListener(listener.next, listener);
				}
			}
		} while (length != 0);
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "()Lclient!ll;")
	@Override
	public PcmStream firstSubStream() {
		return (PcmStream) this.subStreams.head();
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "()V")
	private void normalise() {
		if (this.offset <= 0) {
			return;
		}
		for (@Pc(8) MixerListener listener = (MixerListener) this.listener.head(); listener != null; listener = (MixerListener) this.listener.next()) {
			listener.remaining -= this.offset;
		}
		this.remaining -= this.offset;
		this.offset = 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!qa;)V")
	private void removeListener(@OriginalArg(0) MixerListener listener) {
		listener.unlink();
		listener.onUnlink();
		@Pc(9) Node node = this.listener.sentinel.next;
		if (node == this.listener.sentinel) {
			this.remaining = -1;
		} else {
			this.remaining = ((MixerListener) node).remaining;
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void skip(@OriginalArg(0) int length) {
		do {
			if (this.remaining < 0) {
				this.skipSubStreams(length);
				return;
			}
			if (this.offset + length < this.remaining) {
				this.offset += length;
				this.skipSubStreams(length);
				return;
			}
			@Pc(29) int n = this.remaining - this.offset;
			this.skipSubStreams(n);
			length -= n;
			this.offset += n;
			this.normalise();
			@Pc(50) MixerListener listener = (MixerListener) this.listener.head();
			synchronized (listener) {
				@Pc(58) int remaining = listener.execute(this);
				if (remaining < 0) {
					listener.remaining = 0;
					this.removeListener(listener);
				} else {
					listener.remaining = remaining;
					this.addListener(listener.next, listener);
				}
			}
		} while (length != 0);
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	private void skipSubStreams(@OriginalArg(0) int length) {
		for (@Pc(5) PcmStream stream = (PcmStream) this.subStreams.head(); stream != null; stream = (PcmStream) this.subStreams.next()) {
			stream.skip(length);
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "()I")
	@Override
	public int method4976() {
		return 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ag;Lclient!qa;)V")
	private void addListener(@OriginalArg(0) Node node, @OriginalArg(1) MixerListener listener) {
		while (node != this.listener.sentinel && ((MixerListener) node).remaining <= listener.remaining) {
			node = node.next;
		}
		LinkedList.insertBefore(listener, node);
		this.remaining = ((MixerListener) this.listener.sentinel.next).remaining;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ll;)V")
	public synchronized void method2081(@OriginalArg(0) PcmStream arg0) {
		arg0.unlink();
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "([III)V")
	private void readSubStreams(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) PcmStream local5 = (PcmStream) this.subStreams.head(); local5 != null; local5 = (PcmStream) this.subStreams.next()) {
			local5.method4974(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()Lclient!ll;")
	@Override
	public PcmStream nextSubStream() {
		return (PcmStream) this.subStreams.next();
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(Lclient!ll;)V")
	public synchronized void addSubStream(@OriginalArg(0) PcmStream stream) {
		this.subStreams.addHead(stream);
	}
}
