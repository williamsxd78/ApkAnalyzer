package com.vivaaerobus.app.search.presentation.passengers.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: Separator.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/vivaaerobus/app/search/presentation/passengers/model/Separator;", "Lcom/vivaaerobus/app/search/presentation/passengers/model/CustomPassengerModel;", "shouldShow", "", "<init>", "(Z)V", "getShouldShow", "()Z", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "", "hashCode", "", "toString", "", "search_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Separator implements CustomPassengerModel {
    public static final int $stable = 0;
    private final boolean shouldShow;

    public Separator(boolean z) {
        this.shouldShow = z;
    }

    public static /* synthetic */ Separator copy$default(Separator separator, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = separator.shouldShow;
        }
        return separator.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    public final Separator copy(boolean shouldShow) {
        return new Separator(shouldShow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Separator) && this.shouldShow == ((Separator) other).shouldShow;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldShow);
    }

    public String toString() {
        return "Separator(shouldShow=" + this.shouldShow + ")";
    }
}
