package com.inmobile.uba;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001JX\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH&¨\u0006\u0011"}, d2 = {"Lcom/inmobile/uba/SessionEvents;", "", "sessionEvent", "", "pageId", "", "screenWidth", "", "screenHeight", "manufacturer", "", "model", "brand", "operatingSystem", "operatingSystemVersion", "securityPatch", "buildId", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface SessionEvents {
    void sessionEvent(long pageId, int screenWidth, int screenHeight, String manufacturer, String model, String brand, String operatingSystem, String operatingSystemVersion, String securityPatch, String buildId);
}
