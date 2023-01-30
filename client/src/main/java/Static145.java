import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public static void method2695() {
		@Pc(18) boolean local18 = Static375.aComponent_14 != null || Static348.anInt6449 > 0;
		if (local18) {
			Static116.anInt2357 = 1;
		}
		if (Static148.aBoolean192 && Static174.aClass123_2.method3342(81) && Static268.size > 2) {
			if (local18) {
				Static32.aClass2_Sub5_2 = (Class2_Sub5) Static129.A_LINKED_LIST___19.sentinel.previous.previous;
			} else {
				Static259.method4426((Class2_Sub5) Static129.A_LINKED_LIST___19.sentinel.previous.previous, Static370.aClass2_Sub24_1.method5242(), Static370.aClass2_Sub24_1.method5241());
			}
		} else if (local18) {
			Static32.aClass2_Sub5_2 = (Class2_Sub5) Static129.A_LINKED_LIST___19.sentinel.previous;
		} else {
			Static259.method4426((Class2_Sub5) Static129.A_LINKED_LIST___19.sentinel.previous, Static370.aClass2_Sub24_1.method5242(), Static370.aClass2_Sub24_1.method5241());
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!tl;Lclient!tl;Z)V")
	public static void insertAfter(@OriginalArg(1) SecondaryNode arg1, @OriginalArg(0) SecondaryNode arg0) {
		if (arg1.secondaryPrevious != null) {
			arg1.unlinkSecondary();
		}
		arg1.secondaryNext = arg0.secondaryNext;
		arg1.secondaryPrevious = arg0;
		arg1.secondaryPrevious.secondaryNext = arg1;
		arg1.secondaryNext.secondaryPrevious = arg1;
	}
}
