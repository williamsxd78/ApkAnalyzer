package com.vivaaerobus.app.passengers.domain.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Criteria.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/vivaaerobus/app/passengers/domain/model/Criteria;", "", "relatedField", "", "relatedFieldValues", "", "operator", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getRelatedField", "()Ljava/lang/String;", "getRelatedFieldValues", "()Ljava/util/List;", "getOperator", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "passengers_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Criteria {
    private final String operator;
    private final String relatedField;
    private final List<String> relatedFieldValues;

    public Criteria(String str, List<String> list, String str2) {
        this.relatedField = str;
        this.relatedFieldValues = list;
        this.operator = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Criteria copy$default(Criteria criteria, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = criteria.relatedField;
        }
        if ((i & 2) != 0) {
            list = criteria.relatedFieldValues;
        }
        if ((i & 4) != 0) {
            str2 = criteria.operator;
        }
        return criteria.copy(str, list, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRelatedField() {
        return this.relatedField;
    }

    public final List<String> component2() {
        return this.relatedFieldValues;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }

    public final Criteria copy(String relatedField, List<String> relatedFieldValues, String operator) {
        return new Criteria(relatedField, relatedFieldValues, operator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Criteria)) {
            return false;
        }
        Criteria criteria = (Criteria) other;
        return Intrinsics.areEqual(this.relatedField, criteria.relatedField) && Intrinsics.areEqual(this.relatedFieldValues, criteria.relatedFieldValues) && Intrinsics.areEqual(this.operator, criteria.operator);
    }

    public final String getOperator() {
        return this.operator;
    }

    public final String getRelatedField() {
        return this.relatedField;
    }

    public final List<String> getRelatedFieldValues() {
        return this.relatedFieldValues;
    }

    public int hashCode() {
        String str = this.relatedField;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.relatedFieldValues;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.operator;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Criteria(relatedField=" + this.relatedField + ", relatedFieldValues=" + this.relatedFieldValues + ", operator=" + this.operator + ")";
    }
}
