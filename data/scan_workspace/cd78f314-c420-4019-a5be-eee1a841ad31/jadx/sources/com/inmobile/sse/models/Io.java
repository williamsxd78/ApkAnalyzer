package com.inmobile.sse.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/inmobile/sse/models/Io;", "", "inputs", "", "", "outputs", "(Ljava/util/List;Ljava/util/List;)V", "getInputs", "()Ljava/util/List;", "getOutputs", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Io {

    /* renamed from: Л041B041B041BЛ041B041B, reason: contains not printable characters */
    public static int f2495041B041B041B041B041B = 1;

    /* renamed from: ЛЛ041B041BЛ041B041B, reason: contains not printable characters */
    public static int f2496041B041B041B041B = 37;

    /* renamed from: ЛЛ041BЛ041B041B041B, reason: contains not printable characters */
    public static int f2497041B041B041B041B = 0;

    /* renamed from: ЛЛЛЛ041B041B041B, reason: contains not printable characters */
    public static int f2498041B041B041B = 2;
    private final List<String> inputs;
    private final List<String> outputs;

    public Io(List<String> inputs, List<String> outputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(outputs, "outputs");
        this.inputs = inputs;
        this.outputs = outputs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Io copy$default(Io io2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = io2.inputs;
        }
        if (((m13344041B041B041B041B() + f2495041B041B041B041B041B) * m13344041B041B041B041B()) % f2498041B041B041B != f2497041B041B041B041B) {
            f2496041B041B041B041B = m13344041B041B041B041B();
            f2497041B041B041B041B = m13344041B041B041B041B();
        }
        if ((i & 2) != 0) {
            list2 = io2.outputs;
        }
        return io2.copy(list, list2);
    }

    /* renamed from: Л041B041BЛ041B041B041B, reason: contains not printable characters */
    public static int m13343041B041B041B041B041B() {
        return 2;
    }

    /* renamed from: Л041BЛЛ041B041B041B, reason: contains not printable characters */
    public static int m13344041B041B041B041B() {
        return 58;
    }

    /* renamed from: ЛЛЛ041B041B041B041B, reason: contains not printable characters */
    public static int m13345041B041B041B041B() {
        return 0;
    }

    public final List<String> component1() {
        List<String> list = this.inputs;
        int i = f2496041B041B041B041B;
        if (((f2495041B041B041B041B041B + i) * i) % f2498041B041B041B != f2497041B041B041B041B) {
            f2496041B041B041B041B = 82;
            f2497041B041B041B041B = 96;
        }
        return list;
    }

    public final List<String> component2() {
        int i = f2496041B041B041B041B;
        if (((f2495041B041B041B041B041B + i) * i) % f2498041B041B041B != f2497041B041B041B041B) {
            f2496041B041B041B041B = m13344041B041B041B041B();
            f2497041B041B041B041B = m13344041B041B041B041B();
        }
        List<String> list = this.outputs;
        int i2 = f2496041B041B041B041B;
        if ((i2 * (f2495041B041B041B041B041B + i2)) % f2498041B041B041B != 0) {
            f2496041B041B041B041B = 54;
            f2497041B041B041B041B = 19;
        }
        return list;
    }

    public final Io copy(List<String> inputs, List<String> outputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(outputs, "outputs");
        Io io2 = new Io(inputs, outputs);
        if (((m13344041B041B041B041B() + f2495041B041B041B041B041B) * m13344041B041B041B041B()) % f2498041B041B041B != f2497041B041B041B041B) {
            f2496041B041B041B041B = 51;
            f2497041B041B041B041B = 98;
        }
        return io2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        int i = f2496041B041B041B041B;
        if (((f2495041B041B041B041B041B + i) * i) % f2498041B041B041B != m13345041B041B041B041B()) {
            f2496041B041B041B041B = 87;
            f2497041B041B041B041B = 73;
        }
        if (!(other instanceof Io)) {
            return false;
        }
        Io io2 = (Io) other;
        return Intrinsics.areEqual(this.inputs, io2.inputs) && Intrinsics.areEqual(this.outputs, io2.outputs);
    }

    public final List<String> getInputs() {
        List<String> list = this.inputs;
        int i = f2496041B041B041B041B;
        if (((f2495041B041B041B041B041B + i) * i) % f2498041B041B041B != f2497041B041B041B041B) {
            int m13344041B041B041B041B = m13344041B041B041B041B();
            int i2 = f2496041B041B041B041B;
            if ((i2 * (f2495041B041B041B041B041B + i2)) % f2498041B041B041B != 0) {
                f2496041B041B041B041B = 88;
                f2497041B041B041B041B = 38;
            }
            f2496041B041B041B041B = m13344041B041B041B041B;
            f2497041B041B041B041B = 20;
        }
        return list;
    }

    public final List<String> getOutputs() {
        int i = f2496041B041B041B041B;
        if ((i * (f2495041B041B041B041B041B + i)) % m13343041B041B041B041B041B() != 0) {
            f2496041B041B041B041B = m13344041B041B041B041B();
            f2497041B041B041B041B = 15;
        }
        List<String> list = this.outputs;
        if (((m13344041B041B041B041B() + f2495041B041B041B041B041B) * m13344041B041B041B041B()) % f2498041B041B041B != f2497041B041B041B041B) {
            f2496041B041B041B041B = m13344041B041B041B041B();
            f2497041B041B041B041B = 34;
        }
        return list;
    }

    public int hashCode() {
        int hashCode = this.inputs.hashCode();
        int i = f2496041B041B041B041B;
        if ((i * (f2495041B041B041B041B041B + i)) % f2498041B041B041B != 0) {
            f2496041B041B041B041B = 76;
            f2497041B041B041B041B = m13344041B041B041B041B();
        }
        int i2 = hashCode * 31;
        List<String> list = this.outputs;
        int i3 = f2496041B041B041B041B;
        if (((f2495041B041B041B041B041B + i3) * i3) % f2498041B041B041B != f2497041B041B041B041B) {
            f2496041B041B041B041B = m13344041B041B041B041B();
            f2497041B041B041B041B = 73;
        }
        return i2 + list.hashCode();
    }

    public String toString() {
        int i = f2496041B041B041B041B + f2495041B041B041B041B041B;
        int m13344041B041B041B041B = m13344041B041B041B041B();
        if ((m13344041B041B041B041B * (f2495041B041B041B041B041B + m13344041B041B041B041B)) % f2498041B041B041B != 0) {
            f2496041B041B041B041B = 56;
            f2497041B041B041B041B = m13344041B041B041B041B();
        }
        if ((i * f2496041B041B041B041B) % f2498041B041B041B != f2497041B041B041B041B) {
            f2496041B041B041B041B = m13344041B041B041B041B();
            f2497041B041B041B041B = m13344041B041B041B041B();
        }
        return "Io(inputs=" + this.inputs + ", outputs=" + this.outputs + ')';
    }
}
