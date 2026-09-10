package com.vivaaerobus.app.tripDetails.presentation.accrualDoters.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PassengerPointsView.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015¨\u0006!"}, d2 = {"Lcom/vivaaerobus/app/tripDetails/presentation/accrualDoters/model/PassengerPointsView;", "", "name", "", "levelIcon", "", "pointsFormatted", "points", "", "isTitular", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JZ)V", "getName", "()Ljava/lang/String;", "getLevelIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPointsFormatted", "getPoints", "()J", "()Z", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JZ)Lcom/vivaaerobus/app/tripDetails/presentation/accrualDoters/model/PassengerPointsView;", "equals", "other", "hashCode", "toString", "tripDetails_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PassengerPointsView {
    public static final int $stable = 0;
    private final boolean isTitular;
    private final Integer levelIcon;
    private final String name;
    private final long points;
    private final String pointsFormatted;

    public PassengerPointsView(String name, Integer num, String pointsFormatted, long j, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pointsFormatted, "pointsFormatted");
        this.name = name;
        this.levelIcon = num;
        this.pointsFormatted = pointsFormatted;
        this.points = j;
        this.isTitular = z;
    }

    public static /* synthetic */ PassengerPointsView copy$default(PassengerPointsView passengerPointsView, String str, Integer num, String str2, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passengerPointsView.name;
        }
        if ((i & 2) != 0) {
            num = passengerPointsView.levelIcon;
        }
        if ((i & 4) != 0) {
            str2 = passengerPointsView.pointsFormatted;
        }
        if ((i & 8) != 0) {
            j = passengerPointsView.points;
        }
        if ((i & 16) != 0) {
            z = passengerPointsView.isTitular;
        }
        boolean z2 = z;
        String str3 = str2;
        return passengerPointsView.copy(str, num, str3, j, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getLevelIcon() {
        return this.levelIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPointsFormatted() {
        return this.pointsFormatted;
    }

    /* renamed from: component4, reason: from getter */
    public final long getPoints() {
        return this.points;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsTitular() {
        return this.isTitular;
    }

    public final PassengerPointsView copy(String name, Integer levelIcon, String pointsFormatted, long points, boolean isTitular) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pointsFormatted, "pointsFormatted");
        return new PassengerPointsView(name, levelIcon, pointsFormatted, points, isTitular);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengerPointsView)) {
            return false;
        }
        PassengerPointsView passengerPointsView = (PassengerPointsView) other;
        return Intrinsics.areEqual(this.name, passengerPointsView.name) && Intrinsics.areEqual(this.levelIcon, passengerPointsView.levelIcon) && Intrinsics.areEqual(this.pointsFormatted, passengerPointsView.pointsFormatted) && this.points == passengerPointsView.points && this.isTitular == passengerPointsView.isTitular;
    }

    public final Integer getLevelIcon() {
        return this.levelIcon;
    }

    public final String getName() {
        return this.name;
    }

    public final long getPoints() {
        return this.points;
    }

    public final String getPointsFormatted() {
        return this.pointsFormatted;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Integer num = this.levelIcon;
        return ((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.pointsFormatted.hashCode()) * 31) + Long.hashCode(this.points)) * 31) + Boolean.hashCode(this.isTitular);
    }

    public final boolean isTitular() {
        return this.isTitular;
    }

    public String toString() {
        return "PassengerPointsView(name=" + this.name + ", levelIcon=" + this.levelIcon + ", pointsFormatted=" + this.pointsFormatted + ", points=" + this.points + ", isTitular=" + this.isTitular + ")";
    }
}
