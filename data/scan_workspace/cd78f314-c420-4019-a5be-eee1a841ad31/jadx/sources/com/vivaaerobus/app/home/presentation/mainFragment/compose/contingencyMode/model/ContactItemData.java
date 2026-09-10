package com.vivaaerobus.app.home.presentation.mainFragment.compose.contingencyMode.model;

import com.braze.models.Banner;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactItemData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/home/presentation/mainFragment/compose/contingencyMode/model/ContactItemData;", "", "iconUrl", "", Banner.HTML, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIconUrl", "()Ljava/lang/String;", "getHtml", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "home_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ContactItemData {
    public static final int $stable = 0;
    private final String html;
    private final String iconUrl;

    public ContactItemData(String str, String str2) {
        this.iconUrl = str;
        this.html = str2;
    }

    public static /* synthetic */ ContactItemData copy$default(ContactItemData contactItemData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactItemData.iconUrl;
        }
        if ((i & 2) != 0) {
            str2 = contactItemData.html;
        }
        return contactItemData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    public final ContactItemData copy(String iconUrl, String html) {
        return new ContactItemData(iconUrl, html);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactItemData)) {
            return false;
        }
        ContactItemData contactItemData = (ContactItemData) other;
        return Intrinsics.areEqual(this.iconUrl, contactItemData.iconUrl) && Intrinsics.areEqual(this.html, contactItemData.html);
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public int hashCode() {
        String str = this.iconUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.html;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ContactItemData(iconUrl=" + this.iconUrl + ", html=" + this.html + ")";
    }
}
