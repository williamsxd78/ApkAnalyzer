package com.vivaaerobus.app.tripDetails.presentation.socialShare.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SocialShareSegment.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/vivaaerobus/app/tripDetails/presentation/socialShare/model/SocialShareSegment;", "", "originCode", "", "originName", "destinationCode", "destinationName", "dateFormatted", "journeyKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOriginCode", "()Ljava/lang/String;", "getOriginName", "getDestinationCode", "getDestinationName", "getDateFormatted", "getJourneyKey", "component1", "component2", "component3", "component4", "component5", "component6", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "tripDetails_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SocialShareSegment {
    public static final int $stable = 0;
    private final String dateFormatted;
    private final String destinationCode;
    private final String destinationName;
    private final String journeyKey;
    private final String originCode;
    private final String originName;

    public SocialShareSegment(String originCode, String originName, String destinationCode, String destinationName, String dateFormatted, String journeyKey) {
        Intrinsics.checkNotNullParameter(originCode, "originCode");
        Intrinsics.checkNotNullParameter(originName, "originName");
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(destinationName, "destinationName");
        Intrinsics.checkNotNullParameter(dateFormatted, "dateFormatted");
        Intrinsics.checkNotNullParameter(journeyKey, "journeyKey");
        this.originCode = originCode;
        this.originName = originName;
        this.destinationCode = destinationCode;
        this.destinationName = destinationName;
        this.dateFormatted = dateFormatted;
        this.journeyKey = journeyKey;
    }

    public static /* synthetic */ SocialShareSegment copy$default(SocialShareSegment socialShareSegment, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = socialShareSegment.originCode;
        }
        if ((i & 2) != 0) {
            str2 = socialShareSegment.originName;
        }
        if ((i & 4) != 0) {
            str3 = socialShareSegment.destinationCode;
        }
        if ((i & 8) != 0) {
            str4 = socialShareSegment.destinationName;
        }
        if ((i & 16) != 0) {
            str5 = socialShareSegment.dateFormatted;
        }
        if ((i & 32) != 0) {
            str6 = socialShareSegment.journeyKey;
        }
        String str7 = str5;
        String str8 = str6;
        return socialShareSegment.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOriginCode() {
        return this.originCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOriginName() {
        return this.originName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDestinationCode() {
        return this.destinationCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDestinationName() {
        return this.destinationName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDateFormatted() {
        return this.dateFormatted;
    }

    /* renamed from: component6, reason: from getter */
    public final String getJourneyKey() {
        return this.journeyKey;
    }

    public final SocialShareSegment copy(String originCode, String originName, String destinationCode, String destinationName, String dateFormatted, String journeyKey) {
        Intrinsics.checkNotNullParameter(originCode, "originCode");
        Intrinsics.checkNotNullParameter(originName, "originName");
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(destinationName, "destinationName");
        Intrinsics.checkNotNullParameter(dateFormatted, "dateFormatted");
        Intrinsics.checkNotNullParameter(journeyKey, "journeyKey");
        return new SocialShareSegment(originCode, originName, destinationCode, destinationName, dateFormatted, journeyKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialShareSegment)) {
            return false;
        }
        SocialShareSegment socialShareSegment = (SocialShareSegment) other;
        return Intrinsics.areEqual(this.originCode, socialShareSegment.originCode) && Intrinsics.areEqual(this.originName, socialShareSegment.originName) && Intrinsics.areEqual(this.destinationCode, socialShareSegment.destinationCode) && Intrinsics.areEqual(this.destinationName, socialShareSegment.destinationName) && Intrinsics.areEqual(this.dateFormatted, socialShareSegment.dateFormatted) && Intrinsics.areEqual(this.journeyKey, socialShareSegment.journeyKey);
    }

    public final String getDateFormatted() {
        return this.dateFormatted;
    }

    public final String getDestinationCode() {
        return this.destinationCode;
    }

    public final String getDestinationName() {
        return this.destinationName;
    }

    public final String getJourneyKey() {
        return this.journeyKey;
    }

    public final String getOriginCode() {
        return this.originCode;
    }

    public final String getOriginName() {
        return this.originName;
    }

    public int hashCode() {
        return (((((((((this.originCode.hashCode() * 31) + this.originName.hashCode()) * 31) + this.destinationCode.hashCode()) * 31) + this.destinationName.hashCode()) * 31) + this.dateFormatted.hashCode()) * 31) + this.journeyKey.hashCode();
    }

    public String toString() {
        return "SocialShareSegment(originCode=" + this.originCode + ", originName=" + this.originName + ", destinationCode=" + this.destinationCode + ", destinationName=" + this.destinationName + ", dateFormatted=" + this.dateFormatted + ", journeyKey=" + this.journeyKey + ")";
    }
}
