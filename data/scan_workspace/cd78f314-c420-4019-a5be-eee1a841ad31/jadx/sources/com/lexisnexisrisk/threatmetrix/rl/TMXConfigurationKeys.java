package com.lexisnexisrisk.threatmetrix.rl;

/* loaded from: classes3.dex */
public class TMXConfigurationKeys {
    public static String ADVERTISING_ID_COLLECTION_KEY = "advertisingIdCollection";
    public static String API_KEY = "apiKey";
    public static String DISABLE_APP_HASHING_KEY = "disableAppHashing";
    public static String DISABLE_AUTHENTICATION_MODULE_KEY = "disableAuthenticationModule";
    public static String DISABLE_INIT_PACKAGE_SCAN_KEY = "disableInitPackageScan";
    public static String DISABLE_LOC_SER_ON_BATTERY_LOW_KEY = "disableLocSerOnBatteryLow";
    public static String DISABLE_NON_FATAL_LOGS_KEY = "disableNonfatalLogs";
    public static String DISABLE_OPTION_KEY = "disableOption";
    public static String DISABLE_PROFILE_PACKAGE_SCAN_KEY = "disableProfilePackageScan";
    public static String ENABLE_OPTION_KEY = "enableOption";
    public static String FP_SERVER_KEY = "fpServer";
    public static String HIGH_POWER_UPDATE_TIME_KEY = "highPowerUpdateTime";
    public static String INIT_PACKAGE_SCAN_TIME_LIMIT_KEY = "initPackageScanTimeLimit";
    public static String LOCATION_ACCURACY_KEY = "locationAccuracy";
    public static String LOW_POWER_UPDATE_TIME_KEY = "lowPowerUpdateTime";
    public static String ORG_ID_KEY = "orgId";
    public static String PACKAGE_SCAN_TIME_LIMIT_KEY = "packageScanTimeLimit";
    public static String PROFILE_TIMEOUT_KEY = "profileTimeout";
    public static String REGISTER_FOR_LOCATION_SERVICES_KEY = "registerForLocationServices";
    public static String SCREEN_OFF_TIMEOUT_KEY = null;
    public static String TMXBEHAVIOSEC_INCLUDED_ACTIVITIES = null;
    public static String TMXBEHAVIOSEC_INJECT_JAVASCRIPT_COLLECTOR = null;
    public static String TMXBEHAVIOSEC_MASKED_FIELDS = null;
    public static String TMXBEHAVIOSEC_USE_TAG_AS_ID = null;
    public static String TMXBEHAVIOSEC_WEBFIELD_IDENTIFIER_ATTRIBUTE = null;
    public static int iLF = 3904;
    public static int ish = 8499;

    static {
        int i;
        if ((8499 ^ 8499) != 0) {
            while (true) {
                i = ish;
                int i2 = i + 26;
                if (i2 == 65) {
                    break;
                } else if (i2 == 185) {
                    ish = (i % 17) + i;
                }
            }
            ish = ((i ^ 2695) * 8) % 88;
        }
        SCREEN_OFF_TIMEOUT_KEY = "screenOffTimeout";
        TMXBEHAVIOSEC_INCLUDED_ACTIVITIES = "TMXBehavioSecIncludedActivities";
        TMXBEHAVIOSEC_MASKED_FIELDS = "TMXBehavioSecMaskedFields";
        TMXBEHAVIOSEC_INJECT_JAVASCRIPT_COLLECTOR = "TMXBehavioSecInjectJavascriptCollector";
        TMXBEHAVIOSEC_WEBFIELD_IDENTIFIER_ATTRIBUTE = "TMXBehavioSecWebFieldIdentifierAttribute";
        TMXBEHAVIOSEC_USE_TAG_AS_ID = "TMXBehavioSecIdFromTag";
    }

    private TMXConfigurationKeys() {
    }
}
