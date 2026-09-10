package com.vivaaerobus.app.share.domain.model;

import androidx.autofill.HintConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Recipient.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/share/domain/model/Recipient;", "", "firstName", "", "lastName", HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getEmailAddress", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "share_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Recipient {
    private final String emailAddress;
    private final String firstName;
    private final String lastName;

    public Recipient(String firstName, String lastName, String emailAddress) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public static /* synthetic */ Recipient copy$default(Recipient recipient, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recipient.firstName;
        }
        if ((i & 2) != 0) {
            str2 = recipient.lastName;
        }
        if ((i & 4) != 0) {
            str3 = recipient.emailAddress;
        }
        return recipient.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final Recipient copy(String firstName, String lastName, String emailAddress) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        return new Recipient(firstName, lastName, emailAddress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Recipient)) {
            return false;
        }
        Recipient recipient = (Recipient) other;
        return Intrinsics.areEqual(this.firstName, recipient.firstName) && Intrinsics.areEqual(this.lastName, recipient.lastName) && Intrinsics.areEqual(this.emailAddress, recipient.emailAddress);
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public int hashCode() {
        return (((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.emailAddress.hashCode();
    }

    public String toString() {
        return "Recipient(firstName=" + this.firstName + ", lastName=" + this.lastName + ", emailAddress=" + this.emailAddress + ")";
    }
}
