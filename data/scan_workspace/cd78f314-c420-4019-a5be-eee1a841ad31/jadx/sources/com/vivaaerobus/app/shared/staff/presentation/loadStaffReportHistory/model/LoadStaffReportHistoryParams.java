package com.vivaaerobus.app.shared.staff.presentation.loadStaffReportHistory.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LoadStaffReportHistoryParams.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/shared/staff/presentation/loadStaffReportHistory/model/LoadStaffReportHistoryParams;", "", "fetchOnlineCopies", "", "requiredDownload", "<init>", "(ZZ)V", "getFetchOnlineCopies", "()Z", "getRequiredDownload", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "", "staff_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class LoadStaffReportHistoryParams {
    private final boolean fetchOnlineCopies;
    private final boolean requiredDownload;

    public LoadStaffReportHistoryParams(boolean z, boolean z2) {
        this.fetchOnlineCopies = z;
        this.requiredDownload = z2;
    }

    public /* synthetic */ LoadStaffReportHistoryParams(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? true : z2);
    }

    public static /* synthetic */ LoadStaffReportHistoryParams copy$default(LoadStaffReportHistoryParams loadStaffReportHistoryParams, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = loadStaffReportHistoryParams.fetchOnlineCopies;
        }
        if ((i & 2) != 0) {
            z2 = loadStaffReportHistoryParams.requiredDownload;
        }
        return loadStaffReportHistoryParams.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getFetchOnlineCopies() {
        return this.fetchOnlineCopies;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRequiredDownload() {
        return this.requiredDownload;
    }

    public final LoadStaffReportHistoryParams copy(boolean fetchOnlineCopies, boolean requiredDownload) {
        return new LoadStaffReportHistoryParams(fetchOnlineCopies, requiredDownload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadStaffReportHistoryParams)) {
            return false;
        }
        LoadStaffReportHistoryParams loadStaffReportHistoryParams = (LoadStaffReportHistoryParams) other;
        return this.fetchOnlineCopies == loadStaffReportHistoryParams.fetchOnlineCopies && this.requiredDownload == loadStaffReportHistoryParams.requiredDownload;
    }

    public final boolean getFetchOnlineCopies() {
        return this.fetchOnlineCopies;
    }

    public final boolean getRequiredDownload() {
        return this.requiredDownload;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.fetchOnlineCopies) * 31) + Boolean.hashCode(this.requiredDownload);
    }

    public String toString() {
        return "LoadStaffReportHistoryParams(fetchOnlineCopies=" + this.fetchOnlineCopies + ", requiredDownload=" + this.requiredDownload + ")";
    }
}
