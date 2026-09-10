package com.vivaaerobus.app.recentSearch.domain.usecase.deleteRecentSearch;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeleteRecentSearchParams.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/vivaaerobus/app/recentSearch/domain/usecase/deleteRecentSearch/DeleteRecentSearchParams;", "", "dateHideRecentSearch", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getDateHideRecentSearch", "()Ljava/util/Date;", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "", "recentSearch_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeleteRecentSearchParams {
    private final Date dateHideRecentSearch;

    public DeleteRecentSearchParams(Date dateHideRecentSearch) {
        Intrinsics.checkNotNullParameter(dateHideRecentSearch, "dateHideRecentSearch");
        this.dateHideRecentSearch = dateHideRecentSearch;
    }

    public static /* synthetic */ DeleteRecentSearchParams copy$default(DeleteRecentSearchParams deleteRecentSearchParams, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            date = deleteRecentSearchParams.dateHideRecentSearch;
        }
        return deleteRecentSearchParams.copy(date);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getDateHideRecentSearch() {
        return this.dateHideRecentSearch;
    }

    public final DeleteRecentSearchParams copy(Date dateHideRecentSearch) {
        Intrinsics.checkNotNullParameter(dateHideRecentSearch, "dateHideRecentSearch");
        return new DeleteRecentSearchParams(dateHideRecentSearch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeleteRecentSearchParams) && Intrinsics.areEqual(this.dateHideRecentSearch, ((DeleteRecentSearchParams) other).dateHideRecentSearch);
    }

    public final Date getDateHideRecentSearch() {
        return this.dateHideRecentSearch;
    }

    public int hashCode() {
        return this.dateHideRecentSearch.hashCode();
    }

    public String toString() {
        return "DeleteRecentSearchParams(dateHideRecentSearch=" + this.dateHideRecentSearch + ")";
    }
}
