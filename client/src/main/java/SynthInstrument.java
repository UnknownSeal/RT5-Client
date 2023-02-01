import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class SynthInstrument {

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "[I")
	public static final int[] samples = new int[220500];
	@OriginalMember(owner = "client!ph", name = "u", descriptor = "[I")
	public static final int[] oscillatorTimes = new int[5];
	@OriginalMember(owner = "client!ph", name = "v", descriptor = "[I")
	public static final int[] oscillatorStartSamples = new int[5];
	@OriginalMember(owner = "client!ph", name = "x", descriptor = "[I")
	public static final int[] scaledOscillatorAmplitudes = new int[5];
	@OriginalMember(owner = "client!ph", name = "y", descriptor = "[I")
	public static final int[] oscillatorIntervalRanges = new int[5];
	@OriginalMember(owner = "client!ph", name = "w", descriptor = "[I")
	public static final int[] oscillatorMinIntervals = new int[5];
	@OriginalMember(owner = "client!ph", name = "t", descriptor = "[I")
	private static final int[] NOISE = new int[32768];

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "[I")
	private static final int[] SINE;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "Lclient!uf;")
	private Envelope phaseModulationEnvelope;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Lclient!uf;")
	private Envelope filterEnvelope;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "Lclient!uf;")
	private Envelope amplitudeModulationAmplitudeEnvelope;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "Lclient!uf;")
	private Envelope gateClosedPhaseEnvelope;

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "Lclient!uf;")
	private Envelope gateOpenPhaseEnvelope;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "Lclient!uf;")
	private Envelope phaseModulationAmplitudeEnvelope;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "Lclient!uf;")
	private Envelope amplitudeModulationEnvelope;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "Lclient!pc;")
	private Filter filter;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "Lclient!uf;")
	private Envelope amplitudeEnvelope;

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "Lclient!uf;")
	private Envelope phaseEnvelope;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	public int duration = 500;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	private int delayTime = 0;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
	private int delayMix = 100;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
	public int start = 0;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "[I")
	private final int[] oscillatorStartMillis = new int[5];

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "[I")
	private final int[] anIntArray340 = new int[5];

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "[I")
	private final int[] oscillatorAmplitudes = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			NOISE[local9] = (local7.nextInt() & 0x2) - 1;
		}
		SINE = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			SINE[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)I")
	private int wavetableLookup(@OriginalArg(2) int wavetable, @OriginalArg(0) int time, @OriginalArg(1) int amplitude) {
		if (wavetable == 1) {
			return (time & 0x7FFF) < 16384 ? amplitude : -amplitude;
		} else if (wavetable == 2) {
			return SINE[time & 0x7FFF] * amplitude >> 14;
		} else if (wavetable == 3) {
			return ((time & 0x7FFF) * amplitude >> 14) - amplitude;
		} else if (wavetable == 4) {
			return NOISE[time / 2607 & 0x7FFF] * amplitude;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I")
	public int[] getSamples(@OriginalArg(0) int count, @OriginalArg(1) int million) {
		Static403.clear(samples, 0, count);
		if (million < 10) {
			return samples;
		}
		@Pc(16) double samplesPerMilli = (double) count / ((double) million + 0.0D);
		this.phaseEnvelope.reset();
		this.amplitudeEnvelope.reset();
		@Pc(24) int phaseModulationIntervalRange = 0;
		@Pc(26) int phaseModulationMinInterval = 0;
		@Pc(28) int intervalModulationTime = 0;
		if (this.phaseModulationEnvelope != null) {
			this.phaseModulationEnvelope.reset();
			this.phaseModulationAmplitudeEnvelope.reset();
			phaseModulationIntervalRange = (int) ((double) (this.phaseModulationEnvelope.maximumInterval - this.phaseModulationEnvelope.minimumInterval) * 32.768D / samplesPerMilli);
			phaseModulationMinInterval = (int) ((double) this.phaseModulationEnvelope.minimumInterval * 32.768D / samplesPerMilli);
		}
		@Pc(63) int amplitudeModulationIntervalRange = 0;
		@Pc(65) int amplitudeModulationInterval = 0;
		@Pc(67) int amplitudeModulationTime = 0;
		if (this.amplitudeModulationEnvelope != null) {
			this.amplitudeModulationEnvelope.reset();
			this.amplitudeModulationAmplitudeEnvelope.reset();
			amplitudeModulationIntervalRange = (int) ((double) (this.amplitudeModulationEnvelope.maximumInterval - this.amplitudeModulationEnvelope.minimumInterval) * 32.768D / samplesPerMilli);
			amplitudeModulationInterval = (int) ((double) this.amplitudeModulationEnvelope.minimumInterval * 32.768D / samplesPerMilli);
		}
		for (@Pc(102) int i = 0; i < 5; i++) {
			if (this.oscillatorAmplitudes[i] != 0) {
				oscillatorTimes[i] = 0;
				oscillatorStartSamples[i] = (int) ((double) this.oscillatorStartMillis[i] * samplesPerMilli);
				scaledOscillatorAmplitudes[i] = (this.oscillatorAmplitudes[i] << 14) / 100;
				oscillatorIntervalRanges[i] = (int) ((double) (this.phaseEnvelope.maximumInterval - this.phaseEnvelope.minimumInterval) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray340[i]) / samplesPerMilli);
				oscillatorMinIntervals[i] = (int) ((double) this.phaseEnvelope.minimumInterval * 32.768D / samplesPerMilli);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < count; local176++) {
			local182 = this.phaseEnvelope.nextLevel(count);
			local187 = this.amplitudeEnvelope.nextLevel(count);
			if (this.phaseModulationEnvelope != null) {
				local195 = this.phaseModulationEnvelope.nextLevel(count);
				local200 = this.phaseModulationAmplitudeEnvelope.nextLevel(count);
				local182 += this.wavetableLookup(this.phaseModulationEnvelope.wavetable, intervalModulationTime, local200) >> 1;
				intervalModulationTime += (local195 * phaseModulationIntervalRange >> 16) + phaseModulationMinInterval;
			}
			if (this.amplitudeModulationEnvelope != null) {
				local195 = this.amplitudeModulationEnvelope.nextLevel(count);
				local200 = this.amplitudeModulationAmplitudeEnvelope.nextLevel(count);
				local187 = local187 * ((this.wavetableLookup(this.amplitudeModulationEnvelope.wavetable, amplitudeModulationTime, local200) >> 1) + 32768) >> 15;
				amplitudeModulationTime += (local195 * amplitudeModulationIntervalRange >> 16) + amplitudeModulationInterval;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.oscillatorAmplitudes[local195] != 0) {
					local200 = local176 + oscillatorStartSamples[local195];
					if (local200 < count) {
						samples[local200] += this.wavetableLookup(this.phaseEnvelope.wavetable, oscillatorTimes[local195], local187 * scaledOscillatorAmplitudes[local195] >> 15);
						oscillatorTimes[local195] += (local182 * oscillatorIntervalRanges[local195] >> 16) + oscillatorMinIntervals[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.gateClosedPhaseEnvelope != null) {
			this.gateClosedPhaseEnvelope.reset();
			this.gateOpenPhaseEnvelope.reset();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < count; local200++) {
				local347 = this.gateClosedPhaseEnvelope.nextLevel(count);
				local352 = this.gateOpenPhaseEnvelope.nextLevel(count);
				if (local339) {
					local187 = this.gateClosedPhaseEnvelope.minimumInterval + ((this.gateClosedPhaseEnvelope.maximumInterval - this.gateClosedPhaseEnvelope.minimumInterval) * local347 >> 8);
				} else {
					local187 = this.gateClosedPhaseEnvelope.minimumInterval + ((this.gateClosedPhaseEnvelope.maximumInterval - this.gateClosedPhaseEnvelope.minimumInterval) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					samples[local200] = 0;
				}
			}
		}
		if (this.delayTime > 0 && this.delayMix > 0) {
			local182 = (int) ((double) this.delayTime * samplesPerMilli);
			for (local187 = local182; local187 < count; local187++) {
				samples[local187] += samples[local187 - local182] * this.delayMix / 100;
			}
		}
		if (this.filter.pairs[0] > 0 || this.filter.pairs[1] > 0) {
			this.filterEnvelope.reset();
			local182 = this.filterEnvelope.nextLevel(count + 1);
			local187 = this.filter.method4469(0, (float) local182 / 65536.0F);
			local195 = this.filter.method4469(1, (float) local182 / 65536.0F);
			if (count >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > count - local187) {
					local347 = count - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) samples[local200 + local187] * (long) Static264.anInt4839 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) samples[local200 + local187 - local519 - 1] * (long) Static264.anIntArrayArray40[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) samples[local200 - local549 - 1] * (long) Static264.anIntArrayArray40[1][local549] >> 16);
					}
					samples[local200] = local352;
					local182 = this.filterEnvelope.nextLevel(count + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > count - local187) {
						local347 = count - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) samples[local200 + local187] * (long) Static264.anInt4839 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) samples[local200 + local187 - local519 - 1] * (long) Static264.anIntArrayArray40[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) samples[local200 - local549 - 1] * (long) Static264.anIntArrayArray40[1][local549] >> 16);
						}
						samples[local200] = local352;
						local182 = this.filterEnvelope.nextLevel(count + 1);
						local200++;
					}
					if (local200 >= count - local187) {
						while (local200 < count) {
							local352 = 0;
							for (local519 = local200 + local187 - count; local519 < local187; local519++) {
								local352 += (int) ((long) samples[local200 + local187 - local519 - 1] * (long) Static264.anIntArrayArray40[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) samples[local200 - local549 - 1] * (long) Static264.anIntArrayArray40[1][local549] >> 16);
							}
							samples[local200] = local352;
							this.filterEnvelope.nextLevel(count + 1);
							local200++;
						}
						break;
					}
					local187 = this.filter.method4469(0, (float) local182 / 65536.0F);
					local195 = this.filter.method4469(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < count; local182++) {
			if (samples[local182] < -32768) {
				samples[local182] = -32768;
			}
			if (samples[local182] > 32767) {
				samples[local182] = 32767;
			}
		}
		return samples;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!bt;)V")
	public void decode(@OriginalArg(0) Buffer buffer) {
		this.phaseEnvelope = new Envelope();
		this.phaseEnvelope.decode(buffer);
		this.amplitudeEnvelope = new Envelope();
		this.amplitudeEnvelope.decode(buffer);
		@Pc(21) int phaseModulationWavetable = buffer.g1();
		if (phaseModulationWavetable != 0) {
			buffer.offset--;
			this.phaseModulationEnvelope = new Envelope();
			this.phaseModulationEnvelope.decode(buffer);
			this.phaseModulationAmplitudeEnvelope = new Envelope();
			this.phaseModulationAmplitudeEnvelope.decode(buffer);
		}
		int amplitudeModulationWavetable = buffer.g1();
		if (amplitudeModulationWavetable != 0) {
			buffer.offset--;
			this.amplitudeModulationEnvelope = new Envelope();
			this.amplitudeModulationEnvelope.decode(buffer);
			this.amplitudeModulationAmplitudeEnvelope = new Envelope();
			this.amplitudeModulationAmplitudeEnvelope.decode(buffer);
		}
		int gateWavetable = buffer.g1();
		if (gateWavetable != 0) {
			buffer.offset--;
			this.gateClosedPhaseEnvelope = new Envelope();
			this.gateClosedPhaseEnvelope.decode(buffer);
			this.gateOpenPhaseEnvelope = new Envelope();
			this.gateOpenPhaseEnvelope.decode(buffer);
		}
		for (@Pc(109) int i = 0; i < 10; i++) {
			@Pc(114) int amplitude = buffer.gsmarts();
			if (amplitude == 0) {
				break;
			}
			this.oscillatorAmplitudes[i] = amplitude;
			this.anIntArray340[i] = buffer.gsmart();
			this.oscillatorStartMillis[i] = buffer.gsmarts();
		}
		this.delayTime = buffer.gsmarts();
		this.delayMix = buffer.gsmarts();
		this.duration = buffer.g2();
		this.start = buffer.g2();
		this.filter = new Filter();
		this.filterEnvelope = new Envelope();
		this.filter.decode(buffer, this.filterEnvelope);
	}
}
