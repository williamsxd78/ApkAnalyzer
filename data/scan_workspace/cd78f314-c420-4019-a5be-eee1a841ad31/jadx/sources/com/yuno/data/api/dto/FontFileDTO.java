package com.yuno.data.api.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SDKStylesDTO.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/yuno/data/api/dto/FontFileDTO;", "Landroid/os/Parcelable;", "weight", "", "url", "", "(DLjava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getWeight", "()D", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FontFileDTO implements Parcelable {
    public static final Parcelable.Creator<FontFileDTO> CREATOR = new Creator();

    @SerializedName("url")
    private final String url;

    @SerializedName("weight")
    private final double weight;

    /* compiled from: SDKStylesDTO.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<FontFileDTO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FontFileDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FontFileDTO(parcel.readDouble(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FontFileDTO[] newArray(int i) {
            return new FontFileDTO[i];
        }
    }

    public FontFileDTO(double d, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.weight = d;
        this.url = url;
    }

    public static /* synthetic */ FontFileDTO copy$default(FontFileDTO fontFileDTO, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = fontFileDTO.weight;
        }
        if ((i & 2) != 0) {
            str = fontFileDTO.url;
        }
        return fontFileDTO.copy(d, str);
    }

    /* renamed from: component1, reason: from getter */
    public final double getWeight() {
        return this.weight;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final FontFileDTO copy(double weight, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new FontFileDTO(weight, url);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FontFileDTO)) {
            return false;
        }
        FontFileDTO fontFileDTO = (FontFileDTO) other;
        return Double.compare(this.weight, fontFileDTO.weight) == 0 && Intrinsics.areEqual(this.url, fontFileDTO.url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final double getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (Double.hashCode(this.weight) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "FontFileDTO(weight=" + this.weight + ", url=" + this.url + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.weight);
        parcel.writeString(this.url);
    }
}
