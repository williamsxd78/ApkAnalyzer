package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

import com.airbnb.paris.R2;
import wHQzUD.LcDBfR;

/* loaded from: classes3.dex */
public final class BuildConfig {
    public static final int BUILD_ID = 93;
    public static String BUILD_TYPE = null;
    public static final boolean DEBUG = false;
    public static int FQb = 4655;
    public static String FULL_VERSION_NAME;
    public static String LIBRARY_PACKAGE_NAME;
    public static String THIRDPARTY_CUSTOMER;
    public static int WqI;

    static {
        LcDBfR.dIf = 6784;
        LcDBfR.dwn = 4146;
        WqI = 4298;
        if ((FQb ^ 4655) == 0) {
            LIBRARY_PACKAGE_NAME = LcDBfR.RvP("ZIS\u001euLubqoeFLqpjyr6cfoyzf|u{d|l=Hf\bkbU\\YMGIsnKC@EWVRMIUT\\B");
            BUILD_TYPE = LcDBfR.RvP("KCRUxZh");
            FULL_VERSION_NAME = LcDBfR.RvP("\u0001\b\u000e\u001d \u001a-1\"SL");
            THIRDPARTY_CUSTOMER = LcDBfR.RvP("KJ");
            return;
        }
        while (true) {
            int i = FQb;
            int i2 = i + 26;
            if (i2 != 54) {
                if (i2 == 170) {
                    break;
                }
                if (i2 == 220) {
                    FQb = (FQb ^ 3806) * R2.dimen.abc_text_size_display_3_material;
                } else if (i2 == 358) {
                    FQb = (i ^ 2536) % 3;
                }
            }
            FQb = (FQb ^ 3751) * 38;
            FQb = (FQb ^ 3806) * R2.dimen.abc_text_size_display_3_material;
        }
        while (true) {
            FQb = (FQb ^ 6236) % 102;
        }
    }
}
