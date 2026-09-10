package com.doters.ssosdk.models;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntrospectionRequest.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006'"}, d2 = {"Lcom/doters/ssosdk/models/IntrospectionRequest;", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "sub", "", "clientId", "exp", "", "iat", "iss", "scope", "tokenType", "(ZLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActive", "()Z", "getClientId", "()Ljava/lang/String;", "getExp", "()J", "getIat", "getIss", "getScope", "getSub", "getTokenType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class IntrospectionRequest {
    private final boolean active;
    private final String clientId;
    private final long exp;
    private final long iat;
    private final String iss;
    private final String scope;
    private final String sub;
    private final String tokenType;

    public IntrospectionRequest(boolean z, String sub, String clientId, long j, long j2, String iss, String scope, String tokenType) {
        Intrinsics.checkNotNullParameter(sub, "sub");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        this.active = z;
        this.sub = sub;
        this.clientId = clientId;
        this.exp = j;
        this.iat = j2;
        this.iss = iss;
        this.scope = scope;
        this.tokenType = tokenType;
    }

    public static /* synthetic */ IntrospectionRequest copy$default(IntrospectionRequest introspectionRequest, boolean z, String str, String str2, long j, long j2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = introspectionRequest.active;
        }
        if ((i & 2) != 0) {
            str = introspectionRequest.sub;
        }
        if ((i & 4) != 0) {
            str2 = introspectionRequest.clientId;
        }
        if ((i & 8) != 0) {
            j = introspectionRequest.exp;
        }
        if ((i & 16) != 0) {
            j2 = introspectionRequest.iat;
        }
        if ((i & 32) != 0) {
            str3 = introspectionRequest.iss;
        }
        if ((i & 64) != 0) {
            str4 = introspectionRequest.scope;
        }
        if ((i & 128) != 0) {
            str5 = introspectionRequest.tokenType;
        }
        String str6 = str5;
        String str7 = str3;
        long j3 = j2;
        long j4 = j;
        String str8 = str2;
        return introspectionRequest.copy(z, str, str8, j4, j3, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSub() {
        return this.sub;
    }

    /* renamed from: component3, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getExp() {
        return this.exp;
    }

    /* renamed from: component5, reason: from getter */
    public final long getIat() {
        return this.iat;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIss() {
        return this.iss;
    }

    /* renamed from: component7, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    public final IntrospectionRequest copy(boolean active, String sub, String clientId, long exp, long iat, String iss, String scope, String tokenType) {
        Intrinsics.checkNotNullParameter(sub, "sub");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        return new IntrospectionRequest(active, sub, clientId, exp, iat, iss, scope, tokenType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntrospectionRequest)) {
            return false;
        }
        IntrospectionRequest introspectionRequest = (IntrospectionRequest) other;
        return this.active == introspectionRequest.active && Intrinsics.areEqual(this.sub, introspectionRequest.sub) && Intrinsics.areEqual(this.clientId, introspectionRequest.clientId) && this.exp == introspectionRequest.exp && this.iat == introspectionRequest.iat && Intrinsics.areEqual(this.iss, introspectionRequest.iss) && Intrinsics.areEqual(this.scope, introspectionRequest.scope) && Intrinsics.areEqual(this.tokenType, introspectionRequest.tokenType);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final long getExp() {
        return this.exp;
    }

    public final long getIat() {
        return this.iat;
    }

    public final String getIss() {
        return this.iss;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getSub() {
        return this.sub;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.active) * 31) + this.sub.hashCode()) * 31) + this.clientId.hashCode()) * 31) + Long.hashCode(this.exp)) * 31) + Long.hashCode(this.iat)) * 31) + this.iss.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.tokenType.hashCode();
    }

    public String toString() {
        return "IntrospectionRequest(active=" + this.active + ", sub=" + this.sub + ", clientId=" + this.clientId + ", exp=" + this.exp + ", iat=" + this.iat + ", iss=" + this.iss + ", scope=" + this.scope + ", tokenType=" + this.tokenType + ")";
    }
}
