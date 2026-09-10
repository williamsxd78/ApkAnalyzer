package com.vivaaerobus.app.newContentful.domain.models;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TripEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0000HÆ\u0003Jg\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0000HÆ\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020'HÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/TripEvent;", "", "code", "", "eventName", "eventShortName", "cityName", "venueName", "dateLabelName", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "appImage", "linkedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vivaaerobus/app/newContentful/domain/models/TripEvent;)V", "getCode", "()Ljava/lang/String;", "getEventName", "getEventShortName", "getCityName", "getVenueName", "getDateLabelName", "getBackgroundColor", "getAppImage", "getLinkedEvent", "()Lcom/vivaaerobus/app/newContentful/domain/models/TripEvent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TripEvent {
    private final String appImage;
    private final String backgroundColor;
    private final String cityName;
    private final String code;
    private final String dateLabelName;
    private final String eventName;
    private final String eventShortName;
    private final TripEvent linkedEvent;
    private final String venueName;

    public TripEvent(String code, String eventName, String eventShortName, String cityName, String venueName, String dateLabelName, String str, String appImage, TripEvent tripEvent) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventShortName, "eventShortName");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(venueName, "venueName");
        Intrinsics.checkNotNullParameter(dateLabelName, "dateLabelName");
        Intrinsics.checkNotNullParameter(appImage, "appImage");
        this.code = code;
        this.eventName = eventName;
        this.eventShortName = eventShortName;
        this.cityName = cityName;
        this.venueName = venueName;
        this.dateLabelName = dateLabelName;
        this.backgroundColor = str;
        this.appImage = appImage;
        this.linkedEvent = tripEvent;
    }

    public static /* synthetic */ TripEvent copy$default(TripEvent tripEvent, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, TripEvent tripEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tripEvent.code;
        }
        if ((i & 2) != 0) {
            str2 = tripEvent.eventName;
        }
        if ((i & 4) != 0) {
            str3 = tripEvent.eventShortName;
        }
        if ((i & 8) != 0) {
            str4 = tripEvent.cityName;
        }
        if ((i & 16) != 0) {
            str5 = tripEvent.venueName;
        }
        if ((i & 32) != 0) {
            str6 = tripEvent.dateLabelName;
        }
        if ((i & 64) != 0) {
            str7 = tripEvent.backgroundColor;
        }
        if ((i & 128) != 0) {
            str8 = tripEvent.appImage;
        }
        if ((i & 256) != 0) {
            tripEvent2 = tripEvent.linkedEvent;
        }
        String str9 = str8;
        TripEvent tripEvent3 = tripEvent2;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return tripEvent.copy(str, str2, str13, str4, str12, str10, str11, str9, tripEvent3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEventShortName() {
        return this.eventShortName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCityName() {
        return this.cityName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getVenueName() {
        return this.venueName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDateLabelName() {
        return this.dateLabelName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAppImage() {
        return this.appImage;
    }

    /* renamed from: component9, reason: from getter */
    public final TripEvent getLinkedEvent() {
        return this.linkedEvent;
    }

    public final TripEvent copy(String code, String eventName, String eventShortName, String cityName, String venueName, String dateLabelName, String backgroundColor, String appImage, TripEvent linkedEvent) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventShortName, "eventShortName");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(venueName, "venueName");
        Intrinsics.checkNotNullParameter(dateLabelName, "dateLabelName");
        Intrinsics.checkNotNullParameter(appImage, "appImage");
        return new TripEvent(code, eventName, eventShortName, cityName, venueName, dateLabelName, backgroundColor, appImage, linkedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TripEvent)) {
            return false;
        }
        TripEvent tripEvent = (TripEvent) other;
        return Intrinsics.areEqual(this.code, tripEvent.code) && Intrinsics.areEqual(this.eventName, tripEvent.eventName) && Intrinsics.areEqual(this.eventShortName, tripEvent.eventShortName) && Intrinsics.areEqual(this.cityName, tripEvent.cityName) && Intrinsics.areEqual(this.venueName, tripEvent.venueName) && Intrinsics.areEqual(this.dateLabelName, tripEvent.dateLabelName) && Intrinsics.areEqual(this.backgroundColor, tripEvent.backgroundColor) && Intrinsics.areEqual(this.appImage, tripEvent.appImage) && Intrinsics.areEqual(this.linkedEvent, tripEvent.linkedEvent);
    }

    public final String getAppImage() {
        return this.appImage;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getCityName() {
        return this.cityName;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDateLabelName() {
        return this.dateLabelName;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getEventShortName() {
        return this.eventShortName;
    }

    public final TripEvent getLinkedEvent() {
        return this.linkedEvent;
    }

    public final String getVenueName() {
        return this.venueName;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.code.hashCode() * 31) + this.eventName.hashCode()) * 31) + this.eventShortName.hashCode()) * 31) + this.cityName.hashCode()) * 31) + this.venueName.hashCode()) * 31) + this.dateLabelName.hashCode()) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.appImage.hashCode()) * 31;
        TripEvent tripEvent = this.linkedEvent;
        return hashCode2 + (tripEvent != null ? tripEvent.hashCode() : 0);
    }

    public String toString() {
        return "TripEvent(code=" + this.code + ", eventName=" + this.eventName + ", eventShortName=" + this.eventShortName + ", cityName=" + this.cityName + ", venueName=" + this.venueName + ", dateLabelName=" + this.dateLabelName + ", backgroundColor=" + this.backgroundColor + ", appImage=" + this.appImage + ", linkedEvent=" + this.linkedEvent + ")";
    }
}
