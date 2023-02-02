import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class JavaAudioChannel extends AudioChannel {

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine line;

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat format;

	@OriginalMember(owner = "client!vb", name = "O", descriptor = "[B")
	private byte[] binarySamples;

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
	private int lineBufferSize;

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "Z")
	private boolean reopenAfterFlush = false;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "()V")
	@Override
	protected void close() {
		if (this.line != null) {
			this.line.close();
			this.line = null;
		}
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V")
	@Override
	public void open(@OriginalArg(0) int bufferCapacity) throws LineUnavailableException {
		try {
			@Pc(20) Info info = new Info(SourceDataLine.class, this.format, bufferCapacity << (AudioChannel.stereo ? 2 : 1));
			this.line = (SourceDataLine) AudioSystem.getLine(info);
			this.line.open();
			this.line.start();
			this.lineBufferSize = bufferCapacity;
		} catch (@Pc(36) LineUnavailableException exception) {
			if (Static29.bitCountFast(bufferCapacity) == 1) {
				this.line = null;
				throw exception;
			} else {
				this.open(Static162.clp2(bufferCapacity));
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void init(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] mixers = AudioSystem.getMixerInfo();
		if (mixers != null) {
			for (@Pc(8) int i = 0; i < mixers.length; i++) {
				@Pc(16) javax.sound.sampled.Mixer.Info mixer = mixers[i];
				if (mixer != null) {
					@Pc(21) String name = mixer.getName();
					if (name != null && name.toLowerCase().indexOf("soundmax") >= 0) {
						this.reopenAfterFlush = true;
					}
				}
			}
		}
		this.format = new AudioFormat((float) Static356.sampleRate, 16, AudioChannel.stereo ? 2 : 1, true, false);
		this.binarySamples = new byte[0x100 << (AudioChannel.stereo ? 2 : 1)];
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()I")
	@Override
	protected int getBufferSize() {
		return this.lineBufferSize - (this.line.available() >> (AudioChannel.stereo ? 2 : 1));
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "()V")
	@Override
	protected void write() {
		@Pc(1) short length = 256;
		if (AudioChannel.stereo) {
			length = 512;
		}
		for (@Pc(9) int i = 0; i < length; i++) {
			@Pc(17) int sample = this.samples[i];
			if ((sample + 8388608 & 0xFF000000) != 0) {
				sample = sample >> 31 ^ 0x7FFFFF;
			}
			this.binarySamples[i * 2] = (byte) (sample >> 8);
			this.binarySamples[i * 2 + 1] = (byte) (sample >> 16);
		}
		this.line.write(this.binarySamples, 0, length << 1);
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "()V")
	@Override
	protected void flush() throws LineUnavailableException {
		this.line.flush();
		if (!this.reopenAfterFlush) {
			return;
		}
		this.line.close();
		this.line = null;
		@Pc(33) Info info = new Info(SourceDataLine.class, this.format, this.lineBufferSize << (AudioChannel.stereo ? 2 : 1));
		this.line = (SourceDataLine) AudioSystem.getLine(info);
		this.line.open();
		this.line.start();
	}
}
