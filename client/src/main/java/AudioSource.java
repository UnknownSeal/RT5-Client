import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public interface AudioSource {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)V")
	void open(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BILjava/awt/Component;Z)V")
	void init(@OriginalArg(1) int sampleRate, @OriginalArg(2) Component component, @OriginalArg(3) boolean stereo) throws Exception;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[I)V")
	void write(@OriginalArg(0) int channel, @OriginalArg(1) int[] samples);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
	int getBufferSize(@OriginalArg(1) int channel);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)V")
	void close(@OriginalArg(0) int channel);

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V")
	void flush(@OriginalArg(0) int channel);
}
