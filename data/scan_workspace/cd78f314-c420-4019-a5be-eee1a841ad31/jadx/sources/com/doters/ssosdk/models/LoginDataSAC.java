package com.doters.ssosdk.models;

import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginDataSAC.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003Jm\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\t\u0010+\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006,"}, d2 = {"Lcom/doters/ssosdk/models/LoginDataSAC;", "", "()V", "activationCode", "", "expiresIn", "", "flow", "sub", "tokenType", RemoteConfigConstants.ResponseFieldKey.STATE, "activationCodeSource", "resultCode", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "errorDescription", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivationCode", "()Ljava/lang/String;", "getActivationCodeSource", "getError", "getErrorDescription", "getExpiresIn", "()I", "getFlow", "getResultCode", "getState", "getSub", "getTokenType", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LoginDataSAC {
    private final String activationCode;
    private final String activationCodeSource;
    private final String error;
    private final String errorDescription;
    private final int expiresIn;
    private final String flow;
    private final String resultCode;
    private final String state;
    private final String sub;
    private final String tokenType;

    public LoginDataSAC() {
        this("", 0, "", "", "", "", "", "", "", "");
    }

    public LoginDataSAC(String activationCode, int i, String flow, String sub, String tokenType, String state, String activationCodeSource, String resultCode, String error, String errorDescription) {
        Intrinsics.checkNotNullParameter(activationCode, "activationCode");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(sub, "sub");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(activationCodeSource, "activationCodeSource");
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        this.activationCode = activationCode;
        this.expiresIn = i;
        this.flow = flow;
        this.sub = sub;
        this.tokenType = tokenType;
        this.state = state;
        this.activationCodeSource = activationCodeSource;
        this.resultCode = resultCode;
        this.error = error;
        this.errorDescription = errorDescription;
    }

    public static /* synthetic */ LoginDataSAC copy$default(LoginDataSAC loginDataSAC, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = loginDataSAC.activationCode;
        }
        if ((i2 & 2) != 0) {
            i = loginDataSAC.expiresIn;
        }
        if ((i2 & 4) != 0) {
            str2 = loginDataSAC.flow;
        }
        if ((i2 & 8) != 0) {
            str3 = loginDataSAC.sub;
        }
        if ((i2 & 16) != 0) {
            str4 = loginDataSAC.tokenType;
        }
        if ((i2 & 32) != 0) {
            str5 = loginDataSAC.state;
        }
        if ((i2 & 64) != 0) {
            str6 = loginDataSAC.activationCodeSource;
        }
        if ((i2 & 128) != 0) {
            str7 = loginDataSAC.resultCode;
        }
        if ((i2 & 256) != 0) {
            str8 = loginDataSAC.error;
        }
        if ((i2 & 512) != 0) {
            str9 = loginDataSAC.errorDescription;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str4;
        String str15 = str5;
        return loginDataSAC.copy(str, i, str2, str3, str14, str15, str12, str13, str10, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getActivationCode() {
        return this.activationCode;
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
    public final String getFlow() {
        return this.flow;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSub() {
        return this.sub;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component7, reason: from getter */
    public final String getActivationCodeSource() {
        return this.activationCodeSource;
    }

    /* renamed from: component8, reason: from getter */
    public final String getResultCode() {
        return this.resultCode;
    }

    /* renamed from: component9, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final LoginDataSAC copy(String activationCode, int expiresIn, String flow, String sub, String tokenType, String state, String activationCodeSource, String resultCode, String error, String errorDescription) {
        Intrinsics.checkNotNullParameter(activationCode, "activationCode");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(sub, "sub");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(activationCodeSource, "activationCodeSource");
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        return new LoginDataSAC(activationCode, expiresIn, flow, sub, tokenType, state, activationCodeSource, resultCode, error, errorDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginDataSAC)) {
            return false;
        }
        LoginDataSAC loginDataSAC = (LoginDataSAC) other;
        return Intrinsics.areEqual(this.activationCode, loginDataSAC.activationCode) && this.expiresIn == loginDataSAC.expiresIn && Intrinsics.areEqual(this.flow, loginDataSAC.flow) && Intrinsics.areEqual(this.sub, loginDataSAC.sub) && Intrinsics.areEqual(this.tokenType, loginDataSAC.tokenType) && Intrinsics.areEqual(this.state, loginDataSAC.state) && Intrinsics.areEqual(this.activationCodeSource, loginDataSAC.activationCodeSource) && Intrinsics.areEqual(this.resultCode, loginDataSAC.resultCode) && Intrinsics.areEqual(this.error, loginDataSAC.error) && Intrinsics.areEqual(this.errorDescription, loginDataSAC.errorDescription);
    }

    public final String getActivationCode() {
        return this.activationCode;
    }

    public final String getActivationCodeSource() {
        return this.activationCodeSource;
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

    public final String getFlow() {
        return this.flow;
    }

    public final String getResultCode() {
        return this.resultCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getSub() {
        return this.sub;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        return (((((((((((((((((this.activationCode.hashCode() * 31) + Integer.hashCode(this.expiresIn)) * 31) + this.flow.hashCode()) * 31) + this.sub.hashCode()) * 31) + this.tokenType.hashCode()) * 31) + this.state.hashCode()) * 31) + this.activationCodeSource.hashCode()) * 31) + this.resultCode.hashCode()) * 31) + this.error.hashCode()) * 31) + this.errorDescription.hashCode();
    }

    public String toString() {
        return "LoginDataSAC(activationCode=" + this.activationCode + ", expiresIn=" + this.expiresIn + ", flow=" + this.flow + ", sub=" + this.sub + ", tokenType=" + this.tokenType + ", state=" + this.state + ", activationCodeSource=" + this.activationCodeSource + ", resultCode=" + this.resultCode + ", error=" + this.error + ", errorDescription=" + this.errorDescription + ")";
    }
}
