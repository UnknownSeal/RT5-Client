import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "Lclient!cm;")
	public static Class36 aClass36_4;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "[S")
	public static final short[] aShortArray65 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void findObjs(@OriginalArg(0) String query, @OriginalArg(2) boolean stockMarketOnly) {
		Static61.aJs5_12.discardUnpacked = 1;
		@Pc(18) String queryLowercase = query.toLowerCase();
		@Pc(23) int size = 0;
		@Pc(21) short[] results = new short[16];
		for (@Pc(25) int i = 0; i < Static313.aClass107_2.anInt2779; i++) {
			@Pc(34) ObjType type = Static313.aClass107_2.get(i);
			if ((!stockMarketOnly || type.stockMarket) && type.certificateTemplate == -1 && type.lentLink == -1 && type.dummyItem == 0 && type.name.toLowerCase().indexOf(queryLowercase) != -1) {
				if (size >= 250) {
					Static328.size = -1;
					Static177.results = null;
					return;
				}
				if (results.length <= size) {
					@Pc(84) short[] newResults = new short[results.length * 2];
					for (@Pc(86) int j = 0; j < size; j++) {
						newResults[j] = results[j];
					}
					results = newResults;
				}
				results[size++] = (short) i;
			}
		}
		Static12.index = 0;
		Static177.results = results;
		Static328.size = size;
		@Pc(128) String[] names = new String[Static328.size];
		for (@Pc(130) int local130 = 0; local130 < Static328.size; local130++) {
			names[local130] = Static313.aClass107_2.get(results[local130]).name;
		}
		Static135.sort(names, Static177.results);
		Static61.aJs5_12.method5067();
		Static61.aJs5_12.discardUnpacked = 2;
	}
}
