package com.doters.ssosdk.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogoutModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/doters/ssosdk/models/LogoutRequest;", "", "clientId", "", "sessionId", "(Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getSessionId", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LogoutRequest {
    private final String clientId;
    private final String sessionId;

    public LogoutRequest(String clientId, String sessionId) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.clientId = clientId;
        this.sessionId = sessionId;
    }

    public static /* synthetic */ LogoutRequest copy$default(LogoutRequest logoutRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = logoutRequest.clientId;
        }
        if ((i & 2) != 0) {
            str2 = logoutRequest.sessionId;
        }
        return logoutRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final LogoutRequest copy(String clientId, String sessionId) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new LogoutRequest(clientId, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogoutRequest)) {
            return false;
        }
        LogoutRequest logoutRequest = (LogoutRequest) other;
        return Intrinsics.areEqual(this.clientId, logoutRequest.clientId) && Intrinsics.areEqual(this.sessionId, logoutRequest.sessionId);
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return (this.clientId.hashCode() * 31) + this.sessionId.hashCode();
    }

    public String toString() {
        return "LogoutRequest(clientId=" + this.clientId + ", sessionId=" + this.sessionId + ")";
    }
}
