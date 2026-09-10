package com.vivaaerobus.app.home.presentation.mainFragment.compose.search;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeHeaderSearchState.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/vivaaerobus/app/home/presentation/mainFragment/compose/search/HomeHeaderSearchState;", "", "defaultText", "", "prefix", "altTexts", "", "intervalMs", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)V", "getDefaultText", "()Ljava/lang/String;", "getPrefix", "getAltTexts", "()Ljava/util/List;", "getIntervalMs", "()J", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "home_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HomeHeaderSearchState {
    public static final int $stable = 8;
    private final List<String> altTexts;
    private final String defaultText;
    private final long intervalMs;
    private final String prefix;

    public HomeHeaderSearchState(String defaultText, String prefix, List<String> altTexts, long j) {
        Intrinsics.checkNotNullParameter(defaultText, "defaultText");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(altTexts, "altTexts");
        this.defaultText = defaultText;
        this.prefix = prefix;
        this.altTexts = altTexts;
        this.intervalMs = j;
    }

    public static /* synthetic */ HomeHeaderSearchState copy$default(HomeHeaderSearchState homeHeaderSearchState, String str, String str2, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homeHeaderSearchState.defaultText;
        }
        if ((i & 2) != 0) {
            str2 = homeHeaderSearchState.prefix;
        }
        if ((i & 4) != 0) {
            list = homeHeaderSearchState.altTexts;
        }
        if ((i & 8) != 0) {
            j = homeHeaderSearchState.intervalMs;
        }
        List list2 = list;
        return homeHeaderSearchState.copy(str, str2, list2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDefaultText() {
        return this.defaultText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    public final List<String> component3() {
        return this.altTexts;
    }

    /* renamed from: component4, reason: from getter */
    public final long getIntervalMs() {
        return this.intervalMs;
    }

    public final HomeHeaderSearchState copy(String defaultText, String prefix, List<String> altTexts, long intervalMs) {
        Intrinsics.checkNotNullParameter(defaultText, "defaultText");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(altTexts, "altTexts");
        return new HomeHeaderSearchState(defaultText, prefix, altTexts, intervalMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeHeaderSearchState)) {
            return false;
        }
        HomeHeaderSearchState homeHeaderSearchState = (HomeHeaderSearchState) other;
        return Intrinsics.areEqual(this.defaultText, homeHeaderSearchState.defaultText) && Intrinsics.areEqual(this.prefix, homeHeaderSearchState.prefix) && Intrinsics.areEqual(this.altTexts, homeHeaderSearchState.altTexts) && this.intervalMs == homeHeaderSearchState.intervalMs;
    }

    public final List<String> getAltTexts() {
        return this.altTexts;
    }

    public final String getDefaultText() {
        return this.defaultText;
    }

    public final long getIntervalMs() {
        return this.intervalMs;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public int hashCode() {
        return (((((this.defaultText.hashCode() * 31) + this.prefix.hashCode()) * 31) + this.altTexts.hashCode()) * 31) + Long.hashCode(this.intervalMs);
    }

    public String toString() {
        return "HomeHeaderSearchState(defaultText=" + this.defaultText + ", prefix=" + this.prefix + ", altTexts=" + this.altTexts + ", intervalMs=" + this.intervalMs + ")";
    }
}
