package ictkdxpsjjglkvx;

/* renamed from: ictkdxpsjjglkvx.ρτρρρρρ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0433 {

    /* renamed from: Е04150415ЕЕЕЕ, reason: contains not printable characters */
    public static long f369404150415 = 1;

    /* renamed from: Е0415ЕЕЕЕЕ, reason: contains not printable characters */
    public static long f36950415 = -6924639281946888540L;

    /* renamed from: ЕЕ0415ЕЕЕЕ, reason: contains not printable characters */
    public static boolean f36960415 = false;

    /* renamed from: ЕЕЕ0415ЕЕЕ, reason: contains not printable characters */
    public static Object f36970415 = new Object();

    /* renamed from: Е04150415ЕЕЕ0415, reason: contains not printable characters */
    public static long m17264041504150415() {
        long j = f36950415 - 7046029254386353131L;
        f36950415 = j;
        long j2 = (j ^ (j >> 30)) * (-4658895280553007687L);
        long j3 = (j2 ^ (j2 >> 27)) * (-7723592293110705685L);
        return j3 ^ (j3 >> 31);
    }

    /* renamed from: ЕЕЕ0415ЕЕ0415, reason: contains not printable characters */
    public static int m1726504150415() {
        if (!f36960415) {
            synchronized (f36970415) {
                if (!f36960415) {
                    for (long j = 0; j < 10; j++) {
                        f369404150415 = m17264041504150415();
                    }
                    f36960415 = true;
                }
            }
        }
        return (int) f369404150415;
    }
}
