package androidx.browser.auth;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;
import android.support.customtabs.IAuthTabCallback;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class AuthTabSession {
    private final IAuthTabCallback mCallback;
    private final ComponentName mComponentName;
    private final PendingIntent mId;

    /* loaded from: classes.dex */
    public static class PendingSession {
        private final AuthTabCallback mCallback;
        private final Executor mExecutor;
        private final PendingIntent mId;

        public PendingSession(PendingIntent pendingIntent, Executor executor, AuthTabCallback authTabCallback) {
            this.mId = pendingIntent;
            this.mExecutor = executor;
            this.mCallback = authTabCallback;
        }

        public AuthTabCallback getCallback() {
            return this.mCallback;
        }

        public Executor getExecutor() {
            return this.mExecutor;
        }

        public PendingIntent getId() {
            return this.mId;
        }
    }

    public AuthTabSession(IAuthTabCallback iAuthTabCallback, ComponentName componentName, PendingIntent pendingIntent) {
        this.mCallback = iAuthTabCallback;
        this.mComponentName = componentName;
        this.mId = pendingIntent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PendingIntent getId() {
        return this.mId;
    }
}
