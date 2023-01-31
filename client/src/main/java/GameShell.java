import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.*;
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
    public static SignLink signlink;
	@OriginalMember(owner = "client!be", name = "m", descriptor = "Ljava/awt/Canvas;")
	public static Canvas canvas;
	@OriginalMember(owner = "client!sg", name = "k", descriptor = "Lclient!as;")
	public static Timer timer;
	@OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
	public static int logicCycles;
	@OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
	public static int maxMemory = 64;
	@OriginalMember(owner = "client!oj", name = "f", descriptor = "Lclient!un;")
	public static GameShell instance = null;
	@OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
	public static int timeParFrame = 20;
	@OriginalMember(owner = "client!ws", name = "b", descriptor = "J")
	public static long killTime = 0L;
	@OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
	public static int logicTimePointer;
	@OriginalMember(owner = "client!nr", name = "g", descriptor = "Z")
	public static boolean focus;
	@OriginalMember(owner = "client!vo", name = "C", descriptor = "Z")
	public static volatile boolean focusIn = true;
	@OriginalMember(owner = "client!vn", name = "O", descriptor = "Z")
	public static boolean isJava5OrLater = false;
	@OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
	public static int redrawTimePointer;
	@OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
	public static int framesPerSecond = 0;
	@OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
	public static int partialRedraws = 500;
	@OriginalMember(owner = "client!tb", name = "I", descriptor = "Z")
	public static volatile boolean fullRedraw = true;
	@OriginalMember(owner = "client!ju", name = "T", descriptor = "I")
	public static int canvasHeight;
	@OriginalMember(owner = "client!og", name = "a", descriptor = "I")
	public static int canvasWidth;
	@OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
	public static int topMargin = 0;
	@OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
	public static int leftMargin = 0;
	@OriginalMember(owner = "client!vf", name = "X", descriptor = "Ljava/awt/Frame;")
	public static Frame fullScreenFrame;
	@OriginalMember(owner = "client!ge", name = "l", descriptor = "Z")
	public static boolean shutDown = false;
	private static double canvasScale;

	@OriginalMember(owner = "client!un", name = "w", descriptor = "Z")
	private boolean error = false;

	@OriginalMember(owner = "client!un", name = "j", descriptor = "Z")
	private boolean miscNativesLoaded = false;

	@OriginalMember(owner = "client!un", name = "providesignlink", descriptor = "(Lclient!ml;)V")
	public static void providesignlink(@OriginalArg(0) SignLink arg0) {
		signlink = arg0;
		Static392.signlink = arg0;
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

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)J")
	public static long time() {
		return timer.time();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!ml;Ljava/lang/Object;I)V")
	public static void flush(@OriginalArg(0) SignLink signLink, @OriginalArg(1) Object source) {
		if (signLink.eventQueue == null) {
			return;
		}
		for (@Pc(11) int i = 0; i < 50 && signLink.eventQueue.peekEvent() != null; i++) {
			Static231.sleep(1L);
		}
		if (source != null) {
			signLink.eventQueue.postEvent(new ActionEvent(source, 1001, "dummy"));
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
		if (fullScreenFrame != null) {
			local18 = fullScreenFrame;
		} else if (frame == null) {
			local18 = signlink.applet;
		} else {
			local18 = frame;
		}
		local18.setLayout(null);
		canvas = new Canvas_Sub1(this);
		local18.add(canvas);
		canvas.setSize(canvasWidth, canvasHeight);
		canvas.setVisible(true);
		if (local18 == frame) {
			@Pc(54) Insets local54 = frame.getInsets();
			canvas.setLocation(local54.left + leftMargin, local54.top + topMargin);
		} else {
			canvas.setLocation(leftMargin, topMargin);
		}
		canvas.addFocusListener(this);
		canvas.requestFocus();
		focusIn = true;
		focus = true;
		fullRedraw = true;
		Static122.aBoolean176 = false;
		Static48.aLong37 = MonotonicClock.currentTimeMillis();
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
	public final void loadMiscNatives() {
		if (this.miscNativesLoaded) {
			return;
		}
		try {
			@Pc(21) PrivelegedRequest request = signlink.loadMiscNatives(instance.getClass());
			while (request.status == 0) {
				Static231.sleep(100L);
			}
			if (request.result != null) {
				throw (Throwable) request.result;
			}
			jagmisc.init();
			this.miscNativesLoaded = true;
			timer = Timer.create();
		} catch (@Pc(46) Throwable exception) {
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIZIILjava/lang/String;II)V")
	protected final void startApplication(@OriginalArg(5) String arg0, @OriginalArg(7) int arg1) {
		try {
			leftMargin = 0;
			instance = this;
			Static277.clientVersion = 578;
			canvasWidth = 1024;
			Static142.anInt2663 = 1024;
			canvasHeight = 768;
			Static178.anInt2319 = 768;
			topMargin = 0;
			frame = new Frame();
			frame.setTitle("Jagex");
			frame.setResizable(true);
			frame.addWindowListener(this);
			frame.setVisible(true);
			frame.toFront();
			@Pc(48) Insets insets = frame.getInsets();
			frame.setSize(insets.right + insets.left + Static142.anInt2663, insets.bottom + insets.top + Static178.anInt2319);
			Static392.signlink = signlink = new SignLink(null, arg1, arg0, 29);
			@Pc(82) PrivelegedRequest request = signlink.startThread(this, 1);
			while (request.status == 0) {
				Static231.sleep(10L);
			}
		} catch (@Pc(95) Exception exception) {
			Static262.report(exception, null);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
	protected abstract void mainLoop();

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
	protected abstract void mainRedraw();

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
	protected abstract void mainQuit();

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(B)V")
	protected abstract void method1387();

	@OriginalMember(owner = "client!un", name = "e", descriptor = "(I)Z")
	protected final boolean method1388() {
		return true;
	}

	@OriginalMember(owner = "client!un", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String name) {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getParameter(name) : signlink.applet.getParameter(name);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(B)V")
	protected abstract void reset();

	@OriginalMember(owner = "client!un", name = "f", descriptor = "(I)V")
	private void mainLoopWrapper() {
		@Pc(11) long now = MonotonicClock.currentTimeMillis();
		@Pc(15) long previous = logicTimes[logicTimePointer];
		logicTimes[logicTimePointer] = now;
		@Pc(34) boolean local34;
		if (previous == 0L || previous >= now) {
			local34 = false;
		} else {
			local34 = true;
		}
		logicTimePointer = logicTimePointer + 1 & 0x1F;
		synchronized (this) {
			focus = focusIn;
		}
		this.mainLoop();
	}

	@OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V")
	private void mainRedrawWrapper() {
		@Pc(6) long now = MonotonicClock.currentTimeMillis();
		@Pc(10) long previous = redrawTimes[redrawTimePointer];
		redrawTimes[redrawTimePointer] = now;
		if (previous != 0L && previous < now) {
			@Pc(29) int duration = (int) (now - previous);
			framesPerSecond = ((duration >> 1) + 32000) / duration;
		}
		redrawTimePointer = redrawTimePointer + 1 & 0x1F;
		if (partialRedraws++ > 50) {
			partialRedraws -= 50;
			fullRedraw = true;
			canvas.setSize(canvasWidth, canvasHeight);
			canvas.setVisible(true);
			if (frame != null && fullScreenFrame == null) {
				@Pc(76) Insets insets = frame.getInsets();
				canvas.setLocation(insets.left + leftMargin, topMargin + insets.top);
			} else {
				canvas.setLocation(leftMargin, topMargin);
			}
		}
		this.mainRedraw();
	}

	@OriginalMember(owner = "client!un", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (instance == this && !shutDown) {
			killTime = MonotonicClock.currentTimeMillis();
			Static231.sleep(5000L);
			Static392.signlink = null;
			this.shutdown(false);
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
			if (instance == null) {
				canvasHeight = arg2;
				Static178.anInt2319 = arg2;
				Static277.clientVersion = 578;
				leftMargin = 0;
				instance = this;
				topMargin = 0;
				canvasWidth = arg0;
				Static142.anInt2663 = arg0;
				if (signlink == null) {
					Static392.signlink = signlink = new SignLink(this, arg1, null, 0);
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
	private void shutdown(@OriginalArg(1) boolean clean) {
		synchronized (this) {
			if (shutDown) {
				return;
			}
			shutDown = true;
		}
		if (signlink.applet != null) {
			signlink.applet.destroy();
		}
		try {
			this.mainQuit();
		} catch (@Pc(33) Exception exception) {
		}
		if (this.miscNativesLoaded) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable exception) {
			}
			this.miscNativesLoaded = false;
		}
		@Pc(48) PrivelegedRequest local48 = signlink.method3770(instance.getClass());
		while (local48.status == 0) {
			Static231.sleep(100L);
		}
		if (canvas != null) {
			try {
				canvas.removeFocusListener(this);
				canvas.getParent().remove(canvas);
			} catch (@Pc(67) Exception exception) {
			}
		}
		if (signlink != null) {
			try {
				signlink.stop();
			} catch (@Pc(75) Exception exception) {
			}
		}
		this.reset();
		if (frame != null) {
			try {
				System.exit(0);
			} catch (@Pc(89) Throwable exception) {
			}
		}
		System.out.println("Shutdown complete - clean:" + clean);
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
		focusIn = false;
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
				if (SignLink.javaVendor != null) {
					@Pc(10) String javaVendor = SignLink.javaVendor.toLowerCase();
					if (javaVendor.indexOf("sun") != -1 || javaVendor.indexOf("apple") != -1) {
						@Pc(23) String javaVersion = SignLink.javaVersion;
						if (javaVersion.equals("1.1") || javaVersion.startsWith("1.1.") || javaVersion.equals("1.2") || javaVersion.startsWith("1.2.")) {
							this.error("wrongjava");
							break label113;
						}
					} else if (javaVendor.indexOf("ibm") != -1 && (SignLink.javaVersion == null || SignLink.javaVersion.equals("1.4.2"))) {
						this.error("wrongjava");
						break label113;
					}
				}

				if (SignLink.javaVersion != null && SignLink.javaVersion.startsWith("1.")) {
					@Pc(70) int i = 2;
					@Pc(72) int minorVersion = 0;
					while (i < SignLink.javaVersion.length()) {
						@Pc(78) char c = SignLink.javaVersion.charAt(i);
						if (c < '0' || c > '9') {
							break;
						}
						minorVersion = c + minorVersion * 10 - 48;
						i++;
					}
					if (minorVersion >= 5) {
						isJava5OrLater = true;
					}
				}
				if (signlink.applet != null) {
					@Pc(111) Method setFocusCycleRoot = SignLink.setFocusCycleRoot;
					if (setFocusCycleRoot != null) {
						try {
							setFocusCycleRoot.invoke(signlink.applet, Boolean.TRUE);
						} catch (@Pc(126) Throwable exception) {
						}
					}
				}
				getMaxMemory();
				Static60.method886();
				this.method1379();
				this.method1387();
				timer = Timer.create();
				this.loadMiscNatives();
				while (killTime == 0L || MonotonicClock.currentTimeMillis() < killTime) {
					logicCycles = timer.sleep(timeParFrame);
					for (int i = 0; i < logicCycles; i++) {
						this.mainLoopWrapper();
					}
					this.mainRedrawWrapper();
					flush(signlink, canvas);
				}
			}
		} catch (@Pc(179) Exception local179) {
			Static262.report(local179, null);
			this.error("crash");
		}
		this.shutdown(true);
	}

	@OriginalMember(owner = "client!un", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		focusIn = true;
		fullRedraw = true;
	}

	@OriginalMember(owner = "client!un", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (instance == this && !shutDown) {
			killTime = 0L;
		}
	}

	@OriginalMember(owner = "client!un", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (instance != this || shutDown) {
			return;
		}
		fullRedraw = true;
		if (isJava5OrLater && MonotonicClock.currentTimeMillis() - Static48.aLong37 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static142.anInt2663 <= local26.width && Static178.anInt2319 <= local26.height) {
				Static122.aBoolean176 = true;
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (instance == this && !shutDown) {
			killTime = MonotonicClock.currentTimeMillis() + 4000L;
		}
	}
}
