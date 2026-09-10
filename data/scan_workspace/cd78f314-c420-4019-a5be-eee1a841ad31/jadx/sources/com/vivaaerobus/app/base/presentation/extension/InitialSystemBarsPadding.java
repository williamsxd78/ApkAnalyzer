package com.vivaaerobus.app.base.presentation.extension;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseFragment+Extension.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/vivaaerobus/app/base/presentation/extension/InitialSystemBarsPadding;", "", TtmlNode.LEFT, "", "top", TtmlNode.RIGHT, "bottom", "<init>", "(IIII)V", "getLeft", "()I", "getTop", "getRight", "getBottom", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "base_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InitialSystemBarsPadding {
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public InitialSystemBarsPadding(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public static /* synthetic */ InitialSystemBarsPadding copy$default(InitialSystemBarsPadding initialSystemBarsPadding, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = initialSystemBarsPadding.left;
        }
        if ((i5 & 2) != 0) {
            i2 = initialSystemBarsPadding.top;
        }
        if ((i5 & 4) != 0) {
            i3 = initialSystemBarsPadding.right;
        }
        if ((i5 & 8) != 0) {
            i4 = initialSystemBarsPadding.bottom;
        }
        return initialSystemBarsPadding.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    public final InitialSystemBarsPadding copy(int left, int top, int right, int bottom) {
        return new InitialSystemBarsPadding(left, top, right, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitialSystemBarsPadding)) {
            return false;
        }
        InitialSystemBarsPadding initialSystemBarsPadding = (InitialSystemBarsPadding) other;
        return this.left == initialSystemBarsPadding.left && this.top == initialSystemBarsPadding.top && this.right == initialSystemBarsPadding.right && this.bottom == initialSystemBarsPadding.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.left) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom);
    }

    public String toString() {
        return "InitialSystemBarsPadding(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ")";
    }
}
