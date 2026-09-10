package com.apollographql.apollo3.exception;

import kotlin.Metadata;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo3/exception/NoDataException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "cause", "", "(Ljava/lang/Throwable;)V", "apollo-api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NoDataException extends ApolloException {
    public NoDataException(Throwable th) {
        super("No data was found", th, null);
    }
}
