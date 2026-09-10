package com.vivaaerobus.app.newContentful.domain.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerFlightAvailability.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J±\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00105\u001a\u000206HÖ\u0081\u0004J\n\u00107\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u00068"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/BannerFlightAvailability;", "", "title", "", "subtitle", "backgroundImage", "closeActionText", "type", "startDate", "Ljava/util/Date;", "endDate", "currency", "", "language", "routeOriginCode", "routeDestinationCode", "toOriginCode", "toDestinationCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getBackgroundImage", "getCloseActionText", "getType", "getStartDate", "()Ljava/util/Date;", "getEndDate", "getCurrency", "()Ljava/util/List;", "getLanguage", "getRouteOriginCode", "getRouteDestinationCode", "getToOriginCode", "getToDestinationCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BannerFlightAvailability {
    private final String backgroundImage;
    private final String closeActionText;
    private final List<String> currency;
    private final Date endDate;
    private final List<String> language;
    private final String routeDestinationCode;
    private final String routeOriginCode;
    private final Date startDate;
    private final String subtitle;
    private final String title;
    private final String toDestinationCode;
    private final String toOriginCode;
    private final String type;

    public BannerFlightAvailability(String str, String str2, String str3, String str4, String str5, Date date, Date date2, List<String> list, List<String> list2, String str6, String str7, String str8, String str9) {
        this.title = str;
        this.subtitle = str2;
        this.backgroundImage = str3;
        this.closeActionText = str4;
        this.type = str5;
        this.startDate = date;
        this.endDate = date2;
        this.currency = list;
        this.language = list2;
        this.routeOriginCode = str6;
        this.routeDestinationCode = str7;
        this.toOriginCode = str8;
        this.toDestinationCode = str9;
    }

    public static /* synthetic */ BannerFlightAvailability copy$default(BannerFlightAvailability bannerFlightAvailability, String str, String str2, String str3, String str4, String str5, Date date, Date date2, List list, List list2, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerFlightAvailability.title;
        }
        return bannerFlightAvailability.copy(str, (i & 2) != 0 ? bannerFlightAvailability.subtitle : str2, (i & 4) != 0 ? bannerFlightAvailability.backgroundImage : str3, (i & 8) != 0 ? bannerFlightAvailability.closeActionText : str4, (i & 16) != 0 ? bannerFlightAvailability.type : str5, (i & 32) != 0 ? bannerFlightAvailability.startDate : date, (i & 64) != 0 ? bannerFlightAvailability.endDate : date2, (i & 128) != 0 ? bannerFlightAvailability.currency : list, (i & 256) != 0 ? bannerFlightAvailability.language : list2, (i & 512) != 0 ? bannerFlightAvailability.routeOriginCode : str6, (i & 1024) != 0 ? bannerFlightAvailability.routeDestinationCode : str7, (i & 2048) != 0 ? bannerFlightAvailability.toOriginCode : str8, (i & 4096) != 0 ? bannerFlightAvailability.toDestinationCode : str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getRouteOriginCode() {
        return this.routeOriginCode;
    }

    /* renamed from: component11, reason: from getter */
    public final String getRouteDestinationCode() {
        return this.routeDestinationCode;
    }

    /* renamed from: component12, reason: from getter */
    public final String getToOriginCode() {
        return this.toOriginCode;
    }

    /* renamed from: component13, reason: from getter */
    public final String getToDestinationCode() {
        return this.toDestinationCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCloseActionText() {
        return this.closeActionText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getStartDate() {
        return this.startDate;
    }

    /* renamed from: component7, reason: from getter */
    public final Date getEndDate() {
        return this.endDate;
    }

    public final List<String> component8() {
        return this.currency;
    }

    public final List<String> component9() {
        return this.language;
    }

    public final BannerFlightAvailability copy(String title, String subtitle, String backgroundImage, String closeActionText, String type, Date startDate, Date endDate, List<String> currency, List<String> language, String routeOriginCode, String routeDestinationCode, String toOriginCode, String toDestinationCode) {
        return new BannerFlightAvailability(title, subtitle, backgroundImage, closeActionText, type, startDate, endDate, currency, language, routeOriginCode, routeDestinationCode, toOriginCode, toDestinationCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerFlightAvailability)) {
            return false;
        }
        BannerFlightAvailability bannerFlightAvailability = (BannerFlightAvailability) other;
        return Intrinsics.areEqual(this.title, bannerFlightAvailability.title) && Intrinsics.areEqual(this.subtitle, bannerFlightAvailability.subtitle) && Intrinsics.areEqual(this.backgroundImage, bannerFlightAvailability.backgroundImage) && Intrinsics.areEqual(this.closeActionText, bannerFlightAvailability.closeActionText) && Intrinsics.areEqual(this.type, bannerFlightAvailability.type) && Intrinsics.areEqual(this.startDate, bannerFlightAvailability.startDate) && Intrinsics.areEqual(this.endDate, bannerFlightAvailability.endDate) && Intrinsics.areEqual(this.currency, bannerFlightAvailability.currency) && Intrinsics.areEqual(this.language, bannerFlightAvailability.language) && Intrinsics.areEqual(this.routeOriginCode, bannerFlightAvailability.routeOriginCode) && Intrinsics.areEqual(this.routeDestinationCode, bannerFlightAvailability.routeDestinationCode) && Intrinsics.areEqual(this.toOriginCode, bannerFlightAvailability.toOriginCode) && Intrinsics.areEqual(this.toDestinationCode, bannerFlightAvailability.toDestinationCode);
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getCloseActionText() {
        return this.closeActionText;
    }

    public final List<String> getCurrency() {
        return this.currency;
    }

    public final Date getEndDate() {
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

    public final Date getStartDate() {
        return this.startDate;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
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
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundImage;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.closeActionText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.type;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Date date = this.startDate;
        int hashCode6 = (hashCode5 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.endDate;
        int hashCode7 = (hashCode6 + (date2 == null ? 0 : date2.hashCode())) * 31;
        List<String> list = this.currency;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.language;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.routeOriginCode;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.routeDestinationCode;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.toOriginCode;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.toDestinationCode;
        return hashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "BannerFlightAvailability(title=" + this.title + ", subtitle=" + this.subtitle + ", backgroundImage=" + this.backgroundImage + ", closeActionText=" + this.closeActionText + ", type=" + this.type + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", currency=" + this.currency + ", language=" + this.language + ", routeOriginCode=" + this.routeOriginCode + ", routeDestinationCode=" + this.routeDestinationCode + ", toOriginCode=" + this.toOriginCode + ", toDestinationCode=" + this.toDestinationCode + ")";
    }
}
