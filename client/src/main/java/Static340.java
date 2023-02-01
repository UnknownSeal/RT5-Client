import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "Lclient!h;")
	public static final Class89 aClass89_227 = new Class89(101, 14);

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(CB)C")
	public static char method5761(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLclient!oe;)I")
	public static int method5763(@OriginalArg(1) Npc arg0) {
		@Pc(8) NpcType local8 = arg0.type;
		if (local8.multiNpcs != null) {
			local8 = local8.getMultiNpc(Static214.aClass226_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local8.walksound;
		@Pc(32) BasType local32 = arg0.method4331();
		if (arg0.aBoolean317) {
			local28 = local8.idlesound;
		} else if (local32.runSeqID == arg0.anInt4585 || arg0.anInt4585 == local32.anInt6292 || local32.anInt6301 == arg0.anInt4585 || local32.anInt6271 == arg0.anInt4585) {
			local28 = local8.runsound;
		} else if (local32.crawlSeqID == arg0.anInt4585 || arg0.anInt4585 == local32.anInt6299 || local32.anInt6267 == arg0.anInt4585 || arg0.anInt4585 == local32.anInt6284) {
			local28 = local8.crawlsound;
		}
		return local28;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V")
	public static void method5764() {
		@Pc(7) FileOnDisk local7 = null;
		try {
			@Pc(11) PrivelegedRequest local11 = GameShell.signlink.method3755();
			while (local11.status == 0) {
				Static231.sleep(1L);
			}
			if (local11.status == 1) {
				local7 = (FileOnDisk) local11.result;
				@Pc(41) Buffer local41 = new Buffer(Static112.anInt2294 * 6 + 3);
				local41.p1(1);
				local41.p2(Static112.anInt2294);
				for (@Pc(51) int local51 = 0; local51 < Static75.anIntArray117.length; local51++) {
					if (Static89.aBooleanArray18[local51]) {
						local41.p2(local51);
						local41.p4(Static75.anIntArray117[local51]);
					}
				}
				local7.write(local41.bytes, local41.offset, 0);
			}
		} catch (@Pc(82) Exception local82) {
		}
		try {
			if (local7 != null) {
				local7.close();
			}
		} catch (@Pc(89) Exception local89) {
		}
		Static375.aLong221 = MonotonicClock.currentTimeMillis();
		Static273.aBoolean374 = false;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BZLjava/lang/String;I)Z")
	public static boolean isIntInternal(@OriginalArg(2) String s) {
		@Pc(36) boolean negative = false;
		@Pc(38) boolean valid = false;
		@Pc(40) int value = 0;
		@Pc(43) int length = s.length();
		for (@Pc(45) int i = 0; i < length; i++) {
			@Pc(51) char c = s.charAt(i);
			if (i == 0) {
				if (c == '-') {
					negative = true;
					continue;
				}
				if (c == '+') {
					continue;
				}
			}
			@Pc(94) int digit;
			if (c >= '0' && c <= '9') {
				digit = c - '0';
			} else if (c >= 'A' && c <= 'Z') {
				digit = c - '7';
			} else if (c >= 'a' && c <= 'z') {
				digit = c - 'W';
			} else {
				return false;
			}
			if (digit >= 10) {
				return false;
			}
			if (negative) {
				digit = -digit;
			}
			@Pc(123) int nextValue = value * 10 + digit;
			if (nextValue / 10 != value) {
				return false;
			}
			value = nextValue;
			valid = true;
		}
		return valid;
	}
}
