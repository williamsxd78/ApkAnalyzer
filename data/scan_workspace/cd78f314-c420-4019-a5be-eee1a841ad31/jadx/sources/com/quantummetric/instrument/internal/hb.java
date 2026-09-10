package com.quantummetric.instrument.internal;

/* loaded from: classes3.dex */
public class hb {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    private final float e;
    private final float f;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        private static final /* synthetic */ int[] c = {1, 2};

        public static int[] values$4e8a76d2() {
            return (int[]) c.clone();
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes3.dex */
    public static final class b {
        public static final int a = 1;
        public static final int b = 2;
        private static final /* synthetic */ int[] c = {1, 2};

        public static int[] values$3ae80574() {
            return (int[]) c.clone();
        }
    }

    public hb(float f, float f2, float f3, float f4) {
        this.a = f3;
        this.b = f4;
        this.e = f;
        this.f = f2;
        int i = Math.abs(f4 - f2) > Math.abs(f3 - f) ? a.b : a.a;
        this.d = i;
        if (i == a.b) {
            this.c = f4 - f2 > 0.0f ? b.b : b.a;
        } else {
            this.c = f3 - f > 0.0f ? b.b : b.a;
        }
    }

    public final float a() {
        return this.a - this.e;
    }

    public final float b() {
        return this.b - this.f;
    }

    public final float c() {
        return Math.abs(this.a - this.e);
    }

    public final float d() {
        return Math.abs(this.b - this.f);
    }

    public String toString() {
        return this.e + ", " + this.f + " | " + this.a + ", " + this.b;
    }
}
