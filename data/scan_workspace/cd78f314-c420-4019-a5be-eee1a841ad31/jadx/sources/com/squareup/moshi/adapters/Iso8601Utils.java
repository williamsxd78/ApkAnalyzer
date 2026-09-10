package com.squareup.moshi.adapters;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
final class Iso8601Utils {
    static final String GMT_ID = "GMT";
    static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone(GMT_ID);

    Iso8601Utils() {
    }

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_Z, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(24);
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(AbstractJsonLexerKt.COLON);
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(AbstractJsonLexerKt.COLON);
        padInt(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        padInt(sb, gregorianCalendar.get(14), 3);
        sb.append('Z');
        return sb.toString();
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x0190, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x0190, blocks: (B:3:0x000a, B:6:0x0017, B:8:0x0023, B:9:0x0025, B:11:0x0034, B:13:0x003a, B:18:0x004b, B:20:0x005b, B:21:0x005d, B:23:0x0069, B:24:0x006c, B:26:0x0072, B:30:0x007c, B:35:0x008c, B:37:0x0094, B:38:0x00c9, B:40:0x00cf, B:42:0x00d7, B:43:0x0159, B:49:0x00e2, B:50:0x00f8, B:51:0x00f9, B:53:0x0105, B:56:0x010e, B:58:0x0128, B:61:0x0137, B:62:0x0154, B:64:0x0157, B:65:0x0188, B:66:0x018f), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0188 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x0190, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x0190, blocks: (B:3:0x000a, B:6:0x0017, B:8:0x0023, B:9:0x0025, B:11:0x0034, B:13:0x003a, B:18:0x004b, B:20:0x005b, B:21:0x005d, B:23:0x0069, B:24:0x006c, B:26:0x0072, B:30:0x007c, B:35:0x008c, B:37:0x0094, B:38:0x00c9, B:40:0x00cf, B:42:0x00d7, B:43:0x0159, B:49:0x00e2, B:50:0x00f8, B:51:0x00f9, B:53:0x0105, B:56:0x010e, B:58:0x0128, B:61:0x0137, B:62:0x0154, B:64:0x0157, B:65:0x0188, B:66:0x018f), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date parse(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.adapters.Iso8601Utils.parse(java.lang.String):java.util.Date");
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }
}
