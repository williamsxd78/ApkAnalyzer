package com.inmobile.sse.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/inmobile/sse/models/WhiteBoxPolicyLog;", "", "filename", "", "accessStatus", "policies", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAccessStatus", "()Ljava/lang/String;", "setAccessStatus", "(Ljava/lang/String;)V", "getFilename", "getPolicies", "()Ljava/util/List;", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WhiteBoxPolicyLog {

    /* renamed from: Ц042604260426ЦЦЦ, reason: contains not printable characters */
    public static int f2599042604260426 = 1;

    /* renamed from: Ц04260426Ц0426ЦЦ, reason: contains not printable characters */
    public static int f2600042604260426 = 0;

    /* renamed from: Ц0426Ц0426ЦЦЦ, reason: contains not printable characters */
    public static int f260104260426 = 97;

    /* renamed from: ЦЦЦЦ0426ЦЦ, reason: contains not printable characters */
    public static int f26020426 = 2;
    private String accessStatus;
    private final String filename;
    private final List<String> policies;

    public WhiteBoxPolicyLog(String filename, String accessStatus, List<String> policies) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(accessStatus, "accessStatus");
        Intrinsics.checkNotNullParameter(policies, "policies");
        this.filename = filename;
        this.accessStatus = accessStatus;
        this.policies = policies;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WhiteBoxPolicyLog copy$default(WhiteBoxPolicyLog whiteBoxPolicyLog, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = whiteBoxPolicyLog.filename;
        }
        if ((i & 2) != 0) {
            str2 = whiteBoxPolicyLog.accessStatus;
        }
        if ((i & 4) != 0) {
            list = whiteBoxPolicyLog.policies;
        }
        int i2 = f260104260426;
        if (((f2599042604260426 + i2) * i2) % f26020426 != m1343904260426()) {
            f260104260426 = 99;
            if ((99 * (f2599042604260426 + 99)) % f26020426 != 0) {
                f260104260426 = m1343804260426();
                f2599042604260426 = 94;
            }
            f2599042604260426 = m1343804260426();
        }
        return whiteBoxPolicyLog.copy(str, str2, list);
    }

    /* renamed from: Ц0426ЦЦ0426ЦЦ, reason: contains not printable characters */
    public static int m1343804260426() {
        return 54;
    }

    /* renamed from: ЦЦ04260426ЦЦЦ, reason: contains not printable characters */
    public static int m1343904260426() {
        return 0;
    }

    /* renamed from: ЦЦ0426Ц0426ЦЦ, reason: contains not printable characters */
    public static int m1344004260426() {
        return 2;
    }

    /* renamed from: ЦЦЦ04260426ЦЦ, reason: contains not printable characters */
    public static int m1344104260426() {
        return 1;
    }

    public final String component1() {
        int i = f260104260426;
        if (((f2599042604260426 + i) * i) % f26020426 != f2600042604260426) {
            f260104260426 = 88;
            f2600042604260426 = m1343804260426();
        }
        return this.filename;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccessStatus() {
        return this.accessStatus;
    }

    public final List<String> component3() {
        int i = f260104260426;
        int i2 = f2599042604260426;
        int i3 = f26020426;
        int i4 = ((i + i2) * i) % i3;
        int i5 = f2600042604260426;
        if (i4 != i5) {
            if (((i2 + i) * i) % i3 != i5) {
                f260104260426 = 24;
                f2600042604260426 = m1343804260426();
            }
            f260104260426 = 89;
            f2600042604260426 = m1343804260426();
        }
        return this.policies;
    }

    public final WhiteBoxPolicyLog copy(String filename, String accessStatus, List<String> policies) {
        int i = f260104260426;
        if ((i * (f2599042604260426 + i)) % f26020426 != 0) {
            f260104260426 = m1343804260426();
            f2600042604260426 = m1343804260426();
        }
        int i2 = f260104260426;
        if ((i2 * (m1344104260426() + i2)) % f26020426 != 0) {
            f260104260426 = m1343804260426();
            f2600042604260426 = m1343804260426();
        }
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(accessStatus, "accessStatus");
        Intrinsics.checkNotNullParameter(policies, "policies");
        return new WhiteBoxPolicyLog(filename, accessStatus, policies);
    }

    public boolean equals(Object other) {
        if ((other instanceof WhiteBoxPolicyLog) && Intrinsics.areEqual(((WhiteBoxPolicyLog) other).filename, this.filename)) {
            return true;
        }
        int i = f260104260426;
        if ((i * (f2599042604260426 + i)) % f26020426 == 0) {
            return false;
        }
        f260104260426 = m1343804260426();
        f2600042604260426 = m1343804260426();
        return false;
    }

    public final String getAccessStatus() {
        int m1343804260426 = (m1343804260426() + f2599042604260426) * m1343804260426();
        int i = f26020426;
        if (m1343804260426 % i != f2600042604260426) {
            f260104260426 = 92;
            f2600042604260426 = 95;
        }
        String str = this.accessStatus;
        int i2 = f260104260426;
        if (((f2599042604260426 + i2) * i2) % i != f2600042604260426) {
            f260104260426 = 64;
            f2600042604260426 = m1343804260426();
        }
        return str;
    }

    public final String getFilename() {
        int i = f260104260426;
        if ((i * (f2599042604260426 + i)) % f26020426 != 0) {
            f260104260426 = m1343804260426();
            f2599042604260426 = 35;
        }
        String str = this.filename;
        int i2 = f260104260426;
        if ((i2 * (f2599042604260426 + i2)) % m1344004260426() != 0) {
            f260104260426 = 59;
            f2599042604260426 = m1343804260426();
        }
        return str;
    }

    public final List<String> getPolicies() {
        int m1343804260426 = (m1343804260426() + f2599042604260426) * m1343804260426();
        int i = f26020426;
        int i2 = m1343804260426 % i;
        int i3 = f2600042604260426;
        if (i2 != i3) {
            int i4 = f260104260426;
            if (((f2599042604260426 + i4) * i4) % i != i3) {
                f260104260426 = 94;
                f2600042604260426 = 62;
            }
            f260104260426 = 9;
            f2600042604260426 = m1343804260426();
        }
        return this.policies;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final void setAccessStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accessStatus = str;
        int i = f260104260426;
        int i2 = f2599042604260426;
        int i3 = (i + i2) * i;
        int i4 = f26020426;
        if ((i * (i2 + i)) % i4 != 0) {
            f260104260426 = 11;
            f2600042604260426 = 98;
        }
        if (i3 % i4 != 0) {
            f260104260426 = m1343804260426();
            f2600042604260426 = 67;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WhiteBoxPolicyLog(filename=");
        sb.append(this.filename);
        int i = f260104260426;
        if (((f2599042604260426 + i) * i) % f26020426 != f2600042604260426) {
            f260104260426 = 0;
            f2600042604260426 = m1343804260426();
        }
        sb.append(", accessStatus=");
        sb.append(this.accessStatus);
        sb.append(", policies=");
        sb.append(this.policies);
        sb.append(')');
        return sb.toString();
    }
}
