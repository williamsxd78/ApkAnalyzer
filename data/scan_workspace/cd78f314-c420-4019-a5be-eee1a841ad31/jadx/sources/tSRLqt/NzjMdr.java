package tSRLqt;

import android.view.MotionEvent;

/* loaded from: classes10.dex */
class NzjMdr {
    private final MotionEvent WNFBYR;
    private final int cKLvuM;
    private final int htJHMq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NzjMdr(MotionEvent motionEvent, int i, int i2) {
        this.WNFBYR = motionEvent;
        this.htJHMq = i2;
        this.cKLvuM = i;
    }

    public MotionEvent getEvent() {
        return this.WNFBYR;
    }

    public int getEventType() {
        return this.htJHMq;
    }

    public int getType() {
        return this.cKLvuM;
    }
}
