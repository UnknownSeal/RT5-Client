import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
	public static int anInt7206;

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
	public static int anInt7211;

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "[[[Lclient!f;")
	public static Class67[][][] aClass67ArrayArrayArray5;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
	public static void method6448() {
		Static289.aJs5_71.discardUnpacked = 1;
		client.instance.loadMiscNatives();
		GameShell.focus = true;
		Static343.aBoolean431 = true;
		Static4.method77();
		Static257.aClass2_Sub4_Sub2_4.offset = 0;
		Static86.anInt1870 = 0;
		Static231.aClass89_164 = null;
		Static334.aClass89_222 = null;
		Static39.aClass89_35 = null;
		Static268.anInt4955 = 0;
		Static212.inboundBuffer.offset = 0;
		Static151.anInt2773 = 0;
		Static66.aClass89_57 = null;
		for (@Pc(4365) int local4365 = 0; local4365 < Static50.aClass84Array1.length; local4365++) {
			Static50.aClass84Array1[local4365] = null;
		}
		for (@Pc(4383) int local4383 = 0; local4383 < 100; local4383++) {
			Static88.aStringArray13[local4383] = null;
		}
		Static14.anInt327 = (int) (Math.random() * 110.0D) - 55;
		Static97.anInt2005 = (int) (Math.random() * 30.0D) - 20;
		Static243.size = 0;
		Static330.aBoolean419 = false;
		Static277.aFloat67 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static24.anInt642 = (int) (Math.random() * 100.0D) - 50;
		Static226.anInt4016 = 0;
		Static6.anInt158 = (int) (Math.random() * 120.0D) - 60;
		Static53.anInt3966 = (int) (Math.random() * 80.0D) - 40;
		Static254.method4371();
		for (@Pc(4448) int local4448 = 0; local4448 < 2048; local4448++) {
			Static12.aClass11_Sub5_Sub2_Sub1Array1[local4448] = null;
		}
		Static166.size = 0;
		for (@Pc(4464) int local4464 = 0; local4464 < 32768; local4464++) {
			Static365.npcs[local4464] = null;
		}
		Static332.A_LINKED_LIST___38.clear();
		Static129.A_LINKED_LIST___20.clear();
		Static284.aClass36_7.method1416();
		Static120.aClass4_49.clear();
		Static207.aLinkedList_26 = new LinkedList();
		Static235.anInt3363 = 0;
		Static384.anInt7178 = 0;
		Static214.aClass226_1.method5780();
		DelayedStateChange.clear();
		Static236.anInt4309 = 0;
		Static254.anInt4698 = 0;
		Static123.anInt2420 = 0;
		Static359.anInt6702 = 0;
		Static348.anInt6446 = 0;
		Static311.anInt5810 = 0;
		Static57.anInt1464 = 0;
		Static19.anInt535 = 0;
		Static180.anInt3404 = 0;
		Static33.anInt4463 = 0;
		for (@Pc(4521) int local4521 = 0; local4521 < Static75.anIntArray117.length; local4521++) {
			if (!Static89.aBooleanArray18[local4521]) {
				Static75.anIntArray117[local4521] = -1;
			}
		}
		if (Static139.topLevelInterface != -1) {
			Static162.method2978(Static139.topLevelInterface);
		}
		for (@Pc(4552) Class2_Sub7 local4552 = (Class2_Sub7) Static329.aClass4_130.method80(); local4552 != null; local4552 = (Class2_Sub7) Static329.aClass4_130.method79()) {
			if (!local4552.isLinked()) {
				local4552 = (Class2_Sub7) Static329.aClass4_130.method80();
				if (local4552 == null) {
					break;
				}
			}
			Static276.method4654(false, local4552, true);
		}
		Static139.topLevelInterface = -1;
		Static329.aClass4_130 = new HashTable(8);
		Static210.method3719();
		Static192.aComponent_8 = null;
		for (@Pc(4594) int local4594 = 0; local4594 < 8; local4594++) {
			Static243.aStringArray44[local4594] = null;
			Static44.aBooleanArray11[local4594] = false;
			Static207.anIntArray225[local4594] = -1;
		}
		Static302.method1458();
		Static17.aBoolean308 = true;
		for (@Pc(4618) int local4618 = 0; local4618 < 100; local4618++) {
			Static357.aBooleanArray59[local4618] = true;
		}
		Static186.anInt3730 = 0;
		Static389.aString53 = null;
		Static47.aClass214Array1 = null;
		for (@Pc(4636) int local4636 = 0; local4636 < 6; local4636++) {
			Static290.aClass187Array1[local4636] = new Class187();
		}
		for (@Pc(4650) int local4650 = 0; local4650 < 25; local4650++) {
			Static268.boostedLevels[local4650] = 0;
			Static325.baseLevels[local4650] = 0;
			Static80.experience[local4650] = 0;
		}
		Static348.method5827();
		Static257.aShortArray79 = Static223.aShortArray78 = Static258.aShortArray95 = Static147.aShortArray54 = new short[256];
		Static100.aBoolean156 = true;
		Static330.aString62 = LocalisedText.WALK_HERE.getLocalisedText(client.language);
		Static292.anInt5510 = 0;
		Static218.aClass177_Sub1_2.aBoolean365 = false;
		Static218.aClass177_Sub1_2.aBoolean366 = false;
		Static160.method2955();
		Static93.method2002();
		Static375.aLong222 = 0L;
		Static385.aClass2_Sub16_2 = null;
		Static289.aJs5_71.discardUnpacked = 2;
	}
}
