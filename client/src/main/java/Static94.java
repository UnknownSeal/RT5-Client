import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
	public static int anInt1979 = 0;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBIZILclient!r;)V")
	public static void playImmediate(@OriginalArg(2) int groupID, @OriginalArg(5) Js5 archive, @OriginalArg(0) int volume) {
		Static341.songFileID = 0;
		Static105.songGroupID = groupID;
		Static28.volumeFadeRate = 10000;
		Static384.aBoolean485 = false;
		Static116.songArchive = archive;
		Static235.state = 1;
		Static356.volume = volume;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIILclient!cj;Lclient!cj;)V")
	public static void method2044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub3 arg3, @OriginalArg(4) Class11_Sub3 arg4) {
		@Pc(4) Class67 local4 = Static266.method4499(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub3_2 = arg3;
			local4.aClass11_Sub3_3 = arg4;
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V")
	public static void method2045(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static91.method1960(Static126.aClass145_229);
		Static257.outboundBuffer.p4(arg0);
		Static257.outboundBuffer.ip2add(arg1);
	}
}
