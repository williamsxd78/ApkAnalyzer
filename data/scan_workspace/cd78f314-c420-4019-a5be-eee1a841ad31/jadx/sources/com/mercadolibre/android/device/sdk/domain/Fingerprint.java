package com.mercadolibre.android.device.sdk.domain;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class Fingerprint implements Serializable {
    private static final long serialVersionUID = 1;
    public long diskSpace;
    public long freeDiskSpace;
    public String model;
    public String os;
    public Long ram;
    public String resolution;
    public String systemVersion;
    public ArrayList<VendorId> vendorIds = new ArrayList<>();
    public VendorSpecificAttributes vendorSpecificAttributes = new VendorSpecificAttributes();

    public long getDiskSpace() {
        return this.diskSpace;
    }

    public long getFreeDiskSpace() {
        return this.freeDiskSpace;
    }

    public String getModel() {
        return this.model;
    }

    public String getOs() {
        return this.os;
    }

    public Long getRam() {
        return this.ram;
    }

    public String getResolution() {
        return this.resolution;
    }

    public String getSystemVersion() {
        return this.systemVersion;
    }

    public ArrayList<VendorId> getVendorIds() {
        return this.vendorIds;
    }

    public VendorSpecificAttributes getVendorSpecificAttributes() {
        return this.vendorSpecificAttributes;
    }

    public void setDiskSpace(long j) {
        this.diskSpace = j;
    }

    public void setFreeDiskSpace(long j) {
        this.freeDiskSpace = j;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setOs(String str) {
        this.os = str;
    }

    public void setRam(Long l) {
        this.ram = l;
    }

    public void setResolution(String str) {
        this.resolution = str;
    }

    public void setSystemVersion(String str) {
        this.systemVersion = str;
    }

    public void setVendorIds(ArrayList<VendorId> arrayList) {
        this.vendorIds = arrayList;
    }

    public void setVendorSpecificAttributes(VendorSpecificAttributes vendorSpecificAttributes) {
        this.vendorSpecificAttributes = vendorSpecificAttributes;
    }
}
