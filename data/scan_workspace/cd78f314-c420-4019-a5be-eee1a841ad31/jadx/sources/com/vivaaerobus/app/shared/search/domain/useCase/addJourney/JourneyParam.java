package com.vivaaerobus.app.shared.search.domain.useCase.addJourney;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddJourneyParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/vivaaerobus/app/shared/search/domain/useCase/addJourney/JourneyParam;", "", "journeyKey", "", "fareKey", "originStationCode", "destinationStationCode", "fareSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getJourneyKey", "()Ljava/lang/String;", "getFareKey", "getOriginStationCode", "getDestinationStationCode", "getFareSource", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "search_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class JourneyParam {
    private final String destinationStationCode;
    private final String fareKey;
    private final String fareSource;
    private final String journeyKey;
    private final String originStationCode;

    public JourneyParam(String journeyKey, String fareKey, String originStationCode, String destinationStationCode, String fareSource) {
        Intrinsics.checkNotNullParameter(journeyKey, "journeyKey");
        Intrinsics.checkNotNullParameter(fareKey, "fareKey");
        Intrinsics.checkNotNullParameter(originStationCode, "originStationCode");
        Intrinsics.checkNotNullParameter(destinationStationCode, "destinationStationCode");
        Intrinsics.checkNotNullParameter(fareSource, "fareSource");
        this.journeyKey = journeyKey;
        this.fareKey = fareKey;
        this.originStationCode = originStationCode;
        this.destinationStationCode = destinationStationCode;
        this.fareSource = fareSource;
    }

    public static /* synthetic */ JourneyParam copy$default(JourneyParam journeyParam, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = journeyParam.journeyKey;
        }
        if ((i & 2) != 0) {
            str2 = journeyParam.fareKey;
        }
        if ((i & 4) != 0) {
            str3 = journeyParam.originStationCode;
        }
        if ((i & 8) != 0) {
            str4 = journeyParam.destinationStationCode;
        }
        if ((i & 16) != 0) {
            str5 = journeyParam.fareSource;
        }
        String str6 = str5;
        String str7 = str3;
        return journeyParam.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getJourneyKey() {
        return this.journeyKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFareKey() {
        return this.fareKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOriginStationCode() {
        return this.originStationCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDestinationStationCode() {
        return this.destinationStationCode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFareSource() {
        return this.fareSource;
    }

    public final JourneyParam copy(String journeyKey, String fareKey, String originStationCode, String destinationStationCode, String fareSource) {
        Intrinsics.checkNotNullParameter(journeyKey, "journeyKey");
        Intrinsics.checkNotNullParameter(fareKey, "fareKey");
        Intrinsics.checkNotNullParameter(originStationCode, "originStationCode");
        Intrinsics.checkNotNullParameter(destinationStationCode, "destinationStationCode");
        Intrinsics.checkNotNullParameter(fareSource, "fareSource");
        return new JourneyParam(journeyKey, fareKey, originStationCode, destinationStationCode, fareSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JourneyParam)) {
            return false;
        }
        JourneyParam journeyParam = (JourneyParam) other;
        return Intrinsics.areEqual(this.journeyKey, journeyParam.journeyKey) && Intrinsics.areEqual(this.fareKey, journeyParam.fareKey) && Intrinsics.areEqual(this.originStationCode, journeyParam.originStationCode) && Intrinsics.areEqual(this.destinationStationCode, journeyParam.destinationStationCode) && Intrinsics.areEqual(this.fareSource, journeyParam.fareSource);
    }

    public final String getDestinationStationCode() {
        return this.destinationStationCode;
    }

    public final String getFareKey() {
        return this.fareKey;
    }

    public final String getFareSource() {
        return this.fareSource;
    }

    public final String getJourneyKey() {
        return this.journeyKey;
    }

    public final String getOriginStationCode() {
        return this.originStationCode;
    }

    public int hashCode() {
        return (((((((this.journeyKey.hashCode() * 31) + this.fareKey.hashCode()) * 31) + this.originStationCode.hashCode()) * 31) + this.destinationStationCode.hashCode()) * 31) + this.fareSource.hashCode();
    }

    public String toString() {
        return "JourneyParam(journeyKey=" + this.journeyKey + ", fareKey=" + this.fareKey + ", originStationCode=" + this.originStationCode + ", destinationStationCode=" + this.destinationStationCode + ", fareSource=" + this.fareSource + ")";
    }
}
