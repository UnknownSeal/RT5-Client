import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Js5CachedResourceProvider extends Js5ResourceProvider {

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!bl", name = "A", descriptor = "Lclient!ra;")
	private Class198 aClass198_1;

	@OriginalMember(owner = "client!bl", name = "L", descriptor = "Z")
	private boolean prefetchAll;

	@OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
	private int anInt685 = 0;

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "Lclient!ad;")
	private final HashTable aClass4_13 = new HashTable(16);

	@OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
	private int anInt688 = 0;

	@OriginalMember(owner = "client!bl", name = "K", descriptor = "Lclient!ld;")
	private final LinkedList aLinkedList_12 = new LinkedList();

	@OriginalMember(owner = "client!bl", name = "P", descriptor = "J")
	private long aLong21 = 0L;

	@OriginalMember(owner = "client!bl", name = "G", descriptor = "Lclient!rq;")
	private final Cache cache;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
	private final int archive;

	@OriginalMember(owner = "client!bl", name = "M", descriptor = "Z")
	private boolean verifyAll;

	@OriginalMember(owner = "client!bl", name = "J", descriptor = "Lclient!ld;")
	private LinkedList groupQueue;

	@OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
	private final int anInt683;

	@OriginalMember(owner = "client!bl", name = "N", descriptor = "Z")
	private final boolean dicardOrphans;

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "Lclient!rq;")
	private final Cache masterCache;

	@OriginalMember(owner = "client!bl", name = "y", descriptor = "Lclient!pp;")
	private final Js5NetQueue netQueue;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "Lclient!ro;")
	private final Js5CacheQueue cacheQueue;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
	private final int anInt670;

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "Lclient!ut;")
	private Class2_Sub2_Sub10 indexRequest;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(ILclient!rq;Lclient!rq;Lclient!pp;Lclient!ro;IIZ)V")
	public Js5CachedResourceProvider(@OriginalArg(0) int archive, @OriginalArg(1) Cache cache, @OriginalArg(2) Cache masterCache, @OriginalArg(3) Js5NetQueue netQueue, @OriginalArg(4) Js5CacheQueue cacheQueue, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean discardOrphans) {
		this.cache = cache;
		this.archive = archive;
		if (this.cache == null) {
			this.verifyAll = false;
		} else {
			this.verifyAll = true;
			this.groupQueue = new LinkedList();
		}
		this.anInt683 = arg6;
		this.dicardOrphans = discardOrphans;
		this.masterCache = masterCache;
		this.netQueue = netQueue;
		this.cacheQueue = cacheQueue;
		this.anInt670 = arg5;
		if (this.masterCache != null) {
			this.indexRequest = this.cacheQueue.readSynchronous(this.masterCache, this.archive);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
	public void method892() {
		if (this.groupQueue == null || this.method884() == null) {
			return;
		}
		for (@Pc(24) Node local24 = this.aLinkedList_12.head(); local24 != null; local24 = this.aLinkedList_12.next()) {
			@Pc(30) int local30 = (int) local24.key;
			if (local30 < 0 || local30 >= this.aClass198_1.anInt5592 || this.aClass198_1.anIntArray376[local30] == 0) {
				local24.unlink();
			} else {
				if (this.aByteArray5[local30] == 0) {
					this.method901(local30, 1);
				}
				if (this.aByteArray5[local30] == -1) {
					this.method901(local30, 2);
				}
				if (this.aByteArray5[local30] == 1) {
					local24.unlink();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
	public void method894() {
		if (this.groupQueue != null) {
			if (this.method884() == null) {
				return;
			}
			@Pc(25) boolean local25;
			@Pc(30) Node local30;
			@Pc(36) int local36;
			@Pc(129) Node local129;
			if (this.verifyAll) {
				local25 = true;
				for (local30 = this.groupQueue.head(); local30 != null; local30 = this.groupQueue.next()) {
					local36 = (int) local30.key;
					if (this.aByteArray5[local36] == 0) {
						this.method901(local36, 1);
					}
					if (this.aByteArray5[local36] == 0) {
						local25 = false;
					} else {
						local30.unlink();
					}
				}
				while (this.anInt688 < this.aClass198_1.anIntArray376.length) {
					if (this.aClass198_1.anIntArray376[this.anInt688] == 0) {
						this.anInt688++;
					} else {
						if (this.cacheQueue.size >= 250) {
							local25 = false;
							break;
						}
						if (this.aByteArray5[this.anInt688] == 0) {
							this.method901(this.anInt688, 1);
						}
						if (this.aByteArray5[this.anInt688] == 0) {
							local129 = new Node();
							local129.key = this.anInt688;
							this.groupQueue.addTail(local129);
							local25 = false;
						}
						this.anInt688++;
					}
				}
				if (local25) {
					this.anInt688 = 0;
					this.verifyAll = false;
				}
			} else if (this.prefetchAll) {
				local25 = true;
				for (local30 = this.groupQueue.head(); local30 != null; local30 = this.groupQueue.next()) {
					local36 = (int) local30.key;
					if (this.aByteArray5[local36] != 1) {
						this.method901(local36, 2);
					}
					if (this.aByteArray5[local36] == 1) {
						local30.unlink();
					} else {
						local25 = false;
					}
				}
				while (this.anInt688 < this.aClass198_1.anIntArray376.length) {
					if (this.aClass198_1.anIntArray376[this.anInt688] == 0) {
						this.anInt688++;
					} else {
						if (this.netQueue.method4635()) {
							local25 = false;
							break;
						}
						if (this.aByteArray5[this.anInt688] != 1) {
							this.method901(this.anInt688, 2);
						}
						if (this.aByteArray5[this.anInt688] != 1) {
							local129 = new Node();
							local129.key = this.anInt688;
							this.groupQueue.addTail(local129);
							local25 = false;
						}
						this.anInt688++;
					}
				}
				if (local25) {
					this.anInt688 = 0;
					this.prefetchAll = false;
				}
			} else {
				this.groupQueue = null;
			}
		}
		if (!this.dicardOrphans || MonotonicClock.currentTimeMillis() < this.aLong21) {
			return;
		}
		for (@Pc(329) Class2_Sub2_Sub10 local329 = (Class2_Sub2_Sub10) this.aClass4_13.head(); local329 != null; local329 = (Class2_Sub2_Sub10) this.aClass4_13.next()) {
			if (!local329.incomplete) {
				if (local329.aBoolean417) {
					if (!local329.urgent) {
						throw new RuntimeException();
					}
					local329.unlink();
				} else {
					local329.aBoolean417 = true;
				}
			}
		}
		this.aLong21 = MonotonicClock.currentTimeMillis() + 1000L;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)I")
	public int method895() {
		return this.aClass198_1 == null ? 0 : this.aClass198_1.anInt5591;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)I")
	public int method896() {
		if (this.method884() == null) {
			return this.indexRequest == null ? 0 : this.indexRequest.method5650();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] fetchGroup(@OriginalArg(0) int group) {
		@Pc(9) Class2_Sub2_Sub10 local9 = this.method901(group, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.getData();
			local9.unlink();
			return local17;
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(Z)I")
	public int method897() {
		if (this.aClass198_1 == null) {
			return 0;
		} else if (this.verifyAll) {
			@Pc(20) Node local20 = this.groupQueue.head();
			return local20 == null ? 0 : (int) local20.key;
		} else {
			return this.aClass198_1.anInt5591;
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)I")
	public int method898() {
		return this.anInt685;
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)V")
	public void prefetchAll() {
		if (this.cache != null) {
			this.prefetchAll = true;
			if (this.groupQueue == null) {
				this.groupQueue = new LinkedList();
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)Lclient!ut;")
	private Class2_Sub2_Sub10 method901(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub2_Sub10 local13 = (Class2_Sub2_Sub10) this.aClass4_13.get((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.urgent && local13.incomplete) {
			local13.unlink();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.cache == null || this.aByteArray5[arg0] == -1) {
					if (this.netQueue.isUrgentRequestQueueFull()) {
						return null;
					}
					local13 = this.netQueue.read(this.archive, arg0, true, (byte) 2);
				} else {
					local13 = this.cacheQueue.readSynchronous(this.cache, arg0);
				}
			} else if (arg1 == 1) {
				if (this.cache == null) {
					throw new RuntimeException();
				}
				local13 = this.cacheQueue.method5226(arg0, this.cache);
			} else if (arg1 == 2) {
				if (this.cache == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray5[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.netQueue.method4635()) {
					return null;
				}
				local13 = this.netQueue.read(this.archive, arg0, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass4_13.put(local13, (long) arg0);
		}
		if (local13.incomplete) {
			return null;
		}
		@Pc(162) byte[] local162 = local13.getData();
		@Pc(189) int local189;
		@Pc(292) Js5NetRequest local292;
		if (!(local13 instanceof Js5CacheRequest)) {
			try {
				if (local162 == null || local162.length <= 2) {
					throw new RuntimeException();
				}
				Static143.aCRC32_1.reset();
				Static143.aCRC32_1.update(local162, 0, local162.length - 2);
				local189 = (int) Static143.aCRC32_1.getValue();
				if (this.aClass198_1.anIntArray382[arg0] != local189) {
					throw new RuntimeException();
				}
				this.netQueue.errors = 0;
				this.netQueue.response = 0;
			} catch (@Pc(350) RuntimeException local350) {
				this.netQueue.method4642();
				local13.unlink();
				if (local13.urgent && !this.netQueue.isUrgentRequestQueueFull()) {
					local292 = this.netQueue.read(this.archive, arg0, true, (byte) 2);
					this.aClass4_13.put(local292, (long) arg0);
				}
				return null;
			}
			local162[local162.length - 2] = (byte) (this.aClass198_1.anIntArray378[arg0] >>> 8);
			local162[local162.length - 1] = (byte) this.aClass198_1.anIntArray378[arg0];
			if (this.cache != null) {
				this.cacheQueue.method5228(local162, arg0, this.cache);
				if (this.aByteArray5[arg0] != 1) {
					this.anInt685++;
					this.aByteArray5[arg0] = 1;
				}
			}
			if (!local13.urgent) {
				local13.unlink();
			}
			return local13;
		}
		try {
			if (local162 == null || local162.length <= 2) {
				throw new RuntimeException();
			}
			Static143.aCRC32_1.reset();
			Static143.aCRC32_1.update(local162, 0, local162.length - 2);
			local189 = (int) Static143.aCRC32_1.getValue();
			if (local189 != this.aClass198_1.anIntArray382[arg0]) {
				throw new RuntimeException();
			}
			@Pc(225) int local225 = ((local162[local162.length - 2] & 0xFF) << 8) + (local162[local162.length - 1] & 0xFF);
			if ((this.aClass198_1.anIntArray378[arg0] & 0xFFFF) != local225) {
				throw new RuntimeException();
			}
			if (this.aByteArray5[arg0] != 1) {
				this.anInt685++;
				this.aByteArray5[arg0] = 1;
			}
			if (!local13.urgent) {
				local13.unlink();
			}
			return local13;
		} catch (@Pc(266) Exception local266) {
			this.aByteArray5[arg0] = -1;
			local13.unlink();
			if (local13.urgent && !this.netQueue.isUrgentRequestQueueFull()) {
				local292 = this.netQueue.read(this.archive, arg0, true, (byte) 2);
				this.aClass4_13.put(local292, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
	@Override
	public void method885(@OriginalArg(0) int arg0) {
		if (this.cache == null) {
			return;
		}
		for (@Pc(20) Node local20 = this.aLinkedList_12.head(); local20 != null; local20 = this.aLinkedList_12.next()) {
			if ((long) arg0 == local20.key) {
				return;
			}
		}
		@Pc(46) Node local46 = new Node();
		local46.key = arg0;
		this.aLinkedList_12.addTail(local46);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)I")
	@Override
	public int method887(@OriginalArg(0) int arg0) {
		@Pc(19) Class2_Sub2_Sub10 local19 = (Class2_Sub2_Sub10) this.aClass4_13.get((long) arg0);
		return local19 == null ? 0 : local19.method5650();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)Lclient!ra;")
	@Override
	public Class198 method884() {
		if (this.aClass198_1 != null) {
			return this.aClass198_1;
		}
		if (this.indexRequest == null) {
			if (this.netQueue.isUrgentRequestQueueFull()) {
				return null;
			}
			this.indexRequest = this.netQueue.read(255, this.archive, true, (byte) 0);
		}
		if (this.indexRequest.incomplete) {
			return null;
		}
		@Pc(48) byte[] local48 = this.indexRequest.getData();
		if (this.indexRequest instanceof Js5CacheRequest) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass198_1 = new Class198(local48, this.anInt670);
				if (this.anInt683 != this.aClass198_1.anInt5587) {
					throw new RuntimeException();
				}
			} catch (@Pc(138) RuntimeException local138) {
				this.aClass198_1 = null;
				if (this.netQueue.isUrgentRequestQueueFull()) {
					this.indexRequest = null;
				} else {
					this.indexRequest = this.netQueue.read(255, this.archive, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass198_1 = new Class198(local48, this.anInt670);
			} catch (@Pc(68) RuntimeException local68) {
				this.netQueue.method4642();
				this.aClass198_1 = null;
				if (this.netQueue.isUrgentRequestQueueFull()) {
					this.indexRequest = null;
				} else {
					this.indexRequest = this.netQueue.read(255, this.archive, true, (byte) 0);
				}
				return null;
			}
			if (this.masterCache != null) {
				this.cacheQueue.method5228(local48, this.archive, this.masterCache);
			}
		}
		this.indexRequest = null;
		if (this.cache != null) {
			this.anInt685 = 0;
			this.aByteArray5 = new byte[this.aClass198_1.anInt5592];
		}
		return this.aClass198_1;
	}
}
