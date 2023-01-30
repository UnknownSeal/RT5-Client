import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class MapElementList {

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
	public int size;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "[I")
	public final int[] elements;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "[I")
	public final int[] positions;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V")
	public MapElementList(@OriginalArg(0) int size) {
		this.size = size;
		this.elements = new int[this.size];
		this.positions = new int[this.size];
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!r;Ljava/lang/String;ZI)Lclient!ih;")
	public static MapElementList create(@OriginalArg(0) Js5 archive, @OriginalArg(1) String group, @OriginalArg(2) boolean allowMembers) {
		@Pc(10) int groupID = archive.getGroupID(group);
		if (groupID == -1) {
			return new MapElementList(0);
		}
		@Pc(28) int[] fileIDs = archive.getFileIDs(groupID);
		@Pc(34) MapElementList list = new MapElementList(fileIDs.length);
		@Pc(36) int i = 0;
		@Pc(38) int j = 0;
		while (true) {
			while (i < list.size) {
				@Pc(52) Buffer buffer = new Buffer(archive.fetchFile(groupID, fileIDs[j++]));
				@Pc(58) int position = buffer.mg4();
				@Pc(62) int id = buffer.g2();
				@Pc(66) int members = buffer.g1();
				if (!allowMembers && members == 1) {
					list.size--;
				} else {
					list.positions[i] = position;
					list.elements[i] = id;
					i++;
				}
			}
			return list;
		}
	}
}
