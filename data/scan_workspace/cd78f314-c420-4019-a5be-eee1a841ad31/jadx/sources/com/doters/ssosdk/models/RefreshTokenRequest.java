package com.doters.ssosdk.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RefreshTokenRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/doters/ssosdk/models/RefreshTokenRequest;", "", "accessToken", "", "expiresIn", "", "idToken", "refreshToken", "scope", "tokenType", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getExpiresIn", "()I", "getIdToken", "getRefreshToken", "getScope", "getTokenType", "component1", "component2", "component3", "component4", "component5", "component6", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RefreshTokenRequest {
    private final String accessToken;
    private final int expiresIn;
    private final String idToken;
    private final String refreshToken;
    private final String scope;
    private final String tokenType;

    public RefreshTokenRequest(String accessToken, int i, String idToken, String refreshToken, String scope, String tokenType) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        this.accessToken = accessToken;
        this.expiresIn = i;
        this.idToken = idToken;
        this.refreshToken = refreshToken;
        this.scope = scope;
        this.tokenType = tokenType;
    }

    public static /* synthetic */ RefreshTokenRequest copy$default(RefreshTokenRequest refreshTokenRequest, String str, int i, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = refreshTokenRequest.accessToken;
        }
        if ((i2 & 2) != 0) {
            i = refreshTokenRequest.expiresIn;
        }
        if ((i2 & 4) != 0) {
            str2 = refreshTokenRequest.idToken;
        }
        if ((i2 & 8) != 0) {
            str3 = refreshTokenRequest.refreshToken;
        }
        if ((i2 & 16) != 0) {
            str4 = refreshTokenRequest.scope;
        }
        if ((i2 & 32) != 0) {
            str5 = refreshTokenRequest.tokenType;
        }
        String str6 = str4;
        String str7 = str5;
        return refreshTokenRequest.copy(str, i, str2, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
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

    public final RefreshTokenRequest copy(String accessToken, int expiresIn, String idToken, String refreshToken, String scope, String tokenType) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        return new RefreshTokenRequest(accessToken, expiresIn, idToken, refreshToken, scope, tokenType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefreshTokenRequest)) {
            return false;
        }
        RefreshTokenRequest refreshTokenRequest = (RefreshTokenRequest) other;
        return Intrinsics.areEqual(this.accessToken, refreshTokenRequest.accessToken) && this.expiresIn == refreshTokenRequest.expiresIn && Intrinsics.areEqual(this.idToken, refreshTokenRequest.idToken) && Intrinsics.areEqual(this.refreshToken, refreshTokenRequest.refreshToken) && Intrinsics.areEqual(this.scope, refreshTokenRequest.scope) && Intrinsics.areEqual(this.tokenType, refreshTokenRequest.tokenType);
    }

    public final String getAccessToken() {
        return this.accessToken;
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

    public final String getScope() {
        return this.scope;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        return (((((((((this.accessToken.hashCode() * 31) + Integer.hashCode(this.expiresIn)) * 31) + this.idToken.hashCode()) * 31) + this.refreshToken.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.tokenType.hashCode();
    }

    public String toString() {
        return "RefreshTokenRequest(accessToken=" + this.accessToken + ", expiresIn=" + this.expiresIn + ", idToken=" + this.idToken + ", refreshToken=" + this.refreshToken + ", scope=" + this.scope + ", tokenType=" + this.tokenType + ")";
    }
}
