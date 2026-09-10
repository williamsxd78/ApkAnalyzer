package com.vivaaerobus.app.shared.resources.domain.useCase.getPopularDestinations;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetPopularDestinationsParams.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/vivaaerobus/app/shared/resources/domain/useCase/getPopularDestinations/GetPopularDestinationsParams;", "", "codes", "", "", "resourceIds", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getCodes", "()Ljava/util/List;", "getResourceIds", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "resources_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GetPopularDestinationsParams {
    private final List<String> codes;
    private final List<String> resourceIds;

    public GetPopularDestinationsParams(List<String> codes, List<String> resourceIds) {
        Intrinsics.checkNotNullParameter(codes, "codes");
        Intrinsics.checkNotNullParameter(resourceIds, "resourceIds");
        this.codes = codes;
        this.resourceIds = resourceIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetPopularDestinationsParams copy$default(GetPopularDestinationsParams getPopularDestinationsParams, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getPopularDestinationsParams.codes;
        }
        if ((i & 2) != 0) {
            list2 = getPopularDestinationsParams.resourceIds;
        }
        return getPopularDestinationsParams.copy(list, list2);
    }

    public final List<String> component1() {
        return this.codes;
    }

    public final List<String> component2() {
        return this.resourceIds;
    }

    public final GetPopularDestinationsParams copy(List<String> codes, List<String> resourceIds) {
        Intrinsics.checkNotNullParameter(codes, "codes");
        Intrinsics.checkNotNullParameter(resourceIds, "resourceIds");
        return new GetPopularDestinationsParams(codes, resourceIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPopularDestinationsParams)) {
            return false;
        }
        GetPopularDestinationsParams getPopularDestinationsParams = (GetPopularDestinationsParams) other;
        return Intrinsics.areEqual(this.codes, getPopularDestinationsParams.codes) && Intrinsics.areEqual(this.resourceIds, getPopularDestinationsParams.resourceIds);
    }

    public final List<String> getCodes() {
        return this.codes;
    }

    public final List<String> getResourceIds() {
        return this.resourceIds;
    }

    public int hashCode() {
        return (this.codes.hashCode() * 31) + this.resourceIds.hashCode();
    }

    public String toString() {
        return "GetPopularDestinationsParams(codes=" + this.codes + ", resourceIds=" + this.resourceIds + ")";
    }
}
