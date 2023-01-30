import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!f", name = "x", descriptor = "Lclient!vj;")
	public static Class2_Sub2_Sub17 aClass2_Sub2_Sub17_1;

	@OriginalMember(owner = "client!f", name = "F", descriptor = "Lclient!od;")
	public static Class2_Sub12_Sub3 aClass2_Sub12_Sub3_1;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_69 = new Class145(61, -1);

	@OriginalMember(owner = "client!f", name = "E", descriptor = "I")
	public static final int anInt1909 = 1400;

	@OriginalMember(owner = "client!f", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString18 = null;

	@OriginalMember(owner = "client!f", name = "H", descriptor = "I")
	public static int anInt1910 = -1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!mc;I)V")
	public static void method1960(@OriginalArg(0) Class145 arg0) {
		Static257.aClass2_Sub4_Sub2_4.p1isaac(arg0.method3701());
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static void method1961() {
		if (Static347.anInt6441 == 0 || Static347.anInt6441 == 5) {
			return;
		}
		try {
			if (++Static182.anInt3420 > 2000) {
				if (Static335.aBufferedSocket_4 != null) {
					Static335.aBufferedSocket_4.method2799();
					Static335.aBufferedSocket_4 = null;
				}
				if (Static216.anInt3800 >= 1) {
					Static41.anInt1046 = -5;
					Static347.anInt6441 = 0;
					return;
				}
				Static182.anInt3420 = 0;
				Static216.anInt3800++;
				Static347.anInt6441 = 1;
				if (Static16.anInt4758 == Static85.anInt1843) {
					Static85.anInt1843 = Static330.anInt6193;
				} else {
					Static85.anInt1843 = Static16.anInt4758;
				}
			}
			if (Static347.anInt6441 == 1) {
				Static5.aPrivelegedRequest_1 = Static328.aClass152_5.method3750(Static216.aString36, Static85.anInt1843);
				Static347.anInt6441 = 2;
			}
			@Pc(112) int local112;
			if (Static347.anInt6441 == 2) {
				if (Static5.aPrivelegedRequest_1.anInt993 == 2) {
					throw new IOException();
				}
				if (Static5.aPrivelegedRequest_1.anInt993 != 1) {
					return;
				}
				Static335.aBufferedSocket_4 = new BufferedSocket((Socket) Static5.aPrivelegedRequest_1.anObject2, Static328.aClass152_5);
				Static5.aPrivelegedRequest_1 = null;
				@Pc(105) long local105 = Static241.aLong130 = Static80.method5984(Static374.aString70);
				local112 = (int) (local105 >> 16 & 0x1FL);
				Static257.aClass2_Sub4_Sub2_4.offset = 0;
				Static257.aClass2_Sub4_Sub2_4.p1(Static43.aClass242_1.anInt7038);
				Static257.aClass2_Sub4_Sub2_4.p1(local112);
				Static335.aBufferedSocket_4.write(Static257.aClass2_Sub4_Sub2_4.data, 2);
				if (Static303.aClass221_2 != null) {
					Static303.aClass221_2.method6324();
				}
				if (Static190.aClass221_1 != null) {
					Static190.aClass221_1.method6324();
				}
				@Pc(145) int local145 = Static335.aBufferedSocket_4.method2800();
				if (Static303.aClass221_2 != null) {
					Static303.aClass221_2.method6324();
				}
				if (Static190.aClass221_1 != null) {
					Static190.aClass221_1.method6324();
				}
				if (local145 != 0) {
					Static347.anInt6441 = 0;
					Static41.anInt1046 = local145;
					Static335.aBufferedSocket_4.method2799();
					Static335.aBufferedSocket_4 = null;
					return;
				}
				Static347.anInt6441 = 3;
			}
			if (Static347.anInt6441 == 3) {
				if (Static335.aBufferedSocket_4.method2795() < 8) {
					return;
				}
				Static335.aBufferedSocket_4.method2793(Static212.aClass2_Sub4_Sub2_3.data, 8, 0);
				Static212.aClass2_Sub4_Sub2_3.offset = 0;
				Static201.aLong119 = Static212.aClass2_Sub4_Sub2_3.g8();
				@Pc(208) Buffer local208 = new Buffer(70);
				@Pc(211) int[] local211 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static201.aLong119 >> 32), (int) Static201.aLong119 };
				local208.p1(10);
				local208.p4(local211[0]);
				local208.p4(local211[1]);
				local208.p4(local211[2]);
				local208.p4(local211[3]);
				local208.p8(Static80.method5984(Static374.aString70));
				local208.pjstr(Static16.aString51);
				local208.rsaenc(Static320.aBigInteger2, Static194.aBigInteger1);
				Static257.aClass2_Sub4_Sub2_4.offset = 0;
				if (Static347.anInt6442 == 40) {
					Static257.aClass2_Sub4_Sub2_4.p1(Static43.aClass242_5.anInt7038);
				} else {
					Static257.aClass2_Sub4_Sub2_4.p1(Static43.aClass242_3.anInt7038);
				}
				Static257.aClass2_Sub4_Sub2_4.p2(0);
				local112 = Static257.aClass2_Sub4_Sub2_4.offset;
				Static257.aClass2_Sub4_Sub2_4.p4(578);
				Static257.aClass2_Sub4_Sub2_4.p1(Static202.anInt3714);
				Static257.aClass2_Sub4_Sub2_4.p1(Static144.method2692());
				Static257.aClass2_Sub4_Sub2_4.p2(Static250.anInt4665);
				Static257.aClass2_Sub4_Sub2_4.p2(Static172.anInt3299);
				Static257.aClass2_Sub4_Sub2_4.p1(Static218.aClass177_Sub1_2.anInt4885);
				Static27.method875(Static257.aClass2_Sub4_Sub2_4);
				Static257.aClass2_Sub4_Sub2_4.pjstr(Static74.aString17);
				Static257.aClass2_Sub4_Sub2_4.p4(Static165.anInt3149);
				@Pc(354) Buffer local354 = Static218.aClass177_Sub1_2.method4493();
				Static257.aClass2_Sub4_Sub2_4.p1(local354.offset);
				Static257.aClass2_Sub4_Sub2_4.pdata(local354.data, local354.offset);
				Static236.aBoolean288 = true;
				Static257.aClass2_Sub4_Sub2_4.p2(Static292.anInt5510);
				Static257.aClass2_Sub4_Sub2_4.p4(Static342.aClass197_77.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static34.aClass197_67.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static289.aClass197_71.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static354.aClass197_9.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static85.aClass197_21.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static288.js5Archive5.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static101.aClass197_23.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static237.aClass197_63.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static30.aClass197_5.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static324.aClass197_86.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static75.aClass197_18.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static216.aClass197_58.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static195.aClass197_54.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static255.aClass197_64.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static133.aClass197_32.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static120.aClass197_28.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static391.aClass197_96.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static226.aClass197_61.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static216.aClass197_57.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static61.aClass197_12.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static139.aClass197_35.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static173.aClass197_45.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static294.aClass197_75.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static389.aClass197_66.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static385.aClass197_94.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static139.aClass197_34.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static235.aClass197_47.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static61.aClass197_11.method5077());
				Static257.aClass2_Sub4_Sub2_4.p4(Static85.aClass197_20.method5077());
				Static257.aClass2_Sub4_Sub2_4.pdata(local208.data, local208.offset);
				Static257.aClass2_Sub4_Sub2_4.psize2(Static257.aClass2_Sub4_Sub2_4.offset - local112);
				Static335.aBufferedSocket_4.write(Static257.aClass2_Sub4_Sub2_4.data, Static257.aClass2_Sub4_Sub2_4.offset);
				Static257.aClass2_Sub4_Sub2_4.initIsaac(local211);
				for (@Pc(579) int local579 = 0; local579 < 4; local579++) {
					local211[local579] += 50;
				}
				Static212.aClass2_Sub4_Sub2_3.initIsaac(local211);
				Static347.anInt6441 = 4;
			}
			@Pc(619) int local619;
			if (Static347.anInt6441 == 4) {
				if (Static335.aBufferedSocket_4.method2795() < 1) {
					return;
				}
				local619 = Static335.aBufferedSocket_4.method2800();
				if (local619 == 21) {
					Static347.anInt6441 = 7;
				} else if (local619 == 29) {
					Static347.anInt6441 = 11;
				} else if (local619 == 1) {
					Static347.anInt6441 = 5;
					Static41.anInt1046 = local619;
					return;
				} else if (local619 == 2) {
					Static347.anInt6441 = 8;
				} else if (local619 == 15) {
					Static347.anInt6441 = 12;
					Static82.anInt1836 = -2;
				} else if (local619 == 23 && Static216.anInt3800 < 1) {
					Static182.anInt3420 = 0;
					Static216.anInt3800++;
					Static347.anInt6441 = 1;
					Static335.aBufferedSocket_4.method2799();
					Static335.aBufferedSocket_4 = null;
					return;
				} else {
					Static41.anInt1046 = local619;
					Static347.anInt6441 = 0;
					Static335.aBufferedSocket_4.method2799();
					Static335.aBufferedSocket_4 = null;
					return;
				}
			}
			if (Static347.anInt6441 == 6) {
				Static257.aClass2_Sub4_Sub2_4.offset = 0;
				Static257.aClass2_Sub4_Sub2_4.p1isaac(Static43.aClass242_4.anInt7038);
				Static335.aBufferedSocket_4.write(Static257.aClass2_Sub4_Sub2_4.data, Static257.aClass2_Sub4_Sub2_4.offset);
				Static347.anInt6441 = 4;
			} else if (Static347.anInt6441 == 7) {
				if (Static335.aBufferedSocket_4.method2795() >= 1) {
					Static47.anInt1248 = Static335.aBufferedSocket_4.method2800() * 60 + 180;
					Static41.anInt1046 = 21;
					Static347.anInt6441 = 0;
					Static335.aBufferedSocket_4.method2799();
					Static335.aBufferedSocket_4 = null;
				}
			} else if (Static347.anInt6441 != 11) {
				if (Static347.anInt6441 == 8) {
					if (Static335.aBufferedSocket_4.method2795() < 13) {
						return;
					}
					Static335.aBufferedSocket_4.method2793(Static212.aClass2_Sub4_Sub2_3.data, 13, 0);
					Static212.aClass2_Sub4_Sub2_3.offset = 0;
					Static4.anInt90 = Static212.aClass2_Sub4_Sub2_3.g1();
					Static210.anInt3774 = Static212.aClass2_Sub4_Sub2_3.g1();
					Static56.aBoolean123 = Static212.aClass2_Sub4_Sub2_3.g1() == 1;
					Static101.aBoolean159 = Static212.aClass2_Sub4_Sub2_3.g1() == 1;
					Static347.aBoolean434 = Static212.aClass2_Sub4_Sub2_3.g1() == 1;
					Static109.aBoolean166 = Static212.aClass2_Sub4_Sub2_3.g1() == 1;
					Static234.anInt4226 = Static212.aClass2_Sub4_Sub2_3.g2();
					Static381.aBoolean482 = Static212.aClass2_Sub4_Sub2_3.g1() == 1;
					Static206.aBoolean241 = Static212.aClass2_Sub4_Sub2_3.g1() == 1;
					Static359.aClass202_4.method5156(Static206.aBoolean241);
					Static313.aClass107_2.method2762(Static206.aBoolean241);
					Static6.aClass219_1.method5572(Static206.aBoolean241);
					if (Static56.aBoolean123 && !Static347.aBoolean434 || Static381.aBoolean482) {
						try {
							Static404.method4627(Static328.aClass152_5.anApplet1, "zap");
						} catch (@Pc(896) Throwable local896) {
							if (Static132.aBoolean180) {
								try {
									Static328.aClass152_5.anApplet1.getAppletContext().showDocument(new URL(Static328.aClass152_5.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(912) Exception local912) {
								}
							}
						}
					} else {
						try {
							Static404.method4627(Static328.aClass152_5.anApplet1, "unzap");
						} catch (@Pc(922) Throwable local922) {
						}
					}
					if (Static189.aClass127_6 == Static121.aClass127_4) {
						try {
							Static404.method4627(Static328.aClass152_5.anApplet1, "loggedin");
						} catch (@Pc(934) Throwable local934) {
						}
					}
					Static347.anInt6441 = 10;
				}
				if (Static347.anInt6441 == 10) {
					if (Static212.aClass2_Sub4_Sub2_3.method4869()) {
						if (Static335.aBufferedSocket_4.method2795() < 1) {
							return;
						}
						Static335.aBufferedSocket_4.method2793(Static212.aClass2_Sub4_Sub2_3.data, 1, Static212.aClass2_Sub4_Sub2_3.offset + 2);
					}
					Static231.aClass89_164 = Static166.method3187()[Static212.aClass2_Sub4_Sub2_3.method4863()];
					Static82.anInt1836 = Static212.aClass2_Sub4_Sub2_3.g2();
					Static347.anInt6441 = 9;
				}
				if (Static347.anInt6441 == 9) {
					if (Static335.aBufferedSocket_4.method2795() >= Static82.anInt1836) {
						Static335.aBufferedSocket_4.method2793(Static212.aClass2_Sub4_Sub2_3.data, Static82.anInt1836, 0);
						Static212.aClass2_Sub4_Sub2_3.offset = 0;
						Static41.anInt1046 = 2;
						local619 = Static82.anInt1836;
						Static347.anInt6441 = 0;
						Static390.method6448();
						Static366.method6119(Static212.aClass2_Sub4_Sub2_3);
						Static105.anInt2187 = -1;
						Static181.method3374(false);
						if (local619 != Static212.aClass2_Sub4_Sub2_3.offset) {
							throw new RuntimeException("lswp pos:" + Static212.aClass2_Sub4_Sub2_3.offset + " psize:" + local619);
						}
						Static231.aClass89_164 = null;
					}
				} else if (Static347.anInt6441 == 12) {
					if (Static82.anInt1836 == -2) {
						if (Static335.aBufferedSocket_4.method2795() < 2) {
							return;
						}
						Static335.aBufferedSocket_4.method2793(Static212.aClass2_Sub4_Sub2_3.data, 2, 0);
						Static212.aClass2_Sub4_Sub2_3.offset = 0;
						Static82.anInt1836 = Static212.aClass2_Sub4_Sub2_3.g2();
					}
					if (Static335.aBufferedSocket_4.method2795() >= Static82.anInt1836) {
						Static335.aBufferedSocket_4.method2793(Static212.aClass2_Sub4_Sub2_3.data, Static82.anInt1836, 0);
						Static212.aClass2_Sub4_Sub2_3.offset = 0;
						Static41.anInt1046 = 15;
						Static347.anInt6441 = 0;
						local619 = Static82.anInt1836;
						Static182.method3387();
						Static366.method6119(Static212.aClass2_Sub4_Sub2_3);
						if (Static212.aClass2_Sub4_Sub2_3.offset != local619) {
							throw new RuntimeException("lswpr pos:" + Static212.aClass2_Sub4_Sub2_3.offset + " psize:" + local619);
						}
						Static231.aClass89_164 = null;
					}
				}
			} else if (Static335.aBufferedSocket_4.method2795() >= 1) {
				Static360.anInt6186 = Static335.aBufferedSocket_4.method2800();
				Static347.anInt6441 = 0;
				Static41.anInt1046 = 29;
				Static335.aBufferedSocket_4.method2799();
				Static335.aBufferedSocket_4 = null;
			}
		} catch (@Pc(1122) IOException local1122) {
			if (Static335.aBufferedSocket_4 != null) {
				Static335.aBufferedSocket_4.method2799();
				Static335.aBufferedSocket_4 = null;
			}
			if (Static216.anInt3800 < 1) {
				Static182.anInt3420 = 0;
				Static216.anInt3800++;
				Static347.anInt6441 = 1;
				if (Static16.anInt4758 == Static85.anInt1843) {
					Static85.anInt1843 = Static330.anInt6193;
				} else {
					Static85.anInt1843 = Static16.anInt4758;
				}
			} else {
				Static41.anInt1046 = -4;
				Static347.anInt6441 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static void method1962() {
		Static335.A_SOFT_LRU_HASH_TABLE___57.method2614();
		Static124.A_SOFT_LRU_HASH_TABLE___63.method2614();
		Static333.A_SOFT_LRU_HASH_TABLE___65.method2614();
		Static297.A_SOFT_LRU_HASH_TABLE___44.method2614();
		Static288.A_SOFT_LRU_HASH_TABLE___42.method2614();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)V")
	public static void method1963(@OriginalArg(0) int arg0) {
		Static323.anInt6062 = arg0;
		Static124.A_SOFT_LRU_HASH_TABLE___63.method2614();
	}
}
