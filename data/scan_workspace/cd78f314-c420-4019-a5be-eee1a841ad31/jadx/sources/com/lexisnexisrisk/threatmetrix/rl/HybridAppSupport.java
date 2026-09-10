package com.lexisnexisrisk.threatmetrix.rl;

import android.app.Activity;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public interface HybridAppSupport {
    void clearRegistrations(@Nonnull Activity activity);

    void setPageName(@Nonnull Activity activity, @Nonnull String str);
}
