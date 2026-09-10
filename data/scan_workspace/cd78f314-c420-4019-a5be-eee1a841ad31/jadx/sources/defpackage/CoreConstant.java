package defpackage;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Deprecated(message = "CoreConstants have been moved.")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0002R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0002R\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0002R\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0002R\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0002R\u0016\u0010\u0018\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0002¨\u0006\u001a"}, d2 = {"LCoreConstant;", "", "()V", "DEEP_LINK_QUERY_PREFIX", "", "getDEEP_LINK_QUERY_PREFIX$annotations", "DEEP_LINK_URL", "getDEEP_LINK_URL$annotations", "KILL_VISITOR_SESSION", "getKILL_VISITOR_SESSION$annotations", "KILL_VISITOR_SESSION_EVENT_KEY", "getKILL_VISITOR_SESSION_EVENT_KEY$annotations", "LEAVE_TRACE_QUERY_PARAM", "getLEAVE_TRACE_QUERY_PARAM$annotations", "LIBRARY_VERSION", "getLIBRARY_VERSION$annotations", "REQUEST_UUID", "getREQUEST_UUID$annotations", "TEALIUM_EVENT", "getTEALIUM_EVENT$annotations", "TEALIUM_EVENT_TYPE", "getTEALIUM_EVENT_TYPE$annotations", "TRACE_ID", "getTRACE_ID$annotations", "TRACE_ID_QUERY_PARAM", "getTRACE_ID_QUERY_PARAM$annotations", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreConstant {
    public static final String DEEP_LINK_QUERY_PREFIX = "deep_link_param";
    public static final String DEEP_LINK_URL = "deep_link_url";
    public static final CoreConstant INSTANCE = new CoreConstant();
    public static final String KILL_VISITOR_SESSION = "kill_visitor_session";
    public static final String KILL_VISITOR_SESSION_EVENT_KEY = "event";
    public static final String LEAVE_TRACE_QUERY_PARAM = "leave_trace";
    public static final String LIBRARY_VERSION = "library_version";
    public static final String REQUEST_UUID = "request_uuid";
    public static final String TEALIUM_EVENT = "tealium_event";
    public static final String TEALIUM_EVENT_TYPE = "tealium_event_type";
    public static final String TRACE_ID = "cp.trace_id";
    public static final String TRACE_ID_QUERY_PARAM = "tealium_trace_id";

    private CoreConstant() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEEP_LINK_QUERY_PREFIX", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEEP_LINK_QUERY_PREFIX$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEEP_LINK_URL", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEEP_LINK_URL$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "DeepLinkHandler.KILL_VISITOR_SESSION", imports = {"com.tealium.core.DeepLinkHandler"}))
    public static /* synthetic */ void getKILL_VISITOR_SESSION$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.EVENT", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getKILL_VISITOR_SESSION_EVENT_KEY$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "DeepLinkHandler.LEAVE_TRACE_QUERY_PARAM", imports = {"com.tealium.core.DeepLinkHandler"}))
    public static /* synthetic */ void getLEAVE_TRACE_QUERY_PARAM$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.LIBRARY_VERSION", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getLIBRARY_VERSION$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.REQUEST_UUID", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getREQUEST_UUID$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.TEALIUM_EVENT", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getTEALIUM_EVENT$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.TEALIUM_EVENT_TYPE", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getTEALIUM_EVENT_TYPE$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.TRACE_ID", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getTRACE_ID$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "DeepLinkHandler.TRACE_ID_QUERY_PARAM", imports = {"com.tealium.core.DeepLinkHandler"}))
    public static /* synthetic */ void getTRACE_ID_QUERY_PARAM$annotations() {
    }
}
