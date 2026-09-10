package com.apollographql.apollo3.network.ws.internal;

import kotlin.Metadata;

/* compiled from: WsMessage.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\u0006\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo3/network/ws/internal/Event;", "Lcom/apollographql/apollo3/network/ws/internal/Message;", "id", "", "getId", "()Ljava/lang/String;", "Lcom/apollographql/apollo3/network/ws/internal/ConnectionReEstablished;", "Lcom/apollographql/apollo3/network/ws/internal/GeneralError;", "Lcom/apollographql/apollo3/network/ws/internal/NetworkError;", "Lcom/apollographql/apollo3/network/ws/internal/OperationComplete;", "Lcom/apollographql/apollo3/network/ws/internal/OperationError;", "Lcom/apollographql/apollo3/network/ws/internal/OperationResponse;", "apollo-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface Event extends Message {
    String getId();
}
