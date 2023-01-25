import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!p")
public final class Class262_Sub1 extends Class262 {

	@OriginalMember(owner = "unpackclass!p", name = "<init>", descriptor = "([BZZ)V")
	public Class262_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) throws IOException {
		this(arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "unpackclass!p", name = "<init>", descriptor = "([BZZZ)V")
	private Class262_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) throws IOException {
		super(arg1, arg2);
		this.method6606(new DataInputStream(new ByteArrayInputStream(arg0)), arg3);
	}

	@OriginalMember(owner = "unpackclass!p", name = "a", descriptor = "(Ljava/io/DataInputStream;Z)V")
	private void method6606(@OriginalArg(0) DataInputStream arg0, @OriginalArg(1) boolean arg1) throws IOException {
		@Pc(4) int local4 = arg0.read();
		@Pc(7) int local7 = arg0.readInt();
		@Pc(9) int local9 = local7;
		if (local4 != 0) {
			local7 += 4;
		}
		@Pc(19) Class264_Sub1 local19 = new Class264_Sub1(local7 + 5);
		local19.method6579(local4);
		local19.method6581(local9);
		arg0.readFully(local19.aByteArray100, local19.anInt7287, local7);
		this.method6597(local19.aByteArray100);
		for (@Pc(38) int local38 = 0; local38 < super.anInt7309; local38++) {
			local4 = arg0.read();
			local7 = arg0.readInt();
			local9 = local7;
			if (local4 != 0) {
				local7 += 4;
			}
			local19 = new Class264_Sub1(local7 + 5);
			local19.method6579(local4);
			local19.method6581(local9);
			while (local7 > 33554432) {
				arg0.readFully(local19.aByteArray100, local19.anInt7287, 33554432);
				local19.anInt7287 += 33554432;
				local7 -= 33554432;
			}
			arg0.readFully(local19.aByteArray100, local19.anInt7287, local7);
			if (super.aBoolean499) {
				super.anObjectArray37[super.anIntArray543[local38]] = local19.aByteArray100;
			} else {
				super.anObjectArray37[super.anIntArray543[local38]] = Class261.method6558(local19.aByteArray100);
			}
		}
	}
}
