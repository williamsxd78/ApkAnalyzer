package com.futuremind.recyclerviewfastscroll.viewprovider;

/* loaded from: classes13.dex */
public class DefaultBubbleBehavior implements ViewBehavior {
    private final VisibilityAnimationManager animationManager;

    public DefaultBubbleBehavior(VisibilityAnimationManager visibilityAnimationManager) {
        this.animationManager = visibilityAnimationManager;
    }

    @Override // com.futuremind.recyclerviewfastscroll.viewprovider.ViewBehavior
    public void onHandleGrabbed() {
        this.animationManager.show();
    }

    @Override // com.futuremind.recyclerviewfastscroll.viewprovider.ViewBehavior
    public void onHandleReleased() {
        this.animationManager.hide();
    }

    @Override // com.futuremind.recyclerviewfastscroll.viewprovider.ViewBehavior
    public void onScrollFinished() {
    }

    @Override // com.futuremind.recyclerviewfastscroll.viewprovider.ViewBehavior
    public void onScrollStarted() {
    }
}
