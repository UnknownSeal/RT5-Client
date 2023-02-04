import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
	public static int anInt2703 = 0;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public static int anInt2705 = 2;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
	public static int anInt2706 = 0;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(CI)Z")
	public static boolean method2697(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int parseInt(@OriginalArg(1) String s) {
		return Static319.parseInt(s, 10);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Lclient!tb;")
	public static QuickChatPhraseType get(@OriginalArg(1) int id) {
		@Pc(10) QuickChatPhraseType type = (QuickChatPhraseType) Static388.types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(28) byte[] bytes;
		if (id < 32768) {
			bytes = Static137.archive.fetchFile(1, id);
		} else {
			bytes = Static308.globalArchive.fetchFile(1, id & 0x7FFF);
		}
		type = new QuickChatPhraseType();
		if (bytes != null) {
			type.decode(new Buffer(bytes));
		}
		if (id >= 32768) {
			type.method5603();
		}
		Static388.types.put(id, type);
		return type;
	}
}
