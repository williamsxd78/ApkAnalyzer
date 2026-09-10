package ictkdxpsjjglkvx;

import java.util.HashMap;

/* renamed from: ictkdxpsjjglkvx.θπθπθθθ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0401 {

    /* renamed from: о043E043Eо043E043E043E, reason: contains not printable characters */
    public static int f3541043E043E043E043E043E = 2;

    /* renamed from: о043Eо043E043E043E043E, reason: contains not printable characters */
    public static int f3542043E043E043E043E043E = 1;

    /* renamed from: о043Eоо043E043E043E, reason: contains not printable characters */
    public static int f3543043E043E043E043E = 0;

    /* renamed from: оооо043E043E043E, reason: contains not printable characters */
    public static int f3544043E043E043E = 14;

    /* renamed from: ДД0414Д04140414Д, reason: contains not printable characters */
    private final HashMap<String, C0399> f3545041404140414 = new HashMap<>();

    /* renamed from: О041EООООО, reason: contains not printable characters */
    public static int m17179041E() {
        return 2;
    }

    /* renamed from: оо043E043E043E043E043E, reason: contains not printable characters */
    public static int m17180043E043E043E043E043E() {
        return 0;
    }

    /* renamed from: оо043Eо043E043E043E, reason: contains not printable characters */
    public static int m17181043E043E043E043E() {
        return 1;
    }

    /* renamed from: ооо043E043E043E043E, reason: contains not printable characters */
    public static int m17182043E043E043E043E() {
        return 11;
    }

    /* renamed from: ѓ04530453ѓ0453ѓѓ, reason: contains not printable characters */
    public HashMap<String, C0399> m17183045304530453() {
        HashMap<String, C0399> hashMap = this.f3545041404140414;
        int i = f3544043E043E043E;
        if (((f3542043E043E043E043E043E + i) * i) % m17179041E() != m17180043E043E043E043E043E()) {
            f3544043E043E043E = m17182043E043E043E043E();
            f3543043E043E043E043E = m17182043E043E043E043E();
            if (((m17182043E043E043E043E() + f3542043E043E043E043E043E) * m17182043E043E043E043E()) % f3541043E043E043E043E043E != m17180043E043E043E043E043E()) {
                f3544043E043E043E = m17182043E043E043E043E();
                f3543043E043E043E043E = 94;
            }
        }
        return hashMap;
    }

    /* renamed from: ѓѓ0453ѓ0453ѓѓ, reason: contains not printable characters */
    public C0399 m1718404530453(String str) {
        int i = f3544043E043E043E;
        if ((i * (m17181043E043E043E043E() + i)) % f3541043E043E043E043E043E != 0) {
            f3544043E043E043E = 31;
            f3543043E043E043E043E = 69;
        }
        C0399 c0399 = this.f3545041404140414.get(str);
        int i2 = f3544043E043E043E;
        if (((f3542043E043E043E043E043E + i2) * i2) % f3541043E043E043E043E043E != f3543043E043E043E043E) {
            f3544043E043E043E = 1;
            f3543043E043E043E043E = 40;
        }
        return c0399;
    }

    /* renamed from: ѓѓѓ04530453ѓѓ, reason: contains not printable characters */
    public void m1718504530453(String str, String str2, String str3) {
        if (this.f3545041404140414.containsKey(str)) {
            this.f3545041404140414.get(str).m171630453(str2, str3);
            return;
        }
        C0399 c0399 = new C0399();
        int i = f3544043E043E043E;
        if ((i * (m17181043E043E043E043E() + i)) % f3541043E043E043E043E043E != 0) {
            f3544043E043E043E = 89;
            f3543043E043E043E043E = m17182043E043E043E043E();
        }
        if (((f3544043E043E043E + m17181043E043E043E043E()) * f3544043E043E043E) % f3541043E043E043E043E043E != f3543043E043E043E043E) {
            f3544043E043E043E = 53;
            f3543043E043E043E043E = m17182043E043E043E043E();
        }
        c0399.m171630453(str2, str3);
        this.f3545041404140414.put(str, c0399);
    }
}
