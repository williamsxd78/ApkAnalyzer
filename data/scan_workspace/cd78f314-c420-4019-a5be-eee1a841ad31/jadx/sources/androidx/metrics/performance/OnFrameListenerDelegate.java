package androidx.metrics.performance;

import kotlin.Metadata;

/* compiled from: JankStatsApi16Impl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Landroidx/metrics/performance/OnFrameListenerDelegate;", "", "()V", "onFrame", "", "startTime", "", "uiDuration", "expectedDuration", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class OnFrameListenerDelegate {
    public abstract void onFrame(long startTime, long uiDuration, long expectedDuration);
}
