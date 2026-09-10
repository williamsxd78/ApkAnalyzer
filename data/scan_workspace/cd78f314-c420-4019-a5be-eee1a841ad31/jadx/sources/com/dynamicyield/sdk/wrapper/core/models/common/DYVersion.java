package com.dynamicyield.sdk.wrapper.core.models.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DYVersion.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/dynamicyield/sdk/wrapper/core/models/common/DYVersion;", "", "major", "", "minor", "patch", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "versionPrefix", "toString", "DY-Sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DYVersion {
    public static final int $stable = 0;
    private final String major;
    private final String minor;
    private final String patch;
    private final String versionPrefix;

    public DYVersion(String major, String minor, String patch) {
        Intrinsics.checkNotNullParameter(major, "major");
        Intrinsics.checkNotNullParameter(minor, "minor");
        Intrinsics.checkNotNullParameter(patch, "patch");
        this.major = major;
        this.minor = minor;
        this.patch = patch;
        this.versionPrefix = "android";
    }

    public String toString() {
        return this.versionPrefix + '-' + this.major + '.' + this.minor + '.' + this.patch;
    }
}
