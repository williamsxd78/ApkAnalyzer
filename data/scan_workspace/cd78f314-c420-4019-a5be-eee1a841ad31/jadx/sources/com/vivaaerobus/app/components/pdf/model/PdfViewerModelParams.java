package com.vivaaerobus.app.components.pdf.model;

import android.net.Uri;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PdfViewerModelParams.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/vivaaerobus/app/components/pdf/model/PdfViewerModelParams;", "", "uri", "Landroid/net/Uri;", "title", "", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "getUri", "()Landroid/net/Uri;", "getTitle", "()Ljava/lang/String;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PdfViewerModelParams {
    public static final int $stable = 8;
    private final String title;
    private final Uri uri;

    public PdfViewerModelParams(Uri uri, String title) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(title, "title");
        this.uri = uri;
        this.title = title;
    }

    public static /* synthetic */ PdfViewerModelParams copy$default(PdfViewerModelParams pdfViewerModelParams, Uri uri, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = pdfViewerModelParams.uri;
        }
        if ((i & 2) != 0) {
            str = pdfViewerModelParams.title;
        }
        return pdfViewerModelParams.copy(uri, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final PdfViewerModelParams copy(Uri uri, String title) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(title, "title");
        return new PdfViewerModelParams(uri, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfViewerModelParams)) {
            return false;
        }
        PdfViewerModelParams pdfViewerModelParams = (PdfViewerModelParams) other;
        return Intrinsics.areEqual(this.uri, pdfViewerModelParams.uri) && Intrinsics.areEqual(this.title, pdfViewerModelParams.title);
    }

    public final String getTitle() {
        return this.title;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (this.uri.hashCode() * 31) + this.title.hashCode();
    }

    public String toString() {
        return "PdfViewerModelParams(uri=" + this.uri + ", title=" + this.title + ")";
    }
}
