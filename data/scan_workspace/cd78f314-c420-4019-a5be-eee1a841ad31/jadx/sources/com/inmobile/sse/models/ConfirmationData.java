package com.inmobile.sse.models;

import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/inmobile/sse/models/ConfirmationData;", "Ljava/io/Serializable;", "type", "", "confirmationId", "confirmationMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConfirmationId", "()Ljava/lang/String;", "getConfirmationMessage", "getType", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "", "hashCode", "", "toString", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ConfirmationData implements Serializable {
    private final String confirmationId;

    @SerializedName("message")
    private final String confirmationMessage;
    private final String type;

    public ConfirmationData(String type, String confirmationId, String confirmationMessage) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(confirmationId, "confirmationId");
        Intrinsics.checkNotNullParameter(confirmationMessage, "confirmationMessage");
        this.type = type;
        this.confirmationId = confirmationId;
        this.confirmationMessage = confirmationMessage;
    }

    public static /* synthetic */ ConfirmationData copy$default(ConfirmationData confirmationData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmationData.type;
        }
        if ((i & 2) != 0) {
            str2 = confirmationData.confirmationId;
        }
        if ((i & 4) != 0) {
            str3 = confirmationData.confirmationMessage;
        }
        ConfirmationData copy = confirmationData.copy(str, str2, str3);
        int m1329404340434 = ((m1329404340434() + m13292043404340434()) * m1329404340434()) % m13293043404340434();
        m132910434043404340434();
        int m13294043404342 = m1329404340434();
        int m13292043404340434 = (m13294043404342 * (m13292043404340434() + m13294043404342)) % m13293043404340434();
        return copy;
    }

    /* renamed from: д04340434д04340434д, reason: contains not printable characters */
    public static int m132910434043404340434() {
        return 0;
    }

    /* renamed from: д0434дд04340434д, reason: contains not printable characters */
    public static int m13292043404340434() {
        return 1;
    }

    /* renamed from: дд0434д04340434д, reason: contains not printable characters */
    public static int m13293043404340434() {
        return 2;
    }

    /* renamed from: дддд04340434д, reason: contains not printable characters */
    public static int m1329404340434() {
        return 97;
    }

    public final String component1() {
        String str = this.type;
        int m1329404340434 = (m1329404340434() + m13292043404340434()) * m1329404340434();
        int m13293043404340434 = m13293043404340434();
        int m13294043404342 = m1329404340434();
        int m13292043404340434 = (m13294043404342 * (m13292043404340434() + m13294043404342)) % m13293043404340434();
        int i = m1329404340434 % m13293043404340434;
        m132910434043404340434();
        return str;
    }

    public final String component2() {
        int m1329404340434 = m1329404340434();
        int m13292043404340434 = (m1329404340434 * (m13292043404340434() + m1329404340434)) % m13293043404340434();
        return this.confirmationId;
    }

    public final String component3() {
        if (((m1329404340434() + m13292043404340434()) * m1329404340434()) % m13293043404340434() != m132910434043404340434()) {
            int m1329404340434 = m1329404340434();
            int m13292043404340434 = (m1329404340434 * (m13292043404340434() + m1329404340434)) % m13293043404340434();
        }
        return this.confirmationMessage;
    }

    public final ConfirmationData copy(String type, String confirmationId, String confirmationMessage) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(confirmationId, "confirmationId");
        if (((m1329404340434() + m13292043404340434()) * m1329404340434()) % m13293043404340434() != m132910434043404340434()) {
            int m1329404340434 = m1329404340434();
            int m13292043404340434 = (m1329404340434 * (m13292043404340434() + m1329404340434)) % m13293043404340434();
        }
        Intrinsics.checkNotNullParameter(confirmationMessage, "confirmationMessage");
        return new ConfirmationData(type, confirmationId, confirmationMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmationData)) {
            return false;
        }
        ConfirmationData confirmationData = (ConfirmationData) other;
        if (!Intrinsics.areEqual(this.type, confirmationData.type)) {
            return false;
        }
        String str = this.confirmationId;
        int m1329404340434 = m1329404340434();
        int m13292043404340434 = (m1329404340434 * (m13292043404340434() + m1329404340434)) % m13293043404340434();
        if (!Intrinsics.areEqual(str, confirmationData.confirmationId)) {
            return false;
        }
        String str2 = this.confirmationMessage;
        int m13294043404342 = m1329404340434();
        int m132920434043404342 = (m13294043404342 * (m13292043404340434() + m13294043404342)) % m13293043404340434();
        return Intrinsics.areEqual(str2, confirmationData.confirmationMessage);
    }

    public final String getConfirmationId() {
        String str = this.confirmationId;
        if (((m1329404340434() + m13292043404340434()) * m1329404340434()) % m13293043404340434() != m132910434043404340434()) {
            int m1329404340434 = ((m1329404340434() + m13292043404340434()) * m1329404340434()) % m13293043404340434();
            m132910434043404340434();
        }
        return str;
    }

    public final String getConfirmationMessage() {
        int m1329404340434 = ((m1329404340434() + m13292043404340434()) * m1329404340434()) % m13293043404340434();
        m132910434043404340434();
        String str = this.confirmationMessage;
        int m13294043404342 = ((m1329404340434() + m13292043404340434()) * m1329404340434()) % m13293043404340434();
        m132910434043404340434();
        return str;
    }

    public final String getType() {
        if (((m1329404340434() + m13292043404340434()) * m1329404340434()) % m13293043404340434() != m132910434043404340434()) {
            int m1329404340434 = ((m1329404340434() + m13292043404340434()) * m1329404340434()) % m13293043404340434();
            m132910434043404340434();
        }
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((this.type.hashCode() * 31) + this.confirmationId.hashCode()) * 31;
        int m1329404340434 = m1329404340434();
        int m13292043404340434 = (m1329404340434 * (m13292043404340434() + m1329404340434)) % m13293043404340434();
        int m13294043404342 = ((m1329404340434() + m13292043404340434()) * m1329404340434()) % m13293043404340434();
        m132910434043404340434();
        return hashCode + this.confirmationMessage.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConfirmationData(type=");
        int m1329404340434 = ((m1329404340434() + m13292043404340434()) * m1329404340434()) % m13293043404340434();
        m132910434043404340434();
        sb.append(this.type);
        sb.append(", confirmationId=");
        sb.append(this.confirmationId);
        int m13294043404342 = ((m1329404340434() + m13292043404340434()) * m1329404340434()) % m13293043404340434();
        m132910434043404340434();
        sb.append(", confirmationMessage=");
        sb.append(this.confirmationMessage);
        sb.append(')');
        return sb.toString();
    }
}
