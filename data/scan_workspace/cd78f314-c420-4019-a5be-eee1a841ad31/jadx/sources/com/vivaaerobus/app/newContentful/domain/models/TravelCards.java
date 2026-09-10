package com.vivaaerobus.app.newContentful.domain.models;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.caverock.androidsvg.SVGParser;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TravelCards.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u000223Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u000200HÖ\u0081\u0004J\n\u00101\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00064"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/TravelCards;", "", "id", "", "code", "title", "callToAction", "Lcom/vivaaerobus/app/newContentful/domain/models/TravelCards$CallToAction;", SVGParser.XML_STYLESHEET_ATTR_MEDIA, "Lcom/vivaaerobus/app/newContentful/domain/models/TravelCards$Media;", "simplifiedImage", "originCity", "destinationCity", "description", "destinationAlert", "paxType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vivaaerobus/app/newContentful/domain/models/TravelCards$CallToAction;Lcom/vivaaerobus/app/newContentful/domain/models/TravelCards$Media;Lcom/vivaaerobus/app/newContentful/domain/models/TravelCards$Media;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCode", "getTitle", "getCallToAction", "()Lcom/vivaaerobus/app/newContentful/domain/models/TravelCards$CallToAction;", "getMedia", "()Lcom/vivaaerobus/app/newContentful/domain/models/TravelCards$Media;", "getSimplifiedImage", "getOriginCity", "getDestinationCity", "getDescription", "getDestinationAlert", "getPaxType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "CallToAction", "Media", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TravelCards {
    private final CallToAction callToAction;
    private final String code;
    private final String description;
    private final String destinationAlert;
    private final String destinationCity;
    private final String id;
    private final Media media;
    private final String originCity;
    private final String paxType;
    private final Media simplifiedImage;
    private final String title;

    /* compiled from: TravelCards.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/TravelCards$CallToAction;", "", "url", "", TypedValues.AttributesType.S_TARGET, "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getTarget", "getText", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class CallToAction {
        private final String target;
        private final String text;
        private final String url;

        public CallToAction(String str, String str2, String str3) {
            this.url = str;
            this.target = str2;
            this.text = str3;
        }

        public static /* synthetic */ CallToAction copy$default(CallToAction callToAction, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = callToAction.url;
            }
            if ((i & 2) != 0) {
                str2 = callToAction.target;
            }
            if ((i & 4) != 0) {
                str3 = callToAction.text;
            }
            return callToAction.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final CallToAction copy(String url, String target, String text) {
            return new CallToAction(url, target, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CallToAction)) {
                return false;
            }
            CallToAction callToAction = (CallToAction) other;
            return Intrinsics.areEqual(this.url, callToAction.url) && Intrinsics.areEqual(this.target, callToAction.target) && Intrinsics.areEqual(this.text, callToAction.text);
        }

        public final String getTarget() {
            return this.target;
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
            String str2 = this.target;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.text;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "CallToAction(url=" + this.url + ", target=" + this.target + ", text=" + this.text + ")";
        }
    }

    /* compiled from: TravelCards.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/TravelCards$Media;", "", "url", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getTitle", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Media {
        private final String title;
        private final String url;

        public Media(String str, String str2) {
            this.url = str;
            this.title = str2;
        }

        public static /* synthetic */ Media copy$default(Media media, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = media.url;
            }
            if ((i & 2) != 0) {
                str2 = media.title;
            }
            return media.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Media copy(String url, String title) {
            return new Media(url, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Media)) {
                return false;
            }
            Media media = (Media) other;
            return Intrinsics.areEqual(this.url, media.url) && Intrinsics.areEqual(this.title, media.title);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Media(url=" + this.url + ", title=" + this.title + ")";
        }
    }

    public TravelCards(String str, String str2, String str3, CallToAction callToAction, Media media, Media media2, String str4, String str5, String str6, String str7, String str8) {
        this.id = str;
        this.code = str2;
        this.title = str3;
        this.callToAction = callToAction;
        this.media = media;
        this.simplifiedImage = media2;
        this.originCity = str4;
        this.destinationCity = str5;
        this.description = str6;
        this.destinationAlert = str7;
        this.paxType = str8;
    }

    public static /* synthetic */ TravelCards copy$default(TravelCards travelCards, String str, String str2, String str3, CallToAction callToAction, Media media, Media media2, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = travelCards.id;
        }
        if ((i & 2) != 0) {
            str2 = travelCards.code;
        }
        if ((i & 4) != 0) {
            str3 = travelCards.title;
        }
        if ((i & 8) != 0) {
            callToAction = travelCards.callToAction;
        }
        if ((i & 16) != 0) {
            media = travelCards.media;
        }
        if ((i & 32) != 0) {
            media2 = travelCards.simplifiedImage;
        }
        if ((i & 64) != 0) {
            str4 = travelCards.originCity;
        }
        if ((i & 128) != 0) {
            str5 = travelCards.destinationCity;
        }
        if ((i & 256) != 0) {
            str6 = travelCards.description;
        }
        if ((i & 512) != 0) {
            str7 = travelCards.destinationAlert;
        }
        if ((i & 1024) != 0) {
            str8 = travelCards.paxType;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        Media media3 = media2;
        String str13 = str4;
        Media media4 = media;
        String str14 = str3;
        return travelCards.copy(str, str2, str14, callToAction, media4, media3, str13, str11, str12, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getDestinationAlert() {
        return this.destinationAlert;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPaxType() {
        return this.paxType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final CallToAction getCallToAction() {
        return this.callToAction;
    }

    /* renamed from: component5, reason: from getter */
    public final Media getMedia() {
        return this.media;
    }

    /* renamed from: component6, reason: from getter */
    public final Media getSimplifiedImage() {
        return this.simplifiedImage;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOriginCity() {
        return this.originCity;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDestinationCity() {
        return this.destinationCity;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final TravelCards copy(String id, String code, String title, CallToAction callToAction, Media media, Media simplifiedImage, String originCity, String destinationCity, String description, String destinationAlert, String paxType) {
        return new TravelCards(id, code, title, callToAction, media, simplifiedImage, originCity, destinationCity, description, destinationAlert, paxType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCards)) {
            return false;
        }
        TravelCards travelCards = (TravelCards) other;
        return Intrinsics.areEqual(this.id, travelCards.id) && Intrinsics.areEqual(this.code, travelCards.code) && Intrinsics.areEqual(this.title, travelCards.title) && Intrinsics.areEqual(this.callToAction, travelCards.callToAction) && Intrinsics.areEqual(this.media, travelCards.media) && Intrinsics.areEqual(this.simplifiedImage, travelCards.simplifiedImage) && Intrinsics.areEqual(this.originCity, travelCards.originCity) && Intrinsics.areEqual(this.destinationCity, travelCards.destinationCity) && Intrinsics.areEqual(this.description, travelCards.description) && Intrinsics.areEqual(this.destinationAlert, travelCards.destinationAlert) && Intrinsics.areEqual(this.paxType, travelCards.paxType);
    }

    public final CallToAction getCallToAction() {
        return this.callToAction;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDestinationAlert() {
        return this.destinationAlert;
    }

    public final String getDestinationCity() {
        return this.destinationCity;
    }

    public final String getId() {
        return this.id;
    }

    public final Media getMedia() {
        return this.media;
    }

    public final String getOriginCity() {
        return this.originCity;
    }

    public final String getPaxType() {
        return this.paxType;
    }

    public final Media getSimplifiedImage() {
        return this.simplifiedImage;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CallToAction callToAction = this.callToAction;
        int hashCode4 = (hashCode3 + (callToAction == null ? 0 : callToAction.hashCode())) * 31;
        Media media = this.media;
        int hashCode5 = (hashCode4 + (media == null ? 0 : media.hashCode())) * 31;
        Media media2 = this.simplifiedImage;
        int hashCode6 = (hashCode5 + (media2 == null ? 0 : media2.hashCode())) * 31;
        String str4 = this.originCity;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.destinationCity;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.destinationAlert;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.paxType;
        return hashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "TravelCards(id=" + this.id + ", code=" + this.code + ", title=" + this.title + ", callToAction=" + this.callToAction + ", media=" + this.media + ", simplifiedImage=" + this.simplifiedImage + ", originCity=" + this.originCity + ", destinationCity=" + this.destinationCity + ", description=" + this.description + ", destinationAlert=" + this.destinationAlert + ", paxType=" + this.paxType + ")";
    }
}
