import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class IdentityKitType {

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[S")
    private short[] retex_d;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "[S")
    private short[] recol_s;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[S")
    private short[] recol_d;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[S")
    private short[] retex_s;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "[I")
    private int[] bodyModels;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Lclient!e;")
    public IdentityKitTypeList identityKitTypeList;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "[I")
    private final int[] headModels = new int[]{-1, -1, -1, -1, -1};

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)Z")
    public boolean isHeadModelReady() {
        @Pc(7) boolean ready = true;
        @Pc(11) Js5 local11 = this.identityKitTypeList.modelsArchive;
        synchronized (this.identityKitTypeList.modelsArchive) {
            for (@Pc(27) int i = 0; i < 5; i++) {
                if (this.headModels[i] != -1 && !this.identityKitTypeList.modelsArchive.isFileReady(this.headModels[i], 0)) {
                    ready = false;
                }
            }
            return ready;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!bt;)V")
    private void decode(@OriginalArg(0) int opcode, @OriginalArg(2) Buffer buffer) {
        if (opcode == 1) {
            buffer.g1();
        } else if (opcode == 2) {
            @Pc(19) int length = buffer.g1();
            this.bodyModels = new int[length];
            for (@Pc(25) int i = 0; i < length; i++) {
                this.bodyModels[i] = buffer.g2();
            }
        } else if (opcode == 3) {

        } else if (opcode == 40) {
            int length = buffer.g1();
            this.recol_d = new short[length];
            this.recol_s = new short[length];
            for (int i = 0; i < length; i++) {
                this.recol_s[i] = (short) buffer.g2();
                this.recol_d[i] = (short) buffer.g2();
            }
        } else if (opcode == 41) {
            int length = buffer.g1();
            this.retex_d = new short[length];
            this.retex_s = new short[length];
            for (int i = 0; i < length; i++) {
                this.retex_s[i] = (short) buffer.g2();
                this.retex_d[i] = (short) buffer.g2();
            }
        } else if (opcode >= 60 && opcode < 70) {
            this.headModels[opcode - 60] = buffer.g2();
        }
    }


    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)Z")
    public boolean isBodyModelReady() {
        if (this.bodyModels == null) {
            return true;
        }
        @Pc(12) boolean ready = true;
        @Pc(16) Js5 local16 = this.identityKitTypeList.modelsArchive;
        synchronized (this.identityKitTypeList.modelsArchive) {
            for (@Pc(20) int i = 0; i < this.bodyModels.length; i++) {
                if (!this.identityKitTypeList.modelsArchive.isFileReady(this.bodyModels[i], 0)) {
                    ready = false;
                }
            }
            return ready;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!bt;I)V")
    public void decode(@OriginalArg(0) Buffer buffer) {
        while (true) {
            @Pc(5) int opcode = buffer.g1();
            if (opcode == 0) {
                return;
            }
            this.decode(opcode, buffer);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)Lclient!pr;")
    public RawModel getHeadModel() {
        @Pc(13) RawModel[] models = new RawModel[5];
        @Pc(15) int modelCount = 0;
        @Pc(19) Js5 local19 = this.identityKitTypeList.modelsArchive;
        synchronized (this.identityKitTypeList.modelsArchive) {
            for (@Pc(23) int i = 0; i < 5; i++) {
                if (this.headModels[i] != -1) {
                    models[modelCount++] = RawModel.create(this.identityKitTypeList.modelsArchive, this.headModels[i]);
                }
            }
        }
        @Pc(62) RawModel model = new RawModel(models, modelCount);
        if (this.recol_s != null) {
            for (@Pc(67) int i = 0; i < this.recol_s.length; i++) {
                model.recolor(this.recol_s[i], this.recol_d[i]);
            }
        }
        if (this.retex_s != null) {
            for (int i = 0; i < this.retex_s.length; i++) {
                model.retexture(this.retex_d[i], this.retex_s[i]);
            }
        }
        return model;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Lclient!pr;")
    public RawModel getBodyModel() {
        if (this.bodyModels == null) {
            return null;
        }
        @Pc(23) RawModel[] models = new RawModel[this.bodyModels.length];
        @Pc(27) Js5 local27 = this.identityKitTypeList.modelsArchive;
        synchronized (this.identityKitTypeList.modelsArchive) {
            @Pc(31) int i = 0;
            while (true) {
                if (this.bodyModels.length <= i) {
                    break;
                }
                models[i] = RawModel.create(this.identityKitTypeList.modelsArchive, this.bodyModels[i]);
                i++;
            }
        }
        @Pc(73) RawModel model;
        if (models.length == 1) {
            model = models[0];
        } else {
            model = new RawModel(models, models.length);
        }
        if (model == null) {
            return null;
        }
        if (this.recol_s != null) {
            for (@Pc(87) int i = 0; i < this.recol_s.length; i++) {
                model.recolor(this.recol_s[i], this.recol_d[i]);
            }
        }
        if (this.retex_s != null) {
            for (int i = 0; i < this.retex_s.length; i++) {
                model.retexture(this.retex_d[i], this.retex_s[i]);
            }
        }
        return model;
    }
}
