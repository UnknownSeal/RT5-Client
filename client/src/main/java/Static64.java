import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "Lclient!nk;")
	public static Component aComponent_2;

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
	public static int anInt1555 = 0;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)Z")
	public static boolean isPlaying() {
		return Static235.state == 0 ? Static91.stream.isValid() : true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!r;Lclient!r;)I")
	public static int getReady(@OriginalArg(2) Js5 spritesArchive, @OriginalArg(1) Js5 fontMetricsArchive) {
		@Pc(5) int local5 = 0;
		if (spritesArchive.isFileReady(Static183.anInt80)) {
			local5++;
		}
		if (spritesArchive.isFileReady(Static371.anInt7014)) {
			local5++;
		}
		if (spritesArchive.isFileReady(Static80.anInt6679)) {
			local5++;
		}
		if (fontMetricsArchive.isFileReady(Static183.anInt80)) {
			local5++;
		}
		if (fontMetricsArchive.isFileReady(Static371.anInt7014)) {
			local5++;
		}
		if (fontMetricsArchive.isFileReady(Static80.anInt6679)) {
			local5++;
		}
		return local5;
	}
}
