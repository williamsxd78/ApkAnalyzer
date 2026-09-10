package org.bouncycastle.pqc.crypto.sike;

import java.lang.reflect.Array;

/* loaded from: classes10.dex */
class PointProj {
    long[][] X;
    long[][] Z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PointProj(int i) {
        this.X = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 2, i);
        this.Z = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 2, i);
    }
}
