package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: StateObjectImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind;", "", "mask", "", "constructor-impl", "(I)I", "getMask", "()I", "withReadIn", "reader", "withReadIn-3QSx2Dw", "(II)I", "isReadIn", "", "isReadIn-h_f27i8", "(II)Z", "equals", "other", "hashCode", "toString", "", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes11.dex */
public final class ReaderKind {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int mask;

    /* compiled from: StateObjectImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind$Companion;", "", "<init>", "()V", "Composition", "Landroidx/compose/runtime/snapshots/ReaderKind;", "getComposition-6f8NoZ8", "()I", "SnapshotStateObserver", "getSnapshotStateObserver-6f8NoZ8", "SnapshotFlow", "getSnapshotFlow-6f8NoZ8", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m5348getComposition6f8NoZ8() {
            return ReaderKind.m5339constructorimpl(1);
        }

        /* renamed from: getSnapshotFlow-6f8NoZ8, reason: not valid java name */
        public final int m5349getSnapshotFlow6f8NoZ8() {
            return ReaderKind.m5339constructorimpl(4);
        }

        /* renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m5350getSnapshotStateObserver6f8NoZ8() {
            return ReaderKind.m5339constructorimpl(2);
        }
    }

    private /* synthetic */ ReaderKind(int i) {
        this.mask = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ReaderKind m5338boximpl(int i) {
        return new ReaderKind(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5339constructorimpl(int i) {
        return i;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m5340constructorimpl$default(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m5339constructorimpl(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5341equalsimpl(int i, Object obj) {
        return (obj instanceof ReaderKind) && i == ((ReaderKind) obj).m5347unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5342equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5343hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m5344isReadInh_f27i8(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5345toStringimpl(int i) {
        return "ReaderKind(mask=" + i + ')';
    }

    /* renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m5346withReadIn3QSx2Dw(int i, int i2) {
        return m5339constructorimpl(i | i2);
    }

    public boolean equals(Object other) {
        return m5341equalsimpl(this.mask, other);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m5343hashCodeimpl(this.mask);
    }

    public String toString() {
        return m5345toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5347unboximpl() {
        return this.mask;
    }
}
