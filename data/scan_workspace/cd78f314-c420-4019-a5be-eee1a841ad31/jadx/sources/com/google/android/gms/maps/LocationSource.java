package com.google.android.gms.maps;

import android.location.Location;

/* compiled from: com.google.android.gms:play-services-maps@@19.2.0 */
/* loaded from: classes14.dex */
public interface LocationSource {

    /* compiled from: com.google.android.gms:play-services-maps@@19.2.0 */
    /* loaded from: classes14.dex */
    public interface OnLocationChangedListener {
        void onLocationChanged(Location location);
    }

    void activate(OnLocationChangedListener onLocationChangedListener);

    void deactivate();
}
