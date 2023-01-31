import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class QuickChatPhraseType extends SecondaryNode {

	@OriginalMember(owner = "client!ch", name = "ib", descriptor = "[I")
	public static final int[] DYNAMIC_COMMAND_PARAM_LENGTHS = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };
	@OriginalMember(owner = "client!bi", name = "j", descriptor = "[I")
	public static final int[] DYNAMIC_COMMAND_DECODE_BYTES = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };
	@OriginalMember(owner = "client!gn", name = "n", descriptor = "[I")
	public static final int[] DYNAMIC_COMMAND_ENCODE_BYTES = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };
	@OriginalMember(owner = "client!tb", name = "F", descriptor = "[Ljava/lang/String;")
	private String[] text;

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "[I")
	private int[] dynamicCommands;

	@OriginalMember(owner = "client!tb", name = "S", descriptor = "[[I")
	private int[][] dynamicCommandParams;

	@OriginalMember(owner = "client!tb", name = "T", descriptor = "[I")
	public int[] automaticResponse;

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "Z")
	public boolean searchable = true;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!bt;I)V")
	private void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int opcode) {
		if (opcode == 1) {
			this.text = Static200.split(buffer.gjstr(), '<');
			return;
		}
		if (opcode == 2) {
			@Pc(23) int count = buffer.g1();
			this.automaticResponse = new int[count];
			for (@Pc(29) int i = 0; i < count; i++) {
				this.automaticResponse[i] = buffer.g2();
			}
		} else if (opcode == 3) {
			int count = buffer.g1();
			this.dynamicCommands = new int[count];
			this.dynamicCommandParams = new int[count][];
			for (int i = 0; i < count; i++) {
				@Pc(81) int command = buffer.g2();
				this.dynamicCommands[i] = command;
				this.dynamicCommandParams[i] = new int[DYNAMIC_COMMAND_PARAM_LENGTHS[command]];
				for (@Pc(96) int j = 0; j < DYNAMIC_COMMAND_PARAM_LENGTHS[command]; j++) {
					this.dynamicCommandParams[i][j] = buffer.g2();
				}
			}
		} else if (opcode == 4) {
			this.searchable = false;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I")
	public int getDynamicCommand(@OriginalArg(1) int arg0) {
		return this.dynamicCommands == null || arg0 < 0 || this.dynamicCommands.length < arg0 ? -1 : this.dynamicCommands[arg0];
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!bt;I[I)V")
	public void encodeMessage(@OriginalArg(0) Buffer buffer, @OriginalArg(2) int[] values) {
		if (this.dynamicCommands == null) {
			return;
		}
		for (@Pc(19) int i = 0; i < this.dynamicCommands.length; i++) {
			if (values.length <= i) {
				return;
			}
			@Pc(28) int bytes = DYNAMIC_COMMAND_ENCODE_BYTES[this.getDynamicCommand(i)];
			if (bytes > 0) {
				buffer.pVarLong(bytes, values[i]);
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!bt;)V")
	public void decode(@OriginalArg(1) Buffer buffer) {
		while (true) {
			@Pc(5) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(buffer, opcode);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)I")
	public int getDynamicCommandParam(@OriginalArg(0) int i, @OriginalArg(1) int j) {
		if (this.dynamicCommands == null || i < 0 || this.dynamicCommands.length < i) {
			return -1;
		} else if (this.dynamicCommandParams[i] == null || j < 0 || j > this.dynamicCommandParams[i].length) {
			return -1;
		} else {
			return this.dynamicCommandParams[i][j];
		}
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(B)Ljava/lang/String;")
	public String getText() {
		@Pc(10) StringBuffer stringBuffer = new StringBuffer(80);
		if (this.text == null) {
			return "";
		}
		stringBuffer.append(this.text[0]);
		for (@Pc(29) int i = 1; i < this.text.length; i++) {
			stringBuffer.append("...");
			stringBuffer.append(this.text[i]);
		}
		return stringBuffer.toString();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!bt;B)Ljava/lang/String;")
	public String decodeMessage(@OriginalArg(0) Buffer buffer) {
		@Pc(10) StringBuffer stringBuffer = new StringBuffer(80);
		if (this.dynamicCommands != null) {
			for (@Pc(15) int i = 0; i < this.dynamicCommands.length; i++) {
				stringBuffer.append(this.text[i]);
				stringBuffer.append(Static341.decodeCommand(this.dynamicCommandParams[i], this.dynamicCommands[i], buffer.gVarLong(DYNAMIC_COMMAND_DECODE_BYTES[this.dynamicCommands[i]])));
			}
		}
		stringBuffer.append(this.text[this.text.length - 1]);
		return stringBuffer.toString();
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(B)I")
	public int getDynamicCommandCount() {
		return this.dynamicCommands == null ? 0 : this.dynamicCommands.length;
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(B)V")
	public void method5603() {
		if (this.automaticResponse != null) {
			for (@Pc(11) int i = 0; i < this.automaticResponse.length; i++) {
				this.automaticResponse[i] |= 0x8000;
			}
		}
	}
}
