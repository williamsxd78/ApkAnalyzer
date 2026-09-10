package com.uplift.sdk.callback;

import com.google.firebase.messaging.Constants;
import com.uplift.sdk.model.pub.ULError;
import kotlin.Metadata;

/* compiled from: OrderConfirmationCallback.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/uplift/sdk/callback/OrderConfirmationCallback;", "", "onError", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/uplift/sdk/model/pub/ULError;", "onSuccess", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface OrderConfirmationCallback {
    void onError(ULError error);

    void onSuccess();
}
