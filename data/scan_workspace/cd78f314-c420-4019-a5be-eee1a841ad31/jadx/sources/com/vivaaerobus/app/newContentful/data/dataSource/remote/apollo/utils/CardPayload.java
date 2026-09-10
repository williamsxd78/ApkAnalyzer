package com.vivaaerobus.app.newContentful.data.dataSource.remote.apollo.utils;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetItemGroupMapper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020)HÖ\u0081\u0004J\n\u0010*\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006+"}, d2 = {"Lcom/vivaaerobus/app/newContentful/data/dataSource/remote/apollo/utils/CardPayload;", "", "title", "", "code", "imageUrl", "imageTitle", "description", "callToActionUrl", "callToActionText", "bookingRule", "destinationImageUrl", "simplifiedImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getCode", "getImageUrl", "getImageTitle", "getDescription", "getCallToActionUrl", "getCallToActionText", "getBookingRule", "getDestinationImageUrl", "getSimplifiedImageUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CardPayload {
    private final String bookingRule;
    private final String callToActionText;
    private final String callToActionUrl;
    private final String code;
    private final String description;
    private final String destinationImageUrl;
    private final String imageTitle;
    private final String imageUrl;
    private final String simplifiedImageUrl;
    private final String title;

    public CardPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.title = str;
        this.code = str2;
        this.imageUrl = str3;
        this.imageTitle = str4;
        this.description = str5;
        this.callToActionUrl = str6;
        this.callToActionText = str7;
        this.bookingRule = str8;
        this.destinationImageUrl = str9;
        this.simplifiedImageUrl = str10;
    }

    public static /* synthetic */ CardPayload copy$default(CardPayload cardPayload, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardPayload.title;
        }
        if ((i & 2) != 0) {
            str2 = cardPayload.code;
        }
        if ((i & 4) != 0) {
            str3 = cardPayload.imageUrl;
        }
        if ((i & 8) != 0) {
            str4 = cardPayload.imageTitle;
        }
        if ((i & 16) != 0) {
            str5 = cardPayload.description;
        }
        if ((i & 32) != 0) {
            str6 = cardPayload.callToActionUrl;
        }
        if ((i & 64) != 0) {
            str7 = cardPayload.callToActionText;
        }
        if ((i & 128) != 0) {
            str8 = cardPayload.bookingRule;
        }
        if ((i & 256) != 0) {
            str9 = cardPayload.destinationImageUrl;
        }
        if ((i & 512) != 0) {
            str10 = cardPayload.simplifiedImageUrl;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return cardPayload.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSimplifiedImageUrl() {
        return this.simplifiedImageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageTitle() {
        return this.imageTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCallToActionUrl() {
        return this.callToActionUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCallToActionText() {
        return this.callToActionText;
    }

    /* renamed from: component8, reason: from getter */
    public final String getBookingRule() {
        return this.bookingRule;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDestinationImageUrl() {
        return this.destinationImageUrl;
    }

    public final CardPayload copy(String title, String code, String imageUrl, String imageTitle, String description, String callToActionUrl, String callToActionText, String bookingRule, String destinationImageUrl, String simplifiedImageUrl) {
        return new CardPayload(title, code, imageUrl, imageTitle, description, callToActionUrl, callToActionText, bookingRule, destinationImageUrl, simplifiedImageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardPayload)) {
            return false;
        }
        CardPayload cardPayload = (CardPayload) other;
        return Intrinsics.areEqual(this.title, cardPayload.title) && Intrinsics.areEqual(this.code, cardPayload.code) && Intrinsics.areEqual(this.imageUrl, cardPayload.imageUrl) && Intrinsics.areEqual(this.imageTitle, cardPayload.imageTitle) && Intrinsics.areEqual(this.description, cardPayload.description) && Intrinsics.areEqual(this.callToActionUrl, cardPayload.callToActionUrl) && Intrinsics.areEqual(this.callToActionText, cardPayload.callToActionText) && Intrinsics.areEqual(this.bookingRule, cardPayload.bookingRule) && Intrinsics.areEqual(this.destinationImageUrl, cardPayload.destinationImageUrl) && Intrinsics.areEqual(this.simplifiedImageUrl, cardPayload.simplifiedImageUrl);
    }

    public final String getBookingRule() {
        return this.bookingRule;
    }

    public final String getCallToActionText() {
        return this.callToActionText;
    }

    public final String getCallToActionUrl() {
        return this.callToActionUrl;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDestinationImageUrl() {
        return this.destinationImageUrl;
    }

    public final String getImageTitle() {
        return this.imageTitle;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getSimplifiedImageUrl() {
        return this.simplifiedImageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageTitle;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.callToActionUrl;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.callToActionText;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.bookingRule;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.destinationImageUrl;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.simplifiedImageUrl;
        return hashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        return "CardPayload(title=" + this.title + ", code=" + this.code + ", imageUrl=" + this.imageUrl + ", imageTitle=" + this.imageTitle + ", description=" + this.description + ", callToActionUrl=" + this.callToActionUrl + ", callToActionText=" + this.callToActionText + ", bookingRule=" + this.bookingRule + ", destinationImageUrl=" + this.destinationImageUrl + ", simplifiedImageUrl=" + this.simplifiedImageUrl + ")";
    }
}
