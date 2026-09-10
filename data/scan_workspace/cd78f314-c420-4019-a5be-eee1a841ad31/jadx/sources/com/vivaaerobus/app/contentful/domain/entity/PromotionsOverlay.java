package com.vivaaerobus.app.contentful.domain.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Settings.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015Jn\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020'J\u0014\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0083\u0004J\n\u0010+\u001a\u00020'HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0015¨\u00062"}, d2 = {"Lcom/vivaaerobus/app/contentful/domain/entity/PromotionsOverlay;", "Landroid/os/Parcelable;", "enabled", "", "color", "", "startY", "", "startAlpha", "midY", "midAlpha", "endY", "endAlpha", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getColor", "()Ljava/lang/String;", "getStartY", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getStartAlpha", "getMidY", "getMidAlpha", "getEndY", "getEndAlpha", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/vivaaerobus/app/contentful/domain/entity/PromotionsOverlay;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PromotionsOverlay implements Parcelable {
    public static final Parcelable.Creator<PromotionsOverlay> CREATOR = new Creator();
    private final String color;
    private final Boolean enabled;
    private final Double endAlpha;
    private final Double endY;
    private final Double midAlpha;
    private final Double midY;
    private final Double startAlpha;
    private final Double startY;

    /* compiled from: Settings.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<PromotionsOverlay> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromotionsOverlay createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PromotionsOverlay(valueOf, parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromotionsOverlay[] newArray(int i) {
            return new PromotionsOverlay[i];
        }
    }

    public PromotionsOverlay(Boolean bool, String str, Double d, Double d2, Double d3, Double d4, Double d5, Double d6) {
        this.enabled = bool;
        this.color = str;
        this.startY = d;
        this.startAlpha = d2;
        this.midY = d3;
        this.midAlpha = d4;
        this.endY = d5;
        this.endAlpha = d6;
    }

    public static /* synthetic */ PromotionsOverlay copy$default(PromotionsOverlay promotionsOverlay, Boolean bool, String str, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = promotionsOverlay.enabled;
        }
        if ((i & 2) != 0) {
            str = promotionsOverlay.color;
        }
        if ((i & 4) != 0) {
            d = promotionsOverlay.startY;
        }
        if ((i & 8) != 0) {
            d2 = promotionsOverlay.startAlpha;
        }
        if ((i & 16) != 0) {
            d3 = promotionsOverlay.midY;
        }
        if ((i & 32) != 0) {
            d4 = promotionsOverlay.midAlpha;
        }
        if ((i & 64) != 0) {
            d5 = promotionsOverlay.endY;
        }
        if ((i & 128) != 0) {
            d6 = promotionsOverlay.endAlpha;
        }
        Double d7 = d5;
        Double d8 = d6;
        Double d9 = d3;
        Double d10 = d4;
        return promotionsOverlay.copy(bool, str, d, d2, d9, d10, d7, d8);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getStartY() {
        return this.startY;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getStartAlpha() {
        return this.startAlpha;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getMidY() {
        return this.midY;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getMidAlpha() {
        return this.midAlpha;
    }

    /* renamed from: component7, reason: from getter */
    public final Double getEndY() {
        return this.endY;
    }

    /* renamed from: component8, reason: from getter */
    public final Double getEndAlpha() {
        return this.endAlpha;
    }

    public final PromotionsOverlay copy(Boolean enabled, String color, Double startY, Double startAlpha, Double midY, Double midAlpha, Double endY, Double endAlpha) {
        return new PromotionsOverlay(enabled, color, startY, startAlpha, midY, midAlpha, endY, endAlpha);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromotionsOverlay)) {
            return false;
        }
        PromotionsOverlay promotionsOverlay = (PromotionsOverlay) other;
        return Intrinsics.areEqual(this.enabled, promotionsOverlay.enabled) && Intrinsics.areEqual(this.color, promotionsOverlay.color) && Intrinsics.areEqual((Object) this.startY, (Object) promotionsOverlay.startY) && Intrinsics.areEqual((Object) this.startAlpha, (Object) promotionsOverlay.startAlpha) && Intrinsics.areEqual((Object) this.midY, (Object) promotionsOverlay.midY) && Intrinsics.areEqual((Object) this.midAlpha, (Object) promotionsOverlay.midAlpha) && Intrinsics.areEqual((Object) this.endY, (Object) promotionsOverlay.endY) && Intrinsics.areEqual((Object) this.endAlpha, (Object) promotionsOverlay.endAlpha);
    }

    public final String getColor() {
        return this.color;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Double getEndAlpha() {
        return this.endAlpha;
    }

    public final Double getEndY() {
        return this.endY;
    }

    public final Double getMidAlpha() {
        return this.midAlpha;
    }

    public final Double getMidY() {
        return this.midY;
    }

    public final Double getStartAlpha() {
        return this.startAlpha;
    }

    public final Double getStartY() {
        return this.startY;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.color;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.startY;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.startAlpha;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.midY;
        int hashCode5 = (hashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.midAlpha;
        int hashCode6 = (hashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.endY;
        int hashCode7 = (hashCode6 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.endAlpha;
        return hashCode7 + (d6 != null ? d6.hashCode() : 0);
    }

    public String toString() {
        return "PromotionsOverlay(enabled=" + this.enabled + ", color=" + this.color + ", startY=" + this.startY + ", startAlpha=" + this.startAlpha + ", midY=" + this.midY + ", midAlpha=" + this.midAlpha + ", endY=" + this.endY + ", endAlpha=" + this.endAlpha + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.enabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.color);
        Double d = this.startY;
        if (d == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d.doubleValue());
        }
        Double d2 = this.startAlpha;
        if (d2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d2.doubleValue());
        }
        Double d3 = this.midY;
        if (d3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d3.doubleValue());
        }
        Double d4 = this.midAlpha;
        if (d4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d4.doubleValue());
        }
        Double d5 = this.endY;
        if (d5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d5.doubleValue());
        }
        Double d6 = this.endAlpha;
        if (d6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d6.doubleValue());
        }
    }
}
