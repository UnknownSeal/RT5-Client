import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_203 = new Class145(59, 18);

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "[Lclient!pr;")
	public static final RawModel[] A_RAW_MODEL_ARRAY_1 = new RawModel[4];

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
	public static void method5282() {
		Static23.aClass2_Sub5_1 = new Class2_Sub5(LocalisedText.CANCEL.getLocalisedText(client.language), "", Static107.anInt2219, 1001, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIILclient!id;)J")
	public static long method5283(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface6 arg2) {
		@Pc(13) long local13 = 4194304L;
		@Pc(15) long local15 = 2147483648L;
		@Pc(17) long local17 = Long.MIN_VALUE;
		@Pc(24) Class41 local24 = Static359.aClass202_4.method5162(arg2.method6084());
		@Pc(45) long local45 = (long) ((arg2.method6080() | 0x10000) << 14 | arg1 | arg0 << 7 | arg2.method6083() << 20);
		if (local24.anInt1335 == 0) {
			local45 |= local17;
		}
		if (local24.anInt1354 == 1) {
			local45 |= local13;
		}
		if (local24.aBoolean108) {
			local45 |= local15;
		}
		return local45 | (long) arg2.method6084() << 32;
	}
}
