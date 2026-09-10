package com.vivaaerobus.app.basket.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: InstallmentsAvailability.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/vivaaerobus/app/basket/domain/entity/InstallmentsAvailability;", "", "minimumAmount", "", "missingAmount", "installmentsAvailable", "", "upsellServicesAvailable", "<init>", "(DDZZ)V", "getMinimumAmount", "()D", "getMissingAmount", "getInstallmentsAvailable", "()Z", "getUpsellServicesAvailable", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "", "basket_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InstallmentsAvailability {
    private final boolean installmentsAvailable;
    private final double minimumAmount;
    private final double missingAmount;
    private final boolean upsellServicesAvailable;

    public InstallmentsAvailability(double d, double d2, boolean z, boolean z2) {
        this.minimumAmount = d;
        this.missingAmount = d2;
        this.installmentsAvailable = z;
        this.upsellServicesAvailable = z2;
    }

    public static /* synthetic */ InstallmentsAvailability copy$default(InstallmentsAvailability installmentsAvailability, double d, double d2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = installmentsAvailability.minimumAmount;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = installmentsAvailability.missingAmount;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            z = installmentsAvailability.installmentsAvailable;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = installmentsAvailability.upsellServicesAvailable;
        }
        return installmentsAvailability.copy(d3, d4, z3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getMinimumAmount() {
        return this.minimumAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final double getMissingAmount() {
        return this.missingAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInstallmentsAvailable() {
        return this.installmentsAvailable;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getUpsellServicesAvailable() {
        return this.upsellServicesAvailable;
    }

    public final InstallmentsAvailability copy(double minimumAmount, double missingAmount, boolean installmentsAvailable, boolean upsellServicesAvailable) {
        return new InstallmentsAvailability(minimumAmount, missingAmount, installmentsAvailable, upsellServicesAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentsAvailability)) {
            return false;
        }
        InstallmentsAvailability installmentsAvailability = (InstallmentsAvailability) other;
        return Double.compare(this.minimumAmount, installmentsAvailability.minimumAmount) == 0 && Double.compare(this.missingAmount, installmentsAvailability.missingAmount) == 0 && this.installmentsAvailable == installmentsAvailability.installmentsAvailable && this.upsellServicesAvailable == installmentsAvailability.upsellServicesAvailable;
    }

    public final boolean getInstallmentsAvailable() {
        return this.installmentsAvailable;
    }

    public final double getMinimumAmount() {
        return this.minimumAmount;
    }

    public final double getMissingAmount() {
        return this.missingAmount;
    }

    public final boolean getUpsellServicesAvailable() {
        return this.upsellServicesAvailable;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.minimumAmount) * 31) + Double.hashCode(this.missingAmount)) * 31) + Boolean.hashCode(this.installmentsAvailable)) * 31) + Boolean.hashCode(this.upsellServicesAvailable);
    }

    public String toString() {
        return "InstallmentsAvailability(minimumAmount=" + this.minimumAmount + ", missingAmount=" + this.missingAmount + ", installmentsAvailable=" + this.installmentsAvailable + ", upsellServicesAvailable=" + this.upsellServicesAvailable + ")";
    }
}
