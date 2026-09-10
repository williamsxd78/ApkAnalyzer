package com.vivaaerobus.app.tripDetails.presentation.mainFragment.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MMBTripUpsellDYData.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/vivaaerobus/app/tripDetails/presentation/mainFragment/model/MMBTripUpsellDYData;", "", "name", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "<init>", "(Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getActive", "()Z", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "tripDetails_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MMBTripUpsellDYData {
    public static final int $stable = 0;
    private final boolean active;
    private final String name;

    public MMBTripUpsellDYData(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.active = z;
    }

    public static /* synthetic */ MMBTripUpsellDYData copy$default(MMBTripUpsellDYData mMBTripUpsellDYData, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mMBTripUpsellDYData.name;
        }
        if ((i & 2) != 0) {
            z = mMBTripUpsellDYData.active;
        }
        return mMBTripUpsellDYData.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    public final MMBTripUpsellDYData copy(String name, boolean active) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new MMBTripUpsellDYData(name, active);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MMBTripUpsellDYData)) {
            return false;
        }
        MMBTripUpsellDYData mMBTripUpsellDYData = (MMBTripUpsellDYData) other;
        return Intrinsics.areEqual(this.name, mMBTripUpsellDYData.name) && this.active == mMBTripUpsellDYData.active;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Boolean.hashCode(this.active);
    }

    public String toString() {
        return "MMBTripUpsellDYData(name=" + this.name + ", active=" + this.active + ")";
    }
}
