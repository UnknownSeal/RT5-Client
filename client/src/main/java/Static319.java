import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
	public static final int anInt5977 = 50;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "[I")
	public static final int[] anIntArray397 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "[I")
	public static final int[] anIntArray398 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "[I")
	public static final int[] anIntArray399 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "[I")
	public static final int[] anIntArray400 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray54 = new String[200];

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray55 = new String[anInt5977];

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "[I")
	public static final int[] anIntArray401 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "[I")
	public static final int[] anIntArray402 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "[I")
	public static final int[] anIntArray403 = new int[13];

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "Lclient!h;")
	public static final Class89 aClass89_211 = new Class89(32, -2);

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)I")
	public static int fetch() {
		try {
			if (Static77.step == 0) {
				if (MonotonicClock.currentTimeMillis() - 5000L < Static349.closeTime) {
					return 0;
				}
				Static158.socketRequest = GameShell.signlink.openSocket(client.worldListHostname, client.worldListPort);
				Static284.openTime = MonotonicClock.currentTimeMillis();
				Static77.step = 1;
			}
			if (MonotonicClock.currentTimeMillis() > Static284.openTime + 30000L) {
				return Static101.close(1000);
			}
			
			if (Static77.step == 1) {
				if (Static158.socketRequest.status == 2) {
					return Static101.close(1001);
				}
				if (Static158.socketRequest.status != 1) {
					return -1;
				}
				Static335.socket = new BufferedSocket((Socket) Static158.socketRequest.result, GameShell.signlink);
				Static158.socketRequest = null;
				@Pc(76) int checksum = 0;
				Static257.outboundBuffer.offset = 0;
				if (Static70.loaded) {
					checksum = Static361.checksum;
				}
				Static257.outboundBuffer.p1(Static43.aClass242_9.anInt7038);
				Static257.outboundBuffer.p4(checksum);
				Static335.socket.write(Static257.outboundBuffer.bytes, Static257.outboundBuffer.offset);
				if (client.musicChannel != null) {
					client.musicChannel.method6324();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method6324();
				}
				@Pc(114) int reply = Static335.socket.read();
				if (client.musicChannel != null) {
					client.musicChannel.method6324();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method6324();
				}
				if (reply != 0) {
					return Static101.close(reply);
				}
				Static77.step = 2;
			}
			if (Static77.step == 2) {
				if (Static335.socket.available() < 2) {
					return -1;
				}
				Static290.bufferLength = Static335.socket.read();
				Static290.bufferLength <<= 0x8;
				Static290.bufferLength += Static335.socket.read();
				Static298.buffer = new byte[Static290.bufferLength];
				Static218.bufferOffset = 0;
				Static77.step = 3;
			}
			if (Static77.step != 3) {
				return -1;
			}
			int n = Static335.socket.available();
			if (n < 1) {
				return -1;
			}
			if (n > Static290.bufferLength - Static218.bufferOffset) {
				n = Static290.bufferLength - Static218.bufferOffset;
			}
			Static335.socket.read(Static298.buffer, n, Static218.bufferOffset);
			Static218.bufferOffset += n;
			if (Static218.bufferOffset < Static290.bufferLength) {
				return -1;
			} else if (Static158.decode(Static298.buffer)) {
				Static300.sorted = new World[Static299.size];
				@Pc(234) int i = 0;
				for (@Pc(236) int id = Static375.minID; id <= Static312.maxID; id++) {
					@Pc(242) World world = Static7.get(id);
					if (world != null) {
						Static300.sorted[i++] = world;
					}
				}
				Static279.aClass2_Sub16_1 = null;
				Static92.anInt1913 = 0;
				Static335.socket.close();
				Static77.step = 0;
				Static12.errors = 0;
				Static298.buffer = null;
				Static335.socket = null;
				Static349.closeTime = MonotonicClock.currentTimeMillis();
				return 0;
			} else {
				return Static101.close(1002);
			}
		} catch (@Pc(274) IOException local274) {
			return Static101.close(1003);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)I")
	public static int method5430(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5431(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(10) DelayedStateChange local10 = DelayedStateChange.create(3, arg0);
		local10.pushServer();
		local10.aString21 = arg1;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIILjava/lang/String;)I")
	public static int parseInt(@OriginalArg(3) String s, @OriginalArg(1) int base) {
		@Pc(26) boolean negative = false;
		@Pc(28) boolean valid = false;
		@Pc(30) int value = 0;
		@Pc(33) int length = s.length();
		for (@Pc(40) int i = 0; i < length; i++) {
			@Pc(46) char c = s.charAt(i);
			if (i == 0) {
				if (c == '-') {
					negative = true;
					continue;
				}
				if (c == '+') {
					continue;
				}
			}
			@Pc(78) int digit;
			if (c >= '0' && c <= '9') {
				digit = c - '0';
			} else if (c >= 'A' && c <= 'Z') {
				digit = c - '7';
			} else if (c >= 'a' && c <= 'z') {
				digit = c - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (base <= digit) {
				throw new NumberFormatException();
			}
			if (negative) {
				digit = -digit;
			}
			@Pc(130) int nextValue = digit + base * value;
			if (nextValue / base != value) {
				throw new NumberFormatException();
			}
			valid = true;
			value = nextValue;
		}
		if (!valid) {
			throw new NumberFormatException();
		}
		return value;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V")
	public static void method5434() {
		if (Static347.step == 5) {
			Static347.step = 6;
		}
	}
}
