package com.vivaaerobus.app.shared.staff.domain.useCase.getCategories;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: GetCategoriesParams.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/vivaaerobus/app/shared/staff/domain/useCase/getCategories/GetCategoriesParams;", "", "fetchOnline", "", "<init>", "(Z)V", "getFetchOnline", "()Z", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "", "staff_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GetCategoriesParams {
    private final boolean fetchOnline;

    public GetCategoriesParams(boolean z) {
        this.fetchOnline = z;
    }

    public static /* synthetic */ GetCategoriesParams copy$default(GetCategoriesParams getCategoriesParams, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getCategoriesParams.fetchOnline;
        }
        return getCategoriesParams.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getFetchOnline() {
        return this.fetchOnline;
    }

    public final GetCategoriesParams copy(boolean fetchOnline) {
        return new GetCategoriesParams(fetchOnline);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetCategoriesParams) && this.fetchOnline == ((GetCategoriesParams) other).fetchOnline;
    }

    public final boolean getFetchOnline() {
        return this.fetchOnline;
    }

    public int hashCode() {
        return Boolean.hashCode(this.fetchOnline);
    }

    public String toString() {
        return "GetCategoriesParams(fetchOnline=" + this.fetchOnline + ")";
    }
}
