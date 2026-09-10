package MCOFeQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class TXfDQv {
    public static int MFY = 9274;
    private static TXfDQv bxCFeE = null;
    public static int drG = 2156;
    private final List<Throwable> VDsfmb = Collections.synchronizedList(new ArrayList());

    private TXfDQv() {
    }

    public static synchronized TXfDQv PdIzv() {
        TXfDQv tXfDQv;
        synchronized (TXfDQv.class) {
            if (bxCFeE == null) {
                bxCFeE = new TXfDQv();
            }
            tXfDQv = bxCFeE;
        }
        return tXfDQv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String PLLZQ() {
        StringBuilder sb;
        int i;
        int i2;
        int i3;
        int i4;
        sb = new StringBuilder();
        for (Throwable th : this.VDsfmb) {
            sb.append(th.toString());
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace.length > 0) {
                sb.append(":");
                sb.append(stackTrace[0].toString());
            }
            sb.append("|");
            if (drG <= 2155) {
                if (MFY <= 9273) {
                    while (true) {
                        int i5 = MFY;
                        int i6 = i5 + 52;
                        if (i6 == 95) {
                            MFY = i5 * 3570;
                            break;
                        }
                        if (i6 == 272) {
                            break;
                        }
                        if (i6 == 386) {
                            MFY = (i5 >> 31) >> 91;
                            break;
                        }
                    }
                    while (true) {
                        MFY = (MFY >> 63) * 119;
                    }
                } else {
                    do {
                        int i7 = drG;
                        i = i7 + 39;
                        if (i == 38) {
                            loop6: while (true) {
                                drG = ((drG * 120) + i7) * 122;
                                if (MFY <= 9273) {
                                    do {
                                        i2 = MFY;
                                        i3 = i2 + 65;
                                        if (i3 == 53) {
                                            MFY = (i2 >> 113) ^ 900;
                                            break loop6;
                                        }
                                        if (i3 == 117) {
                                            break loop6;
                                        }
                                    } while (i3 != 294);
                                    MFY = (i2 % 95) % 61;
                                }
                            }
                            while (true) {
                                MFY = (MFY * 56) ^ 5266;
                            }
                        }
                    } while (i != 224);
                    while (true) {
                        drG = (drG >> 89) ^ 1987;
                        if ((MFY ^ 9274) != 0) {
                            while (true) {
                                i4 = MFY;
                                int i8 = i4 + 78;
                                if (i8 != 45) {
                                    if (i8 == 196) {
                                        break;
                                    }
                                } else {
                                    MFY = ((i4 >> 122) % 106) % 122;
                                }
                            }
                            MFY = ((i4 ^ 3549) % 106) + i4;
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    public void RWPiNO(Throwable th) {
        this.VDsfmb.add(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void bEfQqm() {
        this.VDsfmb.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int lxawca() {
        return this.VDsfmb.size();
    }
}
