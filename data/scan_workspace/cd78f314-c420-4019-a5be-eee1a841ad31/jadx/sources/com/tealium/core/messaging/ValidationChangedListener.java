package com.tealium.core.messaging;

import com.tealium.core.validation.DispatchValidator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tealium/core/messaging/ValidationChangedListener;", "Lcom/tealium/core/messaging/ExternalListener;", "onRevalidate", "", "override", "Ljava/lang/Class;", "Lcom/tealium/core/validation/DispatchValidator;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ValidationChangedListener extends ExternalListener {
    void onRevalidate(Class<? extends DispatchValidator> override);
}
