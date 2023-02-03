import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class11_Sub5_Sub2_Sub1 extends Class11_Sub5_Sub2 {

	@OriginalMember(owner = "client!nh", name = "pc", descriptor = "Ljava/lang/String;")
	public String aString41;

	@OriginalMember(owner = "client!nh", name = "tc", descriptor = "I")
	public int anInt4169;

	@OriginalMember(owner = "client!nh", name = "Gc", descriptor = "I")
	public int anInt4181;

	@OriginalMember(owner = "client!nh", name = "Rc", descriptor = "Ljava/lang/String;")
	public String username;

	@OriginalMember(owner = "client!nh", name = "Wc", descriptor = "I")
	private int anInt4195;

	@OriginalMember(owner = "client!nh", name = "ed", descriptor = "Lclient!jo;")
	public PlayerAppearance appearance;

	@OriginalMember(owner = "client!nh", name = "rc", descriptor = "I")
	public int anInt4167 = -1;

	@OriginalMember(owner = "client!nh", name = "vc", descriptor = "I")
	public int anInt4171 = 0;

	@OriginalMember(owner = "client!nh", name = "Mc", descriptor = "I")
	public int anInt4187 = -1;

	@OriginalMember(owner = "client!nh", name = "yc", descriptor = "I")
	public int anInt4174 = -1;

	@OriginalMember(owner = "client!nh", name = "xc", descriptor = "I")
	public int anInt4173 = 0;

	@OriginalMember(owner = "client!nh", name = "zc", descriptor = "B")
	private byte aByte39 = 0;

	@OriginalMember(owner = "client!nh", name = "Sc", descriptor = "I")
	public int anInt4191 = -1;

	@OriginalMember(owner = "client!nh", name = "Oc", descriptor = "I")
	public int anInt4188 = -1;

	@OriginalMember(owner = "client!nh", name = "sc", descriptor = "I")
	public int anInt4168 = -1;

	@OriginalMember(owner = "client!nh", name = "Uc", descriptor = "I")
	public int anInt4193 = 0;

	@OriginalMember(owner = "client!nh", name = "mc", descriptor = "B")
	private byte aByte38 = 0;

	@OriginalMember(owner = "client!nh", name = "Ec", descriptor = "I")
	public int combatLevel = 0;

	@OriginalMember(owner = "client!nh", name = "Zc", descriptor = "I")
	public int anInt4198 = -1;

	@OriginalMember(owner = "client!nh", name = "dd", descriptor = "B")
	private byte aByte40 = 0;

	@OriginalMember(owner = "client!nh", name = "Nc", descriptor = "Z")
	public boolean aBoolean275 = false;

	@OriginalMember(owner = "client!nh", name = "Hc", descriptor = "I")
	public int anInt4182 = 0;

	@OriginalMember(owner = "client!nh", name = "Xc", descriptor = "I")
	public int anInt4196 = -1;

	@OriginalMember(owner = "client!nh", name = "gd", descriptor = "I")
	public int anInt4201 = 255;

	@OriginalMember(owner = "client!nh", name = "cd", descriptor = "Z")
	public boolean aBoolean276 = false;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6069(@OriginalArg(0) Class19 arg0) {
		if (this.appearance != null && (super.aBoolean321 || this.method4066(arg0, 0))) {
			this.method4332(arg0, super.aModelArray3, super.aBoolean321);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ)V")
	public void method4063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.movementQueueSize = 0;
		super.anInt4641 = 0;
		super.anIntArray316[0] = arg0;
		super.anInt4642 = 0;
		super.anIntArray317[0] = arg1;
		@Pc(32) int local32 = this.method4327();
		super.xFine = local32 * 64 + super.anIntArray316[0] * 128;
		super.zFine = super.anIntArray317[0] * 128 + local32 * 64;
		if (Static17.self == this) {
			Static348.method5827();
		}
		if (super.particleSystem != null) {
			super.particleSystem.method4358();
		}
	}

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "(I)Z")
	public boolean method4064() {
		return this.appearance != null;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)I")
	@Override
	public int method4323() {
		return -1;
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
	@Override
	public void method6068() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6075() {
		return false;
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(B)I")
	@Override
	protected int method4328() {
		return this.anInt4195;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!bt;I)V")
	public void method4065(@OriginalArg(0) Buffer arg0) {
		arg0.offset = 0;
		@Pc(12) int local12 = arg0.g1();
		this.aByte39 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(41) int local41 = super.method4327();
		this.setSize((local12 >> 3 & 0x7) + 1);
		this.aByte40 = (byte) (local12 >> 6 & 0x3);
		super.xFine += (this.method4327() - local41) * 64;
		super.zFine += (this.method4327() - local41) * 64;
		this.aByte38 = arg0.g1b();
		this.anInt4188 = arg0.g1b();
		this.anInt4198 = arg0.g1b();
		this.anInt4193 = 0;
		@Pc(113) int local113 = -1;
		@Pc(116) int[] local116 = new int[12];
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(182) int local182;
		for (@Pc(118) int local118 = 0; local118 < 12; local118++) {
			@Pc(124) int local124 = arg0.g1();
			if (local124 == 0) {
				local116[local118] = 0;
			} else {
				local136 = arg0.g1();
				local143 = (local124 << 8) + local136;
				if (local118 == 0 && local143 == 65535) {
					local113 = arg0.g2();
					this.anInt4193 = arg0.g1();
					break;
				}
				if (local143 >= 32768) {
					local143 = Static12.anIntArray15[local143 - 32768];
					local116[local118] = local143 | 0x40000000;
					local182 = ObjTypeList.objTypeList.get(local143).team;
					if (local182 != 0) {
						this.anInt4193 = local182;
					}
				} else {
					local116[local118] = local143 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(207) int[] local207 = new int[5];
		for (local136 = 0; local136 < 5; local136++) {
			local143 = arg0.g1();
			if (local143 < 0 || local143 >= Static353.aShortArrayArray7[local136].length) {
				local143 = 0;
			}
			local207[local136] = local143;
		}
		this.anInt4195 = arg0.g2();
		this.username = arg0.gjstr();
		if (local29) {
			this.aString41 = arg0.gjstr();
		} else {
			this.aString41 = this.username;
		}
		this.combatLevel = arg0.g1();
		if (local37) {
			this.anInt4173 = arg0.g2();
			this.anInt4191 = -1;
			this.anInt4171 = this.combatLevel;
		} else {
			this.anInt4173 = 0;
			this.anInt4171 = arg0.g1();
			this.anInt4191 = arg0.g1();
			if (this.anInt4191 == 255) {
				this.anInt4191 = -1;
			}
		}
		local143 = this.anInt4182;
		this.anInt4182 = arg0.g1();
		@Pc(327) int local327;
		if (this.anInt4182 == 0) {
			Static298.method2423(this);
		} else {
			local182 = this.anInt4167;
			@Pc(324) int local324 = this.anInt4187;
			local327 = this.anInt4168;
			@Pc(330) int local330 = this.anInt4196;
			@Pc(333) int local333 = this.anInt4201;
			this.anInt4167 = arg0.g2();
			this.anInt4187 = arg0.g2();
			this.anInt4168 = arg0.g2();
			this.anInt4196 = arg0.g2();
			this.anInt4201 = arg0.g1();
			if (local143 != this.anInt4182 || this.anInt4167 != local182 || local324 != this.anInt4187 || this.anInt4168 != local327 || this.anInt4196 != local330 || local333 != this.anInt4201) {
				Static324.method5541(this);
			}
		}
		if (this.appearance == null) {
			this.appearance = new PlayerAppearance();
		}
		local182 = this.appearance.npcID;
		@Pc(410) int[] local410 = this.appearance.colors;
		this.appearance.method3179(local207, local116, this.aByte39 == 1, local113, this.method4328());
		if (local113 != local182) {
			super.xFine = super.anIntArray316[0] * 128 + this.method4327() * 64;
			super.zFine = super.anIntArray317[0] * 128 + this.method4327() * 64;
		}
		if (Static234.anInt4226 == super.anInt4619 && local410 != null) {
			for (local327 = 0; local327 < local207.length; local327++) {
				if (local207[local327] != local410[local327]) {
					ObjTypeList.objTypeList.method2760();
					break;
				}
			}
		}
		if (super.particleSystem != null) {
			super.particleSystem.method4358();
		}
		if (super.anInt4585 == -1 || !super.aBoolean317) {
			return;
		}
		@Pc(513) BasType local513 = this.method4331();
		if (!local513.method5691(super.anInt4585)) {
			super.anInt4585 = -1;
			super.aBoolean317 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!wm;I)Z")
	private boolean method4066(@OriginalArg(1) Class19 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(13) BasType local13 = this.method4331();
		@Pc(28) Class157 local28 = super.anInt4597 != -1 && super.anInt4590 == 0 ? Static39.aClass85_1.method2371(super.anInt4597) : null;
		@Pc(48) Class157 local48 = super.anInt4585 == -1 || this.aBoolean275 || super.aBoolean317 && local28 != null ? null : Static39.aClass85_1.method2371(super.anInt4585);
		@Pc(51) int local51 = local13.anInt6287;
		@Pc(54) int local54 = local13.anInt6290;
		if (local51 != 0 || local54 != 0 || local13.anInt6281 != 0 || local13.anInt6283 != 0) {
			arg1 |= 0x7;
		}
		super.aModelArray3[0] = this.appearance.getBodyModel(super.anInt4624, Static59.aClass7_1, Static39.aClass85_1, IdentityKitTypeList.identityKitTypeList, local28, super.anInt4592, super.anInt4629, arg1, super.anInt4593, super.anInt4626, local48, Static214.aClass226_1, ObjTypeList.objTypeList, arg0, Static6.aClass219_1, super.aClass20Array3, super.anInt4607);
		@Pc(116) int local116 = Static365.getModelCacheSize();
		if (GameShell.maxMemory < 96 && local116 > 50) {
			Static163.method3104();
		}
		@Pc(136) int local136;
		if (Static189.aClass127_6 != Static121.aClass127_4 && local116 < 50) {
			local136 = 50 - local116;
			while (Static50.anInt1332 < local136) {
				Static26.fakeModelCacheEntries[Static50.anInt1332] = new byte[102400];
				Static50.anInt1332++;
			}
			while (local136 < Static50.anInt1332) {
				Static50.anInt1332--;
				Static26.fakeModelCacheEntries[Static50.anInt1332] = null;
			}
		} else if (Static121.aClass127_4 != Static189.aClass127_6) {
			Static50.anInt1332 = 0;
			Static26.fakeModelCacheEntries = new byte[50][];
		}
		if (super.aModelArray3[0] == null) {
			return false;
		}
		super.anInt4630 = super.aModelArray3[0].method3801();
		this.method4319(super.aModelArray3[0]);
		local136 = super.aClass248_7.method6440();
		super.anInt4596 = 0;
		super.anInt4608 = 0;
		super.anInt4589 = 0;
		if (local51 == 0 && local54 == 0) {
			this.method4320(this.method4327() << 7, this.method4327() << 7, local136);
		} else {
			this.method4320(local54, local51, local136);
			if (super.anInt4589 != 0) {
				super.aModelArray3[0].method3823(super.anInt4589);
			}
			if (super.anInt4596 != 0) {
				super.aModelArray3[0].method3814(super.anInt4596);
			}
			if (super.anInt4608 != 0) {
				super.aModelArray3[0].method3812(0, super.anInt4608, 0);
			}
		}
		super.aModelArray3[1] = null;
		if (!this.aBoolean275 && super.anInt4594 != -1 && super.anInt4582 != -1) {
			@Pc(302) Class91 local302 = Static322.aClass211_2.method5406(super.anInt4594);
			@Pc(322) Model local322 = local302.method2433(super.anInt4612, super.anInt4620, arg0, (local302.aBoolean178 ? 7 : 2) | local7, Static39.aClass85_1, super.anInt4582);
			if (local322 != null) {
				local322.method3812(0, -super.anInt4639, 0);
				if (local302.aBoolean178 && (local51 != 0 || local54 != 0)) {
					if (super.anInt4589 != 0) {
						local322.method3823(super.anInt4589);
					}
					if (super.anInt4596 != 0) {
						local322.method3814(super.anInt4596);
					}
					if (super.anInt4608 != 0) {
						local322.method3812(0, super.anInt4608, 0);
					}
				}
				super.aModelArray3[1] = local322;
			}
		}
		super.aModelArray3[2] = null;
		if (!this.aBoolean275 && super.aClass2_Sub6_3 != null) {
			if (Static114.loop >= super.aClass2_Sub6_3.anInt1118) {
				super.aClass2_Sub6_3 = null;
			} else if (Static114.loop >= super.aClass2_Sub6_3.anInt1100) {
				@Pc(410) Model local410 = super.aClass2_Sub6_3.method1360(arg0, local7 | 0x7);
				if (local410 != null) {
					local410.method3812(super.aClass2_Sub6_3.anInt1104 - super.xFine, super.aClass2_Sub6_3.anInt1114 + -super.anInt6782, super.aClass2_Sub6_3.anInt1101 - super.zFine);
					if (local136 != 0) {
						local410.method3832(-local136 & 0x3FFF);
					}
					super.aModelArray3[2] = local410;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIB)V")
	public void method4067(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt4597 != -1 && Static39.aClass85_1.method2371(super.anInt4597).movetype == 1) {
			super.anInt4597 = -1;
		}
		if (super.anInt4594 != -1) {
			@Pc(37) Class91 local37 = Static322.aClass211_2.method5406(super.anInt4594);
			if (local37.aBoolean177 && local37.anInt2448 != -1 && Static39.aClass85_1.method2371(local37.anInt2448).movetype == 1) {
				super.anInt4594 = -1;
			}
		}
		this.anInt4174 = -1;
		if (arg1 < 0 || Static373.anInt7033 <= arg1 || arg0 < 0 || Static242.anInt4449 <= arg0) {
			this.method4063(arg1, arg0);
		} else if (super.anIntArray316[0] >= 0 && super.anIntArray316[0] < Static373.anInt7033 && super.anIntArray317[0] >= 0 && Static242.anInt4449 > super.anIntArray317[0]) {
			if (arg2 == 2) {
				Static376.method6283(this, arg1, arg0);
			}
			this.method4070(arg0, arg2, arg1);
		} else {
			this.method4063(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)I")
	@Override
	public int method6079() {
		return super.anInt4630;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6072(@OriginalArg(0) Class19 arg0) {
		if (this.appearance == null || !this.method4066(arg0, 1024)) {
			return null;
		}
		@Pc(19) Class14 local19 = arg0.method2808();
		@Pc(24) int local24 = super.aClass248_7.method6440();
		local19.method3924(local24);
		local19.method3935(super.xFine, super.anInt6782, super.zFine);
		@Pc(45) float local45 = arg0.method2802();
		@Pc(48) float local48 = arg0.method2860();
		if (Static218.preferences.characterShadows) {
			@Pc(55) BasType local55 = this.method4331();
			if (local55.aBoolean424 && (this.appearance.npcID == -1 || Static6.aClass219_1.get(this.appearance.npcID).hasshadow)) {
				@Pc(87) Class157 local87 = super.anInt4597 != -1 && super.anInt4590 == 0 ? Static39.aClass85_1.method2371(super.anInt4597) : null;
				@Pc(108) Class157 local108 = super.anInt4585 == -1 || this.aBoolean275 || super.aBoolean317 && local87 != null ? null : Static39.aClass85_1.method2371(super.anInt4585);
				@Pc(142) Model local142 = Static178.method2340(local108 == null ? super.anInt4607 : super.anInt4626, 240, 160, super.anInt4596, local108 == null ? local87 : local108, 1, 0, super.aModelArray3[0], local24, arg0, 0, super.aBoolean318, super.anInt4608, super.anInt4589);
				if (local142 != null) {
					arg0.method2823(local45, local48 - 128.0F);
					arg0.method2852(false);
					local142.method3834(local19, null, 0);
					arg0.method2852(true);
				}
			}
		}
		if (Static17.self == this) {
			arg0.method2823(local45, local48 - 144.0F);
			local19.method3921(super.xFine, super.anInt6782, super.zFine);
			for (@Pc(183) int local183 = Static50.aClass84Array1.length - 1; local183 >= 0; local183--) {
				@Pc(189) Class84 local189 = Static50.aClass84Array1[local183];
				if (local189 != null && local189.anInt2361 != -1) {
					@Pc(239) int local239;
					@Pc(228) int local228;
					if (local189.anInt2355 == 1 && local189.anInt2354 >= 0 && local189.anInt2354 < Static365.npcs.length) {
						@Pc(215) Npc local215 = Static365.npcs[local189.anInt2354];
						if (local215 != null) {
							local228 = local215.xFine / 32 - Static17.self.xFine / 32;
							local239 = local215.zFine / 32 - Static17.self.zFine / 32;
							this.method4072(local189.anInt2361, 360000, local228, local239, local19, super.aModelArray3[0], arg0);
						}
					}
					if (local189.anInt2355 == 2) {
						@Pc(273) int local273 = (local189.anInt2352 - Static164.originX) * 4 + 2 - Static17.self.xFine / 32;
						local228 = (local189.anInt2364 - Static148.originZ) * 4 + 2 - Static17.self.zFine / 32;
						local239 = local189.anInt2349 * 4;
						local239 *= local239;
						this.method4072(local189.anInt2361, local239, local273, local228, local19, super.aModelArray3[0], arg0);
					}
					if (local189.anInt2355 == 10 && local189.anInt2354 >= 0 && Static12.aClass11_Sub5_Sub2_Sub1Array1.length > local189.anInt2354) {
						@Pc(332) Class11_Sub5_Sub2_Sub1 local332 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local189.anInt2354];
						if (local332 != null) {
							local228 = local332.xFine / 32 - Static17.self.xFine / 32;
							local239 = local332.zFine / 32 - Static17.self.zFine / 32;
							this.method4072(local189.anInt2361, 360000, local228, local239, local19, super.aModelArray3[0], arg0);
						}
					}
				}
			}
			local19.method3924(local24);
			local19.method3935(super.xFine, super.anInt6782, super.zFine);
		}
		arg0.method2823(local45, local48);
		@Pc(397) Class12_Sub4 local397 = Static147.method2706(super.aModelArray3.length);
		if (super.particleSystem == null) {
			arg0.method2881(super.aModelArray3, local19, local397.aClass12_Sub2Array1, Static17.self == this ? 1 : 0);
		} else {
			@Pc(419) Class224 local419 = super.particleSystem.method4357();
			arg0.method2830(super.aModelArray3, local419, local19, local397.aClass12_Sub2Array1, Static17.self == this ? 1 : 0);
		}
		this.method4332(arg0, super.aModelArray3, false);
		if (super.aModelArray3[2] != null) {
			if (local24 != 0) {
				super.aModelArray3[2].method3832(local24);
			}
			super.aModelArray3[2].method3812(super.xFine - super.aClass2_Sub6_3.anInt1104, super.anInt6782 + -super.aClass2_Sub6_3.anInt1114, -super.aClass2_Sub6_3.anInt1101 + super.zFine);
		}
		super.anInt4603 = Static163.anInt3086;
		return local397;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		if (this.appearance == null || !this.method4066(arg2, 65536)) {
			return true;
		}
		@Pc(19) Class14 local19 = arg2.method2808();
		@Pc(24) int local24 = super.aClass248_7.method6440();
		local19.method3924(local24);
		local19.method3935(super.xFine, super.anInt6782, super.zFine);
		for (@Pc(42) int local42 = 0; local42 < super.aModelArray3.length; local42++) {
			if (super.aModelArray3[local42] != null && super.aModelArray3[local42].method3819(arg0, arg1, local19, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)I")
	@Override
	public int method4327() {
		return this.appearance == null || this.appearance.npcID == -1 ? super.method4327() : Static6.aClass219_1.get(this.appearance.npcID).size;
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(ZI)Ljava/lang/String;")
	public String method4069() {
		return this.aString41;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIBI)V")
	public void method4070(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.movementQueueSize < 9) {
			super.movementQueueSize++;
		}
		for (@Pc(18) int local18 = super.movementQueueSize; local18 > 0; local18--) {
			super.anIntArray316[local18] = super.anIntArray316[local18 - 1];
			super.anIntArray317[local18] = super.anIntArray317[local18 - 1];
			super.aByteArray51[local18] = super.aByteArray51[local18 - 1];
		}
		super.anIntArray316[0] = arg2;
		super.anIntArray317[0] = arg0;
		super.aByteArray51[0] = arg1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method4071() {
		@Pc(17) String local17 = "";
		if (Static129.aStringArray19 != null) {
			local17 = local17 + Static129.aStringArray19[this.aByte40];
		}
		@Pc(39) int[] local39;
		if (this.aByte39 == 1 && Static324.anIntArray412 != null) {
			local39 = Static324.anIntArray412;
		} else {
			local39 = Static117.anIntArray150;
		}
		if (local39 != null && local39[this.aByte40] != -1) {
			@Pc(59) EnumType local59 = EnumTypeList.enumTypeList.get(local39[this.aByte40]);
			if (local59.valueType == 's') {
				local17 = local17 + local59.getString(this.aByte38 & 0xFF);
			} else {
				Static262.report(new Throwable(), "gdn1");
				local39[this.aByte40] = -1;
			}
		}
		local17 = local17 + this.username;
		if (Static333.aStringArray67 != null) {
			local17 = local17 + Static333.aStringArray67[this.aByte40];
		}
		return local17;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZIIIILclient!on;Lclient!gn;Lclient!wm;)V")
	private void method4072(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class14 arg4, @OriginalArg(6) Model arg5, @OriginalArg(7) Class19 arg6) {
		@Pc(11) int local11 = arg3 * arg3 + arg2 * arg2;
		if (local11 < 16 || local11 > arg1) {
			return;
		}
		@Pc(35) int local35 = (int) (Math.atan2((double) arg2, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(54) Model local54 = Static107.method2237(arg6, super.anInt6782, super.zFine, super.anInt4596, arg0, local35, super.anInt4589, super.anInt4608, arg5, super.xFine);
		if (local54 != null) {
			arg6.method2852(false);
			local54.method3834(arg4, null, 0);
			arg6.method2852(true);
		}
	}
}
