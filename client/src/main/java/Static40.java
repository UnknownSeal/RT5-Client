import jaggl.opengl;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "[I")
	private static final int[] anIntArray84 = new int[2];

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!bf;ILjava/lang/String;)Lclient!cg;")
	public static Class35 create(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(2) String code) {
		@Pc(2) opengl gl = arg0.anOpengl1;
		@Pc(6) int id = gl.glCreateShaderObjectARB(GL.GL_FRAGMENT_SHADER);
		gl.glShaderSourceARB(id, 1, new String[] { code }, new int[] { code.length() }, 0);
		gl.glCompileShaderARB(id);
		gl.glGetObjectParameterivARB(id, GL.GL_COMPILE_STATUS, anIntArray84, 0);
		if (anIntArray84[0] == 0) {
			if (anIntArray84[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			gl.glGetObjectParameterivARB(id, GL.GL_INFO_LOG_LENGTH, anIntArray84, 1);
			if (anIntArray84[1] > 1) {
				@Pc(60) byte[] log = new byte[anIntArray84[1]];
				gl.glGetInfoLogARB(id, anIntArray84[1], anIntArray84, 0, log, 0);
				System.out.println(new String(log));
			}
			if (anIntArray84[0] == 0) {
				gl.glDeleteObjectARB(id);
				return null;
			}
		}
		return new Class35(arg0, id, 35632);
	}
}
