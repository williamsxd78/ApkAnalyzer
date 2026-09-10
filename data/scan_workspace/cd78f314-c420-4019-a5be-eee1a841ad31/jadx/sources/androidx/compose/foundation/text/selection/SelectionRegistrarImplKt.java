package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* compiled from: SelectionRegistrarImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"inARow", "", "boxATopLeft", "Landroidx/compose/ui/geometry/Offset;", "boxABottomRight", "boxBTopLeft", "boxBBottomRight", "inARow-zwwh4xc", "(JJJJ)Z", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionRegistrarImplKt {
    /* renamed from: inARow-zwwh4xc, reason: not valid java name */
    public static final boolean m1942inARowzwwh4xc(long j, long j2, long j3, long j4) {
        int i = (int) (j2 & BodyPartID.bodyIdMax);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        float intBitsToFloat2 = intBitsToFloat - Float.intBitsToFloat(i2);
        int i3 = (int) (j2 >> 32);
        int i4 = (int) (j >> 32);
        float intBitsToFloat3 = Float.intBitsToFloat(i3) - Float.intBitsToFloat(i4);
        int i5 = (int) (j4 & BodyPartID.bodyIdMax);
        float intBitsToFloat4 = Float.intBitsToFloat(i5);
        int i6 = (int) (BodyPartID.bodyIdMax & j3);
        float intBitsToFloat5 = intBitsToFloat4 - Float.intBitsToFloat(i6);
        int i7 = (int) (j4 >> 32);
        int i8 = (int) (j3 >> 32);
        float intBitsToFloat6 = Float.intBitsToFloat(i7) - Float.intBitsToFloat(i8);
        float max = Math.max(0.0f, Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i5)) - Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i6)));
        float max2 = Math.max(0.0f, Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i7)) - Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i8)));
        return ((max > (intBitsToFloat2 * 0.5f) ? 1 : (max == (intBitsToFloat2 * 0.5f) ? 0 : -1)) >= 0 || (max > (intBitsToFloat5 * 0.5f) ? 1 : (max == (intBitsToFloat5 * 0.5f) ? 0 : -1)) >= 0) && ((max2 > (intBitsToFloat3 * 0.5f) ? 1 : (max2 == (intBitsToFloat3 * 0.5f) ? 0 : -1)) < 0 && (max2 > (intBitsToFloat6 * 0.5f) ? 1 : (max2 == (intBitsToFloat6 * 0.5f) ? 0 : -1)) < 0);
    }
}
