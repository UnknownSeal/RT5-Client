import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!r;")
	public static Js5 aJs5_37;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
	public static int anInt2663;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "Lclient!ld;")
	public static final LinkedList A_LINKED_LIST___21 = new LinkedList();

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!h;")
	public static final Class89 aClass89_110 = new Class89(8, 2);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)Z")
	public static boolean method2661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static359.aByteArrayArrayArray16[0][arg3][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static359.aByteArrayArrayArray16[arg2][arg3][arg0] & 0x10) == 0) {
			return Static280.method4766(arg0, arg3, arg2) == arg1;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method2663() {
		if (Static141.anInt2652 == 0) {
			return;
		}
		try {
			if (++Static327.anInt6109 > 2000) {
				if (Static335.socket != null) {
					Static335.socket.close();
					Static335.socket = null;
				}
				if (Static66.anInt1625 >= 1) {
					Static318.anInt5968 = -5;
					Static141.anInt2652 = 0;
					return;
				}
				Static327.anInt6109 = 0;
				if (client.defaultPort == client.port) {
					client.port = client.alternatePort;
				} else {
					client.port = client.defaultPort;
				}
				Static141.anInt2652 = 1;
				Static66.anInt1625++;
			}
			if (Static141.anInt2652 == 1) {
				Static5.sockerRequest = GameShell.signlink.openSocket(client.hostname, client.port);
				Static141.anInt2652 = 2;
			}
			@Pc(119) int local119;
			if (Static141.anInt2652 == 2) {
				if (Static5.sockerRequest.status == 2) {
					throw new IOException();
				}
				if (Static5.sockerRequest.status != 1) {
					return;
				}
				Static335.socket = new BufferedSocket((Socket) Static5.sockerRequest.result, GameShell.signlink);
				Static5.sockerRequest = null;
				Static335.socket.write(Static257.aClass2_Sub4_Sub2_4.data, Static257.aClass2_Sub4_Sub2_4.offset);
				if (Static303.aClass221_2 != null) {
					Static303.aClass221_2.method6324();
				}
				if (Static190.aClass221_1 != null) {
					Static190.aClass221_1.method6324();
				}
				local119 = Static335.socket.read();
				if (Static303.aClass221_2 != null) {
					Static303.aClass221_2.method6324();
				}
				if (Static190.aClass221_1 != null) {
					Static190.aClass221_1.method6324();
				}
				if (local119 != 21) {
					Static318.anInt5968 = local119;
					Static141.anInt2652 = 0;
					Static335.socket.close();
					Static335.socket = null;
					return;
				}
				Static141.anInt2652 = 3;
			}
			if (Static141.anInt2652 == 3) {
				if (Static335.socket.available() < 1) {
					return;
				}
				Static163.aStringArray23 = new String[Static335.socket.read()];
				Static141.anInt2652 = 4;
			}
			if (Static141.anInt2652 == 4 && Static335.socket.available() >= Static163.aStringArray23.length * 8) {
				Static212.inboundBuffer.offset = 0;
				Static335.socket.read(Static212.inboundBuffer.data, Static163.aStringArray23.length * 8, 0);
				for (local119 = 0; local119 < Static163.aStringArray23.length; local119++) {
					Static163.aStringArray23[local119] = Static202.method3675(Static212.inboundBuffer.g8());
				}
				Static141.anInt2652 = 0;
				Static318.anInt5968 = 21;
				Static335.socket.close();
				Static335.socket = null;
			}
		} catch (@Pc(219) IOException local219) {
			if (Static335.socket != null) {
				Static335.socket.close();
				Static335.socket = null;
			}
			if (Static66.anInt1625 >= 1) {
				Static141.anInt2652 = 0;
				Static318.anInt5968 = -4;
			} else {
				Static327.anInt6109 = 0;
				Static141.anInt2652 = 1;
				Static66.anInt1625++;
				if (client.defaultPort == client.port) {
					client.port = client.alternatePort;
				} else {
					client.port = client.defaultPort;
				}
			}
		}
	}
}
