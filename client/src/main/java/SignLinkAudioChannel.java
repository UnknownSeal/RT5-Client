import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class SignLinkAudioChannel extends AudioChannel {

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "Lclient!fc;")
	public static Interface3 audioSource;
	@OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
	private final int anInt7104;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!ml;I)V")
	public SignLinkAudioChannel(@OriginalArg(0) SignLink arg0, @OriginalArg(1) int arg1) {
		audioSource = arg0.method3763();
		this.anInt7104 = arg1;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void init(@OriginalArg(0) Component component) throws Exception {
		audioSource.init(Static356.sampleRate, component, AudioChannel.stereo);
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
	@Override
	protected void close() {
		audioSource.method1996(this.anInt7104);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()V")
	@Override
	protected void write() {
		audioSource.method1994(this.anInt7104, super.samples);
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
	@Override
	public void open(@OriginalArg(0) int bufferCapacity) throws Exception {
		if (bufferCapacity > 32768) {
			throw new IllegalArgumentException();
		}
		audioSource.method1992(this.anInt7104, bufferCapacity);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()I")
	@Override
	protected int getBufferSize() {
		return audioSource.method1995(this.anInt7104);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()V")
	@Override
	protected void method6321() {
		audioSource.method1997(this.anInt7104);
	}
}
