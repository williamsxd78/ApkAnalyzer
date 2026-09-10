package com.mercadolibre.android.device.sdk.domain;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class VendorSpecificAttributes implements Serializable {
    private static final long serialVersionUID = 1;
    private String brand;
    private String device;
    private boolean featureAccelerometer;
    private boolean featureBluetooth;
    private boolean featureCamera;
    private boolean featureCompass;
    private boolean featureFlash;
    private boolean featureFrontCamera;
    private boolean featureGps;
    private boolean featureGyroscope;
    private boolean featureMicrophone;
    private boolean featureNfc;
    private boolean featureTelephony;
    private boolean featureTouchScreen;
    private String manufacturer;
    private String platform;
    private String product;
    private float screenDensity;

    public String getBrand() {
        return this.brand;
    }

    public String getDevice() {
        return this.device;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getProduct() {
        return this.product;
    }

    public float getScreenDensity() {
        return this.screenDensity;
    }

    public boolean isFeatureAccelerometer() {
        return this.featureAccelerometer;
    }

    public boolean isFeatureBluetooth() {
        return this.featureBluetooth;
    }

    public boolean isFeatureCamera() {
        return this.featureCamera;
    }

    public boolean isFeatureCompass() {
        return this.featureCompass;
    }

    public boolean isFeatureFlash() {
        return this.featureFlash;
    }

    public boolean isFeatureFrontCamera() {
        return this.featureFrontCamera;
    }

    public boolean isFeatureGps() {
        return this.featureGps;
    }

    public boolean isFeatureGyroscope() {
        return this.featureGyroscope;
    }

    public boolean isFeatureMicrophone() {
        return this.featureMicrophone;
    }

    public boolean isFeatureNfc() {
        return this.featureNfc;
    }

    public boolean isFeatureTelephony() {
        return this.featureTelephony;
    }

    public boolean isFeatureTouchScreen() {
        return this.featureTouchScreen;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setDevice(String str) {
        this.device = str;
    }

    public void setFeatureAccelerometer(boolean z) {
        this.featureAccelerometer = z;
    }

    public void setFeatureBluetooth(boolean z) {
        this.featureBluetooth = z;
    }

    public void setFeatureCamera(boolean z) {
        this.featureCamera = z;
    }

    public void setFeatureCompass(boolean z) {
        this.featureCompass = z;
    }

    public void setFeatureFlash(boolean z) {
        this.featureFlash = z;
    }

    public void setFeatureFrontCamera(boolean z) {
        this.featureFrontCamera = z;
    }

    public void setFeatureGps(boolean z) {
        this.featureGps = z;
    }

    public void setFeatureGyroscope(boolean z) {
        this.featureGyroscope = z;
    }

    public void setFeatureMicrophone(boolean z) {
        this.featureMicrophone = z;
    }

    public void setFeatureNfc(boolean z) {
        this.featureNfc = z;
    }

    public void setFeatureTelephony(boolean z) {
        this.featureTelephony = z;
    }

    public void setFeatureTouchScreen(boolean z) {
        this.featureTouchScreen = z;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setProduct(String str) {
        this.product = str;
    }

    public void setScreenDensity(float f) {
        this.screenDensity = f;
    }
}
