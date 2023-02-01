import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class SignLink implements Runnable {

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Ljava/lang/String;")
	public static String javaVersion;
	@OriginalMember(owner = "client!ml", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	public static Method setFocusCycleRoot;
	@OriginalMember(owner = "client!ml", name = "i", descriptor = "Ljava/lang/String;")
	public static String javaVendor;
	@OriginalMember(owner = "client!ml", name = "p", descriptor = "[Lclient!rl;")
	public FileOnDisk[] aFileOnDiskArray1;

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "Lclient!fc;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "Ljava/applet/Applet;")
	public Applet applet = null;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "Lclient!rl;")
	public FileOnDisk aFileOnDisk_2 = null;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Lclient!cc;")
	private PrivelegedRequest requestQueueHead = null;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Lclient!rl;")
	public FileOnDisk aFileOnDisk_1 = null;

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "Lclient!rl;")
	public FileOnDisk aFileOnDisk_3 = null;

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "Lclient!cc;")
	private PrivelegedRequest requestQueueTail = null;

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue eventQueue;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public SignLink(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		javaVersion = "1.1";
		this.applet = arg0;
		javaVendor = "Unknown";
		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static215.aString35 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static215.aString35 = "Unknown";
		}
		Static215.aString30 = Static215.aString35.toLowerCase();
		try {
			Static215.aString31 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static215.aString31 = "";
		}
		try {
			Static215.aString32 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static215.aString32 = "";
		}
		try {
			Static215.aString29 = System.getProperty("user.home");
			if (Static215.aString29 != null) {
				Static215.aString29 = Static215.aString29 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static215.aString29 == null) {
			Static215.aString29 = "~/";
		}
		try {
			this.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static215.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static215.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				setFocusCycleRoot = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				setFocusCycleRoot = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean247 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;[Ljava/lang/Class;)Lclient!cc;")
	public PrivelegedRequest method3747(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.enqueue(new Object[] { arg0, arg1, arg2 }, 0, 8, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIZI)Lclient!cc;")
	public PrivelegedRequest method3748(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.enqueue(null, (arg0 << 16) + arg1, 6, arg2 << 16);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)Lclient!cc;")
	public PrivelegedRequest method3749() {
		return this.enqueue(null, 0, 12, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!cc;")
	public PrivelegedRequest openSocket(@OriginalArg(0) String hostname, @OriginalArg(1) int port) {
		return this.enqueue(hostname, port, 1, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!cc;")
	public PrivelegedRequest loadMiscNatives(@OriginalArg(1) Class arg0) {
		return this.enqueue(arg0, 0, 20, 0);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(ILjava/lang/Class;)Lclient!cc;")
	public PrivelegedRequest method3753(@OriginalArg(1) Class arg0) {
		return this.enqueue(arg0, 0, 10, 0);
	}

	@OriginalMember(owner = "client!ml", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) PrivelegedRequest local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean247) {
						return;
					}
					if (this.requestQueueHead != null) {
						local15 = this.requestQueueHead;
						this.requestQueueHead = this.requestQueueHead.next;
						if (this.requestQueueHead == null) {
							this.requestQueueTail = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(31) InterruptedException local31) {
					}
				}
			}
			try {
				@Pc(41) int local41 = local15.anInt991;
				if (local41 == 1) {
					if (MonotonicClock.currentTimeMillis() < Static215.aLong122) {
						throw new IOException();
					}
					local15.result = new Socket(InetAddress.getByName((String) local15.objectArg), local15.anInt992);
				} else if (local41 == 2) {
					@Pc(81) Thread local81 = new Thread((Runnable) local15.objectArg);
					local81.setDaemon(true);
					local81.start();
					local81.setPriority(local15.anInt992);
					local15.result = local81;
				} else if (local41 == 4) {
					if (MonotonicClock.currentTimeMillis() < Static215.aLong122) {
						throw new IOException();
					}
					local15.result = new DataInputStream(((URL) local15.objectArg).openStream());
				} else {
					@Pc(166) Object[] local166;
					if (local41 == 8) {
						local166 = (Object[]) local15.objectArg;
						local15.result = ((Class) local166[0]).getDeclaredMethod((String) local166[1], (Class[]) local166[2]);
					} else if (local41 == 9) {
						local166 = (Object[]) local15.objectArg;
						local15.result = ((Class) local166[0]).getDeclaredField((String) local166[1]);
					} else if (local41 == 18) {
						@Pc(134) Clipboard local134 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.result = local134.getContents(null);
					} else if (local41 == 19) {
						@Pc(149) Transferable local149 = (Transferable) local15.objectArg;
						@Pc(152) Clipboard local152 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local152.setContents(local149, null);
					} else {
						throw new Exception("");
					}
				}
				local15.status = 1;
			} catch (@Pc(202) ThreadDeath local202) {
				throw local202;
			} catch (@Pc(205) Throwable local205) {
				local15.status = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Lclient!cc;")
	public PrivelegedRequest method3755() {
		return this.enqueue(null, 0, 13, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)Lclient!cc;")
	public PrivelegedRequest method3756(@OriginalArg(1) int arg0) {
		return this.enqueue(null, arg0, 3, 0);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
	public void breakConnection() {
		Static215.aLong122 = MonotonicClock.currentTimeMillis() + 5000L;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!cc;")
	public PrivelegedRequest method3760(@OriginalArg(0) String arg0) {
		return this.enqueue(arg0, 0, 16, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lclient!cc;")
	public PrivelegedRequest method3761(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.enqueue(new Object[] { arg0, arg1 }, 0, 9, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!cc;")
	public PrivelegedRequest method3762(@OriginalArg(0) Frame arg0) {
		return this.enqueue(arg0, 0, 7, 0);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)Lclient!fc;")
	public Interface3 method3763() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Z")
	public boolean method3764() {
		return false;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLjava/net/URL;)Lclient!cc;")
	public PrivelegedRequest method3765(@OriginalArg(1) URL arg0) {
		return this.enqueue(arg0, 0, 4, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!cc;")
	private PrivelegedRequest enqueue(@OriginalArg(0) Object objectArg, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) PrivelegedRequest request = new PrivelegedRequest();
		request.objectArg = objectArg;
		request.anInt991 = arg2;
		request.anInt992 = arg1;
		synchronized (this) {
			if (this.requestQueueTail == null) {
				this.requestQueueTail = this.requestQueueHead = request;
			} else {
				this.requestQueueTail.next = request;
				this.requestQueueTail = request;
			}
			this.notify();
			return request;
		}
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	public void stop() {
		synchronized (this) {
			this.aBoolean247 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aFileOnDisk_2 != null) {
			try {
				this.aFileOnDisk_2.close();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aFileOnDisk_3 != null) {
			try {
				this.aFileOnDisk_3.close();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aFileOnDiskArray1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aFileOnDiskArray1.length; local49++) {
				if (this.aFileOnDiskArray1[local49] != null) {
					try {
						this.aFileOnDiskArray1[local49].close();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.aFileOnDisk_1 != null) {
			try {
				this.aFileOnDisk_1.close();
			} catch (@Pc(79) IOException local79) {
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!cc;")
	public PrivelegedRequest startThread(@OriginalArg(2) Runnable runnable, @OriginalArg(0) int priority) {
		return this.enqueue(runnable, priority, 2, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/awt/Point;I[ILjava/awt/Component;I)Lclient!cc;")
	public PrivelegedRequest method3769(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) int arg4) {
		return this.enqueue(new Object[] { arg3, arg2, arg1 }, arg0, 17, arg4);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(ILjava/lang/Class;)Lclient!cc;")
	public PrivelegedRequest method3770(@OriginalArg(1) Class arg0) {
		return this.enqueue(arg0, 0, 11, 0);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)Lclient!cc;")
	public PrivelegedRequest method3771() {
		return this.enqueue(null, 0, 5, 0);
	}
}
