import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class IsaacRandom {

	private static final int GOLDEN_RATIO = 0x9E3779B9;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "[I")
	private final int[] mem = new int[256];

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
	private int a;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
	private int b;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "[I")
	private final int[] rsl = new int[256];

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
	private int c;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
	private int count;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "([I)V")
	public IsaacRandom(@OriginalArg(0) int[] seed) {
		System.arraycopy(seed, 0, this.rsl, 0, seed.length);
		this.init();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)I")
	public int nextInt() {
		if (this.count == 0) {
			this.isaac();
			this.count = 256;
		}

		return GlobalConfig.DISABLE_ISAAC ? 0 : this.rsl[this.count - 1];
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)I")
	public int method5533() {
		if (this.count == 0) {
			this.isaac();
			this.count = 256;
		}

		return GlobalConfig.DISABLE_ISAAC ? 0 : this.rsl[--this.count];
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
	private void init() {
		@Pc(15) int h = GOLDEN_RATIO;
		@Pc(17) int g = GOLDEN_RATIO;
		@Pc(19) int f = GOLDEN_RATIO;
		@Pc(21) int e = GOLDEN_RATIO;
		@Pc(23) int d = GOLDEN_RATIO;
		@Pc(25) int c = GOLDEN_RATIO;
		@Pc(27) int b = GOLDEN_RATIO;
		@Pc(28) int a = GOLDEN_RATIO;

		for (int i = 0; i < 4; i++) {
			a ^= b << 11;
			b += c;
			d += a;

			b ^= c >>> 2;
			c += d;
			e += b;

			c ^= d << 8;
			d += e;
			f += c;

			d ^= e >>> 16;
			e += f;
			g += d;

			e ^= f << 10;
			f += g;
			h += e;

			f ^= g >>> 4;
			a += f;
			g += h;

			g ^= h << 8;
			h += a;
			b += g;

			h ^= a >>> 9;
			c += h;
			a += b;
		}

		for (int i = 0; i < 256; i += 8) {
			a += this.rsl[i];
			b += this.rsl[i + 1];
			c += this.rsl[i + 2];
			d += this.rsl[i + 3];
			e += this.rsl[i + 4];
			f += this.rsl[i + 5];
			g += this.rsl[i + 6];
			h += this.rsl[i + 7];

			a ^= b << 11;
			d += a;
			b += c;

			b ^= c >>> 2;
			c += d;
			e += b;

			c ^= d << 8;
			d += e;
			f += c;

			d ^= e >>> 16;
			e += f;
			g += d;

			e ^= f << 10;
			f += g;
			h += e;

			f ^= g >>> 4;
			g += h;
			a += f;

			g ^= h << 8;
			b += g;
			h += a;

			h ^= a >>> 9;
			c += h;
			a += b;

			this.mem[i] = a;
			this.mem[i + 1] = b;
			this.mem[i + 2] = c;
			this.mem[i + 3] = d;
			this.mem[i + 4] = e;
			this.mem[i + 5] = f;
			this.mem[i + 6] = g;
			this.mem[i + 7] = h;
		}

		for (int i = 0; i < 256; i += 8) {
			a += this.mem[i];
			b += this.mem[i + 1];
			c += this.mem[i + 2];
			d += this.mem[i + 3];
			e += this.mem[i + 4];
			f += this.mem[i + 5];
			g += this.mem[i + 6];
			h += this.mem[i + 7];

			a ^= b << 11;
			b += c;
			d += a;

			b ^= c >>> 2;
			c += d;
			e += b;

			c ^= d << 8;
			d += e;
			f += c;

			d ^= e >>> 16;
			g += d;
			e += f;

			e ^= f << 10;
			f += g;
			h += e;

			f ^= g >>> 4;
			a += f;
			g += h;

			g ^= h << 8;
			b += g;
			h += a;

			h ^= a >>> 9;
			a += b;
			c += h;

			this.mem[i] = a;
			this.mem[i + 1] = b;
			this.mem[i + 2] = c;
			this.mem[i + 3] = d;
			this.mem[i + 4] = e;
			this.mem[i + 5] = f;
			this.mem[i + 6] = g;
			this.mem[i + 7] = h;
		}

		this.isaac();
		this.count = 256;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
	private void isaac() {
		this.b += ++this.c;

		for (@Pc(23) int i = 0; i < 256; i++) {
			@Pc(29) int x = this.mem[i];

			switch (i & 3) {
				case 0:
					this.a ^= this.a << 13;
					break;
				case 1:
					this.a ^= this.a >>> 6;
					break;
				case 2:
					this.a ^= this.a << 2;
					break;
				case 3:
					this.a ^= this.a >>> 16;
					break;
			}

			this.a += this.mem[i + 128 & 0xFF];

			@Pc(116) int y;
			this.mem[i] = y = this.b + this.mem[x >> 2 & 0xFF] + this.a;
			this.rsl[i] = this.b = this.mem[y >> 8 >> 2 & 0xFF] + x;
		}
	}
}
