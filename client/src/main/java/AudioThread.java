import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class AudioThread implements Runnable {

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "Lclient!ml;")
	public SignLink signLink;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "[Lclient!tg;")
	public final AudioChannel[] channels = new AudioChannel[2];

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "Z")
	public volatile boolean stop = false;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "Z")
	public volatile boolean running = false;

	@OriginalMember(owner = "client!kn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.running = true;
		try {
			while (!this.stop) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) AudioChannel local19 = this.channels[local12];
					if (local19 != null) {
						local19.loop();
					}
				}
				Static231.sleep(10L);
				GameShell.flush(this.signLink, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static262.report(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.running = false;
		}
	}
}
