package com.vivaaerobus.app.components.changeJourneys.analytics;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChangeConfirmationAnalyticData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/vivaaerobus/app/components/changeJourneys/analytics/ChangeConfirmationAnalyticData;", "", "fromOrigin", "", "toOrigin", "fromDestination", "toDestination", "fromModality", "toModality", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFromOrigin", "()Ljava/lang/String;", "getToOrigin", "getFromDestination", "getToDestination", "getFromModality", "getToModality", "component1", "component2", "component3", "component4", "component5", "component6", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChangeConfirmationAnalyticData {
    public static final int $stable = 0;
    private final String fromDestination;
    private final String fromModality;
    private final String fromOrigin;
    private final String toDestination;
    private final String toModality;
    private final String toOrigin;

    public ChangeConfirmationAnalyticData(String fromOrigin, String toOrigin, String fromDestination, String toDestination, String fromModality, String toModality) {
        Intrinsics.checkNotNullParameter(fromOrigin, "fromOrigin");
        Intrinsics.checkNotNullParameter(toOrigin, "toOrigin");
        Intrinsics.checkNotNullParameter(fromDestination, "fromDestination");
        Intrinsics.checkNotNullParameter(toDestination, "toDestination");
        Intrinsics.checkNotNullParameter(fromModality, "fromModality");
        Intrinsics.checkNotNullParameter(toModality, "toModality");
        this.fromOrigin = fromOrigin;
        this.toOrigin = toOrigin;
        this.fromDestination = fromDestination;
        this.toDestination = toDestination;
        this.fromModality = fromModality;
        this.toModality = toModality;
    }

    public static /* synthetic */ ChangeConfirmationAnalyticData copy$default(ChangeConfirmationAnalyticData changeConfirmationAnalyticData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changeConfirmationAnalyticData.fromOrigin;
        }
        if ((i & 2) != 0) {
            str2 = changeConfirmationAnalyticData.toOrigin;
        }
        if ((i & 4) != 0) {
            str3 = changeConfirmationAnalyticData.fromDestination;
        }
        if ((i & 8) != 0) {
            str4 = changeConfirmationAnalyticData.toDestination;
        }
        if ((i & 16) != 0) {
            str5 = changeConfirmationAnalyticData.fromModality;
        }
        if ((i & 32) != 0) {
            str6 = changeConfirmationAnalyticData.toModality;
        }
        String str7 = str5;
        String str8 = str6;
        return changeConfirmationAnalyticData.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFromOrigin() {
        return this.fromOrigin;
    }

    /* renamed from: component2, reason: from getter */
    public final String getToOrigin() {
        return this.toOrigin;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFromDestination() {
        return this.fromDestination;
    }

    /* renamed from: component4, reason: from getter */
    public final String getToDestination() {
        return this.toDestination;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFromModality() {
        return this.fromModality;
    }

    /* renamed from: component6, reason: from getter */
    public final String getToModality() {
        return this.toModality;
    }

    public final ChangeConfirmationAnalyticData copy(String fromOrigin, String toOrigin, String fromDestination, String toDestination, String fromModality, String toModality) {
        Intrinsics.checkNotNullParameter(fromOrigin, "fromOrigin");
        Intrinsics.checkNotNullParameter(toOrigin, "toOrigin");
        Intrinsics.checkNotNullParameter(fromDestination, "fromDestination");
        Intrinsics.checkNotNullParameter(toDestination, "toDestination");
        Intrinsics.checkNotNullParameter(fromModality, "fromModality");
        Intrinsics.checkNotNullParameter(toModality, "toModality");
        return new ChangeConfirmationAnalyticData(fromOrigin, toOrigin, fromDestination, toDestination, fromModality, toModality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeConfirmationAnalyticData)) {
            return false;
        }
        ChangeConfirmationAnalyticData changeConfirmationAnalyticData = (ChangeConfirmationAnalyticData) other;
        return Intrinsics.areEqual(this.fromOrigin, changeConfirmationAnalyticData.fromOrigin) && Intrinsics.areEqual(this.toOrigin, changeConfirmationAnalyticData.toOrigin) && Intrinsics.areEqual(this.fromDestination, changeConfirmationAnalyticData.fromDestination) && Intrinsics.areEqual(this.toDestination, changeConfirmationAnalyticData.toDestination) && Intrinsics.areEqual(this.fromModality, changeConfirmationAnalyticData.fromModality) && Intrinsics.areEqual(this.toModality, changeConfirmationAnalyticData.toModality);
    }

    public final String getFromDestination() {
        return this.fromDestination;
    }

    public final String getFromModality() {
        return this.fromModality;
    }

    public final String getFromOrigin() {
        return this.fromOrigin;
    }

    public final String getToDestination() {
        return this.toDestination;
    }

    public final String getToModality() {
        return this.toModality;
    }

    public final String getToOrigin() {
        return this.toOrigin;
    }

    public int hashCode() {
        return (((((((((this.fromOrigin.hashCode() * 31) + this.toOrigin.hashCode()) * 31) + this.fromDestination.hashCode()) * 31) + this.toDestination.hashCode()) * 31) + this.fromModality.hashCode()) * 31) + this.toModality.hashCode();
    }

    public String toString() {
        return "ChangeConfirmationAnalyticData(fromOrigin=" + this.fromOrigin + ", toOrigin=" + this.toOrigin + ", fromDestination=" + this.fromDestination + ", toDestination=" + this.toDestination + ", fromModality=" + this.fromModality + ", toModality=" + this.toModality + ")";
    }
}
