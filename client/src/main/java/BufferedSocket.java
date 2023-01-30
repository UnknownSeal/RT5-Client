import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class BufferedSocket implements Runnable {

	@OriginalMember(owner = "client!iu", name = "q", descriptor = "Lclient!cc;")
	private PrivelegedRequest thread;

	@OriginalMember(owner = "client!iu", name = "v", descriptor = "[B")
	private byte[] buffer;

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "Z")
	private boolean error = false;

	@OriginalMember(owner = "client!iu", name = "p", descriptor = "Z")
	private boolean closed = false;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
	private int readPointer = 0;

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
	private int writePointer = 0;

	@OriginalMember(owner = "client!iu", name = "r", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!iu", name = "u", descriptor = "Lclient!ml;")
	private final Class152 signlink;

	@OriginalMember(owner = "client!iu", name = "s", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ml;)V")
	public BufferedSocket(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class152 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.signlink = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
	public void method2792() throws IOException {
		if (!this.closed && this.error) {
			this.error = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!iu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2799();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "([BIII)V")
	public void method2793(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.closed) {
			return;
		}
		while (arg1 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg1 -= local14;
			arg2 += local14;
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)I")
	public int method2795() throws IOException {
		return this.closed ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZII[B)V")
	public void write(@OriginalArg(3) byte[] bytes, @OriginalArg(2) int length) throws IOException {
		if (this.closed) {
			return;
		}
		if (this.error) {
			this.error = false;
			throw new IOException();
		}
		if (this.buffer == null) {
			this.buffer = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int i = 0; i < length; i++) {
				this.buffer[this.writePointer] = bytes[i];
				this.writePointer = (this.writePointer + 1) % 5000;
				if ((this.readPointer + 4900) % 5000 == this.writePointer) {
					throw new IOException();
				}
			}
			if (this.thread == null) {
				this.thread = this.signlink.startThread(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V")
	public void method2799() {
		if (this.closed) {
			return;
		}
		synchronized (this) {
			this.closed = true;
			this.notifyAll();
		}
		if (this.thread != null) {
			while (this.thread.anInt993 == 0) {
				Static231.sleep(1L);
			}
			if (this.thread.anInt993 == 1) {
				try {
					((Thread) this.thread.anObject2).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.thread = null;
	}

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "(I)I")
	public int method2800() throws IOException {
		return this.closed ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!iu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(37) int local37;
					@Pc(47) int local47;
					synchronized (this) {
						if (this.writePointer == this.readPointer) {
							if (this.closed) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.readPointer <= this.writePointer) {
							local37 = this.writePointer - this.readPointer;
						} else {
							local37 = 5000 - this.readPointer;
						}
						local47 = this.readPointer;
					}
					if (local37 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.buffer, local47, local37);
					} catch (@Pc(67) IOException local67) {
						this.error = true;
					}
					this.readPointer = (local37 + this.readPointer) % 5000;
					try {
						if (this.writePointer == this.readPointer) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.error = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream1 != null) {
						this.anOutputStream1.close();
					}
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(116) IOException local116) {
				}
				this.buffer = null;
				break;
			}
		} catch (@Pc(121) Exception local121) {
			Static262.method6252(local121, null);
		}
	}

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)V")
	public void method2801() {
		if (!this.closed) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}
}
