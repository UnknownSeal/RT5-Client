import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class WorldMapFont {

	@OriginalMember(owner = "client!je", name = "e", descriptor = "I")
	public static final int ALPHABET_SIZE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".length();
	@OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
	private static final int[] CHAR_INDEXES = new int[256];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "I")
	private int anInt2912;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	private int anInt2914;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "[I")
	private final int[] anIntArray182 = new int[4];

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "[Lclient!jd;")
	private final Class13[] aClass13Array14;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "[I")
	private final int[] anIntArray183;

	static {
		for (@Pc(7) int c = 0; c < 256; c++) {
			@Pc(12) int i = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(c);
			if (i == -1) {
				i = 74;
			}
			CHAR_INDEXES[c] = i;
		}
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!wm;IZLjava/awt/Component;)V")
	public WorldMapFont(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int size, @OriginalArg(2) boolean arg2, @OriginalArg(3) Component component) {
		this.aBoolean205 = false;
		this.aClass13Array14 = new Class13[256];
		this.anIntArray183 = new int[256];
		@Pc(30) Font bold = new Font("Helvetica", 1, size);
		@Pc(34) FontMetrics boldMetrics = component.getFontMetrics(bold);
		for (@Pc(36) int i = 0; i < ALPHABET_SIZE; i++) {
			this.preRenderGlyph(arg0, bold, boldMetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(i), i, false);
		}
		if (this.aBoolean205) {
			this.aBoolean205 = false;
			bold = new Font("Helvetica", 0, size);
			boldMetrics = component.getFontMetrics(bold);
			for (@Pc(72) int local72 = 0; local72 < ALPHABET_SIZE; local72++) {
				this.preRenderGlyph(arg0, bold, boldMetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(local72), local72, false);
			}
			if (!this.aBoolean205) {
				this.aBoolean205 = false;
				for (@Pc(95) int i = 0; i < ALPHABET_SIZE; i++) {
					this.preRenderGlyph(arg0, bold, boldMetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(i), i, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!wm;Ljava/lang/String;[IIIIZ)V")
	private void method2945(@OriginalArg(0) Class19 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg5 == 0) {
			arg6 = false;
		}
		@Pc(7) int local7 = arg5 | 0xFF000000;
		for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
			@Pc(16) int local16 = CHAR_INDEXES[arg1.charAt(local9)];
			if (arg6) {
				this.aClass13Array14[local16].method6400(arg3 + 1, arg4 + 1, 1, -16777216);
			}
			this.aClass13Array14[local16].method6400(arg3, arg4, 1, local7);
			arg3 += this.anIntArray183[local16];
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "()I")
	public int method2946() {
		return this.anInt2914;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "()I")
	public int method2947() {
		return this.anInt2912 - 1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!wm;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
	private void preRenderGlyph(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Font font, @OriginalArg(2) FontMetrics fontMetrics, @OriginalArg(3) char c, @OriginalArg(4) int arg4, @OriginalArg(5) boolean shadow) {
		@Pc(3) int imageWidth = fontMetrics.charWidth(c);
		@Pc(5) int width = imageWidth;
		if (shadow) {
			try {
				if (c == '/') {
					shadow = false;
				}
				if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k' || c == 'x' || c == 'y' || c == 'A' || c == 'V' || c == 'W') {
					imageWidth++;
				}
			} catch (@Pc(45) Exception exception) {
			}
		}
		@Pc(49) int maxAscent = fontMetrics.getMaxAscent();
		@Pc(55) int imageHeight = fontMetrics.getMaxAscent() + fontMetrics.getMaxDescent();
		@Pc(58) int height = fontMetrics.getHeight();
		@Pc(63) Image image = GameShell.canvas.createImage(imageWidth, imageHeight);
		@Pc(66) Graphics graphics = image.getGraphics();
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, imageWidth, imageHeight);
		graphics.setColor(Color.white);
		graphics.setFont(font);
		graphics.drawString(String.valueOf(c), 0, maxAscent);
		if (shadow) {
			graphics.drawString(String.valueOf(c), 1, maxAscent);
		}
		@Pc(100) int[] pixels = new int[imageWidth * imageHeight];
		@Pc(112) PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, imageWidth, imageHeight, pixels, 0, imageWidth);
		try {
			pixelGrabber.grabPixels();
		} catch (@Pc(117) Exception exception) {
		}
		image.flush();
		@Pc(123) int local123 = 0;
		@Pc(128) int local128;
		label66: for (@Pc(125) int local125 = 0; local125 < imageHeight; local125++) {
			for (local128 = 0; local128 < imageWidth; local128++) {
				@Pc(137) int local137 = pixels[local128 + local125 * imageWidth];
				if ((local137 & 0xFFFFFF) != 0) {
					local123 = local125;
					break label66;
				}
			}
		}
		for (local128 = 0; local128 < pixels.length; local128++) {
			if ((pixels[local128] & 0xFFFFFF) == 0) {
				pixels[local128] = 0;
			}
		}
		this.anInt2914 = maxAscent - local123;
		this.anInt2912 = height;
		this.anIntArray183[arg4] = width;
		this.aClass13Array14[arg4] = arg0.method2884(pixels, imageWidth, imageWidth, imageHeight);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;)I")
	public int method2949(@OriginalArg(0) String arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0.length(); local3++) {
			@Pc(10) int local10 = CHAR_INDEXES[arg0.charAt(local3)];
			local1 += this.anIntArray183[local10];
		}
		return local1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!wm;Ljava/lang/String;IIIZ)V")
	public void method2950(@OriginalArg(0) Class19 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = this.method2949(arg1) / 2;
		arg0.method2851(this.anIntArray182);
		if (arg2 - local5 <= this.anIntArray182[2] && (arg2 + local5 >= this.anIntArray182[0] && (arg3 - this.anInt2914 <= this.anIntArray182[3] && arg3 + this.anInt2912 >= this.anIntArray182[1]))) {
			this.method2945(arg0, arg1, this.anIntArray182, arg2 - local5, arg3, arg4, true);
		}
	}
}
