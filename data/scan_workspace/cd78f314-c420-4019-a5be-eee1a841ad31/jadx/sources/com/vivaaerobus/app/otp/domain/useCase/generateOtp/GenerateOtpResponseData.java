package com.vivaaerobus.app.otp.domain.useCase.generateOtp;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: GenerateOtpResponseData.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/vivaaerobus/app/otp/domain/useCase/generateOtp/GenerateOtpResponseData;", "", "otp", "", "<init>", "(I)V", "getOtp", "()I", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "otp_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GenerateOtpResponseData {
    private final int otp;

    public GenerateOtpResponseData(int i) {
        this.otp = i;
    }

    public static /* synthetic */ GenerateOtpResponseData copy$default(GenerateOtpResponseData generateOtpResponseData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = generateOtpResponseData.otp;
        }
        return generateOtpResponseData.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getOtp() {
        return this.otp;
    }

    public final GenerateOtpResponseData copy(int otp) {
        return new GenerateOtpResponseData(otp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GenerateOtpResponseData) && this.otp == ((GenerateOtpResponseData) other).otp;
    }

    public final int getOtp() {
        return this.otp;
    }

    public int hashCode() {
        return Integer.hashCode(this.otp);
    }

    public String toString() {
        return "GenerateOtpResponseData(otp=" + this.otp + ")";
    }
}
