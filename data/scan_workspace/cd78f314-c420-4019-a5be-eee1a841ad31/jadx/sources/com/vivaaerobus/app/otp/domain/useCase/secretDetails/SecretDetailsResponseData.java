package com.vivaaerobus.app.otp.domain.useCase.secretDetails;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecretDetailsResponseData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/otp/domain/useCase/secretDetails/SecretDetailsResponseData;", "", "memberId", "", "email", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMemberId", "()Ljava/lang/String;", "getEmail", "getPhone", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "otp_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SecretDetailsResponseData {
    private final String email;
    private final String memberId;
    private final String phone;

    public SecretDetailsResponseData(String memberId, String email, String phone) {
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.memberId = memberId;
        this.email = email;
        this.phone = phone;
    }

    public static /* synthetic */ SecretDetailsResponseData copy$default(SecretDetailsResponseData secretDetailsResponseData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = secretDetailsResponseData.memberId;
        }
        if ((i & 2) != 0) {
            str2 = secretDetailsResponseData.email;
        }
        if ((i & 4) != 0) {
            str3 = secretDetailsResponseData.phone;
        }
        return secretDetailsResponseData.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final SecretDetailsResponseData copy(String memberId, String email, String phone) {
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phone, "phone");
        return new SecretDetailsResponseData(memberId, email, phone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecretDetailsResponseData)) {
            return false;
        }
        SecretDetailsResponseData secretDetailsResponseData = (SecretDetailsResponseData) other;
        return Intrinsics.areEqual(this.memberId, secretDetailsResponseData.memberId) && Intrinsics.areEqual(this.email, secretDetailsResponseData.email) && Intrinsics.areEqual(this.phone, secretDetailsResponseData.phone);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getMemberId() {
        return this.memberId;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        return (((this.memberId.hashCode() * 31) + this.email.hashCode()) * 31) + this.phone.hashCode();
    }

    public String toString() {
        return "SecretDetailsResponseData(memberId=" + this.memberId + ", email=" + this.email + ", phone=" + this.phone + ")";
    }
}
