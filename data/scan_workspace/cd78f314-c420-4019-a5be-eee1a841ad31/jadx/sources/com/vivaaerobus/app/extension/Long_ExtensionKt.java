package com.vivaaerobus.app.extension;

import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Long+Extension.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u001a\u0011\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"toMinutes", "", "toHours", "orZero", "(Ljava/lang/Long;)J", "toFormatWithCommaDecimal", "", "language", "extension"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Long_ExtensionKt {
    public static final long orZero(Long l) {
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final String toFormatWithCommaDecimal(long j, String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        String format = NumberFormat.getInstance(Locale.forLanguageTag(language)).format(j);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final long toHours(long j) {
        return j / 3600000;
    }

    public static final long toMinutes(long j) {
        return j / 60000;
    }
}
