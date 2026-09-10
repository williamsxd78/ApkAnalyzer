package tSRLqt;

/* JADX WARN: Incorrect field signature: LMAB/Pqa/FXg/Hvx; */
/* loaded from: classes10.dex */
class LCJuOi {
    private final long ElrDrP;
    private final long HiMtOC;
    private float[] IQxJWv;
    private final int Qxjjq;
    private float[] hpVzxp;
    private final boolean lSCfMw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LCJuOi(float[] fArr, float[] fArr2, long j, int i, boolean z, long j2) {
        this.hpVzxp = fArr;
        this.IQxJWv = fArr2;
        this.HiMtOC = j;
        this.Qxjjq = i;
        this.lSCfMw = z;
        this.ElrDrP = j2;
    }

    public long getTime() {
        return this.HiMtOC;
    }

    public long getTime_diff() {
        return this.ElrDrP;
    }

    public int getTouchFlag() {
        return this.Qxjjq;
    }

    public float[] getgData() {
        return this.hpVzxp;
    }

    public float[] getmData() {
        return this.IQxJWv;
    }

    public boolean isBackground_event() {
        return this.lSCfMw;
    }
}
