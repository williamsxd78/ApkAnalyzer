package com.inmobile.sse.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.jvm.internal.Intrinsics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/inmobile/sse/models/AntiReplay;", "", "messageId", "", "messageTs", "", "(Ljava/lang/String;J)V", "getMessageId", "()Ljava/lang/String;", "getMessageTs", "()J", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AntiReplay {

    /* renamed from: д04340434д0434дд, reason: contains not printable characters */
    public static int f2447043404340434 = 1;

    /* renamed from: д0434д04340434дд, reason: contains not printable characters */
    public static int f2448043404340434 = 43;

    /* renamed from: дд043404340434дд, reason: contains not printable characters */
    public static int f2449043404340434 = 2;

    /* renamed from: дд0434д0434дд, reason: contains not printable characters */
    public static int f245004340434;
    private final String messageId;
    private final long messageTs;

    public AntiReplay(String messageId, long j) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.messageId = messageId;
        this.messageTs = j;
    }

    public static /* synthetic */ AntiReplay copy$default(AntiReplay antiReplay, String str, long j, int i, Object obj) {
        int i2 = i & 1;
        if (((m1328504340434() + f2447043404340434) * m1328504340434()) % m1328604340434() != f245004340434) {
            f245004340434 = 85;
        }
        if (i2 != 0) {
            str = antiReplay.messageId;
        }
        if ((i & 2) != 0) {
            j = antiReplay.messageTs;
            int i3 = f2448043404340434;
            if (((f2447043404340434 + i3) * i3) % f2449043404340434 != f245004340434) {
                f2448043404340434 = m1328504340434();
                f245004340434 = m1328504340434();
            }
        }
        return antiReplay.copy(str, j);
    }

    /* renamed from: д0434043404340434дд, reason: contains not printable characters */
    public static int m132840434043404340434() {
        return 1;
    }

    /* renamed from: д0434дд0434дд, reason: contains not printable characters */
    public static int m1328504340434() {
        return 23;
    }

    /* renamed from: ддд04340434дд, reason: contains not printable characters */
    public static int m1328604340434() {
        return 2;
    }

    public final String component1() {
        String str = this.messageId;
        int i = f2448043404340434;
        if (((f2447043404340434 + i) * i) % f2449043404340434 != f245004340434) {
            f2448043404340434 = m1328504340434();
            f245004340434 = m1328504340434();
        }
        return str;
    }

    public final long component2() {
        long j = this.messageTs;
        int i = f2448043404340434;
        if (((f2447043404340434 + i) * i) % f2449043404340434 != f245004340434) {
            f2448043404340434 = m1328504340434();
            f245004340434 = 42;
        }
        return j;
    }

    public final AntiReplay copy(String messageId, long messageTs) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        int i = f2448043404340434;
        if (((f2447043404340434 + i) * i) % f2449043404340434 != f245004340434) {
            f2448043404340434 = 87;
            int m1328504340434 = m1328504340434();
            f245004340434 = m1328504340434;
            int i2 = f2448043404340434;
            if (((f2447043404340434 + i2) * i2) % f2449043404340434 != m1328504340434) {
                f2448043404340434 = m1328504340434();
                f245004340434 = m1328504340434();
            }
        }
        return new AntiReplay(messageId, messageTs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AntiReplay)) {
            return false;
        }
        AntiReplay antiReplay = (AntiReplay) other;
        if (Intrinsics.areEqual(this.messageId, antiReplay.messageId)) {
            return this.messageTs == antiReplay.messageTs;
        }
        int i = f2448043404340434;
        if (((f2447043404340434 + i) * i) % f2449043404340434 != f245004340434) {
            f2448043404340434 = 28;
            f245004340434 = m1328504340434();
        }
        int i2 = f2448043404340434;
        if (((f2447043404340434 + i2) * i2) % f2449043404340434 != f245004340434) {
            f2448043404340434 = m1328504340434();
            f245004340434 = 87;
        }
        return false;
    }

    public final String getMessageId() {
        int i = f2448043404340434;
        if ((i * (f2447043404340434 + i)) % m1328604340434() != 0) {
            f2448043404340434 = 92;
            f245004340434 = m1328504340434();
            int i2 = f2448043404340434;
            if ((i2 * (f2447043404340434 + i2)) % f2449043404340434 != 0) {
                f2448043404340434 = m1328504340434();
                f245004340434 = m1328504340434();
            }
        }
        return this.messageId;
    }

    public final long getMessageTs() {
        long j = this.messageTs;
        int i = f2448043404340434;
        if (((f2447043404340434 + i) * i) % f2449043404340434 != f245004340434) {
            f2448043404340434 = m1328504340434();
            f245004340434 = m1328504340434();
            int m1328504340434 = m1328504340434();
            if ((m1328504340434 * (m132840434043404340434() + m1328504340434)) % m1328604340434() != 0) {
                f2448043404340434 = 29;
                f245004340434 = 51;
            }
        }
        return j;
    }

    public int hashCode() {
        int hashCode = this.messageId.hashCode() * 31;
        int i = f2448043404340434;
        if (((f2447043404340434 + i) * i) % f2449043404340434 != f245004340434) {
            f2448043404340434 = m1328504340434();
            f245004340434 = m1328504340434();
        }
        int hashCode2 = hashCode + Long.hashCode(this.messageTs);
        int i2 = f2448043404340434;
        if (((f2447043404340434 + i2) * i2) % f2449043404340434 != f245004340434) {
            f2448043404340434 = m1328504340434();
            f245004340434 = 53;
        }
        return hashCode2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = f2448043404340434;
        if ((i * (f2447043404340434 + i)) % f2449043404340434 != 0) {
            f2448043404340434 = m1328504340434();
            f245004340434 = m1328504340434();
            int i2 = f2448043404340434;
            if ((i2 * (f2447043404340434 + i2)) % m1328604340434() != 0) {
                f2448043404340434 = m1328504340434();
                f245004340434 = m1328504340434();
            }
        }
        sb.append("AntiReplay(messageId=");
        sb.append(this.messageId);
        sb.append(", messageTs=");
        sb.append(this.messageTs);
        sb.append(')');
        return sb.toString();
    }
}
