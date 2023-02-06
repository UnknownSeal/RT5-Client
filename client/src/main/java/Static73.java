import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
	public static int anInt1721;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)Z")
	public static boolean readPacketInternal() throws IOException {
		if (Static335.socket == null) {
			return false;
		}
		@Pc(15) int available = Static335.socket.available();
		if (available == 0) {
			return false;
		}
		@Pc(74) int local74;
		if (InboundPacket.packetInbound == null) {
			if (Static69.aBoolean129) {
				available--;
				Static335.socket.read(0, 1, Static212.inboundBuffer.bytes);
				Static301.anInt5697++;
				Static69.aBoolean129 = false;
			}
			Static212.inboundBuffer.offset = 0;
			if (Static212.inboundBuffer.method4869()) {
				if (available == 0) {
					return false;
				}
				Static335.socket.read(1, 1, Static212.inboundBuffer.bytes);
				available--;
				Static301.anInt5697++;
			}
			Static69.aBoolean129 = true;
			@Pc(70) InboundPacket[] local70 = Static166.method3187();
			local74 = Static212.inboundBuffer.method4863();
			if (local74 < 0 || local70.length <= local74) {
				throw new IOException("invo:" + local74);
			}
			InboundPacket.packetInbound = local70[local74];
			Static82.length = InboundPacket.packetInbound.length;
		}
		if (Static82.length == -1) {
			if (available <= 0) {
				return false;
			}
			Static335.socket.read(0, 1, Static212.inboundBuffer.bytes);
			Static301.anInt5697++;
			Static82.length = Static212.inboundBuffer.bytes[0] & 0xFF;
			available--;
		}
		if (Static82.length == -2) {
			if (available <= 1) {
				return false;
			}
			Static335.socket.read(0, 2, Static212.inboundBuffer.bytes);
			Static212.inboundBuffer.offset = 0;
			available -= 2;
			Static82.length = Static212.inboundBuffer.g2();
			Static301.anInt5697 += 2;
		}
		if (Static82.length > available) {
			return false;
		}
		Static212.inboundBuffer.offset = 0;
		Static335.socket.read(0, Static82.length, Static212.inboundBuffer.bytes);
		Static268.anInt4955 = 0;
		InboundPacket.aInboundPacket_35 = InboundPacket.aInboundPacket_57;
		Static301.anInt5697 += Static82.length;
		InboundPacket.aInboundPacket_57 = InboundPacket.aInboundPacket_222;
		InboundPacket.aInboundPacket_222 = InboundPacket.packetInbound;
		if (InboundPacket.A_INBOUND_PACKET___202 == InboundPacket.packetInbound) {
			Static235.method3338(GameShell.signlink, Static82.length, Static212.inboundBuffer);
			InboundPacket.packetInbound = null;
			return true;
		} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___246) {
			Static214.aClass226_1.method5780();
			InboundPacket.packetInbound = null;
			Static12.anInt269 += 32;
			return true;
		} else {
			@Pc(228) int local228;
			@Pc(249) int local249;
			@Pc(220) int local220;
			if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___214) {
				local220 = Static212.inboundBuffer.g1();
				local74 = Static212.inboundBuffer.ig2();
				local228 = Static212.inboundBuffer.ig2();
				if (Static378.method6313(local228)) {
					if (local220 == 2) {
						Static90.method5952();
					}
					Static139.topLevelInterface = local74;
					Static160.method2956(local74);
					Static60.method891(false);
					ScriptRunner.method3597(Static139.topLevelInterface);
					for (local249 = 0; local249 < 100; local249++) {
						Static357.aBooleanArray59[local249] = true;
					}
				}
				InboundPacket.packetInbound = null;
				return true;
			}
			@Pc(272) byte local272;
			if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___58) {
				local272 = Static212.inboundBuffer.g1badd();
				local74 = Static212.inboundBuffer.g2add();
				local228 = Static212.inboundBuffer.ig2add();
				if (Static378.method6313(local74)) {
					Static322.method5480(local228, local272);
				}
				InboundPacket.packetInbound = null;
				return true;
			} else if (InboundPacket.A_INBOUND_PACKET___161 == InboundPacket.packetInbound) {
				local220 = Static212.inboundBuffer.g2();
				if (Static378.method6313(local220)) {
					Static117.method2369();
				}
				InboundPacket.packetInbound = null;
				return true;
			} else {
				@Pc(344) SubInterface local344;
				if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___200) {
					local220 = Static212.inboundBuffer.g4();
					local74 = Static212.inboundBuffer.g4();
					local228 = Static212.inboundBuffer.ig2();
					if (Static378.method6313(local228)) {
						@Pc(335) SubInterface local335 = (SubInterface) Static329.subInterfaces.get((long) local220);
						local344 = (SubInterface) Static329.subInterfaces.get((long) local74);
						if (local344 != null) {
							Static276.method4654(false, local344, local335 == null || local344.id != local335.id);
						}
						if (local335 != null) {
							local335.unlink();
							Static329.subInterfaces.put(local335, (long) local74);
						}
						@Pc(375) Component local375 = Static6.getComponent(local220);
						if (local375 != null) {
							Static200.redraw(local375);
						}
						local375 = Static6.getComponent(local74);
						if (local375 != null) {
							Static200.redraw(local375);
							Static85.method1911(true, local375);
						}
						if (Static139.topLevelInterface != -1) {
							Static392.method6459(Static139.topLevelInterface, 1);
						}
					}
					InboundPacket.packetInbound = null;
					return true;
				} else if (InboundPacket.A_INBOUND_PACKET___49 == InboundPacket.packetInbound) {
					if (Static139.topLevelInterface != -1) {
						Static392.method6459(Static139.topLevelInterface, 0);
					}
					InboundPacket.packetInbound = null;
					return true;
				} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___22) {
					local220 = Static212.inboundBuffer.g2();
					if (Static378.method6313(local220)) {
						Static351.method5858();
					}
					InboundPacket.packetInbound = null;
					return true;
				} else {
					@Pc(452) String local452;
					@Pc(444) String local444;
					if (InboundPacket.A_INBOUND_PACKET___27 == InboundPacket.packetInbound) {
						local444 = Static212.inboundBuffer.gjstr();
						local452 = Static153.method2772(Static308.method5275(Static212.inboundBuffer));
						Static33.method4199(local444, 0, local452, 6, local444);
						InboundPacket.packetInbound = null;
						return true;
					}
					@Pc(506) int local506;
					@Pc(512) int local512;
					@Pc(536) int local536;
					@Pc(542) int local542;
					@Pc(638) int local638;
					@Pc(497) int local497;
					@Pc(604) boolean local604;
					if (InboundPacket.A_INBOUND_PACKET___186 == InboundPacket.packetInbound) {
						local220 = Static212.inboundBuffer.g2add();
						local74 = Static212.inboundBuffer.g2add();
						local228 = Static212.inboundBuffer.mg4();
						local249 = Static212.inboundBuffer.ig2();
						if (local228 >> 30 == 0) {
							@Pc(621) Class91 local621;
							@Pc(692) SeqType local692;
							@Pc(684) SeqType local684;
							@Pc(667) Class91 local667;
							@Pc(635) SeqType local635;
							if (local228 >> 29 != 0) {
								local497 = local228 & 0xFFFF;
								@Pc(790) Npc local790 = Static365.npcs[local497];
								if (local790 != null) {
									if (local220 == 65535) {
										local220 = -1;
									}
									local604 = true;
									if (local220 != -1 && local790.spotAnimID != -1) {
										if (local790.spotAnimID == local220) {
											local621 = Static322.aClass211_2.get(local220);
											if (local621.loop && local621.anInt2448 != -1) {
												local635 = SeqTypeList.seqTypeList.get(local621.anInt2448);
												local638 = local635.exactmove;
												if (local638 == 0 || local638 == 2) {
													local604 = false;
												} else if (local638 == 1) {
													local604 = true;
												}
											}
										} else {
											local621 = Static322.aClass211_2.get(local220);
											local667 = Static322.aClass211_2.get(local790.spotAnimID);
											if (local621.anInt2448 != -1 && local667.anInt2448 != -1) {
												local684 = SeqTypeList.seqTypeList.get(local621.anInt2448);
												local692 = SeqTypeList.seqTypeList.get(local667.anInt2448);
												if (local692.priority > local684.priority) {
													local604 = false;
												}
											}
										}
									}
									if (local604) {
										local790.spotAnimID = local220;
										local790.anInt4620 = 0;
										local790.anInt4582 = 0;
										local790.anInt4595 = local74 + Static114.loop;
										local790.anInt4639 = local249;
										local790.anInt4612 = 1;
										if (Static114.loop < local790.anInt4595) {
											local790.anInt4582 = -1;
										}
										if (local790.spotAnimID != -1 && local790.anInt4595 == Static114.loop) {
											local536 = Static322.aClass211_2.get(local790.spotAnimID).anInt2448;
											if (local536 != -1) {
												local635 = SeqTypeList.seqTypeList.get(local536);
												if (local635 != null && local635.frames != null) {
													Static1.method4(local635, false, local790.aByte78, local790.xFine, local790.zFine, 0);
												}
											}
										}
									}
								}
							} else if (local228 >> 28 != 0) {
								local497 = local228 & 0xFFFF;
								@Pc(589) Class11_Sub5_Sub2_Sub1 local589;
								if (Static234.selfID == local497) {
									local589 = Static17.self;
								} else {
									local589 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local497];
								}
								if (local589 != null) {
									if (local220 == 65535) {
										local220 = -1;
									}
									local604 = true;
									if (local220 != -1 && local589.spotAnimID != -1) {
										if (local220 == local589.spotAnimID) {
											local621 = Static322.aClass211_2.get(local220);
											if (local621.loop && local621.anInt2448 != -1) {
												local635 = SeqTypeList.seqTypeList.get(local621.anInt2448);
												local638 = local635.exactmove;
												if (local638 == 0 || local638 == 2) {
													local604 = false;
												} else if (local638 == 1) {
													local604 = true;
												}
											}
										} else {
											local621 = Static322.aClass211_2.get(local220);
											local667 = Static322.aClass211_2.get(local589.spotAnimID);
											if (local621.anInt2448 != -1 && local667.anInt2448 != -1) {
												local684 = SeqTypeList.seqTypeList.get(local621.anInt2448);
												local692 = SeqTypeList.seqTypeList.get(local667.anInt2448);
												if (local692.priority > local684.priority) {
													local604 = false;
												}
											}
										}
									}
									if (local604) {
										local589.anInt4620 = 0;
										local589.anInt4582 = 0;
										local589.anInt4612 = 1;
										local589.anInt4639 = local249;
										local589.spotAnimID = local220;
										local589.anInt4595 = local74 + Static114.loop;
										if (local589.spotAnimID == 65535) {
											local589.spotAnimID = -1;
										}
										if (Static114.loop < local589.anInt4595) {
											local589.anInt4582 = -1;
										}
										if (local589.spotAnimID != -1 && Static114.loop == local589.anInt4595) {
											local536 = Static322.aClass211_2.get(local589.spotAnimID).anInt2448;
											if (local536 != -1) {
												local635 = SeqTypeList.seqTypeList.get(local536);
												if (local635 != null && local635.frames != null) {
													Static1.method4(local635, Static17.self == local589, local589.aByte78, local589.xFine, local589.zFine, 0);
												}
											}
										}
									}
								}
							}
						} else {
							local497 = local228 >> 28 & 0x3;
							local506 = (local228 >> 14 & 0x3FFF) - Static164.originX;
							local512 = (local228 & 0x3FFF) - Static148.originZ;
							if (local506 >= 0 && local512 >= 0 && Static373.anInt7033 > local506 && Static242.anInt4449 > local512) {
								local536 = local506 * 128 + 64;
								local542 = local512 * 128 + 64;
								@Pc(563) Class11_Sub5_Sub4 local563 = new Class11_Sub5_Sub4(local220, 0, Static114.loop, local497, local536, Static386.method6031(local536, local542, local497) - local249, local542, local506, local506, local512, local512);
								Static129.A_LINKED_LIST___20.addTail(new Class2_Sub2_Sub1(local563));
							}
						}
						InboundPacket.packetInbound = null;
						return true;
					} else if (InboundPacket.A_INBOUND_PACKET___204 == InboundPacket.packetInbound) {
						local220 = Static212.inboundBuffer.ig2add();
						local74 = Static212.inboundBuffer.img4();
						local228 = Static212.inboundBuffer.g2add();
						if (Static378.method6313(local228)) {
							Static7.method6468(local220, local74);
						}
						InboundPacket.packetInbound = null;
						return true;
					} else if (InboundPacket.A_INBOUND_PACKET___95 == InboundPacket.packetInbound) {
						local220 = Static212.inboundBuffer.g2add();
						local74 = Static212.inboundBuffer.g1bneg();
						if (Static378.method6313(local220)) {
							Static114.anInt2344 = local74;
						}
						InboundPacket.packetInbound = null;
						return true;
					} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___119) {
						Static361.method6053(Static212.inboundBuffer, Static82.length);
						InboundPacket.packetInbound = null;
						return true;
					} else {
						@Pc(1101) long local1101;
						@Pc(1118) ServerActiveProperties local1118;
						@Pc(1109) ServerActiveProperties local1109;
						if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___253) {
							local220 = Static212.inboundBuffer.g2();
							if (local220 == 65535) {
								local220 = -1;
							}
							local74 = Static212.inboundBuffer.ig2();
							local228 = Static212.inboundBuffer.g2add();
							if (local228 == 65535) {
								local228 = -1;
							}
							local249 = Static212.inboundBuffer.g2();
							local497 = Static212.inboundBuffer.img4();
							if (Static378.method6313(local249)) {
								for (local506 = local220; local506 <= local228; local506++) {
									local1101 = (long) local506 + ((long) local497 << 32);
									local1109 = (ServerActiveProperties) Static327.serverActiveProperties.get(local1101);
									if (local1109 != null) {
										local1118 = new ServerActiveProperties(local1109.anInt1758, local74);
										local1109.unlink();
									} else if (local506 == -1) {
										local1118 = new ServerActiveProperties(Static6.getComponent(local497).serverActiveProperties.anInt1758, local74);
									} else {
										local1118 = new ServerActiveProperties(0, local74);
									}
									Static327.serverActiveProperties.put(local1118, local1101);
								}
							}
							InboundPacket.packetInbound = null;
							return true;
						} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___243) {
							local220 = Static212.inboundBuffer.ig4();
							local74 = Static212.inboundBuffer.ig2add();
							if (Static378.method6313(local74)) {
								Static190.method3500(-1, -1, 3, local220);
							}
							InboundPacket.packetInbound = null;
							return true;
						} else if (InboundPacket.A_INBOUND_PACKET___84 == InboundPacket.packetInbound) {
							local220 = Static212.inboundBuffer.g2add();
							local74 = Static212.inboundBuffer.g1sub();
							local228 = Static212.inboundBuffer.ig4();
							local249 = Static212.inboundBuffer.g2();
							if (Static378.method6313(local220)) {
								local344 = (SubInterface) Static329.subInterfaces.get((long) local228);
								if (local344 != null) {
									Static276.method4654(false, local344, local249 != local344.id);
								}
								Static382.method6364(local228, local74, false, local249);
							}
							InboundPacket.packetInbound = null;
							return true;
						} else if (InboundPacket.A_INBOUND_PACKET___120 == InboundPacket.packetInbound) {
							local220 = Static212.inboundBuffer.mg4();
							local74 = Static212.inboundBuffer.g1bneg();
							local228 = Static212.inboundBuffer.g1sub();
							Static80.experience[local74] = local220;
							Static268.boostedLevels[local74] = local228;
							Static325.baseLevels[local74] = 1;
							local249 = Static287.anIntArray369[local74] - 1;
							for (local497 = 0; local497 < local249; local497++) {
								if (local220 >= Class12_Sub1_Sub1.anIntArray292[local497]) {
									Static325.baseLevels[local74] = local497 + 2;
								}
							}
							Static208.anIntArray226[Static381.anInt7117++ & 0x1F] = local74;
							InboundPacket.packetInbound = null;
							return true;
						} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___118) {
							local220 = Static212.inboundBuffer.g2();
							local74 = Static212.inboundBuffer.g1();
							local228 = Static212.inboundBuffer.g1();
							local249 = Static212.inboundBuffer.g2();
							local497 = Static212.inboundBuffer.g1();
							local506 = Static212.inboundBuffer.g1();
							if (Static378.method6313(local220)) {
								Static51.method1545(local228, local497, local506, true, local249, local74);
							}
							InboundPacket.packetInbound = null;
							return true;
						} else {
							@Pc(1371) boolean local1371;
							@Pc(1381) String local1381;
							@Pc(1627) String local1627;
							@Pc(1391) String local1391;
							@Pc(1663) String local1663;
							if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___69) {
								while (Static212.inboundBuffer.offset < Static82.length) {
									local1371 = Static212.inboundBuffer.g1() == 1;
									local452 = Static212.inboundBuffer.gjstr();
									local1381 = Static212.inboundBuffer.gjstr();
									local249 = Static212.inboundBuffer.g2();
									local497 = Static212.inboundBuffer.g1();
									local1391 = "";
									local604 = false;
									if (local249 > 0) {
										local1391 = Static212.inboundBuffer.gjstr();
										local604 = Static212.inboundBuffer.g1() == 1;
									}
									for (local536 = 0; local536 < Static384.anInt7178; local536++) {
										if (local1371) {
											if (local1381.equals(Static17.aStringArray43[local536])) {
												Static17.aStringArray43[local536] = local452;
												Static319.aStringArray54[local536] = local1381;
												local452 = null;
												break;
											}
										} else if (local452.equals(Static17.aStringArray43[local536])) {
											if (Static265.anIntArray333[local536] != local249) {
												Static265.anIntArray333[local536] = local249;
												if (local249 > 0) {
													Static33.method4199("", 0, local452 + LocalisedText.HAS_LOGGED_IN.getLocalisedText(client.language), 5, "");
												}
												if (local249 == 0) {
													Static33.method4199("", 0, local452 + LocalisedText.HAS_LOGGED_OUT.getLocalisedText(client.language), 5, "");
												}
											}
											Static319.aStringArray54[local536] = local1381;
											Static209.aStringArray32[local536] = local1391;
											Static114.anIntArray148[local536] = local497;
											local452 = null;
											Static302.aBooleanArray13[local536] = local604;
											break;
										}
									}
									if (local452 != null && Static384.anInt7178 < 200) {
										Static17.aStringArray43[Static384.anInt7178] = local452;
										Static319.aStringArray54[Static384.anInt7178] = local1381;
										Static265.anIntArray333[Static384.anInt7178] = local249;
										Static209.aStringArray32[Static384.anInt7178] = local1391;
										Static114.anIntArray148[Static384.anInt7178] = local497;
										Static302.aBooleanArray13[Static384.anInt7178] = local604;
										Static384.anInt7178++;
									}
								}
								Static235.anInt3363 = 2;
								Static53.anInt3971 = Static88.anInt1876;
								local74 = Static384.anInt7178;
								while (local74 > 0) {
									local1371 = true;
									local74--;
									for (local228 = 0; local228 < local74; local228++) {
										if (Static265.anIntArray333[local228] != client.worldID && client.worldID == Static265.anIntArray333[local228 + 1] || Static265.anIntArray333[local228] == 0 && Static265.anIntArray333[local228 + 1] != 0) {
											local249 = Static265.anIntArray333[local228];
											Static265.anIntArray333[local228] = Static265.anIntArray333[local228 + 1];
											Static265.anIntArray333[local228 + 1] = local249;
											local1627 = Static209.aStringArray32[local228];
											Static209.aStringArray32[local228] = Static209.aStringArray32[local228 + 1];
											Static209.aStringArray32[local228 + 1] = local1627;
											local1391 = Static17.aStringArray43[local228];
											Static17.aStringArray43[local228] = Static17.aStringArray43[local228 + 1];
											Static17.aStringArray43[local228 + 1] = local1391;
											local1663 = Static319.aStringArray54[local228];
											Static319.aStringArray54[local228] = Static319.aStringArray54[local228 + 1];
											Static319.aStringArray54[local228 + 1] = local1663;
											local536 = Static114.anIntArray148[local228];
											Static114.anIntArray148[local228] = Static114.anIntArray148[local228 + 1];
											Static114.anIntArray148[local228 + 1] = local536;
											@Pc(1699) boolean local1699 = Static302.aBooleanArray13[local228];
											Static302.aBooleanArray13[local228] = Static302.aBooleanArray13[local228 + 1];
											local1371 = false;
											Static302.aBooleanArray13[local228 + 1] = local1699;
										}
									}
									if (local1371) {
										break;
									}
								}
								InboundPacket.packetInbound = null;
								return true;
							} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___156) {
								Static41.anInt1048 = Static212.inboundBuffer.g2b_dup();
								Static93.anInt1950 = Static88.anInt1876;
								InboundPacket.packetInbound = null;
								return true;
							} else {
								@Pc(1780) long local1780;
								@Pc(1785) long local1785;
								if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___158) {
									local1371 = Static212.inboundBuffer.g1() == 1;
									local452 = Static212.inboundBuffer.gjstr();
									local1381 = local452;
									if (local1371) {
										local1381 = Static212.inboundBuffer.gjstr();
									}
									local1780 = Static212.inboundBuffer.g2();
									local1785 = Static212.inboundBuffer.ig3();
									local536 = Static212.inboundBuffer.g1();
									@Pc(1796) long local1796 = (local1780 << 32) + local1785;
									@Pc(1798) boolean local1798 = false;
									@Pc(1800) int local1800 = 0;
									while (true) {
										if (local1800 >= 100) {
											if (local536 <= 1) {
												if (Static56.playerUnderage && !Static101.aBoolean159 || Static109.enabled) {
													local1798 = true;
												} else if (Static105.method2208(local1381)) {
													local1798 = true;
												}
											}
											break;
										}
										if (local1796 == Static358.uids[local1800]) {
											local1798 = true;
											break;
										}
										local1800++;
									}
									if (!local1798 && Static212.inTutorialIsland == 0) {
										Static358.uids[Static193.uidsWriterIndex] = local1796;
										Static193.uidsWriterIndex = (Static193.uidsWriterIndex + 1) % 100;
										@Pc(1866) String local1866 = Static153.method2772(Static308.method5275(Static212.inboundBuffer));
										if (local536 == 2) {
											Static220.add(0, null, local1866, -1, 7, "<img=1>" + local1381, "<img=1>" + local452);
										} else if (local536 == 1) {
											Static220.add(0, null, local1866, -1, 7, "<img=0>" + local1381, "<img=0>" + local452);
										} else {
											Static220.add(0, null, local1866, -1, 3, local1381, local452);
										}
									}
									InboundPacket.packetInbound = null;
									return true;
								} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___63) {
									local444 = Static212.inboundBuffer.gjstr();
									local74 = Static212.inboundBuffer.g2();
									local1381 = Static146.get(local74).decodeMessage(Static212.inboundBuffer);
									Static220.add(0, null, local1381, local74, 19, local444, local444);
									InboundPacket.packetInbound = null;
									return true;
								} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___12) {
									Static99.logout();
									InboundPacket.packetInbound = null;
									return false;
								} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___136) {
									local220 = Static212.inboundBuffer.ig2add();
									local74 = Static212.inboundBuffer.ig4();
									Static214.aClass226_1.method5784(local74, local220);
									InboundPacket.packetInbound = null;
									return true;
								} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___245) {
									local220 = Static212.inboundBuffer.g2();
									local74 = Static212.inboundBuffer.g1();
									local228 = Static212.inboundBuffer.g1();
									local249 = Static212.inboundBuffer.g2();
									local497 = Static212.inboundBuffer.g1();
									local506 = Static212.inboundBuffer.g1();
									if (Static378.method6313(local220)) {
										Static33.method4202(local497, local249, local228, local506, local74);
									}
									InboundPacket.packetInbound = null;
									return true;
								} else if (InboundPacket.A_INBOUND_PACKET___88 == InboundPacket.packetInbound) {
									local220 = Static212.inboundBuffer.g1bneg();
									local74 = Static212.inboundBuffer.g1sub();
									if (local220 == 255) {
										local74 = -1;
										local220 = -1;
									}
									Static283.method4874(local220, local74);
									InboundPacket.packetInbound = null;
									return true;
								} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___6) {
									Static330.method5655(Static333.aClass210_17);
									InboundPacket.packetInbound = null;
									return true;
								} else if (InboundPacket.A_INBOUND_PACKET___9 == InboundPacket.packetInbound) {
									local220 = Static212.inboundBuffer.ig2add();
									local74 = Static212.inboundBuffer.ig4();
									local228 = Static212.inboundBuffer.g1sub();
									if (Static378.method6313(local220)) {
										Static17.method4207(local74, local228);
									}
									InboundPacket.packetInbound = null;
									return true;
								} else if (InboundPacket.A_INBOUND_PACKET___144 == InboundPacket.packetInbound) {
									for (local220 = 0; local220 < Static12.aClass11_Sub5_Sub2_Sub1Array1.length; local220++) {
										if (Static12.aClass11_Sub5_Sub2_Sub1Array1[local220] != null) {
											Static12.aClass11_Sub5_Sub2_Sub1Array1[local220].anInt4597 = -1;
										}
									}
									for (local74 = 0; local74 < Static365.npcs.length; local74++) {
										if (Static365.npcs[local74] != null) {
											Static365.npcs[local74].anInt4597 = -1;
										}
									}
									InboundPacket.packetInbound = null;
									return true;
								} else if (InboundPacket.A_INBOUND_PACKET___110 == InboundPacket.packetInbound) {
									Static151.anInt2773 = Static212.inboundBuffer.g2() * 30;
									InboundPacket.packetInbound = null;
									Static93.anInt1950 = Static88.anInt1876;
									return true;
								} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___180) {
									local220 = Static212.inboundBuffer.g2();
									if (local220 == 65535) {
										local220 = -1;
									}
									local74 = Static212.inboundBuffer.g1();
									local228 = Static212.inboundBuffer.g2();
									local249 = Static212.inboundBuffer.g1();
									Static29.play(local228, local220, local74, local249);
									InboundPacket.packetInbound = null;
									return true;
								} else if (InboundPacket.A_INBOUND_PACKET___224 == InboundPacket.packetInbound) {
									local220 = Static212.inboundBuffer.mg4();
									local74 = Static212.inboundBuffer.ig2();
									local228 = Static212.inboundBuffer.g2add();
									if (Static378.method6313(local74)) {
										Static120.method2383(local228, local220);
									}
									InboundPacket.packetInbound = null;
									return true;
								} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___46) {
									Static330.method5655(Static374.aClass210_16);
									InboundPacket.packetInbound = null;
									return true;
								} else if (InboundPacket.A_INBOUND_PACKET___227 == InboundPacket.packetInbound) {
									Static330.method5655(Static359.aClass210_14);
									InboundPacket.packetInbound = null;
									return true;
								} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___223) {
									local220 = Static212.inboundBuffer.ig2add();
									local74 = Static212.inboundBuffer.img4();
									local228 = Static212.inboundBuffer.g2();
									local249 = Static212.inboundBuffer.ig2add();
									if (Static378.method6313(local228)) {
										Static375.method6281(local220 + (local249 << 16), local74);
									}
									InboundPacket.packetInbound = null;
									return true;
								} else if (InboundPacket.A_INBOUND_PACKET___43 == InboundPacket.packetInbound) {
									local220 = Static212.inboundBuffer.mg4();
									local74 = Static212.inboundBuffer.img4();
									local228 = Static212.inboundBuffer.g2add();
									local249 = Static212.inboundBuffer.ig2();
									if (Static378.method6313(local228)) {
										Static190.method3500(local249, local74, 5, local220);
									}
									InboundPacket.packetInbound = null;
									return true;
								} else {
									@Pc(2522) Class214 local2522;
									if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___67) {
										Static285.anInt5370 = Static88.anInt1876;
										if (Static82.length == 0) {
											Static389.aString53 = null;
											Static186.anInt3730 = 0;
											Static169.aString25 = null;
											InboundPacket.packetInbound = null;
											Static47.aClass214Array1 = null;
											return true;
										}
										Static169.aString25 = Static212.inboundBuffer.gjstr();
										local1371 = Static212.inboundBuffer.g1() == 1;
										if (local1371) {
											Static212.inboundBuffer.gjstr();
										}
										@Pc(2364) long local2364 = Static212.inboundBuffer.g8();
										Static389.aString53 = Static202.method3675(local2364);
										Static265.aByte54 = Static212.inboundBuffer.g1b();
										local249 = Static212.inboundBuffer.g1();
										if (local249 == 255) {
											InboundPacket.packetInbound = null;
											return true;
										}
										Static186.anInt3730 = local249;
										@Pc(2392) Class214[] local2392 = new Class214[100];
										for (local506 = 0; local506 < Static186.anInt3730; local506++) {
											local2392[local506] = new Class214();
											local2392[local506].aString58 = Static212.inboundBuffer.gjstr();
											local1371 = Static212.inboundBuffer.g1() == 1;
											if (local1371) {
												local2392[local506].aString60 = Static212.inboundBuffer.gjstr();
											} else {
												local2392[local506].aString60 = local2392[local506].aString58;
											}
											local2392[local506].aString59 = Static135.method2537(local2392[local506].aString60);
											local2392[local506].anInt5978 = Static212.inboundBuffer.g2();
											local2392[local506].aByte65 = Static212.inboundBuffer.g1b();
											local2392[local506].aString61 = Static212.inboundBuffer.gjstr();
											if (local2392[local506].aString60.equals(Static17.self.aString41)) {
												Static119.aByte25 = local2392[local506].aByte65;
											}
										}
										local542 = Static186.anInt3730;
										while (local542 > 0) {
											local542--;
											local604 = true;
											for (local638 = 0; local638 < local542; local638++) {
												if (local2392[local638].aString59.compareTo(local2392[local638 + 1].aString59) > 0) {
													local2522 = local2392[local638];
													local2392[local638] = local2392[local638 + 1];
													local2392[local638 + 1] = local2522;
													local604 = false;
												}
											}
											if (local604) {
												break;
											}
										}
										Static47.aClass214Array1 = local2392;
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___258) {
										Static212.inboundBuffer.offset += 28;
										if (Static212.inboundBuffer.checkcrc()) {
											Static294.method5064(Static212.inboundBuffer, Static212.inboundBuffer.offset - 28);
										}
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.A_INBOUND_PACKET___255 == InboundPacket.packetInbound) {
										local220 = Static212.inboundBuffer.g1();
										if (Static212.inboundBuffer.g1() == 0) {
											Static290.aClass187Array1[local220] = new Class187();
										} else {
											Static212.inboundBuffer.offset--;
											Static290.aClass187Array1[local220] = new Class187(Static212.inboundBuffer);
										}
										InboundPacket.packetInbound = null;
										Static177.anInt3381 = Static88.anInt1876;
										return true;
									} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___123) {
										local220 = Static212.inboundBuffer.g2();
										local74 = Static212.inboundBuffer.g2();
										local228 = Static212.inboundBuffer.g2();
										local249 = Static212.inboundBuffer.g2();
										if (Static378.method6313(local220) && Static26.aComponentArrayArray1[local74] != null) {
											for (local497 = local228; local497 < local249; local497++) {
												local506 = Static212.inboundBuffer.ig3();
												if (local497 < Static26.aComponentArrayArray1[local74].length && Static26.aComponentArrayArray1[local74][local497] != null) {
													Static26.aComponentArrayArray1[local74][local497].anInt4246 = local506;
												}
											}
										}
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.A_INBOUND_PACKET___230 == InboundPacket.packetInbound) {
										Static330.method5655(Static143.aClass210_7);
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___150) {
										Static330.method5655(Static285.aClass210_12);
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.A_INBOUND_PACKET___74 == InboundPacket.packetInbound) {
										Static146.anInt2703 = Static212.inboundBuffer.g1();
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.A_INBOUND_PACKET___134 == InboundPacket.packetInbound) {
										local220 = Static212.inboundBuffer.g2();
										local74 = Static212.inboundBuffer.g1();
										local228 = Static212.inboundBuffer.g1();
										local249 = Static212.inboundBuffer.g1();
										local497 = Static212.inboundBuffer.g1();
										local506 = Static212.inboundBuffer.g2();
										if (Static378.method6313(local220)) {
											Static189.aBooleanArray33[local74] = true;
											Static134.anIntArray164[local74] = local228;
											Static105.anIntArray134[local74] = local249;
											Static43.anIntArray87[local74] = local497;
											Static116.anIntArray149[local74] = local506;
										}
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___66) {
										if (GameShell.fullScreenFrame != null) {
											Static143.setWindowMode(false, Static218.preferences.anInt4894, -1, -1);
										}
										@Pc(2782) byte[] local2782 = new byte[Static82.length];
										Static212.inboundBuffer.method4865(local2782, Static82.length);
										local452 = Static47.decodeString(0, local2782, Static82.length);
										Static280.method4764(local452, GameShell.signlink, Static77.anInt1762 == 1, true);
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.A_INBOUND_PACKET___248 == InboundPacket.packetInbound) {
										Static330.method5655(Static72.aClass210_3);
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.A_INBOUND_PACKET___140 == InboundPacket.packetInbound) {
										Static67.anInt1637 = Static212.inboundBuffer.g1();
										Static7.anInt7240 = Static212.inboundBuffer.g1bneg();
										Static243.anInt4502 = Static212.inboundBuffer.g1add();
										for (@Pc(2839) Class2_Sub32 local2839 = (Class2_Sub32) Static120.aClass4_49.head(); local2839 != null; local2839 = (Class2_Sub32) Static120.aClass4_49.next()) {
											local74 = (int) (local2839.key & 0x3FFFL);
											local228 = (int) (local2839.key >> 14 & 0x3FFFL);
											local249 = (int) (local2839.key >> 28 & 0x3L);
											if (Static243.anInt4502 == local249 && Static67.anInt1637 <= local74 && Static67.anInt1637 + 8 > local74 && local228 >= Static7.anInt7240 && local228 < Static7.anInt7240 + 8) {
												local2839.unlink();
												Static165.method3153(local74, Static243.anInt4502, local228);
											}
										}
										for (@Pc(2914) Class2_Sub37 local2914 = (Class2_Sub37) Static207.aLinkedList_26.head(); local2914 != null; local2914 = (Class2_Sub37) Static207.aLinkedList_26.next()) {
											if (local2914.anInt6484 >= Static67.anInt1637 && local2914.anInt6484 < Static67.anInt1637 + 8 && local2914.anInt6486 >= Static7.anInt7240 && local2914.anInt6486 < Static7.anInt7240 + 8 && Static243.anInt4502 == local2914.anInt6481) {
												local2914.anInt6485 = 0;
											}
										}
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___34) {
										local1371 = Static212.inboundBuffer.g1() == 1;
										local452 = Static212.inboundBuffer.gjstr();
										local1381 = local452;
										if (local1371) {
											local1381 = Static212.inboundBuffer.gjstr();
										}
										local1780 = Static212.inboundBuffer.g2();
										local1785 = Static212.inboundBuffer.ig3();
										local536 = Static212.inboundBuffer.g1();
										local542 = Static212.inboundBuffer.g2();
										@Pc(3014) long uid = local1785 + (local1780 << 32);
										@Pc(3016) boolean local3016 = false;
										@Pc(3018) int local3018 = 0;
										while (true) {
											if (local3018 >= 100) {
												if (local536 <= 1 && Static105.method2208(local1381)) {
													local3016 = true;
												}
												break;
											}
											if (uid == Static358.uids[local3018]) {
												local3016 = true;
												break;
											}
											local3018++;
										}
										if (!local3016 && Static212.inTutorialIsland == 0) {
											Static358.uids[Static193.uidsWriterIndex] = uid;
											Static193.uidsWriterIndex = (Static193.uidsWriterIndex + 1) % 100;
											@Pc(3071) String local3071 = Static146.get(local542).decodeMessage(Static212.inboundBuffer);
											if (local536 == 2) {
												Static220.add(0, null, local3071, local542, 18, "<img=1>" + local1381, "<img=1>" + local452);
											} else if (local536 == 1) {
												Static220.add(0, null, local3071, local542, 18, "<img=0>" + local1381, "<img=0>" + local452);
											} else {
												Static220.add(0, null, local3071, local542, 18, local1381, local452);
											}
										}
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___91) {
										Static243.anInt4502 = Static212.inboundBuffer.g1add();
										Static7.anInt7240 = Static212.inboundBuffer.g1bneg();
										Static67.anInt1637 = Static212.inboundBuffer.g1sub();
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.A_INBOUND_PACKET___170 == InboundPacket.packetInbound) {
										Static235.anInt3363 = 1;
										Static53.anInt3971 = Static88.anInt1876;
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.A_INBOUND_PACKET___112 == InboundPacket.packetInbound) {
										local220 = Static212.inboundBuffer.img4();
										local74 = Static212.inboundBuffer.ig2();
										if (local74 == 65535) {
											local74 = -1;
										}
										local228 = Static212.inboundBuffer.g4();
										local249 = Static212.inboundBuffer.g2add();
										if (local249 == 65535) {
											local249 = -1;
										}
										local497 = Static212.inboundBuffer.ig2();
										if (Static378.method6313(local497)) {
											for (local506 = local74; local506 <= local249; local506++) {
												local1101 = ((long) local220 << 32) + ((long) local506);
												local1109 = (ServerActiveProperties) Static327.serverActiveProperties.get(local1101);
												if (local1109 != null) {
													local1118 = new ServerActiveProperties(local228, local1109.anInt1759);
													local1109.unlink();
												} else if (local506 == -1) {
													local1118 = new ServerActiveProperties(local228, Static6.getComponent(local220).serverActiveProperties.anInt1759);
												} else {
													local1118 = new ServerActiveProperties(local228, -1);
												}
												Static327.serverActiveProperties.put(local1118, local1101);
											}
										}
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.A_INBOUND_PACKET___259 == InboundPacket.packetInbound) {
										Static301.anInt5700 = Static212.inboundBuffer.g1();
										for (local220 = 0; local220 < Static301.anInt5700; local220++) {
											Static226.aStringArray35[local220] = Static212.inboundBuffer.gjstr();
											Static234.aStringArray39[local220] = Static212.inboundBuffer.gjstr();
											if (Static234.aStringArray39[local220].equals("")) {
												Static234.aStringArray39[local220] = Static226.aStringArray35[local220];
											}
											Static371.aStringArray66[local220] = Static212.inboundBuffer.gjstr();
											Static190.aStringArray28[local220] = Static212.inboundBuffer.gjstr();
											if (Static190.aStringArray28[local220].equals("")) {
												Static190.aStringArray28[local220] = Static371.aStringArray66[local220];
											}
											Static196.aBooleanArray31[local220] = false;
										}
										InboundPacket.packetInbound = null;
										Static53.anInt3971 = Static88.anInt1876;
										return true;
									} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___155) {
										local444 = Static212.inboundBuffer.gjstr();
										local74 = Static212.inboundBuffer.g2add();
										if (local74 == 65535) {
											local74 = -1;
										}
										local228 = Static212.inboundBuffer.g1sub();
										local249 = Static212.inboundBuffer.g1sub();
										if (local228 >= 1 && local228 <= 8) {
											if (local444.equalsIgnoreCase("null")) {
												local444 = null;
											}
											Static243.aStringArray44[local228 - 1] = local444;
											Static207.anIntArray225[local228 - 1] = local74;
											Static44.aBooleanArray11[local228 - 1] = local249 == 0;
										}
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.A_INBOUND_PACKET___106 == InboundPacket.packetInbound) {
										local220 = Static212.inboundBuffer.g2();
										local74 = Static212.inboundBuffer.g2add();
										local228 = Static212.inboundBuffer.g2add();
										if (Static378.method6313(local74)) {
											Static231.method4021(local220, local228);
										}
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.A_INBOUND_PACKET___73 == InboundPacket.packetInbound) {
										local220 = Static212.inboundBuffer.ig2add();
										local74 = Static212.inboundBuffer.ig2();
										if (local74 == 65535) {
											local74 = -1;
										}
										local228 = Static212.inboundBuffer.g4();
										local249 = Static212.inboundBuffer.img4();
										if (Static378.method6313(local220)) {
											Static216.method3773(local74, local249, local228);
											@Pc(3499) ObjType local3499 = ObjTypeList.objTypeList.get(local74);
											Static277.method4679(local3499.yAngle2D, local3499.xAngle2D, local249, local3499.zoom2d);
											Static376.method6286(local249, local3499.zAngle2D, local3499.xOffset2D, local3499.yOffset2D);
										}
										InboundPacket.packetInbound = null;
										return true;
									} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___72) {
										Static69.readNpcInfoPacket(true);
										InboundPacket.packetInbound = null;
										return true;
									} else {
										@Pc(3551) boolean local3551;
										if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___236) {
											local444 = Static212.inboundBuffer.gjstr();
											local3551 = Static212.inboundBuffer.g1() == 1;
											if (local3551) {
												local452 = Static212.inboundBuffer.gjstr();
											} else {
												local452 = local444;
											}
											local249 = Static212.inboundBuffer.g2();
											@Pc(3569) byte local3569 = Static212.inboundBuffer.g1b();
											@Pc(3571) boolean local3571 = false;
											if (local3569 == -128) {
												local3571 = true;
											}
											if (local3571) {
												if (Static186.anInt3730 == 0) {
													InboundPacket.packetInbound = null;
													return true;
												}
												for (local512 = 0; local512 < Static186.anInt3730 && (!Static47.aClass214Array1[local512].aString60.equals(local452) || Static47.aClass214Array1[local512].anInt5978 != local249); local512++) {
												}
												if (local512 < Static186.anInt3730) {
													while (local512 < Static186.anInt3730 - 1) {
														Static47.aClass214Array1[local512] = Static47.aClass214Array1[local512 + 1];
														local512++;
													}
													Static186.anInt3730--;
													Static47.aClass214Array1[Static186.anInt3730] = null;
												}
											} else {
												local1663 = Static212.inboundBuffer.gjstr();
												local2522 = new Class214();
												local2522.aString58 = local444;
												local2522.aString60 = local452;
												local2522.aString59 = Static135.method2537(local2522.aString60);
												local2522.aByte65 = local3569;
												local2522.aString61 = local1663;
												local2522.anInt5978 = local249;
												for (local542 = Static186.anInt3730 - 1; local542 >= 0; local542--) {
													local638 = Static47.aClass214Array1[local542].aString59.compareTo(local2522.aString59);
													if (local638 == 0) {
														Static47.aClass214Array1[local542].anInt5978 = local249;
														Static47.aClass214Array1[local542].aByte65 = local3569;
														Static47.aClass214Array1[local542].aString61 = local1663;
														if (local452.equals(Static17.self.aString41)) {
															Static119.aByte25 = local3569;
														}
														Static285.anInt5370 = Static88.anInt1876;
														InboundPacket.packetInbound = null;
														return true;
													}
													if (local638 < 0) {
														break;
													}
												}
												if (Static186.anInt3730 >= Static47.aClass214Array1.length) {
													InboundPacket.packetInbound = null;
													return true;
												}
												for (local638 = Static186.anInt3730 - 1; local638 > local542; local638--) {
													Static47.aClass214Array1[local638 + 1] = Static47.aClass214Array1[local638];
												}
												if (Static186.anInt3730 == 0) {
													Static47.aClass214Array1 = new Class214[100];
												}
												Static47.aClass214Array1[local542 + 1] = local2522;
												Static186.anInt3730++;
												if (local452.equals(Static17.self.aString41)) {
													Static119.aByte25 = local3569;
												}
											}
											InboundPacket.packetInbound = null;
											Static285.anInt5370 = Static88.anInt1876;
											return true;
										}
										@Pc(3809) String local3809;
										if (InboundPacket.A_INBOUND_PACKET___117 == InboundPacket.packetInbound) {
											local220 = Static212.inboundBuffer.gsmarts();
											local74 = Static212.inboundBuffer.mg4();
											local228 = Static212.inboundBuffer.g1();
											local3809 = "";
											local1627 = local3809;
											if ((local228 & 0x1) != 0) {
												local3809 = Static212.inboundBuffer.gjstr();
												if ((local228 & 0x2) == 0) {
													local1627 = local3809;
												} else {
													local1627 = Static212.inboundBuffer.gjstr();
												}
											}
											local1391 = Static212.inboundBuffer.gjstr();
											if (local220 == 99) {
												Static158.add(local1391);
											} else if (local1627.equals("") || !Static105.method2208(local1627)) {
												Static33.method4199(local3809, local74, local1391, local220, local1627);
											} else {
												InboundPacket.packetInbound = null;
												return true;
											}
											InboundPacket.packetInbound = null;
											return true;
										} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___39) {
											Static330.method5655(Static272.aClass210_11);
											InboundPacket.packetInbound = null;
											return true;
										} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___141) {
											local220 = Static212.inboundBuffer.mg4();
											Static354.aPrivelegedRequest_5 = GameShell.signlink.method3756(local220);
											InboundPacket.packetInbound = null;
											return true;
										} else if (InboundPacket.A_INBOUND_PACKET___184 == InboundPacket.packetInbound) {
											Static20.anInt545 = Static212.inboundBuffer.g1add();
											Static331.anInt6206 = Static212.inboundBuffer.g1sub();
											InboundPacket.packetInbound = null;
											return true;
										} else if (InboundPacket.A_INBOUND_PACKET___175 == InboundPacket.packetInbound) {
											local220 = Static212.inboundBuffer.g1();
											local74 = Static212.inboundBuffer.ig2();
											Static214.aClass226_1.method5785(local74, local220);
											InboundPacket.packetInbound = null;
											return true;
										} else if (InboundPacket.A_INBOUND_PACKET___81 == InboundPacket.packetInbound) {
											local220 = Static212.inboundBuffer.ig2();
											local74 = Static212.inboundBuffer.g4();
											local228 = Static212.inboundBuffer.ig2();
											if (local228 == 65535) {
												local228 = -1;
											}
											if (Static378.method6313(local220)) {
												Static139.method2595(local74, local228);
											}
											InboundPacket.packetInbound = null;
											return true;
										} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___152) {
											Static330.method5655(Static242.aClass210_10);
											InboundPacket.packetInbound = null;
											return true;
										} else if (InboundPacket.A_INBOUND_PACKET___167 == InboundPacket.packetInbound) {
											Static96.anInt2002 = Static212.inboundBuffer.g1();
											Static93.anInt1950 = Static88.anInt1876;
											InboundPacket.packetInbound = null;
											return true;
										} else if (InboundPacket.A_INBOUND_PACKET___131 == InboundPacket.packetInbound) {
											local220 = Static212.inboundBuffer.mg4();
											local74 = Static212.inboundBuffer.ig2add();
											local228 = Static212.inboundBuffer.g2();
											if (Static378.method6313(local228)) {
												Static150.method2737(local220, local74);
											}
											InboundPacket.packetInbound = null;
											return true;
										} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___176) {
											local220 = Static212.inboundBuffer.ig4();
											local74 = Static212.inboundBuffer.ig2();
											Static214.aClass226_1.method5785(local74, local220);
											InboundPacket.packetInbound = null;
											return true;
										} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___182) {
											local220 = Static212.inboundBuffer.g1();
											@Pc(4068) boolean local4068 = (local220 & 0x1) == 1;
											local1381 = Static212.inboundBuffer.gjstr();
											local3809 = Static212.inboundBuffer.gjstr();
											if (local3809.equals("")) {
												local3809 = local1381;
											}
											local1627 = Static212.inboundBuffer.gjstr();
											local1391 = Static212.inboundBuffer.gjstr();
											if (local1391.equals("")) {
												local1391 = local1627;
											}
											if (local4068) {
												for (local512 = 0; local512 < Static301.anInt5700; local512++) {
													if (Static234.aStringArray39[local512].equals(local1391)) {
														Static226.aStringArray35[local512] = local1381;
														Static234.aStringArray39[local512] = local3809;
														Static371.aStringArray66[local512] = local1627;
														Static190.aStringArray28[local512] = local1391;
														break;
													}
												}
											} else {
												Static226.aStringArray35[Static301.anInt5700] = local1381;
												Static234.aStringArray39[Static301.anInt5700] = local3809;
												Static371.aStringArray66[Static301.anInt5700] = local1627;
												Static190.aStringArray28[Static301.anInt5700] = local1391;
												Static196.aBooleanArray31[Static301.anInt5700] = (local220 & 0x2) == 2;
												Static301.anInt5700++;
											}
											InboundPacket.packetInbound = null;
											Static53.anInt3971 = Static88.anInt1876;
											return true;
										} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___113) {
											local444 = Static212.inboundBuffer.gjstr();
											local74 = Static212.inboundBuffer.ig2add();
											local228 = Static212.inboundBuffer.ig2();
											if (Static378.method6313(local228)) {
												Static10.method239(local74, local444);
											}
											InboundPacket.packetInbound = null;
											return true;
										} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___103) {
											local220 = Static212.inboundBuffer.g1sub();
											local74 = Static212.inboundBuffer.ig2();
											if (local74 == 65535) {
												local74 = -1;
											}
											local228 = Static212.inboundBuffer.g1sub();
											Static138.playMusic(local220, local228, local74);
											InboundPacket.packetInbound = null;
											return true;
										} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___226) {
											local220 = Static212.inboundBuffer.g1add();
											local74 = Static212.inboundBuffer.ig3();
											local228 = Static212.inboundBuffer.g2();
											if (local228 == 65535) {
												local228 = -1;
											}
											Static175.playJingle(local228, local74, local220);
											InboundPacket.packetInbound = null;
											return true;
										} else {
											@Pc(4300) long local4300;
											if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___249) {
												local1371 = Static212.inboundBuffer.g1() == 1;
												local452 = Static212.inboundBuffer.gjstr();
												local1381 = local452;
												if (local1371) {
													local1381 = Static212.inboundBuffer.gjstr();
												}
												local1780 = Static212.inboundBuffer.g8();
												local1785 = Static212.inboundBuffer.g2();
												local4300 = Static212.inboundBuffer.ig3();
												local638 = Static212.inboundBuffer.g1();
												@Pc(4310) long local4310 = (local1785 << 32) + local4300;
												@Pc(4312) boolean local4312 = false;
												@Pc(4314) int local4314 = 0;
												while (true) {
													if (local4314 >= 100) {
														if (local638 <= 1) {
															if (Static56.playerUnderage && !Static101.aBoolean159 || Static109.enabled) {
																local4312 = true;
															} else if (Static105.method2208(local1381)) {
																local4312 = true;
															}
														}
														break;
													}
													if (Static358.uids[local4314] == local4310) {
														local4312 = true;
														break;
													}
													local4314++;
												}
												if (!local4312 && Static212.inTutorialIsland == 0) {
													Static358.uids[Static193.uidsWriterIndex] = local4310;
													Static193.uidsWriterIndex = (Static193.uidsWriterIndex + 1) % 100;
													@Pc(4372) String local4372 = Static153.method2772(Static308.method5275(Static212.inboundBuffer));
													if (local638 == 2 || local638 == 3) {
														Static220.add(0, Static170.method3228(local1780), local4372, -1, 9, "<img=1>" + local1381, "<img=1>" + local452);
													} else if (local638 == 1) {
														Static220.add(0, Static170.method3228(local1780), local4372, -1, 9, "<img=0>" + local1381, "<img=0>" + local452);
													} else {
														Static220.add(0, Static170.method3228(local1780), local4372, -1, 9, local1381, local452);
													}
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___216) {
												local220 = Static212.inboundBuffer.g2();
												local74 = Static212.inboundBuffer.g1();
												local3551 = (local74 & 0x1) == 1;
												while (Static82.length > Static212.inboundBuffer.offset) {
													local249 = Static212.inboundBuffer.gsmarts();
													local497 = Static212.inboundBuffer.g2();
													local506 = 0;
													if (local497 != 0) {
														local506 = Static212.inboundBuffer.g1();
														if (local506 == 255) {
															local506 = Static212.inboundBuffer.mg4();
														}
													}
													Static62.method2391(local249, local506, local220, local497 - 1, local3551);
												}
												Static106.anIntArray135[Static54.anInt1417++ & 0x1F] = local220;
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___154) {
												local220 = Static212.inboundBuffer.img4();
												local74 = Static212.inboundBuffer.ig2add();
												local228 = Static212.inboundBuffer.g2();
												if (local228 == 65535) {
													local228 = -1;
												}
												if (Static378.method6313(local74)) {
													Static190.method3500(local228, -1, 1, local220);
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___171) {
												Static330.method5655(Static200.aClass210_9);
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___217) {
												local444 = Static212.inboundBuffer.gjstr();
												local74 = Static212.inboundBuffer.ig2();
												local228 = Static212.inboundBuffer.img4();
												if (Static378.method6313(local74)) {
													Static319.method5431(local228, local444);
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___146) {
												Static330.method5655(Static110.aClass210_5);
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___211) {
												Static69.readNpcInfoPacket(false);
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___130) {
												local220 = Static212.inboundBuffer.ig4();
												local74 = Static212.inboundBuffer.ig2();
												local228 = Static212.inboundBuffer.g2b();
												local249 = Static212.inboundBuffer.g2bsub();
												if (Static378.method6313(local74)) {
													Static129.method2438(local249, local228, local220);
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___199) {
												Static181.method3374(false);
												InboundPacket.packetInbound = null;
												return false;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___225) {
												Static154.aClass170_2 = Static335.method5694(Static212.inboundBuffer.g1());
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___70) {
												local220 = Static212.inboundBuffer.g1bneg();
												local74 = Static212.inboundBuffer.ig2add();
												local3551 = (local220 & 0x1) == 1;
												Inventory.delete(local3551, local74);
												Static106.anIntArray135[Static54.anInt1417++ & 0x1F] = local74;
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___13) {
												local220 = Static212.inboundBuffer.img4();
												local74 = Static212.inboundBuffer.g2add();
												if (local74 == 65535) {
													local74 = -1;
												}
												local228 = Static212.inboundBuffer.ig2add();
												if (Static378.method6313(local228)) {
													Static190.method3500(local74, -1, 2, local220);
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___76) {
												local272 = Static212.inboundBuffer.g1neg();
												local74 = Static212.inboundBuffer.g2();
												Static214.aClass226_1.method5784(local272, local74);
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___83) {
												Static383.setSettings(Static212.inboundBuffer.gjstr());
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___257) {
												local220 = Static212.inboundBuffer.g2();
												local74 = Static212.inboundBuffer.g2();
												local228 = Static212.inboundBuffer.g2();
												local249 = Static212.inboundBuffer.ig2add();
												local497 = Static212.inboundBuffer.ig4();
												if (Static378.method6313(local74)) {
													Static190.method3500(local228 | local249 << 16, local220, 7, local497);
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___94) {
												local1371 = Static212.inboundBuffer.g1() == 1;
												local452 = Static212.inboundBuffer.gjstr();
												local1381 = local452;
												if (local1371) {
													local1381 = Static212.inboundBuffer.gjstr();
												}
												local1780 = Static212.inboundBuffer.g8();
												local1785 = Static212.inboundBuffer.g2();
												local4300 = Static212.inboundBuffer.ig3();
												local638 = Static212.inboundBuffer.g1();
												@Pc(4892) int local4892 = Static212.inboundBuffer.g2();
												@Pc(4898) long local4898 = local4300 + (local1785 << 32);
												@Pc(4900) boolean local4900 = false;
												@Pc(4902) int local4902 = 0;
												while (true) {
													if (local4902 >= 100) {
														if (local638 <= 1 && Static105.method2208(local1381)) {
															local4900 = true;
														}
														break;
													}
													if (Static358.uids[local4902] == local4898) {
														local4900 = true;
														break;
													}
													local4902++;
												}
												if (!local4900 && Static212.inTutorialIsland == 0) {
													Static358.uids[Static193.uidsWriterIndex] = local4898;
													Static193.uidsWriterIndex = (Static193.uidsWriterIndex + 1) % 100;
													@Pc(4955) String local4955 = Static146.get(local4892).decodeMessage(Static212.inboundBuffer);
													if (local638 == 2) {
														Static220.add(0, Static170.method3228(local1780), local4955, local4892, 20, "<img=1>" + local1381, "<img=1>" + local452);
													} else if (local638 == 1) {
														Static220.add(0, Static170.method3228(local1780), local4955, local4892, 20, "<img=0>" + local1381, "<img=0>" + local452);
													} else {
														Static220.add(0, Static170.method3228(local1780), local4955, local4892, 20, local1381, local452);
													}
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___31) {
												Static330.method5655(Static27.aClass210_2);
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___185) {
												local220 = Static212.inboundBuffer.g2add();
												local74 = Static212.inboundBuffer.img4();
												if (Static378.method6313(local220)) {
													Static190.method3500(Static234.selfID, 0, 5, local74);
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___256) {
												local220 = Static212.inboundBuffer.g2();
												local74 = Static212.inboundBuffer.g1();
												local3551 = (local74 & 0x1) == 1;
												Inventory.clear(local3551, local220);
												local249 = Static212.inboundBuffer.g2();
												for (local497 = 0; local497 < local249; local497++) {
													local506 = Static212.inboundBuffer.ig2();
													local512 = Static212.inboundBuffer.g1();
													if (local512 == 255) {
														local512 = Static212.inboundBuffer.g4();
													}
													Static62.method2391(local497, local512, local220, local506 - 1, local3551);
												}
												Static106.anIntArray135[Static54.anInt1417++ & 0x1F] = local220;
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___234) {
												local220 = Static212.inboundBuffer.ig2();
												local74 = Static212.inboundBuffer.g1();
												local228 = Static212.inboundBuffer.g2add();
												@Pc(5170) Npc local5170 = Static365.npcs[local220];
												if (local5170 != null) {
													Static307.method5255(local228, local5170, local74);
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___68) {
												local220 = Static212.inboundBuffer.g2();
												local74 = Static212.inboundBuffer.mg4();
												local228 = Static212.inboundBuffer.ig2();
												if (Static378.method6313(local220)) {
													Static322.method5480(local228, local74);
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.SET_WALK_TEXT) {
												if (Static82.length == 0) {
													Static330.walkHereOp = LocalisedText.WALK_HERE.getLocalisedText(client.language);
												} else {
													Static330.walkHereOp = Static212.inboundBuffer.gjstr();
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___25) {
												Static181.method3374(true);
												InboundPacket.packetInbound = null;
												return false;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___244) {
												Static330.method5655(Static19.aClass210_1);
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___79) {
												local220 = Static212.inboundBuffer.g2();
												local452 = Static212.inboundBuffer.gjstr();
												local228 = Static212.inboundBuffer.ig2();
												if (Static378.method6313(local228)) {
													Static10.method239(local220, local452);
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___42) {
												local220 = Static212.inboundBuffer.g4();
												local74 = Static212.inboundBuffer.ig2add();
												local228 = Static212.inboundBuffer.g2add();
												local249 = Static212.inboundBuffer.g2add();
												local497 = Static212.inboundBuffer.g2add();
												if (Static378.method6313(local74)) {
													Static277.method4679(local497, local249, local220, local228);
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___151) {
												Static330.method5655(Static109.aClass210_4);
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___26) {
												local220 = Static212.inboundBuffer.g1add();
												local74 = local220 >> 2;
												local228 = local220 & 0x3;
												local249 = Static150.anIntArray174[local74];
												local497 = Static212.inboundBuffer.g4();
												local506 = local497 >> 28 & 0x3;
												local512 = local497 >> 14 & 0x3FFF;
												local536 = local497 & 0x3FFF;
												local542 = Static212.inboundBuffer.ig2add();
												@Pc(5371) int local5371 = local536 - Static148.originZ;
												if (local542 == 65535) {
													local542 = -1;
												}
												local512 -= Static164.originX;
												Static391.method6451(local74, local542, local5371, local249, local228, local512, local506);
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___108) {
												Static67.anInt1637 = Static212.inboundBuffer.g1sub();
												Static243.anInt4502 = Static212.inboundBuffer.g1();
												Static7.anInt7240 = Static212.inboundBuffer.g1bneg();
												while (Static212.inboundBuffer.offset < Static82.length) {
													@Pc(5421) Class210 local5421 = Static324.method5538()[Static212.inboundBuffer.g1()];
													Static330.method5655(local5421);
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.HINT_ARROW) {
												local220 = Static212.inboundBuffer.g1();
												local74 = local220 >> 5;
												local228 = local220 & 0x1F;
												if (local228 == 0) {
													Static50.HINT_ARROWS[local74] = null;
													InboundPacket.packetInbound = null;
													return true;
												}
												@Pc(5468) HintArrow hintArrow = new HintArrow();
												hintArrow.type = local228;
												hintArrow.headIcon = Static212.inboundBuffer.g1();
												if (hintArrow.headIcon >= 0 && hintArrow.headIcon < Static230.headHints.length) {
													if (hintArrow.type == 1 || hintArrow.type == 10) {
														hintArrow.target = Static212.inboundBuffer.g2();
														Static212.inboundBuffer.offset += 6;
													} else if (hintArrow.type >= 2 && hintArrow.type <= 6) {
														if (hintArrow.type == 2) {
															hintArrow.xOffset = 64;
															hintArrow.zOffset = 64;
														}
														if (hintArrow.type == 3) {
															hintArrow.zOffset = 64;
															hintArrow.xOffset = 0;
														}
														if (hintArrow.type == 4) {
															hintArrow.zOffset = 64;
															hintArrow.xOffset = 128;
														}
														if (hintArrow.type == 5) {
															hintArrow.zOffset = 0;
															hintArrow.xOffset = 64;
														}
														if (hintArrow.type == 6) {
															hintArrow.xOffset = 64;
															hintArrow.zOffset = 128;
														}
														hintArrow.type = 2;
														hintArrow.anInt2359 = Static212.inboundBuffer.g1();
														hintArrow.anInt2352 = Static212.inboundBuffer.g2();
														hintArrow.anInt2364 = Static212.inboundBuffer.g2();
														hintArrow.anInt2362 = Static212.inboundBuffer.g1();
														hintArrow.anInt2349 = Static212.inboundBuffer.g2();
													}
													hintArrow.model = Static212.inboundBuffer.g2();
													if (hintArrow.model == 65535) {
														hintArrow.model = -1;
													}
													Static50.HINT_ARROWS[local74] = hintArrow;
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___129) {
												Static330.method5655(Static140.aClass210_6);
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___116) {
												local220 = Static212.inboundBuffer.g2();
												local452 = Static212.inboundBuffer.gjstr();
												@Pc(5648) Object[] local5648 = new Object[local452.length() + 1];
												for (local249 = local452.length() - 1; local249 >= 0; local249--) {
													if (local452.charAt(local249) == 's') {
														local5648[local249 + 1] = Static212.inboundBuffer.gjstr();
													} else {
														local5648[local249 + 1] = Integer.valueOf(Static212.inboundBuffer.mg4());
													}
												}
												local5648[0] = Integer.valueOf(Static212.inboundBuffer.mg4());
												if (Static378.method6313(local220)) {
													@Pc(5704) HookRequest local5704 = new HookRequest();
													local5704.arguments = local5648;
													ScriptRunner.method3590(local5704);
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___153) {
												local220 = Static212.inboundBuffer.g2();
												local74 = Static212.inboundBuffer.mg4();
												if (Static378.method6313(local220)) {
													@Pc(5735) SubInterface local5735 = (SubInterface) Static329.subInterfaces.get((long) local74);
													if (local5735 != null) {
														Static276.method4654(false, local5735, true);
													}
													if (Static192.aComponent_8 != null) {
														Static200.redraw(Static192.aComponent_8);
														Static192.aComponent_8 = null;
													}
												}
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___174) {
												Static330.method5655(Static164.aClass210_8);
												InboundPacket.packetInbound = null;
												return true;
											} else if (InboundPacket.packetInbound == InboundPacket.A_INBOUND_PACKET___82) {
												local220 = Static212.inboundBuffer.mg4();
												local74 = Static212.inboundBuffer.ig2();
												local228 = Static212.inboundBuffer.ig2badd();
												if (Static378.method6313(local74)) {
													Static53.method3951(local228, local220);
												}
												InboundPacket.packetInbound = null;
												return true;
											} else {
												Static262.report(null, "T1 - " + (InboundPacket.packetInbound == null ? -1 : InboundPacket.packetInbound.getID()) + "," + (InboundPacket.aInboundPacket_57 == null ? -1 : InboundPacket.aInboundPacket_57.getID()) + "," + (InboundPacket.aInboundPacket_35 == null ? -1 : InboundPacket.aInboundPacket_35.getID()) + " - " + Static82.length);
												Static99.logout();
												return true;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!nf;B)V")
	public static void method1822(@OriginalArg(0) Class12_Sub4 arg0) {
		arg0.aClass11_1 = null;
		@Pc(10) int local10 = arg0.aClass12_Sub2Array1.length;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			arg0.aClass12_Sub2Array1[local12].aBoolean29 = false;
		}
		@Pc(28) Class36[] local28 = ColorImageCacheEntry.aClass36Array1;
		synchronized (ColorImageCacheEntry.aClass36Array1) {
			if (local10 < ColorImageCacheEntry.aClass36Array1.length && Static206.anIntArray224[local10] < 200) {
				ColorImageCacheEntry.aClass36Array1[local10].method1418(arg0);
				@Pc(49) int local49 = Static206.anIntArray224[local10]++;
			}
		}
	}
}
