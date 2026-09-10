package com.vivaaerobus.app.boardingPass.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoardingPassResource.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/vivaaerobus/app/boardingPass/domain/entity/BoardingPassResource;", "", "pdfUrl", "", "imagesUrls", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getPdfUrl", "()Ljava/lang/String;", "getImagesUrls", "()Ljava/util/List;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "boardingPass_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BoardingPassResource {
    private final List<String> imagesUrls;
    private final String pdfUrl;

    public BoardingPassResource(String pdfUrl, List<String> imagesUrls) {
        Intrinsics.checkNotNullParameter(pdfUrl, "pdfUrl");
        Intrinsics.checkNotNullParameter(imagesUrls, "imagesUrls");
        this.pdfUrl = pdfUrl;
        this.imagesUrls = imagesUrls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoardingPassResource copy$default(BoardingPassResource boardingPassResource, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = boardingPassResource.pdfUrl;
        }
        if ((i & 2) != 0) {
            list = boardingPassResource.imagesUrls;
        }
        return boardingPassResource.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPdfUrl() {
        return this.pdfUrl;
    }

    public final List<String> component2() {
        return this.imagesUrls;
    }

    public final BoardingPassResource copy(String pdfUrl, List<String> imagesUrls) {
        Intrinsics.checkNotNullParameter(pdfUrl, "pdfUrl");
        Intrinsics.checkNotNullParameter(imagesUrls, "imagesUrls");
        return new BoardingPassResource(pdfUrl, imagesUrls);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoardingPassResource)) {
            return false;
        }
        BoardingPassResource boardingPassResource = (BoardingPassResource) other;
        return Intrinsics.areEqual(this.pdfUrl, boardingPassResource.pdfUrl) && Intrinsics.areEqual(this.imagesUrls, boardingPassResource.imagesUrls);
    }

    public final List<String> getImagesUrls() {
        return this.imagesUrls;
    }

    public final String getPdfUrl() {
        return this.pdfUrl;
    }

    public int hashCode() {
        return (this.pdfUrl.hashCode() * 31) + this.imagesUrls.hashCode();
    }

    public String toString() {
        return "BoardingPassResource(pdfUrl=" + this.pdfUrl + ", imagesUrls=" + this.imagesUrls + ")";
    }
}
