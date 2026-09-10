package com.vivaaerobus.app.newContentful.domain.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisplayRules.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\u0083\u0001\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/DisplayRules;", "", "applicableMarkets", "", "", "channels", "currencies", "device", "flowModifiers", "hideModifiers", "languages", "groupCode", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getApplicableMarkets", "()Ljava/util/List;", "getChannels", "getCurrencies", "getDevice", "getFlowModifiers", "getHideModifiers", "getLanguages", "getGroupCode", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DisplayRules {
    private final List<String> applicableMarkets;
    private final List<String> channels;
    private final List<String> currencies;
    private final List<String> device;
    private final List<String> flowModifiers;
    private final String groupCode;
    private final List<String> hideModifiers;
    private final List<String> languages;

    public DisplayRules(List<String> applicableMarkets, List<String> channels, List<String> currencies, List<String> device, List<String> flowModifiers, List<String> hideModifiers, List<String> languages, String groupCode) {
        Intrinsics.checkNotNullParameter(applicableMarkets, "applicableMarkets");
        Intrinsics.checkNotNullParameter(channels, "channels");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(flowModifiers, "flowModifiers");
        Intrinsics.checkNotNullParameter(hideModifiers, "hideModifiers");
        Intrinsics.checkNotNullParameter(languages, "languages");
        Intrinsics.checkNotNullParameter(groupCode, "groupCode");
        this.applicableMarkets = applicableMarkets;
        this.channels = channels;
        this.currencies = currencies;
        this.device = device;
        this.flowModifiers = flowModifiers;
        this.hideModifiers = hideModifiers;
        this.languages = languages;
        this.groupCode = groupCode;
    }

    public static /* synthetic */ DisplayRules copy$default(DisplayRules displayRules, List list, List list2, List list3, List list4, List list5, List list6, List list7, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = displayRules.applicableMarkets;
        }
        if ((i & 2) != 0) {
            list2 = displayRules.channels;
        }
        if ((i & 4) != 0) {
            list3 = displayRules.currencies;
        }
        if ((i & 8) != 0) {
            list4 = displayRules.device;
        }
        if ((i & 16) != 0) {
            list5 = displayRules.flowModifiers;
        }
        if ((i & 32) != 0) {
            list6 = displayRules.hideModifiers;
        }
        if ((i & 64) != 0) {
            list7 = displayRules.languages;
        }
        if ((i & 128) != 0) {
            str = displayRules.groupCode;
        }
        List list8 = list7;
        String str2 = str;
        List list9 = list5;
        List list10 = list6;
        return displayRules.copy(list, list2, list3, list4, list9, list10, list8, str2);
    }

    public final List<String> component1() {
        return this.applicableMarkets;
    }

    public final List<String> component2() {
        return this.channels;
    }

    public final List<String> component3() {
        return this.currencies;
    }

    public final List<String> component4() {
        return this.device;
    }

    public final List<String> component5() {
        return this.flowModifiers;
    }

    public final List<String> component6() {
        return this.hideModifiers;
    }

    public final List<String> component7() {
        return this.languages;
    }

    /* renamed from: component8, reason: from getter */
    public final String getGroupCode() {
        return this.groupCode;
    }

    public final DisplayRules copy(List<String> applicableMarkets, List<String> channels, List<String> currencies, List<String> device, List<String> flowModifiers, List<String> hideModifiers, List<String> languages, String groupCode) {
        Intrinsics.checkNotNullParameter(applicableMarkets, "applicableMarkets");
        Intrinsics.checkNotNullParameter(channels, "channels");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(flowModifiers, "flowModifiers");
        Intrinsics.checkNotNullParameter(hideModifiers, "hideModifiers");
        Intrinsics.checkNotNullParameter(languages, "languages");
        Intrinsics.checkNotNullParameter(groupCode, "groupCode");
        return new DisplayRules(applicableMarkets, channels, currencies, device, flowModifiers, hideModifiers, languages, groupCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayRules)) {
            return false;
        }
        DisplayRules displayRules = (DisplayRules) other;
        return Intrinsics.areEqual(this.applicableMarkets, displayRules.applicableMarkets) && Intrinsics.areEqual(this.channels, displayRules.channels) && Intrinsics.areEqual(this.currencies, displayRules.currencies) && Intrinsics.areEqual(this.device, displayRules.device) && Intrinsics.areEqual(this.flowModifiers, displayRules.flowModifiers) && Intrinsics.areEqual(this.hideModifiers, displayRules.hideModifiers) && Intrinsics.areEqual(this.languages, displayRules.languages) && Intrinsics.areEqual(this.groupCode, displayRules.groupCode);
    }

    public final List<String> getApplicableMarkets() {
        return this.applicableMarkets;
    }

    public final List<String> getChannels() {
        return this.channels;
    }

    public final List<String> getCurrencies() {
        return this.currencies;
    }

    public final List<String> getDevice() {
        return this.device;
    }

    public final List<String> getFlowModifiers() {
        return this.flowModifiers;
    }

    public final String getGroupCode() {
        return this.groupCode;
    }

    public final List<String> getHideModifiers() {
        return this.hideModifiers;
    }

    public final List<String> getLanguages() {
        return this.languages;
    }

    public int hashCode() {
        return (((((((((((((this.applicableMarkets.hashCode() * 31) + this.channels.hashCode()) * 31) + this.currencies.hashCode()) * 31) + this.device.hashCode()) * 31) + this.flowModifiers.hashCode()) * 31) + this.hideModifiers.hashCode()) * 31) + this.languages.hashCode()) * 31) + this.groupCode.hashCode();
    }

    public String toString() {
        return "DisplayRules(applicableMarkets=" + this.applicableMarkets + ", channels=" + this.channels + ", currencies=" + this.currencies + ", device=" + this.device + ", flowModifiers=" + this.flowModifiers + ", hideModifiers=" + this.hideModifiers + ", languages=" + this.languages + ", groupCode=" + this.groupCode + ")";
    }
}
