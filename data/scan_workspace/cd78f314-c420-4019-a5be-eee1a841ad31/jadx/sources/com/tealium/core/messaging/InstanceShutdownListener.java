package com.tealium.core.messaging;

import com.tealium.core.Tealium;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\t"}, d2 = {"Lcom/tealium/core/messaging/InstanceShutdownListener;", "Lcom/tealium/core/messaging/Listener;", "onInstanceShutdown", "", "name", "", "instance", "Ljava/lang/ref/WeakReference;", "Lcom/tealium/core/Tealium;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InstanceShutdownListener extends Listener {
    void onInstanceShutdown(String name, WeakReference<Tealium> instance);
}
