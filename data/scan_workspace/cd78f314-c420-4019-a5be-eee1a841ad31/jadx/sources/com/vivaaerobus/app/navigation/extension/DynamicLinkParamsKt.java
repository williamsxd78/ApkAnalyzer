package com.vivaaerobus.app.navigation.extension;

import android.content.Intent;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: DynamicLinkParams.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"getLaunchBundleAsMap", "", "", "Landroid/content/Intent;", "navigation_productionRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DynamicLinkParamsKt {
    public static final Map<String, String> getLaunchBundleAsMap(Intent intent) {
        Bundle extras;
        String string;
        Bundle extras2;
        String string2;
        Bundle extras3;
        String string3;
        Bundle extras4;
        Set<String> keySet;
        String string4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (intent != null && (extras4 = intent.getExtras()) != null && (keySet = extras4.keySet()) != null) {
            for (String str : keySet) {
                Bundle extras5 = intent.getExtras();
                if (extras5 != null && (string4 = extras5.getString(str)) != null) {
                    linkedHashMap.put(str, string4);
                }
            }
        }
        if (intent != null && (extras3 = intent.getExtras()) != null && (string3 = extras3.getString(FragmentNavigateToKt.FROM_DYNAMIC_LINK)) != null) {
            linkedHashMap.put(FragmentNavigateToKt.FROM_DYNAMIC_LINK, string3);
        }
        if (intent != null && (extras2 = intent.getExtras()) != null && (string2 = extras2.getString(FragmentNavigateToKt.NOT_PLAY_SERVICES)) != null) {
            linkedHashMap.put(FragmentNavigateToKt.NOT_PLAY_SERVICES, string2);
        }
        if (intent != null && (extras = intent.getExtras()) != null && (string = extras.getString(FragmentNavigateToKt.FROM_APP_LINK)) != null) {
            linkedHashMap.put(FragmentNavigateToKt.FROM_APP_LINK, string);
        }
        return linkedHashMap;
    }
}
