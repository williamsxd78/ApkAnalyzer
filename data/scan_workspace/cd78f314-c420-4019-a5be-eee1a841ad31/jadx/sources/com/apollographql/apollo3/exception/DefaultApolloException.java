package com.apollographql.apollo3.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/apollographql/apollo3/exception/DefaultApolloException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "apollo-api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DefaultApolloException extends ApolloException {
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultApolloException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public DefaultApolloException(String str, Throwable th) {
        super(str, th, null);
    }

    public /* synthetic */ DefaultApolloException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }
}
