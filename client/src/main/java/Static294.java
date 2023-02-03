import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!qt", name = "E", descriptor = "Z")
	public static boolean aBoolean392 = false;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILclient!r;)Lclient!ne;")
	public static MidiInstrument method5061(@OriginalArg(0) int arg0, @OriginalArg(2) Js5 arg1) {
		@Pc(15) byte[] local15 = arg1.fetchFile(arg0);
		return local15 == null ? null : new MidiInstrument(local15);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!bt;II)V")
	public static void method5064(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
		if (client.uid == null) {
			return;
		}
		try {
			client.uid.seek(0L);
			client.uid.write(arg1, arg0.bytes, 24);
		} catch (@Pc(23) Exception local23) {
		}
	}
}
