package com.uplift.sdk.model.priv;

import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ULTravelerRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/uplift/sdk/model/priv/ULTravelerRequest;", "", "travelerId", "", "title", "", "firstName", "lastName", "dateOfBirth", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDateOfBirth", "()Ljava/lang/String;", "getFirstName", "getLastName", "getTitle", "getTravelerId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/uplift/sdk/model/priv/ULTravelerRequest;", "equals", "", "other", "hashCode", "toString", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ULTravelerRequest {

    @SerializedName("date_of_birth")
    private final String dateOfBirth;

    @SerializedName("first_name")
    private final String firstName;

    @SerializedName("last_name")
    private final String lastName;

    @SerializedName("title")
    private final String title;

    @SerializedName("id")
    private final Integer travelerId;

    public ULTravelerRequest(Integer num, String str, String str2, String str3, String str4) {
        this.travelerId = num;
        this.title = str;
        this.firstName = str2;
        this.lastName = str3;
        this.dateOfBirth = str4;
    }

    public static /* synthetic */ ULTravelerRequest copy$default(ULTravelerRequest uLTravelerRequest, Integer num, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = uLTravelerRequest.travelerId;
        }
        if ((i & 2) != 0) {
            str = uLTravelerRequest.title;
        }
        if ((i & 4) != 0) {
            str2 = uLTravelerRequest.firstName;
        }
        if ((i & 8) != 0) {
            str3 = uLTravelerRequest.lastName;
        }
        if ((i & 16) != 0) {
            str4 = uLTravelerRequest.dateOfBirth;
        }
        String str5 = str4;
        String str6 = str2;
        return uLTravelerRequest.copy(num, str, str6, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getTravelerId() {
        return this.travelerId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final ULTravelerRequest copy(Integer travelerId, String title, String firstName, String lastName, String dateOfBirth) {
        return new ULTravelerRequest(travelerId, title, firstName, lastName, dateOfBirth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ULTravelerRequest)) {
            return false;
        }
        ULTravelerRequest uLTravelerRequest = (ULTravelerRequest) other;
        return Intrinsics.areEqual(this.travelerId, uLTravelerRequest.travelerId) && Intrinsics.areEqual(this.title, uLTravelerRequest.title) && Intrinsics.areEqual(this.firstName, uLTravelerRequest.firstName) && Intrinsics.areEqual(this.lastName, uLTravelerRequest.lastName) && Intrinsics.areEqual(this.dateOfBirth, uLTravelerRequest.dateOfBirth);
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getTravelerId() {
        return this.travelerId;
    }

    public int hashCode() {
        Integer num = this.travelerId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dateOfBirth;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ULTravelerRequest(travelerId=" + this.travelerId + ", title=" + this.title + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", dateOfBirth=" + this.dateOfBirth + ')';
    }
}
