package defpackage;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Deprecated(message = "DispatchType has been moved.", replaceWith = @ReplaceWith(expression = "DispatchType", imports = {"com.tealium.core.DispatchType"}))
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002¨\u0006\n"}, d2 = {"LDispatchType;", "", "()V", "EVENT", "", "getEVENT$annotations", "REMOTE_API", "getREMOTE_API$annotations", "VIEW", "getVIEW$annotations", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DispatchType {
    public static final String EVENT = "event";
    public static final DispatchType INSTANCE = new DispatchType();
    public static final String REMOTE_API = "remote_api";
    public static final String VIEW = "view";

    private DispatchType() {
    }

    @Deprecated(message = "DispatchType has been moved.", replaceWith = @ReplaceWith(expression = "com.tealium.core.DispatchType.EVENT", imports = {"com.tealium.core.DispatchType"}))
    public static /* synthetic */ void getEVENT$annotations() {
    }

    @Deprecated(message = "DispatchType has been moved.", replaceWith = @ReplaceWith(expression = "com.tealium.core.DispatchType.REMOTE_API", imports = {"com.tealium.core.DispatchType"}))
    public static /* synthetic */ void getREMOTE_API$annotations() {
    }

    @Deprecated(message = "DispatchType has been moved.", replaceWith = @ReplaceWith(expression = "com.tealium.core.DispatchType.VIEW", imports = {"com.tealium.core.DispatchType"}))
    public static /* synthetic */ void getVIEW$annotations() {
    }
}
