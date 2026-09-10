package defpackage;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys", imports = {"com.tealium.dispatcher.Dispatch"}))
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0002¨\u0006\u0010"}, d2 = {"LConnectivityCollectorConstants;", "", "()V", "CARRIER", "", "getCARRIER$annotations", "CARRIER_ISO", "getCARRIER_ISO$annotations", "CARRIER_MCC", "getCARRIER_MCC$annotations", "CARRIER_MNC", "getCARRIER_MNC$annotations", "CONNECTION_TYPE", "getCONNECTION_TYPE$annotations", "IS_CONNECTED", "getIS_CONNECTED$annotations", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConnectivityCollectorConstants {
    public static final String CARRIER = "carrier";
    public static final String CARRIER_ISO = "carrier_iso";
    public static final String CARRIER_MCC = "carrier_mcc";
    public static final String CARRIER_MNC = "carrier_mnc";
    public static final String CONNECTION_TYPE = "connection_type";
    public static final ConnectivityCollectorConstants INSTANCE = new ConnectivityCollectorConstants();
    public static final String IS_CONNECTED = "device_connected";

    private ConnectivityCollectorConstants() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.CARRIER", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getCARRIER$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.CARRIER_ISO", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getCARRIER_ISO$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.CARRIER_MCC", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getCARRIER_MCC$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.CARRIER_MNC", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getCARRIER_MNC$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.CONNECTION_TYPE", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getCONNECTION_TYPE$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.IS_CONNECTED", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getIS_CONNECTED$annotations() {
    }
}
