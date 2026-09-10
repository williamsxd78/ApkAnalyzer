package com.vivaaerobus.app.recentSearch.domain.usecase.addRecentSearch;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddRecentSearchResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/vivaaerobus/app/recentSearch/domain/usecase/addRecentSearch/AddRecentSearchResponse;", "", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "recentSearch_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AddRecentSearchResponse {
    private final String url;

    public AddRecentSearchResponse(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
    }

    public static /* synthetic */ AddRecentSearchResponse copy$default(AddRecentSearchResponse addRecentSearchResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addRecentSearchResponse.url;
        }
        return addRecentSearchResponse.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final AddRecentSearchResponse copy(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new AddRecentSearchResponse(url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AddRecentSearchResponse) && Intrinsics.areEqual(this.url, ((AddRecentSearchResponse) other).url);
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String toString() {
        return "AddRecentSearchResponse(url=" + this.url + ")";
    }
}
