package com.inmobile;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J!\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/inmobile/InMobileCallback;", "T", "", "onComplete", "", "result", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/inmobile/InMobileException;", "(Ljava/lang/Object;Lcom/inmobile/InMobileException;)V", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface InMobileCallback<T> {
    void onComplete(T result, InMobileException error);
}
