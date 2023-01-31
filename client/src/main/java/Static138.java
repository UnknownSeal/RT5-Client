import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!hr", name = "S", descriptor = "Lclient!jd;")
	public static Class13 aClass13_8;

	@OriginalMember(owner = "client!hr", name = "Y", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_3 = new Class16("", 10);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BIII)V")
	public static void method2578(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg1 * Static218.aClass177_Sub1_2.musicVolume >> 8;
		if (arg2 == -1 && !Static393.jingle) {
			Static368.method6191();
		} else if (arg2 != -1 && (Static171.anInt3268 != arg2 || !Static64.method1704()) && local6 != 0 && !Static393.jingle) {
			Static180.method3366(arg2, arg0, local6, Static101.aJs5_23);
		}
		Static171.anInt3268 = arg2;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(IIB)I")
	public static int method2579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(49) int local49 = Static309.method5276(arg0 - 1, arg1 + -1) + Static309.method5276(arg0 - 1, arg1 + 1) + Static309.method5276(arg0 + 1, arg1 + -1) + Static309.method5276(arg0 + 1, arg1 + 1);
		@Pc(78) int local78 = Static309.method5276(arg0, arg1 - 1) + Static309.method5276(arg0, arg1 + 1) + Static309.method5276(arg0 - 1, arg1) + Static309.method5276(arg0 + 1, arg1);
		@Pc(83) int local83 = Static309.method5276(arg0, arg1);
		return local83 / 4 + local49 / 16 + local78 / 8;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V")
	public static void method2580(@OriginalArg(0) int arg0) {
		for (@Pc(16) Node local16 = Static327.aClass4_127.method80(); local16 != null; local16 = Static327.aClass4_127.method79()) {
			if ((long) arg0 == (local16.key >> 48 & 0xFFFFL)) {
				local16.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)Lclient!mn;")
	public static QuickChatCategoryType get(@OriginalArg(1) int id) {
		@Pc(10) QuickChatCategoryType type = (QuickChatCategoryType) Static257.types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(25) byte[] bytes;
		if (id >= 32768) {
			bytes = Static43.globalArchive.fetchFile(0, id & 0x7FFF);
		} else {
			bytes = Static367.archive.fetchFile(0, id);
		}
		type = new QuickChatCategoryType();
		if (bytes != null) {
			type.decode(new Buffer(bytes));
		}
		if (id >= 32768) {
			type.method3792();
		}
		Static257.types.put(id, type);
		return type;
	}
}
