import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "Lclient!ot;")
	private static final Bzip2DState state = new Bzip2DState();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ot;)V")
	private static void method3734(@OriginalArg(0) Bzip2DState arg0) {
		arg0.anInt4794 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray41[local4]) {
				arg0.aByteArray53[arg0.anInt4794] = (byte) local4;
				arg0.anInt4794++;
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([I[I[I[BIII)V")
	private static void method3735(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = arg4; local3 <= arg5; local3++) {
			for (@Pc(6) int local6 = 0; local6 < arg6; local6++) {
				if (arg3[local6] == local3) {
					arg2[local1] = local6;
					local1++;
				}
			}
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg1[local3] = 0;
		}
		for (local3 = 0; local3 < arg6; local3++) {
			arg1[arg3[local3] + 1]++;
		}
		for (local3 = 1; local3 < 23; local3++) {
			arg1[local3] += arg1[local3 - 1];
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg0[local3] = 0;
		}
		@Pc(85) int local85 = 0;
		for (local3 = arg4; local3 <= arg5; local3++) {
			local85 += arg1[local3 + 1] - arg1[local3];
			arg0[local3] = local85 - 1;
			local85 <<= 0x1;
		}
		for (local3 = arg4 + 1; local3 <= arg5; local3++) {
			arg1[local3] = (arg0[local3 - 1] + 1 << 1) - arg1[local3];
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(Lclient!ot;)V")
	private static void method3736(@OriginalArg(0) Bzip2DState arg0) {
		@Pc(2) byte local2 = arg0.aByte53;
		@Pc(5) int local5 = arg0.anInt4798;
		@Pc(8) int local8 = arg0.anInt4801;
		@Pc(11) int local11 = arg0.anInt4797;
		@Pc(13) int[] local13 = Bzip2DState.tt;
		@Pc(16) int local16 = arg0.anInt4792;
		@Pc(19) byte[] local19 = arg0.strmNextOut;
		@Pc(22) int local22 = arg0.anInt4789;
		@Pc(25) int local25 = arg0.strmAvailOut;
		@Pc(27) int local27 = local25;
		@Pc(32) int local32 = arg0.anInt4800 + 1;
		label63: while (true) {
			if (local5 > 0) {
				while (true) {
					if (local25 == 0) {
						break label63;
					}
					if (local5 == 1) {
						if (local25 == 0) {
							local5 = 1;
							break label63;
						}
						local19[local22] = local2;
						local22++;
						local25--;
						break;
					}
					local19[local22] = local2;
					local5--;
					local22++;
					local25--;
				}
			}
			@Pc(60) boolean local60 = true;
			@Pc(81) byte local81;
			while (local60) {
				local60 = false;
				if (local8 == local32) {
					local5 = 0;
					break label63;
				}
				local2 = (byte) local11;
				local16 = local13[local16];
				local81 = (byte) (local16 & 0xFF);
				local16 >>= 0x8;
				local8++;
				if (local81 != local11) {
					local11 = local81;
					if (local25 == 0) {
						local5 = 1;
						break label63;
					}
					local19[local22] = local2;
					local22++;
					local25--;
					local60 = true;
				} else if (local8 == local32) {
					if (local25 == 0) {
						local5 = 1;
						break label63;
					}
					local19[local22] = local2;
					local22++;
					local25--;
					local60 = true;
				}
			}
			local5 = 2;
			local16 = local13[local16];
			local81 = (byte) (local16 & 0xFF);
			local16 >>= 0x8;
			local8++;
			if (local8 != local32) {
				if (local81 == local11) {
					local5 = 3;
					local16 = local13[local16];
					local81 = (byte) (local16 & 0xFF);
					local16 >>= 0x8;
					local8++;
					if (local8 != local32) {
						if (local81 == local11) {
							local16 = local13[local16];
							local81 = (byte) (local16 & 0xFF);
							local16 >>= 0x8;
							local8++;
							local5 = (local81 & 0xFF) + 4;
							local16 = local13[local16];
							local11 = (byte) (local16 & 0xFF);
							local16 >>= 0x8;
							local8++;
						} else {
							local11 = local81;
						}
					}
				} else {
					local11 = local81;
				}
			}
		}
		@Pc(212) int local212 = arg0.anInt4795;
		arg0.anInt4795 += local27 - local25;
		arg0.aByte53 = local2;
		arg0.anInt4798 = local5;
		arg0.anInt4801 = local8;
		arg0.anInt4797 = local11;
		Bzip2DState.tt = local13;
		arg0.anInt4792 = local16;
		arg0.strmNextOut = local19;
		arg0.anInt4789 = local22;
		arg0.strmAvailOut = local25;
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(Lclient!ot;)B")
	private static byte method3737(@OriginalArg(0) Bzip2DState arg0) {
		return (byte) getBits(1, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(Lclient!ot;)B")
	private static byte getUchar(@OriginalArg(0) Bzip2DState state) {
		return (byte) getBits(8, state);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!ot;)I")
	private static int getBits(@OriginalArg(0) int nn, @OriginalArg(1) Bzip2DState state) {
		while (state.bsLive < nn) {
			state.bsBuff = state.bsBuff << 8 | state.strmNextIn[state.strmNextInPtr] & 0xFF;
			state.bsLive += 8;
			state.strmNextInPtr++;
			state.strmTotalInLo32++;
		}
		@Pc(17) int vvv = state.bsBuff >> state.bsLive - nn & (0x1 << nn) - 1;
		state.bsLive -= nn;
		return vvv;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([BI[BII)I")
	public static int bunzip2(@OriginalArg(0) byte[] destination, @OriginalArg(1) int destinationLength, @OriginalArg(2) byte[] source, @OriginalArg(3) int arg3) {
		@Pc(1) Bzip2DState local1 = state;
		synchronized (state) {
			state.strmNextIn = source;
			state.strmNextInPtr = 9;
			state.strmNextOut = destination;
			state.anInt4789 = 0;
			state.strmAvailOut = destinationLength;
			state.bsLive = 0;
			state.bsBuff = 0;
			state.strmTotalInLo32 = 0;
			state.anInt4795 = 0;
			decompress(state);
			@Pc(37) int destinationLength2 = destinationLength - state.strmAvailOut;
			state.strmNextIn = null;
			state.strmNextOut = null;
			return destinationLength2;
		}
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(Lclient!ot;)V")
	private static void decompress(@OriginalArg(0) Bzip2DState state) {
		state.blockSize100k = 1;
		if (Bzip2DState.tt == null) {
			Bzip2DState.tt = new int[state.blockSize100k * 100000];
		}
		@Pc(56) boolean gotoBzXBlkhdr1 = true;
		while (true) {
			while (gotoBzXBlkhdr1) {
				@Pc(60) byte uc = getUchar(state);
				if (uc == 23) {
					return;
				}
				uc = getUchar(state);
				uc = getUchar(state);
				uc = getUchar(state);
				uc = getUchar(state);
				uc = getUchar(state);
				uc = getUchar(state);
				uc = getUchar(state);
				uc = getUchar(state);
				uc = getUchar(state);
				uc = method3737(state);
				state.anInt4799 = 0;
				uc = getUchar(state);
				state.anInt4799 = state.anInt4799 << 8 | uc & 0xFF;
				uc = getUchar(state);
				state.anInt4799 = state.anInt4799 << 8 | uc & 0xFF;
				uc = getUchar(state);
				state.anInt4799 = state.anInt4799 << 8 | uc & 0xFF;
				@Pc(138) int local138;
				for (local138 = 0; local138 < 16; local138++) {
					uc = method3737(state);
					if (uc == 1) {
						state.aBooleanArray40[local138] = true;
					} else {
						state.aBooleanArray40[local138] = false;
					}
				}
				for (local138 = 0; local138 < 256; local138++) {
					state.aBooleanArray41[local138] = false;
				}
				@Pc(182) int local182;
				for (local138 = 0; local138 < 16; local138++) {
					if (state.aBooleanArray40[local138]) {
						for (local182 = 0; local182 < 16; local182++) {
							uc = method3737(state);
							if (uc == 1) {
								state.aBooleanArray41[local138 * 16 + local182] = true;
							}
						}
					}
				}
				method3734(state);
				@Pc(213) int local213 = state.anInt4794 + 2;
				@Pc(217) int local217 = getBits(3, state);
				@Pc(221) int local221 = getBits(15, state);
				for (local138 = 0; local138 < local221; local138++) {
					local182 = 0;
					while (true) {
						uc = method3737(state);
						if (uc == 0) {
							state.aByteArray55[local138] = (byte) local182;
							break;
						}
						local182++;
					}
				}
				@Pc(246) byte[] local246 = new byte[6];
				@Pc(248) byte local248 = 0;
				while (local248 < local217) {
					local246[local248] = local248++;
				}
				for (local138 = 0; local138 < local221; local138++) {
					local248 = state.aByteArray55[local138];
					@Pc(273) byte local273 = local246[local248];
					while (local248 > 0) {
						local246[local248] = local246[local248 - 1];
						local248--;
					}
					local246[0] = local273;
					state.aByteArray56[local138] = local273;
				}
				@Pc(304) int local304;
				for (local304 = 0; local304 < local217; local304++) {
					@Pc(309) int local309 = getBits(5, state);
					for (local138 = 0; local138 < local213; local138++) {
						while (true) {
							uc = method3737(state);
							if (uc == 0) {
								state.aByteArrayArray13[local304][local138] = (byte) local309;
								break;
							}
							uc = method3737(state);
							if (uc == 0) {
								local309++;
							} else {
								local309--;
							}
						}
					}
				}
				for (local304 = 0; local304 < local217; local304++) {
					@Pc(347) byte local347 = 32;
					@Pc(349) byte local349 = 0;
					for (local138 = 0; local138 < local213; local138++) {
						if (state.aByteArrayArray13[local304][local138] > local349) {
							local349 = state.aByteArrayArray13[local304][local138];
						}
						if (state.aByteArrayArray13[local304][local138] < local347) {
							local347 = state.aByteArrayArray13[local304][local138];
						}
					}
					method3735(state.anIntArrayArray39[local304], state.anIntArrayArray38[local304], state.anIntArrayArray37[local304], state.aByteArrayArray13[local304], local347, local349, local213);
					state.anIntArray324[local304] = local347;
				}
				@Pc(420) int local420 = state.anInt4794 + 1;
				@Pc(422) byte local422 = -1;
				for (local138 = 0; local138 <= 255; local138++) {
					state.anIntArray327[local138] = 0;
				}
				@Pc(438) int local438 = 4095;
				for (@Pc(440) int local440 = 15; local440 >= 0; local440--) {
					for (@Pc(443) int local443 = 15; local443 >= 0; local443--) {
						state.aByteArray52[local438] = (byte) (local440 * 16 + local443);
						local438--;
					}
					state.anIntArray326[local440] = local438 + 1;
				}
				@Pc(470) int local470 = 0;
				@Pc(473) int local473 = local422 + 1;
				@Pc(475) byte local475 = 50;
				@Pc(480) byte local480 = state.aByteArray56[0];
				@Pc(485) int local485 = state.anIntArray324[local480];
				@Pc(490) int[] local490 = state.anIntArrayArray39[local480];
				@Pc(495) int[] local495 = state.anIntArrayArray37[local480];
				@Pc(500) int[] local500 = state.anIntArrayArray38[local480];
				@Pc(501) int local501 = local475 - 1;
				@Pc(503) int local503 = local485;
				@Pc(507) int local507;
				@Pc(516) byte local516;
				for (local507 = getBits(local485, state); local507 > local490[local503]; local507 = local507 << 1 | local516) {
					local503++;
					local516 = method3737(state);
				}
				@Pc(531) int local531 = local495[local507 - local500[local503]];
				while (true) {
					while (local531 != local420) {
						if (local531 == 0 || local531 == 1) {
							@Pc(541) int local541 = -1;
							@Pc(543) int local543 = 1;
							do {
								if (local531 == 0) {
									local541 += local543;
								} else if (local531 == 1) {
									local541 += local543 * 2;
								}
								local543 *= 2;
								if (local501 == 0) {
									local473++;
									local501 = 50;
									local480 = state.aByteArray56[local473];
									local485 = state.anIntArray324[local480];
									local490 = state.anIntArrayArray39[local480];
									local495 = state.anIntArrayArray37[local480];
									local500 = state.anIntArrayArray38[local480];
								}
								local501--;
								local503 = local485;
								for (local507 = getBits(local485, state); local507 > local490[local503]; local507 = local507 << 1 | local516) {
									local503++;
									local516 = method3737(state);
								}
								local531 = local495[local507 - local500[local503]];
							} while (local531 == 0 || local531 == 1);
							local541++;
							uc = state.aByteArray53[state.aByteArray52[state.anIntArray326[0]] & 0xFF];
							state.anIntArray327[uc & 0xFF] += local541;
							while (local541 > 0) {
								Bzip2DState.tt[local470] = uc & 0xFF;
								local470++;
								local541--;
							}
						} else {
							@Pc(669) int local669 = local531 - 1;
							@Pc(677) int local677;
							if (local669 < 16) {
								local677 = state.anIntArray326[0];
								uc = state.aByteArray52[local677 + local669];
								while (local669 > 3) {
									@Pc(689) int local689 = local677 + local669;
									state.aByteArray52[local689] = state.aByteArray52[local689 - 1];
									state.aByteArray52[local689 - 1] = state.aByteArray52[local689 - 2];
									state.aByteArray52[local689 - 2] = state.aByteArray52[local689 - 3];
									state.aByteArray52[local689 - 3] = state.aByteArray52[local689 - 4];
									local669 -= 4;
								}
								while (local669 > 0) {
									state.aByteArray52[local677 + local669] = state.aByteArray52[local677 + local669 - 1];
									local669--;
								}
								state.aByteArray52[local677] = uc;
							} else {
								@Pc(767) int local767 = local669 / 16;
								@Pc(771) int local771 = local669 % 16;
								local677 = state.anIntArray326[local767] + local771;
								uc = state.aByteArray52[local677];
								while (local677 > state.anIntArray326[local767]) {
									state.aByteArray52[local677] = state.aByteArray52[local677 - 1];
									local677--;
								}
								@Pc(806) int local806 = state.anIntArray326[local767]++;
								while (local767 > 0) {
									local806 = state.anIntArray326[local767]--;
									state.aByteArray52[state.anIntArray326[local767]] = state.aByteArray52[state.anIntArray326[local767 - 1] + 16 - 1];
									local767--;
								}
								local806 = state.anIntArray326[0]--;
								state.aByteArray52[state.anIntArray326[0]] = uc;
								if (state.anIntArray326[0] == 0) {
									@Pc(864) int local864 = 4095;
									for (@Pc(866) int local866 = 15; local866 >= 0; local866--) {
										for (@Pc(869) int local869 = 15; local869 >= 0; local869--) {
											state.aByteArray52[local864] = state.aByteArray52[state.anIntArray326[local866] + local869];
											local864--;
										}
										state.anIntArray326[local866] = local864 + 1;
									}
								}
							}
							state.anIntArray327[state.aByteArray53[uc & 0xFF] & 0xFF]++;
							Bzip2DState.tt[local470] = state.aByteArray53[uc & 0xFF] & 0xFF;
							local470++;
							if (local501 == 0) {
								local473++;
								local501 = 50;
								local480 = state.aByteArray56[local473];
								local485 = state.anIntArray324[local480];
								local490 = state.anIntArrayArray39[local480];
								local495 = state.anIntArrayArray37[local480];
								local500 = state.anIntArrayArray38[local480];
							}
							local501--;
							local503 = local485;
							for (local507 = getBits(local485, state); local507 > local490[local503]; local507 = local507 << 1 | local516) {
								local503++;
								local516 = method3737(state);
							}
							local531 = local495[local507 - local500[local503]];
						}
					}
					state.anInt4798 = 0;
					state.aByte53 = 0;
					state.anIntArray325[0] = 0;
					for (local138 = 1; local138 <= 256; local138++) {
						state.anIntArray325[local138] = state.anIntArray327[local138 - 1];
					}
					for (local138 = 1; local138 <= 256; local138++) {
						state.anIntArray325[local138] += state.anIntArray325[local138 - 1];
					}
					for (local138 = 0; local138 < local470; local138++) {
						uc = (byte) (Bzip2DState.tt[local138] & 0xFF);
						Bzip2DState.tt[state.anIntArray325[uc & 0xFF]] |= local138 << 8;
						state.anIntArray325[uc & 0xFF]++;
					}
					state.anInt4792 = Bzip2DState.tt[state.anInt4799] >> 8;
					state.anInt4801 = 0;
					state.anInt4792 = Bzip2DState.tt[state.anInt4792];
					state.anInt4797 = (byte) (state.anInt4792 & 0xFF);
					state.anInt4792 >>= 0x8;
					state.anInt4801++;
					state.anInt4800 = local470;
					method3736(state);
					if (state.anInt4801 == state.anInt4800 + 1 && state.anInt4798 == 0) {
						gotoBzXBlkhdr1 = true;
						break;
					}
					gotoBzXBlkhdr1 = false;
					break;
				}
			}
			return;
		}
	}
}
