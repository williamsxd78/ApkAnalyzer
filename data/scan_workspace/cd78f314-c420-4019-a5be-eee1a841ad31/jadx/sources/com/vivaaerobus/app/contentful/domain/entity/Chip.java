package com.vivaaerobus.app.contentful.domain.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Settings.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/vivaaerobus/app/contentful/domain/entity/Chip;", "Landroid/os/Parcelable;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "textColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getTextColor", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Chip implements Parcelable {
    public static final Parcelable.Creator<Chip> CREATOR = new Creator();
    private final String backgroundColor;
    private final String textColor;

    /* compiled from: Settings.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Chip> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Chip createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Chip(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Chip[] newArray(int i) {
            return new Chip[i];
        }
    }

    public Chip(String str, String str2) {
        this.backgroundColor = str;
        this.textColor = str2;
    }

    public static /* synthetic */ Chip copy$default(Chip chip, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chip.backgroundColor;
        }
        if ((i & 2) != 0) {
            str2 = chip.textColor;
        }
        return chip.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    public final Chip copy(String backgroundColor, String textColor) {
        return new Chip(backgroundColor, textColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Chip)) {
            return false;
        }
        Chip chip = (Chip) other;
        return Intrinsics.areEqual(this.backgroundColor, chip.backgroundColor) && Intrinsics.areEqual(this.textColor, chip.textColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.textColor;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Chip(backgroundColor=" + this.backgroundColor + ", textColor=" + this.textColor + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.backgroundColor);
        dest.writeString(this.textColor);
    }
}
