package androidx.compose.ui.geometry;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* compiled from: CornerRadius.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087@\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0014\u0010\rJ!\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0019H\u0087\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0019H\u0087\b¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001f\u0010\u0005J\u0018\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b%\u0010#J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b+\u0010)J\u000f\u0010,\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\u0088\u0001\u0002¨\u00064"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", "x", "", "getX$annotations", "()V", "getX-impl", "(J)F", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", ContentfulConstants.CONTENT_TYPE_COPY, "copy-OHQCggk", "(JFF)J", "isZero", "", "isZero-impl", "(J)Z", "isCircular", "isCircular-impl", "unaryMinus", "unaryMinus-kKHJgLs", "minus", "other", "minus-vF7b-mM", "(JJ)J", "plus", "plus-vF7b-mM", "times", "operand", "times-Bz7bX_o", "(JF)J", TtmlNode.TAG_DIV, "div-Bz7bX_o", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "hashCode", "", "Companion", "ui-geometry"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes11.dex */
public final class CornerRadius {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m5604constructorimpl(0);
    private final long packedValue;

    /* compiled from: CornerRadius.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius$Companion;", "", "<init>", "()V", "Zero", "Landroidx/compose/ui/geometry/CornerRadius;", "getZero-kKHJgLs$annotations", "getZero-kKHJgLs", "()J", OperatorName.SET_LINE_CAPSTYLE, "ui-geometry"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-kKHJgLs$annotations, reason: not valid java name */
        public static /* synthetic */ void m5621getZerokKHJgLs$annotations() {
        }

        /* renamed from: getZero-kKHJgLs, reason: not valid java name */
        public final long m5622getZerokKHJgLs() {
            return CornerRadius.Zero;
        }
    }

    private /* synthetic */ CornerRadius(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CornerRadius m5601boximpl(long j) {
        return new CornerRadius(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m5602component1impl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m5603component2impl(long j) {
        return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5604constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-OHQCggk, reason: not valid java name */
    public static final long m5605copyOHQCggk(long j, float f, float f2) {
        return m5604constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax));
    }

    /* renamed from: copy-OHQCggk$default, reason: not valid java name */
    public static /* synthetic */ long m5606copyOHQCggk$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j));
        }
        return m5605copyOHQCggk(j, f, f2);
    }

    /* renamed from: div-Bz7bX_o, reason: not valid java name */
    public static final long m5607divBz7bX_o(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) / f;
        return m5604constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5608equalsimpl(long j, Object obj) {
        return (obj instanceof CornerRadius) && j == ((CornerRadius) obj).m5620unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5609equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m5610getXimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m5611getYimpl(long j) {
        return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5612hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isCircular-impl, reason: not valid java name */
    public static final boolean m5613isCircularimpl(long j) {
        return (j >>> 32) == (j & BodyPartID.bodyIdMax);
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m5614isZeroimpl(long j) {
        long j2 = j & 9223372034707292159L;
        return (((~j2) & (j2 - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) != 0;
    }

    /* renamed from: minus-vF7b-mM, reason: not valid java name */
    public static final long m5615minusvF7bmM(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax));
        return m5604constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax));
    }

    /* renamed from: plus-vF7b-mM, reason: not valid java name */
    public static final long m5616plusvF7bmM(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) + Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax));
        return m5604constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax));
    }

    /* renamed from: times-Bz7bX_o, reason: not valid java name */
    public static final long m5617timesBz7bX_o(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) * f;
        return m5604constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5618toStringimpl(long j) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        if (intBitsToFloat == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i), 1) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i2), 1) + ')';
    }

    /* renamed from: unaryMinus-kKHJgLs, reason: not valid java name */
    public static final long m5619unaryMinuskKHJgLs(long j) {
        return m5604constructorimpl(j ^ (-9223372034707292160L));
    }

    public boolean equals(Object other) {
        return m5608equalsimpl(this.packedValue, other);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m5612hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m5618toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5620unboximpl() {
        return this.packedValue;
    }
}
