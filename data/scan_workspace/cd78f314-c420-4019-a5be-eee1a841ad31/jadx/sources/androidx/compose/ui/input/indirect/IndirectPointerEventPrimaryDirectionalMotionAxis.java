package androidx.compose.ui.input.indirect;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: IndirectPointerEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087@\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\r"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "hashCode", "toString", "", "Companion", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes11.dex */
public final class IndirectPointerEventPrimaryDirectionalMotionAxis {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int None = m6722constructorimpl(0);
    private static final int X = m6722constructorimpl(1);
    private static final int Y = m6722constructorimpl(2);
    private final int value;

    /* compiled from: IndirectPointerEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis$Companion;", "", "<init>", "()V", "None", "Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "getNone-nZO2Niw", "()I", "I", "X", "getX-nZO2Niw", "Y", "getY-nZO2Niw", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getNone-nZO2Niw, reason: not valid java name */
        public final int m6728getNonenZO2Niw() {
            return IndirectPointerEventPrimaryDirectionalMotionAxis.None;
        }

        /* renamed from: getX-nZO2Niw, reason: not valid java name */
        public final int m6729getXnZO2Niw() {
            return IndirectPointerEventPrimaryDirectionalMotionAxis.X;
        }

        /* renamed from: getY-nZO2Niw, reason: not valid java name */
        public final int m6730getYnZO2Niw() {
            return IndirectPointerEventPrimaryDirectionalMotionAxis.Y;
        }
    }

    private /* synthetic */ IndirectPointerEventPrimaryDirectionalMotionAxis(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IndirectPointerEventPrimaryDirectionalMotionAxis m6721boximpl(int i) {
        return new IndirectPointerEventPrimaryDirectionalMotionAxis(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m6722constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6723equalsimpl(int i, Object obj) {
        return (obj instanceof IndirectPointerEventPrimaryDirectionalMotionAxis) && i == ((IndirectPointerEventPrimaryDirectionalMotionAxis) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6724equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6725hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6726toStringimpl(int i) {
        return "IndirectPointerEventPrimaryDirectionalMotionAxis(value=" + i + ')';
    }

    public boolean equals(Object other) {
        return m6723equalsimpl(this.value, other);
    }

    public int hashCode() {
        return m6725hashCodeimpl(this.value);
    }

    public String toString() {
        return m6726toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
