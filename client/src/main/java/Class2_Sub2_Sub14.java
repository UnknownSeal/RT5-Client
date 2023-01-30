import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class2_Sub2_Sub14 extends SecondaryNode {

	@OriginalMember(owner = "client!qm", name = "I", descriptor = "[I")
	private final int[] textureIDs;

	@OriginalMember(owner = "client!qm", name = "L", descriptor = "[I")
	private final int[] spriteIDs;

	@OriginalMember(owner = "client!qm", name = "D", descriptor = "Lclient!jq;")
	private final TextureOp brightnessOp;

	@OriginalMember(owner = "client!qm", name = "K", descriptor = "Lclient!jq;")
	private final TextureOp colorOp;

	@OriginalMember(owner = "client!qm", name = "C", descriptor = "Lclient!jq;")
	private final TextureOp alphaOp;

	@OriginalMember(owner = "client!qm", name = "F", descriptor = "[Lclient!jq;")
	private final TextureOp[] ops;

	static {
		new LocalisedText("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class2_Sub2_Sub14(@OriginalArg(0) Buffer buffer) {
		@Pc(7) int opCount = buffer.g1();
		@Pc(9) int spriteCount = 0;
		@Pc(11) int textureCount = 0;
		@Pc(14) int[][] local14 = new int[opCount][];
		this.ops = new TextureOp[opCount];
		@Pc(50) int j;
		for (@Pc(20) int i = 0; i < opCount; i++) {
			@Pc(26) TextureOp textureOp = Static286.decode(buffer);
			if (textureOp.getSpriteID() >= 0) {
				spriteCount++;
			}
			if (textureOp.getTextureID() >= 0) {
				textureCount++;
			}
			@Pc(43) int local43 = textureOp.childOps.length;
			local14[i] = new int[local43];
			for (j = 0; j < local43; j++) {
				local14[i][j] = buffer.g1();
			}
			this.ops[i] = textureOp;
		}
		this.spriteIDs = new int[spriteCount];
		this.textureIDs = new int[textureCount];
		spriteCount = 0;
		textureCount = 0;
		for (@Pc(95) int local95 = 0; local95 < opCount; local95++) {
			@Pc(102) TextureOp local102 = this.ops[local95];
			j = local102.childOps.length;
			for (@Pc(108) int local108 = 0; local108 < j; local108++) {
				local102.childOps[local108] = this.ops[local14[local95][local108]];
			}
			@Pc(130) int spriteID = local102.getSpriteID();
			@Pc(134) int textureID = local102.getTextureID();
			if (spriteID > 0) {
				this.spriteIDs[spriteCount++] = spriteID;
			}
			if (textureID > 0) {
				this.textureIDs[textureCount++] = textureID;
			}
			local14[local95] = null;
		}
		this.colorOp = this.ops[buffer.g1()];
		this.alphaOp = this.ops[buffer.g1()];
		this.brightnessOp = this.ops[buffer.g1()];
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZLclient!r;Lclient!ci;ZII)[F")
	public float[] method4955(@OriginalArg(1) Js5 arg0, @OriginalArg(2) Interface2 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static111.spritesArchive = arg0;
		Static259.anInterface2_6 = arg1;
		for (@Pc(11) int i = 0; i < this.ops.length; i++) {
			this.ops[i].createImageCache(arg3, arg4);
		}
		Static155.method2789(arg4, arg3);
		@Pc(38) float[] local38 = new float[arg4 * arg3 * 4];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int y = 0; y < arg3; y++) {
			@Pc(71) int[] local71;
			@Pc(79) int[] local79;
			@Pc(75) int[] local75;
			if (this.colorOp.monochrome) {
				@Pc(87) int[] local87 = this.colorOp.getMonochromeOutput(y);
				local71 = local87;
				local75 = local87;
				local79 = local87;
			} else {
				@Pc(67) int[][] local67 = this.colorOp.getColorOutput(y);
				local71 = local67[0];
				local75 = local67[2];
				local79 = local67[1];
			}
			@Pc(105) int[] local105;
			if (this.alphaOp.monochrome) {
				local105 = this.alphaOp.getMonochromeOutput(y);
			} else {
				local105 = this.alphaOp.getColorOutput(y)[0];
			}
			if (arg2) {
				local53 = y << 2;
			}
			@Pc(131) int[] local131;
			if (this.brightnessOp.monochrome) {
				local131 = this.brightnessOp.getMonochromeOutput(y);
			} else {
				local131 = this.brightnessOp.getColorOutput(y)[0];
			}
			for (@Pc(143) int local143 = arg4 - 1; local143 >= 0; local143--) {
				@Pc(152) float local152 = (float) local105[local143] / 4096.0F;
				@Pc(165) float local165 = ((float) local131[local143] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local152 < 0.0F) {
					local152 = 0.0F;
				} else if (local152 > 1.0F) {
					local152 = 1.0F;
				}
				local38[local53++] = local165 * (float) local71[local143];
				local38[local53++] = local165 * (float) local79[local143];
				local38[local53++] = (float) local75[local143] * local165;
				local38[local53++] = local152;
				if (arg2) {
					local53 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(236) int i = 0; i < this.ops.length; i++) {
			this.ops[i].clearImageCache();
		}
		return local38;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!ci;Lclient!r;)Z")
	public boolean method4956(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Js5 arg1) {
		@Pc(9) int local9;
		if (Static123.spriteGroupID >= 0) {
			for (local9 = 0; local9 < this.spriteIDs.length; local9++) {
				if (!arg1.method5087(this.spriteIDs[local9], Static123.spriteGroupID)) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.spriteIDs.length; local9++) {
				if (!arg1.method5086(this.spriteIDs[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.textureIDs.length; local9++) {
			if (!arg0.method2657(this.textureIDs[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZDIILclient!r;ZILclient!ci;)[I")
	public int[] method4957(@OriginalArg(0) boolean arg0, @OriginalArg(1) double arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Js5 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) Interface2 arg6) {
		Static111.spritesArchive = arg4;
		Static259.anInterface2_6 = arg6;
		for (@Pc(19) int local19 = 0; local19 < this.ops.length; local19++) {
			this.ops[local19].createImageCache(arg3, arg2);
		}
		Static5.method86(arg1);
		Static155.method2789(arg2, arg3);
		@Pc(47) int[] local47 = new int[arg3 * arg2];
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(55) byte local55;
		if (arg5) {
			local51 = arg2 - 1;
			local53 = -1;
			local55 = -1;
		} else {
			local51 = 0;
			local53 = arg2;
			local55 = 1;
		}
		@Pc(67) int local67 = 0;
		for (@Pc(69) int local69 = 0; local69 < arg3; local69++) {
			if (arg0) {
				local67 = local69;
			}
			@Pc(87) int[] local87;
			@Pc(89) int[] local89;
			@Pc(91) int[] local91;
			if (this.colorOp.monochrome) {
				@Pc(85) int[] local85 = this.colorOp.getMonochromeOutput(local69);
				local87 = local85;
				local89 = local85;
				local91 = local85;
			} else {
				@Pc(99) int[][] local99 = this.colorOp.getColorOutput(local69);
				local87 = local99[0];
				local89 = local99[1];
				local91 = local99[2];
			}
			for (@Pc(113) int local113 = local51; local113 != local53; local113 += local55) {
				@Pc(121) int local121 = local87[local113] >> 4;
				if (local121 > 255) {
					local121 = 255;
				}
				if (local121 < 0) {
					local121 = 0;
				}
				@Pc(139) int local139 = local89[local113] >> 4;
				if (local139 > 255) {
					local139 = 255;
				}
				if (local139 < 0) {
					local139 = 0;
				}
				@Pc(156) int local156 = local91[local113] >> 4;
				if (local156 > 255) {
					local156 = 255;
				}
				local139 = Static112.anIntArray145[local139];
				local121 = Static112.anIntArray145[local121];
				if (local156 < 0) {
					local156 = 0;
				}
				local156 = Static112.anIntArray145[local156];
				@Pc(189) int local189 = (local139 << 8) + (local121 << 16) + local156;
				if (local189 != 0) {
					local189 |= 0xFF000000;
				}
				local47[local67++] = local189;
				if (arg0) {
					local67 += arg2 - 1;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.ops.length; local229++) {
			this.ops[local229].clearImageCache();
		}
		return local47;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ci;Lclient!r;DIZII)[I")
	public int[] method4959(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) double arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static111.spritesArchive = arg1;
		Static259.anInterface2_6 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.ops.length; local11++) {
			this.ops[local11].createImageCache(arg5, arg4);
		}
		Static5.method86(arg2);
		Static155.method2789(arg4, arg5);
		@Pc(45) int[] local45 = new int[arg5 * 4 * arg4];
		@Pc(47) int local47 = 0;
		for (@Pc(54) int local54 = 0; local54 < arg5; local54++) {
			@Pc(68) int[] local68;
			@Pc(70) int[] local70;
			@Pc(72) int[] local72;
			@Pc(66) int[] local66;
			if (this.colorOp.monochrome) {
				local66 = this.colorOp.getMonochromeOutput(local54);
				local68 = local66;
				local70 = local66;
				local72 = local66;
			} else {
				@Pc(80) int[][] local80 = this.colorOp.getColorOutput(local54);
				local68 = local80[0];
				local70 = local80[1];
				local72 = local80[2];
			}
			if (this.alphaOp.monochrome) {
				local66 = this.alphaOp.getMonochromeOutput(local54);
			} else {
				local66 = this.alphaOp.getColorOutput(local54)[0];
			}
			if (arg3) {
				local47 = local54;
			}
			for (@Pc(120) int local120 = arg4 - 1; local120 >= 0; local120--) {
				@Pc(128) int local128 = local68[local120] >> 4;
				if (local128 > 255) {
					local128 = 255;
				}
				if (local128 < 0) {
					local128 = 0;
				}
				@Pc(143) int local143 = local70[local120] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				if (local143 < 0) {
					local143 = 0;
				}
				@Pc(158) int local158 = local72[local120] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				local128 = Static112.anIntArray145[local128];
				if (local158 < 0) {
					local158 = 0;
				}
				local143 = Static112.anIntArray145[local143];
				local158 = Static112.anIntArray145[local158];
				@Pc(205) int local205;
				if (local128 == 0 && local143 == 0 && local158 == 0) {
					local205 = 0;
				} else {
					local205 = local66[local120] >> 4;
					if (local205 > 255) {
						local205 = 255;
					}
					if (local205 < 0) {
						local205 = 0;
					}
				}
				local45[local47++] = local158 + (local143 << 8) + (local205 << 24) + (local128 << 16);
				if (arg3) {
					local47 += arg4 - 1;
				}
			}
		}
		for (@Pc(261) int local261 = 0; local261 < this.ops.length; local261++) {
			this.ops[local261].clearImageCache();
		}
		return local45;
	}
}
