package com.inmobile.sse.models;

import com.google.gson.annotations.SerializedName;
import com.inmobile.sse.constants.InternalMMEConstants;
import com.vivaaerobus.app.analytics.presentation.AnalyticsConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/inmobile/sse/models/ServerInstructionSet;", "", AnalyticsConstants.SETTINGS_VALUE, "Lcom/inmobile/sse/models/ServerInstructionSet$Settings;", "license", "Lcom/inmobile/sse/models/ServerInstructionSet$License;", "(Lcom/inmobile/sse/models/ServerInstructionSet$Settings;Lcom/inmobile/sse/models/ServerInstructionSet$License;)V", "getLicense", "()Lcom/inmobile/sse/models/ServerInstructionSet$License;", "getSettings", "()Lcom/inmobile/sse/models/ServerInstructionSet$Settings;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "", "License", "ReplayDetection", "Settings", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServerInstructionSet {

    /* renamed from: шш04480448044804480448, reason: contains not printable characters */
    public static int f256304480448044804480448 = 5;

    /* renamed from: Ѩ04680468ѨѨѨѨ, reason: contains not printable characters */
    public static int f256404680468 = 2;

    /* renamed from: Ѩ0468ѨѨѨѨѨ, reason: contains not printable characters */
    public static int f25650468 = 0;

    /* renamed from: ѨѨ0468ѨѨѨѨ, reason: contains not printable characters */
    public static int f25660468 = 1;
    private final License license;
    private final Settings settings;

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/inmobile/sse/models/ServerInstructionSet$License;", "", InternalMMEConstants.ENTITLEMENTS, "", "", "expirationDate", "", "(Ljava/util/List;J)V", "getEntitlements", "()Ljava/util/List;", "getExpirationDate", "()J", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class License {

        /* renamed from: Ѩ04680468Ѩ0468ѨѨ, reason: contains not printable characters */
        public static int f2567046804680468 = 2;

        /* renamed from: Ѩ0468ѨѨ0468ѨѨ, reason: contains not printable characters */
        public static int f256804680468 = 0;

        /* renamed from: ѨѨ0468Ѩ0468ѨѨ, reason: contains not printable characters */
        public static int f256904680468 = 1;

        /* renamed from: ѨѨѨѨ0468ѨѨ, reason: contains not printable characters */
        public static int f25700468 = 51;
        private final List<String> entitlements;

        @SerializedName("expiration_date")
        private final long expirationDate;

        public License(List<String> entitlements, long j) {
            Intrinsics.checkNotNullParameter(entitlements, "entitlements");
            this.entitlements = entitlements;
            this.expirationDate = j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ License copy$default(License license, List list, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                list = license.entitlements;
            }
            if ((i & 2) != 0) {
                j = license.expirationDate;
                int i2 = f25700468;
                int i3 = f256904680468;
                int i4 = f2567046804680468;
                int i5 = ((i2 + i3) * i2) % i4;
                int i6 = f256804680468;
                if (i5 != i6) {
                    if (((i3 + i2) * i2) % i4 != i6) {
                        f25700468 = 52;
                        f256804680468 = m1341404680468();
                    }
                    f25700468 = m1341404680468();
                    f256804680468 = m1341404680468();
                }
            }
            return license.copy(list, j);
        }

        /* renamed from: Ѩ0468046804680468ѨѨ, reason: contains not printable characters */
        public static int m134110468046804680468() {
            return 1;
        }

        /* renamed from: Ѩ0468Ѩ04680468ѨѨ, reason: contains not printable characters */
        public static int m13412046804680468() {
            return 0;
        }

        /* renamed from: ѨѨ046804680468ѨѨ, reason: contains not printable characters */
        public static int m13413046804680468() {
            return 2;
        }

        /* renamed from: ѨѨѨ04680468ѨѨ, reason: contains not printable characters */
        public static int m1341404680468() {
            return 31;
        }

        public final List<String> component1() {
            int i = f25700468;
            if ((i * (f256904680468 + i)) % m13413046804680468() != 0) {
                f25700468 = m1341404680468();
                f256804680468 = 60;
            }
            return this.entitlements;
        }

        public final long component2() {
            long j = this.expirationDate;
            if (((f25700468 + m134110468046804680468()) * f25700468) % f2567046804680468 != f256804680468) {
                f25700468 = m1341404680468();
                f256804680468 = 84;
            }
            int i = f25700468;
            if (((f256904680468 + i) * i) % f2567046804680468 != f256804680468) {
                f25700468 = m1341404680468();
                f256804680468 = m1341404680468();
            }
            return j;
        }

        public final License copy(List<String> entitlements, long expirationDate) {
            Intrinsics.checkNotNullParameter(entitlements, "entitlements");
            int i = f25700468;
            int i2 = f256904680468;
            int i3 = f2567046804680468;
            if (((i + i2) * i) % i3 != f256804680468) {
                if ((i * (i2 + i)) % i3 != 0) {
                    f25700468 = 69;
                    f256804680468 = 97;
                }
                f25700468 = m1341404680468();
                f256804680468 = 93;
            }
            return new License(entitlements, expirationDate);
        }

        public boolean equals(Object other) {
            if (((f25700468 + m134110468046804680468()) * f25700468) % f2567046804680468 != f256804680468) {
                f25700468 = m1341404680468();
                f256804680468 = 65;
            }
            if (this == other) {
                return true;
            }
            if (!(other instanceof License)) {
                return false;
            }
            License license = (License) other;
            return Intrinsics.areEqual(this.entitlements, license.entitlements) && this.expirationDate == license.expirationDate;
        }

        public final List<String> getEntitlements() {
            int i = f25700468;
            int i2 = f256904680468;
            int i3 = (i + i2) * i;
            int i4 = f2567046804680468;
            if (((i2 + i) * i) % i4 != m13412046804680468()) {
                f25700468 = 27;
                f256804680468 = m1341404680468();
            }
            if (i3 % i4 != 0) {
                f25700468 = 71;
                f256804680468 = 77;
            }
            return this.entitlements;
        }

        public final long getExpirationDate() {
            return this.expirationDate;
        }

        public int hashCode() {
            int hashCode = this.entitlements.hashCode();
            int m1341404680468 = (m1341404680468() + f256904680468) * m1341404680468();
            int i = f25700468;
            int m134110468046804680468 = i * (m134110468046804680468() + i);
            int i2 = f2567046804680468;
            if (m134110468046804680468 % i2 != 0) {
                f25700468 = 65;
                f256804680468 = 84;
            }
            if (m1341404680468 % i2 != f256804680468) {
                f25700468 = m1341404680468();
                f256804680468 = m1341404680468();
            }
            return (hashCode * 31) + Long.hashCode(this.expirationDate);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            int i = f25700468;
            int i2 = f256904680468;
            int i3 = f2567046804680468;
            if (((i + i2) * i) % i3 != f256804680468) {
                if ((i * (i2 + i)) % i3 != 0) {
                    f25700468 = 91;
                    f256804680468 = m1341404680468();
                }
                f25700468 = 21;
                f256804680468 = m1341404680468();
            }
            sb.append("License(entitlements=");
            sb.append(this.entitlements);
            sb.append(", expirationDate=");
            sb.append(this.expirationDate);
            sb.append(')');
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/inmobile/sse/models/ServerInstructionSet$ReplayDetection;", "", "status", "", "thresholdTime", "", "(Ljava/lang/String;J)V", "getStatus", "()Ljava/lang/String;", "getThresholdTime", "()J", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ReplayDetection {

        /* renamed from: Ѩ04680468ѨѨ0468Ѩ, reason: contains not printable characters */
        public static int f2571046804680468 = 2;

        /* renamed from: Ѩ0468Ѩ0468Ѩ0468Ѩ, reason: contains not printable characters */
        public static int f2572046804680468 = 0;

        /* renamed from: ѨѨ0468ѨѨ0468Ѩ, reason: contains not printable characters */
        public static int f257304680468 = 1;

        /* renamed from: ѨѨѨѨѨ0468Ѩ, reason: contains not printable characters */
        public static int f25740468 = 30;
        private final String status;

        @SerializedName("threshold_time")
        private final long thresholdTime;

        public ReplayDetection(String status, long j) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
            this.thresholdTime = j;
        }

        public static /* synthetic */ ReplayDetection copy$default(ReplayDetection replayDetection, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = replayDetection.status;
            }
            if ((i & 2) != 0) {
                j = replayDetection.thresholdTime;
            }
            int i2 = f25740468;
            if (((f257304680468 + i2) * i2) % f2571046804680468 != m1341604680468()) {
                f25740468 = m1341804680468();
                int m1341804680468 = m1341804680468();
                f257304680468 = m1341804680468;
                int i3 = f25740468;
                if ((i3 * (m1341804680468 + i3)) % f2571046804680468 != 0) {
                    f25740468 = m1341804680468();
                    f257304680468 = m1341804680468();
                }
            }
            return replayDetection.copy(str, j);
        }

        /* renamed from: Ѩ046804680468Ѩ0468Ѩ, reason: contains not printable characters */
        public static int m134150468046804680468() {
            return 1;
        }

        /* renamed from: Ѩ0468ѨѨѨ0468Ѩ, reason: contains not printable characters */
        public static int m1341604680468() {
            return 0;
        }

        /* renamed from: ѨѨ04680468Ѩ0468Ѩ, reason: contains not printable characters */
        public static int m13417046804680468() {
            return 2;
        }

        /* renamed from: ѨѨѨ0468Ѩ0468Ѩ, reason: contains not printable characters */
        public static int m1341804680468() {
            return 71;
        }

        public final String component1() {
            int i = f25740468;
            if (((f257304680468 + i) * i) % m13417046804680468() != m1341604680468()) {
                int i2 = f25740468;
                if ((i2 * (f257304680468 + i2)) % f2571046804680468 != 0) {
                    f25740468 = m1341804680468();
                    f2572046804680468 = m1341804680468();
                }
                f25740468 = m1341804680468();
                f2572046804680468 = 26;
            }
            return this.status;
        }

        public final long component2() {
            long j = this.thresholdTime;
            int i = f25740468;
            if ((i * (f257304680468 + i)) % f2571046804680468 != 0) {
                f25740468 = 56;
                f2572046804680468 = m1341804680468();
            }
            return j;
        }

        public final ReplayDetection copy(String status, long thresholdTime) {
            Intrinsics.checkNotNullParameter(status, "status");
            ReplayDetection replayDetection = new ReplayDetection(status, thresholdTime);
            int i = f25740468;
            if (((f257304680468 + i) * i) % f2571046804680468 != f2572046804680468) {
                f25740468 = 53;
                f2572046804680468 = m1341804680468();
                int i2 = f25740468;
                if ((i2 * (f257304680468 + i2)) % f2571046804680468 != 0) {
                    f25740468 = 41;
                    f2572046804680468 = 4;
                }
            }
            return replayDetection;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReplayDetection)) {
                return false;
            }
            ReplayDetection replayDetection = (ReplayDetection) other;
            String str = this.status;
            int i = f25740468;
            if (((f257304680468 + i) * i) % f2571046804680468 != f2572046804680468) {
                f25740468 = m1341804680468();
                int m1341804680468 = m1341804680468();
                f2572046804680468 = m1341804680468;
                int i2 = f25740468;
                if (((f257304680468 + i2) * i2) % f2571046804680468 != m1341804680468) {
                    f25740468 = m1341804680468();
                    f2572046804680468 = 13;
                }
            }
            return Intrinsics.areEqual(str, replayDetection.status) && this.thresholdTime == replayDetection.thresholdTime;
        }

        public final String getStatus() {
            String str = this.status;
            int i = f25740468;
            if (((f257304680468 + i) * i) % f2571046804680468 != f2572046804680468) {
                f25740468 = m1341804680468();
                f2572046804680468 = m1341804680468();
                int m1341804680468 = m1341804680468();
                if ((m1341804680468 * (f257304680468 + m1341804680468)) % f2571046804680468 != 0) {
                    f25740468 = m1341804680468();
                    f2572046804680468 = 60;
                }
            }
            return str;
        }

        public final long getThresholdTime() {
            long j = this.thresholdTime;
            int m1341804680468 = m1341804680468() + f257304680468;
            int m13418046804682 = m1341804680468();
            int i = f25740468;
            if (((f257304680468 + i) * i) % f2571046804680468 != f2572046804680468) {
                f25740468 = 11;
                f2572046804680468 = 45;
            }
            if ((m1341804680468 * m13418046804682) % m13417046804680468() != f2572046804680468) {
                f25740468 = 42;
                f2572046804680468 = 35;
            }
            return j;
        }

        public int hashCode() {
            return (this.status.hashCode() * 31) + Long.hashCode(this.thresholdTime);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            int i = f25740468;
            if (((f257304680468 + i) * i) % f2571046804680468 != f2572046804680468) {
                f25740468 = m1341804680468();
                f2572046804680468 = 73;
            }
            int i2 = f25740468;
            if (((f257304680468 + i2) * i2) % m13417046804680468() != m1341604680468()) {
                f25740468 = 37;
                f2572046804680468 = 75;
            }
            sb.append("ReplayDetection(status=");
            sb.append(this.status);
            sb.append(", thresholdTime=");
            sb.append(this.thresholdTime);
            sb.append(')');
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/inmobile/sse/models/ServerInstructionSet$Settings;", "", InternalMMEConstants.DISABLED_LOGS, "", "", "replayDetection", "Lcom/inmobile/sse/models/ServerInstructionSet$ReplayDetection;", "sdkDebugLoggingStateEnabled", "", "(Ljava/util/List;Lcom/inmobile/sse/models/ServerInstructionSet$ReplayDetection;Z)V", "getDisabledLogs", "()Ljava/util/List;", "getReplayDetection", "()Lcom/inmobile/sse/models/ServerInstructionSet$ReplayDetection;", "getSdkDebugLoggingStateEnabled", "()Z", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Settings {

        /* renamed from: Ѩ0468ѨѨ04680468Ѩ, reason: contains not printable characters */
        public static int f2575046804680468 = 1;

        /* renamed from: ѨѨ0468Ѩ04680468Ѩ, reason: contains not printable characters */
        public static int f2576046804680468 = 2;

        /* renamed from: ѨѨѨ046804680468Ѩ, reason: contains not printable characters */
        public static int f2577046804680468 = 0;

        /* renamed from: ѨѨѨѨ04680468Ѩ, reason: contains not printable characters */
        public static int f257804680468 = 19;

        @SerializedName("disabled_logs")
        private final List<String> disabledLogs;

        @SerializedName("replay_detection")
        private final ReplayDetection replayDetection;

        @SerializedName("sdk_debug_logging_state_enabled")
        private final boolean sdkDebugLoggingStateEnabled;

        public Settings(List<String> disabledLogs, ReplayDetection replayDetection, boolean z) {
            Intrinsics.checkNotNullParameter(disabledLogs, "disabledLogs");
            Intrinsics.checkNotNullParameter(replayDetection, "replayDetection");
            this.disabledLogs = disabledLogs;
            this.replayDetection = replayDetection;
            this.sdkDebugLoggingStateEnabled = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Settings copy$default(Settings settings, List list, ReplayDetection replayDetection, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = settings.disabledLogs;
            }
            if ((i & 2) != 0) {
                replayDetection = settings.replayDetection;
            }
            if ((i & 4) != 0) {
                z = settings.sdkDebugLoggingStateEnabled;
            }
            return settings.copy(list, replayDetection, z);
        }

        /* renamed from: Ѩ04680468046804680468Ѩ, reason: contains not printable characters */
        public static int m1341904680468046804680468() {
            return 0;
        }

        /* renamed from: Ѩ04680468Ѩ04680468Ѩ, reason: contains not printable characters */
        public static int m134200468046804680468() {
            return 74;
        }

        /* renamed from: Ѩ0468Ѩ046804680468Ѩ, reason: contains not printable characters */
        public static int m134210468046804680468() {
            return 2;
        }

        /* renamed from: ѨѨ0468046804680468Ѩ, reason: contains not printable characters */
        public static int m134220468046804680468() {
            return 1;
        }

        public final List<String> component1() {
            int i = f257804680468;
            int i2 = f2575046804680468;
            int i3 = (i + i2) * i;
            int i4 = f2576046804680468;
            if (i3 % i4 != f2577046804680468) {
                f257804680468 = 84;
                f2577046804680468 = 28;
            }
            List<String> list = this.disabledLogs;
            int i5 = f257804680468;
            if ((i5 * (i2 + i5)) % i4 != 0) {
                f257804680468 = 70;
                f2577046804680468 = m134200468046804680468();
            }
            return list;
        }

        public final ReplayDetection component2() {
            ReplayDetection replayDetection = this.replayDetection;
            int i = f257804680468;
            if (((f2575046804680468 + i) * i) % f2576046804680468 != m1341904680468046804680468()) {
                f257804680468 = 13;
                f2577046804680468 = m134200468046804680468();
            }
            return replayDetection;
        }

        public final boolean component3() {
            boolean z = this.sdkDebugLoggingStateEnabled;
            if (((m134200468046804680468() + f2575046804680468) * m134200468046804680468()) % f2576046804680468 != f2577046804680468) {
                f257804680468 = m134200468046804680468();
                f2577046804680468 = m134200468046804680468();
            }
            return z;
        }

        public final Settings copy(List<String> disabledLogs, ReplayDetection replayDetection, boolean sdkDebugLoggingStateEnabled) {
            Intrinsics.checkNotNullParameter(disabledLogs, "disabledLogs");
            Intrinsics.checkNotNullParameter(replayDetection, "replayDetection");
            int i = f257804680468;
            if (((f2575046804680468 + i) * i) % f2576046804680468 != f2577046804680468) {
                f257804680468 = m134200468046804680468();
                f2577046804680468 = 45;
            }
            if ((i * (f2575046804680468 + i)) % m134210468046804680468() != 0) {
                f257804680468 = 12;
                f2577046804680468 = m134200468046804680468();
            }
            return new Settings(disabledLogs, replayDetection, sdkDebugLoggingStateEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            int i = f257804680468;
            if (((f2575046804680468 + i) * i) % f2576046804680468 != f2577046804680468) {
                f257804680468 = m134200468046804680468();
                f2577046804680468 = 73;
            }
            if (!(other instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) other;
            if (!Intrinsics.areEqual(this.disabledLogs, settings.disabledLogs) || !Intrinsics.areEqual(this.replayDetection, settings.replayDetection)) {
                return false;
            }
            if (this.sdkDebugLoggingStateEnabled == settings.sdkDebugLoggingStateEnabled) {
                return true;
            }
            int i2 = f257804680468;
            if (((f2575046804680468 + i2) * i2) % f2576046804680468 != f2577046804680468) {
                f257804680468 = 72;
                f2577046804680468 = 66;
            }
            return false;
        }

        public final List<String> getDisabledLogs() {
            List<String> list = this.disabledLogs;
            int i = f257804680468;
            if (((f2575046804680468 + i) * i) % m134210468046804680468() != f2577046804680468) {
                int i2 = f257804680468;
                if ((i2 * (f2575046804680468 + i2)) % f2576046804680468 != 0) {
                    f257804680468 = m134200468046804680468();
                    f2577046804680468 = m134200468046804680468();
                }
                f257804680468 = 41;
                f2577046804680468 = m134200468046804680468();
            }
            return list;
        }

        public final ReplayDetection getReplayDetection() {
            int m134220468046804680468 = f257804680468 + m134220468046804680468();
            int i = f257804680468;
            int i2 = f2576046804680468;
            if ((m134220468046804680468 * i) % i2 != f2577046804680468) {
                if ((i * (f2575046804680468 + i)) % i2 != 0) {
                    f257804680468 = 11;
                    f2577046804680468 = 82;
                }
                f257804680468 = 41;
                f2577046804680468 = 71;
            }
            return this.replayDetection;
        }

        public final boolean getSdkDebugLoggingStateEnabled() {
            int i = f257804680468;
            if (((f2575046804680468 + i) * i) % f2576046804680468 != f2577046804680468) {
                if (((m134200468046804680468() + f2575046804680468) * m134200468046804680468()) % f2576046804680468 != f2577046804680468) {
                    f257804680468 = 76;
                    f2577046804680468 = m134200468046804680468();
                }
                f257804680468 = m134200468046804680468();
                f2577046804680468 = 62;
            }
            return this.sdkDebugLoggingStateEnabled;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.disabledLogs.hashCode() * 31) + this.replayDetection.hashCode()) * 31;
            boolean z = this.sdkDebugLoggingStateEnabled;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            if (((f257804680468 + m134220468046804680468()) * f257804680468) % f2576046804680468 != f2577046804680468) {
                f257804680468 = 40;
                f2577046804680468 = m134200468046804680468();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Settings(disabledLogs=");
            int i = f257804680468;
            if (((f2575046804680468 + i) * i) % f2576046804680468 != f2577046804680468) {
                f257804680468 = m134200468046804680468();
                int m134200468046804680468 = m134200468046804680468();
                f2577046804680468 = m134200468046804680468;
                int i2 = f257804680468;
                if (((f2575046804680468 + i2) * i2) % f2576046804680468 != m134200468046804680468) {
                    f257804680468 = 71;
                    f2577046804680468 = 32;
                }
            }
            sb.append(this.disabledLogs);
            sb.append(", replayDetection=");
            sb.append(this.replayDetection);
            sb.append(", sdkDebugLoggingStateEnabled=");
            sb.append(this.sdkDebugLoggingStateEnabled);
            sb.append(')');
            return sb.toString();
        }
    }

    public ServerInstructionSet(Settings settings, License license) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(license, "license");
        this.settings = settings;
        this.license = license;
    }

    public static /* synthetic */ ServerInstructionSet copy$default(ServerInstructionSet serverInstructionSet, Settings settings, License license, int i, Object obj) {
        if ((i & 1) != 0) {
            int i2 = f256304480448044804480448;
            if (((f25660468 + i2) * i2) % f256404680468 != f25650468) {
                f256304480448044804480448 = m134100468();
                f25650468 = m134100468();
            }
            settings = serverInstructionSet.settings;
        }
        if ((i & 2) != 0) {
            license = serverInstructionSet.license;
        }
        return serverInstructionSet.copy(settings, license);
    }

    /* renamed from: Ѩ046804680468ѨѨѨ, reason: contains not printable characters */
    public static int m13407046804680468() {
        return 2;
    }

    /* renamed from: Ѩ0468Ѩ0468ѨѨѨ, reason: contains not printable characters */
    public static int m1340804680468() {
        return 1;
    }

    /* renamed from: ѨѨ04680468ѨѨѨ, reason: contains not printable characters */
    public static int m1340904680468() {
        return 0;
    }

    /* renamed from: ѨѨѨ0468ѨѨѨ, reason: contains not printable characters */
    public static int m134100468() {
        return 82;
    }

    public final Settings component1() {
        Settings settings = this.settings;
        int i = f256304480448044804480448;
        int i2 = ((f25660468 + i) * i) % f256404680468;
        if ((i * (m1340804680468() + i)) % f256404680468 != 0) {
            f256304480448044804480448 = 33;
            f25650468 = m134100468();
        }
        if (i2 != f25650468) {
            f256304480448044804480448 = 68;
            f25650468 = m134100468();
        }
        return settings;
    }

    public final License component2() {
        int i = f256304480448044804480448;
        if ((i * (f25660468 + i)) % f256404680468 != 0) {
            f256304480448044804480448 = 28;
            f25650468 = m134100468();
        }
        License license = this.license;
        int i2 = f256304480448044804480448;
        if (((f25660468 + i2) * i2) % f256404680468 != m1340904680468()) {
            f256304480448044804480448 = m134100468();
            f25650468 = m134100468();
        }
        return license;
    }

    public final ServerInstructionSet copy(Settings settings, License license) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(license, "license");
        int i = f256304480448044804480448;
        if (((f25660468 + i) * i) % f256404680468 != m1340904680468()) {
            f256304480448044804480448 = m134100468();
            f25650468 = 23;
        }
        return new ServerInstructionSet(settings, license);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerInstructionSet)) {
            return false;
        }
        ServerInstructionSet serverInstructionSet = (ServerInstructionSet) other;
        if (!Intrinsics.areEqual(this.settings, serverInstructionSet.settings)) {
            return false;
        }
        if (((f256304480448044804480448 + m1340804680468()) * f256304480448044804480448) % f256404680468 != f25650468) {
            f256304480448044804480448 = 81;
            f25650468 = m134100468();
        }
        int i = f256304480448044804480448;
        if ((i * (f25660468 + i)) % f256404680468 != 0) {
            f256304480448044804480448 = 39;
            f25650468 = 14;
        }
        return Intrinsics.areEqual(this.license, serverInstructionSet.license);
    }

    public final License getLicense() {
        License license = this.license;
        int i = f256304480448044804480448;
        if (((f25660468 + i) * i) % f256404680468 != f25650468) {
            f256304480448044804480448 = m134100468();
            f25650468 = 88;
        }
        return license;
    }

    public final Settings getSettings() {
        int i = f256304480448044804480448;
        if (((f25660468 + i) * i) % f256404680468 != f25650468) {
            f256304480448044804480448 = 27;
            f25650468 = m134100468();
        }
        Settings settings = this.settings;
        int i2 = f256304480448044804480448;
        if (((f25660468 + i2) * i2) % f256404680468 != f25650468) {
            f256304480448044804480448 = m134100468();
            f25650468 = m134100468();
        }
        return settings;
    }

    public int hashCode() {
        int i = f256304480448044804480448;
        if (((f25660468 + i) * i) % f256404680468 != f25650468) {
            f256304480448044804480448 = 96;
            if (((96 + m1340804680468()) * f256304480448044804480448) % m13407046804680468() != f25650468) {
                f256304480448044804480448 = m134100468();
                f25650468 = m134100468();
            }
            f25650468 = 13;
        }
        return (this.settings.hashCode() * 31) + this.license.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ServerInstructionSet(settings=");
        sb.append(this.settings);
        int i = f256304480448044804480448;
        int i2 = (f25660468 + i) * i;
        int m13407046804680468 = m13407046804680468();
        int i3 = f256304480448044804480448;
        if ((i3 * (m1340804680468() + i3)) % f256404680468 != 0) {
            f256304480448044804480448 = 35;
            f25650468 = m134100468();
        }
        if (i2 % m13407046804680468 != f25650468) {
            f256304480448044804480448 = m134100468();
            f25650468 = m134100468();
        }
        sb.append(", license=");
        sb.append(this.license);
        sb.append(')');
        return sb.toString();
    }
}
