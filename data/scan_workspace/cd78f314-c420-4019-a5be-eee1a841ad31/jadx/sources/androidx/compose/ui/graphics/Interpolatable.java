package androidx.compose.ui.graphics;

import com.braze.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;

/* compiled from: Interpolatable.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/Interpolatable;", "", "lerp", "other", Constants.BRAZE_PUSH_TITLE_KEY, "", "Companion", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface Interpolatable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: Interpolatable.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/Interpolatable$Companion;", "", "<init>", "()V", "lerp", "a", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, Constants.BRAZE_PUSH_TITLE_KEY, "", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x0031 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0030 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object lerp(java.lang.Object r3, java.lang.Object r4, float r5) {
            /*
                r2 = this;
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r2 == 0) goto Ld
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 >= 0) goto L31
                goto L30
            Ld:
                boolean r2 = r3 instanceof androidx.compose.ui.graphics.Interpolatable
                if (r2 == 0) goto L19
                r2 = r3
                androidx.compose.ui.graphics.Interpolatable r2 = (androidx.compose.ui.graphics.Interpolatable) r2
                java.lang.Object r2 = r2.lerp(r4, r5)
                goto L1a
            L19:
                r2 = 0
            L1a:
                if (r2 != 0) goto L2a
                boolean r1 = r4 instanceof androidx.compose.ui.graphics.Interpolatable
                if (r1 == 0) goto L2a
                r2 = r4
                androidx.compose.ui.graphics.Interpolatable r2 = (androidx.compose.ui.graphics.Interpolatable) r2
                r1 = 1
                float r1 = (float) r1
                float r1 = r1 - r5
                java.lang.Object r2 = r2.lerp(r3, r1)
            L2a:
                if (r2 != 0) goto L32
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 >= 0) goto L31
            L30:
                return r3
            L31:
                return r4
            L32:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.Interpolatable.Companion.lerp(java.lang.Object, java.lang.Object, float):java.lang.Object");
        }
    }

    Object lerp(Object other, float t);
}
