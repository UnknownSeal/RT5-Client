import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
	public static int anInt4226 = -1;

	@OriginalMember(owner = "client!ni", name = "P", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[100];

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!ml;ILjava/lang/String;I)Lclient!cc;")
	public static PrivelegedRequest method4094(@OriginalArg(0) Class152 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			return arg0.method3760(arg2);
		}
		@Pc(79) PrivelegedRequest local79;
		if (arg1 == 2) {
			try {
				arg0.applet.getAppletContext().showDocument(new URL(arg0.applet.getCodeBase(), arg2), "_blank");
				local79 = new PrivelegedRequest();
				local79.status = 1;
				return local79;
			} catch (@Pc(85) Exception local85) {
				local79 = new PrivelegedRequest();
				local79.status = 2;
				return local79;
			}
		} else if (arg1 == 3) {
			try {
				BrowserControl.call(arg0.applet, "loggedout");
			} catch (@Pc(105) Throwable local105) {
			}
			try {
				arg0.applet.getAppletContext().showDocument(new URL(arg0.applet.getCodeBase(), arg2), "_top");
				local79 = new PrivelegedRequest();
				local79.status = 1;
				return local79;
			} catch (@Pc(127) Exception local127) {
				local79 = new PrivelegedRequest();
				local79.status = 2;
				return local79;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(CI)B")
	public static byte encodeChar(@OriginalArg(0) char codepoint) {
		@Pc(28) byte b;
		if (codepoint > '\u0000' && codepoint < '\u0080' || !(codepoint < ' ' || codepoint > 'ÿ')) {
			b = (byte) codepoint;
		} else if (codepoint == '€') {
			b = -128;
		} else if (codepoint == '‚') {
			b = -126;
		} else if (codepoint == 'ƒ') {
			b = -125;
		} else if (codepoint == '„') {
			b = -124;
		} else if (codepoint == '…') {
			b = -123;
		} else if (codepoint == '†') {
			b = -122;
		} else if (codepoint == '‡') {
			b = -121;
		} else if (codepoint == 'ˆ') {
			b = -120;
		} else if (codepoint == '‰') {
			b = -119;
		} else if (codepoint == 'Š') {
			b = -118;
		} else if (codepoint == '‹') {
			b = -117;
		} else if (codepoint == 'Œ') {
			b = -116;
		} else if (codepoint == 'Ž') {
			b = -114;
		} else if (codepoint == '‘') {
			b = -111;
		} else if (codepoint == '’') {
			b = -110;
		} else if (codepoint == '“') {
			b = -109;
		} else if (codepoint == '”') {
			b = -108;
		} else if (codepoint == '•') {
			b = -107;
		} else if (codepoint == '–') {
			b = -106;
		} else if (codepoint == '—') {
			b = -105;
		} else if (codepoint == '˜') {
			b = -104;
		} else if (codepoint == '™') {
			b = -103;
		} else if (codepoint == 'š') {
			b = -102;
		} else if (codepoint == '›') {
			b = -101;
		} else if (codepoint == 'œ') {
			b = -100;
		} else if (codepoint == 'ž') {
			b = -98;
		} else if (codepoint == 'Ÿ') {
			b = -97;
		} else {
			b = 63;
		}
		return b;
	}
}
