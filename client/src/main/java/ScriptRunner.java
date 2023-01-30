import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class ScriptRunner {

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "[I")
	private static int[] anIntArray212;

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray30;

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "Lclient!gr;")
	private static Class86 aClass86_1;

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "Lclient!nk;")
	private static Component aComponent_9;

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "Lclient!nk;")
	private static Component aComponent_10;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
	private static int isp = 0;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "[Ljava/lang/String;")
	private static final String[] stringStack = new String[1000];

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "[Lclient!ol;")
	private static final Class172[] aClass172Array1 = new Class172[50];

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	private static int anInt3652 = 0;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "[I")
	private static final int[] intStack = new int[1000];

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
	private static int anInt3661 = 0;

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "Ljava/util/Calendar;")
	private static final Calendar calendar = Calendar.getInstance();

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "[[I")
	private static final int[][] arrays = new int[5][5000];

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "[I")
	private static final int[] anIntArray214 = new int[5];

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "[I")
	private static final int[] anIntArray215 = new int[3];

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "Lclient!hu;")
	public static final SoftLruHashTable A_SOFT_LRU_HASH_TABLE___30 = new SoftLruHashTable(4);

	@OriginalMember(owner = "client!lk", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray31 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	private static void method3589(@OriginalArg(0) int arg0) {
		@Pc(3) Component local3 = Static6.method140(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Component[] local13 = Static113.aComponentArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Component[] local19 = Static26.aComponentArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static113.aComponentArrayArray2[local9] = new Component[local22];
			Static403.method4608(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static403.method4608(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!fn;)V")
	public static void method3590(@OriginalArg(0) Class2_Sub13 arg0) {
		method3592(arg0, 200000);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method3591(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static4.anInt90 == 0 && (Static56.aBoolean123 && !Static101.aBoolean159 || Static109.aBoolean166)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static75.A_TRANSLATABLE_STRING___38.getLocalisedText(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static75.A_TRANSLATABLE_STRING___38.getLocalisedText(0).length());
		} else if (local11.startsWith(Static51.A_TRANSLATABLE_STRING___28.getLocalisedText(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static51.A_TRANSLATABLE_STRING___28.getLocalisedText(0).length());
		} else if (local11.startsWith(Static3.A_TRANSLATABLE_STRING___1.getLocalisedText(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static3.A_TRANSLATABLE_STRING___1.getLocalisedText(0).length());
		} else if (local11.startsWith(Static154.A_TRANSLATABLE_STRING___66.getLocalisedText(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static154.A_TRANSLATABLE_STRING___66.getLocalisedText(0).length());
		} else if (local11.startsWith(Static278.A_TRANSLATABLE_STRING___110.getLocalisedText(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static278.A_TRANSLATABLE_STRING___110.getLocalisedText(0).length());
		} else if (local11.startsWith(Static23.A_TRANSLATABLE_STRING___17.getLocalisedText(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static23.A_TRANSLATABLE_STRING___17.getLocalisedText(0).length());
		} else if (local11.startsWith(Static105.A_TRANSLATABLE_STRING___45.getLocalisedText(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static105.A_TRANSLATABLE_STRING___45.getLocalisedText(0).length());
		} else if (local11.startsWith(Static129.A_TRANSLATABLE_STRING___57.getLocalisedText(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static129.A_TRANSLATABLE_STRING___57.getLocalisedText(0).length());
		} else if (local11.startsWith(Static199.A_TRANSLATABLE_STRING___120.getLocalisedText(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static199.A_TRANSLATABLE_STRING___120.getLocalisedText(0).length());
		} else if (local11.startsWith(Static37.A_TRANSLATABLE_STRING___24.getLocalisedText(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static37.A_TRANSLATABLE_STRING___24.getLocalisedText(0).length());
		} else if (local11.startsWith(Static285.A_TRANSLATABLE_STRING___113.getLocalisedText(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static285.A_TRANSLATABLE_STRING___113.getLocalisedText(0).length());
		} else if (local11.startsWith(Static139.A_TRANSLATABLE_STRING___62.getLocalisedText(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static139.A_TRANSLATABLE_STRING___62.getLocalisedText(0).length());
		} else if (client.language != 0) {
			if (local11.startsWith(Static75.A_TRANSLATABLE_STRING___38.getLocalisedText(client.language))) {
				local13 = 0;
				arg0 = arg0.substring(Static75.A_TRANSLATABLE_STRING___38.getLocalisedText(client.language).length());
			} else if (local11.startsWith(Static51.A_TRANSLATABLE_STRING___28.getLocalisedText(client.language))) {
				local13 = 1;
				arg0 = arg0.substring(Static51.A_TRANSLATABLE_STRING___28.getLocalisedText(client.language).length());
			} else if (local11.startsWith(Static3.A_TRANSLATABLE_STRING___1.getLocalisedText(client.language))) {
				local13 = 2;
				arg0 = arg0.substring(Static3.A_TRANSLATABLE_STRING___1.getLocalisedText(client.language).length());
			} else if (local11.startsWith(Static154.A_TRANSLATABLE_STRING___66.getLocalisedText(client.language))) {
				local13 = 3;
				arg0 = arg0.substring(Static154.A_TRANSLATABLE_STRING___66.getLocalisedText(client.language).length());
			} else if (local11.startsWith(Static278.A_TRANSLATABLE_STRING___110.getLocalisedText(client.language))) {
				local13 = 4;
				arg0 = arg0.substring(Static278.A_TRANSLATABLE_STRING___110.getLocalisedText(client.language).length());
			} else if (local11.startsWith(Static23.A_TRANSLATABLE_STRING___17.getLocalisedText(client.language))) {
				local13 = 5;
				arg0 = arg0.substring(Static23.A_TRANSLATABLE_STRING___17.getLocalisedText(client.language).length());
			} else if (local11.startsWith(Static105.A_TRANSLATABLE_STRING___45.getLocalisedText(client.language))) {
				local13 = 6;
				arg0 = arg0.substring(Static105.A_TRANSLATABLE_STRING___45.getLocalisedText(client.language).length());
			} else if (local11.startsWith(Static129.A_TRANSLATABLE_STRING___57.getLocalisedText(client.language))) {
				local13 = 7;
				arg0 = arg0.substring(Static129.A_TRANSLATABLE_STRING___57.getLocalisedText(client.language).length());
			} else if (local11.startsWith(Static199.A_TRANSLATABLE_STRING___120.getLocalisedText(client.language))) {
				local13 = 8;
				arg0 = arg0.substring(Static199.A_TRANSLATABLE_STRING___120.getLocalisedText(client.language).length());
			} else if (local11.startsWith(Static37.A_TRANSLATABLE_STRING___24.getLocalisedText(client.language))) {
				local13 = 9;
				arg0 = arg0.substring(Static37.A_TRANSLATABLE_STRING___24.getLocalisedText(client.language).length());
			} else if (local11.startsWith(Static285.A_TRANSLATABLE_STRING___113.getLocalisedText(client.language))) {
				local13 = 10;
				arg0 = arg0.substring(Static285.A_TRANSLATABLE_STRING___113.getLocalisedText(client.language).length());
			} else if (local11.startsWith(Static139.A_TRANSLATABLE_STRING___62.getLocalisedText(client.language))) {
				local13 = 11;
				arg0 = arg0.substring(Static139.A_TRANSLATABLE_STRING___62.getLocalisedText(client.language).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static136.A_TRANSLATABLE_STRING___141.getLocalisedText(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static136.A_TRANSLATABLE_STRING___141.getLocalisedText(0).length());
		} else if (local11.startsWith(Static288.A_TRANSLATABLE_STRING___114.getLocalisedText(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static288.A_TRANSLATABLE_STRING___114.getLocalisedText(0).length());
		} else if (local11.startsWith(Static76.A_TRANSLATABLE_STRING___39.getLocalisedText(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static76.A_TRANSLATABLE_STRING___39.getLocalisedText(0).length());
		} else if (local11.startsWith(Static196.A_TRANSLATABLE_STRING___70.getLocalisedText(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static196.A_TRANSLATABLE_STRING___70.getLocalisedText(0).length());
		} else if (local11.startsWith(Static223.A_TRANSLATABLE_STRING___87.getLocalisedText(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static223.A_TRANSLATABLE_STRING___87.getLocalisedText(0).length());
		} else if (client.language != 0) {
			if (local11.startsWith(Static136.A_TRANSLATABLE_STRING___141.getLocalisedText(client.language))) {
				local451 = 1;
				arg0 = arg0.substring(Static136.A_TRANSLATABLE_STRING___141.getLocalisedText(client.language).length());
			} else if (local11.startsWith(Static288.A_TRANSLATABLE_STRING___114.getLocalisedText(client.language))) {
				local451 = 2;
				arg0 = arg0.substring(Static288.A_TRANSLATABLE_STRING___114.getLocalisedText(client.language).length());
			} else if (local11.startsWith(Static76.A_TRANSLATABLE_STRING___39.getLocalisedText(client.language))) {
				local451 = 3;
				arg0 = arg0.substring(Static76.A_TRANSLATABLE_STRING___39.getLocalisedText(client.language).length());
			} else if (local11.startsWith(Static196.A_TRANSLATABLE_STRING___70.getLocalisedText(client.language))) {
				local451 = 4;
				arg0 = arg0.substring(Static196.A_TRANSLATABLE_STRING___70.getLocalisedText(client.language).length());
			} else if (local11.startsWith(Static223.A_TRANSLATABLE_STRING___87.getLocalisedText(client.language))) {
				local451 = 5;
				arg0 = arg0.substring(Static223.A_TRANSLATABLE_STRING___87.getLocalisedText(client.language).length());
			}
		}
		Static91.method1960(Static102.aClass145_141);
		Static257.aClass2_Sub4_Sub2_4.p1(0);
		@Pc(646) int local646 = Static257.aClass2_Sub4_Sub2_4.offset;
		if (arg1 == 5021) {
			Static257.aClass2_Sub4_Sub2_4.p1(1);
		} else {
			Static257.aClass2_Sub4_Sub2_4.p1(0);
		}
		Static257.aClass2_Sub4_Sub2_4.p1(local13);
		Static257.aClass2_Sub4_Sub2_4.p1(local451);
		Static120.method2379(arg0, Static257.aClass2_Sub4_Sub2_4);
		Static257.aClass2_Sub4_Sub2_4.psize1(Static257.aClass2_Sub4_Sub2_4.offset - local646);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!fn;I)V")
	private static void method3592(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray4;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub2_Sub11 local12 = Static295.method5099(local8);
		if (local12 == null) {
			return;
		}
		anIntArray212 = new int[local12.anInt3225];
		@Pc(21) int local21 = 0;
		aStringArray30 = new String[local12.anInt3228];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt2116;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt2117;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aComponent_3 == null ? -1 : arg0.aComponent_3.id;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2118;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aComponent_3 == null ? -1 : arg0.aComponent_3.createdComponentID;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aComponent_4 == null ? -1 : arg0.aComponent_4.id;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aComponent_4 == null ? -1 : arg0.aComponent_4.createdComponentID;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt2114;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt2115;
				}
				anIntArray212[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString20;
				}
				aStringArray30[local27++] = local135;
			}
		}
		run(local12, arg1);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method3593(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		calendar.setTime(new Date(local6));
		@Pc(16) int local16 = calendar.get(5);
		@Pc(20) int local20 = calendar.get(2);
		@Pc(24) int local24 = calendar.get(1);
		return local16 + "-" + aStringArray31[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)V")
	private static void run(@OriginalArg(0) int opcode, @OriginalArg(1) boolean arg1) {
		@Pc(137) Component component;
		@Pc(25) int local25;
		@Pc(35) Component local35;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(210) Component local210;
		@Pc(13) int local13;
		if (opcode < 300) {
			if (opcode == 100) {
				isp -= 3;
				local13 = intStack[isp];
				local19 = intStack[isp + 1];
				local25 = intStack[isp + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static6.method140(local13);
				if (local35.aComponentArray2 == null) {
					local35.aComponentArray2 = new Component[local25 + 1];
				}
				if (local35.aComponentArray2.length <= local25) {
					@Pc(54) Component[] local54 = new Component[local25 + 1];
					for (local56 = 0; local56 < local35.aComponentArray2.length; local56++) {
						local54[local56] = local35.aComponentArray2[local56];
					}
					local35.aComponentArray2 = local54;
				}
				if (local25 > 0 && local35.aComponentArray2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Component local99 = new Component();
				local99.type = local19;
				local99.layer = local99.id = local35.id;
				local99.createdComponentID = local25;
				local35.aComponentArray2[local25] = local99;
				if (arg1) {
					aComponent_10 = local99;
				} else {
					aComponent_9 = local99;
				}
				Static200.redraw(local35);
				return;
			}
			@Pc(158) Component local158;
			if (opcode == 101) {
				component = arg1 ? aComponent_10 : aComponent_9;
				if (component.createdComponentID == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static6.method140(component.id);
				local158.aComponentArray2[component.createdComponentID] = null;
				Static200.redraw(local158);
				return;
			}
			if (opcode == 102) {
				component = Static6.method140(intStack[--isp]);
				component.aComponentArray2 = null;
				Static200.redraw(component);
				return;
			}
			if (opcode == 200) {
				isp -= 2;
				local13 = intStack[isp];
				local19 = intStack[isp + 1];
				local210 = Static207.method3704(local13, local19);
				if (local210 != null && local19 != -1) {
					intStack[isp++] = 1;
					if (arg1) {
						aComponent_10 = local210;
						return;
					}
					aComponent_9 = local210;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
			if (opcode == 201) {
				local13 = intStack[--isp];
				local158 = Static6.method140(local13);
				if (local158 != null) {
					intStack[isp++] = 1;
					if (arg1) {
						aComponent_10 = local158;
						return;
					}
					aComponent_9 = local158;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
			if (opcode == 202) {
				local13 = intStack[--isp];
				method3589(local13);
				return;
			}
			if (opcode == 203) {
				local13 = intStack[--isp];
				method3596(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (opcode < 500) {
				if (opcode == 403) {
					isp -= 2;
					local13 = intStack[isp];
					local19 = intStack[isp + 1];
					for (local25 = 0; local25 < Static5.anIntArray3.length; local25++) {
						if (Static5.anIntArray3[local25] == local13) {
							Static17.self.appearance.method3180(Static21.aClass55_1, local25, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static355.anIntArray457.length; local353++) {
						if (Static355.anIntArray457[local353] == local13) {
							Static17.self.appearance.method3180(Static21.aClass55_1, local353, local19);
							return;
						}
					}
					return;
				}
				if (opcode == 404) {
					isp -= 2;
					local13 = intStack[isp];
					local19 = intStack[isp + 1];
					Static17.self.appearance.method3186(local13, local19);
					return;
				}
				if (opcode == 410) {
					local412 = intStack[--isp] != 0;
					Static17.self.appearance.method3182(local412);
					return;
				}
			} else if ((opcode < 1000 || opcode >= 1100) && (opcode < 2000 || opcode >= 2100)) {
				@Pc(1101) String local1101;
				if (opcode >= 1100 && opcode < 1200 || !(opcode < 2100 || opcode >= 2200)) {
					if (opcode >= 2000) {
						opcode -= 1000;
						component = Static6.method140(intStack[--isp]);
					} else {
						component = arg1 ? aComponent_10 : aComponent_9;
					}
					if (opcode == 1100) {
						isp -= 2;
						component.scrollX = intStack[isp];
						if (component.scrollWidth - component.width < component.scrollX) {
							component.scrollX = component.scrollWidth - component.width;
						}
						if (component.scrollX < 0) {
							component.scrollX = 0;
						}
						component.scrollY = intStack[isp + 1];
						if (component.scrollY > component.scrollHeight - component.height) {
							component.scrollY = component.scrollHeight - component.height;
						}
						if (component.scrollY < 0) {
							component.scrollY = 0;
						}
						Static200.redraw(component);
						if (component.createdComponentID == -1) {
							Static369.setComponentScrollPositionClient(component.id);
						}
						return;
					}
					if (opcode == 1101) {
						component.color = intStack[--isp];
						Static200.redraw(component);
						if (component.createdComponentID == -1) {
							Static278.method4722(component.id);
						}
						return;
					}
					if (opcode == 1102) {
						component.fill = intStack[--isp] == 1;
						Static200.redraw(component);
						return;
					}
					if (opcode == 1103) {
						component.transparency = intStack[--isp];
						Static200.redraw(component);
						return;
					}
					if (opcode == 1104) {
						component.lineWidth = intStack[--isp];
						Static200.redraw(component);
						return;
					}
					if (opcode == 1105) {
						local19 = intStack[--isp];
						if (component.graphic != local19) {
							component.graphic = local19;
							Static200.redraw(component);
						}
						if (component.createdComponentID == -1) {
							Static137.method2552(component.id);
						}
						return;
					}
					if (opcode == 1106) {
						component.angle = intStack[--isp];
						Static200.redraw(component);
						return;
					}
					if (opcode == 1107) {
						component.tiled = intStack[--isp] == 1;
						Static200.redraw(component);
						return;
					}
					if (opcode == 1108) {
						component.modelType = 1;
						component.modelID = intStack[--isp];
						Static200.redraw(component);
						if (component.createdComponentID == -1) {
							Static17.method4212(component.id);
						}
						return;
					}
					if (opcode == 1109) {
						isp -= 6;
						component.anInt4278 = intStack[isp];
						component.anInt4250 = intStack[isp + 1];
						component.anInt4320 = intStack[isp + 2];
						component.anInt4274 = intStack[isp + 3];
						component.anInt4319 = intStack[isp + 4];
						component.modelZoom = intStack[isp + 5];
						Static200.redraw(component);
						if (component.createdComponentID == -1) {
							Static173.method3321(component.id);
							Static86.method1934(component.id);
						}
						return;
					}
					if (opcode == 1110) {
						local19 = intStack[--isp];
						if (component.modelSeqID != local19) {
							component.modelSeqID = local19;
							component.anInt4247 = 0;
							component.anInt4316 = 1;
							component.anInt4283 = 0;
							Static200.redraw(component);
						}
						if (component.createdComponentID == -1) {
							Static250.method4342(component.id);
						}
						return;
					}
					if (opcode == 1111) {
						component.modelOrthographic = intStack[--isp] == 1;
						Static200.redraw(component);
						return;
					}
					if (opcode == 1112) {
						local1101 = stringStack[--anInt3652];
						if (!local1101.equals(component.text)) {
							component.text = local1101;
							Static200.redraw(component);
						}
						if (component.createdComponentID == -1) {
							Static179.method3363(component.id);
						}
						return;
					}
					if (opcode == 1113) {
						component.textFont = intStack[--isp];
						Static200.redraw(component);
						if (component.createdComponentID == -1) {
							Static129.method2439(component.id);
						}
						return;
					}
					if (opcode == 1114) {
						isp -= 3;
						component.anInt4298 = intStack[isp];
						component.anInt4293 = intStack[isp + 1];
						component.textLineHeight = intStack[isp + 2];
						Static200.redraw(component);
						return;
					}
					if (opcode == 1115) {
						component.textShadow = intStack[--isp] == 1;
						Static200.redraw(component);
						return;
					}
					if (opcode == 1116) {
						component.outline = intStack[--isp];
						Static200.redraw(component);
						return;
					}
					if (opcode == 1117) {
						component.graphicShadow = intStack[--isp];
						Static200.redraw(component);
						return;
					}
					if (opcode == 1118) {
						component.horizontalFlip = intStack[--isp] == 1;
						Static200.redraw(component);
						return;
					}
					if (opcode == 1119) {
						component.verticalFlip = intStack[--isp] == 1;
						Static200.redraw(component);
						return;
					}
					if (opcode == 1120) {
						isp -= 2;
						component.scrollWidth = intStack[isp];
						component.scrollHeight = intStack[isp + 1];
						Static200.redraw(component);
						if (component.type == 0) {
							Static85.method1911(false, component);
						}
						return;
					}
					if (opcode == 1121) {
						isp -= 2;
						component.aShort62 = (short) intStack[isp];
						component.aShort61 = (short) intStack[isp + 1];
						Static200.redraw(component);
						return;
					}
					if (opcode == 1122) {
						component.alpha = intStack[--isp] == 1;
						Static200.redraw(component);
						return;
					}
					if (opcode == 1123) {
						component.modelZoom = intStack[--isp];
						Static200.redraw(component);
						if (component.createdComponentID == -1) {
							Static173.method3321(component.id);
						}
						return;
					}
					if (opcode == 1124) {
						local19 = intStack[--isp];
						component.lineDirection = local19 == 1;
						Static200.redraw(component);
						return;
					}
					if (opcode == 1125) {
						isp -= 2;
						component.anInt4307 = intStack[isp];
						component.anInt4253 = intStack[isp + 1];
						Static200.redraw(component);
						return;
					}
				} else if (opcode >= 1200 && opcode < 1300 || opcode >= 2200 && opcode < 2300) {
					if (opcode >= 2000) {
						opcode -= 1000;
						component = Static6.method140(intStack[--isp]);
					} else {
						component = arg1 ? aComponent_10 : aComponent_9;
					}
					Static200.redraw(component);
					if (opcode == 1200 || opcode == 1205 || opcode == 1208 || opcode == 1209 || opcode == 1212 || opcode == 1213) {
						isp -= 2;
						local19 = intStack[isp];
						local25 = intStack[isp + 1];
						if (component.createdComponentID == -1) {
							Static318.method5427(component.id);
							Static173.method3321(component.id);
							Static86.method1934(component.id);
						}
						if (local19 == -1) {
							component.modelType = 1;
							component.modelID = -1;
							component.anInt4300 = -1;
							return;
						}
						component.anInt4300 = local19;
						component.anInt4240 = local25;
						if (opcode == 1208 || opcode == 1209) {
							component.aBoolean280 = true;
						} else {
							component.aBoolean280 = false;
						}
						@Pc(1537) ObjType local1537 = Static313.aClass107_2.get(local19);
						component.anInt4320 = local1537.anInt5245;
						component.anInt4274 = local1537.anInt5215;
						component.anInt4319 = local1537.anInt5249;
						component.anInt4278 = local1537.anInt5252;
						component.anInt4250 = local1537.anInt5232;
						component.modelZoom = local1537.zoom2d;
						if (opcode == 1205 || opcode == 1209) {
							component.anInt4306 = 0;
						} else if (opcode == 1212 || opcode == 1213) {
							component.anInt4306 = 1;
						} else {
							component.anInt4306 = 2;
						}
						if (component.anInt4251 > 0) {
							component.modelZoom = component.modelZoom * 32 / component.anInt4251;
							return;
						}
						if (component.anInt4294 > 0) {
							component.modelZoom = component.modelZoom * 32 / component.anInt4294;
						}
						return;
					}
					if (opcode == 1201) {
						component.modelType = 2;
						component.modelID = intStack[--isp];
						if (component.createdComponentID == -1) {
							Static17.method4212(component.id);
						}
						return;
					}
					if (opcode == 1202) {
						component.modelType = 3;
						component.modelID = -1;
						if (component.createdComponentID == -1) {
							Static17.method4212(component.id);
						}
						return;
					}
					if (opcode == 1203) {
						component.modelType = 6;
						component.modelID = intStack[--isp];
						if (component.createdComponentID == -1) {
							Static17.method4212(component.id);
						}
						return;
					}
					if (opcode == 1204) {
						component.modelType = 5;
						component.modelID = intStack[--isp];
						if (component.createdComponentID == -1) {
							Static17.method4212(component.id);
						}
						return;
					}
					if (opcode == 1206) {
						isp -= 4;
						component.anInt4280 = intStack[isp];
						component.anInt4267 = intStack[isp + 1];
						component.anInt4235 = intStack[isp + 2];
						component.anInt4242 = intStack[isp + 3];
						Static200.redraw(component);
						return;
					}
					if (opcode == 1207) {
						isp -= 2;
						component.anInt4270 = intStack[isp];
						component.anInt4302 = intStack[isp + 1];
						Static200.redraw(component);
						return;
					}
					if (opcode == 1210) {
						isp -= 4;
						component.modelID = intStack[isp];
						component.anInt4236 = intStack[isp + 1];
						if (intStack[isp + 2] == 1) {
							component.modelType = 9;
						} else {
							component.modelType = 8;
						}
						if (intStack[isp + 3] == 1) {
							component.aBoolean280 = true;
						} else {
							component.aBoolean280 = false;
						}
						if (component.createdComponentID == -1) {
							Static17.method4212(component.id);
						}
						return;
					}
					if (opcode == 1211) {
						component.modelType = 5;
						component.modelID = Static234.anInt4226;
						component.anInt4236 = 0;
						if (component.createdComponentID == -1) {
							Static17.method4212(component.id);
						}
						return;
					}
				} else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300 && opcode < 2400) {
					if (opcode >= 2000) {
						opcode -= 1000;
						component = Static6.method140(intStack[--isp]);
					} else {
						component = arg1 ? aComponent_10 : aComponent_9;
					}
					if (opcode == 1300) {
						local19 = intStack[--isp] - 1;
						if (local19 >= 0 && local19 <= 9) {
							component.method4102(local19, stringStack[--anInt3652]);
							return;
						}
						anInt3652--;
						return;
					}
					if (opcode == 1301) {
						isp -= 2;
						local19 = intStack[isp];
						local25 = intStack[isp + 1];
						component.aComponent_12 = Static207.method3704(local19, local25);
						return;
					}
					if (opcode == 1302) {
						local19 = intStack[--isp];
						if (local19 != Static164.anInt3138 && local19 != Static158.anInt2895 && local19 != Static83.anInt1838) {
							return;
						}
						component.anInt4285 = local19;
						return;
					}
					if (opcode == 1303) {
						component.anInt4239 = intStack[--isp];
						return;
					}
					if (opcode == 1304) {
						component.anInt4271 = intStack[--isp];
						return;
					}
					if (opcode == 1305) {
						component.opBase = stringStack[--anInt3652];
						return;
					}
					if (opcode == 1306) {
						component.aString44 = stringStack[--anInt3652];
						return;
					}
					if (opcode == 1307) {
						component.ops = null;
						return;
					}
					if (opcode == 1308) {
						component.anInt4286 = intStack[--isp];
						component.anInt4238 = intStack[--isp];
						return;
					}
					if (opcode == 1309) {
						local19 = intStack[--isp];
						local25 = intStack[--isp];
						if (local25 >= 1 && local25 <= 10) {
							component.method4109(local19, local25 - 1);
						}
						return;
					}
					if (opcode == 1310) {
						component.pausText = stringStack[--anInt3652];
						return;
					}
					if (opcode == 1311) {
						component.anInt4260 = intStack[--isp];
						return;
					}
				} else {
					@Pc(2194) int local2194;
					if (opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
						if (opcode >= 2000) {
							opcode -= 1000;
							component = Static6.method140(intStack[--isp]);
						} else {
							component = arg1 ? aComponent_10 : aComponent_9;
						}
						local1101 = stringStack[--anInt3652];
						@Pc(2137) int[] local2137 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = intStack[--isp];
							if (local353 > 0) {
								local2137 = new int[local353];
								while (local353-- > 0) {
									local2137[local353] = intStack[--isp];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2189) Object[] local2189 = new Object[local1101.length() + 1];
						for (local2194 = local2189.length - 1; local2194 >= 1; local2194--) {
							if (local1101.charAt(local2194 - 1) == 's') {
								local2189[local2194] = stringStack[--anInt3652];
							} else {
								local2189[local2194] = Integer.valueOf(intStack[--isp]);
							}
						}
						local56 = intStack[--isp];
						if (local56 == -1) {
							local2189 = null;
						} else {
							local2189[0] = Integer.valueOf(local56);
						}
						if (opcode == 1400) {
							component.anObjectArray14 = local2189;
						} else if (opcode == 1401) {
							component.anObjectArray16 = local2189;
						} else if (opcode == 1402) {
							component.anObjectArray30 = local2189;
						} else if (opcode == 1403) {
							component.anObjectArray13 = local2189;
						} else if (opcode == 1404) {
							component.anObjectArray9 = local2189;
						} else if (opcode == 1405) {
							component.anObjectArray31 = local2189;
						} else if (opcode == 1406) {
							component.anObjectArray32 = local2189;
						} else if (opcode == 1407) {
							component.anObjectArray10 = local2189;
							component.anIntArray273 = local2137;
						} else if (opcode == 1408) {
							component.anObjectArray23 = local2189;
						} else if (opcode == 1409) {
							component.anObjectArray27 = local2189;
						} else if (opcode == 1410) {
							component.anObjectArray8 = local2189;
						} else if (opcode == 1411) {
							component.anObjectArray28 = local2189;
						} else if (opcode == 1412) {
							component.anObjectArray12 = local2189;
						} else if (opcode == 1414) {
							component.anObjectArray29 = local2189;
							component.anIntArray281 = local2137;
						} else if (opcode == 1415) {
							component.anObjectArray5 = local2189;
							component.anIntArray274 = local2137;
						} else if (opcode == 1416) {
							component.anObjectArray15 = local2189;
						} else if (opcode == 1417) {
							component.anObjectArray21 = local2189;
						} else if (opcode == 1418) {
							component.anObjectArray26 = local2189;
						} else if (opcode == 1419) {
							component.anObjectArray17 = local2189;
						} else if (opcode == 1420) {
							component.anObjectArray25 = local2189;
						} else if (opcode == 1421) {
							component.anObjectArray18 = local2189;
						} else if (opcode == 1422) {
							component.anObjectArray24 = local2189;
						} else if (opcode == 1423) {
							component.anObjectArray34 = local2189;
						} else if (opcode == 1424) {
							component.anObjectArray11 = local2189;
						} else if (opcode == 1425) {
							component.anObjectArray33 = local2189;
						} else if (opcode == 1426) {
							component.anObjectArray20 = local2189;
						} else if (opcode == 1427) {
							component.anObjectArray6 = local2189;
						} else if (opcode == 1428) {
							component.anObjectArray19 = local2189;
							component.anIntArray278 = local2137;
						} else if (opcode == 1429) {
							component.anObjectArray7 = local2189;
							component.anIntArray277 = local2137;
						}
						component.aBoolean296 = true;
						return;
					}
					if (opcode < 1600) {
						component = arg1 ? aComponent_10 : aComponent_9;
						if (opcode == 1500) {
							intStack[isp++] = component.anInt4305;
							return;
						}
						if (opcode == 1501) {
							intStack[isp++] = component.anInt4254;
							return;
						}
						if (opcode == 1502) {
							intStack[isp++] = component.width;
							return;
						}
						if (opcode == 1503) {
							intStack[isp++] = component.height;
							return;
						}
						if (opcode == 1504) {
							intStack[isp++] = component.hidden ? 1 : 0;
							return;
						}
						if (opcode == 1505) {
							intStack[isp++] = component.layer;
							return;
						}
					} else if (opcode < 1700) {
						component = arg1 ? aComponent_10 : aComponent_9;
						if (opcode == 1600) {
							intStack[isp++] = component.scrollX;
							return;
						}
						if (opcode == 1601) {
							intStack[isp++] = component.scrollY;
							return;
						}
						if (opcode == 1602) {
							stringStack[anInt3652++] = component.text;
							return;
						}
						if (opcode == 1603) {
							intStack[isp++] = component.scrollWidth;
							return;
						}
						if (opcode == 1604) {
							intStack[isp++] = component.scrollHeight;
							return;
						}
						if (opcode == 1605) {
							intStack[isp++] = component.modelZoom;
							return;
						}
						if (opcode == 1606) {
							intStack[isp++] = component.anInt4320;
							return;
						}
						if (opcode == 1607) {
							intStack[isp++] = component.anInt4319;
							return;
						}
						if (opcode == 1608) {
							intStack[isp++] = component.anInt4274;
							return;
						}
						if (opcode == 1609) {
							intStack[isp++] = component.transparency;
							return;
						}
						if (opcode == 1610) {
							intStack[isp++] = component.anInt4278;
							return;
						}
						if (opcode == 1611) {
							intStack[isp++] = component.anInt4250;
							return;
						}
						if (opcode == 1612) {
							intStack[isp++] = component.graphic;
							return;
						}
					} else if (opcode < 1800) {
						component = arg1 ? aComponent_10 : aComponent_9;
						if (opcode == 1700) {
							intStack[isp++] = component.anInt4300;
							return;
						}
						if (opcode == 1701) {
							if (component.anInt4300 != -1) {
								intStack[isp++] = component.anInt4240;
								return;
							}
							intStack[isp++] = 0;
							return;
						}
						if (opcode == 1702) {
							intStack[isp++] = component.createdComponentID;
							return;
						}
					} else if (opcode < 1900) {
						component = arg1 ? aComponent_10 : aComponent_9;
						if (opcode == 1800) {
							intStack[isp++] = Static45.method1404(component).method1852();
							return;
						}
						if (opcode == 1801) {
							local19 = intStack[--isp];
							local19--;
							if (component.ops != null && local19 < component.ops.length && component.ops[local19] != null) {
								stringStack[anInt3652++] = component.ops[local19];
								return;
							}
							stringStack[anInt3652++] = "";
							return;
						}
						if (opcode == 1802) {
							if (component.opBase == null) {
								stringStack[anInt3652++] = "";
								return;
							}
							stringStack[anInt3652++] = component.opBase;
							return;
						}
					} else if (opcode < 2600) {
						component = Static6.method140(intStack[--isp]);
						if (opcode == 2500) {
							intStack[isp++] = component.anInt4305;
							return;
						}
						if (opcode == 2501) {
							intStack[isp++] = component.anInt4254;
							return;
						}
						if (opcode == 2502) {
							intStack[isp++] = component.width;
							return;
						}
						if (opcode == 2503) {
							intStack[isp++] = component.height;
							return;
						}
						if (opcode == 2504) {
							intStack[isp++] = component.hidden ? 1 : 0;
							return;
						}
						if (opcode == 2505) {
							intStack[isp++] = component.layer;
							return;
						}
					} else if (opcode < 2700) {
						component = Static6.method140(intStack[--isp]);
						if (opcode == 2600) {
							intStack[isp++] = component.scrollX;
							return;
						}
						if (opcode == 2601) {
							intStack[isp++] = component.scrollY;
							return;
						}
						if (opcode == 2602) {
							stringStack[anInt3652++] = component.text;
							return;
						}
						if (opcode == 2603) {
							intStack[isp++] = component.scrollWidth;
							return;
						}
						if (opcode == 2604) {
							intStack[isp++] = component.scrollHeight;
							return;
						}
						if (opcode == 2605) {
							intStack[isp++] = component.modelZoom;
							return;
						}
						if (opcode == 2606) {
							intStack[isp++] = component.anInt4320;
							return;
						}
						if (opcode == 2607) {
							intStack[isp++] = component.anInt4319;
							return;
						}
						if (opcode == 2608) {
							intStack[isp++] = component.anInt4274;
							return;
						}
						if (opcode == 2609) {
							intStack[isp++] = component.transparency;
							return;
						}
						if (opcode == 2610) {
							intStack[isp++] = component.anInt4278;
							return;
						}
						if (opcode == 2611) {
							intStack[isp++] = component.anInt4250;
							return;
						}
						if (opcode == 2612) {
							intStack[isp++] = component.graphic;
							return;
						}
					} else {
						@Pc(3356) Class2_Sub7 local3356;
						@Pc(3254) Class2_Sub7 local3254;
						if (opcode < 2800) {
							if (opcode == 2700) {
								component = Static6.method140(intStack[--isp]);
								intStack[isp++] = component.anInt4300;
								return;
							}
							if (opcode == 2701) {
								component = Static6.method140(intStack[--isp]);
								if (component.anInt4300 != -1) {
									intStack[isp++] = component.anInt4240;
									return;
								}
								intStack[isp++] = 0;
								return;
							}
							if (opcode == 2702) {
								local13 = intStack[--isp];
								local3254 = (Class2_Sub7) Static329.aClass4_130.get((long) local13);
								if (local3254 != null) {
									intStack[isp++] = 1;
									return;
								}
								intStack[isp++] = 0;
								return;
							}
							if (opcode == 2703) {
								component = Static6.method140(intStack[--isp]);
								if (component.aComponentArray2 == null) {
									intStack[isp++] = 0;
									return;
								}
								local19 = component.aComponentArray2.length;
								for (local25 = 0; local25 < component.aComponentArray2.length; local25++) {
									if (component.aComponentArray2[local25] == null) {
										local19 = local25;
										break;
									}
								}
								intStack[isp++] = local19;
								return;
							}
							if (opcode == 2704 || opcode == 2705) {
								isp -= 2;
								local13 = intStack[isp];
								local19 = intStack[isp + 1];
								local3356 = (Class2_Sub7) Static329.aClass4_130.get((long) local13);
								if (local3356 != null && local3356.anInt1370 == local19) {
									intStack[isp++] = 1;
									return;
								} else {
									intStack[isp++] = 0;
									return;
								}
							}
						} else if (opcode < 2900) {
							component = Static6.method140(intStack[--isp]);
							if (opcode == 2800) {
								intStack[isp++] = Static45.method1404(component).method1852();
								return;
							}
							if (opcode == 2801) {
								local19 = intStack[--isp];
								local19--;
								if (component.ops != null && local19 < component.ops.length && component.ops[local19] != null) {
									stringStack[anInt3652++] = component.ops[local19];
									return;
								}
								stringStack[anInt3652++] = "";
								return;
							}
							if (opcode == 2802) {
								if (component.opBase == null) {
									stringStack[anInt3652++] = "";
									return;
								}
								stringStack[anInt3652++] = component.opBase;
								return;
							}
						} else {
							@Pc(3493) String local3493;
							if (opcode < 3200) {
								if (opcode == 3100) {
									local3493 = stringStack[--anInt3652];
									Static207.method3699(local3493);
									return;
								}
								if (opcode == 3101) {
									isp -= 2;
									Static337.method5706(Static17.self, intStack[isp + 1], intStack[isp]);
									return;
								}
								if (opcode == 3103) {
									Static82.method1904();
									return;
								}
								if (opcode == 3104) {
									local3493 = stringStack[--anInt3652];
									local19 = 0;
									if (Static132.method2485(local3493)) {
										local19 = Static146.method2698(local3493);
									}
									Static91.method1960(Static363.aClass145_239);
									Static257.aClass2_Sub4_Sub2_4.p4(local19);
									return;
								}
								if (opcode == 3105) {
									local3493 = stringStack[--anInt3652];
									Static91.method1960(Static49.aClass145_44);
									Static257.aClass2_Sub4_Sub2_4.p1(local3493.length() + 1);
									Static257.aClass2_Sub4_Sub2_4.pjstr(local3493);
									return;
								}
								if (opcode == 3106) {
									local3493 = stringStack[--anInt3652];
									Static91.method1960(Static221.aClass145_164);
									Static257.aClass2_Sub4_Sub2_4.p1(local3493.length() + 1);
									Static257.aClass2_Sub4_Sub2_4.pjstr(local3493);
									return;
								}
								if (opcode == 3107) {
									local13 = intStack[--isp];
									local1101 = stringStack[--anInt3652];
									Static341.method5768(local13, local1101);
									return;
								}
								if (opcode == 3108) {
									isp -= 3;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local25 = intStack[isp + 2];
									local35 = Static6.method140(local25);
									Static380.method6334(local13, local19, local35);
									return;
								}
								if (opcode == 3109) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local210 = arg1 ? aComponent_10 : aComponent_9;
									Static380.method6334(local13, local19, local210);
									return;
								}
								if (opcode == 3110) {
									local13 = intStack[--isp];
									Static91.method1960(Static190.aClass145_138);
									Static257.aClass2_Sub4_Sub2_4.p2(local13);
									return;
								}
								if (opcode == 3111) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local3356 = (Class2_Sub7) Static329.aClass4_130.get((long) local13);
									if (local3356 != null) {
										Static276.method4654(true, local3356, local3356.anInt1370 != local19);
									}
									Static382.method6364(local13, 3, true, local19);
									return;
								}
								if (opcode == 3112) {
									isp--;
									local13 = intStack[isp];
									local3254 = (Class2_Sub7) Static329.aClass4_130.get((long) local13);
									if (local3254 != null && local3254.anInt1373 == 3) {
										Static276.method4654(true, local3254, true);
									}
									return;
								}
							} else if (opcode < 3300) {
								if (opcode == 3200) {
									isp -= 3;
									Static29.method939(intStack[isp + 1], 255, intStack[isp + 2], intStack[isp]);
									return;
								}
								if (opcode == 3201) {
									Static138.method2578(50, 255, intStack[--isp]);
									return;
								}
								if (opcode == 3202) {
									isp -= 2;
									Static175.method3323(intStack[isp], intStack[isp + 1], 255);
									return;
								}
								if (opcode == 3203) {
									isp -= 4;
									Static29.method939(intStack[isp + 1], intStack[isp + 3], intStack[isp + 2], intStack[isp]);
									return;
								}
								if (opcode == 3204) {
									isp -= 3;
									Static138.method2578(intStack[isp + 2], intStack[isp + 1], intStack[isp]);
									return;
								}
								if (opcode == 3205) {
									isp -= 3;
									Static175.method3323(intStack[isp], intStack[isp + 1], intStack[isp + 2]);
									return;
								}
							} else if (opcode < 3400) {
								if (opcode == 3300) {
									intStack[isp++] = Static114.loop;
									return;
								}
								if (opcode == 3301) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Static41.method1305(false, local13, local19);
									return;
								}
								if (opcode == 3302) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Static243.method4237(local19, false, local13);
									return;
								}
								if (opcode == 3303) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Static192.method3505(local13, false, local19);
									return;
								}
								if (opcode == 3304) {
									local13 = intStack[--isp];
									intStack[isp++] = Static178.aClass51_3.method1706(local13).anInt2488;
									return;
								}
								if (opcode == 3305) {
									local13 = intStack[--isp];
									intStack[isp++] = Static268.anIntArray338[local13];
									return;
								}
								if (opcode == 3306) {
									local13 = intStack[--isp];
									intStack[isp++] = Static325.anIntArray414[local13];
									return;
								}
								if (opcode == 3307) {
									local13 = intStack[--isp];
									intStack[isp++] = Static80.anIntArray464[local13];
									return;
								}
								if (opcode == 3308) {
									@Pc(4136) byte local4136 = Static17.self.aByte78;
									local19 = (Static17.self.xFine >> 7) + Static164.originX;
									local25 = (Static17.self.zFine >> 7) + Static148.originZ;
									intStack[isp++] = (local4136 << 28) + (local19 << 14) + local25;
									return;
								}
								if (opcode == 3309) {
									local13 = intStack[--isp];
									intStack[isp++] = local13 >> 14 & 0x3FFF;
									return;
								}
								if (opcode == 3310) {
									local13 = intStack[--isp];
									intStack[isp++] = local13 >> 28;
									return;
								}
								if (opcode == 3311) {
									local13 = intStack[--isp];
									intStack[isp++] = local13 & 0x3FFF;
									return;
								}
								if (opcode == 3312) {
									intStack[isp++] = Static206.mapMembers ? 1 : 0;
									return;
								}
								if (opcode == 3313) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Static41.method1305(true, local13, local19);
									return;
								}
								if (opcode == 3314) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Static243.method4237(local19, true, local13);
									return;
								}
								if (opcode == 3315) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Static192.method3505(local13, true, local19);
									return;
								}
								if (opcode == 3316) {
									if (Static4.anInt90 >= 2) {
										intStack[isp++] = Static4.anInt90;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3317) {
									intStack[isp++] = Static151.anInt2773;
									return;
								}
								if (opcode == 3318) {
									intStack[isp++] = client.worldID;
									return;
								}
								if (opcode == 3321) {
									intStack[isp++] = Static96.anInt2002;
									return;
								}
								if (opcode == 3322) {
									intStack[isp++] = Static41.anInt1048;
									return;
								}
								if (opcode == 3323) {
									if (Static210.anInt3774 >= 5 && Static210.anInt3774 <= 9) {
										intStack[isp++] = 1;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3324) {
									if (Static210.anInt3774 >= 5 && Static210.anInt3774 <= 9) {
										intStack[isp++] = Static210.anInt3774;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3325) {
									intStack[isp++] = Static381.aBoolean482 ? 1 : 0;
									return;
								}
								if (opcode == 3326) {
									intStack[isp++] = Static17.self.combatLevel;
									return;
								}
								if (opcode == 3327) {
									intStack[isp++] = Static17.self.appearance.aBoolean220 ? 1 : 0;
									return;
								}
								if (opcode == 3328) {
									intStack[isp++] = Static56.aBoolean123 && !Static101.aBoolean159 ? 1 : 0;
									return;
								}
								if (opcode == 3329) {
									intStack[isp++] = Static109.aBoolean166 ? 1 : 0;
									return;
								}
								if (opcode == 3330) {
									local13 = intStack[--isp];
									intStack[isp++] = Static154.method2784(local13);
									return;
								}
								if (opcode == 3331) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Static165.method3149(local19, false, local13);
									return;
								}
								if (opcode == 3332) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Static165.method3149(local19, true, local13);
									return;
								}
								if (opcode == 3333) {
									intStack[isp++] = Static202.anInt3714;
									return;
								}
								if (opcode == 3335) {
									intStack[isp++] = client.language;
									return;
								}
								if (opcode == 3336) {
									isp -= 4;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local25 = intStack[isp + 2];
									local353 = intStack[isp + 3];
									local13 += local19 << 14;
									local13 += local25 << 28;
									local13 += local353;
									intStack[isp++] = local13;
									return;
								}
								if (opcode == 3337) {
									intStack[isp++] = Static165.anInt3149;
									return;
								}
								if (opcode == 3338) {
									intStack[isp++] = Static374.method6272();
									return;
								}
							} else if (opcode < 3500) {
								@Pc(4761) Class52 local4761;
								if (opcode == 3400) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local4761 = Static140.aClass109_1.method2779(local13);
									stringStack[anInt3652++] = local4761.method1775(local19);
									return;
								}
								if (opcode == 3408) {
									isp -= 4;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local25 = intStack[isp + 2];
									local353 = intStack[isp + 3];
									@Pc(4807) Class52 local4807 = Static140.aClass109_1.method2779(local25);
									if (local4807.aChar4 == local13 && local4807.aChar3 == local19) {
										if (local19 == 115) {
											stringStack[anInt3652++] = local4807.method1775(local353);
											return;
										}
										intStack[isp++] = local4807.method1766(local353);
										return;
									}
									throw new RuntimeException("C3408-1");
								}
								if (opcode == 3409) {
									isp -= 3;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local25 = intStack[isp + 2];
									if (local19 == -1) {
										throw new RuntimeException("C3409-2");
									}
									@Pc(4883) Class52 local4883 = Static140.aClass109_1.method2779(local19);
									if (local4883.aChar3 != local13) {
										throw new RuntimeException("C3409-1");
									}
									intStack[isp++] = local4883.method1771(local25) ? 1 : 0;
									return;
								}
								if (opcode == 3410) {
									local13 = intStack[--isp];
									local1101 = stringStack[--anInt3652];
									if (local13 == -1) {
										throw new RuntimeException("C3410-2");
									}
									local4761 = Static140.aClass109_1.method2779(local13);
									if (local4761.aChar3 != 's') {
										throw new RuntimeException("C3410-1");
									}
									intStack[isp++] = local4761.method1769(local1101) ? 1 : 0;
									return;
								}
								if (opcode == 3411) {
									local13 = intStack[--isp];
									@Pc(4981) Class52 local4981 = Static140.aClass109_1.method2779(local13);
									intStack[isp++] = local4981.aClass4_31.method83();
									return;
								}
							} else if (opcode < 3700) {
								if (opcode == 3600) {
									if (Static235.anInt3363 == 0) {
										intStack[isp++] = -2;
										return;
									}
									if (Static235.anInt3363 == 1) {
										intStack[isp++] = -1;
										return;
									}
									intStack[isp++] = Static384.anInt7178;
									return;
								}
								if (opcode == 3601) {
									local13 = intStack[--isp];
									if (Static235.anInt3363 == 2 && local13 < Static384.anInt7178) {
										stringStack[anInt3652++] = Static17.aStringArray43[local13];
										if (Static319.aStringArray54[local13] != null) {
											stringStack[anInt3652++] = Static319.aStringArray54[local13];
											return;
										}
										stringStack[anInt3652++] = "";
										return;
									}
									stringStack[anInt3652++] = "";
									stringStack[anInt3652++] = "";
									return;
								}
								if (opcode == 3602) {
									local13 = intStack[--isp];
									if (Static235.anInt3363 == 2 && local13 < Static384.anInt7178) {
										intStack[isp++] = Static265.anIntArray333[local13];
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3603) {
									local13 = intStack[--isp];
									if (Static235.anInt3363 == 2 && local13 < Static384.anInt7178) {
										intStack[isp++] = Static114.anIntArray148[local13];
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3604) {
									local3493 = stringStack[--anInt3652];
									local19 = intStack[--isp];
									Static171.method3255(local19, local3493);
									return;
								}
								if (opcode == 3605) {
									local3493 = stringStack[--anInt3652];
									Static61.method1669(local3493);
									return;
								}
								if (opcode == 3606) {
									local3493 = stringStack[--anInt3652];
									Static34.method4827(local3493);
									return;
								}
								if (opcode == 3607) {
									local3493 = stringStack[--anInt3652];
									Static309.method5278(local3493, false);
									return;
								}
								if (opcode == 3608) {
									local3493 = stringStack[--anInt3652];
									Static258.method4403(local3493);
									return;
								}
								if (opcode == 3609) {
									local3493 = stringStack[--anInt3652];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									intStack[isp++] = Static391.method6450(local3493) ? 1 : 0;
									return;
								}
								if (opcode == 3610) {
									local13 = intStack[--isp];
									if (Static235.anInt3363 == 2 && local13 < Static384.anInt7178) {
										stringStack[anInt3652++] = Static209.aStringArray32[local13];
										return;
									}
									stringStack[anInt3652++] = "";
									return;
								}
								if (opcode == 3611) {
									if (Static389.aString53 != null) {
										stringStack[anInt3652++] = Static330.method5656(Static389.aString53);
										return;
									}
									stringStack[anInt3652++] = "";
									return;
								}
								if (opcode == 3612) {
									if (Static389.aString53 != null) {
										intStack[isp++] = Static186.anInt3730;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3613) {
									local13 = intStack[--isp];
									if (Static389.aString53 != null && local13 < Static186.anInt3730) {
										stringStack[anInt3652++] = Static47.aClass214Array1[local13].aString58;
										return;
									}
									stringStack[anInt3652++] = "";
									return;
								}
								if (opcode == 3614) {
									local13 = intStack[--isp];
									if (Static389.aString53 != null && local13 < Static186.anInt3730) {
										intStack[isp++] = Static47.aClass214Array1[local13].anInt5978;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3615) {
									local13 = intStack[--isp];
									if (Static389.aString53 != null && local13 < Static186.anInt3730) {
										intStack[isp++] = Static47.aClass214Array1[local13].aByte65;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3616) {
									intStack[isp++] = Static265.aByte54;
									return;
								}
								if (opcode == 3617) {
									local3493 = stringStack[--anInt3652];
									Static163.method3101(local3493);
									return;
								}
								if (opcode == 3618) {
									intStack[isp++] = Static119.aByte25;
									return;
								}
								if (opcode == 3619) {
									local3493 = stringStack[--anInt3652];
									Static115.method3840(local3493);
									return;
								}
								if (opcode == 3620) {
									Static290.method5025();
									return;
								}
								if (opcode == 3621) {
									if (Static235.anInt3363 == 0) {
										intStack[isp++] = -1;
										return;
									}
									intStack[isp++] = Static301.anInt5700;
									return;
								}
								if (opcode == 3622) {
									local13 = intStack[--isp];
									if (Static235.anInt3363 != 0 && local13 < Static301.anInt5700) {
										stringStack[anInt3652++] = Static226.aStringArray35[local13];
										if (Static371.aStringArray66[local13] != null) {
											stringStack[anInt3652++] = Static371.aStringArray66[local13];
											return;
										}
										stringStack[anInt3652++] = "";
										return;
									}
									stringStack[anInt3652++] = "";
									stringStack[anInt3652++] = "";
									return;
								}
								if (opcode == 3623) {
									local3493 = stringStack[--anInt3652];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									intStack[isp++] = Static105.method2208(local3493) ? 1 : 0;
									return;
								}
								if (opcode == 3624) {
									local13 = intStack[--isp];
									if (Static47.aClass214Array1 != null && local13 < Static186.anInt3730 && Static47.aClass214Array1[local13].aString60.equalsIgnoreCase(Static17.self.aString41)) {
										intStack[isp++] = 1;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3625) {
									if (Static169.aString25 != null) {
										stringStack[anInt3652++] = Static169.aString25;
										return;
									}
									stringStack[anInt3652++] = "";
									return;
								}
								if (opcode == 3626) {
									local13 = intStack[--isp];
									if (Static389.aString53 != null && local13 < Static186.anInt3730) {
										stringStack[anInt3652++] = Static47.aClass214Array1[local13].aString61;
										return;
									}
									stringStack[anInt3652++] = "";
									return;
								}
								if (opcode == 3627) {
									local13 = intStack[--isp];
									if (Static235.anInt3363 == 2 && local13 >= 0 && local13 < Static384.anInt7178) {
										intStack[isp++] = Static302.aBooleanArray13[local13] ? 1 : 0;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3628) {
									local3493 = stringStack[--anInt3652];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									intStack[isp++] = Static117.method2372(local3493);
									return;
								}
								if (opcode == 3629) {
									intStack[isp++] = Static320.anInt6007;
									return;
								}
								if (opcode == 3630) {
									local3493 = stringStack[--anInt3652];
									Static309.method5278(local3493, true);
									return;
								}
								if (opcode == 3631) {
									local13 = intStack[--isp];
									intStack[isp++] = Static196.aBooleanArray31[local13] ? 1 : 0;
									return;
								}
								if (opcode == 3632) {
									local13 = intStack[--isp];
									if (Static389.aString53 != null && local13 < Static186.anInt3730) {
										stringStack[anInt3652++] = Static47.aClass214Array1[local13].aString60;
										return;
									}
									stringStack[anInt3652++] = "";
									return;
								}
								if (opcode == 3633) {
									local13 = intStack[--isp];
									if (Static235.anInt3363 != 0 && local13 < Static301.anInt5700) {
										stringStack[anInt3652++] = Static234.aStringArray39[local13];
										return;
									}
									stringStack[anInt3652++] = "";
									return;
								}
							} else if (opcode < 4000) {
								if (opcode == 3903) {
									local13 = intStack[--isp];
									intStack[isp++] = Static290.aClass187Array1[local13].method4682();
									return;
								}
								if (opcode == 3904) {
									local13 = intStack[--isp];
									intStack[isp++] = Static290.aClass187Array1[local13].anInt5105;
									return;
								}
								if (opcode == 3905) {
									local13 = intStack[--isp];
									intStack[isp++] = Static290.aClass187Array1[local13].anInt5108;
									return;
								}
								if (opcode == 3906) {
									local13 = intStack[--isp];
									intStack[isp++] = Static290.aClass187Array1[local13].anInt5111;
									return;
								}
								if (opcode == 3907) {
									local13 = intStack[--isp];
									intStack[isp++] = Static290.aClass187Array1[local13].anInt5106;
									return;
								}
								if (opcode == 3908) {
									local13 = intStack[--isp];
									intStack[isp++] = Static290.aClass187Array1[local13].anInt5114;
									return;
								}
								if (opcode == 3910) {
									local13 = intStack[--isp];
									local19 = Static290.aClass187Array1[local13].method4678();
									intStack[isp++] = local19 == 0 ? 1 : 0;
									return;
								}
								if (opcode == 3911) {
									local13 = intStack[--isp];
									local19 = Static290.aClass187Array1[local13].method4678();
									intStack[isp++] = local19 == 2 ? 1 : 0;
									return;
								}
								if (opcode == 3912) {
									local13 = intStack[--isp];
									local19 = Static290.aClass187Array1[local13].method4678();
									intStack[isp++] = local19 == 5 ? 1 : 0;
									return;
								}
								if (opcode == 3913) {
									local13 = intStack[--isp];
									local19 = Static290.aClass187Array1[local13].method4678();
									intStack[isp++] = local19 == 1 ? 1 : 0;
									return;
								}
							} else if (opcode < 4100) {
								if (opcode == 4000) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 + local19;
									return;
								}
								if (opcode == 4001) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 - local19;
									return;
								}
								if (opcode == 4002) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 * local19;
									return;
								}
								if (opcode == 4003) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 / local19;
									return;
								}
								if (opcode == 4004) {
									local13 = intStack[--isp];
									intStack[isp++] = (int) (Math.random() * (double) local13);
									return;
								}
								if (opcode == 4005) {
									local13 = intStack[--isp];
									intStack[isp++] = (int) (Math.random() * (double) (local13 + 1));
									return;
								}
								if (opcode == 4006) {
									isp -= 5;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local25 = intStack[isp + 2];
									local353 = intStack[isp + 3];
									local2194 = intStack[isp + 4];
									intStack[isp++] = local13 + (local19 - local13) * (local2194 - local25) / (local353 - local25);
									return;
								}
								@Pc(6491) long local6491;
								@Pc(6484) long local6484;
								if (opcode == 4007) {
									isp -= 2;
									local6484 = intStack[isp];
									local6491 = intStack[isp + 1];
									intStack[isp++] = (int) (local6484 + local6484 * local6491 / 100L);
									return;
								}
								if (opcode == 4008) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 | 0x1 << local19;
									return;
								}
								if (opcode == 4009) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 & -(0x1 << local19) - 1;
									return;
								}
								if (opcode == 4010) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
									return;
								}
								if (opcode == 4011) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 % local19;
									return;
								}
								if (opcode == 4012) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									if (local13 == 0) {
										intStack[isp++] = 0;
										return;
									}
									intStack[isp++] = (int) Math.pow((double) local13, (double) local19);
									return;
								}
								if (opcode == 4013) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									if (local13 == 0) {
										intStack[isp++] = 0;
										return;
									}
									if (local19 == 0) {
										intStack[isp++] = Integer.MAX_VALUE;
										return;
									}
									intStack[isp++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
									return;
								}
								if (opcode == 4014) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 & local19;
									return;
								}
								if (opcode == 4015) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 | local19;
									return;
								}
								if (opcode == 4016) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 < local19 ? local13 : local19;
									return;
								}
								if (opcode == 4017) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 > local19 ? local13 : local19;
									return;
								}
								if (opcode == 4018) {
									isp -= 3;
									local6484 = intStack[isp];
									local6491 = intStack[isp + 1];
									@Pc(6872) long local6872 = (long) intStack[isp + 2];
									intStack[isp++] = (int) (local6484 * local6872 / local6491);
									return;
								}
							} else if (opcode < 4200) {
								if (opcode == 4100) {
									local3493 = stringStack[--anInt3652];
									local19 = intStack[--isp];
									stringStack[anInt3652++] = local3493 + local19;
									return;
								}
								if (opcode == 4101) {
									anInt3652 -= 2;
									local3493 = stringStack[anInt3652];
									local1101 = stringStack[anInt3652 + 1];
									stringStack[anInt3652++] = local3493 + local1101;
									return;
								}
								if (opcode == 4102) {
									local3493 = stringStack[--anInt3652];
									local19 = intStack[--isp];
									stringStack[anInt3652++] = local3493 + Static320.method5461(local19);
									return;
								}
								if (opcode == 4103) {
									local3493 = stringStack[--anInt3652];
									stringStack[anInt3652++] = local3493.toLowerCase();
									return;
								}
								if (opcode == 4104) {
									stringStack[anInt3652++] = method3593(intStack[--isp]);
									return;
								}
								if (opcode == 4105) {
									anInt3652 -= 2;
									local3493 = stringStack[anInt3652];
									local1101 = stringStack[anInt3652 + 1];
									if (Static17.self.appearance != null && Static17.self.appearance.aBoolean220) {
										stringStack[anInt3652++] = local1101;
										return;
									}
									stringStack[anInt3652++] = local3493;
									return;
								}
								if (opcode == 4106) {
									local13 = intStack[--isp];
									stringStack[anInt3652++] = Integer.toString(local13);
									return;
								}
								if (opcode == 4107) {
									anInt3652 -= 2;
									intStack[isp++] = Static233.compare(stringStack[anInt3652 + 1], stringStack[anInt3652], client.language);
									return;
								}
								@Pc(7155) Class239 local7155;
								if (opcode == 4108) {
									local3493 = stringStack[--anInt3652];
									isp -= 2;
									local19 = intStack[isp];
									local25 = intStack[isp + 1];
									local7155 = Static101.method2165(local25, Static255.aJs5_64);
									intStack[isp++] = local7155.method6122(local3493, local19, Static124.aClass13Array27);
									return;
								}
								if (opcode == 4109) {
									local3493 = stringStack[--anInt3652];
									isp -= 2;
									local19 = intStack[isp];
									local25 = intStack[isp + 1];
									local7155 = Static101.method2165(local25, Static255.aJs5_64);
									intStack[isp++] = local7155.method6123(Static124.aClass13Array27, local3493, local19);
									return;
								}
								if (opcode == 4110) {
									anInt3652 -= 2;
									local3493 = stringStack[anInt3652];
									local1101 = stringStack[anInt3652 + 1];
									if (intStack[--isp] == 1) {
										stringStack[anInt3652++] = local3493;
										return;
									}
									stringStack[anInt3652++] = local1101;
									return;
								}
								if (opcode == 4111) {
									local3493 = stringStack[--anInt3652];
									stringStack[anInt3652++] = Static153.method2772(local3493);
									return;
								}
								if (opcode == 4112) {
									local3493 = stringStack[--anInt3652];
									local19 = intStack[--isp];
									if (local19 == -1) {
										throw new RuntimeException("null char");
									}
									stringStack[anInt3652++] = local3493 + (char) local19;
									return;
								}
								if (opcode == 4113) {
									local13 = intStack[--isp];
									intStack[isp++] = Static146.method2697((char) local13) ? 1 : 0;
									return;
								}
								if (opcode == 4114) {
									local13 = intStack[--isp];
									intStack[isp++] = Static89.method1939((char) local13) ? 1 : 0;
									return;
								}
								if (opcode == 4115) {
									local13 = intStack[--isp];
									intStack[isp++] = Static35.method1103((char) local13) ? 1 : 0;
									return;
								}
								if (opcode == 4116) {
									local13 = intStack[--isp];
									intStack[isp++] = Static328.method5597((char) local13) ? 1 : 0;
									return;
								}
								if (opcode == 4117) {
									local3493 = stringStack[--anInt3652];
									if (local3493 != null) {
										intStack[isp++] = local3493.length();
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 4118) {
									local3493 = stringStack[--anInt3652];
									isp -= 2;
									local19 = intStack[isp];
									local25 = intStack[isp + 1];
									stringStack[anInt3652++] = local3493.substring(local19, local25);
									return;
								}
								if (opcode == 4119) {
									local3493 = stringStack[--anInt3652];
									@Pc(7518) StringBuffer local7518 = new StringBuffer(local3493.length());
									@Pc(7520) boolean local7520 = false;
									for (local353 = 0; local353 < local3493.length(); local353++) {
										@Pc(7527) char local7527 = local3493.charAt(local353);
										if (local7527 == '<') {
											local7520 = true;
										} else if (local7527 == '>') {
											local7520 = false;
										} else if (!local7520) {
											local7518.append(local7527);
										}
									}
									stringStack[anInt3652++] = local7518.toString();
									return;
								}
								if (opcode == 4120) {
									local3493 = stringStack[--anInt3652];
									isp -= 2;
									local19 = intStack[isp];
									local25 = intStack[isp + 1];
									intStack[isp++] = local3493.indexOf(local19, local25);
									return;
								}
								if (opcode == 4121) {
									anInt3652 -= 2;
									local3493 = stringStack[anInt3652];
									local1101 = stringStack[anInt3652 + 1];
									local25 = intStack[--isp];
									intStack[isp++] = local3493.indexOf(local1101, local25);
									return;
								}
								if (opcode == 4122) {
									local13 = intStack[--isp];
									intStack[isp++] = Character.toLowerCase((char) local13);
									return;
								}
								if (opcode == 4123) {
									local13 = intStack[--isp];
									intStack[isp++] = Character.toUpperCase((char) local13);
									return;
								}
								if (opcode == 4124) {
									local412 = intStack[--isp] != 0;
									local19 = intStack[--isp];
									stringStack[anInt3652++] = Static172.method3288((long) local19, client.language, local412, 0);
									return;
								}
								if (opcode == 4125) {
									local3493 = stringStack[--anInt3652];
									local19 = intStack[--isp];
									@Pc(7741) Class239 local7741 = Static101.method2165(local19, Static255.aJs5_64);
									intStack[isp++] = local7741.method6126(Static124.aClass13Array27, local3493);
									return;
								}
							} else {
								@Pc(8083) Class240 local8083;
								if (opcode < 4300) {
									if (opcode == 4200) {
										local13 = intStack[--isp];
										stringStack[anInt3652++] = Static313.aClass107_2.get(local13).name;
										return;
									}
									@Pc(7803) ObjType local7803;
									if (opcode == 4201) {
										isp -= 2;
										local13 = intStack[isp];
										local19 = intStack[isp + 1];
										local7803 = Static313.aClass107_2.get(local13);
										if (local19 >= 1 && local19 <= 5 && local7803.aStringArray50[local19 - 1] != null) {
											stringStack[anInt3652++] = local7803.aStringArray50[local19 - 1];
											return;
										}
										stringStack[anInt3652++] = "";
										return;
									}
									if (opcode == 4202) {
										isp -= 2;
										local13 = intStack[isp];
										local19 = intStack[isp + 1];
										local7803 = Static313.aClass107_2.get(local13);
										if (local19 >= 1 && local19 <= 5 && local7803.iOps[local19 - 1] != null) {
											stringStack[anInt3652++] = local7803.iOps[local19 - 1];
											return;
										}
										stringStack[anInt3652++] = "";
										return;
									}
									if (opcode == 4203) {
										local13 = intStack[--isp];
										intStack[isp++] = Static313.aClass107_2.get(local13).cost;
										return;
									}
									if (opcode == 4204) {
										local13 = intStack[--isp];
										intStack[isp++] = Static313.aClass107_2.get(local13).stackable == 1 ? 1 : 0;
										return;
									}
									@Pc(7966) ObjType local7966;
									if (opcode == 4205) {
										local13 = intStack[--isp];
										local7966 = Static313.aClass107_2.get(local13);
										if (local7966.certificateTemplate == -1 && local7966.certificateLink >= 0) {
											intStack[isp++] = local7966.certificateLink;
											return;
										}
										intStack[isp++] = local13;
										return;
									}
									if (opcode == 4206) {
										local13 = intStack[--isp];
										local7966 = Static313.aClass107_2.get(local13);
										if (local7966.certificateTemplate >= 0 && local7966.certificateLink >= 0) {
											intStack[isp++] = local7966.certificateLink;
											return;
										}
										intStack[isp++] = local13;
										return;
									}
									if (opcode == 4207) {
										local13 = intStack[--isp];
										intStack[isp++] = Static313.aClass107_2.get(local13).members ? 1 : 0;
										return;
									}
									if (opcode == 4208) {
										isp -= 2;
										local13 = intStack[isp];
										local19 = intStack[isp + 1];
										local8083 = Static363.aClass18_2.method565(local19);
										if (local8083.method6262()) {
											stringStack[anInt3652++] = Static313.aClass107_2.get(local13).method4772(local8083.aString69, local19);
											return;
										}
										intStack[isp++] = Static313.aClass107_2.get(local13).method4771(local8083.anInt7023, local19);
										return;
									}
									if (opcode == 4209) {
										isp -= 2;
										local13 = intStack[isp];
										local19 = intStack[isp + 1] - 1;
										local7803 = Static313.aClass107_2.get(local13);
										if (local7803.anInt5244 == local19) {
											intStack[isp++] = local7803.anInt5204;
											return;
										}
										if (local7803.anInt5221 == local19) {
											intStack[isp++] = local7803.anInt5240;
											return;
										}
										intStack[isp++] = -1;
										return;
									}
									if (opcode == 4210) {
										local3493 = stringStack[--anInt3652];
										local19 = intStack[--isp];
										Static131.findObjs(local3493, local19 == 1);
										intStack[isp++] = Static328.size;
										return;
									}
									if (opcode == 4211) {
										if (Static177.results != null && Static12.index < Static328.size) {
											intStack[isp++] = Static177.results[Static12.index++] & 0xFFFF;
											return;
										}
										intStack[isp++] = -1;
										return;
									}
									if (opcode == 4212) {
										Static12.index = 0;
										return;
									}
								} else if (opcode < 4400) {
									if (opcode == 4300) {
										isp -= 2;
										local13 = intStack[isp];
										local19 = intStack[isp + 1];
										local8083 = Static363.aClass18_2.method565(local19);
										if (local8083.method6262()) {
											stringStack[anInt3652++] = Static6.aClass219_1.get(local13).method2090(local8083.aString69, local19);
											return;
										}
										intStack[isp++] = Static6.aClass219_1.get(local13).method2098(local8083.anInt7023, local19);
										return;
									}
								} else if (opcode < 4500) {
									if (opcode == 4400) {
										isp -= 2;
										local13 = intStack[isp];
										local19 = intStack[isp + 1];
										local8083 = Static363.aClass18_2.method565(local19);
										if (local8083.method6262()) {
											stringStack[anInt3652++] = Static359.aClass202_4.method5162(local13).method1520(local8083.aString69, local19);
											return;
										}
										intStack[isp++] = Static359.aClass202_4.method5162(local13).method1532(local8083.anInt7023, local19);
										return;
									}
								} else if (opcode < 4600) {
									if (opcode == 4500) {
										isp -= 2;
										local13 = intStack[isp];
										local19 = intStack[isp + 1];
										local8083 = Static363.aClass18_2.method565(local19);
										if (local8083.method6262()) {
											stringStack[anInt3652++] = Static367.aClass132_1.method3470(local13).method1346(local19, local8083.aString69);
											return;
										}
										intStack[isp++] = Static367.aClass132_1.method3470(local13).method1343(local19, local8083.anInt7023);
										return;
									}
								} else if (opcode < 4700 && opcode == 4600) {
									local13 = intStack[--isp];
									@Pc(8467) BasType local8467 = Static59.aClass7_1.method245(local13);
									if (local8467.anIntArray426 != null && local8467.anIntArray426.length > 0) {
										local25 = 0;
										local353 = local8467.anIntArray427[0];
										for (local2194 = 1; local2194 < local8467.anIntArray426.length; local2194++) {
											if (local8467.anIntArray427[local2194] > local353) {
												local25 = local2194;
												local353 = local8467.anIntArray427[local2194];
											}
										}
										intStack[isp++] = local8467.anIntArray426[local25];
										return;
									}
									intStack[isp++] = local8467.readySeqID;
									return;
								}
							}
						}
					}
				}
			} else {
				if (opcode >= 2000) {
					opcode -= 1000;
					component = Static6.method140(intStack[--isp]);
				} else {
					component = arg1 ? aComponent_10 : aComponent_9;
				}
				if (opcode == 1000) {
					isp -= 4;
					component.anInt4241 = intStack[isp];
					component.anInt4249 = intStack[isp + 1];
					local19 = intStack[isp + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = intStack[isp + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					component.aByte45 = (byte) local19;
					component.aByte46 = (byte) local25;
					Static200.redraw(component);
					Static58.method1624(component);
					if (component.createdComponentID == -1) {
						Static139.method2585(component.id);
					}
					return;
				}
				if (opcode == 1001) {
					isp -= 4;
					component.anInt4294 = intStack[isp];
					component.anInt4289 = intStack[isp + 1];
					component.anInt4251 = 0;
					component.anInt4269 = 0;
					local19 = intStack[isp + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = intStack[isp + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					component.widthMode = (byte) local19;
					component.heightMode = (byte) local25;
					Static200.redraw(component);
					Static58.method1624(component);
					if (component.type == 0) {
						Static85.method1911(false, component);
					}
					return;
				}
				if (opcode == 1003) {
					@Pc(620) boolean local620 = intStack[--isp] == 1;
					if (component.hidden != local620) {
						component.hidden = local620;
						Static200.redraw(component);
					}
					if (component.createdComponentID == -1) {
						Static216.method3777(component.id);
					}
					return;
				}
				if (opcode == 1004) {
					isp -= 2;
					component.anInt4243 = intStack[isp];
					component.anInt4291 = intStack[isp + 1];
					Static200.redraw(component);
					Static58.method1624(component);
					if (component.type == 0) {
						Static85.method1911(false, component);
					}
					return;
				}
				if (opcode == 1005) {
					component.noClickThrough = intStack[--isp] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!bc;II)V")
	public static void method3595(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub2_Sub11 local5 = Static185.method3398(arg2, arg0, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray212 = new int[local5.anInt3225];
		aStringArray30 = new String[local5.anInt3228];
		if (local5.aClass16_4 == Static383.aClass16_9 || local5.aClass16_4 == Static309.aClass16_7 || local5.aClass16_4 == Static3.aClass16_1) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static227.aComponent_11 != null) {
				local30 = Static227.aComponent_11.anInt4305;
				local32 = Static227.aComponent_11.anInt4254;
			}
			anIntArray212[0] = Static226.aClass119_1.method3303() - local30;
			anIntArray212[1] = Static226.aClass119_1.method3312() - local32;
		}
		run(local5, 200000);
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
	private static void method3596(@OriginalArg(0) int arg0) {
		@Pc(3) Component local3 = Static6.method140(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Component[] local13 = Static113.aComponentArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Component[] local19 = Static26.aComponentArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static113.aComponentArrayArray2[local9] = new Component[local22];
			Static403.method4608(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static403.method4608(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
	public static void method3597(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static222.method3915(arg0)) {
			return;
		}
		@Pc(12) Component[] local12 = Static26.aComponentArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Component local19 = local12[local14];
			if (local19.anObjectArray22 != null) {
				@Pc(26) Class2_Sub13 local26 = new Class2_Sub13();
				local26.aComponent_3 = local19;
				local26.anObjectArray4 = local19.anObjectArray22;
				method3592(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(IZ)V")
	private static void method3598(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1292) boolean local1292;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(89) int local89;
		@Pc(81) String local81;
		@Pc(75) String local75;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				intStack[isp++] = Static20.anInt545;
				return;
			}
			if (arg0 == 5001) {
				isp -= 3;
				Static20.anInt545 = intStack[isp];
				Static154.aClass170_2 = Static335.method5694(intStack[isp + 1]);
				if (Static154.aClass170_2 == null) {
					Static154.aClass170_2 = Static329.aClass170_4;
				}
				Static331.anInt6206 = intStack[isp + 2];
				Static91.method1960(Static32.aClass145_32);
				Static257.aClass2_Sub4_Sub2_4.p1(Static20.anInt545);
				Static257.aClass2_Sub4_Sub2_4.p1(Static154.aClass170_2.anInt4690);
				Static257.aClass2_Sub4_Sub2_4.p1(Static331.anInt6206);
				return;
			}
			if (arg0 == 5002) {
				anInt3652 -= 2;
				local75 = stringStack[anInt3652];
				local81 = stringStack[anInt3652 + 1];
				isp -= 2;
				local89 = intStack[isp];
				local95 = intStack[isp + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static91.method1960(Static327.aClass145_222);
				Static257.aClass2_Sub4_Sub2_4.p1(Static27.method872(local75) + Static27.method872(local81) + 2);
				Static257.aClass2_Sub4_Sub2_4.pjstr(local75);
				Static257.aClass2_Sub4_Sub2_4.p1(local89 - 1);
				Static257.aClass2_Sub4_Sub2_4.p1(local95);
				Static257.aClass2_Sub4_Sub2_4.pjstr(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = intStack[--isp];
				local81 = null;
				if (local157 < 100) {
					local81 = Static88.aStringArray13[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				stringStack[anInt3652++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = intStack[--isp];
				local192 = -1;
				if (local157 < 100 && Static88.aStringArray13[local157] != null) {
					local192 = Static291.anIntArray373[local157];
				}
				intStack[isp++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static154.aClass170_2 == null) {
					intStack[isp++] = -1;
					return;
				}
				intStack[isp++] = Static154.aClass170_2.anInt4690;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021) {
				local75 = stringStack[--anInt3652];
				method3591(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3652 -= 2;
				local75 = stringStack[anInt3652];
				local81 = stringStack[anInt3652 + 1];
				if (Static4.anInt90 != 0 || (!Static56.aBoolean123 || Static101.aBoolean159) && !Static109.aBoolean166) {
					Static91.method1960(Static382.aClass145_261);
					Static257.aClass2_Sub4_Sub2_4.p1(0);
					local89 = Static257.aClass2_Sub4_Sub2_4.offset;
					Static257.aClass2_Sub4_Sub2_4.pjstr(local75);
					Static120.method2379(local81, Static257.aClass2_Sub4_Sub2_4);
					Static257.aClass2_Sub4_Sub2_4.psize1(Static257.aClass2_Sub4_Sub2_4.offset - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = intStack[--isp];
				local81 = null;
				if (local157 < 100) {
					local81 = Static42.aStringArray59[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				stringStack[anInt3652++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = intStack[--isp];
				local81 = null;
				if (local157 < 100) {
					local81 = Static135.aStringArray20[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				stringStack[anInt3652++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = intStack[--isp];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static132.anIntArray162[local157];
				}
				intStack[isp++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static17.self == null || Static17.self.aString42 == null) {
					local75 = Static374.aString70;
				} else {
					local75 = Static17.self.method4071();
				}
				stringStack[anInt3652++] = local75;
				return;
			}
			if (arg0 == 5016) {
				intStack[isp++] = Static331.anInt6206;
				return;
			}
			if (arg0 == 5017) {
				intStack[isp++] = Static226.anInt4016;
				return;
			}
			if (arg0 == 5018) {
				local157 = intStack[--isp];
				local192 = 0;
				if (local157 < 100 && Static88.aStringArray13[local157] != null) {
					local192 = Static291.anIntArray373[local157];
				}
				intStack[isp++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = intStack[--isp];
				local81 = null;
				if (local157 < 100) {
					local81 = Static169.aStringArray26[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				stringStack[anInt3652++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static17.self == null || Static17.self.aString42 == null) {
					local75 = Static374.aString70;
				} else {
					local75 = Static17.self.method4069();
				}
				stringStack[anInt3652++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = intStack[--isp];
				stringStack[anInt3652++] = Static138.method2581(local157).aString37;
				return;
			}
			@Pc(584) Class2_Sub2_Sub12 local584;
			if (arg0 == 5051) {
				local157 = intStack[--isp];
				local584 = Static138.method2581(local157);
				if (local584.anIntArray233 == null) {
					intStack[isp++] = 0;
					return;
				}
				intStack[isp++] = local584.anIntArray233.length;
				return;
			}
			if (arg0 == 5052) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				@Pc(628) Class2_Sub2_Sub12 local628 = Static138.method2581(local157);
				local95 = local628.anIntArray233[local192];
				intStack[isp++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = intStack[--isp];
				local584 = Static138.method2581(local157);
				if (local584.anIntArray232 == null) {
					intStack[isp++] = 0;
					return;
				}
				intStack[isp++] = local584.anIntArray232.length;
				return;
			}
			if (arg0 == 5054) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				intStack[isp++] = Static138.method2581(local157).anIntArray232[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = intStack[--isp];
				stringStack[anInt3652++] = Static146.method2699(local157).method5600();
				return;
			}
			if (arg0 == 5056) {
				local157 = intStack[--isp];
				@Pc(750) Class2_Sub2_Sub16 local750 = Static146.method2699(local157);
				if (local750.anIntArray418 == null) {
					intStack[isp++] = 0;
					return;
				}
				intStack[isp++] = local750.anIntArray418.length;
				return;
			}
			if (arg0 == 5057) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				intStack[isp++] = Static146.method2699(local157).anIntArray418[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass86_1 = new Class86();
				aClass86_1.anInt2377 = intStack[--isp];
				aClass86_1.aClass2_Sub2_Sub16_1 = Static146.method2699(aClass86_1.anInt2377);
				aClass86_1.anIntArray151 = new int[aClass86_1.aClass2_Sub2_Sub16_1.method5602()];
				return;
			}
			if (arg0 == 5059) {
				Static91.method1960(Static369.aClass145_248);
				Static257.aClass2_Sub4_Sub2_4.p1(0);
				local157 = Static257.aClass2_Sub4_Sub2_4.offset;
				Static257.aClass2_Sub4_Sub2_4.p1(0);
				Static257.aClass2_Sub4_Sub2_4.p2(aClass86_1.anInt2377);
				aClass86_1.aClass2_Sub2_Sub16_1.method5596(Static257.aClass2_Sub4_Sub2_4, aClass86_1.anIntArray151);
				Static257.aClass2_Sub4_Sub2_4.psize1(Static257.aClass2_Sub4_Sub2_4.offset - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = stringStack[--anInt3652];
				Static91.method1960(Static325.aClass145_220);
				Static257.aClass2_Sub4_Sub2_4.p1(0);
				local192 = Static257.aClass2_Sub4_Sub2_4.offset;
				Static257.aClass2_Sub4_Sub2_4.pjstr(local75);
				Static257.aClass2_Sub4_Sub2_4.p2(aClass86_1.anInt2377);
				aClass86_1.aClass2_Sub2_Sub16_1.method5596(Static257.aClass2_Sub4_Sub2_4, aClass86_1.anIntArray151);
				Static257.aClass2_Sub4_Sub2_4.psize1(Static257.aClass2_Sub4_Sub2_4.offset - local192);
				return;
			}
			if (arg0 == 5061) {
				Static91.method1960(Static369.aClass145_248);
				Static257.aClass2_Sub4_Sub2_4.p1(0);
				local157 = Static257.aClass2_Sub4_Sub2_4.offset;
				Static257.aClass2_Sub4_Sub2_4.p1(1);
				Static257.aClass2_Sub4_Sub2_4.p2(aClass86_1.anInt2377);
				aClass86_1.aClass2_Sub2_Sub16_1.method5596(Static257.aClass2_Sub4_Sub2_4, aClass86_1.anIntArray151);
				Static257.aClass2_Sub4_Sub2_4.psize1(Static257.aClass2_Sub4_Sub2_4.offset - local157);
				return;
			}
			if (arg0 == 5062) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				intStack[isp++] = Static138.method2581(local157).aCharArray4[local192];
				return;
			}
			if (arg0 == 5063) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				intStack[isp++] = Static138.method2581(local157).aCharArray5[local192];
				return;
			}
			if (arg0 == 5064) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				if (local192 == -1) {
					intStack[isp++] = -1;
					return;
				}
				intStack[isp++] = Static138.method2581(local157).method3793((char) local192);
				return;
			}
			if (arg0 == 5065) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				if (local192 == -1) {
					intStack[isp++] = -1;
					return;
				}
				intStack[isp++] = Static138.method2581(local157).method3797((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = intStack[--isp];
				intStack[isp++] = Static146.method2699(local157).method5602();
				return;
			}
			if (arg0 == 5067) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				local89 = Static146.method2699(local157).method5595(local192);
				intStack[isp++] = local89;
				return;
			}
			if (arg0 == 5068) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				aClass86_1.anIntArray151[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				aClass86_1.anIntArray151[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				isp -= 3;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				local89 = intStack[isp + 2];
				@Pc(1245) Class2_Sub2_Sub16 local1245 = Static146.method2699(local157);
				if (local1245.method5595(local192) != 0) {
					throw new RuntimeException("bad command");
				}
				intStack[isp++] = local1245.method5599(local192, local89);
				return;
			}
			if (arg0 == 5071) {
				local75 = stringStack[--anInt3652];
				local1292 = intStack[--isp] == 1;
				Static272.method4592(local1292, local75);
				intStack[isp++] = Static328.size;
				return;
			}
			if (arg0 == 5072) {
				if (Static177.results != null && Static12.index < Static328.size) {
					intStack[isp++] = Static177.results[Static12.index++] & 0xFFFF;
					return;
				}
				intStack[isp++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static12.index = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static174.aClass123_2.method3342(86)) {
					intStack[isp++] = 1;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static174.aClass123_2.method3342(82)) {
					intStack[isp++] = 1;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static174.aClass123_2.method3342(81)) {
					intStack[isp++] = 1;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
		} else {
			@Pc(1903) boolean local1903;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static211.method3721(intStack[--isp]);
					return;
				}
				if (arg0 == 5201) {
					intStack[isp++] = Static333.method6330();
					return;
				}
				if (arg0 == 5205) {
					Static258.method4401(false, -1, intStack[--isp], -1);
					return;
				}
				@Pc(1492) Class2_Sub2_Sub17 local1492;
				if (arg0 == 5206) {
					local157 = intStack[--isp];
					local1492 = Static344.method5526(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1492 == null) {
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = local1492.anInt6869;
					return;
				}
				@Pc(1525) Class2_Sub2_Sub17 local1525;
				if (arg0 == 5207) {
					local1525 = Static344.method5513(intStack[--isp]);
					if (local1525 != null && local1525.aString66 != null) {
						stringStack[anInt3652++] = local1525.aString66;
						return;
					}
					stringStack[anInt3652++] = "";
					return;
				}
				if (arg0 == 5208) {
					intStack[isp++] = Static44.anInt1105;
					intStack[isp++] = Static368.anInt6930;
					return;
				}
				if (arg0 == 5209) {
					intStack[isp++] = Static151.anInt2772 + Static344.anInt6057;
					intStack[isp++] = Static96.anInt2003 + Static344.anInt6055;
					return;
				}
				if (arg0 == 5210) {
					local157 = intStack[--isp];
					local1492 = Static344.method5513(local157);
					if (local1492 == null) {
						intStack[isp++] = 0;
						intStack[isp++] = 0;
						return;
					}
					intStack[isp++] = local1492.anInt6872 >> 14 & 0x3FFF;
					intStack[isp++] = local1492.anInt6872 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = intStack[--isp];
					local1492 = Static344.method5513(local157);
					if (local1492 == null) {
						intStack[isp++] = 0;
						intStack[isp++] = 0;
						return;
					}
					intStack[isp++] = local1492.anInt6868 - local1492.anInt6870;
					intStack[isp++] = local1492.anInt6874 - local1492.anInt6863;
					return;
				}
				@Pc(1715) Class2_Sub20 local1715;
				if (arg0 == 5212) {
					local1715 = Static209.method3712();
					if (local1715 == null) {
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = local1715.anInt2947;
					local192 = local1715.anInt2946 << 28 | local1715.anInt2949 + Static344.anInt6057 << 14 | local1715.anInt2952 + Static344.anInt6055;
					intStack[isp++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1715 = Static115.method3828();
					if (local1715 == null) {
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = local1715.anInt2947;
					local192 = local1715.anInt2946 << 28 | local1715.anInt2949 + Static344.anInt6057 << 14 | local1715.anInt2952 + Static344.anInt6055;
					intStack[isp++] = local192;
					return;
				}
				@Pc(1863) boolean local1863;
				if (arg0 == 5214) {
					local157 = intStack[--isp];
					local1492 = Static378.method6311();
					if (local1492 != null) {
						local1863 = local1492.method6144(local157 >> 28 & 0x3, anIntArray215, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1863) {
							Static15.method394(anIntArray215[2], anIntArray215[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					isp -= 2;
					local157 = intStack[isp];
					local192 = intStack[isp + 1];
					@Pc(1901) Class246 local1901 = Static344.method5515(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1903 = false;
					for (@Pc(1908) Class2_Sub2_Sub17 local1908 = (Class2_Sub2_Sub17) local1901.head(); local1908 != null; local1908 = (Class2_Sub2_Sub17) local1901.next()) {
						if (local1908.anInt6869 == local192) {
							local1903 = true;
							break;
						}
					}
					if (local1903) {
						intStack[isp++] = 1;
						return;
					}
					intStack[isp++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = intStack[--isp];
					local1492 = Static344.method5513(local157);
					if (local1492 == null) {
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = local1492.anInt6875;
					return;
				}
				if (arg0 == 5220) {
					intStack[isp++] = Static355.loadPercentage == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = intStack[--isp];
					Static15.method394(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1525 = Static378.method6311();
					if (local1525 != null) {
						local1292 = local1525.method6148(anIntArray215, Static96.anInt2003 + Static344.anInt6055, Static151.anInt2772 + Static344.anInt6057);
						if (local1292) {
							intStack[isp++] = anIntArray215[1];
							intStack[isp++] = anIntArray215[2];
							return;
						}
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = -1;
					intStack[isp++] = -1;
					return;
				}
				if (arg0 == 5223) {
					isp -= 2;
					local157 = intStack[isp];
					local192 = intStack[isp + 1];
					Static258.method4401(false, local192 >> 14 & 0x3FFF, local157, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = intStack[--isp];
					local1492 = Static378.method6311();
					if (local1492 != null) {
						local1863 = local1492.method6144(local157 >> 28 & 0x3, anIntArray215, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1863) {
							intStack[isp++] = anIntArray215[1];
							intStack[isp++] = anIntArray215[2];
							return;
						}
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = -1;
					intStack[isp++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = intStack[--isp];
					local1492 = Static378.method6311();
					if (local1492 != null) {
						local1863 = local1492.method6148(anIntArray215, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1863) {
							intStack[isp++] = anIntArray215[1];
							intStack[isp++] = anIntArray215[2];
							return;
						}
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = -1;
					intStack[isp++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static225.method3954(intStack[--isp]);
					return;
				}
				if (arg0 == 5227) {
					isp -= 2;
					local157 = intStack[isp];
					local192 = intStack[isp + 1];
					Static258.method4401(true, local192 >> 14 & 0x3FFF, local157, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static175.aBoolean225 = intStack[--isp] == 1;
					return;
				}
				if (arg0 == 5229) {
					intStack[isp++] = Static175.aBoolean225 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = intStack[--isp];
					Static232.method4026(local157);
					return;
				}
				@Pc(2421) Node local2421;
				if (arg0 == 5231) {
					isp -= 2;
					local157 = intStack[isp];
					local1292 = intStack[isp + 1] == 1;
					if (Static141.aClass4_58 != null) {
						local2421 = Static141.aClass4_58.get((long) local157);
						if (local2421 != null && !local1292) {
							local2421.unlink();
							return;
						}
						if (local2421 == null && local1292) {
							local2421 = new Node();
							Static141.aClass4_58.put(local2421, (long) local157);
						}
					}
					return;
				}
				@Pc(2463) Node local2463;
				if (arg0 == 5232) {
					local157 = intStack[--isp];
					if (Static141.aClass4_58 != null) {
						local2463 = Static141.aClass4_58.get((long) local157);
						intStack[isp++] = local2463 == null ? 0 : 1;
						return;
					}
					intStack[isp++] = 0;
					return;
				}
				if (arg0 == 5233) {
					isp -= 2;
					local157 = intStack[isp];
					local1292 = intStack[isp + 1] == 1;
					if (Static220.aClass4_83 != null) {
						local2421 = Static220.aClass4_83.get((long) local157);
						if (local2421 != null && !local1292) {
							local2421.unlink();
							return;
						}
						if (local2421 == null && local1292) {
							local2421 = new Node();
							Static220.aClass4_83.put(local2421, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = intStack[--isp];
					if (Static220.aClass4_83 != null) {
						local2463 = Static220.aClass4_83.get((long) local157);
						intStack[isp++] = local2463 == null ? 0 : 1;
						return;
					}
					intStack[isp++] = 0;
					return;
				}
				if (arg0 == 5235) {
					intStack[isp++] = Static344.aClass2_Sub2_Sub17_3 == null ? -1 : Static344.aClass2_Sub2_Sub17_3.anInt6869;
					return;
				}
			} else {
				@Pc(2717) int local2717;
				if (arg0 < 5400) {
					if (arg0 == 5300) {
						isp -= 2;
						local157 = intStack[isp];
						local192 = intStack[isp + 1];
						Static143.method2677(local192, 3, false, local157);
						intStack[isp++] = Static363.aFrame2 == null ? 0 : 1;
						return;
					}
					if (arg0 == 5301) {
						if (Static363.aFrame2 != null) {
							Static143.method2677(-1, Static218.aClass177_Sub1_2.anInt4894, false, -1);
						}
						return;
					}
					if (arg0 == 5302) {
						@Pc(2654) Class169[] local2654 = Static63.method1703();
						intStack[isp++] = local2654.length;
						return;
					}
					if (arg0 == 5303) {
						local157 = intStack[--isp];
						@Pc(2678) Class169[] local2678 = Static63.method1703();
						intStack[isp++] = local2678[local157].anInt4685;
						intStack[isp++] = local2678[local157].anInt4684;
						return;
					}
					if (arg0 == 5305) {
						local157 = Static218.aClass177_Sub1_2.anInt4884;
						local192 = Static218.aClass177_Sub1_2.anInt4893;
						local89 = -1;
						@Pc(2715) Class169[] local2715 = Static63.method1703();
						for (local2717 = 0; local2717 < local2715.length; local2717++) {
							@Pc(2722) Class169 local2722 = local2715[local2717];
							if (local2722.anInt4685 == local157 && local2722.anInt4684 == local192) {
								local89 = local2717;
								break;
							}
						}
						intStack[isp++] = local89;
						return;
					}
					if (arg0 == 5306) {
						intStack[isp++] = Static144.method2692();
						return;
					}
					if (arg0 == 5307) {
						local157 = intStack[--isp];
						if (local157 >= 1 && local157 <= 2) {
							Static143.method2677(-1, local157, false, -1);
							return;
						}
						return;
					}
					if (arg0 == 5308) {
						intStack[isp++] = Static218.aClass177_Sub1_2.anInt4894;
						return;
					}
					if (arg0 == 5309) {
						local157 = intStack[--isp];
						if (local157 >= 1 && local157 <= 2) {
							Static218.aClass177_Sub1_2.anInt4894 = local157;
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							return;
						}
						return;
					}
				} else {
					@Pc(3230) String local3230;
					if (arg0 < 5500) {
						if (arg0 == 5400) {
							anInt3652 -= 2;
							local75 = stringStack[anInt3652];
							local81 = stringStack[anInt3652 + 1];
							local89 = intStack[--isp];
							Static91.method1960(Static323.aClass145_219);
							Static257.aClass2_Sub4_Sub2_4.p1(Static27.method872(local75) + Static27.method872(local81) + 1);
							Static257.aClass2_Sub4_Sub2_4.pjstr(local75);
							Static257.aClass2_Sub4_Sub2_4.pjstr(local81);
							Static257.aClass2_Sub4_Sub2_4.p1(local89);
							return;
						}
						if (arg0 == 5401) {
							isp -= 2;
							Static257.aShortArray79[intStack[isp]] = (short) Static376.method6284(intStack[isp + 1]);
							Static313.aClass107_2.method2767();
							Static313.aClass107_2.method2760();
							Static6.aClass219_1.method5571();
							Static98.method2107();
							return;
						}
						if (arg0 == 5405) {
							isp -= 2;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							if (local157 >= 0 && local157 < 2) {
								Static364.anIntArrayArrayArray13[local157] = new int[local192 << 1][4];
							}
							return;
						}
						if (arg0 == 5406) {
							isp -= 7;
							local157 = intStack[isp];
							local192 = intStack[isp + 1] << 1;
							local89 = intStack[isp + 2];
							local95 = intStack[isp + 3];
							local2717 = intStack[isp + 4];
							@Pc(2990) int local2990 = intStack[isp + 5];
							@Pc(2996) int local2996 = intStack[isp + 6];
							if (local157 >= 0 && local157 < 2 && Static364.anIntArrayArrayArray13[local157] != null && local192 >= 0 && local192 < Static364.anIntArrayArrayArray13[local157].length) {
								Static364.anIntArrayArrayArray13[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) * 128, local95, (local89 & 0x3FFF) * 128, local2996 };
								Static364.anIntArrayArrayArray13[local157][local192 + 1] = new int[] { (local2717 >> 14 & 0x3FFF) * 128, local2990, (local2717 & 0x3FFF) * 128 };
							}
							return;
						}
						if (arg0 == 5407) {
							local157 = Static364.anIntArrayArrayArray13[intStack[--isp]].length >> 1;
							intStack[isp++] = local157;
							return;
						}
						if (arg0 == 5411) {
							if (Static363.aFrame2 != null) {
								Static143.method2677(-1, Static218.aClass177_Sub1_2.anInt4894, false, -1);
							}
							if (GameShell.frame != null) {
								Static340.method5764();
								System.exit(0);
								return;
							}
							local75 = Static307.aString57 == null ? Static200.method3649() : Static307.aString57;
							Static280.method4764(local75, GameShell.signlink, Static77.anInt1762 == 1, false);
							return;
						}
						if (arg0 == 5419) {
							local75 = "";
							if (Static354.aPrivelegedRequest_5 != null) {
								if (Static354.aPrivelegedRequest_5.result == null) {
									local75 = Static150.method2739(Static354.aPrivelegedRequest_5.anInt992);
								} else {
									local75 = (String) Static354.aPrivelegedRequest_5.result;
								}
							}
							stringStack[anInt3652++] = local75;
							return;
						}
						if (arg0 == 5420) {
							intStack[isp++] = Static215.anInt3795 == 3 ? 1 : 0;
							return;
						}
						if (arg0 == 5421) {
							if (Static363.aFrame2 != null) {
								Static143.method2677(-1, Static218.aClass177_Sub1_2.anInt4894, false, -1);
							}
							local75 = stringStack[--anInt3652];
							local1292 = intStack[--isp] == 1;
							local3230 = Static200.method3649() + local75;
							Static280.method4764(local3230, GameShell.signlink, Static77.anInt1762 == 1, local1292);
							return;
						}
						if (arg0 == 5422) {
							anInt3652 -= 2;
							local75 = stringStack[anInt3652];
							local81 = stringStack[anInt3652 + 1];
							local89 = intStack[--isp];
							if (local75.length() > 0) {
								if (Static129.aStringArray19 == null) {
									Static129.aStringArray19 = new String[Static342.anIntArray384[client.game.anInt1553]];
								}
								Static129.aStringArray19[local89] = local75;
							}
							if (local81.length() > 0) {
								if (Static333.aStringArray67 == null) {
									Static333.aStringArray67 = new String[Static342.anIntArray384[client.game.anInt1553]];
								}
								Static333.aStringArray67[local89] = local81;
							}
							return;
						}
						if (arg0 == 5423) {
							System.out.println(stringStack[--anInt3652]);
							return;
						}
						if (arg0 == 5424) {
							isp -= 11;
							Static242.anInt4446 = intStack[isp];
							Static260.anInt6717 = intStack[isp + 1];
							Static200.anInt3697 = intStack[isp + 2];
							Static86.anInt1868 = intStack[isp + 3];
							Static186.anInt3731 = intStack[isp + 4];
							Static67.anInt1636 = intStack[isp + 5];
							Static74.anInt1722 = intStack[isp + 6];
							Static363.anInt6804 = intStack[isp + 7];
							Static390.anInt7211 = intStack[isp + 8];
							Static322.anInt6030 = intStack[isp + 9];
							Static381.anInt7118 = intStack[isp + 10];
							Static30.aJs5_5.method5086(Static186.anInt3731);
							Static30.aJs5_5.method5086(Static67.anInt1636);
							Static30.aJs5_5.method5086(Static74.anInt1722);
							Static30.aJs5_5.method5086(Static363.anInt6804);
							Static30.aJs5_5.method5086(Static390.anInt7211);
							Static337.aClass13_17 = null;
							Static110.aClass13_6 = null;
							Static35.aClass13_3 = null;
							Static75.aClass13_5 = null;
							Static138.aClass13_8 = null;
							Static197.aClass13_12 = null;
							Static339.aClass13_18 = null;
							Static211.aClass13_13 = null;
							Static270.aBoolean371 = true;
							return;
						}
						if (arg0 == 5425) {
							Static190.method3501();
							Static270.aBoolean371 = false;
							return;
						}
						if (arg0 == 5426) {
							isp -= 2;
							Static394.anInt7263 = intStack[isp];
							Static91.anInt1910 = intStack[isp + 1];
							return;
						}
						if (arg0 == 5427) {
							isp -= 2;
							Static135.anInt2523 = intStack[isp + 1];
							return;
						}
						if (arg0 == 5428) {
							isp -= 2;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							intStack[isp++] = Static281.method4784(local192, local157) ? 1 : 0;
							return;
						}
						if (arg0 == 5429) {
							Static161.method2971(stringStack[--anInt3652], false);
							return;
						}
					} else if (arg0 < 5600) {
						if (arg0 == 5500) {
							isp -= 4;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							local95 = intStack[isp + 3];
							Static51.method1545((local157 & 0x3FFF) - Static148.originZ, local89, local95, false, local192, (local157 >> 14 & 0x3FFF) - Static164.originX);
							return;
						}
						if (arg0 == 5501) {
							isp -= 4;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							local95 = intStack[isp + 3];
							Static33.method4202(local89, local192, (local157 & 0x3FFF) - Static148.originZ, local95, (local157 >> 14 & 0x3FFF) - Static164.originX);
							return;
						}
						if (arg0 == 5502) {
							isp -= 6;
							local157 = intStack[isp];
							if (local157 >= 2) {
								throw new RuntimeException();
							}
							Static147.anInt2717 = local157;
							local192 = intStack[isp + 1];
							if (local192 + 1 >= Static364.anIntArrayArrayArray13[Static147.anInt2717].length >> 1) {
								throw new RuntimeException();
							}
							Static295.anInt5567 = local192;
							Static353.anInt6533 = 0;
							Static41.anInt1038 = intStack[isp + 2];
							Static217.anInt3821 = intStack[isp + 3];
							local89 = intStack[isp + 4];
							if (local89 >= 2) {
								throw new RuntimeException();
							}
							Static349.anInt6455 = local89;
							local95 = intStack[isp + 5];
							if (local95 + 1 >= Static364.anIntArrayArrayArray13[Static349.anInt6455].length >> 1) {
								throw new RuntimeException();
							}
							Static343.anInt6398 = local95;
							Static314.anInt5911 = 3;
							return;
						}
						if (arg0 == 5503) {
							Static117.method2369();
							return;
						}
						if (arg0 == 5504) {
							isp -= 2;
							Static231.method4021(intStack[isp], intStack[isp + 1]);
							return;
						}
						if (arg0 == 5505) {
							intStack[isp++] = (int) Static31.aFloat28 >> 3;
							return;
						}
						if (arg0 == 5506) {
							intStack[isp++] = (int) Static277.aFloat67 >> 3;
							return;
						}
						if (arg0 == 5507) {
							Static350.method5836();
							return;
						}
						if (arg0 == 5508) {
							Static121.method2396();
							return;
						}
						if (arg0 == 5509) {
							Static352.method5879();
							return;
						}
						if (arg0 == 5510) {
							Static26.method862();
							return;
						}
						if (arg0 == 5511) {
							local157 = intStack[--isp];
							local192 = local157 >> 14 & 0x3FFF;
							local89 = local157 & 0x3FFF;
							local192 -= Static164.originX;
							if (local192 < 0) {
								local192 = 0;
							} else if (local192 >= Static373.anInt7033) {
								local192 = Static373.anInt7033;
							}
							local89 -= Static148.originZ;
							if (local89 < 0) {
								local89 = 0;
							} else if (local89 >= Static242.anInt4449) {
								local89 = Static242.anInt4449;
							}
							Static394.anInt7264 = local192 * 128 + 64;
							Static348.anInt6448 = local89 * 128 + 64;
							Static314.anInt5911 = 4;
							return;
						}
						if (arg0 == 5512) {
							Static351.method5858();
							return;
						}
					} else if (arg0 < 5700) {
						if (arg0 == 5600) {
							anInt3652 -= 2;
							local75 = stringStack[anInt3652];
							local81 = stringStack[anInt3652 + 1];
							local89 = intStack[--isp];
							if (Static347.anInt6442 != 10) {
								return;
							}
							if (Static154.anInt2803 == 0 && Static347.step == 0 && Static141.anInt2652 == 0 && Static77.anInt1751 == 0) {
								Static97.method2087(local81, local75, local89);
								return;
							}
							return;
						}
						if (arg0 == 5601) {
							Static319.method5434();
							return;
						}
						if (arg0 == 5602) {
							if (Static347.step == 0) {
								Static41.reply = -2;
							}
							return;
						}
						if (arg0 == 5603) {
							isp -= 4;
							if (Static347.anInt6442 != 10) {
								return;
							}
							if (Static154.anInt2803 == 0 && Static347.step == 0 && Static141.anInt2652 == 0 && Static77.anInt1751 == 0) {
								Static352.method5875(intStack[isp + 3], intStack[isp + 2], intStack[isp], intStack[isp + 1]);
								return;
							}
							return;
						}
						if (arg0 == 5604) {
							anInt3652--;
							if (Static347.anInt6442 != 10) {
								return;
							}
							if (Static154.anInt2803 == 0 && Static347.step == 0 && Static141.anInt2652 == 0 && Static77.anInt1751 == 0) {
								Static72.method1809(Static80.method5984(stringStack[anInt3652]));
								return;
							}
							return;
						}
						if (arg0 == 5605) {
							anInt3652 -= 3;
							isp -= 7;
							if (Static347.anInt6442 != 10) {
								return;
							}
							if (Static154.anInt2803 == 0 && Static347.step == 0 && Static141.anInt2652 == 0 && Static77.anInt1751 == 0) {
								Static389.method4487(stringStack[anInt3652 + 1], intStack[isp], intStack[isp + 3], intStack[isp + 4] == 1, Static80.method5984(stringStack[anInt3652]), intStack[isp + 2], intStack[isp + 1], intStack[isp + 6] == 1, intStack[isp + 5] == 1, stringStack[anInt3652 + 2]);
								return;
							}
							return;
						}
						if (arg0 == 5606) {
							if (Static141.anInt2652 == 0) {
								Static318.anInt5968 = -2;
							}
							return;
						}
						if (arg0 == 5607) {
							intStack[isp++] = Static41.reply;
							return;
						}
						if (arg0 == 5608) {
							intStack[isp++] = Static47.hopTime;
							return;
						}
						if (arg0 == 5609) {
							intStack[isp++] = Static318.anInt5968;
							return;
						}
						if (arg0 == 5610) {
							for (local157 = 0; local157 < 5; local157++) {
								stringStack[anInt3652++] = Static163.aStringArray23.length > local157 ? Static330.method5656(Static163.aStringArray23[local157]) : "";
							}
							Static163.aStringArray23 = null;
							return;
						}
						if (arg0 == 5611) {
							intStack[isp++] = Static360.anInt6186;
							return;
						}
					} else if (arg0 < 6100) {
						if (arg0 == 6001) {
							local157 = intStack[--isp];
							if (local157 < 1) {
								local157 = 1;
							}
							if (local157 > 4) {
								local157 = 4;
							}
							Static218.aClass177_Sub1_2.anInt4879 = local157;
							Static347.method5826();
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6002) {
							Static218.aClass177_Sub1_2.method4492(intStack[--isp] == 1);
							Static347.method5826();
							Static226.method3981();
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6003) {
							Static218.aClass177_Sub1_2.aBoolean349 = intStack[--isp] == 1;
							Static226.method3981();
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6005) {
							Static218.aClass177_Sub1_2.aBoolean359 = intStack[--isp] == 1;
							Static347.method5826();
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6006) {
							Static218.aClass177_Sub1_2.aBoolean350 = intStack[--isp] == 1;
							Static190.aClass19_8.method2874(!Static218.aClass177_Sub1_2.aBoolean350);
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6007) {
							Static218.aClass177_Sub1_2.anInt4895 = intStack[--isp];
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6008) {
							Static218.aClass177_Sub1_2.aBoolean353 = intStack[--isp] == 1;
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6009) {
							Static218.aClass177_Sub1_2.aBoolean355 = intStack[--isp] == 1;
							Static347.method5826();
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6010) {
							Static218.aClass177_Sub1_2.aBoolean358 = intStack[--isp] == 1;
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6011) {
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							Static218.aClass177_Sub1_2.anInt4886 = local157;
							Static347.method5826();
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6012) {
							Static218.aClass177_Sub1_2.aBoolean364 = intStack[--isp] == 1;
							Static174.method1506();
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6014) {
							Static218.aClass177_Sub1_2.aBoolean361 = intStack[--isp] == 1;
							Static347.method5826();
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6015) {
							Static218.aClass177_Sub1_2.aBoolean348 = intStack[--isp] == 1;
							Static347.method5826();
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6016) {
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							Static218.aClass177_Sub1_2.anInt4885 = local157;
							Static353.method5882();
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							return;
						}
						if (arg0 == 6017) {
							Static218.aClass177_Sub1_2.aBoolean352 = intStack[--isp] == 1;
							Static178.method2342();
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6018) {
							local157 = intStack[--isp];
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 127) {
								local157 = 127;
							}
							Static218.aClass177_Sub1_2.anInt4888 = local157;
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6019) {
							local157 = intStack[--isp];
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 255) {
								local157 = 255;
							}
							if (local157 != Static218.aClass177_Sub1_2.musicVolume) {
								if (Static218.aClass177_Sub1_2.musicVolume == 0 && Static171.anInt3268 != -1) {
									Static94.method2042(local157, Static171.anInt3268, Static101.aJs5_23);
									Static393.aBoolean486 = false;
								} else if (local157 == 0) {
									Static368.method6191();
									Static393.aBoolean486 = false;
								} else {
									Static303.method5210(local157);
								}
								Static218.aClass177_Sub1_2.musicVolume = local157;
							}
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6020) {
							local157 = intStack[--isp];
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 127) {
								local157 = 127;
							}
							Static218.aClass177_Sub1_2.anInt4882 = local157;
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6021) {
							Static218.aClass177_Sub1_2.aBoolean366 = intStack[--isp] == 1;
							Static226.method3981();
							return;
						}
						if (arg0 == 6023) {
							local157 = intStack[--isp];
							local1292 = false;
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 2) {
								local157 = 2;
							}
							if (GameShell.maxMemory < 96) {
								local157 = 0;
								local1292 = true;
							}
							Static26.method864(local157);
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							intStack[isp++] = local1292 ? 0 : 1;
							return;
						}
						if (arg0 == 6024) {
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							Static218.aClass177_Sub1_2.anInt4891 = local157;
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							return;
						}
						if (arg0 == 6025) {
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > Static289.method5018(GameShell.maxMemory)) {
								local157 = 0;
							}
							Static218.aClass177_Sub1_2.anInt4883 = local157;
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6027) {
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 1) {
								local157 = 0;
							}
							Static284.method4881(local157 == 1);
							return;
						}
						if (arg0 == 6028) {
							Static218.aClass177_Sub1_2.aBoolean363 = intStack[--isp] != 0;
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							return;
						}
						if (arg0 == 6029) {
							Static218.aClass177_Sub1_2.anInt4895 = intStack[--isp];
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							return;
						}
						if (arg0 == 6030) {
							Static218.aClass177_Sub1_2.aBoolean357 = intStack[--isp] != 0;
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static347.method5826();
							return;
						}
						if (arg0 == 6031) {
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 3) {
								local157 = 2;
							}
							Static78.method5700(local157);
							return;
						}
						if (arg0 == 6032) {
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 3) {
								local157 = 2;
							}
							Static218.aClass177_Sub1_2.anInt4878 = local157;
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							Static236.sentToServer = false;
							return;
						}
						if (arg0 == 6033) {
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 4) {
								local157 = 2;
							}
							Static218.aClass177_Sub1_2.anInt4881 = local157;
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							return;
						}
						if (arg0 == 6035) {
							Static218.aClass177_Sub1_2.aBoolean365 = intStack[--isp] == 1;
							Static347.method5826();
							Static226.method3981();
							return;
						}
					} else if (arg0 < 6200) {
						if (arg0 == 6101) {
							intStack[isp++] = Static218.aClass177_Sub1_2.anInt4879;
							return;
						}
						if (arg0 == 6102) {
							intStack[isp++] = Static218.aClass177_Sub1_2.method4495(Static77.anInt1762) ? 1 : 0;
							return;
						}
						if (arg0 == 6103) {
							intStack[isp++] = Static218.aClass177_Sub1_2.aBoolean349 ? 1 : 0;
							return;
						}
						if (arg0 == 6105) {
							intStack[isp++] = Static218.aClass177_Sub1_2.aBoolean359 ? 1 : 0;
							return;
						}
						if (arg0 == 6106) {
							intStack[isp++] = Static218.aClass177_Sub1_2.aBoolean350 ? 1 : 0;
							return;
						}
						if (arg0 == 6107) {
							intStack[isp++] = Static218.aClass177_Sub1_2.anInt4895;
							return;
						}
						if (arg0 == 6108) {
							intStack[isp++] = Static218.aClass177_Sub1_2.aBoolean353 ? 1 : 0;
							return;
						}
						if (arg0 == 6109) {
							intStack[isp++] = Static218.aClass177_Sub1_2.aBoolean355 ? 1 : 0;
							return;
						}
						if (arg0 == 6110) {
							intStack[isp++] = Static218.aClass177_Sub1_2.aBoolean358 ? 1 : 0;
							return;
						}
						if (arg0 == 6111) {
							intStack[isp++] = Static218.aClass177_Sub1_2.anInt4886;
							return;
						}
						if (arg0 == 6112) {
							intStack[isp++] = Static218.aClass177_Sub1_2.aBoolean364 ? 1 : 0;
							return;
						}
						if (arg0 == 6114) {
							intStack[isp++] = Static218.aClass177_Sub1_2.aBoolean361 ? 1 : 0;
							return;
						}
						if (arg0 == 6115) {
							intStack[isp++] = Static218.aClass177_Sub1_2.aBoolean348 ? 1 : 0;
							return;
						}
						if (arg0 == 6116) {
							intStack[isp++] = Static218.aClass177_Sub1_2.anInt4885;
							return;
						}
						if (arg0 == 6117) {
							intStack[isp++] = Static218.aClass177_Sub1_2.aBoolean352 ? 1 : 0;
							return;
						}
						if (arg0 == 6118) {
							intStack[isp++] = Static218.aClass177_Sub1_2.anInt4888;
							return;
						}
						if (arg0 == 6119) {
							intStack[isp++] = Static218.aClass177_Sub1_2.musicVolume;
							return;
						}
						if (arg0 == 6120) {
							intStack[isp++] = Static218.aClass177_Sub1_2.anInt4882;
							return;
						}
						if (arg0 == 6121) {
							intStack[isp++] = Static190.aClass19_8.method2894() ? 1 : 0;
							return;
						}
						if (arg0 == 6123) {
							intStack[isp++] = Static184.method3390();
							return;
						}
						if (arg0 == 6124) {
							intStack[isp++] = Static218.aClass177_Sub1_2.anInt4891;
							return;
						}
						if (arg0 == 6125) {
							intStack[isp++] = Static218.aClass177_Sub1_2.anInt4883;
							return;
						}
						if (arg0 == 6126) {
							intStack[isp++] = Static190.aClass19_8.method2858() ? 1 : 0;
							return;
						}
						if (arg0 == 6127) {
							intStack[isp++] = Static218.aClass177_Sub1_2.aBoolean356 ? 1 : 0;
							return;
						}
						if (arg0 == 6128) {
							intStack[isp++] = Static218.aClass177_Sub1_2.aBoolean363 ? 1 : 0;
							return;
						}
						if (arg0 == 6129) {
							intStack[isp++] = Static218.aClass177_Sub1_2.anInt4895;
							return;
						}
						if (arg0 == 6130) {
							intStack[isp++] = Static218.aClass177_Sub1_2.aBoolean357 ? 1 : 0;
							return;
						}
						if (arg0 == 6131) {
							intStack[isp++] = Static77.anInt1762;
							return;
						}
						if (arg0 == 6132) {
							intStack[isp++] = Static218.aClass177_Sub1_2.anInt4878;
							return;
						}
						if (arg0 == 6133) {
							intStack[isp++] = Static215.anInt3795 == 1 || Static215.anInt3795 == 4 ? 1 : 0;
							return;
						}
						if (arg0 == 6134) {
							intStack[isp++] = Static289.method5018(GameShell.maxMemory);
							return;
						}
						if (arg0 == 6135) {
							intStack[isp++] = Static218.aClass177_Sub1_2.anInt4881;
							return;
						}
					} else if (arg0 < 6300) {
						if (arg0 == 6200) {
							isp -= 2;
							Static254.aShort73 = (short) intStack[isp];
							if (Static254.aShort73 <= 0) {
								Static254.aShort73 = 256;
							}
							Static258.aShort78 = (short) intStack[isp + 1];
							if (Static258.aShort78 <= 0) {
								Static258.aShort78 = 205;
							}
							return;
						}
						if (arg0 == 6201) {
							isp -= 2;
							Static271.aShort79 = (short) intStack[isp];
							if (Static271.aShort79 <= 0) {
								Static271.aShort79 = 256;
							}
							Static120.aShort36 = (short) intStack[isp + 1];
							if (Static120.aShort36 <= 0) {
								Static120.aShort36 = 320;
							}
							return;
						}
						if (arg0 == 6202) {
							isp -= 4;
							Static78.aShort86 = (short) intStack[isp];
							if (Static78.aShort86 <= 0) {
								Static78.aShort86 = 1;
							}
							Static120.aShort35 = (short) intStack[isp + 1];
							if (Static120.aShort35 <= 0) {
								Static120.aShort35 = 32767;
							} else if (Static120.aShort35 < Static78.aShort86) {
								Static120.aShort35 = Static78.aShort86;
							}
							Static353.aShort92 = (short) intStack[isp + 2];
							if (Static353.aShort92 <= 0) {
								Static353.aShort92 = 1;
							}
							Static68.aShort19 = (short) intStack[isp + 3];
							if (Static68.aShort19 <= 0) {
								Static68.aShort19 = 32767;
								return;
							}
							if (Static68.aShort19 < Static353.aShort92) {
								Static68.aShort19 = Static353.aShort92;
							}
							return;
						}
						if (arg0 == 6203) {
							Static308.method5272(0, Static20.aComponent_1.height, false, Static20.aComponent_1.width, 0);
							intStack[isp++] = Static155.anInt2808;
							intStack[isp++] = Static180.anInt3408;
							return;
						}
						if (arg0 == 6204) {
							intStack[isp++] = Static271.aShort79;
							intStack[isp++] = Static120.aShort36;
							return;
						}
						if (arg0 == 6205) {
							intStack[isp++] = Static254.aShort73;
							intStack[isp++] = Static258.aShort78;
							return;
						}
					} else if (arg0 < 6400) {
						if (arg0 == 6300) {
							intStack[isp++] = (int) (MonotonicClock.currentTimeMillis() / 60000L);
							return;
						}
						if (arg0 == 6301) {
							intStack[isp++] = (int) (MonotonicClock.currentTimeMillis() / 86400000L) - 11745;
							return;
						}
						if (arg0 == 6302) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							calendar.clear();
							calendar.set(11, 12);
							calendar.set(local89, local192, local157);
							intStack[isp++] = (int) (calendar.getTime().getTime() / 86400000L) - 11745;
							return;
						}
						if (arg0 == 6303) {
							calendar.clear();
							calendar.setTime(new Date(MonotonicClock.currentTimeMillis()));
							intStack[isp++] = calendar.get(1);
							return;
						}
						if (arg0 == 6304) {
							local157 = intStack[--isp];
							local1292 = true;
							if (local157 < 0) {
								local1292 = (local157 + 1) % 4 == 0;
							} else if (local157 < 1582) {
								local1292 = local157 % 4 == 0;
							} else if (local157 % 4 != 0) {
								local1292 = false;
							} else if (local157 % 100 != 0) {
								local1292 = true;
							} else if (local157 % 400 != 0) {
								local1292 = false;
							}
							intStack[isp++] = local1292 ? 1 : 0;
							return;
						}
					} else if (arg0 < 6500) {
						if (arg0 == 6405) {
							intStack[isp++] = Static79.method1870() ? 1 : 0;
							return;
						}
						if (arg0 == 6406) {
							intStack[isp++] = Static331.method5659() ? 1 : 0;
							return;
						}
					} else if (arg0 < 6600) {
						if (arg0 == 6500) {
							if (Static347.anInt6442 == 10 && Static154.anInt2803 == 0 && Static347.step == 0 && Static141.anInt2652 == 0) {
								intStack[isp++] = Static319.method5429() == -1 ? 0 : 1;
								return;
							}
							intStack[isp++] = 1;
							return;
						}
						@Pc(5979) Country local5979;
						@Pc(5946) World local5946;
						if (arg0 == 6501) {
							local5946 = Static19.method559();
							if (local5946 != null) {
								intStack[isp++] = local5946.worldID;
								intStack[isp++] = local5946.flags;
								stringStack[anInt3652++] = local5946.activity;
								local5979 = local5946.getCountry();
								intStack[isp++] = local5979.flag;
								stringStack[anInt3652++] = local5979.name;
								intStack[isp++] = local5946.anInt78;
								intStack[isp++] = local5946.anInt83;
								return;
							}
							intStack[isp++] = -1;
							intStack[isp++] = 0;
							stringStack[anInt3652++] = "";
							intStack[isp++] = 0;
							stringStack[anInt3652++] = "";
							intStack[isp++] = 0;
							intStack[isp++] = 0;
							return;
						}
						if (arg0 == 6502) {
							local5946 = Static268.method4547();
							if (local5946 != null) {
								intStack[isp++] = local5946.worldID;
								intStack[isp++] = local5946.flags;
								stringStack[anInt3652++] = local5946.activity;
								local5979 = local5946.getCountry();
								intStack[isp++] = local5979.flag;
								stringStack[anInt3652++] = local5979.name;
								intStack[isp++] = local5946.anInt78;
								intStack[isp++] = local5946.anInt83;
								return;
							}
							intStack[isp++] = -1;
							intStack[isp++] = 0;
							stringStack[anInt3652++] = "";
							intStack[isp++] = 0;
							stringStack[anInt3652++] = "";
							intStack[isp++] = 0;
							intStack[isp++] = 0;
							return;
						}
						if (arg0 == 6503) {
							local157 = intStack[--isp];
							if (Static347.anInt6442 == 10 && Static154.anInt2803 == 0 && Static347.step == 0 && Static141.anInt2652 == 0) {
								intStack[isp++] = Static375.switchWorld(local157) ? 1 : 0;
								return;
							}
							intStack[isp++] = 0;
							return;
						}
						if (arg0 == 6504) {
							Static218.aClass177_Sub1_2.anInt4887 = intStack[--isp];
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							return;
						}
						if (arg0 == 6505) {
							intStack[isp++] = Static218.aClass177_Sub1_2.anInt4887;
							return;
						}
						if (arg0 == 6506) {
							local157 = intStack[--isp];
							@Pc(6295) World local6295 = Static7.get(local157);
							if (local6295 != null) {
								intStack[isp++] = local6295.flags;
								stringStack[anInt3652++] = local6295.activity;
								@Pc(6319) Country local6319 = local6295.getCountry();
								intStack[isp++] = local6319.flag;
								stringStack[anInt3652++] = local6319.name;
								intStack[isp++] = local6295.anInt78;
								intStack[isp++] = local6295.anInt83;
								return;
							}
							intStack[isp++] = -1;
							stringStack[anInt3652++] = "";
							intStack[isp++] = 0;
							stringStack[anInt3652++] = "";
							intStack[isp++] = 0;
							intStack[isp++] = 0;
							return;
						}
						if (arg0 == 6507) {
							isp -= 4;
							local157 = intStack[isp];
							local1292 = intStack[isp + 1] == 1;
							local89 = intStack[isp + 2];
							local1903 = intStack[isp + 3] == 1;
							Static343.method5783(local1292, local1903, local89, local157);
							return;
						}
						if (arg0 == 6508) {
							Static200.method3643();
							return;
						}
						if (arg0 == 6509) {
							if (Static347.anInt6442 != 10) {
								return;
							}
							Static36.aBoolean74 = intStack[--isp] == 1;
							return;
						}
					} else if (arg0 < 6700) {
						if (arg0 == 6600) {
							Static218.aClass177_Sub1_2.aBoolean351 = intStack[--isp] == 1;
							Static218.aClass177_Sub1_2.method4496(GameShell.signlink);
							return;
						}
						if (arg0 == 6601) {
							intStack[isp++] = Static218.aClass177_Sub1_2.aBoolean351 ? 1 : 0;
							return;
						}
					} else if (arg0 < 6800 && client.modeWhat == Static359.aClass209_4) {
						if (arg0 == 6700) {
							local157 = Static329.aClass4_130.method83();
							if (Static139.anInt2595 != -1) {
								local157++;
							}
							intStack[isp++] = local157;
							return;
						}
						if (arg0 == 6701) {
							local157 = intStack[--isp];
							if (Static139.anInt2595 != -1) {
								if (local157 == 0) {
									intStack[isp++] = Static139.anInt2595;
									return;
								}
								local157--;
							}
							@Pc(6577) Class2_Sub7 local6577 = (Class2_Sub7) Static329.aClass4_130.method80();
							while (local157-- > 0) {
								local6577 = (Class2_Sub7) Static329.aClass4_130.method79();
							}
							intStack[isp++] = local6577.anInt1370;
							return;
						}
						if (arg0 == 6702) {
							local157 = intStack[--isp];
							if (Static26.aComponentArrayArray1[local157] == null) {
								stringStack[anInt3652++] = "";
								return;
							}
							local81 = Static26.aComponentArrayArray1[local157][0].aString43;
							if (local81 == null) {
								stringStack[anInt3652++] = "";
								return;
							}
							stringStack[anInt3652++] = local81.substring(0, local81.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local157 = intStack[--isp];
							if (Static26.aComponentArrayArray1[local157] == null) {
								intStack[isp++] = 0;
								return;
							}
							intStack[isp++] = Static26.aComponentArrayArray1[local157].length;
							return;
						}
						if (arg0 == 6704) {
							isp -= 2;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							if (Static26.aComponentArrayArray1[local157] == null) {
								stringStack[anInt3652++] = "";
								return;
							}
							local3230 = Static26.aComponentArrayArray1[local157][local192].aString43;
							if (local3230 == null) {
								stringStack[anInt3652++] = "";
								return;
							}
							stringStack[anInt3652++] = local3230;
							return;
						}
						if (arg0 == 6705) {
							isp -= 2;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							if (Static26.aComponentArrayArray1[local157] == null) {
								intStack[isp++] = 0;
								return;
							}
							intStack[isp++] = Static26.aComponentArrayArray1[local157][local192].anInt4246;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Static277.method4680(local157 << 16 | local192, 1, "", local89);
							return;
						}
						if (arg0 == 6708) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Static277.method4680(local157 << 16 | local192, 2, "", local89);
							return;
						}
						if (arg0 == 6709) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Static277.method4680(local157 << 16 | local192, 3, "", local89);
							return;
						}
						if (arg0 == 6710) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Static277.method4680(local157 << 16 | local192, 4, "", local89);
							return;
						}
						if (arg0 == 6711) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Static277.method4680(local157 << 16 | local192, 5, "", local89);
							return;
						}
						if (arg0 == 6712) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Static277.method4680(local157 << 16 | local192, 6, "", local89);
							return;
						}
						if (arg0 == 6713) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Static277.method4680(local157 << 16 | local192, 7, "", local89);
							return;
						}
						if (arg0 == 6714) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Static277.method4680(local157 << 16 | local192, 8, "", local89);
							return;
						}
						if (arg0 == 6715) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Static277.method4680(local157 << 16 | local192, 9, "", local89);
							return;
						}
						if (arg0 == 6716) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Static277.method4680(local157 << 16 | local192, 10, "", local89);
							return;
						}
						if (arg0 == 6717) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							@Pc(7165) Component local7165 = Static207.method3704(local157 << 16 | local192, local89);
							Static207.method3698();
							@Pc(7170) ServerActiveProperties local7170 = Static45.method1404(local7165);
							Static185.method3399(local7165.anInt4238, local7170.method1852(), local157 << 16 | local192, local89, local7165.anInt4286, local7170.anInt1759);
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(7207) Class164 local7207;
						if (arg0 == 6800) {
							local157 = intStack[--isp];
							local7207 = Static236.aClass125_1.method3378(local157);
							if (local7207.aString48 == null) {
								stringStack[anInt3652++] = "";
								return;
							}
							stringStack[anInt3652++] = local7207.aString48;
							return;
						}
						if (arg0 == 6801) {
							local157 = intStack[--isp];
							local7207 = Static236.aClass125_1.method3378(local157);
							intStack[isp++] = local7207.anInt4420;
							return;
						}
						if (arg0 == 6802) {
							local157 = intStack[--isp];
							local7207 = Static236.aClass125_1.method3378(local157);
							intStack[isp++] = local7207.anInt4418;
							return;
						}
						if (arg0 == 6803) {
							local157 = intStack[--isp];
							local7207 = Static236.aClass125_1.method3378(local157);
							intStack[isp++] = local7207.anInt4424;
							return;
						}
						if (arg0 == 6804) {
							isp -= 2;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							@Pc(7329) Class240 local7329 = Static363.aClass18_2.method565(local192);
							if (local7329.method6262()) {
								stringStack[anInt3652++] = Static236.aClass125_1.method3378(local157).method4184(local192, local7329.aString69);
								return;
							}
							intStack[isp++] = Static236.aClass125_1.method3378(local157).method4187(local7329.anInt7023, local192);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!js;I)V")
	private static void run(@OriginalArg(0) Class2_Sub2_Sub11 arg0, @OriginalArg(1) int maxCycles) {
		isp = 0;
		anInt3652 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray199;
		@Pc(11) int[] local11 = arg0.anIntArray200;
		@Pc(13) byte local13 = -1;
		anInt3661 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label260: while (true) {
				local17++;
				if (local17 > maxCycles) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(802) boolean local802;
					if (local11[local5] == 1) {
						local802 = true;
					} else {
						local802 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						run(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method3598(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					intStack[isp++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						intStack[isp++] = Static214.aClass226_1.anIntArray430[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static214.aClass226_1.method5779(local54, intStack[--isp]);
					} else if (local31 == 3) {
						stringStack[anInt3652++] = arg0.aStringArray27[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						isp -= 2;
						if (intStack[isp] != intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						isp -= 2;
						if (intStack[isp] == intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						isp -= 2;
						if (intStack[isp] < intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						isp -= 2;
						if (intStack[isp] > intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt3661 == 0) {
							return;
						}
						@Pc(216) Class172 local216 = aClass172Array1[--anInt3661];
						arg0 = local216.aClass2_Sub2_Sub11_1;
						local8 = arg0.anIntArray199;
						local11 = arg0.anIntArray200;
						local5 = local216.anInt4704;
						anIntArray212 = local216.anIntArray319;
						aStringArray30 = local216.aStringArray47;
					} else if (local31 == 25) {
						local54 = local11[local5];
						intStack[isp++] = Static214.aClass226_1.method5777(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static214.aClass226_1.method5778(local54, intStack[--isp]);
					} else if (local31 == 31) {
						isp -= 2;
						if (intStack[isp] <= intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						isp -= 2;
						if (intStack[isp] >= intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						intStack[isp++] = anIntArray212[local11[local5]];
					} else if (local31 == 34) {
						anIntArray212[local11[local5]] = intStack[--isp];
					} else if (local31 == 35) {
						stringStack[anInt3652++] = aStringArray30[local11[local5]];
					} else if (local31 == 36) {
						aStringArray30[local11[local5]] = stringStack[--anInt3652];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt3652 -= local54;
						@Pc(400) String local400 = Static89.method1940(anInt3652, stringStack, local54);
						stringStack[anInt3652++] = local400;
					} else if (local31 == 38) {
						isp--;
					} else if (local31 == 39) {
						anInt3652--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class2_Sub2_Sub11 local436 = Static295.method5099(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt3225];
							@Pc(450) String[] local450 = new String[local436.anInt3228];
							for (local452 = 0; local452 < local436.anInt3230; local452++) {
								local446[local452] = intStack[isp + local452 - local436.anInt3230];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt3227; local471++) {
								local450[local471] = stringStack[anInt3652 + local471 - local436.anInt3227];
							}
							isp -= local436.anInt3230;
							anInt3652 -= local436.anInt3227;
							@Pc(502) Class172 local502 = new Class172();
							local502.aClass2_Sub2_Sub11_1 = arg0;
							local502.anInt4704 = local5;
							local502.anIntArray319 = anIntArray212;
							local502.aStringArray47 = aStringArray30;
							if (anInt3661 >= aClass172Array1.length) {
								throw new RuntimeException();
							}
							aClass172Array1[anInt3661++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray199;
							local11 = local436.anIntArray200;
							local5 = -1;
							anIntArray212 = local446;
							aStringArray30 = local450;
						} else if (local31 == 42) {
							intStack[isp++] = Static75.anIntArray117[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static75.anIntArray117[local54] = intStack[--isp];
							Static226.method3982(local54);
							Static273.aBoolean374 |= Static89.aBooleanArray18[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = intStack[--isp];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray214[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									arrays[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = intStack[--isp];
							if (local603 < 0 || local603 >= anIntArray214[local54]) {
								throw new RuntimeException();
							}
							intStack[isp++] = arrays[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							isp -= 2;
							local603 = intStack[isp];
							if (local603 < 0 || local603 >= anIntArray214[local54]) {
								throw new RuntimeException();
							}
							arrays[local54][local603] = intStack[isp + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static75.aStringArray11[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							stringStack[anInt3652++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static75.aStringArray11[local54] = stringStack[--anInt3652];
							Static290.method5022(local54);
						} else if (local31 == 51) {
							@Pc(774) HashTable local774 = arg0.aClass4Array1[local11[local5]];
							@Pc(787) IntNode local787 = (IntNode) local774.get((long) intStack[--isp]);
							if (local787 != null) {
								local5 += local787.value;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString27 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.key).append(" ");
				for (local603 = anInt3661 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass172Array1[local603].aClass2_Sub2_Sub11_1.key).append(" ");
				}
				local855.append("op: ").append(local13);
				Static262.report(local837, local855.toString());
			} else {
				Static207.method3699("Clientscript error in: " + arg0.aString27);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString27).append("\n");
				for (local603 = anInt3661 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass172Array1[local603].aClass2_Sub2_Sub11_1.aString27).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static262.report(local837, local855.toString());
				Static158.method2939(local855.toString());
			}
		}
	}
}
