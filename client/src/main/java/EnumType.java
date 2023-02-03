import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class EnumType {

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "Lclient!ad;")
	private HashTable inverseTable;

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "Lclient!ad;")
	public HashTable table;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "C")
	public char valueType;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
	private int defaultInt;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "C")
	public char keyType;

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "Ljava/lang/String;")
	private String defaultString = "null";

	static {
		new LocalisedText("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
		new LocalisedText("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)I")
	public int getInt(@OriginalArg(1) int key) {
		if (this.table == null) {
			return this.defaultInt;
		} else {
			@Pc(23) IntNode node = (IntNode) this.table.get(key);
			return node == null ? this.defaultInt : node.value;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!bt;BI)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(2) int opcode) {
		if (opcode == 1) {
			this.keyType = Static78.decodeChar(buffer.g1b());
		} else if (opcode == 2) {
			this.valueType = Static78.decodeChar(buffer.g1b());
		} else if (opcode == 3) {
			this.defaultString = buffer.gjstr();
		} else if (opcode == 4) {
			this.defaultInt = buffer.mg4();
		} else if (opcode == 5 || opcode == 6) {
			@Pc(45) int size = buffer.g2();
			this.table = new HashTable(Static162.clp2(size));
			for (@Pc(55) int i = 0; i < size; i++) {
				@Pc(61) int key = buffer.mg4();
				@Pc(73) Node node;
				if (opcode == 5) {
					node = new StringNode(buffer.gjstr());
				} else {
					node = new IntNode(buffer.mg4());
				}
				this.table.put(node, key);
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
	private void inverseInts() {
		this.inverseTable = new HashTable(this.table.getBucketCount());
		for (@Pc(20) IntNode node = (IntNode) this.table.head(); node != null; node = (IntNode) this.table.next()) {
			@Pc(29) IntNode inverseNode = new IntNode((int) node.key);
			this.inverseTable.put(inverseNode, node.value);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean containsValue(@OriginalArg(1) String value) {
		if (this.table == null) {
			return false;
		}
		if (this.inverseTable == null) {
			this.method1773();
		}
		for (@Pc(37) EnumStringEntry node = (EnumStringEntry) this.inverseTable.get(Static80.longHashCode(value)); node != null; node = (EnumStringEntry) this.inverseTable.nextWithKey()) {
			if (node.value.equals(value)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(II)Z")
	public boolean containsValue(@OriginalArg(1) int value) {
		if (this.table == null) {
			return false;
		}
		if (this.inverseTable == null) {
			this.inverseInts();
		}
		@Pc(29) IntNode node = (IntNode) this.inverseTable.get(value);
		return node != null;
	}

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(B)V")
	private void method1773() {
		this.inverseTable = new HashTable(this.table.getBucketCount());
		for (@Pc(28) StringNode local28 = (StringNode) this.table.head(); local28 != null; local28 = (StringNode) this.table.next()) {
			@Pc(39) EnumStringEntry local39 = new EnumStringEntry(local28.value, (int) local28.key);
			this.inverseTable.put(local39, Static80.longHashCode(local28.value));
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILclient!bt;)V")
	public void decode(@OriginalArg(1) Buffer buffer) {
		while (true) {
			@Pc(11) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(buffer, opcode);
		}
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(II)Ljava/lang/String;")
	public String getString(@OriginalArg(0) int key) {
		if (this.table == null) {
			return this.defaultString;
		} else {
			@Pc(19) StringNode node = (StringNode) this.table.get(key);
			return node == null ? this.defaultString : node.value;
		}
	}
}
