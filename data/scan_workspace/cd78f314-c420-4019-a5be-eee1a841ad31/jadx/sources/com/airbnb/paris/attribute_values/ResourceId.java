package com.airbnb.paris.attribute_values;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: ResourceId.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/airbnb/paris/attribute_values/ResourceId;", "", "resId", "", "(I)V", "getResId", "()I", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "paris_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes13.dex */
public final /* data */ class ResourceId {
    private final int resId;

    public ResourceId(int i) {
        this.resId = i;
    }

    public static /* synthetic */ ResourceId copy$default(ResourceId resourceId, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = resourceId.resId;
        }
        return resourceId.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getResId() {
        return this.resId;
    }

    public final ResourceId copy(int resId) {
        return new ResourceId(resId);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof ResourceId) && this.resId == ((ResourceId) other).resId;
        }
        return true;
    }

    public final int getResId() {
        return this.resId;
    }

    public int hashCode() {
        return Integer.hashCode(this.resId);
    }

    public String toString() {
        return "ResourceId(resId=" + this.resId + ")";
    }
}
