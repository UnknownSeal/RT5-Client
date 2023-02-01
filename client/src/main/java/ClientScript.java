import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class ClientScript extends SecondaryNode {

	@OriginalMember(owner = "client!js", name = "D", descriptor = "I")
	public int intLocals;

	@OriginalMember(owner = "client!js", name = "E", descriptor = "Ljava/lang/String;")
	public String name;

	@OriginalMember(owner = "client!js", name = "F", descriptor = "[I")
	public int[] opcodes;

	@OriginalMember(owner = "client!js", name = "G", descriptor = "Lclient!bc;")
	public Class16 aClass16_4;

	@OriginalMember(owner = "client!js", name = "I", descriptor = "[Lclient!ad;")
	public HashTable[] switchTables;

	@OriginalMember(owner = "client!js", name = "K", descriptor = "[I")
	public int[] intOperands;

	@OriginalMember(owner = "client!js", name = "L", descriptor = "I")
	public int stringArgs;

	@OriginalMember(owner = "client!js", name = "M", descriptor = "[Ljava/lang/String;")
	public String[] stringOperands;

	@OriginalMember(owner = "client!js", name = "N", descriptor = "I")
	public int stringLocals;

	@OriginalMember(owner = "client!js", name = "P", descriptor = "I")
	public int intArgs;

	static {
		new LocalisedText("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([BI)Lclient!js;")
	public static ClientScript decode(@OriginalArg(0) byte[] bytes) {
		@Pc(16) ClientScript script = new ClientScript();
		@Pc(21) Buffer buffer = new Buffer(bytes);
		buffer.offset = buffer.bytes.length - 2;
		@Pc(32) int trailerLength = buffer.g2();
		@Pc(43) int trailerOffset = buffer.bytes.length - trailerLength - 2 - 12;
		buffer.offset = trailerOffset;
		@Pc(50) int instructions = buffer.mg4();
		script.intLocals = buffer.g2();
		script.stringLocals = buffer.g2();
		script.intArgs = buffer.g2();
		script.stringArgs = buffer.g2();
		@Pc(74) int switches = buffer.g1();
		if (switches > 0) {
			script.switchTables = new HashTable[switches];
			for (@Pc(85) int i = 0; i < switches; i++) {
				@Pc(91) int cases = buffer.g2();
				@Pc(98) HashTable table = new HashTable(Static162.clp2(cases));
				script.switchTables[i] = table;
				while (cases-- > 0) {
					@Pc(109) int value = buffer.mg4();
					@Pc(115) int offset = buffer.mg4();
					table.put(new IntNode(offset), value);
				}
			}
		}
		buffer.offset = 0;
		script.name = buffer.fastgstr();
		script.stringOperands = new String[instructions];
		script.intOperands = new int[instructions];
		script.opcodes = new int[instructions];
		int i = 0;
		while (trailerOffset > buffer.offset) {
			int opcode = buffer.g2();
			if (opcode == 3) {
				script.stringOperands[i] = buffer.gjstr().intern();
			} else if (opcode >= 100 || opcode == 21 || opcode == 38 || opcode == 39) {
				script.intOperands[i] = buffer.g1();
			} else {
				script.intOperands[i] = buffer.mg4();
			}
			script.opcodes[i++] = opcode;
		}
		return script;
	}
}
