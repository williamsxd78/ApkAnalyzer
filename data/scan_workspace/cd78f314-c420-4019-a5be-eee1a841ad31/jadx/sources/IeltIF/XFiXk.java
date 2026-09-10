package IeltIF;

/* loaded from: classes.dex */
public final class XFiXk<A, B, C> {
    public static char[] WhQ;
    public final A first;
    public final B second;
    public final C third;

    public XFiXk(A a, B b, C c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    private static XFiXk<A, B, C> WWfNqg(A a, B b, C c) {
        return new XFiXk<>(a, b, c);
    }

    /* JADX WARN: Incorrect return type in method signature: ()V */
    public static /* synthetic */ String rUA(String str) {
        if (WhQ == null) {
            WhQ = new char[32767];
            int i = 3;
            for (int i2 = 0; i2 < 32767; i2++) {
                i = ((i + (i ^ i2)) + 54) % 63;
                WhQ[i2] = (char) i;
            }
        }
        char[] cArr = new char[str.length()];
        char[] charArray = str.toCharArray();
        for (int i3 = 0; i3 < str.length(); i3++) {
            cArr[i3] = (char) (cArr[i3] + ((char) (charArray[i3] ^ WhQ[i3])));
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof XFiXk)) {
            return false;
        }
        XFiXk xFiXk = (XFiXk) obj;
        return xFiXk.first.equals(this.first) && xFiXk.second.equals(this.second) && xFiXk.third.equals(this.third);
    }

    public int hashCode() {
        A a = this.first;
        int hashCode = a == null ? 0 : a.hashCode();
        B b = this.second;
        int hashCode2 = hashCode ^ (b == null ? 0 : b.hashCode());
        C c = this.third;
        return hashCode2 ^ (c != null ? c.hashCode() : 0);
    }
}
