package com.vivaaerobus.app.baggage.presentation.common.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ServiceIncludedView.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J.\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/vivaaerobus/app/baggage/presentation/common/model/ServiceIncludedView;", "", "visible", "", "name", "", "copyIncluded", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "()Ljava/lang/String;", "getCopyIncluded", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/vivaaerobus/app/baggage/presentation/common/model/ServiceIncludedView;", "equals", "other", "hashCode", "", "toString", "baggage_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceIncludedView {
    public static final int $stable = 0;
    private final String copyIncluded;
    private final String name;
    private final Boolean visible;

    public ServiceIncludedView(Boolean bool, String name, String copyIncluded) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(copyIncluded, "copyIncluded");
        this.visible = bool;
        this.name = name;
        this.copyIncluded = copyIncluded;
    }

    public static /* synthetic */ ServiceIncludedView copy$default(ServiceIncludedView serviceIncludedView, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = serviceIncludedView.visible;
        }
        if ((i & 2) != 0) {
            str = serviceIncludedView.name;
        }
        if ((i & 4) != 0) {
            str2 = serviceIncludedView.copyIncluded;
        }
        return serviceIncludedView.copy(bool, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCopyIncluded() {
        return this.copyIncluded;
    }

    public final ServiceIncludedView copy(Boolean visible, String name, String copyIncluded) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(copyIncluded, "copyIncluded");
        return new ServiceIncludedView(visible, name, copyIncluded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceIncludedView)) {
            return false;
        }
        ServiceIncludedView serviceIncludedView = (ServiceIncludedView) other;
        return Intrinsics.areEqual(this.visible, serviceIncludedView.visible) && Intrinsics.areEqual(this.name, serviceIncludedView.name) && Intrinsics.areEqual(this.copyIncluded, serviceIncludedView.copyIncluded);
    }

    public final String getCopyIncluded() {
        return this.copyIncluded;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        return ((((bool == null ? 0 : bool.hashCode()) * 31) + this.name.hashCode()) * 31) + this.copyIncluded.hashCode();
    }

    public String toString() {
        return "ServiceIncludedView(visible=" + this.visible + ", name=" + this.name + ", copyIncluded=" + this.copyIncluded + ")";
    }
}
