package androidx.compose.material3;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081@\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\u0088\u0001\u0002¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/SliderRange;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", TtmlNode.START, "", "getStart$annotations", "()V", "getStart-impl", "(J)F", "endInclusive", "getEndInclusive$annotations", "getEndInclusive-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "", "other", "hashCode", "", "Companion", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes11.dex */
public final class SliderRange {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Unspecified = SliderKt.SliderRange(Float.NaN, Float.NaN);
    private final long packedValue;

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/material3/SliderRange$Companion;", "", "<init>", "()V", "Unspecified", "Landroidx/compose/material3/SliderRange;", "getUnspecified-FYbKRX4$annotations", "getUnspecified-FYbKRX4", "()J", OperatorName.SET_LINE_CAPSTYLE, "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-FYbKRX4$annotations, reason: not valid java name */
        public static /* synthetic */ void m3566getUnspecifiedFYbKRX4$annotations() {
        }

        /* renamed from: getUnspecified-FYbKRX4, reason: not valid java name */
        public final long m3567getUnspecifiedFYbKRX4() {
            return SliderRange.Unspecified;
        }
    }

    private /* synthetic */ SliderRange(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SliderRange m3557boximpl(long j) {
        return new SliderRange(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3558constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3559equalsimpl(long j, Object obj) {
        return (obj instanceof SliderRange) && j == ((SliderRange) obj).m3565unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3560equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getEndInclusive$annotations() {
    }

    /* renamed from: getEndInclusive-impl, reason: not valid java name */
    public static final float m3561getEndInclusiveimpl(long j) {
        if (j != Unspecified) {
            return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        }
        throw new IllegalStateException("SliderRange is unspecified".toString());
    }

    public static /* synthetic */ void getStart$annotations() {
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final float m3562getStartimpl(long j) {
        if (j != Unspecified) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("SliderRange is unspecified".toString());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3563hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3564toStringimpl(long j) {
        if (!SliderKt.m3551isSpecifiedIf1S1O4(j)) {
            return "FloatRange.Unspecified";
        }
        return m3562getStartimpl(j) + ".." + m3561getEndInclusiveimpl(j);
    }

    public boolean equals(Object other) {
        return m3559equalsimpl(this.packedValue, other);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m3563hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m3564toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3565unboximpl() {
        return this.packedValue;
    }
}
