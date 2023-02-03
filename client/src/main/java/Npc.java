import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Npc extends Class11_Sub5_Sub2 {

	@OriginalMember(owner = "client!oe", name = "tc", descriptor = "Lclient!fk;")
	public NpcType type;

	@OriginalMember(owner = "client!oe", name = "Ac", descriptor = "I")
	public int anInt4657 = -1;

	@OriginalMember(owner = "client!oe", name = "Gc", descriptor = "I")
	public int anInt4663 = -1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!wm;)Z")
	private boolean method4334(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) BasType local11 = this.method4331();
		@Pc(27) SeqType local27 = super.anInt4597 != -1 && super.anInt4590 == 0 ? SeqTypeList.seqTypeList.method2371(super.anInt4597) : null;
		@Pc(45) SeqType local45 = super.anInt4585 == -1 || super.aBoolean317 && local27 != null ? null : SeqTypeList.seqTypeList.method2371(super.anInt4585);
		@Pc(48) int local48 = local11.anInt6287;
		@Pc(51) int local51 = local11.anInt6290;
		if (local48 != 0 || local51 != 0 || local11.anInt6281 != 0 || local11.anInt6283 != 0) {
			arg0 |= 0x7;
		}
		@Pc(102) Model local102 = super.aModelArray3[0] = this.type.getBodyModel(Static59.aClass7_1, super.anInt4607, local27, arg1, SeqTypeList.seqTypeList, super.anInt4629, super.anInt4626, super.anInt4593, local45, arg0, super.aClass20Array3, super.anInt4624, Static214.aClass226_1, super.anInt4592);
		if (local102 == null) {
			return false;
		}
		super.anInt4630 = local102.method3801();
		this.method4319(local102);
		@Pc(119) int local119 = super.aClass248_7.method6440();
		super.anInt4589 = 0;
		super.anInt4608 = 0;
		super.anInt4596 = 0;
		if (local48 == 0 && local51 == 0) {
			this.method4320(this.method4327() << 7, this.method4327() << 7, local119);
		} else {
			this.method4320(local51, local48, local119);
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
		if (super.anInt4594 != -1 && super.anInt4582 != -1) {
			@Pc(218) Class91 local218 = Static322.aClass211_2.get(super.anInt4594);
			@Pc(238) Model local238 = local218.method2433(super.anInt4612, super.anInt4620, arg1, (local218.aBoolean178 ? 7 : 2) | local7, SeqTypeList.seqTypeList, super.anInt4582);
			if (local238 != null) {
				local238.method3812(0, -super.anInt4639, 0);
				if (local218.aBoolean178 && (local48 != 0 || local51 != 0)) {
					if (super.anInt4589 != 0) {
						local238.method3823(super.anInt4589);
					}
					if (super.anInt4596 != 0) {
						local238.method3814(super.anInt4596);
					}
					if (super.anInt4608 != 0) {
						local238.method3812(0, super.anInt4608, 0);
					}
				}
				super.aModelArray3[1] = local238;
			}
		}
		super.aModelArray3[2] = null;
		if (super.aClass2_Sub6_3 != null) {
			if (super.aClass2_Sub6_3.anInt1118 <= Static114.loop) {
				super.aClass2_Sub6_3 = null;
			} else if (Static114.loop >= super.aClass2_Sub6_3.anInt1100) {
				@Pc(331) Model local331 = super.aClass2_Sub6_3.method1360(arg1, local7 | 0x7);
				if (local331 != null) {
					local331.method3812(-super.xFine + super.aClass2_Sub6_3.anInt1104, super.aClass2_Sub6_3.anInt1114 + -super.anInt6782, -super.zFine + super.aClass2_Sub6_3.anInt1101);
					if (local119 != 0) {
						local331.method3832(local119);
					}
					super.aModelArray3[2] = local331;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Z")
	public boolean method4335() {
		return this.type != null;
	}

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6075() {
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V")
	@Override
	public void method6068() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)I")
	@Override
	public int method4323() {
		if (this.type.multiNpcs != null) {
			@Pc(18) NpcType local18 = this.type.getMultiNpc(Static214.aClass226_1);
			if (local18 != null && local18.opcode138 != -1) {
				return local18.opcode138;
			}
		}
		return this.type.opcode138;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZI)V")
	public void method4337(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray316[0];
		@Pc(15) int local15 = super.anIntArray317[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local10++;
			local15++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local15--;
			local10++;
		}
		if (arg1 == 4) {
			local15--;
		}
		if (arg1 == 5) {
			local10--;
			local15--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local10--;
			local15++;
		}
		if (super.anInt4597 != -1 && SeqTypeList.seqTypeList.method2371(super.anInt4597).movetype == 1) {
			super.anInt4597 = -1;
		}
		if (super.anInt4594 != -1) {
			@Pc(83) Class91 local83 = Static322.aClass211_2.get(super.anInt4594);
			if (local83.aBoolean177 && local83.anInt2448 != -1 && SeqTypeList.seqTypeList.method2371(local83.anInt2448).movetype == 1) {
				super.anInt4594 = -1;
			}
		}
		if (super.movementQueueSize < 9) {
			super.movementQueueSize++;
		}
		for (@Pc(118) int local118 = super.movementQueueSize; local118 > 0; local118--) {
			super.anIntArray316[local118] = super.anIntArray316[local118 - 1];
			super.anIntArray317[local118] = super.anIntArray317[local118 - 1];
			super.aByteArray51[local118] = super.aByteArray51[local118 - 1];
		}
		super.anIntArray316[0] = local10;
		super.aByteArray51[0] = (byte) arg0;
		super.anIntArray317[0] = local15;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6072(@OriginalArg(0) Class19 arg0) {
		if (this.type == null || !this.method4334(1024, arg0)) {
			return null;
		}
		@Pc(17) Class14 local17 = arg0.method2808();
		@Pc(22) int local22 = super.aClass248_7.method6440();
		local17.method3924(local22);
		local17.method3935(super.xFine, super.anInt6782, super.zFine);
		@Pc(37) BasType local37 = this.method4331();
		@Pc(50) NpcType local50 = this.type.multiNpcs == null ? this.type : this.type.getMultiNpc(Static214.aClass226_1);
		if (Static218.preferences.characterShadows && local50.hasshadow && local37.aBoolean424) {
			@Pc(75) SeqType local75 = super.anInt4597 != -1 && super.anInt4590 == 0 ? SeqTypeList.seqTypeList.method2371(super.anInt4597) : null;
			@Pc(92) SeqType local92 = super.anInt4585 == -1 || super.aBoolean317 && local75 != null ? null : SeqTypeList.seqTypeList.method2371(super.anInt4585);
			@Pc(144) Model local144 = Static178.method2340(local92 == null ? super.anInt4607 : super.anInt4626, this.type.shadowcolormodifier2 & 0xFF, this.type.shadowcolormodifier1 & 0xFF, super.anInt4596, local92 == null ? local75 : local92, this.type.size, this.type.shadowcolor2 & 0xFFFF, super.aModelArray3[0], local22, arg0, this.type.shadowcolor1 & 0xFFFF, super.aBoolean318, super.anInt4608, super.anInt4589);
			if (local144 != null) {
				@Pc(149) float local149 = arg0.method2802();
				@Pc(152) float local152 = arg0.method2860();
				arg0.method2852(false);
				arg0.method2823(local149, local152 - 150.0F);
				local144.method3834(local17, null, 0);
				arg0.method2823(local149, local152);
				arg0.method2852(true);
			}
		}
		@Pc(175) Class12_Sub4 local175 = null;
		if (this.method4339()) {
			local175 = Static147.method2706(super.aModelArray3.length);
		}
		if (super.particleSystem == null) {
			arg0.method2881(super.aModelArray3, local17, local175 == null ? null : local175.aClass12_Sub2Array1, 0);
		} else {
			@Pc(211) Class224 local211 = super.particleSystem.method4357();
			arg0.method2830(super.aModelArray3, local211, local17, local175 == null ? null : local175.aClass12_Sub2Array1, 0);
		}
		this.method4332(arg0, super.aModelArray3, false);
		if (super.aModelArray3[2] != null) {
			if (local22 != 0) {
				super.aModelArray3[2].method3832(local22);
			}
			super.aModelArray3[2].method3812(-super.aClass2_Sub6_3.anInt1104 + super.xFine, super.anInt6782 + -super.aClass2_Sub6_3.anInt1114, super.zFine - super.aClass2_Sub6_3.anInt1101);
		}
		super.anInt4603 = Static163.anInt3086;
		return local175;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIZI)V")
	public void method4338(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte78 = (byte) arg1;
		if (super.anInt4597 != -1 && SeqTypeList.seqTypeList.method2371(super.anInt4597).movetype == 1) {
			super.anInt4597 = -1;
		}
		if (super.anInt4594 != -1) {
			@Pc(37) Class91 local37 = Static322.aClass211_2.get(super.anInt4594);
			if (local37.aBoolean177 && local37.anInt2448 != -1 && SeqTypeList.seqTypeList.method2371(local37.anInt2448).movetype == 1) {
				super.anInt4594 = -1;
			}
		}
		if (!arg3) {
			@Pc(67) int local67 = arg2 - super.anIntArray316[0];
			@Pc(75) int local75 = arg4 - super.anIntArray317[0];
			if (local67 >= -8 && local67 <= 8 && local75 >= -8 && local75 <= 8) {
				if (super.movementQueueSize < 9) {
					super.movementQueueSize++;
				}
				for (@Pc(108) int local108 = super.movementQueueSize; local108 > 0; local108--) {
					super.anIntArray316[local108] = super.anIntArray316[local108 - 1];
					super.anIntArray317[local108] = super.anIntArray317[local108 - 1];
					super.aByteArray51[local108] = super.aByteArray51[local108 - 1];
				}
				super.anIntArray316[0] = arg2;
				super.anIntArray317[0] = arg4;
				super.aByteArray51[0] = 1;
				return;
			}
		}
		super.movementQueueSize = 0;
		super.anIntArray316[0] = arg2;
		super.anInt4641 = 0;
		super.anInt4642 = 0;
		super.anIntArray317[0] = arg4;
		super.xFine = arg0 * 64 + super.anIntArray316[0] * 128;
		super.zFine = super.anIntArray317[0] * 128 + arg0 * 64;
		if (super.particleSystem != null) {
			super.particleSystem.method4358();
		}
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)I")
	@Override
	public int method6079() {
		return super.anInt4630;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		if (this.type == null || !this.method4334(65536, arg2)) {
			return false;
		}
		@Pc(19) Class14 local19 = arg2.method2808();
		@Pc(24) int local24 = super.aClass248_7.method6440();
		local19.method3924(local24);
		local19.method3935(super.xFine, super.anInt6782, super.zFine);
		for (@Pc(43) int local43 = 0; super.aModelArray3.length > local43; local43++) {
			if (super.aModelArray3[local43] != null && super.aModelArray3[local43].method3819(arg0, arg1, local19, this.type.size == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)I")
	@Override
	public int method4322() {
		if (this.type.multiNpcs != null) {
			@Pc(21) NpcType local21 = this.type.getMultiNpc(Static214.aClass226_1);
			if (local21 != null && local21.iconheight != -1) {
				return local21.iconheight;
			}
		}
		return this.type.iconheight == -1 ? super.method4322() : this.type.iconheight;
	}

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "(I)Z")
	private boolean method4339() {
		return this.type.interactive;
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(B)I")
	@Override
	protected int method4328() {
		if (this.type.multiNpcs != null) {
			@Pc(19) NpcType local19 = this.type.getMultiNpc(Static214.aClass226_1);
			if (local19 != null && local19.bastypeid != -1) {
				return local19.bastypeid;
			}
		}
		return this.type.bastypeid;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6069(@OriginalArg(0) Class19 arg0) {
		if (this.type != null && (super.aBoolean321 || this.method4334(0, arg0))) {
			this.method4332(arg0, super.aModelArray3, super.aBoolean321);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!fk;I)V")
	public void setType(@OriginalArg(0) NpcType type) {
		this.type = type;
		if (super.particleSystem != null) {
			super.particleSystem.method4358();
		}
	}
}
