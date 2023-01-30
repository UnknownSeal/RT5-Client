import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class PrivelegedRequest {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Ljava/lang/Object;")
	public volatile Object result;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Lclient!cc;")
	public PrivelegedRequest next;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public int anInt991;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Ljava/lang/Object;")
	public Object objectArg;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
	public int anInt992;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
	public volatile int status = 0;
}
