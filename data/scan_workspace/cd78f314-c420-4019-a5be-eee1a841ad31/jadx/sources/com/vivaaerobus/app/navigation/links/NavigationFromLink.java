package com.vivaaerobus.app.navigation.links;

import kotlin.Metadata;

/* compiled from: NavigationFromLink.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/vivaaerobus/app/navigation/links/NavigationFromLink;", "", "<init>", "()V", "_appOpenedFromLink", "", "appOpenedFromLink", "getAppOpenedFromLink", "()Z", "saveOpenMode", "", "fromLink", "navigation_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NavigationFromLink {
    public static final NavigationFromLink INSTANCE = new NavigationFromLink();
    private static boolean _appOpenedFromLink;

    private NavigationFromLink() {
    }

    public final boolean getAppOpenedFromLink() {
        return _appOpenedFromLink;
    }

    public final void saveOpenMode(boolean fromLink) {
        _appOpenedFromLink = fromLink;
    }
}
