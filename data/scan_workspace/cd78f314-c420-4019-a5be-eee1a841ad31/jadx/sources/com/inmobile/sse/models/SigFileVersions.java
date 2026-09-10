package com.inmobile.sse.models;

import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.jvm.internal.Intrinsics;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/inmobile/sse/models/SigFileVersions;", "", "latestRootVersion", "", "latestMalwareVersion", "latestLogConfigVersion", "latestLocalModelVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLatestLocalModelVersion", "()Ljava/lang/String;", "getLatestLogConfigVersion", "getLatestMalwareVersion", "getLatestRootVersion", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SigFileVersions {

    /* renamed from: Ѩ04680468Ѩ0468Ѩ0468, reason: contains not printable characters */
    public static int f25830468046804680468 = 2;

    /* renamed from: Ѩ0468ѨѨ0468Ѩ0468, reason: contains not printable characters */
    public static int f2584046804680468 = 0;

    /* renamed from: ѨѨ0468Ѩ0468Ѩ0468, reason: contains not printable characters */
    public static int f2585046804680468 = 1;

    /* renamed from: ѨѨѨѨ0468Ѩ0468, reason: contains not printable characters */
    public static int f258604680468 = 86;

    @SerializedName("latest_local_model_version")
    private final String latestLocalModelVersion;

    @SerializedName("latest_log_config_version")
    private final String latestLogConfigVersion;

    @SerializedName("latest_malware_version")
    private final String latestMalwareVersion;

    @SerializedName("latest_root_version")
    private final String latestRootVersion;

    public SigFileVersions(String latestRootVersion, String latestMalwareVersion, String latestLogConfigVersion, String latestLocalModelVersion) {
        Intrinsics.checkNotNullParameter(latestRootVersion, "latestRootVersion");
        Intrinsics.checkNotNullParameter(latestMalwareVersion, "latestMalwareVersion");
        Intrinsics.checkNotNullParameter(latestLogConfigVersion, "latestLogConfigVersion");
        Intrinsics.checkNotNullParameter(latestLocalModelVersion, "latestLocalModelVersion");
        this.latestRootVersion = latestRootVersion;
        this.latestMalwareVersion = latestMalwareVersion;
        this.latestLogConfigVersion = latestLogConfigVersion;
        this.latestLocalModelVersion = latestLocalModelVersion;
    }

    public static /* synthetic */ SigFileVersions copy$default(SigFileVersions sigFileVersions, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sigFileVersions.latestRootVersion;
        }
        if ((i & 2) != 0) {
            str2 = sigFileVersions.latestMalwareVersion;
        }
        if ((i & 4) != 0) {
            str3 = sigFileVersions.latestLogConfigVersion;
        }
        if ((i & 8) != 0) {
            str4 = sigFileVersions.latestLocalModelVersion;
            int i2 = f258604680468;
            if (((f2585046804680468 + i2) * i2) % f25830468046804680468 != f2584046804680468) {
                f258604680468 = m13430046804680468();
                f2584046804680468 = m13430046804680468();
            }
        }
        return sigFileVersions.copy(str, str2, str3, str4);
    }

    /* renamed from: Ѩ0468046804680468Ѩ0468, reason: contains not printable characters */
    public static int m1342704680468046804680468() {
        return 0;
    }

    /* renamed from: Ѩ0468Ѩ04680468Ѩ0468, reason: contains not printable characters */
    public static int m134280468046804680468() {
        return 2;
    }

    /* renamed from: ѨѨ046804680468Ѩ0468, reason: contains not printable characters */
    public static int m134290468046804680468() {
        return 1;
    }

    /* renamed from: ѨѨѨ04680468Ѩ0468, reason: contains not printable characters */
    public static int m13430046804680468() {
        return 58;
    }

    public final String component1() {
        if (((m13430046804680468() + f2585046804680468) * m13430046804680468()) % f25830468046804680468 != f2584046804680468) {
            f258604680468 = 48;
            f2584046804680468 = 2;
            int m13430046804680468 = m13430046804680468();
            if ((m13430046804680468 * (f2585046804680468 + m13430046804680468)) % f25830468046804680468 != 0) {
                f258604680468 = m13430046804680468();
                f2584046804680468 = 10;
            }
        }
        return this.latestRootVersion;
    }

    public final String component2() {
        String str = this.latestMalwareVersion;
        int i = f258604680468;
        if (((f2585046804680468 + i) * i) % f25830468046804680468 != f2584046804680468) {
            f258604680468 = 46;
            f2584046804680468 = m13430046804680468();
        }
        return str;
    }

    public final String component3() {
        int m13430046804680468 = m13430046804680468() + m134290468046804680468();
        int m134300468046804682 = m13430046804680468();
        int m134300468046804683 = m13430046804680468();
        if ((m134300468046804683 * (f2585046804680468 + m134300468046804683)) % f25830468046804680468 != 0) {
            f258604680468 = m13430046804680468();
            f2584046804680468 = m13430046804680468();
        }
        if ((m13430046804680468 * m134300468046804682) % f25830468046804680468 != f2584046804680468) {
            f258604680468 = m13430046804680468();
            f2584046804680468 = m13430046804680468();
        }
        return this.latestLogConfigVersion;
    }

    public final String component4() {
        int i = f258604680468;
        if (((f2585046804680468 + i) * i) % f25830468046804680468 != f2584046804680468) {
            f258604680468 = m13430046804680468();
            f2584046804680468 = m13430046804680468();
        }
        return this.latestLocalModelVersion;
    }

    public final SigFileVersions copy(String latestRootVersion, String latestMalwareVersion, String latestLogConfigVersion, String latestLocalModelVersion) {
        Intrinsics.checkNotNullParameter(latestRootVersion, "latestRootVersion");
        Intrinsics.checkNotNullParameter(latestMalwareVersion, "latestMalwareVersion");
        int i = f258604680468;
        int i2 = f2585046804680468;
        int i3 = (i + i2) * i;
        int i4 = f25830468046804680468;
        if (i3 % i4 != f2584046804680468) {
            f258604680468 = 77;
            f2584046804680468 = 83;
            if (((i2 + 77) * 77) % i4 != 83) {
                f258604680468 = m13430046804680468();
                f2584046804680468 = 1;
            }
        }
        Intrinsics.checkNotNullParameter(latestLogConfigVersion, "latestLogConfigVersion");
        Intrinsics.checkNotNullParameter(latestLocalModelVersion, "latestLocalModelVersion");
        return new SigFileVersions(latestRootVersion, latestMalwareVersion, latestLogConfigVersion, latestLocalModelVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SigFileVersions)) {
            return false;
        }
        SigFileVersions sigFileVersions = (SigFileVersions) other;
        if (Intrinsics.areEqual(this.latestRootVersion, sigFileVersions.latestRootVersion)) {
            return Intrinsics.areEqual(this.latestMalwareVersion, sigFileVersions.latestMalwareVersion) && Intrinsics.areEqual(this.latestLogConfigVersion, sigFileVersions.latestLogConfigVersion) && Intrinsics.areEqual(this.latestLocalModelVersion, sigFileVersions.latestLocalModelVersion);
        }
        int i = f258604680468;
        int i2 = f2585046804680468;
        int i3 = f25830468046804680468;
        if (((i + i2) * i) % i3 != f2584046804680468) {
            f258604680468 = 99;
            f2584046804680468 = 21;
        }
        if ((i * (i2 + i)) % i3 != 0) {
            f258604680468 = 32;
            f2584046804680468 = 83;
        }
        return false;
    }

    public final String getLatestLocalModelVersion() {
        String str = this.latestLocalModelVersion;
        int m13430046804680468 = m13430046804680468();
        int i = f258604680468;
        if (((f2585046804680468 + i) * i) % m134280468046804680468() != f2584046804680468) {
            f258604680468 = 34;
            f2584046804680468 = m13430046804680468();
        }
        if (((m13430046804680468 + f2585046804680468) * m13430046804680468()) % f25830468046804680468 != f2584046804680468) {
            f258604680468 = m13430046804680468();
            f2584046804680468 = m13430046804680468();
        }
        return str;
    }

    public final String getLatestLogConfigVersion() {
        int i = f258604680468;
        if ((i * (f2585046804680468 + i)) % f25830468046804680468 != 0) {
            f258604680468 = 72;
            int m13430046804680468 = m13430046804680468();
            f2584046804680468 = m13430046804680468;
            int i2 = f258604680468;
            if (((f2585046804680468 + i2) * i2) % f25830468046804680468 != m13430046804680468) {
                f258604680468 = 92;
                f2584046804680468 = m13430046804680468();
            }
        }
        return this.latestLogConfigVersion;
    }

    public final String getLatestMalwareVersion() {
        int m13430046804680468 = m13430046804680468();
        if ((m13430046804680468 * (f2585046804680468 + m13430046804680468)) % f25830468046804680468 != 0) {
            f258604680468 = 38;
            f2584046804680468 = m13430046804680468();
        }
        String str = this.latestMalwareVersion;
        int i = f258604680468;
        if (((f2585046804680468 + i) * i) % f25830468046804680468 != f2584046804680468) {
            f258604680468 = 11;
            f2584046804680468 = m13430046804680468();
        }
        return str;
    }

    public final String getLatestRootVersion() {
        int i = f258604680468;
        if (((f2585046804680468 + i) * i) % f25830468046804680468 != f2584046804680468) {
            f258604680468 = 14;
            f2584046804680468 = m13430046804680468();
        }
        return this.latestRootVersion;
    }

    public int hashCode() {
        int hashCode = this.latestRootVersion.hashCode() * 31;
        String str = this.latestMalwareVersion;
        int i = f258604680468;
        if (((f2585046804680468 + i) * i) % f25830468046804680468 != f2584046804680468) {
            f258604680468 = 0;
            f2584046804680468 = m13430046804680468();
        }
        int hashCode2 = ((hashCode + str.hashCode()) * 31) + this.latestLogConfigVersion.hashCode();
        int i2 = f258604680468;
        if (((f2585046804680468 + i2) * i2) % f25830468046804680468 != f2584046804680468) {
            f258604680468 = 2;
            f2584046804680468 = m13430046804680468();
        }
        return (hashCode2 * 31) + this.latestLocalModelVersion.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = f258604680468;
        if (((f2585046804680468 + i) * i) % f25830468046804680468 != m1342704680468046804680468()) {
            f258604680468 = m13430046804680468();
            f2584046804680468 = m13430046804680468();
        }
        sb.append("SigFileVersions(latestRootVersion=");
        sb.append(this.latestRootVersion);
        sb.append(", latestMalwareVersion=");
        sb.append(this.latestMalwareVersion);
        sb.append(", latestLogConfigVersion=");
        int i2 = f258604680468;
        if (((f2585046804680468 + i2) * i2) % f25830468046804680468 != f2584046804680468) {
            f258604680468 = m13430046804680468();
            f2584046804680468 = m13430046804680468();
        }
        sb.append(this.latestLogConfigVersion);
        sb.append(", latestLocalModelVersion=");
        sb.append(this.latestLocalModelVersion);
        sb.append(')');
        return sb.toString();
    }
}
