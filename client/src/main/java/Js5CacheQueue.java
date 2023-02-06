import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Js5CacheQueue implements Runnable {

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "Lclient!wc;")
	private final SecondaryLinkedList queue = new SecondaryLinkedList();

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "Z")
	private boolean stop = false;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
	public int size = 0;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "Ljava/lang/Thread;")
	private Thread thread;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Js5CacheQueue(@OriginalArg(0) SignLink arg0) {
		@Pc(20) PrivelegedRequest request = arg0.startThread(this, 5);
		while (request.status == 0) {
			Static231.sleep(10L);
		}
		if (request.status == 2) {
			throw new RuntimeException();
		}
		this.thread = (Thread) request.result;
	}

	@OriginalMember(owner = "client!ro", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.stop) {
			@Pc(6) SecondaryLinkedList local6 = this.queue;
			@Pc(14) Js5CacheRequest request;
			synchronized (this.queue) {
				request = (Js5CacheRequest) this.queue.removeHead();
				if (request == null) {
					try {
						this.queue.wait();
					} catch (@Pc(21) InterruptedException exception) {
					}
					continue;
				}
				this.size--;
			}
			try {
				if (request.type == 2) {
					request.cache.write(request.data.length, request.data, (int) request.secondaryKey);
				} else if (request.type == 3) {
					request.data = request.cache.read((int) request.secondaryKey);
				}
			} catch (@Pc(74) Exception local74) {
				Static262.report(local74, null);
			}
			request.incomplete = false;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLclient!td;)V")
	private void method5223(@OriginalArg(1) Js5CacheRequest arg0) {
		@Pc(2) SecondaryLinkedList local2 = this.queue;
		synchronized (this.queue) {
			this.queue.addTail(arg0);
			this.size++;
			this.queue.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBLclient!rq;)Lclient!td;")
	public Js5CacheRequest readSynchronous(@OriginalArg(2) Cache cache, @OriginalArg(0) int group) {
		@Pc(15) Js5CacheRequest request = new Js5CacheRequest();
		request.type = 1;
		@Pc(21) SecondaryLinkedList local21 = this.queue;
		synchronized (this.queue) {
			@Pc(29) Js5CacheRequest otherRequest = (Js5CacheRequest) this.queue.head();
			while (true) {
				if (otherRequest == null) {
					break;
				}
				if (otherRequest.secondaryKey == (long) group && otherRequest.cache == cache && otherRequest.type == 2) {
					request.data = otherRequest.data;
					request.incomplete = false;
					return request;
				}
				otherRequest = (Js5CacheRequest) this.queue.next();
			}
		}
		request.data = cache.read(group);
		request.incomplete = false;
		request.urgent = true;
		return request;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!rq;Z)Lclient!td;")
	public Js5CacheRequest method5226(@OriginalArg(0) int arg0, @OriginalArg(1) Cache arg1) {
		@Pc(12) Js5CacheRequest local12 = new Js5CacheRequest();
		local12.cache = arg1;
		local12.type = 3;
		local12.urgent = false;
		local12.secondaryKey = arg0;
		this.method5223(local12);
		return local12;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V")
	public void method5227() {
		this.stop = true;
		@Pc(9) SecondaryLinkedList local9 = this.queue;
		synchronized (this.queue) {
			this.queue.notifyAll();
		}
		try {
			this.thread.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		this.thread = null;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "([BILclient!rq;I)Lclient!td;")
	public Js5CacheRequest method5228(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Cache arg2) {
		@Pc(13) Js5CacheRequest local13 = new Js5CacheRequest();
		local13.data = arg0;
		local13.urgent = false;
		local13.secondaryKey = arg1;
		local13.cache = arg2;
		local13.type = 2;
		this.method5223(local13);
		return local13;
	}
}
