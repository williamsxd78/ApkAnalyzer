package tSRLqt;

/* JADX WARN: Incorrect field signature: LNwf/Mbw/GHJ; */
/* JADX WARN: Incorrect field signature: LODl/FBv/EIm/HEH; */
/* loaded from: classes10.dex */
class EYAmUY {
    private final int EXvmgj;
    private final String IaKdkZ;
    private final long WrVtgO;
    private final String ZnTURT;
    private final int hqOAwn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EYAmUY(long j, String str, int i, String str2, int i2) {
        this.WrVtgO = j;
        this.IaKdkZ = str;
        this.hqOAwn = i;
        this.ZnTURT = str2;
        this.EXvmgj = i2;
    }

    public String getEventType() {
        return this.IaKdkZ;
    }

    public int getId() {
        return this.hqOAwn;
    }

    public int getKeyType() {
        return this.EXvmgj;
    }

    public Long getTimestamp() {
        return Long.valueOf(this.WrVtgO);
    }

    public String getUniqueIdentifier() {
        return this.ZnTURT;
    }
}
