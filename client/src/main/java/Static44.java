import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
	public static int anInt1105;

	@OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
	public static int visibleLevel = 0;

	@OriginalMember(owner = "client!cl", name = "M", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!wm;BLclient!r;)V")
	public static void method1358(@OriginalArg(0) Class19 arg0, @OriginalArg(2) Js5 arg1) {
		@Pc(10) SoftwareSprite[] local10 = Static396.method1688(arg1, Static373.anInt7028);
		Static15.aSpriteArray3 = new Sprite[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static15.aSpriteArray3[local16] = arg0.method2891(local10[local16]);
		}
		local10 = Static396.method1688(arg1, Static192.anInt3545);
		Static62.aSpriteArray9 = new Sprite[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static62.aSpriteArray9[local43] = arg0.method2891(local10[local43]);
		}
		local10 = Static396.method1688(arg1, Static256.anInt4745);
		Static332.aSpriteArray23 = new Sprite[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static332.aSpriteArray23[local74] = arg0.method2891(local10[local74]);
		}
		local10 = Static396.method1688(arg1, Static382.anInt7140);
		Static232.aSpriteArray17 = new Sprite[local10.length];
		for (@Pc(105) int local105 = 0; local105 < local10.length; local105++) {
			Static232.aSpriteArray17[local105] = arg0.method2891(local10[local105]);
		}
		local10 = Static396.method1688(arg1, Static166.anInt3193);
		Static137.aSprite = new Sprite[local10.length];
		for (@Pc(141) int local141 = 0; local141 < local10.length; local141++) {
			Static137.aSprite[local141] = arg0.method2891(local10[local141]);
		}
		local10 = Static396.method1688(arg1, Static390.anInt7206);
		Static230.headHints = new Sprite[local10.length];
		for (@Pc(168) int local168 = 0; local168 < local10.length; local168++) {
			Static230.headHints[local168] = arg0.method2891(local10[local168]);
		}
		local10 = Static396.method1688(arg1, Static363.anInt6792);
		Static123.aSpriteArray10 = new Sprite[local10.length];
		for (@Pc(199) int local199 = 0; local199 < local10.length; local199++) {
			Static123.aSpriteArray10[local199] = arg0.method2891(local10[local199]);
		}
		local10 = Static396.method1688(arg1, Static237.anInt4324);
		Static352.aSpriteArray25 = new Sprite[local10.length];
		for (@Pc(226) int local226 = 0; local226 < local10.length; local226++) {
			Static352.aSpriteArray25[local226] = arg0.method2891(local10[local226]);
		}
		local10 = Static396.method1688(arg1, Static155.anInt2811);
		Static288.aSpriteArray21 = new Sprite[local10.length];
		for (@Pc(257) int local257 = 0; local257 < local10.length; local257++) {
			Static288.aSpriteArray21[local257] = arg0.method2891(local10[local257]);
		}
		local10 = Static396.method1688(arg1, Static326.anInt6236);
		Static76.mapDots = new Sprite[local10.length];
		for (@Pc(288) int local288 = 0; local288 < local10.length; local288++) {
			Static76.mapDots[local288] = arg0.method2891(local10[local288]);
		}
		local10 = Static396.method1688(arg1, Static169.anInt3205);
		Static126.aSpriteArray22 = new Sprite[local10.length];
		for (@Pc(319) int local319 = 0; local319 < local10.length; local319++) {
			Static126.aSpriteArray22[local319] = arg0.method2891(local10[local319]);
		}
		local10 = Static396.method1688(arg1, Static102.anInt3590);
		Static124.aSpriteArray27 = new Sprite[local10.length];
		for (@Pc(346) int local346 = 0; local346 < local10.length; local346++) {
			Static124.aSpriteArray27[local346] = arg0.method2891(local10[local346]);
		}
		Static12.aSprite_2 = arg0.method2891(Static396.loadSoftwareSprite(arg1, Static139.anInt2594, 0));
		Static119.aSprite_7 = arg0.method2891(Static396.loadSoftwareSprite(arg1, Static322.anInt6031, 0));
		local10 = Static396.method1688(arg1, Static373.anInt7030);
		Static116.aSpriteArray8 = new Sprite[local10.length];
		for (@Pc(393) int local393 = 0; local393 < local10.length; local393++) {
			Static116.aSpriteArray8[local393] = arg0.method2891(local10[local393]);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method1359(@OriginalArg(0) Js5 arg0) {
		Static75.anInt1736 = arg0.getGroupID("titlebg");
		Static265.anInt4856 = arg0.getGroupID("logo");
	}
}
