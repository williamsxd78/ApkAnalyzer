package com.vivaaerobus.app.resources.presentation.animation;

import android.view.animation.Interpolator;
import kotlin.Metadata;

/* compiled from: BounceInterpolator.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/vivaaerobus/app/resources/presentation/animation/BounceInterpolator;", "Landroid/view/animation/Interpolator;", "amplitude", "", "frequency", "<init>", "(DD)V", "minAmplitude", "minFrequency", "getInterpolation", "", "time", "resources_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BounceInterpolator implements Interpolator {
    public static final int $stable = 8;
    private double minAmplitude;
    private double minFrequency;

    public BounceInterpolator(double d, double d2) {
        this.minAmplitude = d;
        this.minFrequency = d2;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float time) {
        return (float) (((-1) * Math.pow(2.718281828459045d, (-time) / this.minAmplitude) * Math.cos(this.minFrequency * time)) + 1);
    }
}
