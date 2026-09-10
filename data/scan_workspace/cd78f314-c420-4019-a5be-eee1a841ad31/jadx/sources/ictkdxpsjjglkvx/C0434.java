package ictkdxpsjjglkvx;

/* renamed from: ictkdxpsjjglkvx.ρττρρρρ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0434 {

    /* renamed from: Е04150415Е0415ЕЕ, reason: contains not printable characters */
    public static long f3698041504150415 = -5547906869786170819L;

    /* renamed from: Е0415Е04150415ЕЕ, reason: contains not printable characters */
    public static long f3699041504150415 = 2;

    /* renamed from: ЕЕ041504150415ЕЕ, reason: contains not printable characters */
    public static Object f3700041504150415 = new Object();

    /* renamed from: ЕЕ0415Е0415ЕЕ, reason: contains not printable characters */
    public static long f370104150415 = -3693884459871390448L;

    /* renamed from: ЕЕЕ04150415ЕЕ, reason: contains not printable characters */
    public static boolean f370204150415 = false;

    /* renamed from: Е0415Е04150415Е0415, reason: contains not printable characters */
    public static int m172660415041504150415() {
        if (!f370204150415) {
            synchronized (f3700041504150415) {
                if (!f370204150415) {
                    for (long j = 0; j < 10; j++) {
                        f3699041504150415 = m17267041504150415();
                    }
                    f370204150415 = true;
                }
            }
        }
        return (int) f3699041504150415;
    }

    /* renamed from: ЕЕЕ04150415Е0415, reason: contains not printable characters */
    public static long m17267041504150415() {
        long j = f370104150415;
        long j2 = f3698041504150415;
        long j3 = j2 + j;
        f370104150415 = j2;
        long j4 = j ^ (j << 23);
        f3698041504150415 = ((j4 >> 18) ^ (j4 ^ j2)) ^ (j2 >> 5);
        return j3;
    }
}
