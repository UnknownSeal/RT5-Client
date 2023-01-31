import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class NanoTimer extends Timer {

	@OriginalMember(owner = "client!op", name = "g", descriptor = "J")
	private long time = 0L;

	@OriginalMember(owner = "client!op", name = "h", descriptor = "J")
	private long nextFrame = 0L;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "J")
	private long previousFrame = 0L;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "I")
	private int windowSize = 1;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "I")
	private int durationPointer = 0;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "[J")
	private final long[] durations = new long[10];

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
	public NanoTimer() {
		this.time = System.nanoTime();
		this.nextFrame = System.nanoTime();
	}

	@OriginalMember(owner = "client!op", name = "d", descriptor = "(I)J")
	private long getDuration() {
		@Pc(6) long current = System.nanoTime();
		@Pc(12) long duration = current - this.previousFrame;
		this.previousFrame = current;
		if (duration > -5000000000L && duration < 5000000000L) {
			this.durations[this.durationPointer] = duration;
			this.durationPointer = (this.durationPointer + 1) % 10;
			if (this.windowSize < 1) {
				this.windowSize++;
			}
		}
		@Pc(54) long sum = 0L;
		for (@Pc(56) int i = 1; i <= this.windowSize; i++) {
			sum += this.durations[(this.durationPointer + 10 - i) % 10];
		}
		return sum / (long) this.windowSize;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)I")
	@Override
	public int sleep(@OriginalArg(1) int timePerFrame) {
		@Pc(4) long timePerFrameNanos = (long) timePerFrame * 1000000L;
		this.time += this.getDuration();
		if (this.time < this.nextFrame) {
			Static231.sleep((this.nextFrame - this.time) / 1000000L);
			this.previousFrame += this.nextFrame - this.time;
			this.time += this.nextFrame - this.time;
			this.nextFrame += timePerFrameNanos;
			return 1;
		}
		@Pc(67) int logicCycles = 0;
		do {
			this.nextFrame += timePerFrameNanos;
			logicCycles++;
		} while (logicCycles < 10 && this.nextFrame < this.time);
		if (this.time > this.nextFrame) {
			this.nextFrame = this.time;
		}
		return logicCycles;
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V")
	@Override
	public void reset() {
		this.previousFrame = 0L;
		if (this.nextFrame > this.time) {
			this.time += this.nextFrame - this.time;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)J")
	@Override
	public long time() {
		return this.time;
	}
}
