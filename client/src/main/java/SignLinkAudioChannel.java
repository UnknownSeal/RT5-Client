import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class SignLinkAudioChannel extends AudioChannel {

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "Lclient!fc;")
	public static AudioSource audioSource;
	@OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
	private final int channel;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!ml;I)V")
	public SignLinkAudioChannel(@OriginalArg(0) SignLink signLink, @OriginalArg(1) int channel) {
		audioSource = signLink.getAudioSource();
		this.channel = channel;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void init(@OriginalArg(0) Component component) throws Exception {
		audioSource.init(Static356.sampleRate, component, AudioChannel.stereo);
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
	@Override
	protected void close() {
		audioSource.close(this.channel);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()V")
	@Override
	protected void write() {
		audioSource.write(this.channel, super.samples);
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
	@Override
	public void open(@OriginalArg(0) int bufferCapacity) throws Exception {
		if (bufferCapacity > 32768) {
			throw new IllegalArgumentException();
		}
		audioSource.open(this.channel, bufferCapacity);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()I")
	@Override
	protected int getBufferSize() {
		return audioSource.getBufferSize(this.channel);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()V")
	@Override
	protected void flush() {
		audioSource.flush(this.channel);
	}
}
