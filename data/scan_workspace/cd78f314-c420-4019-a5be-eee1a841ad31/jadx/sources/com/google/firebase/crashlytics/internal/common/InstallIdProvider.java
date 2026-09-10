package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes14.dex */
public interface InstallIdProvider {

    /* loaded from: classes14.dex */
    public static abstract class InstallIds {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static InstallIds create(String str, FirebaseInstallationId firebaseInstallationId) {
            return new AutoValue_InstallIdProvider_InstallIds(str, firebaseInstallationId.getFid(), firebaseInstallationId.getAuthToken());
        }

        public static InstallIds createWithoutFid(String str) {
            return new AutoValue_InstallIdProvider_InstallIds(str, null, null);
        }

        public abstract String getCrashlyticsInstallId();

        public abstract String getFirebaseAuthenticationToken();

        public abstract String getFirebaseInstallationId();
    }

    InstallIds getInstallIds();
}
