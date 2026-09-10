package com.vivaaerobus.app.checkIn.presentation.zamnaDocumentsValidation.permission;

import android.net.Uri;
import android.webkit.ValueCallback;
import kotlin.Metadata;

/* compiled from: FileChooserHandler.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\r2\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005R(\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/vivaaerobus/app/checkIn/presentation/zamnaDocumentsValidation/permission/FileChooserHandler;", "", "<init>", "()V", "callback", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "getCallback", "()Landroid/webkit/ValueCallback;", "setCallback", "(Landroid/webkit/ValueCallback;)V", "deliverResult", "", "uris", "([Landroid/net/Uri;)V", "register", "checkIn_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FileChooserHandler {
    public static final int $stable = 0;
    private ValueCallback<Uri[]> callback;

    public final void deliverResult(Uri[] uris) {
        ValueCallback<Uri[]> valueCallback = this.callback;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uris);
        }
        this.callback = null;
    }

    public final ValueCallback<Uri[]> getCallback() {
        return this.callback;
    }

    public final void register(ValueCallback<Uri[]> callback) {
        ValueCallback<Uri[]> valueCallback = this.callback;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        this.callback = callback;
    }

    public final void setCallback(ValueCallback<Uri[]> valueCallback) {
        this.callback = valueCallback;
    }
}
