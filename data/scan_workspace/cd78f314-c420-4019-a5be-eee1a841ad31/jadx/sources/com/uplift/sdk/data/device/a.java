package com.uplift.sdk.data.device;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lib.android.paypal.com.magnessdk.filesystem.b;

/* compiled from: DeviceManager.kt */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0007R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u001a\u0010 \u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR\u0017\u0010\"\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b!\u0010\u001f¨\u0006'"}, d2 = {"Lcom/uplift/sdk/data/device/a;", "", "", "i", OperatorName.SET_LINE_JOINSTYLE, "", "a", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "f", OperatorName.NON_STROKING_GRAY, "Landroid/location/Location;", "e", "Landroid/content/Intent;", "Landroid/content/Intent;", "batteryIntent", "Landroid/content/res/Configuration;", "Landroid/content/res/Configuration;", "configuration", "Landroid/location/LocationManager;", "Landroid/location/LocationManager;", "mLocationManager", "Landroid/telephony/TelephonyManager;", "d", "Landroid/telephony/TelephonyManager;", "telephonyManager", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "connectivityManager", "Ljava/lang/String;", "()Ljava/lang/String;", "deviceId", "h", "screenResolution", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: from kotlin metadata */
    private final Intent batteryIntent;

    /* renamed from: b, reason: from kotlin metadata */
    private final Configuration configuration;

    /* renamed from: c, reason: from kotlin metadata */
    private final LocationManager mLocationManager;

    /* renamed from: d, reason: from kotlin metadata */
    private final TelephonyManager telephonyManager;

    /* renamed from: e, reason: from kotlin metadata */
    private ConnectivityManager connectivityManager;

    /* renamed from: f, reason: from kotlin metadata */
    private final String deviceId;

    /* renamed from: g, reason: from kotlin metadata */
    private final String screenResolution;

    public a(Context context) {
        DisplayMetrics displayMetrics;
        DisplayMetrics displayMetrics2;
        Intrinsics.checkNotNullParameter(context, "context");
        Integer num = null;
        this.batteryIntent = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "context.resources.configuration");
        this.configuration = configuration;
        this.mLocationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        this.telephonyManager = (TelephonyManager) context.getSystemService("phone");
        this.connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        String string = Settings.Secure.getString(context.getContentResolver(), b.f);
        Intrinsics.checkNotNullExpressionValue(string, "getString(context.conten…ttings.Secure.ANDROID_ID)");
        this.deviceId = string;
        StringBuilder sb = new StringBuilder();
        Resources resources = context.getResources();
        sb.append((resources == null || (displayMetrics2 = resources.getDisplayMetrics()) == null) ? null : Integer.valueOf(displayMetrics2.widthPixels));
        sb.append('x');
        Resources resources2 = context.getResources();
        if (resources2 != null && (displayMetrics = resources2.getDisplayMetrics()) != null) {
            num = Integer.valueOf(displayMetrics.heightPixels);
        }
        sb.append(num);
        this.screenResolution = sb.toString();
    }

    private final boolean i() {
        try {
            LocationManager locationManager = this.mLocationManager;
            if (locationManager == null || !locationManager.isProviderEnabled("gps")) {
                LocationManager locationManager2 = this.mLocationManager;
                if (locationManager2 != null) {
                    if (locationManager2.isProviderEnabled("network")) {
                    }
                }
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private final boolean j() {
        try {
            LocationManager locationManager = this.mLocationManager;
            if (locationManager != null) {
                if (locationManager.isProviderEnabled("network")) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final float a() {
        Intent intent = this.batteryIntent;
        Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1)) : null;
        Intent intent2 = this.batteryIntent;
        Integer valueOf2 = intent2 != null ? Integer.valueOf(intent2.getIntExtra("scale", -1)) : null;
        if (valueOf != null && valueOf.intValue() == -1) {
            return 50.0f;
        }
        if (valueOf2 != null && valueOf2.intValue() == -1) {
            return 50.0f;
        }
        return ((valueOf != null ? valueOf.intValue() : 0.0f) / (valueOf2 != null ? valueOf2.intValue() : 0.0f)) * 100.0f;
    }

    public final String b() {
        Intent intent = this.batteryIntent;
        Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("status", -1)) : null;
        return (valueOf != null && valueOf.intValue() == 2) ? "Charging" : (valueOf != null && valueOf.intValue() == 4) ? "Unplugged" : (valueOf != null && valueOf.intValue() == 3) ? "Discharging" : (valueOf != null && valueOf.intValue() == 5) ? "Full" : OpenTypeScript.UNKNOWN;
    }

    public final String c() {
        int i = this.configuration.orientation;
        return i != 1 ? i != 2 ? OpenTypeScript.UNKNOWN : "Landscape" : "Portrait";
    }

    /* renamed from: d, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final Location e() {
        LocationManager locationManager;
        LocationManager locationManager2;
        Location location = null;
        Location lastKnownLocation = (!i() || (locationManager2 = this.mLocationManager) == null) ? null : locationManager2.getLastKnownLocation("gps");
        if (j() && (locationManager = this.mLocationManager) != null) {
            location = locationManager.getLastKnownLocation("network");
        }
        return (lastKnownLocation == null || location == null ? lastKnownLocation == null : lastKnownLocation.getTime() <= location.getTime()) ? location : lastKnownLocation;
    }

    public final String f() {
        TelephonyManager telephonyManager = this.telephonyManager;
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }

    public final String g() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = this.connectivityManager;
        String typeName = (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) ? null : activeNetworkInfo.getTypeName();
        return typeName == null ? "" : typeName;
    }

    /* renamed from: h, reason: from getter */
    public final String getScreenResolution() {
        return this.screenResolution;
    }
}
