package com.yuno.data.api.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.provider.FontsContractCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SDKStylesDTO.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006#"}, d2 = {"Lcom/yuno/data/api/dto/HeaderStyleDTO;", "Landroid/os/Parcelable;", TtmlNode.ATTR_TTS_FONT_SIZE, "", TtmlNode.ATTR_TTS_FONT_WEIGHT, "logoBorderColor", "", "logoBorderSize", "logoCornerRadius", "(IILjava/lang/String;II)V", "getFontSize", "()I", "getFontWeight", "getLogoBorderColor", "()Ljava/lang/String;", "getLogoBorderSize", "getLogoCornerRadius", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HeaderStyleDTO implements Parcelable {
    public static final Parcelable.Creator<HeaderStyleDTO> CREATOR = new Creator();

    @SerializedName("font_size")
    private final int fontSize;

    @SerializedName(FontsContractCompat.Columns.WEIGHT)
    private final int fontWeight;

    @SerializedName("logo_border_color")
    private final String logoBorderColor;

    @SerializedName("logo_border_size")
    private final int logoBorderSize;

    @SerializedName("logo_corner_radius")
    private final int logoCornerRadius;

    /* compiled from: SDKStylesDTO.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<HeaderStyleDTO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HeaderStyleDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HeaderStyleDTO(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HeaderStyleDTO[] newArray(int i) {
            return new HeaderStyleDTO[i];
        }
    }

    public HeaderStyleDTO(int i, int i2, String logoBorderColor, int i3, int i4) {
        Intrinsics.checkNotNullParameter(logoBorderColor, "logoBorderColor");
        this.fontSize = i;
        this.fontWeight = i2;
        this.logoBorderColor = logoBorderColor;
        this.logoBorderSize = i3;
        this.logoCornerRadius = i4;
    }

    public static /* synthetic */ HeaderStyleDTO copy$default(HeaderStyleDTO headerStyleDTO, int i, int i2, String str, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = headerStyleDTO.fontSize;
        }
        if ((i5 & 2) != 0) {
            i2 = headerStyleDTO.fontWeight;
        }
        if ((i5 & 4) != 0) {
            str = headerStyleDTO.logoBorderColor;
        }
        if ((i5 & 8) != 0) {
            i3 = headerStyleDTO.logoBorderSize;
        }
        if ((i5 & 16) != 0) {
            i4 = headerStyleDTO.logoCornerRadius;
        }
        int i6 = i4;
        String str2 = str;
        return headerStyleDTO.copy(i, i2, str2, i3, i6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFontSize() {
        return this.fontSize;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLogoBorderColor() {
        return this.logoBorderColor;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLogoBorderSize() {
        return this.logoBorderSize;
    }

    /* renamed from: component5, reason: from getter */
    public final int getLogoCornerRadius() {
        return this.logoCornerRadius;
    }

    public final HeaderStyleDTO copy(int fontSize, int fontWeight, String logoBorderColor, int logoBorderSize, int logoCornerRadius) {
        Intrinsics.checkNotNullParameter(logoBorderColor, "logoBorderColor");
        return new HeaderStyleDTO(fontSize, fontWeight, logoBorderColor, logoBorderSize, logoCornerRadius);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderStyleDTO)) {
            return false;
        }
        HeaderStyleDTO headerStyleDTO = (HeaderStyleDTO) other;
        return this.fontSize == headerStyleDTO.fontSize && this.fontWeight == headerStyleDTO.fontWeight && Intrinsics.areEqual(this.logoBorderColor, headerStyleDTO.logoBorderColor) && this.logoBorderSize == headerStyleDTO.logoBorderSize && this.logoCornerRadius == headerStyleDTO.logoCornerRadius;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final int getFontWeight() {
        return this.fontWeight;
    }

    public final String getLogoBorderColor() {
        return this.logoBorderColor;
    }

    public final int getLogoBorderSize() {
        return this.logoBorderSize;
    }

    public final int getLogoCornerRadius() {
        return this.logoCornerRadius;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.fontSize) * 31) + Integer.hashCode(this.fontWeight)) * 31) + this.logoBorderColor.hashCode()) * 31) + Integer.hashCode(this.logoBorderSize)) * 31) + Integer.hashCode(this.logoCornerRadius);
    }

    public String toString() {
        return "HeaderStyleDTO(fontSize=" + this.fontSize + ", fontWeight=" + this.fontWeight + ", logoBorderColor=" + this.logoBorderColor + ", logoBorderSize=" + this.logoBorderSize + ", logoCornerRadius=" + this.logoCornerRadius + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.fontSize);
        parcel.writeInt(this.fontWeight);
        parcel.writeString(this.logoBorderColor);
        parcel.writeInt(this.logoBorderSize);
        parcel.writeInt(this.logoCornerRadius);
    }
}
