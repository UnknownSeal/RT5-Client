import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "F")
	public static float aFloat74;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Lclient!rn;")
	public static BufferedFile aBufferedFile_6;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!mr;BZ)V")
	public static void method5547(@OriginalArg(0) Class11_Sub5_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) BasType local9 = arg0.method4331();
		if (arg0.movementQueueSize == 0) {
			arg0.anInt4641 = 0;
			Static16.anInt4756 = 0;
			Static170.anInt3229 = -1;
			return;
		}
		if (arg0.anInt4597 != -1 && arg0.anInt4590 == 0) {
			@Pc(39) Class157 local39 = Static39.aClass85_1.method2371(arg0.anInt4597);
			if (arg0.anInt4642 > 0 && local39.anInt4027 == 0) {
				Static16.anInt4756 = 0;
				Static170.anInt3229 = -1;
				arg0.anInt4641++;
				return;
			}
			if (arg0.anInt4642 <= 0 && local39.anInt4029 == 0) {
				Static170.anInt3229 = -1;
				Static16.anInt4756 = 0;
				arg0.anInt4641++;
				return;
			}
		}
		if (arg0.anInt4594 != -1 && arg0.anInt4595 <= Static114.loop) {
			@Pc(97) Class91 local97 = Static322.aClass211_2.method5406(arg0.anInt4594);
			if (local97.aBoolean177 && local97.anInt2448 != -1) {
				@Pc(111) Class157 local111 = Static39.aClass85_1.method2371(local97.anInt2448);
				if (arg0.anInt4642 > 0 && local111.anInt4027 == 0) {
					Static16.anInt4756 = 0;
					arg0.anInt4641++;
					Static170.anInt3229 = -1;
					return;
				}
				if (arg0.anInt4642 <= 0 && local111.anInt4029 == 0) {
					arg0.anInt4641++;
					Static170.anInt3229 = -1;
					Static16.anInt4756 = 0;
					return;
				}
			}
		}
		@Pc(154) int local154 = arg0.xFine;
		@Pc(157) int local157 = arg0.zFine;
		@Pc(174) int local174 = arg0.anIntArray316[arg0.movementQueueSize - 1] * 128 + arg0.method4327() * 64;
		@Pc(191) int local191 = arg0.anIntArray317[arg0.movementQueueSize - 1] * 128 + arg0.method4327() * 64;
		if (local174 > local154) {
			if (local157 < local191) {
				arg0.method4324(10240);
			} else if (local191 >= local157) {
				arg0.method4324(12288);
			} else {
				arg0.method4324(14336);
			}
		} else if (local154 > local174) {
			if (local191 > local157) {
				arg0.method4324(6144);
			} else if (local157 > local191) {
				arg0.method4324(2048);
			} else {
				arg0.method4324(4096);
			}
		} else if (local191 > local157) {
			arg0.method4324(8192);
		} else if (local191 < local157) {
			arg0.method4324(0);
		}
		@Pc(289) byte local289 = arg0.aByteArray51[arg0.movementQueueSize - 1];
		if (!arg1 && (local174 - local154 > 256 || local174 - local154 < -256 || local191 - local157 > 256 || local191 - local157 < -256)) {
			arg0.zFine = local191;
			arg0.xFine = local174;
			arg0.method4329(arg0.anInt4616);
			arg0.movementQueueSize--;
			Static170.anInt3229 = -1;
			if (arg0.anInt4642 > 0) {
				arg0.anInt4642--;
			}
			Static16.anInt4756 = 0;
			return;
		}
		@Pc(354) int local354 = 4;
		@Pc(356) boolean local356 = true;
		if (arg0 instanceof Npc) {
			local356 = ((Npc) arg0).type.rotationflag;
		}
		@Pc(396) int local396;
		if (local356) {
			local396 = arg0.anInt4616 - arg0.aClass248_7.anInt7197;
			if (local396 != 0 && arg0.anInt4611 == -1 && arg0.anInt4604 != 0) {
				local354 = 2;
			}
			if (!arg1 && arg0.movementQueueSize > 2) {
				local354 = 6;
			}
			if (!arg1 && arg0.movementQueueSize > 3) {
				local354 = 8;
			}
		} else {
			if (!arg1 && arg0.movementQueueSize > 1) {
				local354 = 6;
			}
			if (!arg1 && arg0.movementQueueSize > 2) {
				local354 = 8;
			}
		}
		if (arg0.anInt4641 > 0 && arg0.movementQueueSize > 1) {
			arg0.anInt4641--;
			local354 = 8;
		}
		if (local289 == 2) {
			local354 <<= 0x1;
		} else if (local289 == 0) {
			local354 >>= 0x1;
		}
		Static16.anInt4756 = 0;
		if (local9.anInt6274 != -1) {
			local354 <<= 0x7;
			if (arg0.movementQueueSize == 1) {
				local396 = arg0.anInt4640 * arg0.anInt4640;
				@Pc(554) int local554 = (local174 >= arg0.xFine ? local174 - arg0.xFine : -local174 + arg0.xFine) << 7;
				@Pc(572) int local572 = (arg0.zFine <= local191 ? local191 - arg0.zFine : -local191 + arg0.zFine) << 7;
				@Pc(583) int local583 = local572 < local554 ? local554 : local572;
				@Pc(590) int local590 = local9.anInt6274 * 2 * local583;
				if (local396 > local590) {
					arg0.anInt4640 /= 2;
				} else if (local583 < local396 / 2) {
					arg0.anInt4640 -= local9.anInt6274;
					if (arg0.anInt4640 < 0) {
						arg0.anInt4640 = 0;
					}
				} else if (local354 > arg0.anInt4640) {
					arg0.anInt4640 += local9.anInt6274;
					if (local354 < arg0.anInt4640) {
						arg0.anInt4640 = local354;
					}
				}
			} else if (local354 > arg0.anInt4640) {
				arg0.anInt4640 += local9.anInt6274;
				if (local354 < arg0.anInt4640) {
					arg0.anInt4640 = local354;
				}
			} else if (arg0.anInt4640 > 0) {
				arg0.anInt4640 -= local9.anInt6274;
				if (arg0.anInt4640 < 0) {
					arg0.anInt4640 = 0;
				}
			}
			local354 = arg0.anInt4640 >> 7;
			if (local354 < 1) {
				local354 = 1;
			}
		}
		if (local154 < local174) {
			Static16.anInt4756 |= 0x4;
			arg0.xFine += local354;
			if (local174 < arg0.xFine) {
				arg0.xFine = local174;
			}
		} else if (local174 < local154) {
			Static16.anInt4756 |= 0x8;
			arg0.xFine -= local354;
			if (local174 > arg0.xFine) {
				arg0.xFine = local174;
			}
		}
		if (local157 < local191) {
			arg0.zFine += local354;
			Static16.anInt4756 |= 0x1;
			if (local191 < arg0.zFine) {
				arg0.zFine = local191;
			}
		} else if (local157 > local191) {
			Static16.anInt4756 |= 0x2;
			arg0.zFine -= local354;
			if (local191 > arg0.zFine) {
				arg0.zFine = local191;
			}
		}
		if (local354 < 8) {
			Static170.anInt3229 = local289;
		} else {
			Static170.anInt3229 = 2;
		}
		if (local174 != arg0.xFine || local191 != arg0.zFine) {
			return;
		}
		arg0.movementQueueSize--;
		if (arg0.anInt4642 > 0) {
			arg0.anInt4642--;
			return;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)V")
	public static void method5548(@OriginalArg(1) int arg0) {
		Static233.anInt4199 = arg0;
		@Pc(15) SoftLruHashTable local15 = Static349.A_SOFT_LRU_HASH_TABLE___58;
		synchronized (Static349.A_SOFT_LRU_HASH_TABLE___58) {
			Static349.A_SOFT_LRU_HASH_TABLE___58.method2614();
		}
		local15 = Static92.bodyModels;
		synchronized (Static92.bodyModels) {
			Static92.bodyModels.method2614();
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!bt;I)V")
	public static void decodeWorlds(@OriginalArg(0) Buffer buffer) {
		@Pc(9) int countryCount = buffer.gsmarts();
		Static363.countries = new Country[countryCount];
		for (@Pc(22) int i = 0; i < countryCount; i++) {
			Static363.countries[i] = new Country();
			Static363.countries[i].flag = buffer.gsmarts();
			Static363.countries[i].name = buffer.gjstr2();
		}
		Static375.minID = buffer.gsmarts();
		Static312.maxID = buffer.gsmarts();
		Static299.size = buffer.gsmarts();
		Static295.worlds = new World[Static312.maxID + 1 - Static375.minID];
		for (@Pc(70) int i = 0; i < Static299.size; i++) {
			@Pc(76) int offset = buffer.gsmarts();
			@Pc(84) World world = Static295.worlds[offset] = new World();
			world.country = buffer.g1();
			world.flags = buffer.mg4();
			world.worldID = Static375.minID + offset;
			world.activity = buffer.gjstr2();
			world.hostname = buffer.gjstr2();
		}
		Static361.checksum = buffer.mg4();
		Static70.loaded = true;
	}

}
