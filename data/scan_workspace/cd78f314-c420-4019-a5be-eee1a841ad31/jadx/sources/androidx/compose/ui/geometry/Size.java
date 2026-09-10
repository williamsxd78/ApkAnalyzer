package androidx.compose.ui.geometry;

import androidx.collection.SieveCacheKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0014\u0010\rJ!\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010(\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u00020\u00192\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\"\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\rR\u001a\u0010%\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\r\u0088\u0001\u0002¨\u00061"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", "width", "", "getWidth$annotations", "()V", "getWidth-impl", "(J)F", "height", "getHeight$annotations", "getHeight-impl", "component1", "component1-impl", "component2", "component2-impl", ContentfulConstants.CONTENT_TYPE_COPY, "copy-xjbvk4A", "(JFF)J", "isEmpty", "", "isEmpty-impl", "(J)Z", "times", "operand", "times-7Ah8Wj8", "(JF)J", TtmlNode.TAG_DIV, "div-7Ah8Wj8", "minDimension", "getMinDimension$annotations", "getMinDimension-impl", "maxDimension", "getMaxDimension$annotations", "getMaxDimension-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "other", "hashCode", "", "Companion", "ui-geometry"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes11.dex */
public final class Size {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m5710constructorimpl(0);
    private static final long Unspecified = m5710constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/geometry/Size$Companion;", "", "<init>", "()V", "Zero", "Landroidx/compose/ui/geometry/Size;", "getZero-NH-jbRc$annotations", "getZero-NH-jbRc", "()J", OperatorName.SET_LINE_CAPSTYLE, "Unspecified", "getUnspecified-NH-jbRc$annotations", "getUnspecified-NH-jbRc", "ui-geometry"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5725getUnspecifiedNHjbRc$annotations() {
        }

        /* renamed from: getZero-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5726getZeroNHjbRc$annotations() {
        }

        /* renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m5727getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }

        /* renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m5728getZeroNHjbRc() {
            return Size.Zero;
        }
    }

    private /* synthetic */ Size(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Size m5707boximpl(long j) {
        return new Size(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m5708component1impl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m5709component2impl(long j) {
        return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5710constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m5711copyxjbvk4A(long j, float f, float f2) {
        return m5710constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax));
    }

    /* renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m5712copyxjbvk4A$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j));
        }
        return m5711copyxjbvk4A(j, f, f2);
    }

    /* renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m5713div7Ah8Wj8(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) / f;
        return m5710constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5714equalsimpl(long j, Object obj) {
        return (obj instanceof Size) && j == ((Size) obj).m5724unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5715equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final float m5716getHeightimpl(long j) {
        return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
    }

    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    /* renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m5717getMaxDimensionimpl(long j) {
        return Math.max(Float.intBitsToFloat((int) ((j >> 32) & SieveCacheKt.NodeLinkMask)), Float.intBitsToFloat((int) (j & SieveCacheKt.NodeLinkMask)));
    }

    public static /* synthetic */ void getMinDimension$annotations() {
    }

    /* renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m5718getMinDimensionimpl(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & SieveCacheKt.NodeLinkMask)), Float.intBitsToFloat((int) (j & SieveCacheKt.NodeLinkMask)));
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final float m5719getWidthimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5720hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m5721isEmptyimpl(long j) {
        return (j == InlineClassHelperKt.UnspecifiedPackedFloats) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) <= 0.0f);
    }

    /* renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m5722times7Ah8Wj8(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) * f;
        return m5710constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5723toStringimpl(long j) {
        if (j == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "Size.Unspecified";
        }
        return "Size(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j >> 32)), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)), 1) + ')';
    }

    public boolean equals(Object other) {
        return m5714equalsimpl(this.packedValue, other);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m5720hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m5723toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5724unboximpl() {
        return this.packedValue;
    }
}
