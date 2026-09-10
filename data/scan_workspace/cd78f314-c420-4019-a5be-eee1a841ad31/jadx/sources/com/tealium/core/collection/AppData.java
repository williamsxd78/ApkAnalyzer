package com.tealium.core.collection;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tealium.core.Collector;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/tealium/core/collection/AppData;", "Lcom/tealium/core/Collector;", RemoteConfigConstants.RequestFieldKey.APP_BUILD, "", "getAppBuild", "()Ljava/lang/String;", "appMemoryUsage", "", "getAppMemoryUsage", "()J", "appName", "getAppName", "appRdns", "getAppRdns", "appUuid", "getAppUuid", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "getAppVersion", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AppData extends Collector {
    String getAppBuild();

    long getAppMemoryUsage();

    String getAppName();

    String getAppRdns();

    String getAppUuid();

    String getAppVersion();
}
