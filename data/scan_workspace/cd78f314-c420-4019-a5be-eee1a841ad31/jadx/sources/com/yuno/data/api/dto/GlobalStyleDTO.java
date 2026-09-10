package com.yuno.data.api.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SDKStylesDTO.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003Jc\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006."}, d2 = {"Lcom/yuno/data/api/dto/GlobalStyleDTO;", "Landroid/os/Parcelable;", "accentColor", "", TtmlNode.ATTR_TTS_FONT_FAMILY, "primaryBackgroundColor", "primaryButtonTextColor", "primaryTextColor", "secondaryBackgroundColor", "secondaryButtonBackgroundColor", "secondaryButtonTextColor", "secondaryTextColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccentColor", "()Ljava/lang/String;", "getFontFamily", "getPrimaryBackgroundColor", "getPrimaryButtonTextColor", "getPrimaryTextColor", "getSecondaryBackgroundColor", "getSecondaryButtonBackgroundColor", "getSecondaryButtonTextColor", "getSecondaryTextColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GlobalStyleDTO implements Parcelable {
    public static final Parcelable.Creator<GlobalStyleDTO> CREATOR = new Creator();

    @SerializedName("accent_color")
    private final String accentColor;

    @SerializedName("font_family")
    private final String fontFamily;

    @SerializedName("primary_background_color")
    private final String primaryBackgroundColor;

    @SerializedName("primary_button_text_color")
    private final String primaryButtonTextColor;

    @SerializedName("primary_text_color")
    private final String primaryTextColor;

    @SerializedName("secondary_background_color")
    private final String secondaryBackgroundColor;

    @SerializedName("secondary_button_background_color")
    private final String secondaryButtonBackgroundColor;

    @SerializedName("secondary_button_text_color")
    private final String secondaryButtonTextColor;

    @SerializedName("secondary_text_color")
    private final String secondaryTextColor;

    /* compiled from: SDKStylesDTO.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<GlobalStyleDTO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GlobalStyleDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GlobalStyleDTO(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GlobalStyleDTO[] newArray(int i) {
            return new GlobalStyleDTO[i];
        }
    }

    public GlobalStyleDTO(String accentColor, String fontFamily, String primaryBackgroundColor, String primaryButtonTextColor, String primaryTextColor, String secondaryBackgroundColor, String secondaryButtonBackgroundColor, String secondaryButtonTextColor, String secondaryTextColor) {
        Intrinsics.checkNotNullParameter(accentColor, "accentColor");
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(primaryBackgroundColor, "primaryBackgroundColor");
        Intrinsics.checkNotNullParameter(primaryButtonTextColor, "primaryButtonTextColor");
        Intrinsics.checkNotNullParameter(primaryTextColor, "primaryTextColor");
        Intrinsics.checkNotNullParameter(secondaryBackgroundColor, "secondaryBackgroundColor");
        Intrinsics.checkNotNullParameter(secondaryButtonBackgroundColor, "secondaryButtonBackgroundColor");
        Intrinsics.checkNotNullParameter(secondaryButtonTextColor, "secondaryButtonTextColor");
        Intrinsics.checkNotNullParameter(secondaryTextColor, "secondaryTextColor");
        this.accentColor = accentColor;
        this.fontFamily = fontFamily;
        this.primaryBackgroundColor = primaryBackgroundColor;
        this.primaryButtonTextColor = primaryButtonTextColor;
        this.primaryTextColor = primaryTextColor;
        this.secondaryBackgroundColor = secondaryBackgroundColor;
        this.secondaryButtonBackgroundColor = secondaryButtonBackgroundColor;
        this.secondaryButtonTextColor = secondaryButtonTextColor;
        this.secondaryTextColor = secondaryTextColor;
    }

    public static /* synthetic */ GlobalStyleDTO copy$default(GlobalStyleDTO globalStyleDTO, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = globalStyleDTO.accentColor;
        }
        if ((i & 2) != 0) {
            str2 = globalStyleDTO.fontFamily;
        }
        if ((i & 4) != 0) {
            str3 = globalStyleDTO.primaryBackgroundColor;
        }
        if ((i & 8) != 0) {
            str4 = globalStyleDTO.primaryButtonTextColor;
        }
        if ((i & 16) != 0) {
            str5 = globalStyleDTO.primaryTextColor;
        }
        if ((i & 32) != 0) {
            str6 = globalStyleDTO.secondaryBackgroundColor;
        }
        if ((i & 64) != 0) {
            str7 = globalStyleDTO.secondaryButtonBackgroundColor;
        }
        if ((i & 128) != 0) {
            str8 = globalStyleDTO.secondaryButtonTextColor;
        }
        if ((i & 256) != 0) {
            str9 = globalStyleDTO.secondaryTextColor;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return globalStyleDTO.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccentColor() {
        return this.accentColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPrimaryBackgroundColor() {
        return this.primaryBackgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPrimaryButtonTextColor() {
        return this.primaryButtonTextColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPrimaryTextColor() {
        return this.primaryTextColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSecondaryBackgroundColor() {
        return this.secondaryBackgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSecondaryButtonBackgroundColor() {
        return this.secondaryButtonBackgroundColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSecondaryButtonTextColor() {
        return this.secondaryButtonTextColor;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSecondaryTextColor() {
        return this.secondaryTextColor;
    }

    public final GlobalStyleDTO copy(String accentColor, String fontFamily, String primaryBackgroundColor, String primaryButtonTextColor, String primaryTextColor, String secondaryBackgroundColor, String secondaryButtonBackgroundColor, String secondaryButtonTextColor, String secondaryTextColor) {
        Intrinsics.checkNotNullParameter(accentColor, "accentColor");
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(primaryBackgroundColor, "primaryBackgroundColor");
        Intrinsics.checkNotNullParameter(primaryButtonTextColor, "primaryButtonTextColor");
        Intrinsics.checkNotNullParameter(primaryTextColor, "primaryTextColor");
        Intrinsics.checkNotNullParameter(secondaryBackgroundColor, "secondaryBackgroundColor");
        Intrinsics.checkNotNullParameter(secondaryButtonBackgroundColor, "secondaryButtonBackgroundColor");
        Intrinsics.checkNotNullParameter(secondaryButtonTextColor, "secondaryButtonTextColor");
        Intrinsics.checkNotNullParameter(secondaryTextColor, "secondaryTextColor");
        return new GlobalStyleDTO(accentColor, fontFamily, primaryBackgroundColor, primaryButtonTextColor, primaryTextColor, secondaryBackgroundColor, secondaryButtonBackgroundColor, secondaryButtonTextColor, secondaryTextColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalStyleDTO)) {
            return false;
        }
        GlobalStyleDTO globalStyleDTO = (GlobalStyleDTO) other;
        return Intrinsics.areEqual(this.accentColor, globalStyleDTO.accentColor) && Intrinsics.areEqual(this.fontFamily, globalStyleDTO.fontFamily) && Intrinsics.areEqual(this.primaryBackgroundColor, globalStyleDTO.primaryBackgroundColor) && Intrinsics.areEqual(this.primaryButtonTextColor, globalStyleDTO.primaryButtonTextColor) && Intrinsics.areEqual(this.primaryTextColor, globalStyleDTO.primaryTextColor) && Intrinsics.areEqual(this.secondaryBackgroundColor, globalStyleDTO.secondaryBackgroundColor) && Intrinsics.areEqual(this.secondaryButtonBackgroundColor, globalStyleDTO.secondaryButtonBackgroundColor) && Intrinsics.areEqual(this.secondaryButtonTextColor, globalStyleDTO.secondaryButtonTextColor) && Intrinsics.areEqual(this.secondaryTextColor, globalStyleDTO.secondaryTextColor);
    }

    public final String getAccentColor() {
        return this.accentColor;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final String getPrimaryBackgroundColor() {
        return this.primaryBackgroundColor;
    }

    public final String getPrimaryButtonTextColor() {
        return this.primaryButtonTextColor;
    }

    public final String getPrimaryTextColor() {
        return this.primaryTextColor;
    }

    public final String getSecondaryBackgroundColor() {
        return this.secondaryBackgroundColor;
    }

    public final String getSecondaryButtonBackgroundColor() {
        return this.secondaryButtonBackgroundColor;
    }

    public final String getSecondaryButtonTextColor() {
        return this.secondaryButtonTextColor;
    }

    public final String getSecondaryTextColor() {
        return this.secondaryTextColor;
    }

    public int hashCode() {
        return (((((((((((((((this.accentColor.hashCode() * 31) + this.fontFamily.hashCode()) * 31) + this.primaryBackgroundColor.hashCode()) * 31) + this.primaryButtonTextColor.hashCode()) * 31) + this.primaryTextColor.hashCode()) * 31) + this.secondaryBackgroundColor.hashCode()) * 31) + this.secondaryButtonBackgroundColor.hashCode()) * 31) + this.secondaryButtonTextColor.hashCode()) * 31) + this.secondaryTextColor.hashCode();
    }

    public String toString() {
        return "GlobalStyleDTO(accentColor=" + this.accentColor + ", fontFamily=" + this.fontFamily + ", primaryBackgroundColor=" + this.primaryBackgroundColor + ", primaryButtonTextColor=" + this.primaryButtonTextColor + ", primaryTextColor=" + this.primaryTextColor + ", secondaryBackgroundColor=" + this.secondaryBackgroundColor + ", secondaryButtonBackgroundColor=" + this.secondaryButtonBackgroundColor + ", secondaryButtonTextColor=" + this.secondaryButtonTextColor + ", secondaryTextColor=" + this.secondaryTextColor + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.accentColor);
        parcel.writeString(this.fontFamily);
        parcel.writeString(this.primaryBackgroundColor);
        parcel.writeString(this.primaryButtonTextColor);
        parcel.writeString(this.primaryTextColor);
        parcel.writeString(this.secondaryBackgroundColor);
        parcel.writeString(this.secondaryButtonBackgroundColor);
        parcel.writeString(this.secondaryButtonTextColor);
        parcel.writeString(this.secondaryTextColor);
    }
}
