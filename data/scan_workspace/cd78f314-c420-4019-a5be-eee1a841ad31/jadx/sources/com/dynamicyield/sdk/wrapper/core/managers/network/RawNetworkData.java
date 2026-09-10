package com.dynamicyield.sdk.wrapper.core.managers.network;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RawNetworkData.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006 "}, d2 = {"Lcom/dynamicyield/sdk/wrapper/core/managers/network/RawNetworkData;", "", "code", "", "message", "", "isSuccessful", "", TtmlNode.TAG_BODY, "payload", "sdkVersionHeader", "<init>", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "()Z", "getBody", "getPayload", "getSdkVersionHeader", "component1", "component2", "component3", "component4", "component5", "component6", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "toString", "DY-Sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RawNetworkData {
    public static final int $stable = 0;
    private final String body;
    private final int code;
    private final boolean isSuccessful;
    private final String message;
    private final String payload;
    private final String sdkVersionHeader;

    public RawNetworkData(int i, String message, boolean z, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i;
        this.message = message;
        this.isSuccessful = z;
        this.body = str;
        this.payload = str2;
        this.sdkVersionHeader = str3;
    }

    public static /* synthetic */ RawNetworkData copy$default(RawNetworkData rawNetworkData, int i, String str, boolean z, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = rawNetworkData.code;
        }
        if ((i2 & 2) != 0) {
            str = rawNetworkData.message;
        }
        if ((i2 & 4) != 0) {
            z = rawNetworkData.isSuccessful;
        }
        if ((i2 & 8) != 0) {
            str2 = rawNetworkData.body;
        }
        if ((i2 & 16) != 0) {
            str3 = rawNetworkData.payload;
        }
        if ((i2 & 32) != 0) {
            str4 = rawNetworkData.sdkVersionHeader;
        }
        String str5 = str3;
        String str6 = str4;
        return rawNetworkData.copy(i, str, z, str2, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSdkVersionHeader() {
        return this.sdkVersionHeader;
    }

    public final RawNetworkData copy(int code, String message, boolean isSuccessful, String body, String payload, String sdkVersionHeader) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new RawNetworkData(code, message, isSuccessful, body, payload, sdkVersionHeader);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawNetworkData)) {
            return false;
        }
        RawNetworkData rawNetworkData = (RawNetworkData) other;
        return this.code == rawNetworkData.code && Intrinsics.areEqual(this.message, rawNetworkData.message) && this.isSuccessful == rawNetworkData.isSuccessful && Intrinsics.areEqual(this.body, rawNetworkData.body) && Intrinsics.areEqual(this.payload, rawNetworkData.payload) && Intrinsics.areEqual(this.sdkVersionHeader, rawNetworkData.sdkVersionHeader);
    }

    public final String getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getSdkVersionHeader() {
        return this.sdkVersionHeader;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.code) * 31) + this.message.hashCode()) * 31) + Boolean.hashCode(this.isSuccessful)) * 31;
        String str = this.body;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.payload;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sdkVersionHeader;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public String toString() {
        return "RawNetworkData(code=" + this.code + ", message=" + this.message + ", isSuccessful=" + this.isSuccessful + ", body=" + this.body + ", payload=" + this.payload + ", sdkVersionHeader=" + this.sdkVersionHeader + ')';
    }
}
