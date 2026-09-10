package com.kizitonwose.calendarview.model;

import kotlin.Metadata;

/* compiled from: MonthConfig.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0082\u0004¨\u0006\u0003"}, d2 = {"roundDiv", "", "other", "com.github.kizitonwose.CalendarView"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class MonthConfigKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int roundDiv(int i, int i2) {
        int i3 = i / i2;
        return i % i2 == 0 ? i3 : i3 + 1;
    }
}
