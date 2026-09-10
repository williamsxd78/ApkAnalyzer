package com.inmobile.sse.ext;

import android.content.pm.PackageManager;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¨\u0006\u0006"}, d2 = {"permissionGranted", "", "Landroid/content/pm/PackageManager;", "permission", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "sse_fullNormalRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class PackageManagerExtKt {

    /* renamed from: ж0436ж0436ж04360436, reason: contains not printable characters */
    public static int f23970436043604360436 = 1;

    /* renamed from: жж04360436ж04360436, reason: contains not printable characters */
    public static int f23980436043604360436 = 2;

    /* renamed from: жжж0436ж04360436, reason: contains not printable characters */
    public static int f2399043604360436 = 28;

    /* renamed from: жжжж043604360436, reason: contains not printable characters */
    public static int f2400043604360436;

    public static final boolean permissionGranted(PackageManager packageManager, String permission, String packageName) {
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        int i = f2399043604360436;
        if (((f23970436043604360436 + i) * i) % f23980436043604360436 != f2400043604360436) {
            f2399043604360436 = m1324804360436043604360436();
            f2400043604360436 = 83;
        }
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        int i2 = f2399043604360436;
        if ((i2 * (f23970436043604360436 + i2)) % f23980436043604360436 != 0) {
            f2399043604360436 = m1324804360436043604360436();
            f23970436043604360436 = 41;
        }
        return packageManager.checkPermission(permission, packageName) == 0;
    }

    /* renamed from: ж043604360436ж04360436, reason: contains not printable characters */
    public static int m1324804360436043604360436() {
        return 53;
    }
}
