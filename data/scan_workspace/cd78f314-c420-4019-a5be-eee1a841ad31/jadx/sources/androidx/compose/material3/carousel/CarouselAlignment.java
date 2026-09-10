package androidx.compose.material3.carousel;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Carousel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081@\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\r"}, d2 = {"Landroidx/compose/material3/carousel/CarouselAlignment;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "hashCode", "toString", "", "Companion", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes11.dex */
public final class CarouselAlignment {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Start = m4042constructorimpl(-1);
    private static final int Center = m4042constructorimpl(0);
    private static final int End = m4042constructorimpl(1);

    /* compiled from: Carousel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/material3/carousel/CarouselAlignment$Companion;", "", "<init>", "()V", "Start", "Landroidx/compose/material3/carousel/CarouselAlignment;", "getStart-NUL3oTo", "()I", "I", "Center", "getCenter-NUL3oTo", "End", "getEnd-NUL3oTo", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCenter-NUL3oTo, reason: not valid java name */
        public final int m4048getCenterNUL3oTo() {
            return CarouselAlignment.Center;
        }

        /* renamed from: getEnd-NUL3oTo, reason: not valid java name */
        public final int m4049getEndNUL3oTo() {
            return CarouselAlignment.End;
        }

        /* renamed from: getStart-NUL3oTo, reason: not valid java name */
        public final int m4050getStartNUL3oTo() {
            return CarouselAlignment.Start;
        }
    }

    private /* synthetic */ CarouselAlignment(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CarouselAlignment m4041boximpl(int i) {
        return new CarouselAlignment(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4042constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4043equalsimpl(int i, Object obj) {
        return (obj instanceof CarouselAlignment) && i == ((CarouselAlignment) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4044equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4045hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4046toStringimpl(int i) {
        return "CarouselAlignment(value=" + i + ')';
    }

    public boolean equals(Object other) {
        return m4043equalsimpl(this.value, other);
    }

    public int hashCode() {
        return m4045hashCodeimpl(this.value);
    }

    public String toString() {
        return m4046toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
