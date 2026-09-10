package com.vivaaerobus.app.dashboard.navigationByLink;

import android.os.Bundle;
import kotlin.Metadata;

/* compiled from: NavigationByLinkParamsImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/vivaaerobus/app/dashboard/navigationByLink/NavigationByLinkParamsImpl;", "Lcom/vivaaerobus/app/dashboard/navigationByLink/NavigationByLinkParams;", "<init>", "()V", "navigationByLinkParams", "Landroid/os/Bundle;", "getNavigationByLinkParams", "()Landroid/os/Bundle;", "setNavigationByLinkParams", "(Landroid/os/Bundle;)V", "retrieveNavigationByLinkParams", "sharedDashboard_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NavigationByLinkParamsImpl implements NavigationByLinkParams {
    private Bundle navigationByLinkParams;

    @Override // com.vivaaerobus.app.dashboard.navigationByLink.NavigationByLinkParams
    public Bundle getNavigationByLinkParams() {
        return this.navigationByLinkParams;
    }

    @Override // com.vivaaerobus.app.dashboard.navigationByLink.NavigationByLinkParams
    public Bundle retrieveNavigationByLinkParams() {
        Bundle navigationByLinkParams = getNavigationByLinkParams();
        setNavigationByLinkParams(null);
        return navigationByLinkParams;
    }

    @Override // com.vivaaerobus.app.dashboard.navigationByLink.NavigationByLinkParams
    public void setNavigationByLinkParams(Bundle bundle) {
        this.navigationByLinkParams = bundle;
    }
}
