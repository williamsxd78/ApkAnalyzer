package hPSuxb;

import com.airbnb.paris.R2;

/* loaded from: classes6.dex */
public class WtPfCY {
    public static int EJP = 7130;

    public static String decode(String str) {
        int i;
        char c;
        int i2;
        int i3;
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            char charAt = str.charAt(i4);
            if (Character.isDigit(charAt)) {
                i = charAt - '0';
                while (i5 < length) {
                    int i6 = i5 + 1;
                    c = str.charAt(i5);
                    if (!Character.isDigit(c)) {
                        i4 = i6;
                        break;
                    }
                    i = (i * 10) + (c - '0');
                    if ((EJP ^ 7130) == 0) {
                        i5 = i6;
                    }
                    do {
                        i2 = EJP;
                        i3 = i2 + 52;
                        if (i3 == 76) {
                            while (true) {
                                EJP = (EJP ^ R2.styleable.Paris_TextView_android_text) + i2;
                            }
                        }
                    } while (i3 != 198);
                    EJP = (i2 % 6) * 101;
                    i5 = i6;
                }
            } else {
                i = 1;
            }
            int i7 = i5;
            c = charAt;
            i4 = i7;
            for (int i8 = 0; i8 < i; i8++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String encode(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            int i3 = 1;
            while (i2 < length && charAt == str.charAt(i2)) {
                i3++;
                i2++;
            }
            if (i3 > 1) {
                sb.append(String.valueOf(i3));
            }
            sb.append(charAt);
            i = i2;
        }
        return sb.toString();
    }
}
