import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Envelope {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
	public int wavetable;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
	public int maximumInterval;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public int minimumInterval;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
	private int nextTime;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	private int slope;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	private int level;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
	private int time;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
	private int phase;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
	private int stages = 2;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "[I")
	private int[] times = new int[2];

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "[I")
	private int[] levels = new int[2];

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Envelope() {
		this.times[0] = 0;
		this.times[1] = 65535;
		this.levels[0] = 0;
		this.levels[1] = 65535;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I")
	public int nextLevel(@OriginalArg(0) int duration) {
		if (this.time >= this.nextTime) {
			this.level = this.levels[this.phase++] << 15;
			if (this.phase >= this.stages) {
				this.phase = this.stages - 1;
			}
			this.nextTime = (int) ((double) this.times[this.phase] / 65536.0D * (double) duration);
			if (this.nextTime > this.time) {
				this.slope = ((this.levels[this.phase] << 15) - this.level) / (this.nextTime - this.time);
			}
		}
		this.level += this.slope;
		this.time++;
		return this.level - this.slope >> 15;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!bt;)V")
	public void decode(@OriginalArg(0) Buffer buffer) {
		this.wavetable = buffer.g1();
		this.minimumInterval = buffer.mg4();
		this.maximumInterval = buffer.mg4();
		this.decodeStages(buffer);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
	public void reset() {
		this.nextTime = 0;
		this.phase = 0;
		this.slope = 0;
		this.level = 0;
		this.time = 0;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(Lclient!bt;)V")
	public void decodeStages(@OriginalArg(0) Buffer buffer) {
		this.stages = buffer.g1();
		this.times = new int[this.stages];
		this.levels = new int[this.stages];
		for (@Pc(16) int i = 0; i < this.stages; i++) {
			this.times[i] = buffer.g2();
			this.levels[i] = buffer.g2();
		}
	}
}
