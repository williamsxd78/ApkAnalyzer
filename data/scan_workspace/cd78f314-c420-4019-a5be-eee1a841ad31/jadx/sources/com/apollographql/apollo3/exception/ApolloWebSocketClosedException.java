package com.apollographql.apollo3.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/apollographql/apollo3/exception/ApolloWebSocketClosedException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "code", "", "reason", "", "cause", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "getCode", "()I", "getReason", "()Ljava/lang/String;", "apollo-api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ApolloWebSocketClosedException extends ApolloException {
    private final int code;
    private final String reason;

    public ApolloWebSocketClosedException(int i, String str, Throwable th) {
        super("WebSocket Closed code='" + i + "' reason='" + str + '\'', th, null);
        this.code = i;
        this.reason = str;
    }

    public /* synthetic */ ApolloWebSocketClosedException(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : th);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getReason() {
        return this.reason;
    }
}
