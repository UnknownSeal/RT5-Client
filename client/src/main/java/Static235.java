import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
	public static int anInt3363 = 0;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
	public static int state = 0;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
	public static int anInt3368 = 0;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!ml;IILclient!bt;)V")
	public static void method3338(@OriginalArg(0) SignLink arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Buffer arg2) {
		@Pc(9) Class2_Sub42 local9 = new Class2_Sub42();
		local9.anInt7154 = arg2.g1();
		local9.anInt7156 = arg2.mg4();
		local9.anIntArray491 = new int[local9.anInt7154];
		local9.anIntArray493 = new int[local9.anInt7154];
		local9.aPrivelegedRequestArray1 = new PrivelegedRequest[local9.anInt7154];
		local9.aByteArrayArrayArray17 = new byte[local9.anInt7154][][];
		local9.anIntArray492 = new int[local9.anInt7154];
		local9.aPrivelegedRequestArray2 = new PrivelegedRequest[local9.anInt7154];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt7154; local56++) {
			try {
				@Pc(62) int local62 = arg2.g1();
				@Pc(78) String local78;
				@Pc(82) String local82;
				@Pc(84) int local84;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local78 = arg2.gjstr();
					local82 = arg2.gjstr();
					local84 = 0;
					if (local62 == 1) {
						local84 = arg2.mg4();
					}
					local9.anIntArray493[local56] = local62;
					local9.anIntArray492[local56] = local84;
					local9.aPrivelegedRequestArray1[local56] = arg0.method3761(Static17.classForName(local78), local82);
				} else if (local62 == 3 || local62 == 4) {
					local78 = arg2.gjstr();
					local82 = arg2.gjstr();
					local84 = arg2.g1();
					@Pc(139) String[] local139 = new String[local84];
					for (@Pc(141) int local141 = 0; local141 < local84; local141++) {
						local139[local141] = arg2.gjstr();
					}
					@Pc(156) byte[][] local156 = new byte[local84][];
					@Pc(167) int local167;
					if (local62 == 3) {
						for (@Pc(161) int local161 = 0; local161 < local84; local161++) {
							local167 = arg2.mg4();
							local156[local161] = new byte[local167];
							arg2.gdata(local156[local161], local167);
						}
					}
					local9.anIntArray493[local56] = local62;
					@Pc(192) Class[] local192 = new Class[local84];
					for (local167 = 0; local167 < local84; local167++) {
						local192[local167] = Static17.classForName(local139[local167]);
					}
					local9.aPrivelegedRequestArray2[local56] = arg0.method3747(Static17.classForName(local78), local82, local192);
					local9.aByteArrayArrayArray17[local56] = local156;
				}
			} catch (@Pc(231) ClassNotFoundException local231) {
				local9.anIntArray491[local56] = -1;
			} catch (@Pc(238) SecurityException local238) {
				local9.anIntArray491[local56] = -2;
			} catch (@Pc(245) NullPointerException local245) {
				local9.anIntArray491[local56] = -3;
			} catch (@Pc(252) Exception local252) {
				local9.anIntArray491[local56] = -4;
			} catch (@Pc(259) Throwable local259) {
				local9.anIntArray491[local56] = -5;
			}
		}
		Static337.aLinkedList_37.addTail(local9);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIII)Z")
	public static boolean method3339(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface6 local9 = (Interface6) Static12.method283(arg1, arg0, arg2);
		@Pc(19) boolean local19 = true;
		if (local9 != null) {
			local19 = Static306.method5251(local9) & true;
		}
		local9 = (Interface6) Static105.method2207(arg1, arg0, arg2, Interface6.class);
		if (local9 != null) {
			local19 &= Static306.method5251(local9);
		}
		local9 = (Interface6) Static26.method865(arg1, arg0, arg2);
		if (local9 != null) {
			local19 &= Static306.method5251(local9);
		}
		return local19;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)Z")
	public static boolean readPacket() {
		try {
			return Static73.readPacketInternal();
		} catch (@Pc(16) IOException exception) {
			Static211.method3724();
			return true;
		} catch (@Pc(21) Exception exception) {
			@Pc(81) String local81 = "T2 - " + (InboundPacket.packetInbound == null ? -1 : InboundPacket.packetInbound.getID()) + "," + (InboundPacket.aInboundPacket_57 == null ? -1 : InboundPacket.aInboundPacket_57.getID()) + "," + (InboundPacket.aInboundPacket_35 == null ? -1 : InboundPacket.aInboundPacket_35.getID()) + " - " + Static82.length + "," + (Static164.originX + Static17.self.anIntArray316[0]) + "," + (Static148.originZ + Static17.self.anIntArray317[0]) + " - ";
			for (@Pc(83) int local83 = 0; local83 < Static82.length && local83 < 50; local83++) {
				local81 = local81 + Static212.inboundBuffer.bytes[local83] + ",";
			}
			Static262.report(exception, local81);
			Static99.logout();
			return true;
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIII)I")
	public static int method3343(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}
}
