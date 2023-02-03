import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Js5QuickChatCommandDecoder implements QuickChatCommandDecoder {

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
	@Override
	public String decode(@OriginalArg(1) long value, @OriginalArg(2) int[] parameters, @OriginalArg(3) int command) {
		if (command == 0) {
			@Pc(23) EnumType type = EnumTypeList.enumTypeList.get(parameters[0]);
			return type.getString((int) value);
		} else if (command == 1 || command == 10) {
			@Pc(45) ObjType type = ObjTypeList.objTypeList.get((int) value);
			return type.name;
		} else if (command == 6 || command == 7 || command == 11) {
			return EnumTypeList.enumTypeList.get(parameters[0]).getString((int) value);
		} else {
			return null;
		}
	}
}
