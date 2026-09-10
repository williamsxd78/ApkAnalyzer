package com.inmobile.sse.models.appobjectdata;

import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/inmobile/sse/models/appobjectdata/InAuthenticateUniqueID;", "", "uniqueID", "", "(Ljava/lang/String;)V", "getUniqueID", "()Ljava/lang/String;", "setUniqueID", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InAuthenticateUniqueID {

    /* renamed from: Ц042604260426Ц04260426, reason: contains not printable characters */
    public static int f262304260426042604260426 = 0;

    /* renamed from: Ц04260426ЦЦ04260426, reason: contains not printable characters */
    public static int f26240426042604260426 = 16;

    /* renamed from: Ц0426Ц0426Ц04260426, reason: contains not printable characters */
    public static int f26250426042604260426 = 2;

    /* renamed from: ЦЦЦ0426Ц04260426, reason: contains not printable characters */
    public static int f2626042604260426 = 1;

    @SerializedName("unique_id")
    private String uniqueID;

    public InAuthenticateUniqueID(String uniqueID) {
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
        this.uniqueID = uniqueID;
    }

    public static /* synthetic */ InAuthenticateUniqueID copy$default(InAuthenticateUniqueID inAuthenticateUniqueID, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            if (((m134610426042604260426() + f2626042604260426) * m134610426042604260426()) % f26250426042604260426 != f262304260426042604260426) {
                f26240426042604260426 = m134610426042604260426();
                f262304260426042604260426 = m134610426042604260426();
            }
            str = inAuthenticateUniqueID.uniqueID;
            int i2 = f26240426042604260426;
            if ((i2 * (f2626042604260426 + i2)) % f26250426042604260426 != 0) {
                f26240426042604260426 = m134610426042604260426();
                f2626042604260426 = 67;
            }
        }
        return inAuthenticateUniqueID.copy(str);
    }

    /* renamed from: Ц0426ЦЦ042604260426, reason: contains not printable characters */
    public static int m134600426042604260426() {
        return 2;
    }

    /* renamed from: ЦЦ04260426Ц04260426, reason: contains not printable characters */
    public static int m134610426042604260426() {
        return 10;
    }

    /* renamed from: ЦЦЦЦ042604260426, reason: contains not printable characters */
    public static int m13462042604260426() {
        return 1;
    }

    public final String component1() {
        int i = f26240426042604260426;
        if ((i * (f2626042604260426 + i)) % f26250426042604260426 != 0) {
            int m134610426042604260426 = m134610426042604260426();
            f26240426042604260426 = m134610426042604260426;
            if ((m134610426042604260426 * (f2626042604260426 + m134610426042604260426)) % f26250426042604260426 != 0) {
                f26240426042604260426 = 52;
                f262304260426042604260426 = 61;
            }
            f262304260426042604260426 = 12;
        }
        return this.uniqueID;
    }

    public final InAuthenticateUniqueID copy(String uniqueID) {
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
        InAuthenticateUniqueID inAuthenticateUniqueID = new InAuthenticateUniqueID(uniqueID);
        int i = f26240426042604260426;
        int i2 = f2626042604260426;
        int i3 = f26250426042604260426;
        if (((i + i2) * i) % i3 != f262304260426042604260426) {
            if ((i * (i2 + i)) % i3 != 0) {
                f26240426042604260426 = 85;
                f262304260426042604260426 = 68;
            }
            f26240426042604260426 = 95;
            f262304260426042604260426 = 76;
        }
        return inAuthenticateUniqueID;
    }

    public boolean equals(Object other) {
        int m134610426042604260426 = (m134610426042604260426() + f2626042604260426) * m134610426042604260426();
        int i = f26250426042604260426;
        if (m134610426042604260426 % i != f262304260426042604260426) {
            int i2 = f26240426042604260426;
            if ((i2 * (f2626042604260426 + i2)) % i != 0) {
                f26240426042604260426 = m134610426042604260426();
                f262304260426042604260426 = 37;
            }
            f26240426042604260426 = m134610426042604260426();
            f262304260426042604260426 = 87;
        }
        if (this == other) {
            return true;
        }
        return (other instanceof InAuthenticateUniqueID) && Intrinsics.areEqual(this.uniqueID, ((InAuthenticateUniqueID) other).uniqueID);
    }

    public final String getUniqueID() {
        int i = f26240426042604260426;
        int i2 = ((f2626042604260426 + i) * i) % f26250426042604260426;
        if ((i * (m13462042604260426() + i)) % f26250426042604260426 != 0) {
            f26240426042604260426 = 89;
            f262304260426042604260426 = m134610426042604260426();
        }
        if (i2 != 0) {
            f26240426042604260426 = m134610426042604260426();
            f262304260426042604260426 = 16;
        }
        return this.uniqueID;
    }

    public int hashCode() {
        int i = f26240426042604260426;
        if (((f2626042604260426 + i) * i) % f26250426042604260426 != 0) {
            if ((i * (m13462042604260426() + i)) % f26250426042604260426 != 0) {
                f26240426042604260426 = m134610426042604260426();
                f262304260426042604260426 = 71;
            }
            f26240426042604260426 = m134610426042604260426();
            f262304260426042604260426 = 1;
        }
        return this.uniqueID.hashCode();
    }

    public final void setUniqueID(String str) {
        int i = f26240426042604260426;
        if ((i * (m13462042604260426() + i)) % f26250426042604260426 != 0) {
            f26240426042604260426 = m134610426042604260426();
            f262304260426042604260426 = 69;
        }
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        int i2 = f26240426042604260426;
        if (((f2626042604260426 + i2) * i2) % f26250426042604260426 != f262304260426042604260426) {
            f26240426042604260426 = 92;
            f262304260426042604260426 = m134610426042604260426();
        }
        this.uniqueID = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InAuthenticateUniqueID(uniqueID=");
        sb.append(this.uniqueID);
        int i = f26240426042604260426;
        if (((f2626042604260426 + i) * i) % f26250426042604260426 != f262304260426042604260426) {
            f26240426042604260426 = 78;
            f262304260426042604260426 = 14;
        }
        sb.append(')');
        int i2 = f26240426042604260426;
        if ((i2 * (f2626042604260426 + i2)) % m134600426042604260426() != 0) {
            f26240426042604260426 = 20;
            f262304260426042604260426 = m134610426042604260426();
        }
        return sb.toString();
    }
}
