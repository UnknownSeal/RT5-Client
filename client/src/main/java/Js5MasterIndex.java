import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Js5MasterIndex {

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "Lclient!bt;")
	private Buffer buffer;

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "[Lclient!bl;")
	private Js5CachedResourceProvider[] aJs5CachedResourceProvider;

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "Lclient!ro;")
	private final Js5CacheQueue aJs5CacheQueue_3;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "Lclient!pp;")
	private final Js5NetQueue netQueue;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "Lclient!jj;")
	private Js5NetRequest request;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!pp;Lclient!ro;)V")
	public Js5MasterIndex(@OriginalArg(0) Js5NetQueue arg0, @OriginalArg(1) Js5CacheQueue arg1) {
		this.aJs5CacheQueue_3 = arg1;
		this.netQueue = arg0;
		if (!this.netQueue.isUrgentRequestQueueFull()) {
			this.request = this.netQueue.read(255, 255, true, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!rq;ILclient!rq;)Lclient!bl;")
	public Js5CachedResourceProvider getResourceProvider(@OriginalArg(1) Cache masterCache, @OriginalArg(3) Cache cache, @OriginalArg(0) int archive) {
		return this.getResourceProviderInternal(archive, cache, masterCache);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)Z")
	public boolean isReady() {
		if (this.buffer != null) {
			return true;
		}
		if (this.request == null) {
			if (this.netQueue.isUrgentRequestQueueFull()) {
				return false;
			}
			this.request = this.netQueue.read(255, 255, true, (byte) 0);
		}
		if (this.request.incomplete) {
			return false;
		} else {
			this.buffer = new Buffer(this.request.getData());
			this.aJs5CachedResourceProvider = new Js5CachedResourceProvider[(this.buffer.bytes.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZLclient!rq;Lclient!rq;I)Lclient!bl;")
	private Js5CachedResourceProvider getResourceProviderInternal(@OriginalArg(0) int archive, @OriginalArg(2) Cache arg1, @OriginalArg(3) Cache arg2) {
		if (this.buffer == null) {
			throw new RuntimeException();
		}
		this.buffer.offset = archive * 8 + 5;
		if (this.buffer.offset >= this.buffer.bytes.length) {
			throw new RuntimeException();
		} else if (this.aJs5CachedResourceProvider[archive] == null) {
			@Pc(45) int checksum = this.buffer.mg4();
			@Pc(50) int version = this.buffer.mg4();
			@Pc(64) Js5CachedResourceProvider provider = new Js5CachedResourceProvider(archive, arg1, arg2, this.netQueue, this.aJs5CacheQueue_3, checksum, version, true);
			this.aJs5CachedResourceProvider[archive] = provider;
			return provider;
		} else {
			return this.aJs5CachedResourceProvider[archive];
		}
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V")
	public void method3876() {
		if (this.aJs5CachedResourceProvider == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aJs5CachedResourceProvider.length; local11++) {
			if (this.aJs5CachedResourceProvider[local11] != null) {
				this.aJs5CachedResourceProvider[local11].method892();
			}
		}
		for (@Pc(38) int local38 = 0; local38 < this.aJs5CachedResourceProvider.length; local38++) {
			if (this.aJs5CachedResourceProvider[local38] != null) {
				this.aJs5CachedResourceProvider[local38].method894();
			}
		}
	}
}
