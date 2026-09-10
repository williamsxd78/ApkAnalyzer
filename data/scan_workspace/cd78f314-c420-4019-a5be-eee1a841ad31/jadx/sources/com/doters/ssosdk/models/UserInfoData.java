package com.doters.ssosdk.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserInfoData.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/doters/ssosdk/models/UserInfoData;", "", "()V", "customerId", "", "email", "first", "last", "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerId", "()Ljava/lang/String;", "getEmail", "getFirst", "getLast", "getTitle", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UserInfoData {
    private final String customerId;
    private final String email;
    private final String first;
    private final String last;
    private final String title;

    public UserInfoData() {
        this("", "", "", "", "");
    }

    public UserInfoData(String customerId, String email, String first, String last, String title) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(last, "last");
        Intrinsics.checkNotNullParameter(title, "title");
        this.customerId = customerId;
        this.email = email;
        this.first = first;
        this.last = last;
        this.title = title;
    }

    public static /* synthetic */ UserInfoData copy$default(UserInfoData userInfoData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userInfoData.customerId;
        }
        if ((i & 2) != 0) {
            str2 = userInfoData.email;
        }
        if ((i & 4) != 0) {
            str3 = userInfoData.first;
        }
        if ((i & 8) != 0) {
            str4 = userInfoData.last;
        }
        if ((i & 16) != 0) {
            str5 = userInfoData.title;
        }
        String str6 = str5;
        String str7 = str3;
        return userInfoData.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFirst() {
        return this.first;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLast() {
        return this.last;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final UserInfoData copy(String customerId, String email, String first, String last, String title) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(last, "last");
        Intrinsics.checkNotNullParameter(title, "title");
        return new UserInfoData(customerId, email, first, last, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfoData)) {
            return false;
        }
        UserInfoData userInfoData = (UserInfoData) other;
        return Intrinsics.areEqual(this.customerId, userInfoData.customerId) && Intrinsics.areEqual(this.email, userInfoData.email) && Intrinsics.areEqual(this.first, userInfoData.first) && Intrinsics.areEqual(this.last, userInfoData.last) && Intrinsics.areEqual(this.title, userInfoData.title);
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirst() {
        return this.first;
    }

    public final String getLast() {
        return this.last;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((this.customerId.hashCode() * 31) + this.email.hashCode()) * 31) + this.first.hashCode()) * 31) + this.last.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "UserInfoData(customerId=" + this.customerId + ", email=" + this.email + ", first=" + this.first + ", last=" + this.last + ", title=" + this.title + ")";
    }
}
