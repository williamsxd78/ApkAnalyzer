package com.vivaaerobus.app.shared.booking.presentation.vivaBus;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import com.vivaaerobus.app.enumerations.presentation.FromFlowType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VivaBusArguments.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/presentation/vivaBus/VivaBusArguments;", "", "serviceToShow", "", "ssrCodesToShow", "", "showResultInSnackbar", "", "useAppImageField", "originFlow", "Lcom/vivaaerobus/app/enumerations/presentation/FromFlowType;", "<init>", "(Ljava/lang/String;Ljava/util/List;ZZLcom/vivaaerobus/app/enumerations/presentation/FromFlowType;)V", "getServiceToShow", "()Ljava/lang/String;", "getSsrCodesToShow", "()Ljava/util/List;", "getShowResultInSnackbar", "()Z", "getUseAppImageField", "getOriginFlow", "()Lcom/vivaaerobus/app/enumerations/presentation/FromFlowType;", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class VivaBusArguments {
    private final FromFlowType originFlow;
    private final String serviceToShow;
    private final boolean showResultInSnackbar;
    private final List<String> ssrCodesToShow;
    private final boolean useAppImageField;

    public VivaBusArguments(String serviceToShow, List<String> ssrCodesToShow, boolean z, boolean z2, FromFlowType originFlow) {
        Intrinsics.checkNotNullParameter(serviceToShow, "serviceToShow");
        Intrinsics.checkNotNullParameter(ssrCodesToShow, "ssrCodesToShow");
        Intrinsics.checkNotNullParameter(originFlow, "originFlow");
        this.serviceToShow = serviceToShow;
        this.ssrCodesToShow = ssrCodesToShow;
        this.showResultInSnackbar = z;
        this.useAppImageField = z2;
        this.originFlow = originFlow;
    }

    public static /* synthetic */ VivaBusArguments copy$default(VivaBusArguments vivaBusArguments, String str, List list, boolean z, boolean z2, FromFlowType fromFlowType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vivaBusArguments.serviceToShow;
        }
        if ((i & 2) != 0) {
            list = vivaBusArguments.ssrCodesToShow;
        }
        if ((i & 4) != 0) {
            z = vivaBusArguments.showResultInSnackbar;
        }
        if ((i & 8) != 0) {
            z2 = vivaBusArguments.useAppImageField;
        }
        if ((i & 16) != 0) {
            fromFlowType = vivaBusArguments.originFlow;
        }
        FromFlowType fromFlowType2 = fromFlowType;
        boolean z3 = z;
        return vivaBusArguments.copy(str, list, z3, z2, fromFlowType2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getServiceToShow() {
        return this.serviceToShow;
    }

    public final List<String> component2() {
        return this.ssrCodesToShow;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowResultInSnackbar() {
        return this.showResultInSnackbar;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getUseAppImageField() {
        return this.useAppImageField;
    }

    /* renamed from: component5, reason: from getter */
    public final FromFlowType getOriginFlow() {
        return this.originFlow;
    }

    public final VivaBusArguments copy(String serviceToShow, List<String> ssrCodesToShow, boolean showResultInSnackbar, boolean useAppImageField, FromFlowType originFlow) {
        Intrinsics.checkNotNullParameter(serviceToShow, "serviceToShow");
        Intrinsics.checkNotNullParameter(ssrCodesToShow, "ssrCodesToShow");
        Intrinsics.checkNotNullParameter(originFlow, "originFlow");
        return new VivaBusArguments(serviceToShow, ssrCodesToShow, showResultInSnackbar, useAppImageField, originFlow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VivaBusArguments)) {
            return false;
        }
        VivaBusArguments vivaBusArguments = (VivaBusArguments) other;
        return Intrinsics.areEqual(this.serviceToShow, vivaBusArguments.serviceToShow) && Intrinsics.areEqual(this.ssrCodesToShow, vivaBusArguments.ssrCodesToShow) && this.showResultInSnackbar == vivaBusArguments.showResultInSnackbar && this.useAppImageField == vivaBusArguments.useAppImageField && this.originFlow == vivaBusArguments.originFlow;
    }

    public final FromFlowType getOriginFlow() {
        return this.originFlow;
    }

    public final String getServiceToShow() {
        return this.serviceToShow;
    }

    public final boolean getShowResultInSnackbar() {
        return this.showResultInSnackbar;
    }

    public final List<String> getSsrCodesToShow() {
        return this.ssrCodesToShow;
    }

    public final boolean getUseAppImageField() {
        return this.useAppImageField;
    }

    public int hashCode() {
        return (((((((this.serviceToShow.hashCode() * 31) + this.ssrCodesToShow.hashCode()) * 31) + Boolean.hashCode(this.showResultInSnackbar)) * 31) + Boolean.hashCode(this.useAppImageField)) * 31) + this.originFlow.hashCode();
    }

    public String toString() {
        return "VivaBusArguments(serviceToShow=" + this.serviceToShow + ", ssrCodesToShow=" + this.ssrCodesToShow + ", showResultInSnackbar=" + this.showResultInSnackbar + ", useAppImageField=" + this.useAppImageField + ", originFlow=" + this.originFlow + ")";
    }
}
