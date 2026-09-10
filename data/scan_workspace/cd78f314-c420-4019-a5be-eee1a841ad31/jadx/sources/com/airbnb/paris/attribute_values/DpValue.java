package com.airbnb.paris.attribute_values;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: DpValue.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/airbnb/paris/attribute_values/DpValue;", "", "dpValue", "", "(I)V", "getDpValue", "()I", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "paris_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes13.dex */
public final /* data */ class DpValue {
    private final int dpValue;

    public DpValue(int i) {
        this.dpValue = i;
    }

    public static /* synthetic */ DpValue copy$default(DpValue dpValue, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dpValue.dpValue;
        }
        return dpValue.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDpValue() {
        return this.dpValue;
    }

    public final DpValue copy(int dpValue) {
        return new DpValue(dpValue);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof DpValue) && this.dpValue == ((DpValue) other).dpValue;
        }
        return true;
    }

    public final int getDpValue() {
        return this.dpValue;
    }

    public int hashCode() {
        return Integer.hashCode(this.dpValue);
    }

    public String toString() {
        return "DpValue(dpValue=" + this.dpValue + ")";
    }
}
