import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class SoundBank {

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "Lclient!ad;")
	private final HashTable aClass4_11 = new HashTable(256);

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "Lclient!ad;")
	private final HashTable cache = new HashTable(256);

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "Lclient!r;")
	private final Js5 vorbisArchive;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "Lclient!r;")
	private final Js5 synthArchive;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!r;Lclient!r;)V")
	public SoundBank(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		this.vorbisArchive = arg1;
		this.synthArchive = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([III)Lclient!jn;")
	public PcmSound getVorbisSound(@OriginalArg(0) int[] samplingRates, @OriginalArg(1) int id) {
		if (this.vorbisArchive.capacity() == 1) {
			return this.getVorbisSound(id, samplingRates, 0);
		} else if (this.vorbisArchive.getGroupCapacity(id) == 1) {
			return this.getVorbisSound(0, samplingRates, id);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI[I)Lclient!jn;")
	public PcmSound method871(@OriginalArg(1) int id, @OriginalArg(2) int[] samplingRates) {
		if (this.synthArchive.capacity() == 1) {
			return this.getSynthSound(id, samplingRates, 0);
		} else if (this.synthArchive.getGroupCapacity(id) == 1) {
			return this.getSynthSound(0, samplingRates, id);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[III)Lclient!jn;")
	private PcmSound getSynthSound(@OriginalArg(0) int file, @OriginalArg(1) int[] samplingRates, @OriginalArg(2) int group) {
		@Pc(15) int key = file ^ (group >>> 12 | group << 4 & 0xFFF8);
		@Pc(21) int local21 = key | group << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) PcmSound sound = (PcmSound) this.cache.get(local24);
		if (sound != null) {
			return sound;
		} else if (samplingRates == null || samplingRates[0] > 0) {
			@Pc(54) SynthSound synthSound = Static408.create(this.synthArchive, group, file);
			if (synthSound == null) {
				return null;
			}
			sound = synthSound.method6433();
			this.cache.put(sound, local24);
			if (samplingRates != null) {
				samplingRates[0] -= sound.aByteArray31.length;
			}
			return sound;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II[II)Lclient!jn;")
	private PcmSound getVorbisSound(@OriginalArg(0) int file, @OriginalArg(2) int[] arg1, @OriginalArg(3) int group) {
		@Pc(15) int key = file ^ (group << 4 & 0xFFF9 | group >>> 12);
		@Pc(21) int local21 = key | group << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) PcmSound sound = (PcmSound) this.cache.get(local26);
		if (sound != null) {
			return sound;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(55) Class2_Sub27 local55 = (Class2_Sub27) this.aClass4_11.get(local26);
			if (local55 == null) {
				local55 = Static267.method4519(this.vorbisArchive, group, file);
				if (local55 == null) {
					return null;
				}
				this.aClass4_11.put(local55, local26);
			}
			sound = local55.method4518(arg1);
			if (sound == null) {
				return null;
			} else {
				local55.unlink();
				this.cache.put(sound, local26);
				return sound;
			}
		} else {
			return null;
		}
	}
}
