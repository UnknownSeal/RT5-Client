import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!pk", name = "nb", descriptor = "I")
	public static int anInt5023;

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "Lclient!h;")
	public static final Class89 aClass89_184 = new Class89(2, 2);

	@OriginalMember(owner = "client!pk", name = "hb", descriptor = "Lclient!h;")
	public static final Class89 aClass89_185 = new Class89(78, 6);

	@OriginalMember(owner = "client!pk", name = "ib", descriptor = "I")
	public static int anInt5022 = -1;

	@OriginalMember(owner = "client!pk", name = "jb", descriptor = "Lclient!h;")
	public static final Class89 aClass89_186 = new Class89(0, 10);

	@OriginalMember(owner = "client!pk", name = "kb", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_180 = new Class145(0, 2);

	@OriginalMember(owner = "client!pk", name = "lb", descriptor = "Lclient!s;")
	public static final Class210 aClass210_11 = new Class210(1, 15);

	@OriginalMember(owner = "client!pk", name = "mb", descriptor = "[I")
	public static final int[] anIntArray351 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void findQuickChatPhrases(@OriginalArg(0) boolean global, @OriginalArg(1) String query) {
		@Pc(4) String queryLowercase = query.toLowerCase();
		@Pc(11) short[] results = new short[16];
		@Pc(13) int size = 0;
		@Pc(19) int start = global ? 32768 : 0;
		@Pc(27) int end = (global ? Static361.globalCapacity : Static21.capacity) + start;
		for (@Pc(34) int i = start; i < end; i++) {
			@Pc(40) QuickChatPhraseType type = Static146.get(i);
			if (type.searchable && type.getText().toLowerCase().indexOf(queryLowercase) != -1) {
				if (size >= 50) {
					Static177.results = null;
					Static328.size = -1;
					return;
				}
				if (size >= results.length) {
					@Pc(73) short[] newResults = new short[results.length * 2];
					for (@Pc(75) int j = 0; j < size; j++) {
						newResults[j] = results[j];
					}
					results = newResults;
				}
				results[size++] = (short) i;
			}
		}
		Static328.size = size;
		Static12.index = 0;
		Static177.results = results;
		@Pc(112) String[] names = new String[Static328.size];
		for (@Pc(114) int i = 0; i < Static328.size; i++) {
			names[i] = Static146.get(results[i]).getText();
		}
		Static135.sort(names, Static177.results);
	}
}
