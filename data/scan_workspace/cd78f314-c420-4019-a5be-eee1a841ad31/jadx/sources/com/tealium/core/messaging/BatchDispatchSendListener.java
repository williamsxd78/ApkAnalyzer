package com.tealium.core.messaging;

import com.tealium.dispatcher.Dispatch;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/tealium/core/messaging/BatchDispatchSendListener;", "Lcom/tealium/core/messaging/Listener;", "onBatchDispatchSend", "", "dispatches", "", "Lcom/tealium/dispatcher/Dispatch;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BatchDispatchSendListener extends Listener {
    Object onBatchDispatchSend(List<? extends Dispatch> list, Continuation<? super Unit> continuation);
}
