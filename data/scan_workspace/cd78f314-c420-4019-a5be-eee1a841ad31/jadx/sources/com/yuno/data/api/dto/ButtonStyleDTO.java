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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006&"}, d2 = {"Lcom/yuno/data/api/dto/ButtonStyleDTO;", "Landroid/os/Parcelable;", "borderSize", "", "cornerRadius", TtmlNode.ATTR_TTS_FONT_SIZE, TtmlNode.ATTR_TTS_FONT_WEIGHT, "primaryBorderColor", "", "secondaryBorderColor", "(IIIILjava/lang/String;Ljava/lang/String;)V", "getBorderSize", "()I", "getCornerRadius", "getFontSize", "getFontWeight", "getPrimaryBorderColor", "()Ljava/lang/String;", "getSecondaryBorderColor", "component1", "component2", "component3", "component4", "component5", "component6", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ButtonStyleDTO implements Parcelable {
    public static final Parcelable.Creator<ButtonStyleDTO> CREATOR = new Creator();

    @SerializedName("border_size")
    private final int borderSize;

    @SerializedName("corner_radius")
    private final int cornerRadius;

    @SerializedName("font_size")
    private final int fontSize;

    @SerializedName(FontsContractCompat.Columns.WEIGHT)
    private final int fontWeight;

    @SerializedName("primary_border_color")
    private final String primaryBorderColor;

    @SerializedName("secondary_border_color")
    private final String secondaryBorderColor;

    /* compiled from: SDKStylesDTO.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ButtonStyleDTO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ButtonStyleDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ButtonStyleDTO(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ButtonStyleDTO[] newArray(int i) {
            return new ButtonStyleDTO[i];
        }
    }

    public ButtonStyleDTO(int i, int i2, int i3, int i4, String primaryBorderColor, String secondaryBorderColor) {
        Intrinsics.checkNotNullParameter(primaryBorderColor, "primaryBorderColor");
        Intrinsics.checkNotNullParameter(secondaryBorderColor, "secondaryBorderColor");
        this.borderSize = i;
        this.cornerRadius = i2;
        this.fontSize = i3;
        this.fontWeight = i4;
        this.primaryBorderColor = primaryBorderColor;
        this.secondaryBorderColor = secondaryBorderColor;
    }

    public static /* synthetic */ ButtonStyleDTO copy$default(ButtonStyleDTO buttonStyleDTO, int i, int i2, int i3, int i4, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = buttonStyleDTO.borderSize;
        }
        if ((i5 & 2) != 0) {
            i2 = buttonStyleDTO.cornerRadius;
        }
        if ((i5 & 4) != 0) {
            i3 = buttonStyleDTO.fontSize;
        }
        if ((i5 & 8) != 0) {
            i4 = buttonStyleDTO.fontWeight;
        }
        if ((i5 & 16) != 0) {
            str = buttonStyleDTO.primaryBorderColor;
        }
        if ((i5 & 32) != 0) {
            str2 = buttonStyleDTO.secondaryBorderColor;
        }
        String str3 = str;
        String str4 = str2;
        return buttonStyleDTO.copy(i, i2, i3, i4, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBorderSize() {
        return this.borderSize;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFontSize() {
        return this.fontSize;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPrimaryBorderColor() {
        return this.primaryBorderColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSecondaryBorderColor() {
        return this.secondaryBorderColor;
    }

    public final ButtonStyleDTO copy(int borderSize, int cornerRadius, int fontSize, int fontWeight, String primaryBorderColor, String secondaryBorderColor) {
        Intrinsics.checkNotNullParameter(primaryBorderColor, "primaryBorderColor");
        Intrinsics.checkNotNullParameter(secondaryBorderColor, "secondaryBorderColor");
        return new ButtonStyleDTO(borderSize, cornerRadius, fontSize, fontWeight, primaryBorderColor, secondaryBorderColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonStyleDTO)) {
            return false;
        }
        ButtonStyleDTO buttonStyleDTO = (ButtonStyleDTO) other;
        return this.borderSize == buttonStyleDTO.borderSize && this.cornerRadius == buttonStyleDTO.cornerRadius && this.fontSize == buttonStyleDTO.fontSize && this.fontWeight == buttonStyleDTO.fontWeight && Intrinsics.areEqual(this.primaryBorderColor, buttonStyleDTO.primaryBorderColor) && Intrinsics.areEqual(this.secondaryBorderColor, buttonStyleDTO.secondaryBorderColor);
    }

    public final int getBorderSize() {
        return this.borderSize;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final int getFontWeight() {
        return this.fontWeight;
    }

    public final String getPrimaryBorderColor() {
        return this.primaryBorderColor;
    }

    public final String getSecondaryBorderColor() {
        return this.secondaryBorderColor;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.borderSize) * 31) + Integer.hashCode(this.cornerRadius)) * 31) + Integer.hashCode(this.fontSize)) * 31) + Integer.hashCode(this.fontWeight)) * 31) + this.primaryBorderColor.hashCode()) * 31) + this.secondaryBorderColor.hashCode();
    }

    public String toString() {
        return "ButtonStyleDTO(borderSize=" + this.borderSize + ", cornerRadius=" + this.cornerRadius + ", fontSize=" + this.fontSize + ", fontWeight=" + this.fontWeight + ", primaryBorderColor=" + this.primaryBorderColor + ", secondaryBorderColor=" + this.secondaryBorderColor + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.borderSize);
        parcel.writeInt(this.cornerRadius);
        parcel.writeInt(this.fontSize);
        parcel.writeInt(this.fontWeight);
        parcel.writeString(this.primaryBorderColor);
        parcel.writeString(this.secondaryBorderColor);
    }
}
