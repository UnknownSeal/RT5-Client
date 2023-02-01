import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public abstract class MouseWheel {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)Lclient!kp;")
	public static MouseWheel create() {
		try {
			return (MouseWheel) Class.forName("JavaMouseWheel").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void stop(@OriginalArg(1) Component component);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void start(@OriginalArg(1) Component component);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)I")
	public abstract int getWheelRotation();
}
