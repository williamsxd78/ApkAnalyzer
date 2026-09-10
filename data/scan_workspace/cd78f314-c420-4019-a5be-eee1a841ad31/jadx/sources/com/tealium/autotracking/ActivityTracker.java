package com.tealium.autotracking;

import android.app.Activity;
import com.tealium.core.messaging.ActivityObserverListener;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H&J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H&¨\u0006\f"}, d2 = {"Lcom/tealium/autotracking/ActivityTracker;", "Lcom/tealium/core/messaging/ActivityObserverListener;", "trackActivity", "", "activity", "Landroid/app/Activity;", "data", "", "", "", "activityDataCollector", "Lcom/tealium/autotracking/ActivityDataCollector;", "autotracking_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ActivityTracker extends ActivityObserverListener {
    void trackActivity(Activity activity, Map<String, ? extends Object> data);

    void trackActivity(ActivityDataCollector activityDataCollector, Map<String, ? extends Object> data);
}
