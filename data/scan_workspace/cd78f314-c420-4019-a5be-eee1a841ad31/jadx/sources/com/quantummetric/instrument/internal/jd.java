package com.quantummetric.instrument.internal;

import androidx.core.math.MathUtils;

/* loaded from: classes3.dex */
public interface jd {
    static float a(float f, float f2, float f3, float f4, int i, int i2) {
        float f5 = i2;
        float f6 = i;
        return (MathUtils.clamp(f3, 0.0f, f5) - MathUtils.clamp(f, 0.0f, f5)) * (MathUtils.clamp(f4, 0.0f, f6) - MathUtils.clamp(f2, 0.0f, f6));
    }

    boolean a(Object obj);

    boolean a(Object obj, double d);
}
