package com.inmobile.sse.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006&"}, d2 = {"Lcom/inmobile/sse/models/AccelerometerData;", "", "accelerometerX", "", "accelerometerY", "accelerometerZ", "gyroscopeX", "gyroscopeY", "gyroscopeZ", "(DDDDDD)V", "getAccelerometerX", "()D", "setAccelerometerX", "(D)V", "getAccelerometerY", "setAccelerometerY", "getAccelerometerZ", "setAccelerometerZ", "getGyroscopeX", "setGyroscopeX", "getGyroscopeY", "setGyroscopeY", "getGyroscopeZ", "setGyroscopeZ", "component1", "component2", "component3", "component4", "component5", "component6", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccelerometerData {

    /* renamed from: х0445х0445х04450445, reason: contains not printable characters */
    public static int f24350445044504450445 = 1;

    /* renamed from: х0445ххх04450445, reason: contains not printable characters */
    public static int f2436044504450445 = 67;

    /* renamed from: хх0445хх04450445, reason: contains not printable characters */
    public static int f2437044504450445 = 0;

    /* renamed from: ххх0445х04450445, reason: contains not printable characters */
    public static int f2438044504450445 = 2;
    private double accelerometerX;
    private double accelerometerY;
    private double accelerometerZ;
    private double gyroscopeX;
    private double gyroscopeY;
    private double gyroscopeZ;

    public AccelerometerData() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 63, null);
    }

    public AccelerometerData(double d, double d2, double d3, double d4, double d5, double d6) {
        this.accelerometerX = d;
        this.accelerometerY = d2;
        this.accelerometerZ = d3;
        this.gyroscopeX = d4;
        this.gyroscopeY = d5;
        this.gyroscopeZ = d6;
    }

    public /* synthetic */ AccelerometerData(double d, double d2, double d3, double d4, double d5, double d6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4, (i & 16) != 0 ? 0.0d : d5, (i & 32) != 0 ? 0.0d : d6);
    }

    public static /* synthetic */ AccelerometerData copy$default(AccelerometerData accelerometerData, double d, double d2, double d3, double d4, double d5, double d6, int i, Object obj) {
        double d7 = (i & 1) != 0 ? accelerometerData.accelerometerX : d;
        double d8 = (i & 2) != 0 ? accelerometerData.accelerometerY : d2;
        double d9 = (i & 4) != 0 ? accelerometerData.accelerometerZ : d3;
        double d10 = (i & 8) != 0 ? accelerometerData.gyroscopeX : d4;
        double d11 = (i & 16) != 0 ? accelerometerData.gyroscopeY : d5;
        double d12 = (i & 32) != 0 ? accelerometerData.gyroscopeZ : d6;
        int i2 = f2436044504450445;
        if (((f24350445044504450445 + i2) * i2) % f2438044504450445 != f2437044504450445) {
            f2436044504450445 = 80;
            f2437044504450445 = 80;
        }
        return accelerometerData.copy(d7, d8, d9, d10, d11, d12);
    }

    /* renamed from: х044504450445х04450445, reason: contains not printable characters */
    public static int m1327404450445044504450445() {
        return 0;
    }

    /* renamed from: х04450445хх04450445, reason: contains not printable characters */
    public static int m132750445044504450445() {
        return 1;
    }

    /* renamed from: хх04450445х04450445, reason: contains not printable characters */
    public static int m132760445044504450445() {
        return 66;
    }

    /* renamed from: хххх044504450445, reason: contains not printable characters */
    public static int m13277044504450445() {
        return 2;
    }

    public final double component1() {
        int i = f2436044504450445;
        if ((i * (f24350445044504450445 + i)) % f2438044504450445 != 0) {
            f2436044504450445 = m132760445044504450445();
            f2437044504450445 = m132760445044504450445();
        }
        return this.accelerometerX;
    }

    public final double component2() {
        int i = f2436044504450445;
        if (((f24350445044504450445 + i) * i) % f2438044504450445 != f2437044504450445) {
            if (((i + m132750445044504450445()) * f2436044504450445) % f2438044504450445 != f2437044504450445) {
                f2436044504450445 = 25;
                f2437044504450445 = m132760445044504450445();
            }
            f2436044504450445 = m132760445044504450445();
            f2437044504450445 = m132760445044504450445();
        }
        return this.accelerometerY;
    }

    public final double component3() {
        double d = this.accelerometerZ;
        int i = f2436044504450445;
        if (((f24350445044504450445 + i) * i) % f2438044504450445 != f2437044504450445) {
            f2436044504450445 = 97;
            f2437044504450445 = 97;
        }
        return d;
    }

    public final double component4() {
        if (((f2436044504450445 + m132750445044504450445()) * f2436044504450445) % f2438044504450445 != m1327404450445044504450445()) {
            f2436044504450445 = 82;
            f2437044504450445 = m132760445044504450445();
            int i = f2436044504450445;
            if (((f24350445044504450445 + i) * i) % m13277044504450445() != f2437044504450445) {
                f2436044504450445 = m132760445044504450445();
                f2437044504450445 = 94;
            }
        }
        return this.gyroscopeX;
    }

    public final double component5() {
        int i = f2436044504450445;
        if ((i * (f24350445044504450445 + i)) % f2438044504450445 != 0) {
            int m132760445044504450445 = m132760445044504450445();
            f2436044504450445 = m132760445044504450445;
            f2437044504450445 = 64;
            if ((m132760445044504450445 * (f24350445044504450445 + m132760445044504450445)) % f2438044504450445 != 0) {
                f2436044504450445 = m132760445044504450445();
                f2437044504450445 = m132760445044504450445();
            }
        }
        return this.gyroscopeY;
    }

    public final double component6() {
        int i = f2436044504450445;
        int i2 = f24350445044504450445;
        int i3 = i * (i + i2);
        int i4 = f2438044504450445;
        if (i3 % i4 != 0) {
            f2436044504450445 = 86;
            f2437044504450445 = 92;
        }
        int i5 = f2436044504450445;
        if (((i2 + i5) * i5) % i4 != f2437044504450445) {
            f2436044504450445 = 7;
            f2437044504450445 = 82;
        }
        return this.gyroscopeZ;
    }

    public final AccelerometerData copy(double accelerometerX, double accelerometerY, double accelerometerZ, double gyroscopeX, double gyroscopeY, double gyroscopeZ) {
        AccelerometerData accelerometerData = new AccelerometerData(accelerometerX, accelerometerY, accelerometerZ, gyroscopeX, gyroscopeY, gyroscopeZ);
        int i = f2436044504450445;
        int i2 = f24350445044504450445;
        int i3 = f2438044504450445;
        if (((i + i2) * i) % i3 != f2437044504450445) {
            if ((i * (i2 + i)) % i3 != 0) {
                f2436044504450445 = m132760445044504450445();
                f2437044504450445 = m132760445044504450445();
            }
            f2436044504450445 = m132760445044504450445();
            f2437044504450445 = 71;
        }
        return accelerometerData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccelerometerData)) {
            return false;
        }
        AccelerometerData accelerometerData = (AccelerometerData) other;
        if (Double.compare(this.accelerometerX, accelerometerData.accelerometerX) != 0 || Double.compare(this.accelerometerY, accelerometerData.accelerometerY) != 0 || Double.compare(this.accelerometerZ, accelerometerData.accelerometerZ) != 0 || Double.compare(this.gyroscopeX, accelerometerData.gyroscopeX) != 0 || Double.compare(this.gyroscopeY, accelerometerData.gyroscopeY) != 0) {
            return false;
        }
        int compare = Double.compare(this.gyroscopeZ, accelerometerData.gyroscopeZ);
        int i = f2436044504450445;
        if (((f24350445044504450445 + i) * i) % m13277044504450445() != f2437044504450445) {
            f2436044504450445 = 6;
            f2437044504450445 = 38;
        }
        if (compare == 0) {
            return true;
        }
        int i2 = f2436044504450445;
        if (((f24350445044504450445 + i2) * i2) % f2438044504450445 != m1327404450445044504450445()) {
            f2436044504450445 = m132760445044504450445();
            f2437044504450445 = m132760445044504450445();
        }
        return false;
    }

    public final double getAccelerometerX() {
        int i = f2436044504450445;
        if (((f24350445044504450445 + i) * i) % f2438044504450445 != f2437044504450445) {
            f2436044504450445 = m132760445044504450445();
            f2437044504450445 = 39;
        }
        return this.accelerometerX;
    }

    public final double getAccelerometerY() {
        int i = f2436044504450445;
        int i2 = f24350445044504450445;
        int i3 = f2438044504450445;
        int i4 = ((i + i2) * i) % i3;
        int i5 = f2437044504450445;
        if ((i * (i2 + i)) % i3 != 0) {
            f2436044504450445 = 4;
            f2437044504450445 = 35;
        }
        if (i4 != i5) {
            f2436044504450445 = 88;
            f2437044504450445 = 42;
        }
        return this.accelerometerY;
    }

    public final double getAccelerometerZ() {
        if (((m132760445044504450445() + f24350445044504450445) * m132760445044504450445()) % f2438044504450445 != f2437044504450445) {
            f2436044504450445 = 61;
            f2437044504450445 = m132760445044504450445();
        }
        double d = this.accelerometerZ;
        int i = f2436044504450445;
        if (((f24350445044504450445 + i) * i) % f2438044504450445 != f2437044504450445) {
            f2436044504450445 = 67;
            f2437044504450445 = 84;
        }
        return d;
    }

    public final double getGyroscopeX() {
        double d = this.gyroscopeX;
        if (((f2436044504450445 + m132750445044504450445()) * f2436044504450445) % f2438044504450445 != f2437044504450445) {
            f2436044504450445 = m132760445044504450445();
            f2437044504450445 = 85;
        }
        int i = f2436044504450445;
        if (((f24350445044504450445 + i) * i) % f2438044504450445 != f2437044504450445) {
            f2436044504450445 = 0;
            f2437044504450445 = 26;
        }
        return d;
    }

    public final double getGyroscopeY() {
        int i = f2436044504450445;
        int i2 = f24350445044504450445;
        int i3 = (i + i2) * i;
        int i4 = f2438044504450445;
        if (i3 % i4 != f2437044504450445) {
            f2436044504450445 = 38;
            f2437044504450445 = 8;
        }
        int i5 = f2436044504450445;
        if (((i2 + i5) * i5) % i4 != f2437044504450445) {
            f2436044504450445 = m132760445044504450445();
            f2437044504450445 = m132760445044504450445();
        }
        return this.gyroscopeY;
    }

    public final double getGyroscopeZ() {
        double d = this.gyroscopeZ;
        int i = f2436044504450445;
        int i2 = f24350445044504450445;
        int i3 = f2438044504450445;
        int i4 = ((i + i2) * i) % i3;
        int i5 = f2437044504450445;
        if (i4 != i5) {
            if (((i2 + i) * i) % i3 != i5) {
                f2436044504450445 = m132760445044504450445();
                f2437044504450445 = 64;
            }
            f2436044504450445 = m132760445044504450445();
            f2437044504450445 = m132760445044504450445();
        }
        return d;
    }

    public int hashCode() {
        int hashCode = ((((Double.hashCode(this.accelerometerX) * 31) + Double.hashCode(this.accelerometerY)) * 31) + Double.hashCode(this.accelerometerZ)) * 31;
        int i = f2436044504450445;
        if (((f24350445044504450445 + i) * i) % f2438044504450445 != m1327404450445044504450445()) {
            f2436044504450445 = m132760445044504450445();
            f2437044504450445 = 94;
        }
        int hashCode2 = (((hashCode + Double.hashCode(this.gyroscopeX)) * 31) + Double.hashCode(this.gyroscopeY)) * 31;
        int i2 = f2436044504450445;
        if ((i2 * (f24350445044504450445 + i2)) % f2438044504450445 != 0) {
            f2436044504450445 = m132760445044504450445();
            f2437044504450445 = m132760445044504450445();
        }
        return hashCode2 + Double.hashCode(this.gyroscopeZ);
    }

    public final void setAccelerometerX(double d) {
        this.accelerometerX = d;
    }

    public final void setAccelerometerY(double d) {
        this.accelerometerY = d;
        int i = f2436044504450445;
        if (((f24350445044504450445 + i) * i) % f2438044504450445 != f2437044504450445) {
            f2436044504450445 = m132760445044504450445();
            f2437044504450445 = m132760445044504450445();
            int i2 = f2436044504450445;
            if (((f24350445044504450445 + i2) * i2) % m13277044504450445() != m1327404450445044504450445()) {
                f2436044504450445 = m132760445044504450445();
                f2437044504450445 = 9;
            }
        }
    }

    public final void setAccelerometerZ(double d) {
        int i = f2436044504450445;
        if ((i * (f24350445044504450445 + i)) % f2438044504450445 != 0) {
            f2436044504450445 = 92;
            int m132760445044504450445 = m132760445044504450445();
            f2437044504450445 = m132760445044504450445;
            int i2 = f2436044504450445;
            if (((f24350445044504450445 + i2) * i2) % f2438044504450445 != m132760445044504450445) {
                f2436044504450445 = 65;
                f2437044504450445 = m132760445044504450445();
            }
        }
        this.accelerometerZ = d;
    }

    public final void setGyroscopeX(double d) {
        int i = f2436044504450445;
        if ((i * (f24350445044504450445 + i)) % f2438044504450445 != 0) {
            f2436044504450445 = 94;
            f2437044504450445 = m132760445044504450445();
        }
        this.gyroscopeX = d;
    }

    public final void setGyroscopeY(double d) {
        int i = f2436044504450445;
        int i2 = f24350445044504450445;
        int i3 = f2438044504450445;
        if (((i + i2) * i) % i3 != 0) {
            if ((i * (i2 + i)) % i3 != 0) {
                f2436044504450445 = m132760445044504450445();
                f2437044504450445 = 85;
            }
            f2436044504450445 = m132760445044504450445();
            f2437044504450445 = 73;
        }
        this.gyroscopeY = d;
    }

    public final void setGyroscopeZ(double d) {
        this.gyroscopeZ = d;
        int i = f2436044504450445;
        int i2 = f24350445044504450445;
        int i3 = f2438044504450445;
        if (((i + i2) * i) % i3 != f2437044504450445) {
            if ((i * (i2 + i)) % i3 != 0) {
                f2436044504450445 = 56;
                f2437044504450445 = 58;
            }
            f2436044504450445 = 7;
            f2437044504450445 = m132760445044504450445();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccelerometerData(accelerometerX=");
        sb.append(this.accelerometerX);
        sb.append(", accelerometerY=");
        sb.append(this.accelerometerY);
        sb.append(", accelerometerZ=");
        sb.append(this.accelerometerZ);
        sb.append(", gyroscopeX=");
        sb.append(this.gyroscopeX);
        sb.append(", gyroscopeY=");
        sb.append(this.gyroscopeY);
        sb.append(", gyroscopeZ=");
        sb.append(this.gyroscopeZ);
        int i = f2436044504450445;
        if ((i * (f24350445044504450445 + i)) % f2438044504450445 != 0) {
            f2436044504450445 = m132760445044504450445();
            f2437044504450445 = m132760445044504450445();
        }
        int m132760445044504450445 = m132760445044504450445();
        if ((m132760445044504450445 * (f24350445044504450445 + m132760445044504450445)) % f2438044504450445 != 0) {
            f2436044504450445 = 89;
            f2437044504450445 = m132760445044504450445();
        }
        sb.append(')');
        return sb.toString();
    }
}
