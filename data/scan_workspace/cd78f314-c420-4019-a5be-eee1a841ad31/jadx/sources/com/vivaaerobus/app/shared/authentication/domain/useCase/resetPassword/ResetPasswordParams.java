package com.vivaaerobus.app.shared.authentication.domain.useCase.resetPassword;

import androidx.autofill.HintConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResetPasswordParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/shared/authentication/domain/useCase/resetPassword/ResetPasswordParams;", "", "email", "", "verifyToken", HintConstants.AUTOFILL_HINT_NEW_PASSWORD, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getVerifyToken", "getNewPassword", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "authentication_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ResetPasswordParams {
    private final String email;
    private final String newPassword;
    private final String verifyToken;

    public ResetPasswordParams(String email, String verifyToken, String newPassword) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(verifyToken, "verifyToken");
        Intrinsics.checkNotNullParameter(newPassword, "newPassword");
        this.email = email;
        this.verifyToken = verifyToken;
        this.newPassword = newPassword;
    }

    public static /* synthetic */ ResetPasswordParams copy$default(ResetPasswordParams resetPasswordParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resetPasswordParams.email;
        }
        if ((i & 2) != 0) {
            str2 = resetPasswordParams.verifyToken;
        }
        if ((i & 4) != 0) {
            str3 = resetPasswordParams.newPassword;
        }
        return resetPasswordParams.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVerifyToken() {
        return this.verifyToken;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNewPassword() {
        return this.newPassword;
    }

    public final ResetPasswordParams copy(String email, String verifyToken, String newPassword) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(verifyToken, "verifyToken");
        Intrinsics.checkNotNullParameter(newPassword, "newPassword");
        return new ResetPasswordParams(email, verifyToken, newPassword);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResetPasswordParams)) {
            return false;
        }
        ResetPasswordParams resetPasswordParams = (ResetPasswordParams) other;
        return Intrinsics.areEqual(this.email, resetPasswordParams.email) && Intrinsics.areEqual(this.verifyToken, resetPasswordParams.verifyToken) && Intrinsics.areEqual(this.newPassword, resetPasswordParams.newPassword);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public final String getVerifyToken() {
        return this.verifyToken;
    }

    public int hashCode() {
        return (((this.email.hashCode() * 31) + this.verifyToken.hashCode()) * 31) + this.newPassword.hashCode();
    }

    public String toString() {
        return "ResetPasswordParams(email=" + this.email + ", verifyToken=" + this.verifyToken + ", newPassword=" + this.newPassword + ")";
    }
}
