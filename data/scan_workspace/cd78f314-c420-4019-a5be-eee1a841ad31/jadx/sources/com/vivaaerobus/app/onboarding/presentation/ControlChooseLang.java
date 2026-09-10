package com.vivaaerobus.app.onboarding.presentation;

import kotlin.Metadata;

/* compiled from: ControlChooseLang.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/vivaaerobus/app/onboarding/presentation/ControlChooseLang;", "", "<init>", "()V", "isFirstOpenChooseLang", "", "()Z", "setFirstOpenChooseLang", "(Z)V", "onBoarding_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ControlChooseLang {
    private static boolean isFirstOpenChooseLang;
    public static final ControlChooseLang INSTANCE = new ControlChooseLang();
    public static final int $stable = 8;

    private ControlChooseLang() {
    }

    public final boolean isFirstOpenChooseLang() {
        return isFirstOpenChooseLang;
    }

    public final void setFirstOpenChooseLang(boolean z) {
        isFirstOpenChooseLang = z;
    }
}
