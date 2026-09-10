package com.airbnb.paris.proxies;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* compiled from: Proxy.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00032\u00020\u0004R\u0012\u0010\u0005\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/airbnb/paris/proxies/Proxy;", "P", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroid/view/View;", "", "proxy", "getProxy", "()Ljava/lang/Object;", "view", "getView", "()Landroid/view/View;", "paris_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes13.dex */
public interface Proxy<P, V extends View> {
    P getProxy();

    V getView();
}
