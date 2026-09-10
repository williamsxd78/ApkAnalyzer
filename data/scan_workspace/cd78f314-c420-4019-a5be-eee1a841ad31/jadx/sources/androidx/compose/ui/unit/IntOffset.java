package androidx.compose.ui.unit;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* compiled from: IntOffset.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087@\u0018\u0000 12\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0014\u0010\rJ!\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001f\u0010\u0005J\u0018\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"H\u0087\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"H\u0087\u0002¢\u0006\u0004\b&\u0010$J\u0018\u0010'\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020+H\u0017¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020/2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\u0088\u0001\u0002¨\u00062"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", "x", "", "getX$annotations", "()V", "getX-impl", "(J)I", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", ContentfulConstants.CONTENT_TYPE_COPY, "copy-iSbpLlY", "(JII)J", "minus", "other", "minus-qkQi6aY", "(JJ)J", "plus", "plus-qkQi6aY", "unaryMinus", "unaryMinus-nOcc-ac", "times", "operand", "", "times-Bjo55l4", "(JF)J", TtmlNode.TAG_DIV, "div-Bjo55l4", "rem", "rem-Bjo55l4", "(JI)J", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "", "hashCode", "Companion", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes11.dex */
public final class IntOffset {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m8890constructorimpl(0);
    private static final long Max = m8890constructorimpl(9223372034707292159L);

    /* compiled from: IntOffset.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/unit/IntOffset$Companion;", "", "<init>", "()V", "Zero", "Landroidx/compose/ui/unit/IntOffset;", "getZero-nOcc-ac", "()J", OperatorName.SET_LINE_CAPSTYLE, "Max", "getMax-nOcc-ac", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getMax-nOcc-ac, reason: not valid java name */
        public final long m8906getMaxnOccac() {
            return IntOffset.Max;
        }

        /* renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m8907getZeronOccac() {
            return IntOffset.Zero;
        }
    }

    private /* synthetic */ IntOffset(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m8887boximpl(long j) {
        return new IntOffset(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m8888component1impl(long j) {
        return m8896getXimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m8889component2impl(long j) {
        return m8897getYimpl(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8890constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m8891copyiSbpLlY(long j, int i, int i2) {
        return m8890constructorimpl((i << 32) | (i2 & BodyPartID.bodyIdMax));
    }

    /* renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m8892copyiSbpLlY$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (BodyPartID.bodyIdMax & j);
        }
        return m8891copyiSbpLlY(j, i, i2);
    }

    /* renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m8893divBjo55l4(long j, float f) {
        return m8890constructorimpl((Math.round(((int) (j >> 32)) / f) << 32) | (Math.round(((int) (j & BodyPartID.bodyIdMax)) / f) & BodyPartID.bodyIdMax));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8894equalsimpl(long j, Object obj) {
        return (obj instanceof IntOffset) && j == ((IntOffset) obj).m8905unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8895equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final int m8896getXimpl(long j) {
        return (int) (j >> 32);
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final int m8897getYimpl(long j) {
        return (int) (j & BodyPartID.bodyIdMax);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8898hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m8899minusqkQi6aY(long j, long j2) {
        return m8890constructorimpl(((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & BodyPartID.bodyIdMax)) - ((int) (j2 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax));
    }

    /* renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m8900plusqkQi6aY(long j, long j2) {
        return m8890constructorimpl(((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & BodyPartID.bodyIdMax)) + ((int) (j2 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax));
    }

    /* renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m8901remBjo55l4(long j, int i) {
        return m8890constructorimpl(((((int) (j >> 32)) % i) << 32) | ((((int) (j & BodyPartID.bodyIdMax)) % i) & BodyPartID.bodyIdMax));
    }

    /* renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m8902timesBjo55l4(long j, float f) {
        return m8890constructorimpl((Math.round(((int) (j >> 32)) * f) << 32) | (Math.round(((int) (j & BodyPartID.bodyIdMax)) * f) & BodyPartID.bodyIdMax));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8903toStringimpl(long j) {
        return "(" + m8896getXimpl(j) + ", " + m8897getYimpl(j) + ')';
    }

    /* renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m8904unaryMinusnOccac(long j) {
        return m8890constructorimpl(((-((int) (j & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | ((-((int) (j >> 32))) << 32));
    }

    public boolean equals(Object other) {
        return m8894equalsimpl(this.packedValue, other);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m8898hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m8903toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8905unboximpl() {
        return this.packedValue;
    }
}
