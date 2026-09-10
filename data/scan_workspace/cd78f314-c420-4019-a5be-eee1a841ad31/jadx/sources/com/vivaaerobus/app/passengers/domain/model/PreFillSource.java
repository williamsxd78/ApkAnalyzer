package com.vivaaerobus.app.passengers.domain.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreFillSource.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/passengers/domain/model/PreFillSource;", "", "isDefault", "", "name", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getName", "()Ljava/lang/String;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "passengers_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PreFillSource {
    private final boolean isDefault;
    private final String name;

    public PreFillSource(boolean z, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.isDefault = z;
        this.name = name;
    }

    public static /* synthetic */ PreFillSource copy$default(PreFillSource preFillSource, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = preFillSource.isDefault;
        }
        if ((i & 2) != 0) {
            str = preFillSource.name;
        }
        return preFillSource.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final PreFillSource copy(boolean isDefault, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new PreFillSource(isDefault, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreFillSource)) {
            return false;
        }
        PreFillSource preFillSource = (PreFillSource) other;
        return this.isDefault == preFillSource.isDefault && Intrinsics.areEqual(this.name, preFillSource.name);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isDefault) * 31) + this.name.hashCode();
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public String toString() {
        return "PreFillSource(isDefault=" + this.isDefault + ", name=" + this.name + ")";
    }
}
