import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class SeqType {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "[[I")
	public int[][] soundeffect;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "[Z")
	public boolean[] frameGroup;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "[I")
	public int[] frameDelay;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "[I")
	public int[] frames;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
	public int anInt4028;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "Lclient!gp;")
	public SeqTypeList aSeqTypeList_2;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "[I")
	private int[] frameSet;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	public int replaycount = 99;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
	public int replayOff = -1;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Z")
	public boolean stretches = false;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	public int looptype = -1;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	public int priority = 5;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
	public int movetype = -1;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
	public int mainhand = -1;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
	public int exactmove = 2;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "Z")
	public boolean aBoolean263 = false;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
	public int offhand = -1;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "Z")
	public boolean tween = false;

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "Z")
	public boolean aBoolean262 = false;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!gn;IZIII)Lclient!gn;")
	public Model method3985(@OriginalArg(0) Model arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.frameDelay[arg1];
		@Pc(13) int local13 = this.frames[arg1];
		@Pc(21) Class2_Sub2_Sub13 local21 = this.aSeqTypeList_2.method2368(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method3799((byte) 1, arg2, true);
		}
		@Pc(35) Class2_Sub2_Sub13 local35 = null;
		if ((this.tween || Static318.forceTween) && arg4 != -1 && this.frames.length > arg4) {
			@Pc(54) int local54 = this.frames[arg4];
			local35 = this.aSeqTypeList_2.method2368(local54 >> 16);
			arg4 = local54 & 0xFFFF;
		}
		@Pc(68) Class2_Sub2_Sub13 local68 = null;
		@Pc(70) Class2_Sub2_Sub13 local70 = null;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.frameSet != null) {
			if (this.frameSet.length > arg1) {
				local72 = this.frameSet[arg1];
				if (local72 != 65535) {
					local68 = this.aSeqTypeList_2.method2368(local72 >> 16);
					local72 &= 0xFFFF;
				}
			}
			if ((this.tween || Static318.forceTween) && arg4 != -1 && this.frameSet.length > arg4) {
				local74 = this.frameSet[arg4];
				if (local74 != 65535) {
					local70 = this.aSeqTypeList_2.method2368(local74 >> 16);
					local74 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean263) {
			arg2 |= 0x200;
		}
		if (local21.method4236(local25)) {
			arg2 |= 0x80;
		}
		if (local21.method4234(local25)) {
			arg2 |= 0x100;
		}
		if (local68 != null) {
			if (local68.method4236(local72)) {
				arg2 |= 0x80;
			}
			if (local68.method4234(local72)) {
				arg2 |= 0x100;
			}
		}
		if (local35 != null) {
			if (local35.method4236(arg4)) {
				arg2 |= 0x80;
			}
			if (local35.method4234(arg4)) {
				arg2 |= 0x100;
			}
		}
		if (local70 != null) {
			if (local70.method4236(local74)) {
				arg2 |= 0x80;
			}
			if (local70.method4234(local74)) {
				arg2 |= 0x100;
			}
		}
		arg2 |= 0x20;
		@Pc(234) Model local234 = arg0.method3799((byte) 1, arg2, true);
		local234.method3827(local8, local35, arg4, this.aBoolean263, arg3 - 1, local25, local21, 0);
		if (local68 != null) {
			local234.method3827(local8, local70, local74, this.aBoolean263, arg3 - 1, local72, local68, 0);
		}
		return local234;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBIIIIBLclient!gn;)Lclient!gn;")
	public Model method3986(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Model arg6) {
		@Pc(8) int local8 = this.frameDelay[arg2];
		@Pc(13) int local13 = this.frames[arg2];
		@Pc(21) Class2_Sub2_Sub13 local21 = this.aSeqTypeList_2.method2368(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg6.method3799(arg1, arg5, true);
		}
		@Pc(35) Class2_Sub2_Sub13 local35 = null;
		if ((this.tween || Static318.forceTween) && arg0 != -1 && arg0 < this.frames.length) {
			@Pc(53) int local53 = this.frames[arg0];
			local35 = this.aSeqTypeList_2.method2368(local53 >> 16);
			arg0 = local53 & 0xFFFF;
		}
		if (this.aBoolean263) {
			arg5 |= 0x200;
		}
		if (local21.method4236(local25)) {
			arg5 |= 0x80;
		}
		if (local21.method4234(local25)) {
			arg5 |= 0x100;
		}
		if (local35 != null) {
			if (local35.method4236(arg0)) {
				arg5 |= 0x80;
			}
			if (local35.method4234(arg0)) {
				arg5 |= 0x100;
			}
		}
		arg5 |= 0x20;
		@Pc(125) Model local125 = arg6.method3799(arg1, arg5, true);
		local125.method3827(local8, local35, arg0, this.aBoolean263, arg4 - 1, local25, local21, arg3);
		return local125;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!bt;II)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(1) int opcode) {
		if (opcode == 1) {
			int count = buffer.g2();
			this.frameDelay = new int[count];
			for (int i = 0; i < count; i++) {
				this.frameDelay[i] = buffer.g2();
			}
			this.frames = new int[count];
			for (int i = 0; i < count; i++) {
				this.frames[i] = buffer.g2();
			}
			for (int i = 0; i < count; i++) {
				this.frames[i] += buffer.g2() << 16;
			}
		} else if (opcode == 2) {
			this.replayOff = buffer.g2();
		} else if (opcode == 3) {
			this.frameGroup = new boolean[256];
			int count = buffer.g1();
			for (int i = 0; i < count; i++) {
				this.frameGroup[buffer.g1()] = true;
			}
		} else if (opcode == 4) {
			this.stretches = true;
		} else if (opcode == 5) {
			this.priority = buffer.g1();
		} else if (opcode == 6) {
			this.mainhand = buffer.g2();
		} else if (opcode == 7) {
			this.offhand = buffer.g2();
		} else if (opcode == 8) {
			this.replaycount = buffer.g1();
		} else if (opcode == 9) {
			this.looptype = buffer.g1();
		} else if (opcode == 10) {
			this.movetype = buffer.g1();
		} else if (opcode == 11) {
			this.exactmove = buffer.g1();
		} else if (opcode == 12) {
			int count = buffer.g1();
			this.frameSet = new int[count];
			for (int i = 0; i < count; i++) {
				this.frameSet[i] = buffer.g2();
			}
			for (int i = 0; i < count; i++) {
				this.frameSet[i] += buffer.g2() << 16;
			}
		} else if (opcode == 13) {
			int count = buffer.g2();
			this.soundeffect = new int[count][];
			for (int i = 0; i < count; i++) {
				int count2 = buffer.g1();
				if (count2 > 0) {
					this.soundeffect[i] = new int[count2];
					this.soundeffect[i][0] = buffer.ig3();
					for (int j = 1; j < count2; j++) {
						this.soundeffect[i][j] = buffer.g2();
					}
				}
			}
		} else if (opcode == 14) {
			this.aBoolean263 = true;
		} else if (opcode == 15) {
			this.tween = true;
		} else if (opcode == 16) {
			this.aBoolean262 = true;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZII)I")
	public int method3989(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.frames[arg0];
		@Pc(14) Class2_Sub2_Sub13 local14 = null;
		@Pc(22) Class2_Sub2_Sub13 local22 = this.aSeqTypeList_2.method2368(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.tween || Static318.forceTween) && arg2 != -1 && this.frames.length > arg2) {
			local7 = this.frames[arg2];
			local14 = this.aSeqTypeList_2.method2368(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean263) {
			local5 = 512;
		}
		if (local22.method4236(local26)) {
			local5 |= 0x80;
		}
		if (local22.method4234(local26)) {
			local5 |= 0x100;
		}
		if (local14 != null) {
			if (local14.method4236(local7)) {
				local5 |= 0x80;
			}
			if (local14.method4234(local7)) {
				local5 |= 0x100;
			}
		}
		if (this.frameSet != null && arg1) {
			@Pc(125) int local125;
			@Pc(138) Class2_Sub2_Sub13 local138;
			if (arg0 < this.frameSet.length) {
				local125 = this.frameSet[arg0];
				if (local125 != 65535) {
					local138 = this.aSeqTypeList_2.method2368(local125 >> 16);
					local125 &= 0xFFFF;
					if (local138 != null) {
						if (local138.method4236(local125)) {
							local5 |= 0x80;
						}
						if (local138.method4234(local125)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.tween || Static318.forceTween) && arg2 != -1 && this.frameSet.length > arg2) {
				local125 = this.frameSet[arg2];
				if (local125 != 65535) {
					local138 = this.aSeqTypeList_2.method2368(local125 >> 16);
					local125 &= 0xFFFF;
					if (local138 != null) {
						if (local138.method4236(local125)) {
							local5 |= 0x80;
						}
						if (local138.method4234(local125)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public void postDecode() {
		if (this.movetype == -1) {
			if (this.frameGroup == null) {
				this.movetype = 0;
			} else {
				this.movetype = 2;
			}
		}
		if (this.looptype != -1) {
			return;
		}
		if (this.frameGroup == null) {
			this.looptype = 0;
		} else {
			this.looptype = 2;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(5) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(buffer, opcode);
		}
	}
}
