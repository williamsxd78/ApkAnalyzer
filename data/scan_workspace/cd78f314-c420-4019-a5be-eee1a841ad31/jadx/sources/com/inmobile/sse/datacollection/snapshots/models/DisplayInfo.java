package com.inmobile.sse.datacollection.snapshots.models;

import android.util.DisplayMetrics;
import androidx.constraintlayout.motion.widget.Key;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/inmobile/sse/datacollection/snapshots/models/DisplayInfo;", "", "metrics", "Landroid/util/DisplayMetrics;", Key.ROTATION, "", "(Landroid/util/DisplayMetrics;I)V", "getMetrics", "()Landroid/util/DisplayMetrics;", "getRotation", "()I", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DisplayInfo {

    /* renamed from: Ѿ047E047E047E047EѾѾ, reason: contains not printable characters */
    public static int f2351047E047E047E047E = 28;

    /* renamed from: Ѿ047EѾ047EѾ047EѾ, reason: contains not printable characters */
    public static int f2352047E047E047E = 0;

    /* renamed from: Ѿ047EѾѾѾ047EѾ, reason: contains not printable characters */
    public static int f2353047E047E = 1;

    /* renamed from: ѾѾ047EѾѾ047EѾ, reason: contains not printable characters */
    public static int f2354047E047E = 2;
    private final DisplayMetrics metrics;
    private final int rotation;

    public DisplayInfo(DisplayMetrics metrics, int i) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.metrics = metrics;
        this.rotation = i;
    }

    public static /* synthetic */ DisplayInfo copy$default(DisplayInfo displayInfo, DisplayMetrics displayMetrics, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            displayMetrics = displayInfo.metrics;
        }
        int i3 = f2351047E047E047E047E;
        if ((i3 * (f2353047E047E + i3)) % m13192047E047E() != 0) {
            f2351047E047E047E047E = 6;
            f2353047E047E = 93;
        }
        if ((i2 & 2) != 0) {
            i = displayInfo.rotation;
            int i4 = f2351047E047E047E047E;
            if (((f2353047E047E + i4) * i4) % f2354047E047E != m13193047E()) {
                f2351047E047E047E047E = 91;
                f2353047E047E = m13190047E047E047E();
            }
        }
        return displayInfo.copy(displayMetrics, i);
    }

    /* renamed from: Ѿ047E047EѾѾ047EѾ, reason: contains not printable characters */
    public static int m13190047E047E047E() {
        return 48;
    }

    /* renamed from: ѾѾ047E047EѾ047EѾ, reason: contains not printable characters */
    public static int m13191047E047E047E() {
        return 1;
    }

    /* renamed from: ѾѾѾ047EѾ047EѾ, reason: contains not printable characters */
    public static int m13192047E047E() {
        return 2;
    }

    /* renamed from: ѾѾѾѾѾ047EѾ, reason: contains not printable characters */
    public static int m13193047E() {
        return 0;
    }

    public final DisplayMetrics component1() {
        DisplayMetrics displayMetrics = this.metrics;
        if (((m13190047E047E047E() + m13191047E047E047E()) * m13190047E047E047E()) % m13192047E047E() != f2352047E047E047E) {
            f2351047E047E047E047E = 50;
            if ((50 * (f2353047E047E + 50)) % f2354047E047E != 0) {
                f2351047E047E047E047E = m13190047E047E047E();
                f2352047E047E047E = 52;
            }
            f2352047E047E047E = m13190047E047E047E();
        }
        return displayMetrics;
    }

    public final int component2() {
        int i = this.rotation;
        int i2 = f2351047E047E047E047E;
        if ((i2 * (f2353047E047E + i2)) % m13192047E047E() != 0) {
            if (((m13190047E047E047E() + m13191047E047E047E()) * m13190047E047E047E()) % f2354047E047E != f2352047E047E047E) {
                f2351047E047E047E047E = m13190047E047E047E();
                f2352047E047E047E = m13190047E047E047E();
            }
            f2351047E047E047E047E = 57;
            f2352047E047E047E = 77;
        }
        return i;
    }

    public final DisplayInfo copy(DisplayMetrics metrics, int rotation) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        DisplayInfo displayInfo = new DisplayInfo(metrics, rotation);
        int m13191047E047E047E = f2351047E047E047E047E + m13191047E047E047E();
        int i = f2351047E047E047E047E;
        int i2 = f2354047E047E;
        int i3 = (m13191047E047E047E * i) % i2;
        if (((f2353047E047E + i) * i) % i2 != f2352047E047E047E) {
            f2351047E047E047E047E = 97;
            f2352047E047E047E = 25;
        }
        if (i3 != f2352047E047E047E) {
            f2351047E047E047E047E = m13190047E047E047E();
            f2352047E047E047E = 19;
        }
        return displayInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayInfo)) {
            return false;
        }
        DisplayInfo displayInfo = (DisplayInfo) other;
        if (!Intrinsics.areEqual(this.metrics, displayInfo.metrics) || this.rotation != displayInfo.rotation) {
            return false;
        }
        int i = f2351047E047E047E047E;
        int i2 = f2353047E047E;
        int i3 = (i + i2) * i;
        int i4 = f2354047E047E;
        if (((i2 + i) * i) % i4 != f2352047E047E047E) {
            f2351047E047E047E047E = 20;
            f2352047E047E047E = 45;
        }
        if (i3 % i4 != 0) {
            f2351047E047E047E047E = m13190047E047E047E();
            f2352047E047E047E = 97;
        }
        return true;
    }

    public final DisplayMetrics getMetrics() {
        int i = f2351047E047E047E047E;
        int i2 = f2353047E047E;
        int i3 = (i + i2) * i;
        int i4 = f2354047E047E;
        if (((i2 + i) * i) % i4 != f2352047E047E047E) {
            f2351047E047E047E047E = m13190047E047E047E();
            f2352047E047E047E = m13190047E047E047E();
        }
        if (i3 % i4 != f2352047E047E047E) {
            f2351047E047E047E047E = m13190047E047E047E();
            f2352047E047E047E = m13190047E047E047E();
        }
        return this.metrics;
    }

    public final int getRotation() {
        int i = f2351047E047E047E047E;
        if (((f2353047E047E + i) * i) % f2354047E047E != f2352047E047E047E) {
            f2351047E047E047E047E = m13190047E047E047E();
            f2352047E047E047E = 25;
        }
        int i2 = this.rotation;
        int i3 = f2351047E047E047E047E;
        if ((i3 * (f2353047E047E + i3)) % f2354047E047E != 0) {
            f2351047E047E047E047E = 67;
            f2352047E047E047E = 99;
        }
        return i2;
    }

    public int hashCode() {
        int hashCode = this.metrics.hashCode() * 31;
        int hashCode2 = Integer.hashCode(this.rotation);
        if (((m13190047E047E047E() + m13191047E047E047E()) * m13190047E047E047E()) % f2354047E047E != f2352047E047E047E) {
            f2351047E047E047E047E = 55;
            f2352047E047E047E = 52;
        }
        return hashCode + hashCode2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DisplayInfo(metrics=");
        sb.append(this.metrics);
        sb.append(", rotation=");
        int i = this.rotation;
        if (((f2351047E047E047E047E + m13191047E047E047E()) * f2351047E047E047E047E) % m13192047E047E() != m13193047E()) {
            f2351047E047E047E047E = m13190047E047E047E();
            f2352047E047E047E = m13190047E047E047E();
        }
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }
}
