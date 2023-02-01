import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Preferences extends Class177 {

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
	public static int particles = 2;
	@OriginalMember(owner = "client!pe", name = "O", descriptor = "Z")
	public boolean aBoolean365 = false;

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "Z")
	public boolean aBoolean366 = false;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Preferences(@OriginalArg(0) SignLink signLink) {
		super.brightness = 3;
		this.setAllLevelsVisible(true);
		super.soundEffectsVolume = 127;
		super.highDetailLighting = true;
		super.anInt4885 = 0;
		super.areaSoundsVolume = 127;
		super.highDetailWater = true;
		super.manyIdleAnimations = 1;
		super.anInt4884 = 0;
		super.groundTextures = true;
		super.flickeringEffects = true;
		super.sceneryShadows = 2;
		super.antiAliasingMode = 0;
		super.anInt4893 = 0;
		super.characterShadows = true;
		super.fog = true;
		super.musicVolume = 255;
		super.stereo = true;
		super.highDetailTextures = true;
		super.groundDecoration = true;
		super.roofsVisible = true;
		if (GameShell.maxMemory < 96) {
			setParticles(0);
		} else {
			setParticles(2);
		}
		super.customCursors = true;
		super.aBoolean357 = true;
		super.safeMode = false;
		super.anInt4894 = 2;
		super.buildArea = 0;
		super.anInt4881 = Static201.anInt3699 == 1 ? 2 : 4;
		super.aBoolean356 = false;
		super.anInt4878 = 2;
		super.anInt4887 = 0;
		super.aBoolean351 = false;
		@Pc(125) FileOnDisk file = null;
		try {
			@Pc(129) PrivelegedRequest request = signLink.method3749();
			while (request.status == 0) {
				Static231.sleep(1L);
			}
			if (request.status == 1) {
				file = (FileOnDisk) request.result;
				@Pc(153) byte[] bytes = new byte[(int) file.method5195()];
				@Pc(168) int local168;
				for (@Pc(155) int local155 = 0; local155 < bytes.length; local155 += local168) {
					local168 = file.method5193(bytes.length - local155, local155, bytes);
					if (local168 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method4498(new Buffer(bytes));
			}
		} catch (@Pc(193) Exception local193) {
		}
		try {
			if (file != null) {
				file.close();
			}
		} catch (@Pc(200) Exception local200) {
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V")
	public static void setParticles(@OriginalArg(0) int p) {
		if (p < 0 || p > 2) {
			p = 0;
		}
		particles = p;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)I")
	public int method4491(@OriginalArg(1) int arg0) {
		if (this.aBoolean366) {
			return 0;
		} else if (this.method4494(arg0)) {
			return super.roofsVisible ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V")
	public void setAllLevelsVisible(@OriginalArg(0) boolean arg0) {
		super.aBoolean354 = arg0;
		if (Static359.aClass202_4 != null) {
			Static359.aClass202_4.method5159(!this.method4494(Static77.anInt1762));
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)Lclient!bt;")
	public Buffer method4493() {
		@Pc(8) Buffer local8 = new Buffer(39);
		local8.p1(16);
		local8.p1(super.brightness);
		local8.p1(super.aBoolean354 ? 1 : 0);
		local8.p1(super.roofsVisible ? 1 : 0);
		local8.p1(super.groundDecoration ? 1 : 0);
		local8.p1(super.highDetailTextures ? 1 : 0);
		local8.p1(0);
		local8.p1(super.flickeringEffects ? 1 : 0);
		local8.p1(super.groundTextures ? 1 : 0);
		local8.p1(super.characterShadows ? 1 : 0);
		local8.p1(super.sceneryShadows);
		local8.p1(super.highDetailLighting ? 1 : 0);
		local8.p1(super.highDetailWater ? 1 : 0);
		local8.p1(super.fog ? 1 : 0);
		local8.p1(super.antiAliasingMode);
		local8.p1(super.stereo ? 1 : 0);
		local8.p1(super.soundEffectsVolume);
		local8.p1(super.musicVolume);
		local8.p1(super.areaSoundsVolume);
		local8.p2(super.anInt4884);
		local8.p2(super.anInt4893);
		local8.p1(Static184.getParticles());
		local8.p4(super.anInt4887);
		local8.p1(super.anInt4894);
		local8.p1(super.safeMode ? 1 : 0);
		local8.p1(super.aBoolean351 ? 1 : 0);
		local8.p1(super.buildArea);
		local8.p1(super.aBoolean356 ? 1 : 0);
		local8.p1(super.customCursors ? 1 : 0);
		local8.p1(super.manyIdleAnimations);
		local8.p1(super.aBoolean357 ? 1 : 0);
		local8.p1(super.anInt4878);
		local8.p1(super.anInt4881);
		local8.p1(super.aBoolean360 ? 0 : 1);
		return local8;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Z")
	public boolean method4494(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean365 ? super.aBoolean354 : true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)Z")
	public boolean method4495(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean354 : true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!ml;)V")
	public void write(@OriginalArg(1) SignLink signLink) {
		@Pc(7) FileOnDisk file = null;
		try {
			@Pc(17) PrivelegedRequest request = signLink.method3749();
			while (request.status == 0) {
				Static231.sleep(1L);
			}
			if (request.status == 1) {
				file = (FileOnDisk) request.result;
				@Pc(39) Buffer buffer = this.method4493();
				file.write(buffer.bytes, buffer.offset, 0);
			}
		} catch (@Pc(49) Exception exception) {
		}
		try {
			if (file != null) {
				file.close();
			}
		} catch (@Pc(56) Exception exception) {
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!bt;)V")
	private void method4498(@OriginalArg(1) Buffer arg0) {
		if (arg0.bytes.length - arg0.offset < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.g1();
		if (local21 < 0 || local21 > 16) {
			return;
		}
		@Pc(34) byte local34;
		if (local21 == 16) {
			local34 = 38;
		} else if (local21 == 15) {
			local34 = 37;
		} else if (local21 == 14) {
			local34 = 36;
		} else if (local21 == 13) {
			local34 = 35;
		} else if (local21 == 12) {
			local34 = 34;
		} else if (local21 == 11) {
			local34 = 33;
		} else if (local21 == 10) {
			local34 = 32;
		} else if (local21 == 9) {
			local34 = 31;
		} else if (local21 == 8) {
			local34 = 30;
		} else if (local21 == 7) {
			local34 = 29;
		} else if (local21 == 6) {
			local34 = 28;
		} else if (local21 == 5) {
			local34 = 28;
		} else if (local21 == 4) {
			local34 = 24;
		} else if (local21 == 3) {
			local34 = 23;
		} else if (local21 == 2) {
			local34 = 22;
		} else if (local21 == 1) {
			local34 = 23;
		} else {
			local34 = 19;
		}
		if (local34 > arg0.bytes.length - arg0.offset) {
			return;
		}
		super.brightness = arg0.g1();
		if (super.brightness < 1) {
			super.brightness = 1;
		} else if (super.brightness > 4) {
			super.brightness = 4;
		}
		this.setAllLevelsVisible(arg0.g1() == 1);
		super.roofsVisible = arg0.g1() == 1;
		super.groundDecoration = arg0.g1() == 1;
		super.highDetailTextures = arg0.g1() == 1;
		super.manyIdleAnimations = arg0.g1() == 1 ? 1 : 0;
		super.flickeringEffects = arg0.g1() == 1;
		super.groundTextures = arg0.g1() == 1;
		super.characterShadows = arg0.g1() == 1;
		super.sceneryShadows = arg0.g1();
		if (super.sceneryShadows > 2) {
			super.sceneryShadows = 2;
		}
		if (local21 < 2) {
			super.highDetailLighting = arg0.g1() == 1;
			arg0.g1();
		} else {
			super.highDetailLighting = arg0.g1() == 1;
		}
		super.highDetailWater = arg0.g1() == 1;
		super.fog = arg0.g1() == 1;
		super.antiAliasingMode = arg0.g1();
		if (super.antiAliasingMode > 2) {
			super.antiAliasingMode = 2;
		}
		super.anInt4885 = super.antiAliasingMode;
		super.stereo = arg0.g1() == 1;
		super.soundEffectsVolume = arg0.g1();
		if (super.soundEffectsVolume > 127) {
			super.soundEffectsVolume = 127;
		}
		super.musicVolume = arg0.g1();
		super.areaSoundsVolume = arg0.g1();
		if (super.areaSoundsVolume > 127) {
			super.areaSoundsVolume = 127;
		}
		if (local21 >= 1) {
			super.anInt4884 = arg0.g2();
			super.anInt4893 = arg0.g2();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.g1();
		}
		@Pc(437) int local437;
		if (local21 >= 4) {
			local437 = arg0.g1();
			if (local437 < 0 || local437 > 2) {
				local437 = 0;
			}
			if (GameShell.maxMemory < 96) {
				local437 = 0;
			}
			setParticles(local437);
		}
		if (local21 >= 5) {
			super.anInt4887 = arg0.mg4();
		}
		local437 = 0;
		if (local21 >= 6) {
			super.anInt4894 = local437 = arg0.g1();
		}
		if (super.anInt4894 != 1 && super.anInt4894 != 2) {
			super.anInt4894 = 2;
		}
		if (local21 >= 7) {
			super.safeMode = arg0.g1() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean351 = arg0.g1() == 1;
		}
		if (local21 >= 9) {
			super.buildArea = arg0.g1();
		}
		if (super.buildArea < 0 || super.buildArea > Static289.method5018(GameShell.maxMemory)) {
			super.buildArea = 0;
		}
		if (local21 >= 10) {
			super.aBoolean356 = arg0.g1() != 0;
		}
		if (local21 >= 11) {
			super.customCursors = arg0.g1() != 0;
		}
		if (local21 >= 12) {
			super.manyIdleAnimations = arg0.g1();
		}
		if (super.manyIdleAnimations < 0 || super.manyIdleAnimations > 2) {
			super.manyIdleAnimations = 1;
		}
		if (local21 >= 13) {
			super.aBoolean357 = arg0.g1() == 1;
		}
		if (local21 >= 14) {
			super.anInt4878 = arg0.g1();
		} else if (local437 == 0) {
			super.anInt4878 = 2;
		} else {
			super.anInt4878 = 1;
		}
		if (super.anInt4878 < 0 || super.anInt4878 > 3) {
			super.anInt4878 = 2;
		}
		if (local21 >= 15) {
			super.anInt4881 = arg0.g1();
			if (super.anInt4881 < 0 || super.anInt4881 > 4) {
				super.anInt4881 = Static201.anInt3699 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean360 = arg0.g1() != 1;
		}
	}
}
