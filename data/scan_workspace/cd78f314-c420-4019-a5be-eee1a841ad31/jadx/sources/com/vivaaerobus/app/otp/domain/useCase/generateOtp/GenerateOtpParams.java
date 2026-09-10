package com.vivaaerobus.app.otp.domain.useCase.generateOtp;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenerateOtpParams.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0014\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006$"}, d2 = {"Lcom/vivaaerobus/app/otp/domain/useCase/generateOtp/GenerateOtpParams;", "", "channel", "", "enrollingSponsor", "", "maxRedemptionPoints", "memberId", "operation", "returnOtp", "", "sendEmail", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZZ)V", "getChannel", "()Ljava/lang/String;", "getEnrollingSponsor", "()I", "getMaxRedemptionPoints", "getMemberId", "getOperation", "getReturnOtp", "()Z", "getSendEmail", "component1", "component2", "component3", "component4", "component5", "component6", "component7", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "toString", "otp_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GenerateOtpParams {
    private final String channel;
    private final int enrollingSponsor;
    private final int maxRedemptionPoints;
    private final String memberId;
    private final String operation;
    private final boolean returnOtp;
    private final boolean sendEmail;

    public GenerateOtpParams(String channel, int i, int i2, String memberId, String operation, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.channel = channel;
        this.enrollingSponsor = i;
        this.maxRedemptionPoints = i2;
        this.memberId = memberId;
        this.operation = operation;
        this.returnOtp = z;
        this.sendEmail = z2;
    }

    public static /* synthetic */ GenerateOtpParams copy$default(GenerateOtpParams generateOtpParams, String str, int i, int i2, String str2, String str3, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = generateOtpParams.channel;
        }
        if ((i3 & 2) != 0) {
            i = generateOtpParams.enrollingSponsor;
        }
        if ((i3 & 4) != 0) {
            i2 = generateOtpParams.maxRedemptionPoints;
        }
        if ((i3 & 8) != 0) {
            str2 = generateOtpParams.memberId;
        }
        if ((i3 & 16) != 0) {
            str3 = generateOtpParams.operation;
        }
        if ((i3 & 32) != 0) {
            z = generateOtpParams.returnOtp;
        }
        if ((i3 & 64) != 0) {
            z2 = generateOtpParams.sendEmail;
        }
        boolean z3 = z;
        boolean z4 = z2;
        String str4 = str3;
        int i4 = i2;
        return generateOtpParams.copy(str, i, i4, str2, str4, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* renamed from: component2, reason: from getter */
    public final int getEnrollingSponsor() {
        return this.enrollingSponsor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxRedemptionPoints() {
        return this.maxRedemptionPoints;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOperation() {
        return this.operation;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getReturnOtp() {
        return this.returnOtp;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getSendEmail() {
        return this.sendEmail;
    }

    public final GenerateOtpParams copy(String channel, int enrollingSponsor, int maxRedemptionPoints, String memberId, String operation, boolean returnOtp, boolean sendEmail) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return new GenerateOtpParams(channel, enrollingSponsor, maxRedemptionPoints, memberId, operation, returnOtp, sendEmail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateOtpParams)) {
            return false;
        }
        GenerateOtpParams generateOtpParams = (GenerateOtpParams) other;
        return Intrinsics.areEqual(this.channel, generateOtpParams.channel) && this.enrollingSponsor == generateOtpParams.enrollingSponsor && this.maxRedemptionPoints == generateOtpParams.maxRedemptionPoints && Intrinsics.areEqual(this.memberId, generateOtpParams.memberId) && Intrinsics.areEqual(this.operation, generateOtpParams.operation) && this.returnOtp == generateOtpParams.returnOtp && this.sendEmail == generateOtpParams.sendEmail;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final int getEnrollingSponsor() {
        return this.enrollingSponsor;
    }

    public final int getMaxRedemptionPoints() {
        return this.maxRedemptionPoints;
    }

    public final String getMemberId() {
        return this.memberId;
    }

    public final String getOperation() {
        return this.operation;
    }

    public final boolean getReturnOtp() {
        return this.returnOtp;
    }

    public final boolean getSendEmail() {
        return this.sendEmail;
    }

    public int hashCode() {
        return (((((((((((this.channel.hashCode() * 31) + Integer.hashCode(this.enrollingSponsor)) * 31) + Integer.hashCode(this.maxRedemptionPoints)) * 31) + this.memberId.hashCode()) * 31) + this.operation.hashCode()) * 31) + Boolean.hashCode(this.returnOtp)) * 31) + Boolean.hashCode(this.sendEmail);
    }

    public String toString() {
        return "GenerateOtpParams(channel=" + this.channel + ", enrollingSponsor=" + this.enrollingSponsor + ", maxRedemptionPoints=" + this.maxRedemptionPoints + ", memberId=" + this.memberId + ", operation=" + this.operation + ", returnOtp=" + this.returnOtp + ", sendEmail=" + this.sendEmail + ")";
    }
}
