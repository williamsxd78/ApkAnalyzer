package com.vivaaerobus.app.terminalMap.presentation.common.resources.textComponenMap;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J&\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019J6\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019J(\u0010\u001f\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019¨\u0006\""}, d2 = {"Lcom/vivaaerobus/app/terminalMap/presentation/common/resources/textComponenMap/Utils;", "", "<init>", "()V", "colorLuminance", "", "color", "", "isDarkColor", "", "dipToPixels", "context", "Landroid/content/Context;", "dipValue", "getCanvasWidth", "canvas", "Landroid/graphics/Canvas;", "getCanvasHeight", "measureMultiLineEllipsizedText", "Landroid/graphics/Point;", "textPaint", "Landroid/text/TextPaint;", "maxWidth", "maxHeight", "text", "", "drawMultiLineText", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "width", "getTruncatedText", "height", "Constants", "terminalMap_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Utils {
    public static final int $stable = 0;
    public static final Utils INSTANCE = new Utils();

    /* compiled from: Utils.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/vivaaerobus/app/terminalMap/presentation/common/resources/textComponenMap/Utils$Constants;", "", "<init>", "()V", "ZERO", "", "ZERO_DOUBLE", "", "ONE", "TWO", "THREE", "ZERO_F", "", "ONE_F", "THREE_F", "CONS_255_F", "RED", "GREEN", "BLUE", "MIN_LUMINANCE_TO_LIGHT_TINTING", "ONE_POINT_TWO", "FADE_ANIMATION_TIME", "", "FADE_ANIMATION_TIME_STANDARD", "equals", "", "other", "hashCode", "toString", "", "terminalMap_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class Constants {
        public static final int $stable = 0;
        public static final float BLUE = 0.0722f;
        public static final float CONS_255_F = 255.0f;
        public static final long FADE_ANIMATION_TIME = 300;
        public static final long FADE_ANIMATION_TIME_STANDARD = 255;
        public static final float GREEN = 0.7152f;
        public static final Constants INSTANCE = new Constants();
        public static final float MIN_LUMINANCE_TO_LIGHT_TINTING = 0.75f;
        public static final int ONE = 1;
        public static final float ONE_F = 1.0f;
        public static final float ONE_POINT_TWO = 1.2f;
        public static final float RED = 0.2126f;
        public static final int THREE = 3;
        public static final float THREE_F = 3.0f;
        public static final int TWO = 2;
        public static final int ZERO = 0;
        public static final double ZERO_DOUBLE = 0.0d;
        public static final float ZERO_F = 0.0f;

        private Constants() {
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Constants)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1643799695;
        }

        public String toString() {
            return "Constants";
        }
    }

    private Utils() {
    }

    private final float colorLuminance(int color) {
        return ((Color.red(color) / 255.0f) * 0.2126f) + ((Color.green(color) / 255.0f) * 0.7152f) + ((Color.blue(color) / 255.0f) * 0.0722f);
    }

    public final float dipToPixels(Context context, float dipValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        return TypedValue.applyDimension(1, dipValue, context.getResources().getDisplayMetrics());
    }

    public final void drawMultiLineText(Canvas canvas, TextPaint textPaint, float x, float y, float width, String text) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(text, "text");
        StaticLayout staticLayout = new StaticLayout(text, textPaint, (int) Math.abs(width), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        canvas.save();
        canvas.translate(x, y);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public final int getCanvasHeight(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullExpressionValue(canvas.getClipBounds(), "getClipBounds(...)");
        return (int) Math.abs(r0.bottom - r0.top);
    }

    public final int getCanvasWidth(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullExpressionValue(canvas.getClipBounds(), "getClipBounds(...)");
        return (int) Math.abs(r0.right - r0.left);
    }

    public final String getTruncatedText(TextPaint textPaint, float width, float height, String text) {
        int length;
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() < 3) {
            return text;
        }
        StaticLayout staticLayout = new StaticLayout(text, textPaint, (int) Math.abs(width), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        int lineCount = staticLayout.getLineCount();
        int i = 1;
        while (i < lineCount && staticLayout.getLineBottom(i) <= height) {
            i++;
        }
        int i2 = i - 1;
        if (i2 < 0) {
            return null;
        }
        try {
            length = staticLayout.getLineEnd(i2);
        } catch (Throwable unused) {
            length = text.length();
        }
        String substring = text.substring(0, (int) Math.max(0.0d, length));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        if (substring.length() < 3) {
            return null;
        }
        if (substring.length() >= text.length()) {
            return substring;
        }
        String substring2 = substring.substring(0, (int) Math.max(0.0d, substring.length() - 3));
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return substring2 + "...";
    }

    public final boolean isDarkColor(int color) {
        return colorLuminance(color) < 0.75f;
    }

    public final Point measureMultiLineEllipsizedText(TextPaint textPaint, int maxWidth, int maxHeight, String text) {
        int width;
        int min;
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(text, "text");
        StaticLayout staticLayout = new StaticLayout(text, textPaint, maxWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        if (staticLayout.getLineCount() == 1) {
            staticLayout.getLineBounds(0, new Rect());
            width = (int) Math.ceil(textPaint.measureText(text));
            min = staticLayout.getHeight();
        } else {
            width = staticLayout.getWidth();
            min = (int) Math.min(maxHeight, staticLayout.getHeight());
        }
        return new Point(width, min);
    }
}
