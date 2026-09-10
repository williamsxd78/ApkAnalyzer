package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SubcomposeLayout.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0083@\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/layout/SLOperation;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "hashCode", "toString", "", "Companion", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes11.dex */
final class SLOperation {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int CancelPausedPrecomposition = m7429constructorimpl(0);
    private static final int ReuseForceSyncDeactivation = m7429constructorimpl(1);
    private static final int ReuseScheduleOutOfFrameDeactivation = m7429constructorimpl(2);
    private static final int ReuseSyncDeactivation = m7429constructorimpl(3);
    private static final int ReuseDeactivationViaHost = m7429constructorimpl(4);
    private static final int TookFromPrecomposeMap = m7429constructorimpl(5);
    private static final int Subcompose = m7429constructorimpl(6);
    private static final int SubcomposeNew = m7429constructorimpl(7);
    private static final int SubcomposePausable = m7429constructorimpl(8);
    private static final int SubcomposeForceReuse = m7429constructorimpl(9);
    private static final int DeactivateOutOfFrame = m7429constructorimpl(10);
    private static final int DeactivateOutOfFrameCancelled = m7429constructorimpl(11);
    private static final int SlotToReusedFromOnDeactivate = m7429constructorimpl(12);
    private static final int SlotToReusedFromOnReuse = m7429constructorimpl(13);
    private static final int Reused = m7429constructorimpl(14);
    private static final int ResumePaused = m7429constructorimpl(15);
    private static final int PausePaused = m7429constructorimpl(16);
    private static final int ApplyPaused = m7429constructorimpl(17);

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007R\u0013\u0010\u0011\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007R\u0013\u0010\u0013\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0014\u0010\u0007R\u0013\u0010\u0015\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0016\u0010\u0007R\u0013\u0010\u0017\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0018\u0010\u0007R\u0013\u0010\u0019\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001a\u0010\u0007R\u0013\u0010\u001b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001c\u0010\u0007R\u0013\u0010\u001d\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001e\u0010\u0007R\u0013\u0010\u001f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b \u0010\u0007R\u0013\u0010!\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\"\u0010\u0007R\u0013\u0010#\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b$\u0010\u0007R\u0013\u0010%\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b&\u0010\u0007R\u0013\u0010'\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b(\u0010\u0007R\u0013\u0010)\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b*\u0010\u0007¨\u0006+"}, d2 = {"Landroidx/compose/ui/layout/SLOperation$Companion;", "", "<init>", "()V", "CancelPausedPrecomposition", "Landroidx/compose/ui/layout/SLOperation;", "getCancelPausedPrecomposition-NjRlDlw", "()I", "I", "ReuseForceSyncDeactivation", "getReuseForceSyncDeactivation-NjRlDlw", "ReuseScheduleOutOfFrameDeactivation", "getReuseScheduleOutOfFrameDeactivation-NjRlDlw", "ReuseSyncDeactivation", "getReuseSyncDeactivation-NjRlDlw", "ReuseDeactivationViaHost", "getReuseDeactivationViaHost-NjRlDlw", "TookFromPrecomposeMap", "getTookFromPrecomposeMap-NjRlDlw", "Subcompose", "getSubcompose-NjRlDlw", "SubcomposeNew", "getSubcomposeNew-NjRlDlw", "SubcomposePausable", "getSubcomposePausable-NjRlDlw", "SubcomposeForceReuse", "getSubcomposeForceReuse-NjRlDlw", "DeactivateOutOfFrame", "getDeactivateOutOfFrame-NjRlDlw", "DeactivateOutOfFrameCancelled", "getDeactivateOutOfFrameCancelled-NjRlDlw", "SlotToReusedFromOnDeactivate", "getSlotToReusedFromOnDeactivate-NjRlDlw", "SlotToReusedFromOnReuse", "getSlotToReusedFromOnReuse-NjRlDlw", "Reused", "getReused-NjRlDlw", "ResumePaused", "getResumePaused-NjRlDlw", "PausePaused", "getPausePaused-NjRlDlw", "ApplyPaused", "getApplyPaused-NjRlDlw", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getApplyPaused-NjRlDlw, reason: not valid java name */
        public final int m7435getApplyPausedNjRlDlw() {
            return SLOperation.ApplyPaused;
        }

        /* renamed from: getCancelPausedPrecomposition-NjRlDlw, reason: not valid java name */
        public final int m7436getCancelPausedPrecompositionNjRlDlw() {
            return SLOperation.CancelPausedPrecomposition;
        }

        /* renamed from: getDeactivateOutOfFrame-NjRlDlw, reason: not valid java name */
        public final int m7437getDeactivateOutOfFrameNjRlDlw() {
            return SLOperation.DeactivateOutOfFrame;
        }

        /* renamed from: getDeactivateOutOfFrameCancelled-NjRlDlw, reason: not valid java name */
        public final int m7438getDeactivateOutOfFrameCancelledNjRlDlw() {
            return SLOperation.DeactivateOutOfFrameCancelled;
        }

        /* renamed from: getPausePaused-NjRlDlw, reason: not valid java name */
        public final int m7439getPausePausedNjRlDlw() {
            return SLOperation.PausePaused;
        }

        /* renamed from: getResumePaused-NjRlDlw, reason: not valid java name */
        public final int m7440getResumePausedNjRlDlw() {
            return SLOperation.ResumePaused;
        }

        /* renamed from: getReuseDeactivationViaHost-NjRlDlw, reason: not valid java name */
        public final int m7441getReuseDeactivationViaHostNjRlDlw() {
            return SLOperation.ReuseDeactivationViaHost;
        }

        /* renamed from: getReuseForceSyncDeactivation-NjRlDlw, reason: not valid java name */
        public final int m7442getReuseForceSyncDeactivationNjRlDlw() {
            return SLOperation.ReuseForceSyncDeactivation;
        }

        /* renamed from: getReuseScheduleOutOfFrameDeactivation-NjRlDlw, reason: not valid java name */
        public final int m7443getReuseScheduleOutOfFrameDeactivationNjRlDlw() {
            return SLOperation.ReuseScheduleOutOfFrameDeactivation;
        }

        /* renamed from: getReuseSyncDeactivation-NjRlDlw, reason: not valid java name */
        public final int m7444getReuseSyncDeactivationNjRlDlw() {
            return SLOperation.ReuseSyncDeactivation;
        }

        /* renamed from: getReused-NjRlDlw, reason: not valid java name */
        public final int m7445getReusedNjRlDlw() {
            return SLOperation.Reused;
        }

        /* renamed from: getSlotToReusedFromOnDeactivate-NjRlDlw, reason: not valid java name */
        public final int m7446getSlotToReusedFromOnDeactivateNjRlDlw() {
            return SLOperation.SlotToReusedFromOnDeactivate;
        }

        /* renamed from: getSlotToReusedFromOnReuse-NjRlDlw, reason: not valid java name */
        public final int m7447getSlotToReusedFromOnReuseNjRlDlw() {
            return SLOperation.SlotToReusedFromOnReuse;
        }

        /* renamed from: getSubcompose-NjRlDlw, reason: not valid java name */
        public final int m7448getSubcomposeNjRlDlw() {
            return SLOperation.Subcompose;
        }

        /* renamed from: getSubcomposeForceReuse-NjRlDlw, reason: not valid java name */
        public final int m7449getSubcomposeForceReuseNjRlDlw() {
            return SLOperation.SubcomposeForceReuse;
        }

        /* renamed from: getSubcomposeNew-NjRlDlw, reason: not valid java name */
        public final int m7450getSubcomposeNewNjRlDlw() {
            return SLOperation.SubcomposeNew;
        }

        /* renamed from: getSubcomposePausable-NjRlDlw, reason: not valid java name */
        public final int m7451getSubcomposePausableNjRlDlw() {
            return SLOperation.SubcomposePausable;
        }

        /* renamed from: getTookFromPrecomposeMap-NjRlDlw, reason: not valid java name */
        public final int m7452getTookFromPrecomposeMapNjRlDlw() {
            return SLOperation.TookFromPrecomposeMap;
        }
    }

    private /* synthetic */ SLOperation(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SLOperation m7428boximpl(int i) {
        return new SLOperation(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7429constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7430equalsimpl(int i, Object obj) {
        return (obj instanceof SLOperation) && i == ((SLOperation) obj).m7434unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7431equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7432hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7433toStringimpl(int i) {
        return "SLOperation(value=" + i + ')';
    }

    public boolean equals(Object other) {
        return m7430equalsimpl(this.value, other);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m7432hashCodeimpl(this.value);
    }

    public String toString() {
        return m7433toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7434unboximpl() {
        return this.value;
    }
}
