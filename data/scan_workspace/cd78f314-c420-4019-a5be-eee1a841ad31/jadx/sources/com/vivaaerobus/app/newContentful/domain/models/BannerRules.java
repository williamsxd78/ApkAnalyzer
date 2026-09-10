package com.vivaaerobus.app.newContentful.domain.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerRules.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020(HÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006*"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/BannerRules;", "", "type", "", "startDate", "endDate", "currency", "", "language", "routeOriginCode", "routeDestinationCode", "toOriginCode", "toDestinationCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getStartDate", "getEndDate", "getCurrency", "()Ljava/util/List;", "getLanguage", "getRouteOriginCode", "getRouteDestinationCode", "getToOriginCode", "getToDestinationCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BannerRules {
    private final List<String> currency;
    private final String endDate;
    private final List<String> language;
    private final String routeDestinationCode;
    private final String routeOriginCode;
    private final String startDate;
    private final String toDestinationCode;
    private final String toOriginCode;
    private final String type;

    public BannerRules(String str, String str2, String str3, List<String> list, List<String> list2, String str4, String str5, String str6, String str7) {
        this.type = str;
        this.startDate = str2;
        this.endDate = str3;
        this.currency = list;
        this.language = list2;
        this.routeOriginCode = str4;
        this.routeDestinationCode = str5;
        this.toOriginCode = str6;
        this.toDestinationCode = str7;
    }

    public static /* synthetic */ BannerRules copy$default(BannerRules bannerRules, String str, String str2, String str3, List list, List list2, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerRules.type;
        }
        if ((i & 2) != 0) {
            str2 = bannerRules.startDate;
        }
        if ((i & 4) != 0) {
            str3 = bannerRules.endDate;
        }
        if ((i & 8) != 0) {
            list = bannerRules.currency;
        }
        if ((i & 16) != 0) {
            list2 = bannerRules.language;
        }
        if ((i & 32) != 0) {
            str4 = bannerRules.routeOriginCode;
        }
        if ((i & 64) != 0) {
            str5 = bannerRules.routeDestinationCode;
        }
        if ((i & 128) != 0) {
            str6 = bannerRules.toOriginCode;
        }
        if ((i & 256) != 0) {
            str7 = bannerRules.toDestinationCode;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        List list3 = list2;
        String str12 = str3;
        return bannerRules.copy(str, str2, str12, list, list3, str10, str11, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    public final List<String> component4() {
        return this.currency;
    }

    public final List<String> component5() {
        return this.language;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRouteOriginCode() {
        return this.routeOriginCode;
    }

    /* renamed from: component7, reason: from getter */
    public final String getRouteDestinationCode() {
        return this.routeDestinationCode;
    }

    /* renamed from: component8, reason: from getter */
    public final String getToOriginCode() {
        return this.toOriginCode;
    }

    /* renamed from: component9, reason: from getter */
    public final String getToDestinationCode() {
        return this.toDestinationCode;
    }

    public final BannerRules copy(String type, String startDate, String endDate, List<String> currency, List<String> language, String routeOriginCode, String routeDestinationCode, String toOriginCode, String toDestinationCode) {
        return new BannerRules(type, startDate, endDate, currency, language, routeOriginCode, routeDestinationCode, toOriginCode, toDestinationCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerRules)) {
            return false;
        }
        BannerRules bannerRules = (BannerRules) other;
        return Intrinsics.areEqual(this.type, bannerRules.type) && Intrinsics.areEqual(this.startDate, bannerRules.startDate) && Intrinsics.areEqual(this.endDate, bannerRules.endDate) && Intrinsics.areEqual(this.currency, bannerRules.currency) && Intrinsics.areEqual(this.language, bannerRules.language) && Intrinsics.areEqual(this.routeOriginCode, bannerRules.routeOriginCode) && Intrinsics.areEqual(this.routeDestinationCode, bannerRules.routeDestinationCode) && Intrinsics.areEqual(this.toOriginCode, bannerRules.toOriginCode) && Intrinsics.areEqual(this.toDestinationCode, bannerRules.toDestinationCode);
    }

    public final List<String> getCurrency() {
        return this.currency;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final List<String> getLanguage() {
        return this.language;
    }

    public final String getRouteDestinationCode() {
        return this.routeDestinationCode;
    }

    public final String getRouteOriginCode() {
        return this.routeOriginCode;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getToDestinationCode() {
        return this.toDestinationCode;
    }

    public final String getToOriginCode() {
        return this.toOriginCode;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.startDate;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.endDate;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.currency;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.language;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.routeOriginCode;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.routeDestinationCode;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.toOriginCode;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.toDestinationCode;
        return hashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "BannerRules(type=" + this.type + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", currency=" + this.currency + ", language=" + this.language + ", routeOriginCode=" + this.routeOriginCode + ", routeDestinationCode=" + this.routeDestinationCode + ", toOriginCode=" + this.toOriginCode + ", toDestinationCode=" + this.toDestinationCode + ")";
    }
}
