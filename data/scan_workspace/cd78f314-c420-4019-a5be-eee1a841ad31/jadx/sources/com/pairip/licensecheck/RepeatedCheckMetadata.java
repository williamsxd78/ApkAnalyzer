package com.pairip.licensecheck;

/* loaded from: classes2.dex */
public class RepeatedCheckMetadata {
    private final long durationToRetryMillis;
    private final long timeToRetryMillis;

    public RepeatedCheckMetadata(long j, long j2) {
        if (j <= 0) {
            throw new IllegalArgumentException("Duration to retry must be positive.");
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException("Time to retry must be positive.");
        }
        this.durationToRetryMillis = j;
        this.timeToRetryMillis = j2;
    }

    public long getDurationToRetryMillis() {
        return this.durationToRetryMillis;
    }

    public long getTimeToRetryMillis() {
        return this.timeToRetryMillis;
    }
}
