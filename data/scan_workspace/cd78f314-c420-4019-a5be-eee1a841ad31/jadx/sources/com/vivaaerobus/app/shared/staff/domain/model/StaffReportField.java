package com.vivaaerobus.app.shared.staff.domain.model;

import com.google.firebase.messaging.Constants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StaffReportField.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020*HÖ\u0081\u0004J\n\u0010+\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u001b¨\u0006,"}, d2 = {"Lcom/vivaaerobus/app/shared/staff/domain/model/StaffReportField;", "", "id", "", "required", "", "name", "type", "values", "", "validation", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getRequired", "()Z", "getName", "getType", "getValues", "()Ljava/util/List;", "getValidation", "getError", "nameCopyAsText", "getNameCopyAsText", "setNameCopyAsText", "(Ljava/lang/String;)V", "errorCopyAsText", "getErrorCopyAsText", "setErrorCopyAsText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "staff_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StaffReportField {
    private final String error;
    private String errorCopyAsText;
    private final String id;
    private final String name;
    private String nameCopyAsText;
    private final boolean required;
    private final String type;
    private final String validation;
    private final List<String> values;

    public StaffReportField(String id, boolean z, String name, String type, List<String> list, String str, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.required = z;
        this.name = name;
        this.type = type;
        this.values = list;
        this.validation = str;
        this.error = str2;
    }

    public static /* synthetic */ StaffReportField copy$default(StaffReportField staffReportField, String str, boolean z, String str2, String str3, List list, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = staffReportField.id;
        }
        if ((i & 2) != 0) {
            z = staffReportField.required;
        }
        if ((i & 4) != 0) {
            str2 = staffReportField.name;
        }
        if ((i & 8) != 0) {
            str3 = staffReportField.type;
        }
        if ((i & 16) != 0) {
            list = staffReportField.values;
        }
        if ((i & 32) != 0) {
            str4 = staffReportField.validation;
        }
        if ((i & 64) != 0) {
            str5 = staffReportField.error;
        }
        String str6 = str4;
        String str7 = str5;
        List list2 = list;
        String str8 = str2;
        return staffReportField.copy(str, z, str8, str3, list2, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<String> component5() {
        return this.values;
    }

    /* renamed from: component6, reason: from getter */
    public final String getValidation() {
        return this.validation;
    }

    /* renamed from: component7, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final StaffReportField copy(String id, boolean required, String name, String type, List<String> values, String validation, String error) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new StaffReportField(id, required, name, type, values, validation, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StaffReportField)) {
            return false;
        }
        StaffReportField staffReportField = (StaffReportField) other;
        return Intrinsics.areEqual(this.id, staffReportField.id) && this.required == staffReportField.required && Intrinsics.areEqual(this.name, staffReportField.name) && Intrinsics.areEqual(this.type, staffReportField.type) && Intrinsics.areEqual(this.values, staffReportField.values) && Intrinsics.areEqual(this.validation, staffReportField.validation) && Intrinsics.areEqual(this.error, staffReportField.error);
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorCopyAsText() {
        return this.errorCopyAsText;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNameCopyAsText() {
        return this.nameCopyAsText;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValidation() {
        return this.validation;
    }

    public final List<String> getValues() {
        return this.values;
    }

    public int hashCode() {
        int hashCode = ((((((this.id.hashCode() * 31) + Boolean.hashCode(this.required)) * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31;
        List<String> list = this.values;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.validation;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setErrorCopyAsText(String str) {
        this.errorCopyAsText = str;
    }

    public final void setNameCopyAsText(String str) {
        this.nameCopyAsText = str;
    }

    public String toString() {
        return "StaffReportField(id=" + this.id + ", required=" + this.required + ", name=" + this.name + ", type=" + this.type + ", values=" + this.values + ", validation=" + this.validation + ", error=" + this.error + ")";
    }
}
