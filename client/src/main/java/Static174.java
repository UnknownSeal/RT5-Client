import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "Lclient!nj;")
	public static Class123 aClass123_2;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	public static int anInt1300 = 0;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public static void method1506() {
		@Pc(5) byte local5 = 0;
		if (Static218.preferences.highDetailLighting) {
			local5 = 55;
		}
		Static91.method1963(local5);
		Static359.aClass202_4.method5154(local5);
		ObjTypeList.objTypeList.method2765(local5);
		Static6.aClass219_1.method5577(local5);
		Static322.aClass211_2.method5411(local5);
		Static10.method237(local5);
		Static154.method2783(local5);
		Static317.method5548(local5);
		Static202.method3677(local5);
		if (Static347.anInt6442 == 10) {
			Static336.method5704(28);
		} else if (Static347.anInt6442 == 30) {
			Static336.method5704(25);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	public static void method1507() {
		Static384.aBoolean485 = false;
		Static235.state = 1;
		Static105.songGroupID = -1;
		Static116.songArchive = null;
		Static341.songFileID = -1;
		Static356.volume = 0;
		Static28.volumeFadeRate = 2;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!bt;)Lclient!vo;")
	public static Class173_Sub4 method1508(@OriginalArg(1) Buffer arg0) {
		return new Class173_Sub4(arg0.g2b_dup(), arg0.g2b_dup(), arg0.g2b_dup(), arg0.g2b_dup(), arg0.g2b_dup(), arg0.g2b_dup(), arg0.g2b_dup(), arg0.g2b_dup(), arg0.ig3(), arg0.g1());
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String toString(@OriginalArg(1) Throwable exception) throws IOException {
		@Pc(10) String message;
		if (exception instanceof TracingException) {
			@Pc(15) TracingException tracingException = (TracingException) exception;
			exception = tracingException.message;
			message = tracingException.cause + " | ";
		} else {
			message = "";
		}
		@Pc(32) StringWriter stringWriter = new StringWriter();
		@Pc(37) PrintWriter printWriter = new PrintWriter(stringWriter);
		exception.printStackTrace(printWriter);
		printWriter.close();
		@Pc(45) String stackTrace = stringWriter.toString();
		@Pc(53) BufferedReader reader = new BufferedReader(new StringReader(stackTrace));
		@Pc(56) String firstLine = reader.readLine();
		while (true) {
			@Pc(59) String line = reader.readLine();
			if (line == null) {
				return message + "| " + firstLine;
			}
			@Pc(65) int openingBracketIndex = line.indexOf(40);
			@Pc(72) int closingBracketIndex = line.indexOf(41, openingBracketIndex + 1);
			@Pc(77) String local77;
			if (openingBracketIndex == -1) {
				local77 = line;
			} else {
				local77 = line.substring(0, openingBracketIndex);
			}
			local77 = local77.trim();
			local77 = local77.substring(local77.lastIndexOf(32) + 1);
			local77 = local77.substring(local77.lastIndexOf(9) + 1);
			message = message + local77;
			if (openingBracketIndex != -1 && closingBracketIndex != -1) {
				@Pc(123) int javaSuffixIndex = line.indexOf(".java:", openingBracketIndex);
				if (javaSuffixIndex >= 0) {
					message = message + line.substring(javaSuffixIndex + 5, closingBracketIndex);
				}
			}
			message = message + ' ';
		}
	}
}
