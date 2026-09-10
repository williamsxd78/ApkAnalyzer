package com.vivaaerobus.app.terminalMap.presentation.terminalMap.utils;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TerminalMapsViewUtils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/terminalMap/presentation/terminalMap/utils/InitialWindowInsetsState;", "", "servicesListPaddingBottom", "", "selectedItemBottomMargin", "<init>", "(II)V", "getServicesListPaddingBottom", "()I", "getSelectedItemBottomMargin", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "terminalMap_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class InitialWindowInsetsState {
    private final int selectedItemBottomMargin;
    private final int servicesListPaddingBottom;

    public InitialWindowInsetsState(int i, int i2) {
        this.servicesListPaddingBottom = i;
        this.selectedItemBottomMargin = i2;
    }

    public static /* synthetic */ InitialWindowInsetsState copy$default(InitialWindowInsetsState initialWindowInsetsState, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = initialWindowInsetsState.servicesListPaddingBottom;
        }
        if ((i3 & 2) != 0) {
            i2 = initialWindowInsetsState.selectedItemBottomMargin;
        }
        return initialWindowInsetsState.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getServicesListPaddingBottom() {
        return this.servicesListPaddingBottom;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSelectedItemBottomMargin() {
        return this.selectedItemBottomMargin;
    }

    public final InitialWindowInsetsState copy(int servicesListPaddingBottom, int selectedItemBottomMargin) {
        return new InitialWindowInsetsState(servicesListPaddingBottom, selectedItemBottomMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitialWindowInsetsState)) {
            return false;
        }
        InitialWindowInsetsState initialWindowInsetsState = (InitialWindowInsetsState) other;
        return this.servicesListPaddingBottom == initialWindowInsetsState.servicesListPaddingBottom && this.selectedItemBottomMargin == initialWindowInsetsState.selectedItemBottomMargin;
    }

    public final int getSelectedItemBottomMargin() {
        return this.selectedItemBottomMargin;
    }

    public final int getServicesListPaddingBottom() {
        return this.servicesListPaddingBottom;
    }

    public int hashCode() {
        return (Integer.hashCode(this.servicesListPaddingBottom) * 31) + Integer.hashCode(this.selectedItemBottomMargin);
    }

    public String toString() {
        return "InitialWindowInsetsState(servicesListPaddingBottom=" + this.servicesListPaddingBottom + ", selectedItemBottomMargin=" + this.selectedItemBottomMargin + ")";
    }
}
