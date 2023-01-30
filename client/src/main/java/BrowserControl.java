import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class BrowserControl {

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
	public static Object call(@OriginalArg(0) Applet applet, @OriginalArg(1) String methodName) throws Throwable {
		return JSObject.getWindow(applet).call(methodName, (Object[]) null);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V")
	public static void eval(@OriginalArg(2) Applet applet, @OriginalArg(1) String methodName) throws Throwable {
		JSObject.getWindow(applet).eval(methodName);
	}
}
