import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class MillisTimer extends Timer {

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
	private int windowSize = 1;

	@OriginalMember(owner = "client!ir", name = "k", descriptor = "[J")
	private final long[] durations = new long[10];

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "J")
	private long time = 0L;

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "J")
	private long previousFrame = 0L;

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
	private int durationPointer = 0;

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "J")
	private long nextFrame = 0L;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)J")
	@Override
	public long time() {
		return this.time;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V")
	@Override
	public void reset() {
		if (this.nextFrame > this.time) {
			this.time += this.nextFrame - this.time;
		}
		this.previousFrame = 0L;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZI)I")
	@Override
	public int sleep(@OriginalArg(1) int timePerFrame) {
		@Pc(11) long timePerFrameNanos = (long) timePerFrame * 1000000L;
		this.time += this.getDuration();
		if (this.nextFrame > this.time) {
			Static231.sleep((this.nextFrame - this.time) / 1000000L);
			this.previousFrame += this.nextFrame - this.time;
			this.time += this.nextFrame - this.time;
			this.nextFrame += timePerFrameNanos;
			return 1;
		}
		@Pc(71) int logicCycles = 0;
		do {
			logicCycles++;
			this.nextFrame += timePerFrameNanos;
		} while (logicCycles < 10 && this.time > this.nextFrame);
		if (this.nextFrame < this.time) {
			this.nextFrame = this.time;
		}
		return logicCycles;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)J")
	private long getDuration() {
		@Pc(4) long now = MonotonicClock.currentTimeMillis() * 1000000L;
		@Pc(10) long duration = now - this.previousFrame;
		@Pc(51) long sum = 0L;
		this.previousFrame = now;
		if (duration > -5000000000L && duration < 5000000000L) {
			this.durations[this.durationPointer] = duration;
			if (this.windowSize < 10) {
				this.windowSize++;
			}
			this.durationPointer = (this.durationPointer + 1) % 10;
		}
		for (@Pc(53) int i = 1; i <= this.windowSize; i++) {
			sum += this.durations[(this.durationPointer + 10 - i) % 10];
		}
		return sum / (long) this.windowSize;
	}
}
