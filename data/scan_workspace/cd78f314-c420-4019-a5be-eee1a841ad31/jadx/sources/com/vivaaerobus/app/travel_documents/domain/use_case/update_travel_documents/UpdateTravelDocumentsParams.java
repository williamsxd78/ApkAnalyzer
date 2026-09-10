package com.vivaaerobus.app.travel_documents.domain.use_case.update_travel_documents;

import com.tealium.core.persistence.i0;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateTravelDocumentsParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/vivaaerobus/app/travel_documents/domain/use_case/update_travel_documents/UpdateTravelDocumentsParams;", "", i0.a.COLUMN_KEY, "", "documentNumber", "issueCountry", "birthCountry", "expireDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getDocumentNumber", "getIssueCountry", "getBirthCountry", "getExpireDate", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "travel_documents_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class UpdateTravelDocumentsParams {
    private final String birthCountry;
    private final String documentNumber;
    private final String expireDate;
    private final String issueCountry;
    private final String key;

    public UpdateTravelDocumentsParams(String key, String documentNumber, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        this.key = key;
        this.documentNumber = documentNumber;
        this.issueCountry = str;
        this.birthCountry = str2;
        this.expireDate = str3;
    }

    public static /* synthetic */ UpdateTravelDocumentsParams copy$default(UpdateTravelDocumentsParams updateTravelDocumentsParams, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateTravelDocumentsParams.key;
        }
        if ((i & 2) != 0) {
            str2 = updateTravelDocumentsParams.documentNumber;
        }
        if ((i & 4) != 0) {
            str3 = updateTravelDocumentsParams.issueCountry;
        }
        if ((i & 8) != 0) {
            str4 = updateTravelDocumentsParams.birthCountry;
        }
        if ((i & 16) != 0) {
            str5 = updateTravelDocumentsParams.expireDate;
        }
        String str6 = str5;
        String str7 = str3;
        return updateTravelDocumentsParams.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIssueCountry() {
        return this.issueCountry;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBirthCountry() {
        return this.birthCountry;
    }

    /* renamed from: component5, reason: from getter */
    public final String getExpireDate() {
        return this.expireDate;
    }

    public final UpdateTravelDocumentsParams copy(String key, String documentNumber, String issueCountry, String birthCountry, String expireDate) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        return new UpdateTravelDocumentsParams(key, documentNumber, issueCountry, birthCountry, expireDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateTravelDocumentsParams)) {
            return false;
        }
        UpdateTravelDocumentsParams updateTravelDocumentsParams = (UpdateTravelDocumentsParams) other;
        return Intrinsics.areEqual(this.key, updateTravelDocumentsParams.key) && Intrinsics.areEqual(this.documentNumber, updateTravelDocumentsParams.documentNumber) && Intrinsics.areEqual(this.issueCountry, updateTravelDocumentsParams.issueCountry) && Intrinsics.areEqual(this.birthCountry, updateTravelDocumentsParams.birthCountry) && Intrinsics.areEqual(this.expireDate, updateTravelDocumentsParams.expireDate);
    }

    public final String getBirthCountry() {
        return this.birthCountry;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final String getExpireDate() {
        return this.expireDate;
    }

    public final String getIssueCountry() {
        return this.issueCountry;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        int hashCode = ((this.key.hashCode() * 31) + this.documentNumber.hashCode()) * 31;
        String str = this.issueCountry;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.birthCountry;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expireDate;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "UpdateTravelDocumentsParams(key=" + this.key + ", documentNumber=" + this.documentNumber + ", issueCountry=" + this.issueCountry + ", birthCountry=" + this.birthCountry + ", expireDate=" + this.expireDate + ")";
    }
}
