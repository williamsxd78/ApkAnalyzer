package com.vivaaerobus.app.newContentful.domain.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VivaBusInstructionStep.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/VivaBusInstructionStep;", "", "copyId", "", "stepIconUrl", "stepPhotoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCopyId", "()Ljava/lang/String;", "getStepIconUrl", "getStepPhotoUrl", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VivaBusInstructionStep {
    private final String copyId;
    private final String stepIconUrl;
    private final String stepPhotoUrl;

    public VivaBusInstructionStep(String str, String str2, String str3) {
        this.copyId = str;
        this.stepIconUrl = str2;
        this.stepPhotoUrl = str3;
    }

    public static /* synthetic */ VivaBusInstructionStep copy$default(VivaBusInstructionStep vivaBusInstructionStep, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vivaBusInstructionStep.copyId;
        }
        if ((i & 2) != 0) {
            str2 = vivaBusInstructionStep.stepIconUrl;
        }
        if ((i & 4) != 0) {
            str3 = vivaBusInstructionStep.stepPhotoUrl;
        }
        return vivaBusInstructionStep.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCopyId() {
        return this.copyId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStepIconUrl() {
        return this.stepIconUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStepPhotoUrl() {
        return this.stepPhotoUrl;
    }

    public final VivaBusInstructionStep copy(String copyId, String stepIconUrl, String stepPhotoUrl) {
        return new VivaBusInstructionStep(copyId, stepIconUrl, stepPhotoUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VivaBusInstructionStep)) {
            return false;
        }
        VivaBusInstructionStep vivaBusInstructionStep = (VivaBusInstructionStep) other;
        return Intrinsics.areEqual(this.copyId, vivaBusInstructionStep.copyId) && Intrinsics.areEqual(this.stepIconUrl, vivaBusInstructionStep.stepIconUrl) && Intrinsics.areEqual(this.stepPhotoUrl, vivaBusInstructionStep.stepPhotoUrl);
    }

    public final String getCopyId() {
        return this.copyId;
    }

    public final String getStepIconUrl() {
        return this.stepIconUrl;
    }

    public final String getStepPhotoUrl() {
        return this.stepPhotoUrl;
    }

    public int hashCode() {
        String str = this.copyId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stepIconUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stepPhotoUrl;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "VivaBusInstructionStep(copyId=" + this.copyId + ", stepIconUrl=" + this.stepIconUrl + ", stepPhotoUrl=" + this.stepPhotoUrl + ")";
    }
}
