package com.vivaaerobus.app.shared.authentication.domain.useCase.validateToken;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: ValidateTokenParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/vivaaerobus/app/shared/authentication/domain/useCase/validateToken/ValidateTokenParams;", "", "daysToRefreshToken", "", "<init>", "(I)V", "getDaysToRefreshToken", "()I", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "Companion", "authentication_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ValidateTokenParams {
    public static final int DEFAULT_DAYS_TO_REFRESH_TOKEN = 29;
    private final int daysToRefreshToken;

    public ValidateTokenParams(int i) {
        this.daysToRefreshToken = i;
    }

    public static /* synthetic */ ValidateTokenParams copy$default(ValidateTokenParams validateTokenParams, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = validateTokenParams.daysToRefreshToken;
        }
        return validateTokenParams.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDaysToRefreshToken() {
        return this.daysToRefreshToken;
    }

    public final ValidateTokenParams copy(int daysToRefreshToken) {
        return new ValidateTokenParams(daysToRefreshToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ValidateTokenParams) && this.daysToRefreshToken == ((ValidateTokenParams) other).daysToRefreshToken;
    }

    public final int getDaysToRefreshToken() {
        return this.daysToRefreshToken;
    }

    public int hashCode() {
        return Integer.hashCode(this.daysToRefreshToken);
    }

    public String toString() {
        return "ValidateTokenParams(daysToRefreshToken=" + this.daysToRefreshToken + ")";
    }
}
