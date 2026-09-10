package com.doters.ssosdk.models;

import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003Jm\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\t\u0010+\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006,"}, d2 = {"Lcom/doters/ssosdk/models/LoginData;", "", "()V", "accessToken", "", "expiresIn", "", "idToken", "refreshToken", "scope", "tokenType", RemoteConfigConstants.ResponseFieldKey.STATE, "resultCode", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "errorDescription", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getError", "getErrorDescription", "getExpiresIn", "()I", "getIdToken", "getRefreshToken", "getResultCode", "getScope", "getState", "getTokenType", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LoginData {
    private final String accessToken;
    private final String error;
    private final String errorDescription;
    private final int expiresIn;
    private final String idToken;
    private final String refreshToken;
    private final String resultCode;
    private final String scope;
    private final String state;
    private final String tokenType;

    public LoginData() {
        this("", 0, "", "", "", "", "", "", "", "");
    }

    public LoginData(String accessToken, int i, String idToken, String refreshToken, String scope, String tokenType, String state, String resultCode, String error, String errorDescription) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        this.accessToken = accessToken;
        this.expiresIn = i;
        this.idToken = idToken;
        this.refreshToken = refreshToken;
        this.scope = scope;
        this.tokenType = tokenType;
        this.state = state;
        this.resultCode = resultCode;
        this.error = error;
        this.errorDescription = errorDescription;
    }

    public static /* synthetic */ LoginData copy$default(LoginData loginData, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = loginData.accessToken;
        }
        if ((i2 & 2) != 0) {
            i = loginData.expiresIn;
        }
        if ((i2 & 4) != 0) {
            str2 = loginData.idToken;
        }
        if ((i2 & 8) != 0) {
            str3 = loginData.refreshToken;
        }
        if ((i2 & 16) != 0) {
            str4 = loginData.scope;
        }
        if ((i2 & 32) != 0) {
            str5 = loginData.tokenType;
        }
        if ((i2 & 64) != 0) {
            str6 = loginData.state;
        }
        if ((i2 & 128) != 0) {
            str7 = loginData.resultCode;
        }
        if ((i2 & 256) != 0) {
            str8 = loginData.error;
        }
        if ((i2 & 512) != 0) {
            str9 = loginData.errorDescription;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str4;
        String str15 = str5;
        return loginData.copy(str, i, str2, str3, str14, str15, str12, str13, str10, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component10, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    /* renamed from: component2, reason: from getter */
    public final int getExpiresIn() {
        return this.expiresIn;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIdToken() {
        return this.idToken;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* renamed from: component5, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* renamed from: component7, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component8, reason: from getter */
    public final String getResultCode() {
        return this.resultCode;
    }

    /* renamed from: component9, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final LoginData copy(String accessToken, int expiresIn, String idToken, String refreshToken, String scope, String tokenType, String state, String resultCode, String error, String errorDescription) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        return new LoginData(accessToken, expiresIn, idToken, refreshToken, scope, tokenType, state, resultCode, error, errorDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginData)) {
            return false;
        }
        LoginData loginData = (LoginData) other;
        return Intrinsics.areEqual(this.accessToken, loginData.accessToken) && this.expiresIn == loginData.expiresIn && Intrinsics.areEqual(this.idToken, loginData.idToken) && Intrinsics.areEqual(this.refreshToken, loginData.refreshToken) && Intrinsics.areEqual(this.scope, loginData.scope) && Intrinsics.areEqual(this.tokenType, loginData.tokenType) && Intrinsics.areEqual(this.state, loginData.state) && Intrinsics.areEqual(this.resultCode, loginData.resultCode) && Intrinsics.areEqual(this.error, loginData.error) && Intrinsics.areEqual(this.errorDescription, loginData.errorDescription);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final int getExpiresIn() {
        return this.expiresIn;
    }

    public final String getIdToken() {
        return this.idToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getResultCode() {
        return this.resultCode;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        return (((((((((((((((((this.accessToken.hashCode() * 31) + Integer.hashCode(this.expiresIn)) * 31) + this.idToken.hashCode()) * 31) + this.refreshToken.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.tokenType.hashCode()) * 31) + this.state.hashCode()) * 31) + this.resultCode.hashCode()) * 31) + this.error.hashCode()) * 31) + this.errorDescription.hashCode();
    }

    public String toString() {
        return "LoginData(accessToken=" + this.accessToken + ", expiresIn=" + this.expiresIn + ", idToken=" + this.idToken + ", refreshToken=" + this.refreshToken + ", scope=" + this.scope + ", tokenType=" + this.tokenType + ", state=" + this.state + ", resultCode=" + this.resultCode + ", error=" + this.error + ", errorDescription=" + this.errorDescription + ")";
    }
}
