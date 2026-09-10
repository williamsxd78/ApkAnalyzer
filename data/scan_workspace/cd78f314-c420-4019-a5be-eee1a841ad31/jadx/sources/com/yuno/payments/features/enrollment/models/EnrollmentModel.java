package com.yuno.payments.features.enrollment.models;

import com.dynamicyield.sdk.wrapper.core.managers.sessionAndUser.StorageManager;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrollmentModels.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/yuno/payments/features/enrollment/models/EnrollmentModel;", "", StorageManager.SESSION_PREFS_NAME, "", "sdkRequiredAction", "", "(Ljava/lang/String;Z)V", "getSdkRequiredAction", "()Z", "getSession", "()Ljava/lang/String;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EnrollmentModel {
    private final boolean sdkRequiredAction;
    private final String session;

    public EnrollmentModel(String session, boolean z) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.session = session;
        this.sdkRequiredAction = z;
    }

    public static /* synthetic */ EnrollmentModel copy$default(EnrollmentModel enrollmentModel, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enrollmentModel.session;
        }
        if ((i & 2) != 0) {
            z = enrollmentModel.sdkRequiredAction;
        }
        return enrollmentModel.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSession() {
        return this.session;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSdkRequiredAction() {
        return this.sdkRequiredAction;
    }

    public final EnrollmentModel copy(String session, boolean sdkRequiredAction) {
        Intrinsics.checkNotNullParameter(session, "session");
        return new EnrollmentModel(session, sdkRequiredAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnrollmentModel)) {
            return false;
        }
        EnrollmentModel enrollmentModel = (EnrollmentModel) other;
        return Intrinsics.areEqual(this.session, enrollmentModel.session) && this.sdkRequiredAction == enrollmentModel.sdkRequiredAction;
    }

    public final boolean getSdkRequiredAction() {
        return this.sdkRequiredAction;
    }

    public final String getSession() {
        return this.session;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.session.hashCode() * 31;
        boolean z = this.sdkRequiredAction;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "EnrollmentModel(session=" + this.session + ", sdkRequiredAction=" + this.sdkRequiredAction + ")";
    }
}
