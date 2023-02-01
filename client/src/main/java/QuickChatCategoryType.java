import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class QuickChatCategoryType extends SecondaryNode {

	@OriginalMember(owner = "client!mn", name = "C", descriptor = "[I")
	public int[] phrases;

	@OriginalMember(owner = "client!mn", name = "D", descriptor = "[C")
	public char[] subcategoryShortcuts;

	@OriginalMember(owner = "client!mn", name = "E", descriptor = "[I")
	public int[] subcategories;

	@OriginalMember(owner = "client!mn", name = "G", descriptor = "Ljava/lang/String;")
	public String description;

	@OriginalMember(owner = "client!mn", name = "M", descriptor = "[C")
	public char[] phraseShortcuts;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)V")
	public void method3792() {
		@Pc(10) int local10;
		if (this.phrases != null) {
			for (local10 = 0; local10 < this.phrases.length; local10++) {
				this.phrases[local10] |= 0x8000;
			}
		}
		if (this.subcategories != null) {
			for (local10 = 0; local10 < this.subcategories.length; local10++) {
				this.subcategories[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(CZ)I")
	public int getSubcategoryByShortcut(@OriginalArg(0) char shortcut) {
		if (this.subcategories == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.subcategories.length; local20++) {
			if (this.subcategoryShortcuts[local20] == shortcut) {
				return this.subcategories[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BILclient!bt;)V")
	private void decode(@OriginalArg(2) Buffer buffer, @OriginalArg(1) int opcode) {
		if (opcode == 1) {
			this.description = buffer.gjstr();
		} else if (opcode == 2) {
			int count = buffer.g1();
			this.subcategories = new int[count];
			this.subcategoryShortcuts = new char[count];
			for (int i = 0; i < count; i++) {
				this.subcategories[i] = buffer.g2();
				byte shortcut = buffer.g1b();
				this.subcategoryShortcuts[i] = shortcut == 0 ? 0 : Static78.decodeChar(shortcut);
			}
		} else if (opcode == 3) {
			int count = buffer.g1();
			this.phraseShortcuts = new char[count];
			this.phrases = new int[count];
			for (int i = 0; i < count; i++) {
				this.phrases[i] = buffer.g2();
				byte phrase = buffer.g1b();
				this.phraseShortcuts[i] = phrase == 0 ? 0 : Static78.decodeChar(phrase);
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!bt;B)V")
	public void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(5) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(buffer, opcode);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZC)I")
	public int getPhraseByShortcut(@OriginalArg(1) char shortcut) {
		if (this.phrases == null) {
			return -1;
		}
		for (@Pc(17) int i = 0; i < this.phrases.length; i++) {
			if (this.phraseShortcuts[i] == shortcut) {
				return this.phrases[i];
			}
		}
		return -1;
	}
}
