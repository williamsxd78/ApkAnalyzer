package com.vivaaerobus.app.checkIn.presentation.mainFragment.utils;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: UpsellExtrasFlags.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/vivaaerobus/app/checkIn/presentation/mainFragment/utils/UpsellExtrasFlags;", "", "isRequiredBaggage", "", "isRequiredSeats", "<init>", "(ZZ)V", "()Z", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "", "checkIn_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpsellExtrasFlags {
    public static final int $stable = 0;
    private final boolean isRequiredBaggage;
    private final boolean isRequiredSeats;

    public UpsellExtrasFlags(boolean z, boolean z2) {
        this.isRequiredBaggage = z;
        this.isRequiredSeats = z2;
    }

    public static /* synthetic */ UpsellExtrasFlags copy$default(UpsellExtrasFlags upsellExtrasFlags, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = upsellExtrasFlags.isRequiredBaggage;
        }
        if ((i & 2) != 0) {
            z2 = upsellExtrasFlags.isRequiredSeats;
        }
        return upsellExtrasFlags.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRequiredBaggage() {
        return this.isRequiredBaggage;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRequiredSeats() {
        return this.isRequiredSeats;
    }

    public final UpsellExtrasFlags copy(boolean isRequiredBaggage, boolean isRequiredSeats) {
        return new UpsellExtrasFlags(isRequiredBaggage, isRequiredSeats);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpsellExtrasFlags)) {
            return false;
        }
        UpsellExtrasFlags upsellExtrasFlags = (UpsellExtrasFlags) other;
        return this.isRequiredBaggage == upsellExtrasFlags.isRequiredBaggage && this.isRequiredSeats == upsellExtrasFlags.isRequiredSeats;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isRequiredBaggage) * 31) + Boolean.hashCode(this.isRequiredSeats);
    }

    public final boolean isRequiredBaggage() {
        return this.isRequiredBaggage;
    }

    public final boolean isRequiredSeats() {
        return this.isRequiredSeats;
    }

    public String toString() {
        return "UpsellExtrasFlags(isRequiredBaggage=" + this.isRequiredBaggage + ", isRequiredSeats=" + this.isRequiredSeats + ")";
    }
}
