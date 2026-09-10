package com.vivaaerobus.app.resources.presentation.screen_shot;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.vivaaerobus.app.resources.presentation.screen_shot.PixelCopyUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PixelCopyUtils.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, d2 = {"Lcom/vivaaerobus/app/resources/presentation/screen_shot/PixelCopyUtils;", "", "<init>", "()V", "getViewBitmap", "", "view", "Landroid/view/View;", "window", "Landroid/view/Window;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/vivaaerobus/app/resources/presentation/screen_shot/PixelCopyUtils$PixelCopyListener;", "PixelCopyListener", "resources_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PixelCopyUtils {
    public static final int $stable = 0;
    public static final PixelCopyUtils INSTANCE = new PixelCopyUtils();

    /* compiled from: PixelCopyUtils.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/resources/presentation/screen_shot/PixelCopyUtils$PixelCopyListener;", "", "onCopySuccess", "", "bitmap", "Landroid/graphics/Bitmap;", "onCopyError", "resources_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public interface PixelCopyListener {
        void onCopyError();

        void onCopySuccess(Bitmap bitmap);
    }

    private PixelCopyUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBitmap$lambda$0(PixelCopyListener pixelCopyListener, Bitmap bitmap, HandlerThread handlerThread, int i) {
        if (i == 0) {
            pixelCopyListener.onCopySuccess(bitmap);
        } else {
            pixelCopyListener.onCopyError();
        }
        handlerThread.quitSafely();
    }

    public final void getViewBitmap(View view, Window window, final PixelCopyListener listener) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        Rect rect = new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
        final HandlerThread handlerThread = new HandlerThread("PixelCopyUtils");
        handlerThread.start();
        PixelCopy.request(window, rect, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.vivaaerobus.app.resources.presentation.screen_shot.PixelCopyUtils$$ExternalSyntheticLambda0
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i3) {
                PixelCopyUtils.getViewBitmap$lambda$0(PixelCopyUtils.PixelCopyListener.this, createBitmap, handlerThread, i3);
            }
        }, new Handler(handlerThread.getLooper()));
    }
}
