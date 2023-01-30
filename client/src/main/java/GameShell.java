import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!uq", name = "hb", descriptor = "[J")
	public static final long[] redrawTimes = new long[32];
	@OriginalMember(owner = "client!qr", name = "m", descriptor = "[J")
	public static final long[] logicTimes = new long[32];
	@OriginalMember(owner = "client!ms", name = "x", descriptor = "Ljava/awt/Frame;")
	public static Frame frame;
    @OriginalMember(owner = "client!tb", name = "W", descriptor = "Lclient!ml;")
    public static Class152 signlink;
	@OriginalMember(owner = "client!be", name = "m", descriptor = "Ljava/awt/Canvas;")
	public static Canvas canvas;
	@OriginalMember(owner = "client!sg", name = "k", descriptor = "Lclient!as;")
	public static Class5 timer;
	@OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
	public static int logicCycles;
	@OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
	public static int maxMemory = 64;
	private static double canvasScale;

	@OriginalMember(owner = "client!un", name = "w", descriptor = "Z")
	private boolean error = false;

	@OriginalMember(owner = "client!un", name = "j", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!un", name = "providesignlink", descriptor = "(Lclient!ml;)V")
	public static void providesignlink(@OriginalArg(0) Class152 arg0) {
		signlink = arg0;
		Static392.aClass152_6 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void resetTimer() {
		timer.reset();
		for (@Pc(12) int i = 0; i < 32; i++) {
			redrawTimes[i] = 0L;
		}
		for (@Pc(24) int i = 0; i < 32; i++) {
			logicTimes[i] = 0L;
		}
		logicCycles = 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void getMaxMemory() {
		if (Static215.anInt3795 == 2) {
			maxMemory = 96;
			return;
		}
		try {
			@Pc(29) Method method = Runtime.class.getMethod("maxMemory");
			if (method != null) {
				try {
					@Pc(33) Runtime runtime = Runtime.getRuntime();
					@Pc(39) Long bytes = (Long) method.invoke(runtime, (Object[]) null);
					maxMemory = (int) (bytes / 1048576L) + 1;
				} catch (@Pc(49) Throwable exception) {
				}
			}
		} catch (@Pc(51) Exception exception) {
		}
	}

	@OriginalMember(owner = "client!un", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent windowEvent) {
	}

	@OriginalMember(owner = "client!un", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent windowEvent) {
		this.destroy();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	public final synchronized void method1379() {
		if (canvas != null) {
			canvas.removeFocusListener(this);
			canvas.getParent().remove(canvas);
		}
		@Pc(18) Container local18;
		if (Static363.aFrame2 != null) {
			local18 = Static363.aFrame2;
		} else if (frame == null) {
			local18 = signlink.applet;
		} else {
			local18 = frame;
		}
		local18.setLayout(null);
		canvas = new Canvas_Sub1(this);
		local18.add(canvas);
		canvas.setSize(Static250.anInt4665, Static172.anInt3299);
		canvas.setVisible(true);
		if (local18 == frame) {
			@Pc(54) Insets local54 = frame.getInsets();
			canvas.setLocation(local54.left + Static84.anInt1842, local54.top + Static68.anInt1646);
		} else {
			canvas.setLocation(Static84.anInt1842, Static68.anInt1646);
		}
		canvas.addFocusListener(this);
		canvas.requestFocus();
		Static371.aBoolean475 = true;
		Static242.aBoolean306 = true;
		Static328.aBoolean412 = true;
		Static122.aBoolean176 = false;
		Static48.aLong37 = MonotonicClock.currentTimeMillis();
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
	public final void method1382() {
		if (this.aBoolean94) {
			return;
		}
		try {
			@Pc(21) PrivelegedRequest local21 = signlink.method3751(Static253.anGameShell.getClass());
			while (local21.status == 0) {
				Static231.sleep(100L);
			}
			if (local21.result != null) {
				throw (Throwable) local21.result;
			}
			jagmisc.init();
			this.aBoolean94 = true;
			timer = Static65.method1738();
		} catch (@Pc(46) Throwable local46) {
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIZIILjava/lang/String;II)V")
	protected final void startApplication(@OriginalArg(5) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static84.anInt1842 = 0;
			Static253.anGameShell = this;
			Static277.clientVersion = 578;
			Static250.anInt4665 = 1024;
			Static142.anInt2663 = 1024;
			Static172.anInt3299 = 768;
			Static178.anInt2319 = 768;
			Static68.anInt1646 = 0;
			frame = new Frame();
			frame.setTitle("Jagex");
			frame.setResizable(true);
			frame.addWindowListener(this);
			frame.setVisible(true);
			frame.toFront();
			@Pc(48) Insets insets = frame.getInsets();
			frame.setSize(insets.right + insets.left + Static142.anInt2663, insets.bottom + insets.top + Static178.anInt2319);
			Static392.aClass152_6 = signlink = new Class152(null, arg1, arg0, 29);
			@Pc(82) PrivelegedRequest request = signlink.startThread(this, 1);
			while (request.status == 0) {
				Static231.sleep(10L);
			}
		} catch (@Pc(95) Exception local95) {
			Static262.report(local95, null);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
	protected abstract void method1384();

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
	protected abstract void method1385();

	@OriginalMember(owner = "client!un", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getCodeBase() : signlink.applet.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!un", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!un", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(I)V")
	protected abstract void method1386();

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(B)V")
	protected abstract void method1387();

	@OriginalMember(owner = "client!un", name = "e", descriptor = "(I)Z")
	protected final boolean method1388() {
		return true;
	}

	@OriginalMember(owner = "client!un", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getParameter(arg0) : signlink.applet.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(B)V")
	protected abstract void method1389();

	@OriginalMember(owner = "client!un", name = "f", descriptor = "(I)V")
	private void method1390() {
		@Pc(11) long local11 = MonotonicClock.currentTimeMillis();
		@Pc(15) long local15 = logicTimes[Static255.anInt4703];
		logicTimes[Static255.anInt4703] = local11;
		@Pc(34) boolean local34;
		if (local15 == 0L || local15 >= local11) {
			local34 = false;
		} else {
			local34 = true;
		}
		Static255.anInt4703 = Static255.anInt4703 + 1 & 0x1F;
		synchronized (this) {
			Static242.aBoolean306 = Static371.aBoolean475;
		}
		this.method1384();
	}

	@OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V")
	private void method1391() {
		@Pc(6) long local6 = MonotonicClock.currentTimeMillis();
		@Pc(10) long local10 = redrawTimes[Static76.anInt1739];
		redrawTimes[Static76.anInt1739] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(29) int local29 = (int) (local6 - local10);
			Static3.anInt62 = ((local29 >> 1) + 32000) / local29;
		}
		Static76.anInt1739 = Static76.anInt1739 + 1 & 0x1F;
		if (Static210.anInt3761++ > 50) {
			Static328.aBoolean412 = true;
			Static210.anInt3761 -= 50;
			canvas.setSize(Static250.anInt4665, Static172.anInt3299);
			canvas.setVisible(true);
			if (frame != null && Static363.aFrame2 == null) {
				@Pc(76) Insets local76 = frame.getInsets();
				canvas.setLocation(local76.left + Static84.anInt1842, Static68.anInt1646 + local76.top);
			} else {
				canvas.setLocation(Static84.anInt1842, Static68.anInt1646);
			}
		}
		this.method1385();
	}

	@OriginalMember(owner = "client!un", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static253.anGameShell == this && !Static111.aBoolean167) {
			Static393.aLong231 = MonotonicClock.currentTimeMillis();
			Static231.sleep(5000L);
			Static392.aClass152_6 = null;
			this.method1395(false);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void error(@OriginalArg(1) String error) {
		if (this.error) {
			return;
		}
		this.error = true;
		System.out.println("error_game_" + error);
		try {
			BrowserControl.call(signlink.applet, "loggedout");
		} catch (@Pc(33) Throwable throwable) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + error + ".ws"), "_top");
		} catch (@Pc(53) Exception exception) {
		}
	}

	@OriginalMember(owner = "client!un", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!un", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getDocumentBase() : signlink.applet.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIII)V")
	protected final void method1394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static253.anGameShell == null) {
				Static172.anInt3299 = arg2;
				Static178.anInt2319 = arg2;
				Static277.clientVersion = 578;
				Static84.anInt1842 = 0;
				Static253.anGameShell = this;
				Static68.anInt1646 = 0;
				Static250.anInt4665 = arg0;
				Static142.anInt2663 = arg0;
				if (signlink == null) {
					Static392.aClass152_6 = signlink = new Class152(this, arg1, null, 0);
				}
				@Pc(66) PrivelegedRequest local66 = signlink.startThread(this, 1);
				while (local66.status == 0) {
					Static231.sleep(10L);
				}
			} else {
				Static373.anInt7032++;
				if (Static373.anInt7032 >= 3) {
					this.error("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(76) Exception local76) {
			Static262.report(local76, null);
			this.error("crash");
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BZ)V")
	private void method1395(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static111.aBoolean167) {
				return;
			}
			Static111.aBoolean167 = true;
		}
		if (signlink.applet != null) {
			signlink.applet.destroy();
		}
		try {
			this.method1386();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean94) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean94 = false;
		}
		@Pc(48) PrivelegedRequest local48 = signlink.method3770(Static253.anGameShell.getClass());
		while (local48.status == 0) {
			Static231.sleep(100L);
		}
		if (canvas != null) {
			try {
				canvas.removeFocusListener(this);
				canvas.getParent().remove(canvas);
			} catch (@Pc(67) Exception local67) {
			}
		}
		if (signlink != null) {
			try {
				signlink.method3767();
			} catch (@Pc(75) Exception local75) {
			}
		}
		this.method1389();
		if (frame != null) {
			try {
				System.exit(0);
			} catch (@Pc(89) Throwable local89) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!un", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getAppletContext() : signlink.applet.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!un", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static371.aBoolean475 = false;
	}

	@OriginalMember(owner = "client!un", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label113: {
				if (Static215.aString33 != null) {
					@Pc(10) String local10 = Static215.aString33.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(23) String local23 = Static215.aString34;
						if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
							this.error("wrongjava");
							break label113;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static215.aString34 == null || Static215.aString34.equals("1.4.2"))) {
						this.error("wrongjava");
						break label113;
					}
				}
				@Pc(70) int local70;
				if (Static215.aString34 != null && Static215.aString34.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (local70 < Static215.aString34.length()) {
						@Pc(78) char local78 = Static215.aString34.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local72 = local78 + local72 * 10 - 48;
						local70++;
					}
					if (local72 >= 5) {
						Static370.aBoolean473 = true;
					}
				}
				if (signlink.applet != null) {
					@Pc(111) Method local111 = Static215.aMethod2;
					if (local111 != null) {
						try {
							local111.invoke(signlink.applet, Boolean.TRUE);
						} catch (@Pc(126) Throwable local126) {
						}
					}
				}
				getMaxMemory();
				Static60.method886();
				this.method1379();
				this.method1387();
				timer = Static65.method1738();
				this.method1382();
				while (Static393.aLong231 == 0L || MonotonicClock.currentTimeMillis() < Static393.aLong231) {
					logicCycles = timer.method4408(Static44.anInt1106);
					for (local70 = 0; local70 < logicCycles; local70++) {
						this.method1390();
					}
					this.method1391();
					Static283.method4875(signlink, canvas);
				}
			}
		} catch (@Pc(179) Exception local179) {
			Static262.report(local179, null);
			this.error("crash");
		}
		this.method1395(true);
	}

	@OriginalMember(owner = "client!un", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static371.aBoolean475 = true;
		Static328.aBoolean412 = true;
	}

	@OriginalMember(owner = "client!un", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static253.anGameShell == this && !Static111.aBoolean167) {
			Static393.aLong231 = 0L;
		}
	}

	@OriginalMember(owner = "client!un", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static253.anGameShell != this || Static111.aBoolean167) {
			return;
		}
		Static328.aBoolean412 = true;
		if (Static370.aBoolean473 && MonotonicClock.currentTimeMillis() - Static48.aLong37 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static142.anInt2663 <= local26.width && Static178.anInt2319 <= local26.height) {
				Static122.aBoolean176 = true;
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static253.anGameShell == this && !Static111.aBoolean167) {
			Static393.aLong231 = MonotonicClock.currentTimeMillis() + 4000L;
		}
	}
}
