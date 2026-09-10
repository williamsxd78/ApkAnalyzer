package br.com.koin.android_sdk.service;

import android.content.Context;
import android.content.SharedPreferences;
import br.com.koin.android_sdk.utils.Constants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SessionManagerService.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lbr/com/koin/android_sdk/service/SessionManagerService;", "", "()V", "createSessionId", "", "expireSessionIdIfNeeded", "", "context", "Landroid/content/Context;", "getSessionId", "setSessionId", "uuidString", "fingerprint-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public class SessionManagerService {
    public final String createSessionId() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        return uuid;
    }

    public final void expireSessionIdIfNeeded(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.RiskSDKPreferences, 0);
        if (System.currentTimeMillis() - sharedPreferences.getLong(Constants.RiskSDKSessionIdCreationTime, -1L) >= 7200000) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(Constants.RiskSDKSessionId, "");
            edit.putLong(Constants.RiskSDKSessionIdCreationTime, -1L);
            edit.apply();
        }
    }

    public String getSessionId(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return String.valueOf(context.getSharedPreferences(Constants.RiskSDKPreferences, 0).getString(Constants.RiskSDKSessionId, ""));
    }

    public final void setSessionId(Context context, String uuidString) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uuidString, "uuidString");
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.RiskSDKPreferences, 0);
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(Constants.RiskSDKSessionId, uuidString);
        edit.putLong(Constants.RiskSDKSessionIdCreationTime, System.currentTimeMillis());
        edit.apply();
    }
}
