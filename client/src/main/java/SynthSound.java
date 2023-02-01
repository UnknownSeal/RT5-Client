import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class SynthSound {

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "[Lclient!ph;")
	private final SynthInstrument[] instruments = new SynthInstrument[10];

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
	private int start;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
	private int end;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!bt;)V")
	public SynthSound(@OriginalArg(0) Buffer buffer) {
		for (@Pc(7) int i = 0; i < 10; i++) {
			@Pc(12) int wavetable = buffer.g1();
			if (wavetable != 0) {
				buffer.offset--;
				this.instruments[i] = new SynthInstrument();
				this.instruments[i].decode(buffer);
			}
		}
		this.start = buffer.g2();
		this.end = buffer.g2();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "()[B")
	private byte[] getSamples() {
		@Pc(1) int end = 0;
		for (@Pc(3) int i = 0; i < 10; i++) {
			if (this.instruments[i] != null && this.instruments[i].duration + this.instruments[i].start > end) {
				end = this.instruments[i].duration + this.instruments[i].start;
			}
		}
		if (end == 0) {
			return new byte[0];
		}
		@Pc(49) int samplesLength = end * 22050 / 1000;
		@Pc(52) byte[] samples = new byte[samplesLength];
		for (@Pc(54) int i = 0; i < 10; i++) {
			if (this.instruments[i] != null) {
				@Pc(70) int duration = this.instruments[i].duration * 22050 / 1000;
				@Pc(80) int start = this.instruments[i].start * 22050 / 1000;
				@Pc(92) int[] instrumentSamples = this.instruments[i].getSamples(duration, this.instruments[i].duration);
				for (@Pc(94) int local94 = 0; local94 < duration; local94++) {
					@Pc(107) int local107 = samples[local94 + start] + (instrumentSamples[local94] >> 8);
					if ((local107 + 128 & 0xFFFFFF00) != 0) {
						local107 = local107 >> 31 ^ 0x7F;
					}
					samples[local94 + start] = (byte) local107;
				}
			}
		}
		return samples;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "()Lclient!jn;")
	public Class2_Sub21_Sub1 method6433() {
		@Pc(2) byte[] local2 = this.getSamples();
		return new Class2_Sub21_Sub1(22050, local2, this.start * 22050 / 1000, this.end * 22050 / 1000);
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "()I")
	public int method6435() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.instruments[local3] != null && this.instruments[local3].start / 20 < local1) {
				local1 = this.instruments[local3].start / 20;
			}
		}
		if (this.start < this.end && this.start / 20 < local1) {
			local1 = this.start / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.instruments[local55] != null) {
				this.instruments[local55].start -= local1 * 20;
			}
		}
		if (this.start < this.end) {
			this.start -= local1 * 20;
			this.end -= local1 * 20;
		}
		return local1;
	}
}
