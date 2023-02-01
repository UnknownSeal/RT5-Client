import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public abstract class PcmStream extends Node {

	@OriginalMember(owner = "client!ll", name = "s", descriptor = "Lclient!ll;")
	public PcmStream aPcmStream_5;

	@OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
	public int anInt5476;

	@OriginalMember(owner = "client!ll", name = "u", descriptor = "Lclient!ls;")
	public Class2_Sub21 sound;

	@OriginalMember(owner = "client!ll", name = "v", descriptor = "Z")
	public volatile boolean active = true;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ll;)V")
	public static void setInactive(@OriginalArg(1) PcmStream stream) {
		stream.active = false;
		if (stream.sound != null) {
			stream.sound.offset = 0;
		}
		for (@Pc(23) PcmStream subStream = stream.firstSubStream(); subStream != null; subStream = stream.nextSubStream()) {
			setInactive(subStream);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "()Lclient!ll;")
	public abstract PcmStream nextSubStream();

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([III)V")
	public abstract void read(@OriginalArg(0) int[] samples, @OriginalArg(1) int offset, @OriginalArg(2) int length);

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
	public abstract void skip(@OriginalArg(0) int length);

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "([III)V")
	protected final void method4974(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.active) {
			this.read(arg0, arg1, arg2);
		} else {
			this.skip(arg2);
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "()I")
	public int method4975() {
		return 255;
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "()I")
	public abstract int method4976();

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "()Lclient!ll;")
	public abstract PcmStream firstSubStream();
}
