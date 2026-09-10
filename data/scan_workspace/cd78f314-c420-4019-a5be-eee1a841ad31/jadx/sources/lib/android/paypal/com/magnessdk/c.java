package lib.android.paypal.com.magnessdk;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.braze.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.inmobile.ErrorConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.vivaaerobus.app.database.entities.remoteConfig.RemoteConfigParamsEntity;
import com.vivaaerobus.app.dynamicYield.sdk.constants.PageAttributes;
import com.yuno.payments.network.manager.AvailableLanguages;

/* loaded from: classes9.dex */
public final class c {

    /* loaded from: classes9.dex */
    public enum a {
        AUDIT_KEY("audit"),
        FEATURE("type"),
        PAYLOAD("payload"),
        SENSOR_TYPE(Constants.BRAZE_PUSH_TITLE_KEY),
        SENSOR_PAYLOAD("p");

        private final String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    /* loaded from: classes9.dex */
    public static final class b {
        public static final String a = "pairing_id";
        public static final String b = "correlation-id";
        public static final String c = "Android";
        static final int d = 36;
        static final int e = 30;
        public static final long f = 1000;
        static final long g = 0;
        static final int h = 50000;
        static final int i = 150;
        static final int j = 25;
        static final int k = 120;
        static final String l = "os.name";
        static final String m = "os.version";
        static final String n = "os.arch";
        public static final int o = 10;
        public static final int p = 10;
        public static final int q = 60000;
        public static final int r = 256;

        /* loaded from: classes9.dex */
        public enum a {
            MOBILE("MOBILE"),
            WIFI("WIFI"),
            VPN("VPN"),
            BLUETOOTH("Bluetooth Tethering"),
            WIFI_AWARE("WIFI AWARE"),
            LOWPAN("LOW PAN"),
            ETHERNET("Ethernet");

            private final String a;

            a(String str) {
                this.a = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.a;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$b$b, reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public enum EnumC0445b {
            EXCEPTION("Network Setup Exception, Check PPNetworkEnvironment for details");

            private final String a;

            EnumC0445b(String str) {
                this.a = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.a;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$b$c, reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public enum EnumC0446c {
            CMID_EXCEPTION_MESSAGE("PayPal-Client-Metadata-Id exceeds the maximum length allowed. This is your own unique identifier for the payload. If you do not pass in this value, a new PayPal-Client-Metadata-Id is generated per method call. ***Maximum length: 32 characters***"),
            APPGUID_EXCEPTION_MESSAGE("Application’s Globally Unique Identifier (AppGUID) does not match the criteria, This is a string that identifies the merchant application that sets up Magnes on the mobile device. If the merchant app does not pass an AppGuid, Magnes creates one to identify the app. An AppGuid is an application identifier per-installation; that is, if a new instance of the app is installed on the mobile device, or the app is reinstalled, it will have a new AppGuid.\n ***AppGuid Criteria*** \n   Max length: 36 characters \n   Min Length: 30 characters \n   Regex: Letters, numbers and dashes only \n");

            private final String a;

            EnumC0446c(String str) {
                this.a = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.a;
            }
        }

        private b() {
        }
    }

    /* renamed from: lib.android.paypal.com.magnessdk.c$c, reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public enum EnumC0447c {
        RAMP("ramp"),
        REMOTE("remote");

        private final String a;

        EnumC0447c(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    /* loaded from: classes9.dex */
    public enum d {
        ANDROID_ID(lib.android.paypal.com.magnessdk.filesystem.b.f),
        APP_FIRST_INSTALL_TIME("app_first_install_time"),
        APP_GUID("app_guid"),
        APP_ID("app_id"),
        APP_LAST_UPDATE_TIME("app_last_update_time"),
        APP_VERSION("app_version"),
        COMP_VERSION("comp_version"),
        CONF_URL("conf_url"),
        CPU("cpu"),
        DEVICE_MODEL("device_model"),
        DEVICE_NAME("device_name"),
        DISK("disk"),
        EMULATOR_FLAGS("ef"),
        GSF_ID("gsf_id"),
        IN_TREATMENT(Constants.BRAZE_PUSH_TITLE_KEY),
        IS_EMULATOR("is_emulator"),
        IS_ROOTED("is_rooted"),
        MAC_ADDRS("mac_addrs"),
        MAGNES_GUID("magnes_guid"),
        MAGNES_SOURCE("magnes_source"),
        NOT_COLLECTIBLE_LIST("nc"),
        NOTIF_TOKEN("notif_token"),
        OS_TYPE("os_type"),
        OS_VERSION("os_version"),
        PAYLOAD_TYPE("payload_type"),
        ROOTED_FLAGS("rf"),
        SCREEN("screen"),
        SENSOR_METADATA("smd"),
        SMS_ENABLED("sms_enabled"),
        SOURCE_APP_VERSION("source_app_version"),
        SYSTEM(PageAttributes.SYSTEM),
        T(Constants.BRAZE_PUSH_TITLE_KEY),
        TOTAL_STORAGE_SPACE("total_storage_space"),
        USER_AGENT("user_agent");

        private final String a;

        /* loaded from: classes9.dex */
        public enum a {
            CORES("cores"),
            MAX_FREQUENCY("maxFreq"),
            MIN_FREQUENCY("minFreq");

            private final String a;

            a(String str) {
                this.a = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.a;
            }
        }

        /* loaded from: classes9.dex */
        public enum b {
            TOTAL_SD("total_sd"),
            TOTAL_UD("total");

            private final String a;

            b(String str) {
                this.a = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.a;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$d$c, reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public enum EnumC0448c {
            ANDROID_SDK_BUILD_FOR_X86("Android SDK built for x86"),
            ANDROID_X86("android_x86"),
            ANDY("andy"),
            ANDY_OS("AndyOS"),
            ANDY_OSX("AndyOSX"),
            DRIOD_4X("Driod4X"),
            DROID_4X("Droid4X"),
            GENERIC("generic"),
            GENERIC_X86("generic_x86"),
            GENY_MOTION("Genymotion"),
            GOLDFISH("goldfish"),
            GOODLE_SDK("google_sdk"),
            SDK("sdk"),
            UNKNOWN("unknown"),
            VBOX_86("vbox86"),
            VBOX_86P("vbox86p"),
            RANCHU("ranchu"),
            REMIXEMU("remixemu"),
            TTVM_X86("ttVM_x86");

            private final String a;

            EnumC0448c(String str) {
                this.a = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.a;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$d$d, reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public enum EnumC0449d {
            DENSITY("density"),
            DENSITY_DPI("densityDpi"),
            HEIGHT("height"),
            SCALE("scale"),
            WIDTH("width"),
            X_DPI("xdpi"),
            Y_DPI("ydpi");

            private final String a;

            EnumC0449d(String str) {
                this.a = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.a;
            }
        }

        /* loaded from: classes9.dex */
        public enum e {
            FIFO_MAX_EVENT_COUNT("mec"),
            MAX_RANGE("mr"),
            NAME("n"),
            POWER("pwr"),
            RESOLUTION(OperatorName.APPEND_RECT),
            VENDOR("v"),
            VERSION("ver");

            private final String a;

            e(String str) {
                this.a = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.a;
            }
        }

        /* loaded from: classes9.dex */
        public enum f {
            VERSION(RemoteConfigParamsEntity.VERSION),
            BOARD("board"),
            BOOTLOADER("bootloader"),
            CPU_ABI1("cpu_abi1"),
            DISPLAY(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION),
            RADIO("radio"),
            FINGERPRINT("fingerprint"),
            HARDWARE("hardware"),
            MANUFACTURER("manufacturer"),
            PRODUCT("product"),
            TIME("time"),
            SYSTEM_TYPE("system_type");

            private final String a;

            f(String str) {
                this.a = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.a;
            }
        }

        d(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    /* loaded from: classes9.dex */
    public enum e {
        BASE_STATION_ID("base_station_id"),
        BATTERY("battery"),
        BSSID("bssid"),
        BSSID_ARRAY("bssid_array"),
        C(OperatorName.CURVE_TO),
        CDMA_NETWORK_ID("cdma_network_id"),
        CDMA_SYSTEM_ID("cdma_system_id"),
        CELL_ID("cell_id"),
        CONF_VERSION("conf_version"),
        CONN_TYPE("conn_type"),
        DC_ID("dc_id"),
        DEVICE_ID("device_id"),
        DEVICE_UPTIME("device_uptime"),
        DISK("disk"),
        DS("ds"),
        IP_ADDRESSES("ip_addresses"),
        IP_ADDRS("ip_addrs"),
        IS_DEV_MODE_ON("dmo"),
        KNOWN_APPS("known_apps"),
        LINKER_ID("linker_id"),
        LOCALE_COUNTRY("locale_country"),
        LOCALE_LANG("locale_lang"),
        LOCATION(FirebaseAnalytics.Param.LOCATION),
        LOCATION_AREA_CODE("location_area_code"),
        MEMORY("memory"),
        MG_ID("mg_id"),
        NETWORK_OPERATOR("network_operator"),
        PHONE_TYPE("phone_type"),
        PL(AvailableLanguages.POLISH_HEADER),
        PROXY_SETTING("proxy_setting"),
        RISK_COMP_SESSION_ID("risk_comp_session_id"),
        ROAMING("roaming"),
        SCREEN("screen"),
        SERIAL_NUMBER("serial_number"),
        SIM_OPERATOR_NAME("sim_operator_name"),
        SIM_SERIAL_NUMBER("sim_serial_number"),
        SR("sr"),
        SSID("ssid"),
        SUBSCRIBER_ID("subscriber_id"),
        T(com.braze.Constants.BRAZE_PUSH_TITLE_KEY),
        TIMESTAMP("timestamp"),
        TZ("tz"),
        TZ_NAME("tz_name"),
        VPN_SETTING("VPN_setting");

        private final String a;

        /* loaded from: classes9.dex */
        public enum a {
            CURRENT("current"),
            LEVEL(FirebaseAnalytics.Param.LEVEL),
            METHOD("method"),
            LOW_POWER("low_power"),
            STATE(RemoteConfigConstants.ResponseFieldKey.STATE),
            TEMP("temp"),
            VOLTAGE("voltage");

            private final String a;

            a(String str) {
                this.a = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.a;
            }
        }

        /* loaded from: classes9.dex */
        public enum b {
            FREE_SD("free_sd"),
            FREE_UD("free"),
            MOUNTED("mounted");

            private final String a;

            b(String str) {
                this.a = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.a;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$e$c, reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public enum EnumC0450c {
            FREE("free"),
            FREE_RUNTIME("free_runtime"),
            MAX_RUNTIME("max_runtime"),
            TOTAL("total"),
            TOTAL_RUNTIME("total_runtime");

            private final String a;

            EnumC0450c(String str) {
                this.a = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.a;
            }
        }

        e(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    /* loaded from: classes9.dex */
    static class f {
        static final String[] a = {"com.bignox.appcenter", "com.bluestacks.settings", "com.bluestacks.filemanager", "com.genymotion.superuser", "org.greatfruit.andy.ime", "com.kaopu001.tiantianserver", "com.tiantian.ime", "com.microvirt.installer", "com.android.ld.appstore", "com.ldmnq.launcher3", "com.jide.Appstore"};
        static final String[] b = {"init.android_x86.rc", "ueventd.android_x86.rc", "fstab.android_x86", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc", "ueventd.android_x86_64.rc", "init.android_x86_64.rc", "fstab.goldfish", "init.goldfish.rc", "init.superuser.rc"};
        static final String[] c = {"/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props"};
        static final String[] d = {"/dev/socket/qemud", "/dev/qemu_pipe"};
        static final String[] e = {"goldfish"};
        static final String[] f = {"init.ranchu.rc", "init.remixos.rc", "init.andy.rc", "ueventd.andy.rc", "bin/genybaseband", "bin/genymotion-vbox-sf", "ueventd.nox.rc", "init.nox.rc", "/system/bin/noxd"};

        /* loaded from: classes9.dex */
        static final class a {
            public static final int a = 5;
            public static final int b = 0;
            public static final int c = 1;
            public static final int d = 2;
            public static final int e = 3;
            public static final int f = 4;

            private a() {
            }
        }

        private f() {
        }
    }

    /* loaded from: classes9.dex */
    public enum g {
        PRODUCTION("production"),
        STAGE("stage");

        private final String a;

        g(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    /* loaded from: classes9.dex */
    public enum h {
        NETWORKING("MagnesNetworking");

        private final String a;

        /* loaded from: classes9.dex */
        public enum a {
            HTTP_CONNECT_TIMEOUT(60000),
            HTTP_READ_TIMEOUT(60000),
            READ_BYTE(1024);

            private final int a;

            a(int i) {
                this.a = i;
            }

            public int a() {
                return this.a;
            }
        }

        /* loaded from: classes9.dex */
        public enum b {
            POST("POST"),
            GET("GET");

            private final String a;

            b(String str) {
                this.a = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.a;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$h$c, reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public enum EnumC0451c {
            GET_REQUEST_STARTED(50),
            GET_REQUEST_ERROR(51),
            GET_REQUEST_SUCCEEDED(52),
            POST_REQUEST_STARTED(53),
            POST_REQUEST_ERROR(54),
            POST_REQUEST_SUCCEEDED(55),
            HTTP_STATUS_FAILED(-1),
            HTTP_STATUS_200(200);

            private final int a;

            EnumC0451c(int i) {
                this.a = i;
            }

            public static EnumC0451c a(int i) {
                EnumC0451c enumC0451c = GET_REQUEST_STARTED;
                if (i == enumC0451c.a()) {
                    return enumC0451c;
                }
                EnumC0451c enumC0451c2 = GET_REQUEST_ERROR;
                if (i == enumC0451c2.a()) {
                    return enumC0451c2;
                }
                EnumC0451c enumC0451c3 = GET_REQUEST_SUCCEEDED;
                if (i == enumC0451c3.a()) {
                    return enumC0451c3;
                }
                EnumC0451c enumC0451c4 = POST_REQUEST_STARTED;
                if (i == enumC0451c4.a()) {
                    return enumC0451c4;
                }
                EnumC0451c enumC0451c5 = POST_REQUEST_ERROR;
                if (i == enumC0451c5.a()) {
                    return enumC0451c5;
                }
                EnumC0451c enumC0451c6 = POST_REQUEST_SUCCEEDED;
                if (i == enumC0451c6.a()) {
                    return enumC0451c6;
                }
                EnumC0451c enumC0451c7 = HTTP_STATUS_FAILED;
                if (i == enumC0451c7.a()) {
                    return enumC0451c7;
                }
                EnumC0451c enumC0451c8 = HTTP_STATUS_200;
                if (i == enumC0451c8.a()) {
                    return enumC0451c8;
                }
                return null;
            }

            public int a() {
                return this.a;
            }
        }

        /* loaded from: classes9.dex */
        public enum d {
            AUDIT_JSON_URL(lib.android.paypal.com.magnessdk.a.e),
            DEVICE_INFO_URL(lib.android.paypal.com.magnessdk.a.g),
            PRODUCTION_BEACON_URL(lib.android.paypal.com.magnessdk.a.h),
            PRODUCTION_JSON_URL(lib.android.paypal.com.magnessdk.a.i),
            RAMP_CONFIG_URL(lib.android.paypal.com.magnessdk.a.j),
            REMOTE_CONFIG_URL(lib.android.paypal.com.magnessdk.a.k),
            SANDBOX_DEVICE_INFO_URL(lib.android.paypal.com.magnessdk.a.m),
            SANDBOX_AUDIT_JSON_URL(lib.android.paypal.com.magnessdk.a.l),
            SANDBOX_PROD_JSON_URL(lib.android.paypal.com.magnessdk.a.l);

            private final String a;

            d(String str) {
                this.a = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.a;
            }
        }

        h(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    /* loaded from: classes9.dex */
    public enum i {
        OPEN("o"),
        EXCLUDED("e"),
        MIN_VERSION(OperatorName.MOVE_TO),
        RAMP_THRESHOLD(PDPageLabelRange.STYLE_ROMAN_LOWER),
        APP_IDS("ai"),
        APP_SOURCES("as"),
        CONF_REFRESH_TIME_KEY("cr_ti");

        private final String a;

        i(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    /* loaded from: classes9.dex */
    public enum j {
        CONF_VERSION("conf_version"),
        CONF_ENDPOINT_URL("endpoint_url"),
        CONF_REFRESH_TIME_KEY("conf_refresh_time_interval"),
        ANDROID_APPS_TO_CHECK("android_apps_to_check"),
        NOT_COLLECTABLE("nc"),
        MG_ID(OperatorName.MOVE_TO),
        SENSOR_COLLECT_TIME("s");

        private final String a;

        j(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    /* loaded from: classes9.dex */
    public enum k {
        KNOWN_ROOT_APPS_PACKAGES("com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk"),
        SU_PATHS("/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/system/xbin/daemonsu/", "/system/etc/init.d/99SuperSUDaemon/", "/system/bin/.ext/.su/", "/system/etc/.has_su_daemon/", "/system/etc/.installed_su_daemon/", "/cache/", "/data/", "/dev/");

        private final String[] a;

        /* loaded from: classes9.dex */
        public enum a {
            SU(CmcdConfiguration.KEY_STARTUP),
            BUSYBOX("busybox"),
            MAGISK("magisk");

            private final String a;

            a(String str) {
                this.a = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.a;
            }
        }

        /* loaded from: classes9.dex */
        public enum b {
            NUMBER_OF_ROOTED_FLAGS(7),
            IS_TEST_KEYS_FOUND(0),
            IS_SU_FOUND(1),
            IS_SUPER_USER_APK_FOUND(2),
            DETECT_ROOT_MANAGEMENT_APPS(3),
            CHECK_FOR_BINARY_SU(4),
            CHECK_FOR_BINARY_BUSYBOX(5),
            CHECK_FOR_BINARY_MAGISK(6);

            private final int a;

            b(int i) {
                this.a = i;
            }

            public static b a(int i) {
                b bVar = IS_TEST_KEYS_FOUND;
                if (i == bVar.a()) {
                    return bVar;
                }
                b bVar2 = IS_SU_FOUND;
                if (i == bVar2.a()) {
                    return bVar2;
                }
                b bVar3 = IS_SUPER_USER_APK_FOUND;
                if (i == bVar3.a()) {
                    return bVar3;
                }
                b bVar4 = DETECT_ROOT_MANAGEMENT_APPS;
                if (i == bVar4.a()) {
                    return bVar4;
                }
                b bVar5 = CHECK_FOR_BINARY_SU;
                if (i == bVar5.a()) {
                    return bVar5;
                }
                b bVar6 = CHECK_FOR_BINARY_BUSYBOX;
                if (i == bVar6.a()) {
                    return bVar6;
                }
                b bVar7 = CHECK_FOR_BINARY_MAGISK;
                if (i == bVar7.a()) {
                    return bVar7;
                }
                return null;
            }

            public int a() {
                return this.a;
            }
        }

        k(String... strArr) {
            this.a = strArr;
        }

        public String[] a() {
            return this.a;
        }
    }

    /* loaded from: classes9.dex */
    public enum l {
        AC(com.braze.Constants.BRAZE_PUSH_ACCENT_KEY),
        GY("gy"),
        MG("mg");

        private final String a;

        l(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    /* loaded from: classes9.dex */
    public enum m {
        FLIGHT_TIME("flightTime"),
        TELEMETRY_EVENTS("Events"),
        TYPING_SPEED(lib.android.paypal.com.magnessdk.g.s1),
        VIEW_ID("viewId"),
        AUTO_COMPLETE_EVENT("wsac"),
        BACKSPACE_EVENT("wsbs"),
        CUT_EVENT("wsct"),
        PRE_FILLED_EVENT("wspf"),
        REGULAR_TYPING_EVENT("wsrt"),
        FAILED_TO_CONVERT_TO_JSON("Failed to convert to JSON");

        private final String a;

        m(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    /* loaded from: classes9.dex */
    public enum n {
        TOUCH_EVENT("te"),
        FORCE("f"),
        RADIUS(PDPageLabelRange.STYLE_ROMAN_LOWER),
        TOUCH_LOCATION_X("x"),
        TOUCH_LOCATION_Y(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT),
        TOUCH_COUNT("tc"),
        START_TIME(CmcdConfiguration.KEY_STREAM_TYPE),
        END_TIME("et"),
        MAXIMUM_PRECISION("10000000d"),
        UNINITIALIZED_TIME("-1000"),
        MAXIMUM_EVENT_COUNT("400"),
        MAXIMUM_TIME_ALLOWED(ErrorConstants.M5000),
        MAXIMUM_TOUCH_COUNT("5");

        private final String a;

        n(String str) {
            this.a = str;
        }

        public double a() {
            return Double.parseDouble(this.a);
        }

        public int b() {
            return Integer.parseInt(this.a);
        }

        public long c() {
            return Long.parseLong(this.a);
        }

        public String d() {
            return this.a;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    private c() {
    }
}
