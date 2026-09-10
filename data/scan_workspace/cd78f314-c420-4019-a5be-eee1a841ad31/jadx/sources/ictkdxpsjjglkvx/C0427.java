package ictkdxpsjjglkvx;

/* renamed from: ictkdxpsjjglkvx.ππλλλλπ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0427 {

    /* renamed from: ч0447044704470447ч0447, reason: contains not printable characters */
    public static final int f363904470447044704470447 = 56320;

    /* renamed from: ч0447ччч04470447, reason: contains not printable characters */
    public static final int f3640044704470447 = 57344;

    /* renamed from: чч044704470447ч0447, reason: contains not printable characters */
    public static final int f36410447044704470447 = 55296;

    /* renamed from: ччччч04470447, reason: contains not printable characters */
    public static final int f364204470447 = 56320;

    /* renamed from: я044F044F044F044Fя044F, reason: contains not printable characters */
    public static int f3643044F044F044F044F044F = 1;

    /* renamed from: яя044F044F044Fя044F, reason: contains not printable characters */
    public static int f3644044F044F044F044F = 55;

    /* renamed from: яяяяя044F044F, reason: contains not printable characters */
    public static int f3645044F044F = 2;

    /* renamed from: ч04470447чч04470447, reason: contains not printable characters */
    private final int f36460447044704470447;

    /* renamed from: чч0447чч04470447, reason: contains not printable characters */
    private final String f3647044704470447;

    /* renamed from: ччч0447ч04470447, reason: contains not printable characters */
    private int f3648044704470447;

    public C0427(String str) {
        this.f3647044704470447 = str;
        this.f36460447044704470447 = str.length();
    }

    /* renamed from: я044Fяяя044F044F, reason: contains not printable characters */
    public static int m17245044F044F044F() {
        return 68;
    }

    /* renamed from: о043E043Eоооо, reason: contains not printable characters */
    public int m17246043E043E() {
        char charAt = this.f3647044704470447.charAt(this.f3648044704470447);
        int i = f3644044F044F044F044F;
        if ((i * (f3643044F044F044F044F044F + i)) % f3645044F044F != 0) {
            f3644044F044F044F044F = m17245044F044F044F();
            f3643044F044F044F044F044F = 30;
        }
        this.f3648044704470447++;
        int i2 = 65535 & charAt;
        int i3 = f3644044F044F044F044F;
        if ((i3 * (f3643044F044F044F044F044F + i3)) % f3645044F044F != 0) {
            f3644044F044F044F044F = 13;
            f3643044F044F044F044F044F = 62;
        }
        return i2;
    }

    /* renamed from: ооо043Eооо, reason: contains not printable characters */
    public boolean m17247043E() {
        if (this.f3648044704470447 >= this.f36460447044704470447) {
            return false;
        }
        int i = f3644044F044F044F044F;
        if ((i * (f3643044F044F044F044F044F + i)) % f3645044F044F == 0) {
            return true;
        }
        f3644044F044F044F044F = m17245044F044F044F();
        f3643044F044F044F044F044F = 61;
        return true;
    }
}
