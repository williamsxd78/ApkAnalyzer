package com.uplift.sdk.util;

import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Clock.kt */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"Ljava/util/Date;", "", "age", "", "a", "upliftsdk_plainRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class d {
    public static final boolean a(Date date, int i) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(1, calendar.get(1) + i);
        return System.currentTimeMillis() > calendar.getTimeInMillis();
    }
}
