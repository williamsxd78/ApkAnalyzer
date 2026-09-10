package com.kizitonwose.calendarview.ui;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CalendarAdapter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/kizitonwose/calendarview/ui/ViewConfig;", "", "dayViewRes", "", "monthHeaderRes", "monthFooterRes", "monthViewClass", "", "(IIILjava/lang/String;)V", "getDayViewRes", "()I", "getMonthFooterRes", "getMonthHeaderRes", "getMonthViewClass", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "com.github.kizitonwose.CalendarView"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final /* data */ class ViewConfig {
    private final int dayViewRes;
    private final int monthFooterRes;
    private final int monthHeaderRes;
    private final String monthViewClass;

    public ViewConfig(int i, int i2, int i3, String str) {
        this.dayViewRes = i;
        this.monthHeaderRes = i2;
        this.monthFooterRes = i3;
        this.monthViewClass = str;
    }

    public static /* synthetic */ ViewConfig copy$default(ViewConfig viewConfig, int i, int i2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = viewConfig.dayViewRes;
        }
        if ((i4 & 2) != 0) {
            i2 = viewConfig.monthHeaderRes;
        }
        if ((i4 & 4) != 0) {
            i3 = viewConfig.monthFooterRes;
        }
        if ((i4 & 8) != 0) {
            str = viewConfig.monthViewClass;
        }
        return viewConfig.copy(i, i2, i3, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDayViewRes() {
        return this.dayViewRes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMonthHeaderRes() {
        return this.monthHeaderRes;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMonthFooterRes() {
        return this.monthFooterRes;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMonthViewClass() {
        return this.monthViewClass;
    }

    public final ViewConfig copy(int dayViewRes, int monthHeaderRes, int monthFooterRes, String monthViewClass) {
        return new ViewConfig(dayViewRes, monthHeaderRes, monthFooterRes, monthViewClass);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewConfig)) {
            return false;
        }
        ViewConfig viewConfig = (ViewConfig) other;
        return this.dayViewRes == viewConfig.dayViewRes && this.monthHeaderRes == viewConfig.monthHeaderRes && this.monthFooterRes == viewConfig.monthFooterRes && Intrinsics.areEqual(this.monthViewClass, viewConfig.monthViewClass);
    }

    public final int getDayViewRes() {
        return this.dayViewRes;
    }

    public final int getMonthFooterRes() {
        return this.monthFooterRes;
    }

    public final int getMonthHeaderRes() {
        return this.monthHeaderRes;
    }

    public final String getMonthViewClass() {
        return this.monthViewClass;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.dayViewRes) * 31) + Integer.hashCode(this.monthHeaderRes)) * 31) + Integer.hashCode(this.monthFooterRes)) * 31;
        String str = this.monthViewClass;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ViewConfig(dayViewRes=" + this.dayViewRes + ", monthHeaderRes=" + this.monthHeaderRes + ", monthFooterRes=" + this.monthFooterRes + ", monthViewClass=" + this.monthViewClass + ")";
    }
}
