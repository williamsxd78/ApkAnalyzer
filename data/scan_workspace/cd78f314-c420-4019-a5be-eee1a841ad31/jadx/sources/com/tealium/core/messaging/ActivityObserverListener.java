package com.tealium.core.messaging;

import android.app.Activity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001c\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/tealium/core/messaging/ActivityObserverListener;", "Lcom/tealium/core/messaging/ExternalListener;", "onActivityPaused", "", "activity", "Landroid/app/Activity;", "onActivityResumed", "onActivityStopped", "isChangingConfiguration", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ActivityObserverListener extends ExternalListener {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void onActivityPaused$default(ActivityObserverListener activityObserverListener, Activity activity, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityPaused");
            }
            if ((i & 1) != 0) {
                activity = null;
            }
            activityObserverListener.onActivityPaused(activity);
        }

        public static /* synthetic */ void onActivityResumed$default(ActivityObserverListener activityObserverListener, Activity activity, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResumed");
            }
            if ((i & 1) != 0) {
                activity = null;
            }
            activityObserverListener.onActivityResumed(activity);
        }

        public static /* synthetic */ void onActivityStopped$default(ActivityObserverListener activityObserverListener, Activity activity, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityStopped");
            }
            if ((i & 1) != 0) {
                activity = null;
            }
            activityObserverListener.onActivityStopped(activity, z);
        }
    }

    void onActivityPaused(Activity activity);

    void onActivityResumed(Activity activity);

    void onActivityStopped(Activity activity, boolean isChangingConfiguration);
}
