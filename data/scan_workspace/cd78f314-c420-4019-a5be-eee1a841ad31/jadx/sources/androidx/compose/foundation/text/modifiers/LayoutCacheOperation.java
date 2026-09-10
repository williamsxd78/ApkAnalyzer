package androidx.compose.foundation.text.modifiers;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ParagraphLayoutCache.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/text/modifiers/LayoutCacheOperation;", "", "flag", "", "constructor-impl", "(J)J", "getFlag", "()J", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class LayoutCacheOperation {
    private final long flag;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long MarkDirtyStyle = m1813constructorimpl(0);
    private static final long MarkDirtyDensity = m1813constructorimpl(1);
    private static final long MarkDirtyNode = m1813constructorimpl(2);
    private static final long LayoutWithConstraints = m1813constructorimpl(3);

    /* compiled from: ParagraphLayoutCache.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/modifiers/LayoutCacheOperation$Companion;", "", "<init>", "()V", "MarkDirtyStyle", "Landroidx/compose/foundation/text/modifiers/LayoutCacheOperation;", "getMarkDirtyStyle-DEKiAbY", "()J", OperatorName.SET_LINE_CAPSTYLE, "MarkDirtyDensity", "getMarkDirtyDensity-DEKiAbY", "MarkDirtyNode", "getMarkDirtyNode-DEKiAbY", "LayoutWithConstraints", "getLayoutWithConstraints-DEKiAbY", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getLayoutWithConstraints-DEKiAbY, reason: not valid java name */
        public final long m1819getLayoutWithConstraintsDEKiAbY() {
            return LayoutCacheOperation.LayoutWithConstraints;
        }

        /* renamed from: getMarkDirtyDensity-DEKiAbY, reason: not valid java name */
        public final long m1820getMarkDirtyDensityDEKiAbY() {
            return LayoutCacheOperation.MarkDirtyDensity;
        }

        /* renamed from: getMarkDirtyNode-DEKiAbY, reason: not valid java name */
        public final long m1821getMarkDirtyNodeDEKiAbY() {
            return LayoutCacheOperation.MarkDirtyNode;
        }

        /* renamed from: getMarkDirtyStyle-DEKiAbY, reason: not valid java name */
        public final long m1822getMarkDirtyStyleDEKiAbY() {
            return LayoutCacheOperation.MarkDirtyStyle;
        }
    }

    private /* synthetic */ LayoutCacheOperation(long j) {
        this.flag = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LayoutCacheOperation m1812boximpl(long j) {
        return new LayoutCacheOperation(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m1813constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1814equalsimpl(long j, Object obj) {
        return (obj instanceof LayoutCacheOperation) && j == ((LayoutCacheOperation) obj).m1818unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1815equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1816hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1817toStringimpl(long j) {
        return "LayoutCacheOperation(flag=" + j + ')';
    }

    public boolean equals(Object other) {
        return m1814equalsimpl(this.flag, other);
    }

    public final long getFlag() {
        return this.flag;
    }

    public int hashCode() {
        return m1816hashCodeimpl(this.flag);
    }

    public String toString() {
        return m1817toStringimpl(this.flag);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1818unboximpl() {
        return this.flag;
    }
}
