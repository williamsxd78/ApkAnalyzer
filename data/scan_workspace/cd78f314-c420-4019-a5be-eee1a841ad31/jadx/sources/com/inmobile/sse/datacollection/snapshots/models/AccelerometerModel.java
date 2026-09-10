package com.inmobile.sse.datacollection.snapshots.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/inmobile/sse/datacollection/snapshots/models/AccelerometerModel;", "", "totalAcceleration", "", "isMoving", "(Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "getTotalAcceleration", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccelerometerModel {

    /* renamed from: Ѿ047E047EѾ047EѾѾ, reason: contains not printable characters */
    public static int f2347047E047E047E = 0;

    /* renamed from: Ѿ047EѾѾ047EѾѾ, reason: contains not printable characters */
    public static int f2348047E047E = 2;

    /* renamed from: ѾѾ047EѾ047EѾѾ, reason: contains not printable characters */
    public static int f2349047E047E = 93;

    /* renamed from: ѾѾѾѾ047EѾѾ, reason: contains not printable characters */
    public static int f2350047E = 1;
    private final String isMoving;
    private final String totalAcceleration;

    public AccelerometerModel(String totalAcceleration, String isMoving) {
        Intrinsics.checkNotNullParameter(totalAcceleration, "totalAcceleration");
        Intrinsics.checkNotNullParameter(isMoving, "isMoving");
        this.totalAcceleration = totalAcceleration;
        this.isMoving = isMoving;
    }

    public static /* synthetic */ AccelerometerModel copy$default(AccelerometerModel accelerometerModel, String str, String str2, int i, Object obj) {
        int i2 = i & 1;
        int i3 = f2349047E047E;
        if ((i3 * (f2350047E + i3)) % f2348047E047E != 0) {
            f2349047E047E = 72;
            f2350047E = m13186047E047E047E();
        }
        if (i2 != 0) {
            str = accelerometerModel.totalAcceleration;
        }
        if ((i & 2) != 0) {
            str2 = accelerometerModel.isMoving;
        }
        return accelerometerModel.copy(str, str2);
    }

    /* renamed from: Ѿ047E047E047EѾѾѾ, reason: contains not printable characters */
    public static int m13186047E047E047E() {
        return 24;
    }

    /* renamed from: Ѿ047EѾ047E047EѾѾ, reason: contains not printable characters */
    public static int m13187047E047E047E() {
        return 1;
    }

    /* renamed from: ѾѾ047E047E047EѾѾ, reason: contains not printable characters */
    public static int m13188047E047E047E() {
        return 2;
    }

    /* renamed from: ѾѾѾ047E047EѾѾ, reason: contains not printable characters */
    public static int m13189047E047E() {
        return 0;
    }

    public final String component1() {
        String str = this.totalAcceleration;
        int i = f2349047E047E;
        int i2 = f2350047E;
        int i3 = i * (i + i2);
        int i4 = f2348047E047E;
        if (i3 % i4 != 0) {
            f2349047E047E = 78;
            f2347047E047E047E = 19;
            if (((i2 + 78) * 78) % i4 != 19) {
                f2349047E047E = 57;
                f2347047E047E047E = 63;
            }
        }
        return str;
    }

    public final String component2() {
        int i = f2349047E047E;
        if ((i * (f2350047E + i)) % f2348047E047E != 0) {
            f2349047E047E = m13186047E047E047E();
            f2347047E047E047E = 39;
        }
        return this.isMoving;
    }

    public final AccelerometerModel copy(String totalAcceleration, String isMoving) {
        Intrinsics.checkNotNullParameter(totalAcceleration, "totalAcceleration");
        if (((f2349047E047E + m13187047E047E047E()) * f2349047E047E) % f2348047E047E != m13189047E047E()) {
            f2349047E047E = m13186047E047E047E();
            int m13186047E047E047E = m13186047E047E047E();
            f2347047E047E047E = m13186047E047E047E;
            int i = f2349047E047E;
            if (((f2350047E + i) * i) % f2348047E047E != m13186047E047E047E) {
                f2349047E047E = 72;
                f2347047E047E047E = 26;
            }
        }
        Intrinsics.checkNotNullParameter(isMoving, "isMoving");
        return new AccelerometerModel(totalAcceleration, isMoving);
    }

    public boolean equals(Object other) {
        int i = f2349047E047E;
        if ((i * (f2350047E + i)) % f2348047E047E != 0) {
            f2349047E047E = 7;
            f2347047E047E047E = m13186047E047E047E();
        }
        int i2 = f2349047E047E;
        if (((f2350047E + i2) * i2) % f2348047E047E != f2347047E047E047E) {
            f2349047E047E = m13186047E047E047E();
            f2347047E047E047E = 21;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccelerometerModel)) {
            return false;
        }
        AccelerometerModel accelerometerModel = (AccelerometerModel) other;
        return Intrinsics.areEqual(this.totalAcceleration, accelerometerModel.totalAcceleration) && Intrinsics.areEqual(this.isMoving, accelerometerModel.isMoving);
    }

    public final String getTotalAcceleration() {
        int i = f2349047E047E;
        if ((i * (f2350047E + i)) % f2348047E047E != 0) {
            f2349047E047E = 3;
            f2350047E = m13186047E047E047E();
        }
        String str = this.totalAcceleration;
        int i2 = f2349047E047E;
        if (((f2350047E + i2) * i2) % f2348047E047E != f2347047E047E047E) {
            f2349047E047E = m13186047E047E047E();
            f2347047E047E047E = 45;
        }
        return str;
    }

    public int hashCode() {
        int hashCode = (this.totalAcceleration.hashCode() * 31) + this.isMoving.hashCode();
        if (((m13186047E047E047E() + f2350047E) * m13186047E047E047E()) % f2348047E047E != m13189047E047E()) {
            int i = f2349047E047E;
            if ((i * (f2350047E + i)) % f2348047E047E != 0) {
                f2349047E047E = m13186047E047E047E();
                f2347047E047E047E = 44;
            }
            f2349047E047E = m13186047E047E047E();
            f2347047E047E047E = 5;
        }
        return hashCode;
    }

    public final String isMoving() {
        int i = f2349047E047E;
        if (((f2350047E + i) * i) % f2348047E047E != f2347047E047E047E) {
            f2349047E047E = 88;
            f2347047E047E047E = m13186047E047E047E();
        }
        return this.isMoving;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AccelerometerModel(totalAcceleration=");
        sb.append(this.totalAcceleration);
        sb.append(", isMoving=");
        String str = this.isMoving;
        int i = f2349047E047E;
        if (((f2350047E + i) * i) % f2348047E047E != m13189047E047E()) {
            f2349047E047E = 69;
            f2347047E047E047E = 37;
        }
        sb.append(str);
        int i2 = f2349047E047E;
        if ((i2 * (m13187047E047E047E() + i2)) % m13188047E047E047E() != 0) {
            f2349047E047E = 25;
            f2347047E047E047E = m13186047E047E047E();
        }
        sb.append(')');
        return sb.toString();
    }
}
