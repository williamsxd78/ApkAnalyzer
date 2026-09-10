package androidx.core.widget;

import android.view.View;
import android.widget.ListPopupWindow;
import androidx.annotation.ReplaceWith;

/* loaded from: classes12.dex */
public final class ListPopupWindowCompat {
    private ListPopupWindowCompat() {
    }

    @ReplaceWith(expression = "listPopupWindow.createDragToOpenListener(src)")
    @Deprecated
    public static View.OnTouchListener createDragToOpenListener(ListPopupWindow listPopupWindow, View view) {
        return listPopupWindow.createDragToOpenListener(view);
    }

    @Deprecated
    public static View.OnTouchListener createDragToOpenListener(Object obj, View view) {
        return createDragToOpenListener((ListPopupWindow) obj, view);
    }
}
