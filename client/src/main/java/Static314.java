import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!sd", name = "N", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
	public static int anInt5911;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)Lclient!bp;")
	public static ParticleEffectorType method5366(@OriginalArg(0) int arg0) {
		@Pc(10) ParticleEffectorType local10 = (ParticleEffectorType) Static119.types.get((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] bytes = Static188.aJs5_52.fetchFile(1, arg0);
		local10 = new ParticleEffectorType();
		local10.anInt749 = arg0;
		if (bytes != null) {
			local10.decode(new Buffer(bytes));
		}
		local10.postDecode();
		if (local10.anInt737 == 2 && Static7.aClass4_151.get(arg0) == null) {
			Static7.aClass4_151.put(new IntNode(Static307.anInt5780), arg0);
			Static278.A_PARTICLE_EFFECTOR_TYPE_ARRAY_1[Static307.anInt5780++] = local10;
		}
		Static119.types.put(arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!nn;)V")
	public static void method5367(@OriginalArg(0) Class2_Sub26_Sub1 arg0) {
		if (Static164.anInt3139 >= 65535) {
			return;
		}
		Static306.aClass2_Sub26_Sub1Array2[Static164.anInt3139] = arg0;
		Static351.aBooleanArray57[Static164.anInt3139] = false;
		Static164.anInt3139++;
		@Pc(18) int local18 = arg0.anInt4380;
		if (arg0.aBoolean300) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt4380;
		if (arg0.aBoolean301) {
			local26 = Static92.anInt1914 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt4371 + Static253.anInt4693 - arg0.anInt4374 >> Static322.anInt6029;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt4371 + arg0.anInt4374 - Static253.anInt4693 >> Static322.anInt6029;
			if (local66 >= Static210.anInt3773) {
				local66 = Static210.anInt3773 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray92[local38++];
				@Pc(96) int local96 = (arg0.anInt4370 + Static253.anInt4693 - arg0.anInt4374 >> Static322.anInt6029) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static72.anInt1684) {
					local104 = Static72.anInt1684 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) long local126 = Static51.aLongArrayArrayArray1[local35][local117][local75];
					if ((local126 & 0xFFFFL) == 0L) {
						Static51.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static164.anInt3139;
					} else if ((local126 & 0xFFFF0000L) == 0L) {
						Static51.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static164.anInt3139 << 16;
					} else if ((local126 & 0xFFFF00000000L) == 0L) {
						Static51.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static164.anInt3139 << 32;
					} else if ((local126 & 0xFFFF000000000000L) == 0L) {
						Static51.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static164.anInt3139 << 48;
					}
				}
			}
		}
	}
}
