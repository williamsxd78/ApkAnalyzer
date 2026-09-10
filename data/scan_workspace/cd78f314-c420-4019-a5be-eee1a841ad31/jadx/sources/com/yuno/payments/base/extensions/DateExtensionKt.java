package com.yuno.payments.base.extensions;

import com.vivaaerobus.app.extension.Date_ExtensionKt;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DateExtension.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"DATE_FORMAT", "", "plus", "Ljava/util/Date;", "minutes", "", "toDate", "format", "Yuno_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DateExtensionKt {
    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    public static final Date plus(Date date, int i) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(12, i);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
        return time;
    }

    public static final Date toDate(String str, String format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Date_ExtensionKt.DEFAULT_TIME_ZONE));
        try {
            return simpleDateFormat.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ Date toDate$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        }
        return toDate(str, str2);
    }
}
