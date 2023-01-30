import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!dj", name = "cb", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "client!dj", name = "db", descriptor = "Lclient!r;")
	public static Class197 aClass197_11;

	@OriginalMember(owner = "client!dj", name = "eb", descriptor = "Lclient!r;")
	public static Class197 aClass197_12;

	@OriginalMember(owner = "client!dj", name = "Y", descriptor = "Lclient!hu;")
	public static final SoftLruHashTable A_SOFT_LRU_HASH_TABLE___5 = new SoftLruHashTable(8);

	@OriginalMember(owner = "client!dj", name = "bb", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1669(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static384.anInt7178 >= 100 && !Static381.aBoolean482 || Static384.anInt7178 >= 200) {
			Static207.method3699(Static78.A_TRANSLATABLE_STRING___129.getLocalisedText(client.language));
			return;
		}
		@Pc(33) String local33 = Static135.method2537(arg0);
		if (local33 == null) {
			return;
		}
		@Pc(78) String local78;
		for (@Pc(38) int local38 = 0; local38 < Static384.anInt7178; local38++) {
			@Pc(46) String local46 = Static135.method2537(Static17.aStringArray43[local38]);
			if (local46 != null && local46.equals(local33)) {
				Static207.method3699(arg0 + Static332.A_TRANSLATABLE_STRING___131.getLocalisedText(client.language));
				return;
			}
			if (Static319.aStringArray54[local38] != null) {
				local78 = Static135.method2537(Static319.aStringArray54[local38]);
				if (local78 != null && local78.equals(local33)) {
					Static207.method3699(arg0 + Static332.A_TRANSLATABLE_STRING___131.getLocalisedText(client.language));
					return;
				}
			}
		}
		for (@Pc(108) int local108 = 0; local108 < Static301.anInt5700; local108++) {
			local78 = Static135.method2537(Static226.aStringArray35[local108]);
			if (local78 != null && local78.equals(local33)) {
				Static207.method3699(Static150.A_TRANSLATABLE_STRING___64.getLocalisedText(client.language) + arg0 + Static151.A_TRANSLATABLE_STRING___65.getLocalisedText(client.language));
				return;
			}
			if (Static371.aStringArray66[local108] != null) {
				@Pc(151) String local151 = Static135.method2537(Static371.aStringArray66[local108]);
				if (local151 != null && local151.equals(local33)) {
					Static207.method3699(Static150.A_TRANSLATABLE_STRING___64.getLocalisedText(client.language) + arg0 + Static151.A_TRANSLATABLE_STRING___65.getLocalisedText(client.language));
					return;
				}
			}
		}
		if (Static135.method2537(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41).equals(local33)) {
			Static207.method3699(Static122.A_TRANSLATABLE_STRING___54.getLocalisedText(client.language));
		} else {
			Static91.method1960(Static148.aClass145_104);
			Static257.aClass2_Sub4_Sub2_4.p1(Static27.method872(arg0));
			Static257.aClass2_Sub4_Sub2_4.pjstr(arg0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B[JI[II)V")
	public static void method1671(@OriginalArg(1) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) long local20 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg1; local46++) {
			if (local20 + (long) (local46 & 0x1) > arg0[local46]) {
				@Pc(64) long local64 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16] = local64;
				@Pc(78) int local78 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16++] = local78;
			}
		}
		arg0[arg1] = arg0[local16];
		arg0[local16] = local20;
		arg2[arg1] = arg2[local16];
		arg2[local16] = local34;
		method1671(arg0, local16 - 1, arg2, arg3);
		method1671(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBLclient!r;)Lclient!vj;")
	public static Class2_Sub2_Sub17 method1672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class197 arg2) {
		@Pc(14) Buffer local14 = new Buffer(arg2.fetchFile(arg1, arg0));
		@Pc(54) Class2_Sub2_Sub17 local54 = new Class2_Sub2_Sub17(arg0, local14.gjstr(), local14.gjstr(), local14.mg4(), local14.mg4(), local14.g1() == 1, local14.g1(), local14.g1());
		@Pc(58) int local58 = local14.g1();
		for (@Pc(60) int local60 = 0; local60 < local58; local60++) {
			local54.aClass135_41.method3539(new Class2_Sub31(local14.g1(), local14.g2(), local14.g2(), local14.g2(), local14.g2(), local14.g2(), local14.g2(), local14.g2(), local14.g2()));
		}
		local54.method6149();
		return local54;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)V")
	public static void method1673() {
		for (@Pc(5) int local5 = 0; local5 < Static166.size; local5++) {
			@Pc(13) int local13 = Static211.ids[local5];
			@Pc(17) Npc local17 = Static365.npcs[local13];
			if (local17 != null) {
				Static93.method1999(local17, local17.type.size);
			}
		}
	}
}
