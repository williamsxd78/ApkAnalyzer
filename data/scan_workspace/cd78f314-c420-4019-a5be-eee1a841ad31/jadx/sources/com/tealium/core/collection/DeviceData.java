package com.tealium.core.collection;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001b\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0012\u0010\u001a\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0012\u0010\u001c\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0005R\u0012\u0010\u001e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0005R\u0012\u0010 \u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0005R\u0012\u0010\"\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0005R\u0012\u0010$\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0005R\u0012\u0010&\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0005R\u0012\u0010(\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0005R\u0012\u0010*\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0005R\u0012\u0010,\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0005R\u0012\u0010.\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0005¨\u00060"}, d2 = {"Lcom/tealium/core/collection/DeviceData;", "", "device", "", "getDevice", "()Ljava/lang/String;", "deviceArchitecture", "getDeviceArchitecture", "deviceAvailableExternalStorage", "", "getDeviceAvailableExternalStorage", "()J", "deviceAvailableSystemStorage", "getDeviceAvailableSystemStorage", "deviceBatteryPercent", "", "getDeviceBatteryPercent", "()I", "deviceCpuType", "getDeviceCpuType", "deviceIsCharging", "", "getDeviceIsCharging", "()Z", "deviceLanguage", "getDeviceLanguage", "deviceLogicalResolution", "getDeviceLogicalResolution", "deviceManufacturer", "getDeviceManufacturer", "deviceModel", "getDeviceModel", "deviceOrientation", "getDeviceOrientation", "deviceOrigin", "getDeviceOrigin", "deviceOsBuild", "getDeviceOsBuild", "deviceOsName", "getDeviceOsName", "deviceOsVersion", "getDeviceOsVersion", "devicePlatform", "getDevicePlatform", "deviceResolution", "getDeviceResolution", "deviceRuntime", "getDeviceRuntime", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DeviceData {
    String getDevice();

    String getDeviceArchitecture();

    long getDeviceAvailableExternalStorage();

    long getDeviceAvailableSystemStorage();

    int getDeviceBatteryPercent();

    String getDeviceCpuType();

    boolean getDeviceIsCharging();

    String getDeviceLanguage();

    String getDeviceLogicalResolution();

    String getDeviceManufacturer();

    String getDeviceModel();

    String getDeviceOrientation();

    String getDeviceOrigin();

    String getDeviceOsBuild();

    String getDeviceOsName();

    String getDeviceOsVersion();

    String getDevicePlatform();

    String getDeviceResolution();

    String getDeviceRuntime();
}
