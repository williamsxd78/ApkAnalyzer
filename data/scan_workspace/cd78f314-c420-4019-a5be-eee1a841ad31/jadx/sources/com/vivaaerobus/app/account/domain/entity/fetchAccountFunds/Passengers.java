package com.vivaaerobus.app.account.domain.entity.fetchAccountFunds;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Passengers.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/vivaaerobus/app/account/domain/entity/fetchAccountFunds/Passengers;", "", "adults", "", "children", "infants", "pet", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAdults", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChildren", "getInfants", "getPet", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/vivaaerobus/app/account/domain/entity/fetchAccountFunds/Passengers;", "equals", "", "other", "hashCode", "toString", "", "account_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Passengers {
    private final Integer adults;
    private final Integer children;
    private final Integer infants;
    private final Integer pet;

    public Passengers(Integer num, Integer num2, Integer num3, Integer num4) {
        this.adults = num;
        this.children = num2;
        this.infants = num3;
        this.pet = num4;
    }

    public static /* synthetic */ Passengers copy$default(Passengers passengers, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = passengers.adults;
        }
        if ((i & 2) != 0) {
            num2 = passengers.children;
        }
        if ((i & 4) != 0) {
            num3 = passengers.infants;
        }
        if ((i & 8) != 0) {
            num4 = passengers.pet;
        }
        return passengers.copy(num, num2, num3, num4);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getAdults() {
        return this.adults;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getChildren() {
        return this.children;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getInfants() {
        return this.infants;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getPet() {
        return this.pet;
    }

    public final Passengers copy(Integer adults, Integer children, Integer infants, Integer pet) {
        return new Passengers(adults, children, infants, pet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Passengers)) {
            return false;
        }
        Passengers passengers = (Passengers) other;
        return Intrinsics.areEqual(this.adults, passengers.adults) && Intrinsics.areEqual(this.children, passengers.children) && Intrinsics.areEqual(this.infants, passengers.infants) && Intrinsics.areEqual(this.pet, passengers.pet);
    }

    public final Integer getAdults() {
        return this.adults;
    }

    public final Integer getChildren() {
        return this.children;
    }

    public final Integer getInfants() {
        return this.infants;
    }

    public final Integer getPet() {
        return this.pet;
    }

    public int hashCode() {
        Integer num = this.adults;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.children;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.infants;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.pet;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "Passengers(adults=" + this.adults + ", children=" + this.children + ", infants=" + this.infants + ", pet=" + this.pet + ")";
    }
}
