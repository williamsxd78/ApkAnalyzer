package androidx.databinding.adapters;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;

/* loaded from: classes12.dex */
public class Converters {
    public static ColorStateList convertColorToColorStateList(int i) {
        return ColorStateList.valueOf(i);
    }

    public static ColorDrawable convertColorToDrawable(int i) {
        return new ColorDrawable(i);
    }
}
