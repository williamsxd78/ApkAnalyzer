package com.yuno.payments.features.enrollment.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrollmentModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/yuno/payments/features/enrollment/models/EnrollmentCustomerDocument;", "", "documentNumber", "", "documentType", "(Ljava/lang/String;Ljava/lang/String;)V", "getDocumentNumber", "()Ljava/lang/String;", "getDocumentType", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EnrollmentCustomerDocument {
    private final String documentNumber;
    private final String documentType;

    public EnrollmentCustomerDocument(String documentNumber, String documentType) {
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.documentNumber = documentNumber;
        this.documentType = documentType;
    }

    public static /* synthetic */ EnrollmentCustomerDocument copy$default(EnrollmentCustomerDocument enrollmentCustomerDocument, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enrollmentCustomerDocument.documentNumber;
        }
        if ((i & 2) != 0) {
            str2 = enrollmentCustomerDocument.documentType;
        }
        return enrollmentCustomerDocument.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    public final EnrollmentCustomerDocument copy(String documentNumber, String documentType) {
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        return new EnrollmentCustomerDocument(documentNumber, documentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnrollmentCustomerDocument)) {
            return false;
        }
        EnrollmentCustomerDocument enrollmentCustomerDocument = (EnrollmentCustomerDocument) other;
        return Intrinsics.areEqual(this.documentNumber, enrollmentCustomerDocument.documentNumber) && Intrinsics.areEqual(this.documentType, enrollmentCustomerDocument.documentType);
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public int hashCode() {
        return (this.documentNumber.hashCode() * 31) + this.documentType.hashCode();
    }

    public String toString() {
        return "EnrollmentCustomerDocument(documentNumber=" + this.documentNumber + ", documentType=" + this.documentType + ")";
    }
}
