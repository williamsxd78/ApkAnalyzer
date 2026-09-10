package com.vivaaerobus.app.newContentful.data.dataSource.remote.apollo.utils;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetItemGroupMapper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¥\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00101\u001a\u000202HÖ\u0081\u0004J\n\u00103\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00064"}, d2 = {"Lcom/vivaaerobus/app/newContentful/data/dataSource/remote/apollo/utils/CarouselPayload;", "", "title", "", "mediaTitle", "description", "disclaimer", "headerText", "mediaUrl", "callToActionText", "callToActionUrl", "callToAction2Text", "callToAction2Url", "supportText", "headerPartnershipImageUrl", "sponsorImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMediaTitle", "getDescription", "getDisclaimer", "getHeaderText", "getMediaUrl", "getCallToActionText", "getCallToActionUrl", "getCallToAction2Text", "getCallToAction2Url", "getSupportText", "getHeaderPartnershipImageUrl", "getSponsorImageUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CarouselPayload {
    private final String callToAction2Text;
    private final String callToAction2Url;
    private final String callToActionText;
    private final String callToActionUrl;
    private final String description;
    private final String disclaimer;
    private final String headerPartnershipImageUrl;
    private final String headerText;
    private final String mediaTitle;
    private final String mediaUrl;
    private final String sponsorImageUrl;
    private final String supportText;
    private final String title;

    public CarouselPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.title = str;
        this.mediaTitle = str2;
        this.description = str3;
        this.disclaimer = str4;
        this.headerText = str5;
        this.mediaUrl = str6;
        this.callToActionText = str7;
        this.callToActionUrl = str8;
        this.callToAction2Text = str9;
        this.callToAction2Url = str10;
        this.supportText = str11;
        this.headerPartnershipImageUrl = str12;
        this.sponsorImageUrl = str13;
    }

    public static /* synthetic */ CarouselPayload copy$default(CarouselPayload carouselPayload, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, Object obj) {
        if ((i & 1) != 0) {
            str = carouselPayload.title;
        }
        return carouselPayload.copy(str, (i & 2) != 0 ? carouselPayload.mediaTitle : str2, (i & 4) != 0 ? carouselPayload.description : str3, (i & 8) != 0 ? carouselPayload.disclaimer : str4, (i & 16) != 0 ? carouselPayload.headerText : str5, (i & 32) != 0 ? carouselPayload.mediaUrl : str6, (i & 64) != 0 ? carouselPayload.callToActionText : str7, (i & 128) != 0 ? carouselPayload.callToActionUrl : str8, (i & 256) != 0 ? carouselPayload.callToAction2Text : str9, (i & 512) != 0 ? carouselPayload.callToAction2Url : str10, (i & 1024) != 0 ? carouselPayload.supportText : str11, (i & 2048) != 0 ? carouselPayload.headerPartnershipImageUrl : str12, (i & 4096) != 0 ? carouselPayload.sponsorImageUrl : str13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCallToAction2Url() {
        return this.callToAction2Url;
    }

    /* renamed from: component11, reason: from getter */
    public final String getSupportText() {
        return this.supportText;
    }

    /* renamed from: component12, reason: from getter */
    public final String getHeaderPartnershipImageUrl() {
        return this.headerPartnershipImageUrl;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSponsorImageUrl() {
        return this.sponsorImageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMediaTitle() {
        return this.mediaTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: component5, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCallToActionText() {
        return this.callToActionText;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCallToActionUrl() {
        return this.callToActionUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCallToAction2Text() {
        return this.callToAction2Text;
    }

    public final CarouselPayload copy(String title, String mediaTitle, String description, String disclaimer, String headerText, String mediaUrl, String callToActionText, String callToActionUrl, String callToAction2Text, String callToAction2Url, String supportText, String headerPartnershipImageUrl, String sponsorImageUrl) {
        return new CarouselPayload(title, mediaTitle, description, disclaimer, headerText, mediaUrl, callToActionText, callToActionUrl, callToAction2Text, callToAction2Url, supportText, headerPartnershipImageUrl, sponsorImageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselPayload)) {
            return false;
        }
        CarouselPayload carouselPayload = (CarouselPayload) other;
        return Intrinsics.areEqual(this.title, carouselPayload.title) && Intrinsics.areEqual(this.mediaTitle, carouselPayload.mediaTitle) && Intrinsics.areEqual(this.description, carouselPayload.description) && Intrinsics.areEqual(this.disclaimer, carouselPayload.disclaimer) && Intrinsics.areEqual(this.headerText, carouselPayload.headerText) && Intrinsics.areEqual(this.mediaUrl, carouselPayload.mediaUrl) && Intrinsics.areEqual(this.callToActionText, carouselPayload.callToActionText) && Intrinsics.areEqual(this.callToActionUrl, carouselPayload.callToActionUrl) && Intrinsics.areEqual(this.callToAction2Text, carouselPayload.callToAction2Text) && Intrinsics.areEqual(this.callToAction2Url, carouselPayload.callToAction2Url) && Intrinsics.areEqual(this.supportText, carouselPayload.supportText) && Intrinsics.areEqual(this.headerPartnershipImageUrl, carouselPayload.headerPartnershipImageUrl) && Intrinsics.areEqual(this.sponsorImageUrl, carouselPayload.sponsorImageUrl);
    }

    public final String getCallToAction2Text() {
        return this.callToAction2Text;
    }

    public final String getCallToAction2Url() {
        return this.callToAction2Url;
    }

    public final String getCallToActionText() {
        return this.callToActionText;
    }

    public final String getCallToActionUrl() {
        return this.callToActionUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final String getHeaderPartnershipImageUrl() {
        return this.headerPartnershipImageUrl;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final String getMediaTitle() {
        return this.mediaTitle;
    }

    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    public final String getSponsorImageUrl() {
        return this.sponsorImageUrl;
    }

    public final String getSupportText() {
        return this.supportText;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mediaTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.disclaimer;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.headerText;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mediaUrl;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.callToActionText;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.callToActionUrl;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.callToAction2Text;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.callToAction2Url;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.supportText;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.headerPartnershipImageUrl;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.sponsorImageUrl;
        return hashCode12 + (str13 != null ? str13.hashCode() : 0);
    }

    public String toString() {
        return "CarouselPayload(title=" + this.title + ", mediaTitle=" + this.mediaTitle + ", description=" + this.description + ", disclaimer=" + this.disclaimer + ", headerText=" + this.headerText + ", mediaUrl=" + this.mediaUrl + ", callToActionText=" + this.callToActionText + ", callToActionUrl=" + this.callToActionUrl + ", callToAction2Text=" + this.callToAction2Text + ", callToAction2Url=" + this.callToAction2Url + ", supportText=" + this.supportText + ", headerPartnershipImageUrl=" + this.headerPartnershipImageUrl + ", sponsorImageUrl=" + this.sponsorImageUrl + ")";
    }
}
