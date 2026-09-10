package defpackage;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys", imports = {"com.tealium.dispatcher.Dispatch"}))
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0002¨\u0006\u0010"}, d2 = {"LAppCollectorConstants;", "", "()V", "APP_BUILD", "", "getAPP_BUILD$annotations", "APP_MEMORY_USAGE", "getAPP_MEMORY_USAGE$annotations", "APP_NAME", "getAPP_NAME$annotations", "APP_RDNS", "getAPP_RDNS$annotations", "APP_UUID", "getAPP_UUID$annotations", "APP_VERSION", "getAPP_VERSION$annotations", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppCollectorConstants {
    public static final String APP_BUILD = "app_build";
    public static final String APP_MEMORY_USAGE = "app_memory_usage";
    public static final String APP_NAME = "app_name";
    public static final String APP_RDNS = "app_rdns";
    public static final String APP_UUID = "app_uuid";
    public static final String APP_VERSION = "app_version";
    public static final AppCollectorConstants INSTANCE = new AppCollectorConstants();

    private AppCollectorConstants() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.APP_BUILD", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getAPP_BUILD$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.APP_MEMORY_USAGE", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getAPP_MEMORY_USAGE$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.APP_NAME", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getAPP_NAME$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.APP_RDNS", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getAPP_RDNS$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.APP_UUID", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getAPP_UUID$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.APP_VERSION", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getAPP_VERSION$annotations() {
    }
}
