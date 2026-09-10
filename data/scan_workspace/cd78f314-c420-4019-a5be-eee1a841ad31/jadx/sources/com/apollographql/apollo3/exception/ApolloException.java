package com.apollographql.apollo3.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u0082\u0001\u000f\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/apollographql/apollo3/exception/ApolloException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/apollographql/apollo3/exception/ApolloCompositeException;", "Lcom/apollographql/apollo3/exception/ApolloGraphQLException;", "Lcom/apollographql/apollo3/exception/ApolloHttpException;", "Lcom/apollographql/apollo3/exception/ApolloNetworkException;", "Lcom/apollographql/apollo3/exception/ApolloParseException;", "Lcom/apollographql/apollo3/exception/ApolloWebSocketClosedException;", "Lcom/apollographql/apollo3/exception/AutoPersistedQueriesNotSupported;", "Lcom/apollographql/apollo3/exception/CacheMissException;", "Lcom/apollographql/apollo3/exception/DefaultApolloException;", "Lcom/apollographql/apollo3/exception/HttpCacheMissException;", "Lcom/apollographql/apollo3/exception/JsonDataException;", "Lcom/apollographql/apollo3/exception/JsonEncodingException;", "Lcom/apollographql/apollo3/exception/MissingValueException;", "Lcom/apollographql/apollo3/exception/NoDataException;", "Lcom/apollographql/apollo3/exception/SubscriptionOperationException;", "apollo-api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ApolloException extends RuntimeException {
    private ApolloException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ ApolloException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th, null);
    }

    public /* synthetic */ ApolloException(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }
}
