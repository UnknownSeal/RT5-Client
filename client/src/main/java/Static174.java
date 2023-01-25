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
	public static Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	public static int anInt1300 = 0;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public static void method1506() {
		@Pc(5) byte local5 = 0;
		if (Static218.aClass177_Sub1_2.aBoolean364) {
			local5 = 55;
		}
		Static91.method1963(local5);
		Static359.aClass202_4.method5154(local5);
		Static313.aClass107_2.method2765(local5);
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
		Static235.anInt3365 = 1;
		Static105.anInt2183 = -1;
		Static116.aClass197_26 = null;
		Static341.anInt6376 = -1;
		Static356.anInt6641 = 0;
		Static28.anInt672 = 2;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!bt;)Lclient!vo;")
	public static Class173_Sub4 method1508(@OriginalArg(1) Class2_Sub4 arg0) {
		return new Class173_Sub4(arg0.method4822(), arg0.method4822(), arg0.method4822(), arg0.method4822(), arg0.method4822(), arg0.method4822(), arg0.method4822(), arg0.method4822(), arg0.method4832(), arg0.method4814());
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1509(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString23 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			@Pc(59) String local59 = local53.readLine();
			if (local59 == null) {
				return local10 + "| " + local56;
			}
			@Pc(65) int local65 = local59.indexOf(40);
			@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
			@Pc(77) String local77;
			if (local65 == -1) {
				local77 = local59;
			} else {
				local77 = local59.substring(0, local65);
			}
			local77 = local77.trim();
			local77 = local77.substring(local77.lastIndexOf(32) + 1);
			local77 = local77.substring(local77.lastIndexOf(9) + 1);
			local10 = local10 + local77;
			if (local65 != -1 && local72 != -1) {
				@Pc(123) int local123 = local59.indexOf(".java:", local65);
				if (local123 >= 0) {
					local10 = local10 + local59.substring(local123 + 5, local72);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public static void method1510() {
		aClass123_2 = null;
		aColorArray2 = null;
	}
}
