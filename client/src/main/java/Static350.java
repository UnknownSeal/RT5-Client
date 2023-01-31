import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void method5836() {
		if (Static140.aBoolean187) {
			return;
		}
		Static140.aBoolean187 = true;
		Static100.aBoolean156 = true;
		if (Static218.aClass177_Sub1_2.aBoolean351) {
			Static31.aFloat28 = (int) Static31.aFloat28 + 47 & 0xFFFFFFF0;
		} else {
			Static296.aFloat68 += (12.0F - Static296.aFloat68) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BILjava/lang/String;[BII)I")
	public static int encodeString(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) byte[] destination, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg0;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(22) char c = arg1.charAt(local15);
			if (c > '\u0000' && c < '\u0080' || !(c < ' ' || c > 'ÿ')) {
				destination[local15 + arg3] = (byte) c;
			} else if (c == '€') {
				destination[local15 + arg3] = -128;
			} else if (c == '‚') {
				destination[arg3 + local15] = -126;
			} else if (c == 'ƒ') {
				destination[arg3 + local15] = -125;
			} else if (c == '„') {
				destination[local15 + arg3] = -124;
			} else if (c == '…') {
				destination[arg3 + local15] = -123;
			} else if (c == '†') {
				destination[arg3 + local15] = -122;
			} else if (c == '‡') {
				destination[arg3 + local15] = -121;
			} else if (c == 'ˆ') {
				destination[local15 + arg3] = -120;
			} else if (c == '‰') {
				destination[local15 + arg3] = -119;
			} else if (c == 'Š') {
				destination[arg3 + local15] = -118;
			} else if (c == '‹') {
				destination[local15 + arg3] = -117;
			} else if (c == 'Œ') {
				destination[local15 + arg3] = -116;
			} else if (c == 'Ž') {
				destination[local15 + arg3] = -114;
			} else if (c == '‘') {
				destination[local15 + arg3] = -111;
			} else if (c == '’') {
				destination[local15 + arg3] = -110;
			} else if (c == '“') {
				destination[arg3 + local15] = -109;
			} else if (c == '”') {
				destination[local15 + arg3] = -108;
			} else if (c == '•') {
				destination[local15 + arg3] = -107;
			} else if (c == '–') {
				destination[local15 + arg3] = -106;
			} else if (c == '—') {
				destination[local15 + arg3] = -105;
			} else if (c == '˜') {
				destination[local15 + arg3] = -104;
			} else if (c == '™') {
				destination[arg3 + local15] = -103;
			} else if (c == 'š') {
				destination[local15 + arg3] = -102;
			} else if (c == '›') {
				destination[arg3 + local15] = -101;
			} else if (c == 'œ') {
				destination[arg3 + local15] = -100;
			} else if (c == 'ž') {
				destination[arg3 + local15] = -98;
			} else if (c == 'Ÿ') {
				destination[local15 + arg3] = -97;
			} else {
				destination[local15 + arg3] = 63;
			}
		}
		return local8;
	}
}
