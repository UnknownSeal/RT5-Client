import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class SkyBoxType {

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "[I")
	public int[] spheres;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
	public int textureID = -1;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
	public int defaultSphereIndex = -1;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!bt;II)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(1) int opcode) {
		if (opcode == 1) {
			this.textureID = buffer.g2();
		} else if (opcode == 2) {
			this.spheres = new int[buffer.g1()];
			for (@Pc(19) int i = 0; i < this.spheres.length; i++) {
				this.spheres[i] = buffer.g2();
			}
		} else if (opcode == 3) {
			this.defaultSphereIndex = buffer.g1();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!bt;B)V")
	public void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(5) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(buffer, opcode);
		}
	}
}
