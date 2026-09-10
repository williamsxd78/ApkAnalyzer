package com.vivaaerobus.app.newContentful.domain.models;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import com.vivaaerobus.app.extras.extraDetail.activity.ExtraDetailActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomExtraCard.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002()BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Je\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001b\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006*"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/CustomExtraCard;", "", "id", "", "headerImage", "Lcom/vivaaerobus/app/newContentful/domain/models/CustomExtraCard$HeaderImage;", "title", FirebaseAnalytics.Param.CONTENT, ExtraDetailActivity.ARG_SSR_CODE, "", "callToAction", "Lcom/vivaaerobus/app/newContentful/domain/models/CustomExtraCard$CallToAction;", "urlIcon", "<init>", "(Ljava/lang/String;Lcom/vivaaerobus/app/newContentful/domain/models/CustomExtraCard$HeaderImage;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/vivaaerobus/app/newContentful/domain/models/CustomExtraCard$CallToAction;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getHeaderImage", "()Lcom/vivaaerobus/app/newContentful/domain/models/CustomExtraCard$HeaderImage;", "getTitle", "getContent", "getSsrCode", "()Ljava/util/List;", "getCallToAction", "()Lcom/vivaaerobus/app/newContentful/domain/models/CustomExtraCard$CallToAction;", "getUrlIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "HeaderImage", "CallToAction", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CustomExtraCard {
    private final CallToAction callToAction;
    private final String content;
    private final HeaderImage headerImage;
    private final String id;
    private final List<String> ssrCode;
    private final String title;
    private final String urlIcon;

    /* compiled from: CustomExtraCard.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/CustomExtraCard$CallToAction;", "", "url", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getText", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class CallToAction {
        private final String text;
        private final String url;

        public CallToAction(String str, String str2) {
            this.url = str;
            this.text = str2;
        }

        public static /* synthetic */ CallToAction copy$default(CallToAction callToAction, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = callToAction.url;
            }
            if ((i & 2) != 0) {
                str2 = callToAction.text;
            }
            return callToAction.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final CallToAction copy(String url, String text) {
            return new CallToAction(url, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CallToAction)) {
                return false;
            }
            CallToAction callToAction = (CallToAction) other;
            return Intrinsics.areEqual(this.url, callToAction.url) && Intrinsics.areEqual(this.text, callToAction.text);
        }

        public final String getText() {
            return this.text;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "CallToAction(url=" + this.url + ", text=" + this.text + ")";
        }
    }

    /* compiled from: CustomExtraCard.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/CustomExtraCard$HeaderImage;", "", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class HeaderImage {
        private final String url;

        public HeaderImage(String str) {
            this.url = str;
        }

        public static /* synthetic */ HeaderImage copy$default(HeaderImage headerImage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = headerImage.url;
            }
            return headerImage.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final HeaderImage copy(String url) {
            return new HeaderImage(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HeaderImage) && Intrinsics.areEqual(this.url, ((HeaderImage) other).url);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "HeaderImage(url=" + this.url + ")";
        }
    }

    public CustomExtraCard(String str, HeaderImage headerImage, String str2, String str3, List<String> list, CallToAction callToAction, String str4) {
        this.id = str;
        this.headerImage = headerImage;
        this.title = str2;
        this.content = str3;
        this.ssrCode = list;
        this.callToAction = callToAction;
        this.urlIcon = str4;
    }

    public static /* synthetic */ CustomExtraCard copy$default(CustomExtraCard customExtraCard, String str, HeaderImage headerImage, String str2, String str3, List list, CallToAction callToAction, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customExtraCard.id;
        }
        if ((i & 2) != 0) {
            headerImage = customExtraCard.headerImage;
        }
        if ((i & 4) != 0) {
            str2 = customExtraCard.title;
        }
        if ((i & 8) != 0) {
            str3 = customExtraCard.content;
        }
        if ((i & 16) != 0) {
            list = customExtraCard.ssrCode;
        }
        if ((i & 32) != 0) {
            callToAction = customExtraCard.callToAction;
        }
        if ((i & 64) != 0) {
            str4 = customExtraCard.urlIcon;
        }
        CallToAction callToAction2 = callToAction;
        String str5 = str4;
        List list2 = list;
        String str6 = str2;
        return customExtraCard.copy(str, headerImage, str6, str3, list2, callToAction2, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final HeaderImage getHeaderImage() {
        return this.headerImage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final List<String> component5() {
        return this.ssrCode;
    }

    /* renamed from: component6, reason: from getter */
    public final CallToAction getCallToAction() {
        return this.callToAction;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUrlIcon() {
        return this.urlIcon;
    }

    public final CustomExtraCard copy(String id, HeaderImage headerImage, String title, String content, List<String> ssrCode, CallToAction callToAction, String urlIcon) {
        return new CustomExtraCard(id, headerImage, title, content, ssrCode, callToAction, urlIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomExtraCard)) {
            return false;
        }
        CustomExtraCard customExtraCard = (CustomExtraCard) other;
        return Intrinsics.areEqual(this.id, customExtraCard.id) && Intrinsics.areEqual(this.headerImage, customExtraCard.headerImage) && Intrinsics.areEqual(this.title, customExtraCard.title) && Intrinsics.areEqual(this.content, customExtraCard.content) && Intrinsics.areEqual(this.ssrCode, customExtraCard.ssrCode) && Intrinsics.areEqual(this.callToAction, customExtraCard.callToAction) && Intrinsics.areEqual(this.urlIcon, customExtraCard.urlIcon);
    }

    public final CallToAction getCallToAction() {
        return this.callToAction;
    }

    public final String getContent() {
        return this.content;
    }

    public final HeaderImage getHeaderImage() {
        return this.headerImage;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getSsrCode() {
        return this.ssrCode;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrlIcon() {
        return this.urlIcon;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        HeaderImage headerImage = this.headerImage;
        int hashCode2 = (hashCode + (headerImage == null ? 0 : headerImage.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.ssrCode;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        CallToAction callToAction = this.callToAction;
        int hashCode6 = (hashCode5 + (callToAction == null ? 0 : callToAction.hashCode())) * 31;
        String str4 = this.urlIcon;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "CustomExtraCard(id=" + this.id + ", headerImage=" + this.headerImage + ", title=" + this.title + ", content=" + this.content + ", ssrCode=" + this.ssrCode + ", callToAction=" + this.callToAction + ", urlIcon=" + this.urlIcon + ")";
    }
}
