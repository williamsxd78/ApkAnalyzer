package com.vivaaerobus.app.components.autocomplete.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutocompleteSuggestion.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/components/autocomplete/model/AutocompleteSuggestion;", "", "placeId", "", "mainText", "secondaryText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlaceId", "()Ljava/lang/String;", "getMainText", "getSecondaryText", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AutocompleteSuggestion {
    public static final int $stable = 0;
    private final String mainText;
    private final String placeId;
    private final String secondaryText;

    public AutocompleteSuggestion(String placeId, String mainText, String secondaryText) {
        Intrinsics.checkNotNullParameter(placeId, "placeId");
        Intrinsics.checkNotNullParameter(mainText, "mainText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        this.placeId = placeId;
        this.mainText = mainText;
        this.secondaryText = secondaryText;
    }

    public static /* synthetic */ AutocompleteSuggestion copy$default(AutocompleteSuggestion autocompleteSuggestion, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autocompleteSuggestion.placeId;
        }
        if ((i & 2) != 0) {
            str2 = autocompleteSuggestion.mainText;
        }
        if ((i & 4) != 0) {
            str3 = autocompleteSuggestion.secondaryText;
        }
        return autocompleteSuggestion.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPlaceId() {
        return this.placeId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMainText() {
        return this.mainText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public final AutocompleteSuggestion copy(String placeId, String mainText, String secondaryText) {
        Intrinsics.checkNotNullParameter(placeId, "placeId");
        Intrinsics.checkNotNullParameter(mainText, "mainText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        return new AutocompleteSuggestion(placeId, mainText, secondaryText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutocompleteSuggestion)) {
            return false;
        }
        AutocompleteSuggestion autocompleteSuggestion = (AutocompleteSuggestion) other;
        return Intrinsics.areEqual(this.placeId, autocompleteSuggestion.placeId) && Intrinsics.areEqual(this.mainText, autocompleteSuggestion.mainText) && Intrinsics.areEqual(this.secondaryText, autocompleteSuggestion.secondaryText);
    }

    public final String getMainText() {
        return this.mainText;
    }

    public final String getPlaceId() {
        return this.placeId;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public int hashCode() {
        return (((this.placeId.hashCode() * 31) + this.mainText.hashCode()) * 31) + this.secondaryText.hashCode();
    }

    public String toString() {
        return "AutocompleteSuggestion(placeId=" + this.placeId + ", mainText=" + this.mainText + ", secondaryText=" + this.secondaryText + ")";
    }
}
