import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class DelayedStateChange extends SecondaryNode {

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Lclient!wc;")
	public static final SecondaryLinkedList clientQueue = new SecondaryLinkedList();
	@OriginalMember(owner = "client!vl", name = "bb", descriptor = "Lclient!wc;")
	public static final SecondaryLinkedList serverQueue = new SecondaryLinkedList();
	@OriginalMember(owner = "client!ra", name = "u", descriptor = "Lclient!ad;")
	public static final HashTable changes = new HashTable(16);
	@OriginalMember(owner = "client!gg", name = "D", descriptor = "Ljava/lang/String;")
	public String aString21;

	@OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
	public int anInt2284;

	@OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
	public int anInt2289;

	@OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
	public int anInt2290;

	static {
		new LocalisedText("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(II)V")
	public DelayedStateChange(@OriginalArg(0) int type, @OriginalArg(1) int id) {
		super.key = (long) id | (long) type << 32;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
	public static void clear() {
		changes.clear();
		clientQueue.clear();
		serverQueue.clear();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)Lclient!gg;")
	public static DelayedStateChange poll() {
		@Pc(16) DelayedStateChange serverChange = (DelayedStateChange) serverQueue.head();
		if (serverChange != null) {
			serverChange.unlink();
			serverChange.unlinkSecondary();
			return serverChange;
		}
		do {
			serverChange = (DelayedStateChange) clientQueue.head();
			if (serverChange == null) {
				return null;
			}
			if (serverChange.getTime() > MonotonicClock.currentTimeMillis()) {
				return null;
			}
			serverChange.unlink();
			serverChange.unlinkSecondary();
		} while ((serverChange.secondaryKey & Long.MIN_VALUE) == 0L);
		return serverChange;
	}

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V")
    public static void setComponentModelClient(@OriginalArg(1) int id) {
        @Pc(8) DelayedStateChange change = create(4, id);
        change.pushClient();
    }

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Lclient!gg;")
	public static DelayedStateChange create(@OriginalArg(0) int type, @OriginalArg(2) int id) {
		@Pc(15) DelayedStateChange change = (DelayedStateChange) changes.get((long) id | (long) type << 32);
		if (change == null) {
			change = new DelayedStateChange(type, id);
			changes.put(change, change.key);
		}
		return change;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
	public static void setComponentModelAngleClient(@OriginalArg(1) int id) {
		@Pc(13) DelayedStateChange change = create(8, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(ZI)V")
	public static void setComponentModelOffsetClient(@OriginalArg(1) int id) {
		@Pc(12) DelayedStateChange change = create(10, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)V")
	public static void setComponentModelAnimClient(@OriginalArg(0) int id) {
		@Pc(8) DelayedStateChange change = create(5, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)V")
	public static void setComponentTextClient(@OriginalArg(1) int id) {
		@Pc(16) DelayedStateChange change = create(3, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V")
	public static void method2439(@OriginalArg(1) int id) {
		@Pc(17) DelayedStateChange change = create(16, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)V")
	public static void setComponentObjClient(@OriginalArg(1) int id) {
		@Pc(13) DelayedStateChange change = create(9, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I")
	public int getType() {
		return (int) (super.key >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)J")
	public long getTime() {
		return super.secondaryKey & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)I")
	public int getKey() {
		return (int) super.key;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
	public void pushServer() {
		super.secondaryKey |= Long.MIN_VALUE;
		if (this.getTime() == 0L) {
			serverQueue.addTail(this);
		}
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V")
	public void pushClient() {
		super.secondaryKey = MonotonicClock.currentTimeMillis() + 500L | super.secondaryKey & Long.MIN_VALUE;
		clientQueue.addTail(this);
	}
}
