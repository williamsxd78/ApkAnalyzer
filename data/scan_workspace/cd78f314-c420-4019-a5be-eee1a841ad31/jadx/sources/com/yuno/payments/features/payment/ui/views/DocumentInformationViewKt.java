package com.yuno.payments.features.payment.ui.views;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentInformationView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"dpToPx", "", "dp", "context", "Landroid/content/Context;", "Yuno_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DocumentInformationViewKt {
    public static final int dpToPx(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (i * context.getResources().getDisplayMetrics().density);
    }
}
