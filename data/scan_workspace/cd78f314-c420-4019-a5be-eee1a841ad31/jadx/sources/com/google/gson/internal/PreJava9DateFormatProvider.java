package com.google.gson.internal;

import com.vivaaerobus.app.extension.Date_ExtensionKt;
import com.vivaaerobus.app.more.presentation.language.LanguageFragment;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes14.dex */
public class PreJava9DateFormatProvider {
    private PreJava9DateFormatProvider() {
    }

    private static String getDatePartOfDateTimePattern(int i) {
        if (i == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i == 1) {
            return "MMMM d, yyyy";
        }
        if (i == 2) {
            return "MMM d, yyyy";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i);
    }

    private static String getTimePartOfDateTimePattern(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i == 2) {
            return "h:mm:ss a";
        }
        if (i == 3) {
            return Date_ExtensionKt.COMMON_DATE_PATTERN_SCHEDULE_CAPS;
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i);
    }

    public static DateFormat getUsDateTimeFormat(int i, int i2) {
        return new SimpleDateFormat(getDatePartOfDateTimePattern(i) + LanguageFragment.SPACE + getTimePartOfDateTimePattern(i2), Locale.US);
    }
}
