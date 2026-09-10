package com.vivaaerobus.app.shared.authentication.presentation.ssoData;

import kotlin.Metadata;

/* compiled from: SSOData.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/shared/authentication/presentation/ssoData/SSOData;", "", "ssoPendingUrl", "", "getSsoPendingUrl", "()Ljava/lang/String;", "setSsoPendingUrl", "(Ljava/lang/String;)V", "ssoParams", "Lcom/vivaaerobus/app/shared/authentication/presentation/ssoData/SSOParams;", "getSsoParams", "()Lcom/vivaaerobus/app/shared/authentication/presentation/ssoData/SSOParams;", "setSsoParams", "(Lcom/vivaaerobus/app/shared/authentication/presentation/ssoData/SSOParams;)V", "authentication_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SSOData {
    SSOParams getSsoParams();

    String getSsoPendingUrl();

    void setSsoParams(SSOParams sSOParams);

    void setSsoPendingUrl(String str);
}
