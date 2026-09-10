package ictkdxpsjjglkvx;

/* renamed from: ictkdxpsjjglkvx.ρρτρρρρ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0432 {

    /* renamed from: Е041504150415ЕЕЕ, reason: contains not printable characters */
    public static boolean f3689041504150415 = false;

    /* renamed from: Е0415Е0415ЕЕЕ, reason: contains not printable characters */
    public static long f369004150415 = 8064911702256475394L;

    /* renamed from: Е0415ЕЕ0415ЕЕ, reason: contains not printable characters */
    public static Object f369104150415 = new Object();

    /* renamed from: ЕЕ04150415ЕЕЕ, reason: contains not printable characters */
    public static long f369204150415 = -1723653565873072076L;

    /* renamed from: ЕЕЕЕ0415ЕЕ, reason: contains not printable characters */
    public static long f36930415 = 2;

    /* renamed from: Е041504150415ЕЕ0415, reason: contains not printable characters */
    public static long m172610415041504150415(long j, int i) {
        return (j >> (64 - i)) | (j << i);
    }

    /* renamed from: Е0415Е0415ЕЕ0415, reason: contains not printable characters */
    public static long m17262041504150415() {
        long j = f369004150415;
        long j2 = f369204150415;
        long j3 = j + j2;
        long j4 = j2 ^ j;
        f369004150415 = (m172610415041504150415(j, 55) ^ j4) ^ (j4 << 14);
        f369204150415 = m172610415041504150415(j4, 36);
        return j3;
    }

    /* renamed from: ЕЕ04150415ЕЕ0415, reason: contains not printable characters */
    public static int m17263041504150415() {
        if (!f3689041504150415) {
            synchronized (f369104150415) {
                if (!f3689041504150415) {
                    for (long j = 0; j < 10; j++) {
                        f36930415 = m17262041504150415();
                    }
                    f3689041504150415 = true;
                }
            }
        }
        return (int) f36930415;
    }
}
