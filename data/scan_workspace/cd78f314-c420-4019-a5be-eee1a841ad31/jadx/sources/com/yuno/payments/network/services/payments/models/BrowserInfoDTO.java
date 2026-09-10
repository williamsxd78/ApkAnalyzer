package com.yuno.payments.network.services.payments.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodsDTO.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0092\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010*J\t\u0010+\u001a\u00020,HÖ\u0001J\u0013\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u00067"}, d2 = {"Lcom/yuno/payments/network/services/payments/models/BrowserInfoDTO;", "Landroid/os/Parcelable;", "browserTimeDifference", "", "colorDepth", "javaEnabled", "", "screenWidth", "screenHeight", "userAgent", "language", "javascriptEnabled", "acceptBrowser", "acceptContent", "acceptHeader", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcceptBrowser", "()Ljava/lang/String;", "getAcceptContent", "getAcceptHeader", "getBrowserTimeDifference", "getColorDepth", "getJavaEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getJavascriptEnabled", "getLanguage", "getScreenHeight", "getScreenWidth", "getUserAgent", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yuno/payments/network/services/payments/models/BrowserInfoDTO;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BrowserInfoDTO implements Parcelable {
    public static final Parcelable.Creator<BrowserInfoDTO> CREATOR = new Creator();

    @SerializedName("accept_browser")
    private final String acceptBrowser;

    @SerializedName("accept_content")
    private final String acceptContent;

    @SerializedName("accept_header")
    private final String acceptHeader;

    @SerializedName("browser_time_difference")
    private final String browserTimeDifference;

    @SerializedName("color_depth")
    private final String colorDepth;

    @SerializedName("java_enabled")
    private final Boolean javaEnabled;

    @SerializedName("javascript_enabled")
    private final Boolean javascriptEnabled;

    @SerializedName("language")
    private final String language;

    @SerializedName("screen_height")
    private final String screenHeight;

    @SerializedName("screen_width")
    private final String screenWidth;

    @SerializedName("user_agent")
    private final String userAgent;

    /* compiled from: PaymentMethodsDTO.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<BrowserInfoDTO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BrowserInfoDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BrowserInfoDTO(readString, readString2, valueOf, readString3, readString4, readString5, readString6, valueOf2, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BrowserInfoDTO[] newArray(int i) {
            return new BrowserInfoDTO[i];
        }
    }

    public BrowserInfoDTO(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, String str7, String str8, String str9) {
        this.browserTimeDifference = str;
        this.colorDepth = str2;
        this.javaEnabled = bool;
        this.screenWidth = str3;
        this.screenHeight = str4;
        this.userAgent = str5;
        this.language = str6;
        this.javascriptEnabled = bool2;
        this.acceptBrowser = str7;
        this.acceptContent = str8;
        this.acceptHeader = str9;
    }

    public static /* synthetic */ BrowserInfoDTO copy$default(BrowserInfoDTO browserInfoDTO, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserInfoDTO.browserTimeDifference;
        }
        if ((i & 2) != 0) {
            str2 = browserInfoDTO.colorDepth;
        }
        if ((i & 4) != 0) {
            bool = browserInfoDTO.javaEnabled;
        }
        if ((i & 8) != 0) {
            str3 = browserInfoDTO.screenWidth;
        }
        if ((i & 16) != 0) {
            str4 = browserInfoDTO.screenHeight;
        }
        if ((i & 32) != 0) {
            str5 = browserInfoDTO.userAgent;
        }
        if ((i & 64) != 0) {
            str6 = browserInfoDTO.language;
        }
        if ((i & 128) != 0) {
            bool2 = browserInfoDTO.javascriptEnabled;
        }
        if ((i & 256) != 0) {
            str7 = browserInfoDTO.acceptBrowser;
        }
        if ((i & 512) != 0) {
            str8 = browserInfoDTO.acceptContent;
        }
        if ((i & 1024) != 0) {
            str9 = browserInfoDTO.acceptHeader;
        }
        String str10 = str8;
        String str11 = str9;
        Boolean bool3 = bool2;
        String str12 = str7;
        String str13 = str5;
        String str14 = str6;
        String str15 = str4;
        Boolean bool4 = bool;
        return browserInfoDTO.copy(str, str2, bool4, str3, str15, str13, str14, bool3, str12, str10, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBrowserTimeDifference() {
        return this.browserTimeDifference;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAcceptContent() {
        return this.acceptContent;
    }

    /* renamed from: component11, reason: from getter */
    public final String getAcceptHeader() {
        return this.acceptHeader;
    }

    /* renamed from: component2, reason: from getter */
    public final String getColorDepth() {
        return this.colorDepth;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getJavaEnabled() {
        return this.javaEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final String getScreenWidth() {
        return this.screenWidth;
    }

    /* renamed from: component5, reason: from getter */
    public final String getScreenHeight() {
        return this.screenHeight;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getJavascriptEnabled() {
        return this.javascriptEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAcceptBrowser() {
        return this.acceptBrowser;
    }

    public final BrowserInfoDTO copy(String browserTimeDifference, String colorDepth, Boolean javaEnabled, String screenWidth, String screenHeight, String userAgent, String language, Boolean javascriptEnabled, String acceptBrowser, String acceptContent, String acceptHeader) {
        return new BrowserInfoDTO(browserTimeDifference, colorDepth, javaEnabled, screenWidth, screenHeight, userAgent, language, javascriptEnabled, acceptBrowser, acceptContent, acceptHeader);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrowserInfoDTO)) {
            return false;
        }
        BrowserInfoDTO browserInfoDTO = (BrowserInfoDTO) other;
        return Intrinsics.areEqual(this.browserTimeDifference, browserInfoDTO.browserTimeDifference) && Intrinsics.areEqual(this.colorDepth, browserInfoDTO.colorDepth) && Intrinsics.areEqual(this.javaEnabled, browserInfoDTO.javaEnabled) && Intrinsics.areEqual(this.screenWidth, browserInfoDTO.screenWidth) && Intrinsics.areEqual(this.screenHeight, browserInfoDTO.screenHeight) && Intrinsics.areEqual(this.userAgent, browserInfoDTO.userAgent) && Intrinsics.areEqual(this.language, browserInfoDTO.language) && Intrinsics.areEqual(this.javascriptEnabled, browserInfoDTO.javascriptEnabled) && Intrinsics.areEqual(this.acceptBrowser, browserInfoDTO.acceptBrowser) && Intrinsics.areEqual(this.acceptContent, browserInfoDTO.acceptContent) && Intrinsics.areEqual(this.acceptHeader, browserInfoDTO.acceptHeader);
    }

    public final String getAcceptBrowser() {
        return this.acceptBrowser;
    }

    public final String getAcceptContent() {
        return this.acceptContent;
    }

    public final String getAcceptHeader() {
        return this.acceptHeader;
    }

    public final String getBrowserTimeDifference() {
        return this.browserTimeDifference;
    }

    public final String getColorDepth() {
        return this.colorDepth;
    }

    public final Boolean getJavaEnabled() {
        return this.javaEnabled;
    }

    public final Boolean getJavascriptEnabled() {
        return this.javascriptEnabled;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getScreenHeight() {
        return this.screenHeight;
    }

    public final String getScreenWidth() {
        return this.screenWidth;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        String str = this.browserTimeDifference;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.colorDepth;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.javaEnabled;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.screenWidth;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.screenHeight;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userAgent;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.language;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool2 = this.javascriptEnabled;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.acceptBrowser;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.acceptContent;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.acceptHeader;
        return hashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "BrowserInfoDTO(browserTimeDifference=" + this.browserTimeDifference + ", colorDepth=" + this.colorDepth + ", javaEnabled=" + this.javaEnabled + ", screenWidth=" + this.screenWidth + ", screenHeight=" + this.screenHeight + ", userAgent=" + this.userAgent + ", language=" + this.language + ", javascriptEnabled=" + this.javascriptEnabled + ", acceptBrowser=" + this.acceptBrowser + ", acceptContent=" + this.acceptContent + ", acceptHeader=" + this.acceptHeader + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.browserTimeDifference);
        parcel.writeString(this.colorDepth);
        Boolean bool = this.javaEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.screenWidth);
        parcel.writeString(this.screenHeight);
        parcel.writeString(this.userAgent);
        parcel.writeString(this.language);
        Boolean bool2 = this.javascriptEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.acceptBrowser);
        parcel.writeString(this.acceptContent);
        parcel.writeString(this.acceptHeader);
    }
}
