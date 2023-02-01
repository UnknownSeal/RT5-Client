import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Js5 {

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "Z")
	public static final boolean RAISE_EXCEPTIONS = false;
	@OriginalMember(owner = "client!r", name = "c", descriptor = "[Ljava/lang/Object;")
	private Object[] packed;

	@OriginalMember(owner = "client!r", name = "S", descriptor = "[[Ljava/lang/Object;")
	private Object[][] unpacked;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "Lclient!ra;")
	private Js5Index index = null;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "Lclient!di;")
	private final Js5ResourceProvider provider;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "Z")
	private final boolean discardPacked;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "I")
	public int discardUnpacked;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!di;ZI)V")
	public Js5(@OriginalArg(0) Js5ResourceProvider provider, @OriginalArg(1) boolean discardPacked, @OriginalArg(2) int discardUnpacked) {
		this.provider = provider;
		this.discardPacked = discardPacked;
		this.discardUnpacked = discardUnpacked;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)I")
	private int getPercentageComplete(@OriginalArg(1) int group) {
		if (this.isGroupValid(group)) {
			return this.packed[group] == null ? this.provider.getPercentageComplete(group) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public void method5067() {
		if (this.unpacked != null) {
			for (@Pc(11) int local11 = 0; local11 < this.unpacked.length; local11++) {
				this.unpacked[local11] = null;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)Z")
	private boolean isFileValid(@OriginalArg(2) int group, @OriginalArg(0) int file) {
		if (!this.isIndexReady()) {
			return false;
		} else if (group >= 0 && file >= 0 && this.index.groupCapacities.length > group && file < this.index.groupCapacities[group]) {
			return true;
		} else if (RAISE_EXCEPTIONS) {
			throw new IllegalArgumentException(group + "," + file);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZIZ)V")
	public void discardNames(@OriginalArg(2) boolean groups) {
		if (!this.isIndexReady()) {
			return;
		}
		this.index.fileNameHashTables = null;
		this.index.fileNameHashes = null;
		if (groups) {
			this.index.groupNameHashes = null;
			this.index.gruopNameHashTable = null;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(BI)Z")
	public boolean isGroupReady(@OriginalArg(1) int group) {
		if (!this.isGroupValid(group)) {
			return false;
		} else if (this.packed[group] == null) {
			this.fetchGroup(group);
			return this.packed[group] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean isGroupReady(@OriginalArg(0) String group) {
		if (this.isIndexReady()) {
			@Pc(20) String groupLowercase = group.toLowerCase();
			@Pc(29) int groupID = this.index.gruopNameHashTable.get(Static278.hashCode(groupLowercase));
			return this.isGroupReady(groupID);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Z")
	public boolean fetchAll() {
		if (!this.isIndexReady()) {
			return false;
		}
		@Pc(13) boolean success = true;
		for (@Pc(15) int i = 0; i < this.index.groupIDs.length; i++) {
			@Pc(23) int groupID = this.index.groupIDs[i];
			if (this.packed[groupID] == null) {
				this.fetchGroup(groupID);
				if (this.packed[groupID] == null) {
					success = false;
				}
			}
		}
		return success;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BII[I)Z")
	private boolean method5073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.isGroupValid(arg1)) {
			return false;
		} else if (this.packed[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.index.anIntArray376[arg1];
			@Pc(31) int[] local31 = this.index.fileIDs[arg1];
			if (this.unpacked[arg1] == null) {
				this.unpacked[arg1] = new Object[this.index.groupCapacities[arg1]];
			}
			@Pc(60) Object[] local60 = this.unpacked[arg1];
			@Pc(62) boolean local62 = true;
			for (@Pc(64) int local64 = 0; local64 < local25; local64++) {
				@Pc(70) int local70;
				if (local31 == null) {
					local70 = local64;
				} else {
					local70 = local31[local64];
				}
				if (local60[local70] == null) {
					local62 = false;
					break;
				}
			}
			if (local62) {
				return true;
			}
			@Pc(128) byte[] local128;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local128 = ByteArray.unwrap(false, this.packed[arg1]);
			} else {
				local128 = ByteArray.unwrap(true, this.packed[arg1]);
				@Pc(133) Buffer local133 = new Buffer(local128);
				local133.tinydec(arg2, local133.bytes.length);
			}
			@Pc(157) byte[] local157;
			try {
				local157 = Static161.method2969(local128);
			} catch (@Pc(159) RuntimeException local159) {
				throw Static382.method6363(local159, "T3 - " + (arg2 != null) + "," + arg1 + "," + local128.length + "," + Static36.method1111(local128, local128.length) + "," + Static36.method1111(local128, local128.length - 2) + "," + this.index.anIntArray382[arg1] + "," + this.index.checksum);
			}
			if (this.discardPacked) {
				this.packed[arg1] = null;
			}
			@Pc(232) int local232;
			if (local25 > 1) {
				@Pc(239) int local239;
				@Pc(252) Buffer local252;
				@Pc(260) int local260;
				@Pc(264) int local264;
				@Pc(266) int local266;
				@Pc(320) int local320;
				@Pc(322) int local322;
				@Pc(326) int local326;
				@Pc(328) int local328;
				if (this.discardUnpacked == 2) {
					local232 = local157.length;
					local232--;
					local239 = local157[local232] & 0xFF;
					local232 -= local239 * local25 * 4;
					local252 = new Buffer(local157);
					@Pc(437) int local437 = 0;
					local252.offset = local232;
					local260 = 0;
					for (local264 = 0; local264 < local239; local264++) {
						local266 = 0;
						for (local320 = 0; local320 < local25; local320++) {
							local266 += local252.mg4();
							if (local31 == null) {
								local322 = local320;
							} else {
								local322 = local31[local320];
							}
							if (arg0 == local322) {
								local260 = local322;
								local437 += local266;
							}
						}
					}
					if (local437 == 0) {
						return true;
					}
					@Pc(496) byte[] local496 = new byte[local437];
					local252.offset = local232;
					local437 = 0;
					local320 = 0;
					for (local322 = 0; local322 < local239; local322++) {
						local326 = 0;
						for (local328 = 0; local328 < local25; local328++) {
							local326 += local252.mg4();
							@Pc(523) int local523;
							if (local31 == null) {
								local523 = local328;
							} else {
								local523 = local31[local328];
							}
							if (local523 == arg0) {
								Static403.copy(local157, local320, local496, local437, local326);
								local437 += local326;
							}
							local320 += local326;
						}
					}
					local60[local260] = local496;
				} else {
					local232 = local157.length;
					@Pc(235) int local235 = local232 - 1;
					local239 = local157[local235] & 0xFF;
					@Pc(247) int local247 = local235 - local239 * local25 * 4;
					local252 = new Buffer(local157);
					@Pc(255) int[] local255 = new int[local25];
					local252.offset = local247;
					for (local260 = 0; local260 < local239; local260++) {
						local264 = 0;
						for (local266 = 0; local266 < local25; local266++) {
							local264 += local252.mg4();
							local255[local266] += local264;
						}
					}
					@Pc(296) byte[][] local296 = new byte[local25][];
					for (local266 = 0; local266 < local25; local266++) {
						local296[local266] = new byte[local255[local266]];
						local255[local266] = 0;
					}
					local252.offset = local247;
					local320 = 0;
					for (local322 = 0; local322 < local239; local322++) {
						local326 = 0;
						for (local328 = 0; local328 < local25; local328++) {
							local326 += local252.mg4();
							Static403.copy(local157, local320, local296[local328], local255[local328], local326);
							local320 += local326;
							local255[local328] += local326;
						}
					}
					for (local326 = 0; local326 < local25; local326++) {
						if (local31 == null) {
							local328 = local326;
						} else {
							local328 = local31[local326];
						}
						if (this.discardUnpacked == 0) {
							local60[local328] = ByteArray.wrap(local296[local326]);
						} else {
							local60[local328] = local296[local326];
						}
					}
				}
			} else {
				if (local31 == null) {
					local232 = 0;
				} else {
					local232 = local31[0];
				}
				if (this.discardUnpacked == 0) {
					local60[local232] = ByteArray.wrap(local157);
				} else {
					local60[local232] = local157;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int getGroupID(@OriginalArg(1) String group) {
		if (this.isIndexReady()) {
			@Pc(18) String groupLowercase = group.toLowerCase();
			@Pc(29) int groupID = this.index.gruopNameHashTable.get(Static278.hashCode(groupLowercase));
			return this.isGroupValid(groupID) ? groupID : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/lang/String;B)V")
	public void method5075(@OriginalArg(0) String arg0) {
		if (this.isIndexReady()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.index.gruopNameHashTable.get(Static278.hashCode(local17));
			this.method5082(local26);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ)[I")
	public int[] getFileIDs(@OriginalArg(0) int group) {
		if (!this.isGroupValid(group)) {
			return null;
		}
		@Pc(23) int[] fileIDs = this.index.fileIDs[group];
		if (fileIDs == null) {
			fileIDs = new int[this.index.anIntArray376[group]];
			@Pc(34) int i = 0;
			while (i < fileIDs.length) {
				fileIDs[i] = i++;
			}
		}
		return fileIDs;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)I")
	public int getChecksum() {
		if (!this.isIndexReady()) {
			throw new IllegalStateException("");
		}
		return this.index.checksum;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(BI)V")
	private void fetchGroup(@OriginalArg(1) int group) {
		if (this.discardPacked) {
			this.packed[group] = this.provider.fetchGroup(group);
		} else {
			this.packed[group] = ByteArray.wrap(this.provider.fetchGroup(group));
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([IIII)[B")
	public byte[] fetchFile(@OriginalArg(3) int group, @OriginalArg(2) int file, @OriginalArg(0) int[] key) {
		if (!this.isFileValid(group, file)) {
			return null;
		}
		if (this.unpacked[group] == null || this.unpacked[group][file] == null) {
			@Pc(32) boolean local32 = this.method5073(file, group, key);
			if (!local32) {
				this.fetchGroup(group);
				local32 = this.method5073(file, group, key);
				if (!local32) {
					return null;
				}
			}
		}
		@Pc(65) byte[] data = ByteArray.unwrap(false, this.unpacked[group][file]);
		if (this.discardUnpacked == 1) {
			this.unpacked[group][file] = null;
			if (this.index.groupCapacities[group] == 1) {
				this.unpacked[group] = null;
			}
		} else if (this.discardUnpacked == 2) {
			this.unpacked[group] = null;
		}
		return data;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)I")
	public int method5080(@OriginalArg(0) int arg0) {
		return this.isGroupValid(arg0) ? this.index.groupCapacities[arg0] : 0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[B")
	public byte[] fetchFile(@OriginalArg(0) int id) {
		if (!this.isIndexReady()) {
			return null;
		} else if (this.index.groupCapacities.length == 1) {
			return this.fetchFile(0, id);
		} else if (!this.isGroupValid(id)) {
			return null;
		} else if (this.index.groupCapacities[id] == 1) {
			return this.fetchFile(id, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
	private void method5082(@OriginalArg(0) int arg0) {
		this.provider.method885(arg0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] fetchFile(@OriginalArg(0) String group, @OriginalArg(1) String file) {
		if (!this.isIndexReady()) {
			return null;
		}
		@Pc(12) String groupLowercase = group.toLowerCase();
		@Pc(15) String fileLowercase = file.toLowerCase();
		@Pc(28) int groupID = this.index.gruopNameHashTable.get(Static278.hashCode(groupLowercase));
		if (this.isGroupValid(groupID)) {
			@Pc(46) int fileID = this.index.fileNameHashTables[groupID].get(Static278.hashCode(fileLowercase));
			return this.fetchFile(groupID, fileID);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/lang/String;B)I")
	public int method5084(@OriginalArg(0) String arg0) {
		if (this.isIndexReady()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.index.gruopNameHashTable.get(Static278.hashCode(local12));
			return this.getPercentageComplete(local21);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Z")
	private boolean isIndexReady() {
		if (this.index == null) {
			this.index = this.provider.fetchIndex();
			if (this.index == null) {
				return false;
			}
			this.packed = new Object[this.index.capacity];
			this.unpacked = new Object[this.index.capacity][];
		}
		return true;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(BI)Z")
	public boolean isFileReady(@OriginalArg(1) int id) {
		if (!this.isIndexReady()) {
			return false;
		} else if (this.index.groupCapacities.length == 1) {
			return this.isFileReady(0, id);
		} else if (!this.isGroupValid(id)) {
			return false;
		} else if (this.index.groupCapacities[id] == 1) {
			return this.isFileReady(id, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(III)Z")
	public boolean isFileReady(@OriginalArg(2) int group, @OriginalArg(0) int file) {
		if (!this.isFileValid(group, file)) {
			return false;
		} else if (this.unpacked[group] != null && this.unpacked[group][file] != null) {
			return true;
		} else if (this.packed[group] == null) {
			this.fetchGroup(group);
			return this.packed[group] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BII)[B")
	public byte[] fetchFile(@OriginalArg(2) int group, @OriginalArg(1) int file) {
		return this.fetchFile(group, file, null);
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
	public void method5089() {
		if (this.packed != null) {
			for (@Pc(14) int local14 = 0; local14 < this.packed.length; local14++) {
				this.packed[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(B)I")
	public int getPercentageComplete() {
		if (!this.isIndexReady()) {
			return 0;
		}
		@Pc(13) int total = 0;
		@Pc(23) int complete = 0;
		for (@Pc(25) int i = 0; i < this.packed.length; i++) {
			if (this.index.anIntArray376[i] > 0) {
				total += 100;
				complete += this.getPercentageComplete(i);
			}
		}
		if (total == 0) {
			return 100;
		} else {
			return complete * 100 / total;
		}
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(B)I")
	public int method5091() {
		return this.isIndexReady() ? this.index.groupCapacities.length : -1;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(II)V")
	public void method5094(@OriginalArg(1) int arg0) {
		if (this.isGroupValid(arg0) && this.unpacked != null) {
			this.unpacked[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IZ)I")
	public int method5096(@OriginalArg(0) int arg0) {
		if (this.isIndexReady()) {
			@Pc(16) int local16 = this.index.gruopNameHashTable.get(arg0);
			return this.isGroupValid(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Z")
	public boolean isFileReady(@OriginalArg(0) String group, @OriginalArg(1) String file) {
		if (!this.isIndexReady()) {
			return false;
		}
		@Pc(12) String groupLowercase = group.toLowerCase();
		@Pc(15) String fileLowercase = file.toLowerCase();
		@Pc(24) int groupID = this.index.gruopNameHashTable.get(Static278.hashCode(groupLowercase));
		if (this.isGroupValid(groupID)) {
			@Pc(47) int fileID = this.index.fileNameHashTables[groupID].get(Static278.hashCode(fileLowercase));
			return this.isFileReady(groupID, fileID);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean isGroupNameValid(@OriginalArg(1) String group) {
		if (this.isIndexReady()) {
			@Pc(12) String groupLowercase = group.toLowerCase();
			@Pc(21) int groupID = this.index.gruopNameHashTable.get(Static278.hashCode(groupLowercase));
			return groupID >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(II)Z")
	private boolean isGroupValid(@OriginalArg(1) int arg0) {
		if (!this.isIndexReady()) {
			return false;
		} else if (arg0 >= 0 && this.index.groupCapacities.length > arg0 && this.index.groupCapacities[arg0] != 0) {
			return true;
		} else if (RAISE_EXCEPTIONS) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}
}
