import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Js5CacheQueue implements Runnable {

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "Lclient!wc;")
	private final Class246 queue = new Class246();

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "Z")
	private boolean stop = false;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
	public int size = 0;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "Ljava/lang/Thread;")
	private Thread thread;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Js5CacheQueue(@OriginalArg(0) Class152 arg0) {
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
			@Pc(6) Class246 local6 = this.queue;
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
			request.aBoolean416 = false;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLclient!td;)V")
	private void method5223(@OriginalArg(1) Js5CacheRequest arg0) {
		@Pc(2) Class246 local2 = this.queue;
		synchronized (this.queue) {
			this.queue.addTail(arg0);
			this.size++;
			this.queue.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBLclient!rq;)Lclient!td;")
	public Js5CacheRequest method5225(@OriginalArg(0) int arg0, @OriginalArg(2) Cache arg1) {
		@Pc(15) Js5CacheRequest local15 = new Js5CacheRequest();
		local15.type = 1;
		@Pc(21) Class246 local21 = this.queue;
		synchronized (this.queue) {
			@Pc(29) Js5CacheRequest local29 = (Js5CacheRequest) this.queue.head();
			while (true) {
				if (local29 == null) {
					break;
				}
				if (local29.secondaryKey == (long) arg0 && local29.cache == arg1 && local29.type == 2) {
					local15.data = local29.data;
					local15.aBoolean416 = false;
					return local15;
				}
				local29 = (Js5CacheRequest) this.queue.next();
			}
		}
		local15.data = arg1.read(arg0);
		local15.aBoolean416 = false;
		local15.aBoolean418 = true;
		return local15;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!rq;Z)Lclient!td;")
	public Js5CacheRequest method5226(@OriginalArg(0) int arg0, @OriginalArg(1) Cache arg1) {
		@Pc(12) Js5CacheRequest local12 = new Js5CacheRequest();
		local12.cache = arg1;
		local12.type = 3;
		local12.aBoolean418 = false;
		local12.secondaryKey = arg0;
		this.method5223(local12);
		return local12;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V")
	public void method5227() {
		this.stop = true;
		@Pc(9) Class246 local9 = this.queue;
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
		local13.aBoolean418 = false;
		local13.secondaryKey = arg1;
		local13.cache = arg2;
		local13.type = 2;
		this.method5223(local13);
		return local13;
	}
}
