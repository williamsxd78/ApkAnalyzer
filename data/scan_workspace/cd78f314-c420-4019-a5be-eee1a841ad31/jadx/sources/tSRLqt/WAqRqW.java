package tSRLqt;

/* JADX WARN: Incorrect field signature: LEJY/GhU/IYG/IuM; */
/* JADX WARN: Incorrect field signature: LGup/MmX/Pjc; */
/* JADX WARN: Incorrect field signature: LRJk/FXm; */
/* JADX WARN: Incorrect field signature: LSSv; */
/* JADX WARN: Incorrect field signature: Lint; */
/* loaded from: classes10.dex */
public class WAqRqW {
    private final long IUTVSm;
    private final float IazFGZ;
    private final float IjfBOw;
    private final long OOSmZJ;
    private final int UHOvqz;
    private final long WVFzmD;
    private final int ZtSGIj;
    private final int cKLvuM;
    private final int htJHMq;
    private final float rrhJlY;

    public WAqRqW(int i, long j, int i2, int i3, float f, float f2, int i4, long j2, long j3, float f3) {
        this.htJHMq = i;
        this.cKLvuM = i2;
        this.UHOvqz = i3;
        this.IazFGZ = f;
        this.IjfBOw = f2;
        this.ZtSGIj = i4;
        this.OOSmZJ = j;
        this.IUTVSm = j2;
        this.WVFzmD = j3;
        this.rrhJlY = f3;
    }

    public long getDifferenceTime() {
        return this.OOSmZJ;
    }

    public int getEventType() {
        return this.htJHMq;
    }

    public float getEventX() {
        return this.IjfBOw;
    }

    public float getEventY() {
        return this.IazFGZ;
    }

    public int getPointerCount() {
        return this.UHOvqz;
    }

    public int getToolType() {
        return this.ZtSGIj;
    }

    public long getTouchDeviceId() {
        return this.IUTVSm;
    }

    public float getTouchSize() {
        return this.rrhJlY;
    }

    public long getTouchSource() {
        return this.WVFzmD;
    }

    public int getType() {
        return this.cKLvuM;
    }
}
