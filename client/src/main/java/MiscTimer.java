import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class MiscTimer extends Timer {

	@OriginalMember(owner = "client!af", name = "g", descriptor = "J")
	private long nextFrame = 0L;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "J")
	private long time = 0L;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "I")
	private int durationPointer = 0;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "I")
	private int windowSize = 1;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "[J")
	private final long[] durations = new long[10];

	@OriginalMember(owner = "client!af", name = "k", descriptor = "J")
	private long previousFrame = 0L;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public MiscTimer() {
		this.nextFrame = this.time = jagmisc.nanoTime();
		if (this.time == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
	@Override
	public void reset() {
		if (this.nextFrame > this.time) {
			this.time += this.nextFrame - this.time;
		}
		this.previousFrame = 0L;
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)J")
	private long getDuration() {
		@Pc(1) long now = jagmisc.nanoTime();
		@Pc(6) long duration = now - this.previousFrame;
		@Pc(53) long sum = 0L;
		this.previousFrame = now;
		if (duration > -5000000000L && duration < 5000000000L) {
			this.durations[this.durationPointer] = duration;
			this.durationPointer = (this.durationPointer + 1) % 10;
			if (this.windowSize < 1) {
				this.windowSize++;
			}
		}
		for (@Pc(55) int i = 1; i <= this.windowSize; i++) {
			sum += this.durations[(this.durationPointer + 10 - i) % 10];
		}
		return sum / (long) this.windowSize;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)I")
	@Override
	public int sleep(@OriginalArg(1) int timePerFrame) {
		this.time += this.getDuration();
		@Pc(17) long timePerFrameNanos = (long) timePerFrame * 1000000L;
		if (this.nextFrame > this.time) {
			Static231.sleep((this.nextFrame - this.time) / 1000000L);
			this.previousFrame += this.nextFrame - this.time;
			this.time += this.nextFrame - this.time;
			this.nextFrame += timePerFrameNanos;
			return 1;
		}
		@Pc(25) int logicCycles = 0;
		do {
			this.nextFrame += timePerFrameNanos;
			logicCycles++;
		} while (logicCycles < 10 && this.time > this.nextFrame);
		if (this.nextFrame < this.time) {
			this.nextFrame = this.time;
		}
		return logicCycles;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)J")
	@Override
	public long time() {
		return this.time;
	}
}
