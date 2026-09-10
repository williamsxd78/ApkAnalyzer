package com.vivaaerobus.app.shared.payment.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardHolderName.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/shared/payment/domain/entity/CardHolderName;", "", "firstName", "", "lastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "payment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CardHolderName {
    private final String firstName;
    private final String lastName;

    public CardHolderName(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static /* synthetic */ CardHolderName copy$default(CardHolderName cardHolderName, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardHolderName.firstName;
        }
        if ((i & 2) != 0) {
            str2 = cardHolderName.lastName;
        }
        return cardHolderName.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public final CardHolderName copy(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        return new CardHolderName(firstName, lastName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardHolderName)) {
            return false;
        }
        CardHolderName cardHolderName = (CardHolderName) other;
        return Intrinsics.areEqual(this.firstName, cardHolderName.firstName) && Intrinsics.areEqual(this.lastName, cardHolderName.lastName);
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public int hashCode() {
        return (this.firstName.hashCode() * 31) + this.lastName.hashCode();
    }

    public String toString() {
        return "CardHolderName(firstName=" + this.firstName + ", lastName=" + this.lastName + ")";
    }
}
