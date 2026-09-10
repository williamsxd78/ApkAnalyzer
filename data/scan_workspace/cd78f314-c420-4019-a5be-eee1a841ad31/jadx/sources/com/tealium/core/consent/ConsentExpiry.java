package com.tealium.core.consent;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/tealium/core/consent/ConsentExpiry;", "", "", "component1", "Ljava/util/concurrent/TimeUnit;", "component2", "time", "unit", ContentfulConstants.CONTENT_TYPE_COPY, "", "toString", "", "hashCode", "other", "", "equals", "a", OperatorName.SET_LINE_CAPSTYLE, "getTime", "()J", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/concurrent/TimeUnit;", "getUnit", "()Ljava/util/concurrent/TimeUnit;", "<init>", "(JLjava/util/concurrent/TimeUnit;)V", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final /* data */ class ConsentExpiry {

    /* renamed from: a, reason: from kotlin metadata */
    private final long time;

    /* renamed from: b, reason: from kotlin metadata */
    private final TimeUnit unit;

    public ConsentExpiry(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.time = j;
        this.unit = unit;
    }

    public static /* synthetic */ ConsentExpiry copy$default(ConsentExpiry consentExpiry, long j, TimeUnit timeUnit, int i, Object obj) {
        if ((i & 1) != 0) {
            j = consentExpiry.time;
        }
        if ((i & 2) != 0) {
            timeUnit = consentExpiry.unit;
        }
        return consentExpiry.copy(j, timeUnit);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* renamed from: component2, reason: from getter */
    public final TimeUnit getUnit() {
        return this.unit;
    }

    public final ConsentExpiry copy(long time, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new ConsentExpiry(time, unit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentExpiry)) {
            return false;
        }
        ConsentExpiry consentExpiry = (ConsentExpiry) other;
        return this.time == consentExpiry.time && this.unit == consentExpiry.unit;
    }

    public final long getTime() {
        return this.time;
    }

    public final TimeUnit getUnit() {
        return this.unit;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + this.unit.hashCode();
    }

    public String toString() {
        return "ConsentExpiry(time=" + this.time + ", unit=" + this.unit + ")";
    }
}
