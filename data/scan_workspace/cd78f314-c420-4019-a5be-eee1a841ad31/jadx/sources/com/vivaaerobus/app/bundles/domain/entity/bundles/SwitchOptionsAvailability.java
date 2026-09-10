package com.vivaaerobus.app.bundles.domain.entity.bundles;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: SwitchOptionsAvailability.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/vivaaerobus/app/bundles/domain/entity/bundles/SwitchOptionsAvailability;", "", "availableLight", "", "availableSwitch", "<init>", "(ZZ)V", "getAvailableLight", "()Z", "getAvailableSwitch", "allAvailable", "getAllAvailable", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "", "bundles_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SwitchOptionsAvailability {
    private final boolean availableLight;
    private final boolean availableSwitch;

    public SwitchOptionsAvailability(boolean z, boolean z2) {
        this.availableLight = z;
        this.availableSwitch = z2;
    }

    public static /* synthetic */ SwitchOptionsAvailability copy$default(SwitchOptionsAvailability switchOptionsAvailability, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = switchOptionsAvailability.availableLight;
        }
        if ((i & 2) != 0) {
            z2 = switchOptionsAvailability.availableSwitch;
        }
        return switchOptionsAvailability.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAvailableLight() {
        return this.availableLight;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAvailableSwitch() {
        return this.availableSwitch;
    }

    public final SwitchOptionsAvailability copy(boolean availableLight, boolean availableSwitch) {
        return new SwitchOptionsAvailability(availableLight, availableSwitch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchOptionsAvailability)) {
            return false;
        }
        SwitchOptionsAvailability switchOptionsAvailability = (SwitchOptionsAvailability) other;
        return this.availableLight == switchOptionsAvailability.availableLight && this.availableSwitch == switchOptionsAvailability.availableSwitch;
    }

    public final boolean getAllAvailable() {
        return this.availableLight && this.availableSwitch;
    }

    public final boolean getAvailableLight() {
        return this.availableLight;
    }

    public final boolean getAvailableSwitch() {
        return this.availableSwitch;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.availableLight) * 31) + Boolean.hashCode(this.availableSwitch);
    }

    public String toString() {
        return "SwitchOptionsAvailability(availableLight=" + this.availableLight + ", availableSwitch=" + this.availableSwitch + ")";
    }
}
