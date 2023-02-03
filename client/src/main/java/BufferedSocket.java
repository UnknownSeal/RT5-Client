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
	private final Socket socket;

	@OriginalMember(owner = "client!iu", name = "u", descriptor = "Lclient!ml;")
	private final SignLink signlink;

	@OriginalMember(owner = "client!iu", name = "s", descriptor = "Ljava/io/InputStream;")
	private InputStream inputStream;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "Ljava/io/OutputStream;")
	private OutputStream outputStream;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ml;)V")
	public BufferedSocket(@OriginalArg(0) Socket socket, @OriginalArg(1) SignLink signLink) throws IOException {
		this.socket = socket;
		this.signlink = signLink;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.inputStream = this.socket.getInputStream();
		this.outputStream = this.socket.getOutputStream();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
	public void checkError() throws IOException {
		if (!this.closed && this.error) {
			this.error = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!iu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.close();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "([BIII)V")
	public void read(@OriginalArg(3) int offset, @OriginalArg(1) int length, @OriginalArg(0) byte[] bytes) throws IOException {
		if (this.closed) {
			return;
		}
		while (length > 0) {
			@Pc(14) int n = this.inputStream.read(bytes, offset, length);
			if (n <= 0) {
				throw new EOFException();
			}
			length -= n;
			offset += n;
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)I")
	public int available() throws IOException {
		return this.closed ? 0 : this.inputStream.available();
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
	public void close() {
		if (this.closed) {
			return;
		}
		synchronized (this) {
			this.closed = true;
			this.notifyAll();
		}
		if (this.thread != null) {
			while (this.thread.status == 0) {
				Static231.sleep(1L);
			}
			if (this.thread.status == 1) {
				try {
					((Thread) this.thread.result).join();
				} catch (@Pc(54) InterruptedException exception) {
				}
			}
		}
		this.thread = null;
	}

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "(I)I")
	public int read() throws IOException {
		return this.closed ? 0 : this.inputStream.read();
	}

	@OriginalMember(owner = "client!iu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				ready: {
					@Pc(37) int length;
					@Pc(47) int offset;
					synchronized (this) {
						if (this.writePointer == this.readPointer) {
							if (this.closed) {
								break ready;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException exception) {
							}
						}
						if (this.readPointer <= this.writePointer) {
							length = this.writePointer - this.readPointer;
						} else {
							length = 5000 - this.readPointer;
						}
						offset = this.readPointer;
					}
					if (length <= 0) {
						continue;
					}
					try {
						this.outputStream.write(this.buffer, offset, length);
					} catch (@Pc(67) IOException exception) {
						this.error = true;
					}
					this.readPointer = (length + this.readPointer) % 5000;
					try {
						if (this.writePointer == this.readPointer) {
							this.outputStream.flush();
						}
					} catch (@Pc(92) IOException exception) {
						this.error = true;
					}
					continue;
				}
				try {
					if (this.inputStream != null) {
						this.inputStream.close();
					}
					if (this.outputStream != null) {
						this.outputStream.close();
					}
					if (this.socket != null) {
						this.socket.close();
					}
				} catch (@Pc(116) IOException exception) {
				}
				this.buffer = null;
				break;
			}
		} catch (@Pc(121) Exception exception) {
			Static262.report(exception, null);
		}
	}

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)V")
	public void breakConnection() {
		if (!this.closed) {
			this.inputStream = new BrokenInputStream();
			this.outputStream = new BrokenOutputStream();
		}
	}
}
