import jaggl.opengl;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "[I")
	private static final int[] anIntArray84 = new int[2];

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!bf;ILjava/lang/String;)Lclient!cg;")
	public static Class35 method1280(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(2) String code) {
		@Pc(2) opengl gl = arg0.anOpengl1;
		@Pc(6) int local6 = gl.glCreateShaderObjectARB(GL.GL_FRAGMENT_SHADER);
		gl.glShaderSourceARB(local6, 1, new String[] { code }, new int[] { code.length() }, 0);
		gl.glCompileShaderARB(local6);
		gl.glGetObjectParameterivARB(local6, GL.GL_COMPILE_STATUS, anIntArray84, 0);
		if (anIntArray84[0] == 0) {
			if (anIntArray84[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			gl.glGetObjectParameterivARB(local6, GL.GL_INFO_LOG_LENGTH, anIntArray84, 1);
			if (anIntArray84[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray84[1]];
				gl.glGetInfoLogARB(local6, anIntArray84[1], anIntArray84, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray84[0] == 0) {
				gl.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class35(arg0, local6, 35632);
	}
}
