import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class NpcType {

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "[[I")
	private int[][] modeloffsets;

	@OriginalMember(owner = "client!fk", name = "A", descriptor = "[I")
	private int[] modelids;

	@OriginalMember(owner = "client!fk", name = "F", descriptor = "[I")
	public int[] multiNpcs;

	@OriginalMember(owner = "client!fk", name = "H", descriptor = "[B")
	private byte[] recol_p;

	@OriginalMember(owner = "client!fk", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!fk", name = "O", descriptor = "[S")
	private short[] recol_d;

	@OriginalMember(owner = "client!fk", name = "U", descriptor = "[I")
	private int[] headmodels;

	@OriginalMember(owner = "client!fk", name = "Y", descriptor = "[I")
	public int[] anIntArray131;

	@OriginalMember(owner = "client!fk", name = "ib", descriptor = "[S")
	private short[] recol_s;

	@OriginalMember(owner = "client!fk", name = "jb", descriptor = "Lclient!ta;")
	public Class219 aClass219_2;

	@OriginalMember(owner = "client!fk", name = "kb", descriptor = "[S")
	private short[] retex_d;

	@OriginalMember(owner = "client!fk", name = "nb", descriptor = "Lclient!ad;")
	private HashTable params;

	@OriginalMember(owner = "client!fk", name = "ub", descriptor = "[S")
	private short[] retex_s;

	@OriginalMember(owner = "client!fk", name = "wb", descriptor = "I")
	public int anInt2048;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "B")
	public byte shadowcolormodifier1 = -96;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "Z")
	public boolean hasshadow = true;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
	public int crawlsound = -1;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "Z")
	public boolean rotationflag = true;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
	private int multiNpcVarbit = -1;

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
	private int resize_y = 128;

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
	public int cursor1op = -1;

	@OriginalMember(owner = "client!fk", name = "z", descriptor = "[Ljava/lang/String;")
	public final String[] ops = new String[5];

	@OriginalMember(owner = "client!fk", name = "V", descriptor = "I")
	public int bastypeid = -1;

	@OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
	public int hitbarid = -1;

	@OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
	public int cursor2 = -1;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "S")
	public short shadowcolor1 = 0;

	@OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
	public int runsound = -1;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
	public int iconheight = -1;

	@OriginalMember(owner = "client!fk", name = "eb", descriptor = "Ljava/lang/String;")
	public String name = "null";

	@OriginalMember(owner = "client!fk", name = "w", descriptor = "B")
	public byte defaultmode = 0;

	@OriginalMember(owner = "client!fk", name = "hb", descriptor = "Z")
	public boolean aBoolean148 = false;

	@OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
	public int cursor = -1;

	@OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
	public int soundradius = 0;

	@OriginalMember(owner = "client!fk", name = "X", descriptor = "S")
	public short shadowcolor2 = 0;

	@OriginalMember(owner = "client!fk", name = "cb", descriptor = "I")
	public int mapelement = -1;

	@OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
	private int contrast = 0;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
	public int cursor1 = -1;

	@OriginalMember(owner = "client!fk", name = "D", descriptor = "Z")
	public boolean interactive = true;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
	public int walksound = -1;

	@OriginalMember(owner = "client!fk", name = "fb", descriptor = "I")
	public int combatLevel = -1;

	@OriginalMember(owner = "client!fk", name = "gb", descriptor = "Z")
	public boolean minimapdisplay = true;

	@OriginalMember(owner = "client!fk", name = "sb", descriptor = "I")
	private int ambient = 0;

	@OriginalMember(owner = "client!fk", name = "qb", descriptor = "I")
	public int rotationspeed = 32;

	@OriginalMember(owner = "client!fk", name = "ob", descriptor = "I")
	public int anInt2042 = -1;

	@OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
	private int multiNpcVarp = -1;

	@OriginalMember(owner = "client!fk", name = "db", descriptor = "I")
	public int idlesound = -1;

	@OriginalMember(owner = "client!fk", name = "tb", descriptor = "I")
	private int resize_x = 128;

	@OriginalMember(owner = "client!fk", name = "C", descriptor = "B")
	public byte spawndirection = 4;

	@OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
	public int opcode138 = -1;

	@OriginalMember(owner = "client!fk", name = "ab", descriptor = "I")
	public int cursor2op = -1;

	@OriginalMember(owner = "client!fk", name = "mb", descriptor = "I")
	public int size = 1;

	@OriginalMember(owner = "client!fk", name = "vb", descriptor = "Z")
	public boolean toprenderpriority = false;

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "B")
	public byte shadowcolormodifier2 = -16;

	@OriginalMember(owner = "client!fk", name = "I", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!fk", name = "zb", descriptor = "I")
	public int soundvolume = 255;

	@OriginalMember(owner = "client!fk", name = "yb", descriptor = "I")
	public int headicon = -1;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!ak;ILclient!nb;Lclient!wm;Lclient!gp;IIILclient!nb;I[Lclient!bg;IBLclient!wl;I)Lclient!gn;")
	public Model getBodyModel(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) Class85 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class157 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20[] arg10, @OriginalArg(11) int arg11, @OriginalArg(13) Interface11 arg12, @OriginalArg(14) int arg13) {
		if (this.multiNpcs != null) {
			@Pc(13) NpcType local13 = this.getMultiNpc(arg12);
			return local13 == null ? null : local13.getBodyModel(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
		}
		@Pc(37) int local37 = arg9;
		if (this.resize_y != 128) {
			local37 = arg9 | 0x2;
		}
		if (this.resize_x != 128) {
			local37 |= 0x5;
		}
		@Pc(65) boolean local65 = arg2 != null || arg8 != null;
		@Pc(67) boolean local67 = false;
		@Pc(69) boolean local69 = false;
		@Pc(71) boolean local71 = false;
		@Pc(78) int local78 = arg10 == null ? 0 : arg10.length;
		@Pc(112) int local112;
		@Pc(117) int local117;
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			Static21.aClass2_Sub2_Sub13Array1[local80] = null;
			if (arg10[local80] != null) {
				@Pc(98) Class157 local98 = arg4.method2371(arg10[local80].anInt624);
				if (local98.frames != null) {
					local65 = true;
					Static168.aClass157Array42[local80] = local98;
					local112 = arg10[local80].anInt628;
					local117 = arg10[local80].anInt627;
					@Pc(122) int local122 = local98.frames[local112];
					Static21.aClass2_Sub2_Sub13Array1[local80] = arg4.method2368(local122 >>> 16);
					@Pc(135) int local135 = local122 & 0xFFFF;
					Static225.anIntArray259[local80] = local135;
					if (Static21.aClass2_Sub2_Sub13Array1[local80] != null) {
						local69 |= Static21.aClass2_Sub2_Sub13Array1[local80].method4236(local135);
						local67 |= Static21.aClass2_Sub2_Sub13Array1[local80].method4234(local135);
						local71 |= local98.aBoolean263;
					}
					if ((local98.tween || Static318.forceTween) && local117 != -1 && local98.frames.length > local117) {
						Static132.anIntArray161[local80] = local98.frameDelay[local112];
						Static356.anIntArray461[local80] = arg10[local80].anInt625;
						@Pc(221) int local221 = local98.frames[local117];
						Static116.aClass2_Sub2_Sub13Array3[local80] = arg4.method2368(local221 >>> 16);
						@Pc(234) int local234 = local221 & 0xFFFF;
						Static191.anIntArray101[local80] = local234;
						if (Static116.aClass2_Sub2_Sub13Array3[local80] != null) {
							local69 |= Static116.aClass2_Sub2_Sub13Array3[local80].method4236(local234);
							local67 |= Static116.aClass2_Sub2_Sub13Array3[local80].method4234(local234);
						}
					} else {
						Static132.anIntArray161[local80] = 0;
						Static356.anIntArray461[local80] = 0;
						Static116.aClass2_Sub2_Sub13Array3[local80] = null;
						Static191.anIntArray101[local80] = -1;
					}
				}
			}
		}
		@Pc(266) int local266 = -1;
		local112 = -1;
		local117 = 0;
		@Pc(277) Class2_Sub2_Sub13 local277 = null;
		@Pc(279) Class2_Sub2_Sub13 local279 = null;
		@Pc(281) int local281 = -1;
		@Pc(283) int local283 = -1;
		@Pc(285) int local285 = 0;
		@Pc(287) Class2_Sub2_Sub13 local287 = null;
		@Pc(289) Class2_Sub2_Sub13 local289 = null;
		@Pc(359) int local359;
		if (local65) {
			@Pc(302) int local302;
			if (arg2 != null) {
				local266 = arg2.frames[arg1];
				local302 = local266 >>> 16;
				local277 = arg4.method2368(local302);
				local266 &= 0xFFFF;
				if (local277 != null) {
					local69 |= local277.method4236(local266);
					local67 |= local277.method4234(local266);
					local71 |= arg2.aBoolean263;
				}
				if ((arg2.tween || Static318.forceTween) && arg13 != -1 && arg2.frames.length > arg13) {
					local117 = arg2.frameDelay[arg1];
					local112 = arg2.frames[arg13];
					local359 = local112 >>> 16;
					local112 &= 0xFFFF;
					if (local302 == local359) {
						local279 = local277;
					} else {
						local279 = arg4.method2368(local359);
					}
					if (local279 != null) {
						local69 |= local279.method4236(local112);
						local67 |= local279.method4234(local112);
					}
				}
			}
			local37 |= 0x20;
			if (arg8 != null) {
				local281 = arg8.frames[arg6];
				local302 = local281 >>> 16;
				local281 &= 0xFFFF;
				local287 = arg4.method2368(local302);
				if (local287 != null) {
					local69 |= local287.method4236(local281);
					local67 |= local287.method4234(local281);
					local71 |= arg8.aBoolean263;
				}
				if ((arg8.tween || Static318.forceTween) && arg7 != -1 && arg8.frames.length > arg7) {
					local283 = arg8.frames[arg7];
					local285 = arg8.frameDelay[arg6];
					local359 = local283 >>> 16;
					if (local302 == local359) {
						local289 = local287;
					} else {
						local289 = arg4.method2368(local359);
					}
					local283 &= 0xFFFF;
					if (local289 != null) {
						local69 |= local289.method4236(local283);
						local67 |= local289.method4234(local283);
					}
				}
			}
			if (local69) {
				local37 |= 0x80;
			}
			if (local67) {
				local37 |= 0x100;
			}
			if (local71) {
				local37 |= 0x200;
			}
		}
		@Pc(520) SoftLruHashTable local520 = this.aClass219_2.aSoftLruHashTable_54;
		@Pc(537) Model local537;
		synchronized (this.aClass219_2.aSoftLruHashTable_54) {
			local537 = (Model) this.aClass219_2.aSoftLruHashTable_54.get((long) (this.anInt2048 | arg3.anInt2836 << 16));
		}
		if (local537 == null || (local537.method3826() & local37) != local37) {
			if (local537 != null) {
				local37 |= local537.method3826();
			}
			local359 = local37;
			@Pc(566) boolean local566 = false;
			@Pc(570) Js5 local570 = this.aClass219_2.aJs5_88;
			@Pc(574) int i;
			synchronized (this.aClass219_2.aJs5_88) {
				i = 0;
				while (true) {
					if (i >= this.modelids.length) {
						break;
					}
					if (this.modelids[i] != -1 && !this.aClass219_2.aJs5_88.isFileReady(this.modelids[i], 0)) {
						local566 = true;
					}
					i++;
				}
			}
			if (local566) {
				return null;
			}
			@Pc(621) RawModel[] models = new RawModel[this.modelids.length];
			for (i = 0; i < this.modelids.length; i++) {
				if (this.modelids[i] != -1) {
					@Pc(636) Js5 local636 = this.aClass219_2.aJs5_88;
					synchronized (this.aClass219_2.aJs5_88) {
						models[i] = RawModel.create(this.aClass219_2.aJs5_88, this.modelids[i]);
					}
					if (this.modeloffsets != null && this.modeloffsets[i] != null && models[i] != null) {
						models[i].translate(this.modeloffsets[i][0], this.modeloffsets[i][2], this.modeloffsets[i][1]);
					}
				}
			}
			@Pc(700) BasType basType = null;
			if (this.bastypeid != -1) {
				basType = arg0.method245(this.bastypeid);
			}
			@Pc(718) int local718;
			if (basType != null && basType.equipmentTransforms != null) {
				for (local718 = 0; local718 < basType.equipmentTransforms.length; local718++) {
					if (basType.equipmentTransforms[local718] != null && local718 < models.length && models[local718] != null) {
						@Pc(742) int local742 = basType.equipmentTransforms[local718][0];
						@Pc(749) int local749 = basType.equipmentTransforms[local718][1];
						@Pc(756) int local756 = basType.equipmentTransforms[local718][2];
						@Pc(765) int local765 = basType.equipmentTransforms[local718][3] << 3;
						@Pc(774) int local774 = basType.equipmentTransforms[local718][4] << 3;
						@Pc(783) int local783 = basType.equipmentTransforms[local718][5] << 3;
						if (this.anIntArrayArray19 == null) {
							this.anIntArrayArray19 = new int[basType.equipmentTransforms.length][];
						}
						if (this.anIntArrayArray19[local718] == null) {
							@Pc(805) int[] local805 = this.anIntArrayArray19[local718] = new int[15];
							if (local765 == 0 && local774 == 0 && local783 == 0) {
								local805[12] = -local742;
								local805[0] = local805[4] = local805[8] = 32768;
								local805[14] = -local756;
								local805[13] = -local749;
							} else {
								@Pc(821) int local821 = Class19.COSINE[local765];
								@Pc(825) int local825 = Class19.SINE[local765];
								@Pc(829) int local829 = Class19.COSINE[local774];
								@Pc(833) int local833 = Class19.SINE[local774];
								@Pc(837) int local837 = Class19.COSINE[local783];
								@Pc(841) int local841 = Class19.SINE[local783];
								@Pc(849) int local849 = local825 * local837 + 16384 >> 15;
								@Pc(857) int local857 = local841 * local825 + 16384 >> 15;
								local805[5] = -local825;
								local805[4] = local821 * local837 + 16384 >> 15;
								local805[6] = local829 * local857 + local837 * -local833 + 16384 >> 15;
								local805[0] = local857 * local833 + local837 * local829 + 16384 >> 15;
								local805[7] = -local833 * -local841 + local849 * local829 + 16384 >> 15;
								local805[1] = local833 * local849 + local829 * -local841 + 16384 >> 15;
								local805[3] = local821 * local841 + 16384 >> 15;
								local805[2] = local833 * local821 + 16384 >> 15;
								local805[8] = local829 * local821 + 16384 >> 15;
								local805[14] = -local742 * local805[2] + -local749 * local805[5] + -local756 * local805[8] + 16384 >> 15;
								local805[12] = -local742 * local805[0] + -local749 * local805[3] + local805[6] * -local756 + 16384 >> 15;
								local805[13] = local805[4] * -local749 + local805[1] * -local742 + local805[7] * -local756 + 16384 >> 15;
							}
							local805[9] = local742;
							local805[10] = local749;
							local805[11] = local756;
						}
						if (local765 != 0 || local774 != 0 || local783 != 0) {
							models[local718].method4663(local774, local783, local765);
						}
						if (local742 != 0 || local749 != 0 || local756 != 0) {
							models[local718].translate(local742, local756, local749);
						}
					}
				}
			}
			@Pc(1152) RawModel local1152;
			if (models.length == 1) {
				local1152 = models[0];
			} else {
				local1152 = new RawModel(models, models.length);
			}
			if (this.recol_s != null) {
				local359 = local37 | 0x2000;
			}
			if (this.retex_d != null) {
				local359 |= 0x4000;
			}
			local537 = arg3.method2864(local1152, local359, this.aClass219_2.anInt6108, this.ambient + 64, this.contrast + 850);
			if (this.recol_s != null) {
				for (local718 = 0; local718 < this.recol_s.length; local718++) {
					if (this.recol_p == null || this.recol_p.length <= local718) {
						local537.method3837(this.recol_s[local718], this.recol_d[local718]);
					} else {
						local537.method3837(this.recol_s[local718], Static258.aShortArray95[this.recol_p[local718] & 0xFF]);
					}
				}
			}
			if (this.retex_d != null) {
				for (local718 = 0; local718 < this.retex_d.length; local718++) {
					local537.method3815(this.retex_d[local718], this.retex_s[local718]);
				}
			}
			local537.method3813(local37);
			@Pc(1272) SoftLruHashTable local1272 = this.aClass219_2.aSoftLruHashTable_54;
			synchronized (this.aClass219_2.aSoftLruHashTable_54) {
				this.aClass219_2.aSoftLruHashTable_54.put((long) (arg3.anInt2836 << 16 | this.anInt2048), local537);
			}
		}
		@Pc(1300) Model local1300 = local537.method3799((byte) 4, local37, true);
		if (!local65) {
			return local1300;
		}
		@Pc(1306) int local1306 = 0;
		@Pc(1308) int local1308 = 1;
		while (local1306 < local78) {
			if (Static21.aClass2_Sub2_Sub13Array1[local1306] != null) {
				local1300.method3822(Static132.anIntArray161[local1306], Static356.anIntArray461[local1306] - 1, Static116.aClass2_Sub2_Sub13Array3[local1306], local1308, Static225.anIntArray259[local1306], Static191.anIntArray101[local1306], Static21.aClass2_Sub2_Sub13Array1[local1306], Static168.aClass157Array42[local1306].aBoolean263, this.anIntArrayArray19[local1306]);
			}
			local1306++;
			local1308 <<= 0x1;
		}
		if (local277 != null && local287 != null) {
			local1300.method3810(local117, arg11 - 1, arg2.frameGroup, arg5 - 1, arg8.aBoolean263 | arg2.aBoolean263, local281, local283, local112, local287, local279, local285, local289, local277, local266);
		} else if (local277 != null) {
			local1300.method3827(local117, local279, local112, arg2.aBoolean263, arg11 - 1, local266, local277, 0);
		} else if (local287 != null) {
			local1300.method3827(local285, local289, local283, arg8.aBoolean263, arg5 - 1, local281, local287, 0);
		}
		for (@Pc(1427) int local1427 = 0; local1427 < local78; local1427++) {
			Static21.aClass2_Sub2_Sub13Array1[local1427] = null;
			Static116.aClass2_Sub2_Sub13Array3[local1427] = null;
			Static168.aClass157Array42[local1427] = null;
		}
		if (this.resize_x != 128 || this.resize_y != 128) {
			local1300.method3841(this.resize_x, this.resize_y, this.resize_x);
		}
		local1300.method3813(arg9);
		return local1300;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIILclient!wm;Lclient!nb;ZLclient!wl;Lclient!gp;)Lclient!gn;")
	public Model getHeadModel(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class19 arg3, @OriginalArg(5) Class157 arg4, @OriginalArg(7) Interface11 arg5, @OriginalArg(8) Class85 arg6) {
		if (this.multiNpcs != null) {
			@Pc(13) NpcType type = this.getMultiNpc(arg5);
			return type == null ? null : type.getHeadModel(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else if (this.headmodels == null) {
			return null;
		} else {
			@Pc(36) int local36 = 1024;
			if (arg4 != null && arg2 != -1) {
				local36 = arg4.method3989(arg2, true, arg1) | 0x400;
			}
			@Pc(63) SoftLruHashTable local63 = this.aClass219_2.aSoftLruHashTable_55;
			@Pc(80) Model local80;
			synchronized (this.aClass219_2.aSoftLruHashTable_55) {
				local80 = (Model) this.aClass219_2.aSoftLruHashTable_55.get((long) arg3.anInt2836 << 16 | this.anInt2048);
			}
			if (local80 == null || local36 != (local36 & local80.method3826())) {
				if (local80 != null) {
					local36 |= local80.method3826();
				}
				@Pc(107) int local107 = local36;
				@Pc(109) boolean local109 = false;
				@Pc(113) Js5 local113 = this.aClass219_2.aJs5_88;
				@Pc(117) int local117;
				synchronized (this.aClass219_2.aJs5_88) {
					local117 = 0;
					while (true) {
						if (this.headmodels.length <= local117) {
							break;
						}
						if (!this.aClass219_2.aJs5_88.isFileReady(this.headmodels[local117], 0)) {
							local109 = true;
						}
						local117++;
					}
				}
				if (local109) {
					return null;
				}
				@Pc(157) RawModel[] local157 = new RawModel[this.headmodels.length];
				@Pc(161) Js5 local161 = this.aClass219_2.aJs5_88;
				synchronized (this.aClass219_2.aJs5_88) {
					for (@Pc(165) int local165 = 0; local165 < this.headmodels.length; local165++) {
						local157[local165] = RawModel.create(this.aClass219_2.aJs5_88, this.headmodels[local165]);
					}
				}
				@Pc(209) RawModel local209;
				if (local157.length == 1) {
					local209 = local157[0];
				} else {
					local209 = new RawModel(local157, local157.length);
				}
				if (this.recol_s != null) {
					local107 = local36 | 0x2000;
				}
				if (this.retex_d != null) {
					local107 |= 0x4000;
				}
				local80 = arg3.method2864(local209, local107, this.aClass219_2.anInt6108, 64, 768);
				if (this.recol_s != null) {
					for (local117 = 0; local117 < this.recol_s.length; local117++) {
						if (this.recol_p == null || this.recol_p.length <= local117) {
							local80.method3837(this.recol_s[local117], this.recol_d[local117]);
						} else {
							local80.method3837(this.recol_s[local117], Static258.aShortArray95[this.recol_p[local117] & 0xFF]);
						}
					}
				}
				if (this.retex_d != null) {
					for (local117 = 0; local117 < this.retex_d.length; local117++) {
						local80.method3815(this.retex_d[local117], this.retex_s[local117]);
					}
				}
				local80.method3813(local36);
				@Pc(319) SoftLruHashTable local319 = this.aClass219_2.aSoftLruHashTable_55;
				synchronized (this.aClass219_2.aSoftLruHashTable_55) {
					this.aClass219_2.aSoftLruHashTable_55.put((long) arg3.anInt2836 << 16 | this.anInt2048, local80);
				}
			}
			if (arg4 != null && arg2 != -1) {
				local80 = arg4.method3985(local80, arg2, local36, arg0, arg1);
			}
			local80.method3813(1024);
			return local80;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
	public void method2089() {
		if (this.modelids == null) {
			this.modelids = new int[0];
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String method2090(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			@Pc(22) StringNode local22 = (StringNode) this.params.get((long) arg1);
			return local22 == null ? arg0 : local22.value;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!wl;I)Z")
	public boolean method2091(@OriginalArg(0) Interface11 arg0) {
		if (this.multiNpcs == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.multiNpcVarbit != -1) {
			local10 = arg0.method5777(this.multiNpcVarbit);
		} else if (this.multiNpcVarp != -1) {
			local10 = arg0.method5776(this.multiNpcVarp);
		}
		if (local10 < 0 || this.multiNpcs.length - 1 <= local10 || this.multiNpcs[local10] == -1) {
			@Pc(66) int local66 = this.multiNpcs[this.multiNpcs.length - 1];
			return local66 != -1;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lclient!wl;I)Lclient!fk;")
	public NpcType getMultiNpc(@OriginalArg(0) Interface11 arg0) {
		@Pc(13) int value = -1;
		if (this.multiNpcVarbit != -1) {
			value = arg0.method5777(this.multiNpcVarbit);
		} else if (this.multiNpcVarp != -1) {
			value = arg0.method5776(this.multiNpcVarp);
		}
		if (value < 0 || value >= this.multiNpcs.length - 1 || this.multiNpcs[value] == -1) {
			@Pc(68) int defaultMultiNpc = this.multiNpcs[this.multiNpcs.length - 1];
			return defaultMultiNpc == -1 ? null : this.aClass219_2.get(defaultMultiNpc);
		} else {
			return this.aClass219_2.get(this.multiNpcs[value]);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!bt;II)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(2) int opcode) {
		@Pc(50) int count;
		@Pc(60) int i;
		if (opcode == 1) {
			count = buffer.g1();
			this.modelids = new int[count];
			for (i = 0; i < count; i++) {
				this.modelids[i] = buffer.g2();
				if (this.modelids[i] == 65535) {
					this.modelids[i] = -1;
				}
			}
		} else if (opcode == 2) {
			this.name = buffer.gjstr();
		} else if (opcode == 12) {
			this.size = buffer.g1();
		} else if (opcode >= 30 && opcode < 35) {
			this.ops[opcode - 30] = buffer.gjstr();
		} else if (opcode == 40) {
			count = buffer.g1();
			this.recol_s = new short[count];
			this.recol_d = new short[count];
			for (i = 0; i < count; i++) {
				this.recol_s[i] = (short) buffer.g2();
				this.recol_d[i] = (short) buffer.g2();
			}
		} else if (opcode == 41) {
			count = buffer.g1();
			this.retex_s = new short[count];
			this.retex_d = new short[count];
			for (i = 0; i < count; i++) {
				this.retex_d[i] = (short) buffer.g2();
				this.retex_s[i] = (short) buffer.g2();
			}
		} else if (opcode == 42) {
			count = buffer.g1();
			this.recol_p = new byte[count];
			for (i = 0; i < count; i++) {
				this.recol_p[i] = buffer.g1b();
			}
		} else if (opcode == 60) {
			count = buffer.g1();
			this.headmodels = new int[count];
			for (i = 0; i < count; i++) {
				this.headmodels[i] = buffer.g2();
			}
		} else if (opcode == 93) {
			this.minimapdisplay = false;
		} else if (opcode == 95) {
			this.combatLevel = buffer.g2();
		} else if (opcode == 97) {
			this.resize_x = buffer.g2();
		} else if (opcode == 98) {
			this.resize_y = buffer.g2();
		} else if (opcode == 99) {
			this.toprenderpriority = true;
		} else if (opcode == 100) {
			this.ambient = buffer.g1b();
		} else if (opcode == 101) {
			this.contrast = buffer.g1b() * 5;
		} else if (opcode == 102) {
			this.headicon = buffer.g2();
		} else if (opcode == 103) {
			this.rotationspeed = buffer.g2();
		} else {
			@Pc(233) int local233;
			if (opcode == 106 || opcode == 118) {
				this.multiNpcVarbit = buffer.g2();
				if (this.multiNpcVarbit == 65535) {
					this.multiNpcVarbit = -1;
				}
				this.multiNpcVarp = buffer.g2();
				if (this.multiNpcVarp == 65535) {
					this.multiNpcVarp = -1;
				}
				count = -1;
				if (opcode == 118) {
					count = buffer.g2();
					if (count == 65535) {
						count = -1;
					}
				}
				i = buffer.g1();
				this.multiNpcs = new int[i + 2];
				for (local233 = 0; local233 <= i; local233++) {
					this.multiNpcs[local233] = buffer.g2();
					if (this.multiNpcs[local233] == 65535) {
						this.multiNpcs[local233] = -1;
					}
				}
				this.multiNpcs[i + 1] = count;
			} else if (opcode == 107) {
				this.interactive = false;
			} else if (opcode == 109) {
				this.rotationflag = false;
			} else if (opcode == 111) {
				this.hasshadow = false;
			} else if (opcode == 113) {
				this.shadowcolor1 = (short) buffer.g2();
				this.shadowcolor2 = (short) buffer.g2();
			} else if (opcode == 114) {
				this.shadowcolormodifier1 = buffer.g1b();
				this.shadowcolormodifier2 = buffer.g1b();
			} else if (opcode == 115) {
				buffer.g1();
				buffer.g1();
			} else if (opcode == 119) {
				this.defaultmode = buffer.g1b();
			} else if (opcode == 121) {
				this.modeloffsets = new int[this.modelids.length][];
				count = buffer.g1();
				for (i = 0; i < count; i++) {
					local233 = buffer.g1();
					@Pc(717) int[] tempArray = this.modeloffsets[local233] = new int[3];
					tempArray[0] = buffer.g1b();
					tempArray[1] = buffer.g1b();
					tempArray[2] = buffer.g1b();
				}
			} else if (opcode == 122) {
				this.hitbarid = buffer.g2();
			} else if (opcode == 123) {
				this.iconheight = buffer.g2();
			} else if (opcode == 125) {
				this.spawndirection = buffer.g1b();
			} else if (opcode == 127) {
				this.bastypeid = buffer.g2();
			} else if (opcode == 128) {
				/*
				 * movespeed
				 *
				 * stationary(0, (byte) -1)
				 * crawl(1, (byte) 0)
				 * walk(2, (byte) 1)
				 * run(3, (byte) 2)
				 */
				buffer.g1();
			} else if (opcode == 134) {
				this.idlesound = buffer.g2();
				if (this.idlesound == 65535) {
					this.idlesound = -1;
				}
				this.crawlsound = buffer.g2();
				if (this.crawlsound == 65535) {
					this.crawlsound = -1;
				}
				this.walksound = buffer.g2();
				if (this.walksound == 65535) {
					this.walksound = -1;
				}
				this.runsound = buffer.g2();
				if (this.runsound == 65535) {
					this.runsound = -1;
				}
				this.soundradius = buffer.g1();
			} else if (opcode == 135) {
				this.cursor1op = buffer.g1();
				this.cursor1 = buffer.g2();
			} else if (opcode == 136) {
				this.cursor2op = buffer.g1();
				this.cursor2 = buffer.g2();
			} else if (opcode == 137) {
				this.cursor = buffer.g2();
			} else if (opcode == 138) {
				this.opcode138 = buffer.g2();
			} else if (opcode == 139) {
				this.anInt2042 = buffer.g2();
			} else if (opcode == 140) {
				this.soundvolume = buffer.g1();
			} else if (opcode == 141) {
				this.aBoolean148 = true;
			} else if (opcode == 142) {
				this.mapelement = buffer.g2();
			} else if (opcode == 143) {
				this.aBoolean146 = true;
			} else if (opcode >= 150 && opcode < 155) {
				this.ops[opcode - 150] = buffer.gjstr();
				if (!this.aClass219_2.aBoolean410) {
					this.ops[opcode - 150] = null;
				}
			} else if (opcode == 160) {
				count = buffer.g1();
				this.anIntArray131 = new int[count];
				for (i = 0; i < count; i++) {
					this.anIntArray131[i] = buffer.g2();
				}
			} else if (opcode == 249) {
				count = buffer.g1();
				if (this.params == null) {
					int buckets = Static162.clp2(count);
					this.params = new HashTable(buckets);
				}
				for (i = 0; i < count; i++) {
					@Pc(539) boolean isString = buffer.g1() == 1;
					@Pc(543) int key = buffer.ig3();
					@Pc(552) Node value;
					if (isString) {
						value = new StringNode(buffer.gjstr());
					} else {
						value = new IntNode(buffer.mg4());
					}
					this.params.put(value, key);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLclient!bt;)V")
	public void decode(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.g1();
			if (local15 == 0) {
				return;
			}
			this.decode(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)I")
	public int method2098(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			@Pc(22) IntNode local22 = (IntNode) this.params.get((long) arg1);
			return local22 == null ? arg0 : local22.value;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Z")
	public boolean method2099() {
		if (this.multiNpcs == null) {
			return this.idlesound != -1 || this.walksound != -1 || this.runsound != -1;
		}
		for (@Pc(28) int local28 = 0; local28 < this.multiNpcs.length; local28++) {
			if (this.multiNpcs[local28] != -1) {
				@Pc(45) NpcType local45 = this.aClass219_2.get(this.multiNpcs[local28]);
				if (local45.idlesound != -1 || local45.walksound != -1 || local45.runsound != -1) {
					return true;
				}
			}
		}
		return false;
	}
}
