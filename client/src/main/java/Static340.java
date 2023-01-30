import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "Lclient!gd;")
	public static final LocalisedText A_TRANSLATABLE_STRING___133 = new LocalisedText("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

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
		@Pc(7) Class204 local7 = null;
		try {
			@Pc(11) PrivelegedRequest local11 = Static328.aClass152_5.method3755();
			while (local11.anInt993 == 0) {
				Static231.sleep(1L);
			}
			if (local11.anInt993 == 1) {
				local7 = (Class204) local11.anObject2;
				@Pc(41) Buffer local41 = new Buffer(Static112.anInt2294 * 6 + 3);
				local41.p1(1);
				local41.p2(Static112.anInt2294);
				for (@Pc(51) int local51 = 0; local51 < Static75.anIntArray117.length; local51++) {
					if (Static89.aBooleanArray18[local51]) {
						local41.p2(local51);
						local41.p4(Static75.anIntArray117[local51]);
					}
				}
				local7.method5194(local41.data, local41.offset, 0);
			}
		} catch (@Pc(82) Exception local82) {
		}
		try {
			if (local7 != null) {
				local7.method5192();
			}
		} catch (@Pc(89) Exception local89) {
		}
		Static375.aLong221 = Static204.method3684();
		Static273.aBoolean374 = false;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BZLjava/lang/String;I)Z")
	public static boolean method5765(@OriginalArg(2) String arg0) {
		@Pc(36) boolean local36 = false;
		@Pc(38) boolean local38 = false;
		@Pc(40) int local40 = 0;
		@Pc(43) int local43 = arg0.length();
		for (@Pc(45) int local45 = 0; local45 < local43; local45++) {
			@Pc(51) char local51 = arg0.charAt(local45);
			if (local45 == 0) {
				if (local51 == '-') {
					local36 = true;
					continue;
				}
				if (local51 == '+') {
					continue;
				}
			}
			@Pc(94) int local94;
			if (local51 >= '0' && local51 <= '9') {
				local94 = local51 - '0';
			} else if (local51 >= 'A' && local51 <= 'Z') {
				local94 = local51 - '7';
			} else if (local51 >= 'a' && local51 <= 'z') {
				local94 = local51 - 'W';
			} else {
				return false;
			}
			if (local94 >= 10) {
				return false;
			}
			if (local36) {
				local94 = -local94;
			}
			@Pc(123) int local123 = local40 * 10 + local94;
			if (local40 != local123 / 10) {
				return false;
			}
			local40 = local123;
			local38 = true;
		}
		return local38;
	}
}
