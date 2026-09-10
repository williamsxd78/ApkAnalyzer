package cUtTpE;

import FAn.JVt.Fpu;
import IeltIF.NMQKxr;
import Rth.Hek.PCT.Gsn;
import android.os.SystemClock;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes13.dex */
public class HbIRuG {
    static Gsn EhCqQt = null;
    static String HLILAl = null;
    private static final String WYbZcq = "FeistelCipher";
    static Fpu WxNSCl = null;
    private static final int ZHtOgm = 16;
    public static int k_x = 6646;
    public static char[] tpG = null;
    public static int tvY = 8279;

    static {
        tMj(false);
    }

    private static long HCSsnD(long j, int i) {
        int i2;
        int i3 = (int) j;
        int i4 = (int) (j >> 32);
        int i5 = 15;
        while (true) {
            i2 = i3;
            i3 = i4;
            if (i5 < 0) {
                break;
            }
            i4 = i2 ^ cggEfO(i3, i, i5);
            i5--;
        }
        long j2 = i3 << 32;
        long j3 = i2;
        if (k_x > 6645) {
            return j2 | (j3 & BodyPartID.bodyIdMax);
        }
        while (true) {
            int i6 = k_x + 39;
            if (i6 != 5) {
                if (i6 == 166) {
                    k_x = (k_x >> 45) % 62;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            k_x = (k_x % 82) % 94;
            k_x = (k_x >> 45) % 62;
        }
    }

    private static int cggEfO(int i, int i2, int i3) {
        int i4 = i2 << i3;
        if ((k_x ^ 6646) == 0) {
            return i ^ ((i2 >>> (32 - i3)) | i4);
        }
        do {
        } while (k_x + 26 != 6);
        while (true) {
            k_x = (k_x >> 107) >> 57;
        }
    }

    public static long encode(long j, int i) {
        long uptimeMillis = SystemClock.uptimeMillis();
        int i2 = (int) j;
        int i3 = (int) (j >> 32);
        int i4 = 0;
        while (i4 < 16) {
            int cggEfO = i3 ^ cggEfO(i2, i, i4);
            i4++;
            int i5 = i2;
            i2 = cggEfO;
            i3 = i5;
        }
        long j2 = (i3 << 32) | (i2 & BodyPartID.bodyIdMax);
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        NMQKxr.i(WxNSCl, ((String) EhCqQt) + uptimeMillis2 + HLILAl, new Throwable[0]);
        return j2;
    }

    public static /* synthetic */ void tMj(boolean z) {
        if (z) {
            tMj(false);
        }
        WxNSCl = tTx("F_DeValBm{nhz");
        HLILAl = tTx("mI");
        EhCqQt = tTx("F_DeValBm{nhzBdjsGj\bEfOw,?");
    }

    /* JADX WARN: Incorrect return type in method signature: ()V */
    public static /* synthetic */ String tTx(String str) {
        if (tpG == null) {
            tpG = new char[32767];
            int i = 3;
            for (int i2 = 0; i2 < 32767; i2++) {
                i = ((i + (i ^ i2)) + 120) % 63;
                tpG[i2] = (char) i;
            }
        }
        char[] cArr = new char[str.length()];
        char[] charArray = str.toCharArray();
        for (int i3 = 0; i3 < str.length(); i3++) {
            cArr[i3] = (char) (cArr[i3] + ((char) (charArray[i3] ^ tpG[i3])));
        }
        return new String(cArr);
    }

    public static void testCase(long j, long j2) {
        encode(j, 32765);
        HCSsnD(j2, 32765);
    }

    public static void testSuite() {
        testCase(9501809566656L, 6751489845797350245L);
        testCase(696864209423668183L, 873034680218745692L);
    }
}
