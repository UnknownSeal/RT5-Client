import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class VarbitType {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public int startBit;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	public int endBit;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "I")
	public int baseVar;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(16) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(opcode, buffer);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!bt;)V")
	private void decode(@OriginalArg(1) int opcode, @OriginalArg(2) Buffer buffer) {
		if (opcode == 1) {
			this.baseVar = buffer.g2();
			this.startBit = buffer.g1();
			this.endBit = buffer.g1();
		}
	}
}
