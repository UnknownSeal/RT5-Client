import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!f", name = "x", descriptor = "Lclient!vj;")
	public static Map aMap_1;

	@OriginalMember(owner = "client!f", name = "F", descriptor = "Lclient!od;")
	public static MidiPcmStream stream;

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
		Static257.outboundBuffer.p1isaac(arg0.method3701());
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static void loop() {
		if (Static347.step == 0 || Static347.step == 5) {
			return;
		}
		try {
			if (++Static182.loops > 2000) {
				if (Static335.socket != null) {
					Static335.socket.close();
					Static335.socket = null;
				}
				if (Static216.errors >= 1) {
					Static41.reply = -5;
					Static347.step = 0;
					return;
				}
				Static182.loops = 0;
				Static216.errors++;
				Static347.step = 1;
				if (client.port == client.defaultPort) {
					client.port = client.alternatePort;
				} else {
					client.port = client.defaultPort;
				}
			}
			if (Static347.step == 1) {
				Static5.sockerRequest = GameShell.signlink.openSocket(client.hostname, client.port);
				Static347.step = 2;
			}

			if (Static347.step == 2) {
				if (Static5.sockerRequest.status == 2) {
					throw new IOException();
				}
				if (Static5.sockerRequest.status != 1) {
					return;
				}
				Static335.socket = new BufferedSocket((Socket) Static5.sockerRequest.result, GameShell.signlink);
				Static5.sockerRequest = null;
				@Pc(105) long encodedUsername = Static241.encodedUsername = Static80.encode(Static374.username);
				@Pc(112) int usernameHash = (int) (encodedUsername >> 16 & 0x1FL);
				Static257.outboundBuffer.offset = 0;
				Static257.outboundBuffer.p1(Static43.aClass242_1.value);
				Static257.outboundBuffer.p1(usernameHash);
				Static335.socket.write(Static257.outboundBuffer.bytes, 2);
				if (client.musicChannel != null) {
					client.musicChannel.method6324();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method6324();
				}
				@Pc(145) int reply = Static335.socket.read();
				if (client.musicChannel != null) {
					client.musicChannel.method6324();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method6324();
				}
				if (reply != 0) {
					Static347.step = 0;
					Static41.reply = reply;
					Static335.socket.close();
					Static335.socket = null;
					return;
				}
				Static347.step = 3;
			}
			if (Static347.step == 3) {
				if (Static335.socket.available() < 8) {
					return;
				}
				Static335.socket.read(0, 8, Static212.inboundBuffer.bytes);
				Static212.inboundBuffer.offset = 0;
				Static201.serverKey = Static212.inboundBuffer.g8();
				@Pc(208) Buffer buffer = new Buffer(70);
				@Pc(211) int[] key = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static201.serverKey >> 32), (int) Static201.serverKey};
				buffer.p1(10);
				buffer.p4(key[0]);
				buffer.p4(key[1]);
				buffer.p4(key[2]);
				buffer.p4(key[3]);
				buffer.p8(Static80.encode(Static374.username));
				buffer.pjstr(Static16.password);
				buffer.rsaEncrypt(Static194.EXPONENT, Static320.MODULUS);
				Static257.outboundBuffer.offset = 0;
				if (client.gameState == 40) {
					Static257.outboundBuffer.p1(Static43.aClass242_5.value);
				} else {
					Static257.outboundBuffer.p1(Static43.aClass242_3.value);
				}
				Static257.outboundBuffer.p2(0);
				int local112 = Static257.outboundBuffer.offset;
				Static257.outboundBuffer.p4(578);
				Static257.outboundBuffer.p1(Static202.anInt3714);
				Static257.outboundBuffer.p1(Static144.getWindowMode());
				Static257.outboundBuffer.p2(GameShell.canvasWidth);
				Static257.outboundBuffer.p2(GameShell.canvasHeight);
				Static257.outboundBuffer.p1(Static218.preferences.anInt4885);
				Static27.method875(Static257.outboundBuffer);
				Static257.outboundBuffer.pjstr(client.settings);
				Static257.outboundBuffer.p4(Static165.anInt3149);
				@Pc(354) Buffer local354 = Static218.preferences.method4493();
				Static257.outboundBuffer.p1(local354.offset);
				Static257.outboundBuffer.pdata(local354.bytes, local354.offset);
				Static236.sentToServer = true;
				Static257.outboundBuffer.p2(Static292.anInt5510);
				Static257.outboundBuffer.p4(client.js5Archive0.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive1.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive2.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive3.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive4.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive5.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive6.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive7.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive8.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive9.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive10.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive11.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive12.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive13.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive14.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive15.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive16.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive17.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive18.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive19.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive20.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive21.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive22.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive23.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive24.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive25.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive26.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive27.getChecksum());
				Static257.outboundBuffer.p4(client.js5Archive28.getChecksum());
				Static257.outboundBuffer.pdata(buffer.bytes, buffer.offset);
				Static257.outboundBuffer.psize2(Static257.outboundBuffer.offset - local112);
				Static335.socket.write(Static257.outboundBuffer.bytes, Static257.outboundBuffer.offset);
				Static257.outboundBuffer.initIsaac(key);
				for (@Pc(579) int i = 0; i < 4; i++) {
					key[i] += 50;
				}
				Static212.inboundBuffer.initIsaac(key);
				Static347.step = 4;
			}
			@Pc(619) int local619;
			if (Static347.step == 4) {
				if (Static335.socket.available() < 1) {
					return;
				}
				local619 = Static335.socket.read();
				if (local619 == 21) {
					Static347.step = 7;
				} else if (local619 == 29) {
					Static347.step = 11;
				} else if (local619 == 1) {
					Static347.step = 5;
					Static41.reply = local619;
					return;
				} else if (local619 == 2) {
					Static347.step = 8;
				} else if (local619 == 15) {
					Static347.step = 12;
					Static82.length = -2;
				} else if (local619 == 23 && Static216.errors < 1) {
					Static182.loops = 0;
					Static216.errors++;
					Static347.step = 1;
					Static335.socket.close();
					Static335.socket = null;
					return;
				} else {
					Static41.reply = local619;
					Static347.step = 0;
					Static335.socket.close();
					Static335.socket = null;
					return;
				}
			}
			if (Static347.step == 6) {
				Static257.outboundBuffer.offset = 0;
				Static257.outboundBuffer.p1isaac(Static43.aClass242_4.value);
				Static335.socket.write(Static257.outboundBuffer.bytes, Static257.outboundBuffer.offset);
				Static347.step = 4;
			} else if (Static347.step == 7) {
				if (Static335.socket.available() >= 1) {
					Static47.hopTime = Static335.socket.read() * 60 + 180;
					Static41.reply = 21;
					Static347.step = 0;
					Static335.socket.close();
					Static335.socket = null;
				}
			} else if (Static347.step != 11) {
				if (Static347.step == 8) {
					if (Static335.socket.available() < 13) {
						return;
					}
					Static335.socket.read(0, 13, Static212.inboundBuffer.bytes);
					Static212.inboundBuffer.offset = 0;
					Static4.staffModLevel = Static212.inboundBuffer.g1();
					Static210.blackmarks = Static212.inboundBuffer.g1();
					Static56.playerUnderage = Static212.inboundBuffer.g1() == 1;
					Static101.aBoolean159 = Static212.inboundBuffer.g1() == 1;
					Static347.aBoolean434 = Static212.inboundBuffer.g1() == 1;
					Static109.enabled = Static212.inboundBuffer.g1() == 1;
					Static234.selfID = Static212.inboundBuffer.g2();
					Static381.playerMemeber = Static212.inboundBuffer.g1() == 1;
					Static206.mapMembers = Static212.inboundBuffer.g1() == 1;
					LocTypeList.locTypeList.setAllowMembers(Static206.mapMembers);
					ObjTypeList.objTypeList.setAllowMembers(Static206.mapMembers);
					NpcTypeList.npcTypeList.setAllowMembers(Static206.mapMembers);
					if (Static56.playerUnderage && !Static347.aBoolean434 || Static381.playerMemeber) {
						try {
							BrowserControl.call(GameShell.signlink.applet, "zap");
						} catch (@Pc(896) Throwable local896) {
							if (Static132.aBoolean180) {
								try {
									GameShell.signlink.applet.getAppletContext().showDocument(new URL(GameShell.signlink.applet.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(912) Exception local912) {
								}
							}
						}
					} else {
						try {
							BrowserControl.call(GameShell.signlink.applet, "unzap");
						} catch (@Pc(922) Throwable local922) {
						}
					}
					if (Static189.aClass127_6 == Static121.aClass127_4) {
						try {
							BrowserControl.call(GameShell.signlink.applet, "loggedin");
						} catch (@Pc(934) Throwable local934) {
						}
					}
					Static347.step = 10;
				}
				if (Static347.step == 10) {
					if (Static212.inboundBuffer.method4869()) {
						if (Static335.socket.available() < 1) {
							return;
						}
						Static335.socket.read(Static212.inboundBuffer.offset + 2, 1, Static212.inboundBuffer.bytes);
					}
					Static231.packetInbound = Static166.method3187()[Static212.inboundBuffer.method4863()];
					Static82.length = Static212.inboundBuffer.g2();
					Static347.step = 9;
				}
				if (Static347.step == 9) {
					if (Static335.socket.available() >= Static82.length) {
						Static335.socket.read(0, Static82.length, Static212.inboundBuffer.bytes);
						Static212.inboundBuffer.offset = 0;
						Static41.reply = 2;
						local619 = Static82.length;
						Static347.step = 0;
						Static390.method6448();
						Static366.method6119(Static212.inboundBuffer);
						Static105.anInt2187 = -1;
						Static181.method3374(false);
						if (local619 != Static212.inboundBuffer.offset) {
							throw new RuntimeException("lswp pos:" + Static212.inboundBuffer.offset + " psize:" + local619);
						}
						Static231.packetInbound = null;
					}
				} else if (Static347.step == 12) {
					if (Static82.length == -2) {
						if (Static335.socket.available() < 2) {
							return;
						}
						Static335.socket.read(0, 2, Static212.inboundBuffer.bytes);
						Static212.inboundBuffer.offset = 0;
						Static82.length = Static212.inboundBuffer.g2();
					}
					if (Static335.socket.available() >= Static82.length) {
						Static335.socket.read(0, Static82.length, Static212.inboundBuffer.bytes);
						Static212.inboundBuffer.offset = 0;
						Static41.reply = 15;
						Static347.step = 0;
						local619 = Static82.length;
						Static182.method3387();
						Static366.method6119(Static212.inboundBuffer);
						if (Static212.inboundBuffer.offset != local619) {
							throw new RuntimeException("lswpr pos:" + Static212.inboundBuffer.offset + " psize:" + local619);
						}
						Static231.packetInbound = null;
					}
				}
			} else if (Static335.socket.available() >= 1) {
				Static360.anInt6186 = Static335.socket.read();
				Static347.step = 0;
				Static41.reply = 29;
				Static335.socket.close();
				Static335.socket = null;
			}
		} catch (@Pc(1122) IOException local1122) {
			if (Static335.socket != null) {
				Static335.socket.close();
				Static335.socket = null;
			}
			if (Static216.errors < 1) {
				Static182.loops = 0;
				Static216.errors++;
				Static347.step = 1;
				if (client.defaultPort == client.port) {
					client.port = client.alternatePort;
				} else {
					client.port = client.defaultPort;
				}
			} else {
				Static41.reply = -4;
				Static347.step = 0;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static void method1962() {
		Static335.A_SOFT_LRU_HASH_TABLE___57.clear();
		Static124.A_SOFT_LRU_HASH_TABLE___63.clear();
		Static333.A_SOFT_LRU_HASH_TABLE___65.clear();
		Static297.A_SOFT_LRU_HASH_TABLE___44.clear();
		Static288.A_SOFT_LRU_HASH_TABLE___42.clear();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)V")
	public static void method1963(@OriginalArg(0) int arg0) {
		Static323.anInt6062 = arg0;
		Static124.A_SOFT_LRU_HASH_TABLE___63.clear();
	}
}
