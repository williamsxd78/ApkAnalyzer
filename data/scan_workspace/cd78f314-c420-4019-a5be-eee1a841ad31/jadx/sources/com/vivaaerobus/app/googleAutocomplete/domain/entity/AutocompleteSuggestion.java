package com.vivaaerobus.app.googleAutocomplete.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutocompleteSuggestion.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/vivaaerobus/app/googleAutocomplete/domain/entity/AutocompleteSuggestion;", "", "placeId", "", "fullText", "mainText", "secondaryText", "types", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPlaceId", "()Ljava/lang/String;", "getFullText", "getMainText", "getSecondaryText", "getTypes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "googleAutocomplete_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AutocompleteSuggestion {
    private final String fullText;
    private final String mainText;
    private final String placeId;
    private final String secondaryText;
    private final List<String> types;

    public AutocompleteSuggestion(String placeId, String fullText, String mainText, String secondaryText, List<String> types) {
        Intrinsics.checkNotNullParameter(placeId, "placeId");
        Intrinsics.checkNotNullParameter(fullText, "fullText");
        Intrinsics.checkNotNullParameter(mainText, "mainText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(types, "types");
        this.placeId = placeId;
        this.fullText = fullText;
        this.mainText = mainText;
        this.secondaryText = secondaryText;
        this.types = types;
    }

    public static /* synthetic */ AutocompleteSuggestion copy$default(AutocompleteSuggestion autocompleteSuggestion, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autocompleteSuggestion.placeId;
        }
        if ((i & 2) != 0) {
            str2 = autocompleteSuggestion.fullText;
        }
        if ((i & 4) != 0) {
            str3 = autocompleteSuggestion.mainText;
        }
        if ((i & 8) != 0) {
            str4 = autocompleteSuggestion.secondaryText;
        }
        if ((i & 16) != 0) {
            list = autocompleteSuggestion.types;
        }
        List list2 = list;
        String str5 = str3;
        return autocompleteSuggestion.copy(str, str2, str5, str4, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPlaceId() {
        return this.placeId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFullText() {
        return this.fullText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMainText() {
        return this.mainText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public final List<String> component5() {
        return this.types;
    }

    public final AutocompleteSuggestion copy(String placeId, String fullText, String mainText, String secondaryText, List<String> types) {
        Intrinsics.checkNotNullParameter(placeId, "placeId");
        Intrinsics.checkNotNullParameter(fullText, "fullText");
        Intrinsics.checkNotNullParameter(mainText, "mainText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(types, "types");
        return new AutocompleteSuggestion(placeId, fullText, mainText, secondaryText, types);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutocompleteSuggestion)) {
            return false;
        }
        AutocompleteSuggestion autocompleteSuggestion = (AutocompleteSuggestion) other;
        return Intrinsics.areEqual(this.placeId, autocompleteSuggestion.placeId) && Intrinsics.areEqual(this.fullText, autocompleteSuggestion.fullText) && Intrinsics.areEqual(this.mainText, autocompleteSuggestion.mainText) && Intrinsics.areEqual(this.secondaryText, autocompleteSuggestion.secondaryText) && Intrinsics.areEqual(this.types, autocompleteSuggestion.types);
    }

    public final String getFullText() {
        return this.fullText;
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

    public final List<String> getTypes() {
        return this.types;
    }

    public int hashCode() {
        return (((((((this.placeId.hashCode() * 31) + this.fullText.hashCode()) * 31) + this.mainText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + this.types.hashCode();
    }

    public String toString() {
        return "AutocompleteSuggestion(placeId=" + this.placeId + ", fullText=" + this.fullText + ", mainText=" + this.mainText + ", secondaryText=" + this.secondaryText + ", types=" + this.types + ")";
    }
}
