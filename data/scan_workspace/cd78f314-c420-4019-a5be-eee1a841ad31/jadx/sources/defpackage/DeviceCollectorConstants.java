package defpackage;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys", imports = {"com.tealium.dispatcher.Dispatch"}))
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0002R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0002R\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0002R\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0002R\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0002R\u0016\u0010\u0018\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0002R\u0016\u0010\u001a\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u001b\u0010\u0002R\u0016\u0010\u001c\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u001d\u0010\u0002R\u0016\u0010\u001e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u001f\u0010\u0002R\u0016\u0010 \u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b!\u0010\u0002R\u0016\u0010\"\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b#\u0010\u0002R\u0016\u0010$\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b%\u0010\u0002¨\u0006&"}, d2 = {"LDeviceCollectorConstants;", "", "()V", "DEVICE", "", "getDEVICE$annotations", "DEVICE_ARCHITECTURE", "getDEVICE_ARCHITECTURE$annotations", "DEVICE_AVAILABLE_EXTERNAL_STORAGE", "getDEVICE_AVAILABLE_EXTERNAL_STORAGE$annotations", "DEVICE_AVAILABLE_SYSTEM_STORAGE", "getDEVICE_AVAILABLE_SYSTEM_STORAGE$annotations", "DEVICE_CPU_TYPE", "getDEVICE_CPU_TYPE$annotations", "DEVICE_LANGUAGE", "getDEVICE_LANGUAGE$annotations", "DEVICE_LOGICAL_RESOLUTION", "getDEVICE_LOGICAL_RESOLUTION$annotations", "DEVICE_MANUFACTURER", "getDEVICE_MANUFACTURER$annotations", "DEVICE_MODEL", "getDEVICE_MODEL$annotations", "DEVICE_ORIENTATION", "getDEVICE_ORIENTATION$annotations", "DEVICE_ORIGIN", "getDEVICE_ORIGIN$annotations", "DEVICE_OS_BUILD", "getDEVICE_OS_BUILD$annotations", "DEVICE_OS_NAME", "getDEVICE_OS_NAME$annotations", "DEVICE_OS_VERSION", "getDEVICE_OS_VERSION$annotations", "DEVICE_PLATFORM", "getDEVICE_PLATFORM$annotations", "DEVICE_RESOLUTION", "getDEVICE_RESOLUTION$annotations", "DEVICE_RUNTIME", "getDEVICE_RUNTIME$annotations", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeviceCollectorConstants {
    public static final String DEVICE = "device";
    public static final String DEVICE_ARCHITECTURE = "device_architecture";
    public static final String DEVICE_AVAILABLE_EXTERNAL_STORAGE = "device_free_external_storage";
    public static final String DEVICE_AVAILABLE_SYSTEM_STORAGE = "device_free_system_storage";
    public static final String DEVICE_CPU_TYPE = "device_cputype";
    public static final String DEVICE_LANGUAGE = "device_language";
    public static final String DEVICE_LOGICAL_RESOLUTION = "device_logical_resolution";
    public static final String DEVICE_MANUFACTURER = "device_manufacturer";
    public static final String DEVICE_MODEL = "device_model";
    public static final String DEVICE_ORIENTATION = "device_orientation";
    public static final String DEVICE_ORIGIN = "origin";
    public static final String DEVICE_OS_BUILD = "device_os_build";
    public static final String DEVICE_OS_NAME = "os_name";
    public static final String DEVICE_OS_VERSION = "device_os_version";
    public static final String DEVICE_PLATFORM = "platform";
    public static final String DEVICE_RESOLUTION = "device_resolution";
    public static final String DEVICE_RUNTIME = "device_android_runtime";
    public static final DeviceCollectorConstants INSTANCE = new DeviceCollectorConstants();

    private DeviceCollectorConstants() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE_ARCHITECTURE", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE_ARCHITECTURE$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE_AVAILABLE_EXTERNAL_STORAGE", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE_AVAILABLE_EXTERNAL_STORAGE$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE_AVAILABLE_SYSTEM_STORAGE", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE_AVAILABLE_SYSTEM_STORAGE$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE_CPU_TYPE", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE_CPU_TYPE$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE_LANGUAGE", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE_LANGUAGE$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE_LOGICAL_RESOLUTION", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE_LOGICAL_RESOLUTION$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE_MANUFACTURER", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE_MANUFACTURER$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE_MODEL", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE_MODEL$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE_ORIENTATION", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE_ORIENTATION$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE_ORIGIN", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE_ORIGIN$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE_OS_BUILD", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE_OS_BUILD$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE_OS_NAME", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE_OS_NAME$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE_OS_VERSION", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE_OS_VERSION$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE_PLATFORM", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE_PLATFORM$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE_RESOLUTION", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE_RESOLUTION$annotations() {
    }

    @Deprecated(message = "Constants have been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.DEVICE_RUNTIME", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getDEVICE_RUNTIME$annotations() {
    }
}
