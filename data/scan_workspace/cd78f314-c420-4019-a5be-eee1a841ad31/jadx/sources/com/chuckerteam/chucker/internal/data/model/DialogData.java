package com.chuckerteam.chucker.internal.data.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialogData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/chuckerteam/chucker/internal/data/model/DialogData;", "", "title", "", "message", "positiveButtonText", "negativeButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getPositiveButtonText", "getNegativeButtonText", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DialogData {
    private final String message;
    private final String negativeButtonText;
    private final String positiveButtonText;
    private final String title;

    public DialogData(String title, String message, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.title = title;
        this.message = message;
        this.positiveButtonText = str;
        this.negativeButtonText = str2;
    }

    public static /* synthetic */ DialogData copy$default(DialogData dialogData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dialogData.title;
        }
        if ((i & 2) != 0) {
            str2 = dialogData.message;
        }
        if ((i & 4) != 0) {
            str3 = dialogData.positiveButtonText;
        }
        if ((i & 8) != 0) {
            str4 = dialogData.negativeButtonText;
        }
        return dialogData.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPositiveButtonText() {
        return this.positiveButtonText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNegativeButtonText() {
        return this.negativeButtonText;
    }

    public final DialogData copy(String title, String message, String positiveButtonText, String negativeButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        return new DialogData(title, message, positiveButtonText, negativeButtonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogData)) {
            return false;
        }
        DialogData dialogData = (DialogData) other;
        return Intrinsics.areEqual(this.title, dialogData.title) && Intrinsics.areEqual(this.message, dialogData.message) && Intrinsics.areEqual(this.positiveButtonText, dialogData.positiveButtonText) && Intrinsics.areEqual(this.negativeButtonText, dialogData.negativeButtonText);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getNegativeButtonText() {
        return this.negativeButtonText;
    }

    public final String getPositiveButtonText() {
        return this.positiveButtonText;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.title.hashCode() * 31) + this.message.hashCode()) * 31;
        String str = this.positiveButtonText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.negativeButtonText;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DialogData(title=" + this.title + ", message=" + this.message + ", positiveButtonText=" + this.positiveButtonText + ", negativeButtonText=" + this.negativeButtonText + ")";
    }
}
