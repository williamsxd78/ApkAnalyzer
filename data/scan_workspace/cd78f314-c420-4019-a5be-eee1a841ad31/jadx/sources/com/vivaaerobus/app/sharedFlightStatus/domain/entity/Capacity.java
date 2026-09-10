package com.vivaaerobus.app.sharedFlightStatus.domain.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Capacity.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/vivaaerobus/app/sharedFlightStatus/domain/entity/Capacity;", "Landroid/os/Parcelable;", "availableSeatsCount", "", "totalSeatsCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAvailableSeatsCount", "()Ljava/lang/String;", "getTotalSeatsCount", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sharedFlightStatus_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Capacity implements Parcelable {
    public static final Parcelable.Creator<Capacity> CREATOR = new Creator();
    private final String availableSeatsCount;
    private final String totalSeatsCount;

    /* compiled from: Capacity.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Capacity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Capacity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Capacity(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Capacity[] newArray(int i) {
            return new Capacity[i];
        }
    }

    public Capacity(String availableSeatsCount, String totalSeatsCount) {
        Intrinsics.checkNotNullParameter(availableSeatsCount, "availableSeatsCount");
        Intrinsics.checkNotNullParameter(totalSeatsCount, "totalSeatsCount");
        this.availableSeatsCount = availableSeatsCount;
        this.totalSeatsCount = totalSeatsCount;
    }

    public static /* synthetic */ Capacity copy$default(Capacity capacity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = capacity.availableSeatsCount;
        }
        if ((i & 2) != 0) {
            str2 = capacity.totalSeatsCount;
        }
        return capacity.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAvailableSeatsCount() {
        return this.availableSeatsCount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTotalSeatsCount() {
        return this.totalSeatsCount;
    }

    public final Capacity copy(String availableSeatsCount, String totalSeatsCount) {
        Intrinsics.checkNotNullParameter(availableSeatsCount, "availableSeatsCount");
        Intrinsics.checkNotNullParameter(totalSeatsCount, "totalSeatsCount");
        return new Capacity(availableSeatsCount, totalSeatsCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Capacity)) {
            return false;
        }
        Capacity capacity = (Capacity) other;
        return Intrinsics.areEqual(this.availableSeatsCount, capacity.availableSeatsCount) && Intrinsics.areEqual(this.totalSeatsCount, capacity.totalSeatsCount);
    }

    public final String getAvailableSeatsCount() {
        return this.availableSeatsCount;
    }

    public final String getTotalSeatsCount() {
        return this.totalSeatsCount;
    }

    public int hashCode() {
        return (this.availableSeatsCount.hashCode() * 31) + this.totalSeatsCount.hashCode();
    }

    public String toString() {
        return "Capacity(availableSeatsCount=" + this.availableSeatsCount + ", totalSeatsCount=" + this.totalSeatsCount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.availableSeatsCount);
        dest.writeString(this.totalSeatsCount);
    }
}
