import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public class Class12_Sub1_Sub1 extends Class12_Sub1 {

	@OriginalMember(owner = "client!at", name = "L", descriptor = "[I")
	public static final int[] anIntArray292 = new int[99];

	@OriginalMember(owner = "client!at", name = "v", descriptor = "Z")
	public boolean aBoolean307;

	@OriginalMember(owner = "client!at", name = "y", descriptor = "I")
	public int anInt4465;

	@OriginalMember(owner = "client!at", name = "B", descriptor = "I")
	public int anInt4467;

	@OriginalMember(owner = "client!at", name = "D", descriptor = "I")
	public int anInt4469;

	@OriginalMember(owner = "client!at", name = "E", descriptor = "I")
	public int anInt4470;

	@OriginalMember(owner = "client!at", name = "G", descriptor = "I")
	public int anInt4472;

	@OriginalMember(owner = "client!at", name = "I", descriptor = "I")
	public int anInt4474;

	@OriginalMember(owner = "client!at", name = "w", descriptor = "B")
	public byte aByte48 = 5;

	static {
		@Pc(12) int experience = 0;
		for (@Pc(14) int i = 0; i < 99; i++) {
			@Pc(19) int level = i + 1;
			@Pc(32) int delta = (int) (Math.pow(2.0D, (double) level / 7.0D) * 300.0D + (double) level);
			experience += delta;
			anIntArray292[i] = experience / 4;
		}
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
	protected Class12_Sub1_Sub1() {
	}
}
