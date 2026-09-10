package com.yuno.payments.features.payment.ui.views;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.yuno.payments.features.base.ui.views.EditTextState;
import kotlin.Metadata;

/* compiled from: YunoStyles.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J%\u0010 \u001a\u00020!*\u00020\"2\u0006\u0010#\u001a\u00020$2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0019H&¢\u0006\u0002\u0010&J\u0014\u0010'\u001a\u00020!*\u00020\"2\u0006\u0010#\u001a\u00020$H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0012\u0010\u0014\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0012\u0010\u0016\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000bR\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0012\u0010\u001e\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001b¨\u0006("}, d2 = {"Lcom/yuno/payments/features/payment/ui/views/YunoStyles;", "", "backgroundErrorDrawable", "Landroid/graphics/drawable/GradientDrawable;", "getBackgroundErrorDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "backgroundFocusDrawable", "getBackgroundFocusDrawable", "backgroundLeftErrorDrawable", "Landroid/graphics/drawable/LayerDrawable;", "getBackgroundLeftErrorDrawable", "()Landroid/graphics/drawable/LayerDrawable;", "backgroundLeftFocusDrawable", "getBackgroundLeftFocusDrawable", "backgroundLeftNormalDrawable", "getBackgroundLeftNormalDrawable", "backgroundNormalDrawable", "getBackgroundNormalDrawable", "backgroundRightErrorDrawable", "getBackgroundRightErrorDrawable", "backgroundRightFocusDrawable", "getBackgroundRightFocusDrawable", "backgroundRightNormalDrawable", "getBackgroundRightNormalDrawable", "errorColor", "", "getErrorColor", "()I", "focusColor", "getFocusColor", "normalColor", "getNormalColor", "setBackgroundState", "", "Landroid/view/View;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/yuno/payments/features/base/ui/views/EditTextState;", "drawable", "(Landroid/view/View;Lcom/yuno/payments/features/base/ui/views/EditTextState;Ljava/lang/Integer;)V", "setSeparatorStateStyle", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface YunoStyles {

    /* compiled from: YunoStyles.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void setBackgroundState$default(YunoStyles yunoStyles, View view, EditTextState editTextState, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBackgroundState");
            }
            if ((i & 2) != 0) {
                num = null;
            }
            yunoStyles.setBackgroundState(view, editTextState, num);
        }
    }

    GradientDrawable getBackgroundErrorDrawable();

    GradientDrawable getBackgroundFocusDrawable();

    LayerDrawable getBackgroundLeftErrorDrawable();

    LayerDrawable getBackgroundLeftFocusDrawable();

    LayerDrawable getBackgroundLeftNormalDrawable();

    GradientDrawable getBackgroundNormalDrawable();

    LayerDrawable getBackgroundRightErrorDrawable();

    LayerDrawable getBackgroundRightFocusDrawable();

    LayerDrawable getBackgroundRightNormalDrawable();

    int getErrorColor();

    int getFocusColor();

    int getNormalColor();

    void setBackgroundState(View view, EditTextState editTextState, Integer num);

    void setSeparatorStateStyle(View view, EditTextState editTextState);
}
