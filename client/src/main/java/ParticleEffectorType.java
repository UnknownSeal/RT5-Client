import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class ParticleEffectorType {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
	private int anInt736;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
	public int anInt737;

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
	public int anInt738;

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
	public int anInt740;

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
	public int anInt741;

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
	public int anInt748;

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
	public int anInt749;

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "J")
	public long aLong23;

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
	public int anInt750;

	@OriginalMember(owner = "client!bp", name = "x", descriptor = "I")
	public int anInt753;

	@OriginalMember(owner = "client!bp", name = "z", descriptor = "I")
	public int anInt754;

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
	public int anInt743 = 0;

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
	public int anInt746 = 0;

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	public void postDecode() {
		this.anInt738 = Class19.COSINE[this.anInt736 << 3];
		this.anInt740 = (int) Math.sqrt(this.anInt748 * this.anInt748 + this.anInt754 * this.anInt754 + this.anInt741 * this.anInt741);
		if (this.anInt750 == 0) {
			this.anInt750 = 1;
		}
		if (this.anInt753 == 0) {
			this.aLong23 = 2147483647L;
		} else if (this.anInt753 == 1) {
			this.aLong23 = this.anInt740 * 8 / this.anInt750;
			this.aLong23 *= this.aLong23;
		} else if (this.anInt753 == 2) {
			this.aLong23 = this.anInt740 * 8 / this.anInt750;
		}
		if (this.aBoolean67) {
			this.anInt740 *= -1;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!bt;ZI)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(2) int opcode) {
		if (opcode == 1) {
			this.anInt736 = buffer.g2();
		} else if (opcode == 2) {
			buffer.g1();
		} else if (opcode == 3) {
			this.anInt754 = buffer.mg4();
			this.anInt748 = buffer.mg4();
			this.anInt741 = buffer.mg4();
		} else if (opcode == 4) {
			this.anInt753 = buffer.g1();
			this.anInt750 = buffer.mg4();
		} else if (opcode == 6) {
			this.anInt737 = buffer.g1();
		} else if (opcode == 8) {
			this.anInt743 = 1;
		} else if (opcode == 9) {
			this.anInt746 = 1;
		} else if (opcode == 10) {
			this.aBoolean67 = true;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZLclient!bt;)V")
	public void decode(@OriginalArg(1) Buffer buffer) {
		while (true) {
			@Pc(14) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(buffer, opcode);
		}
	}
}
