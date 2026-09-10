package com.inmobile.uba;

import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/inmobile/uba/OrientationEvents;", "", "orientationEvent", "", "pageId", "", InAppMessageBase.ORIENTATION, "Lcom/inmobile/uba/DeviceOrientation;", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface OrientationEvents {
    void orientationEvent(long pageId, DeviceOrientation orientation);
}
