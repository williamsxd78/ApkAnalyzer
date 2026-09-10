package com.vivaaerobus.app.imagecrop.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageCropResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/imagecrop/model/ImageCropResult;", "", "imagePathToShow", "", "imagePathFile", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImagePathToShow", "()Ljava/lang/String;", "getImagePathFile", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "imageCrop_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ImageCropResult {
    private final String imagePathFile;
    private final String imagePathToShow;

    public ImageCropResult(String str, String str2) {
        this.imagePathToShow = str;
        this.imagePathFile = str2;
    }

    public static /* synthetic */ ImageCropResult copy$default(ImageCropResult imageCropResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageCropResult.imagePathToShow;
        }
        if ((i & 2) != 0) {
            str2 = imageCropResult.imagePathFile;
        }
        return imageCropResult.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImagePathToShow() {
        return this.imagePathToShow;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImagePathFile() {
        return this.imagePathFile;
    }

    public final ImageCropResult copy(String imagePathToShow, String imagePathFile) {
        return new ImageCropResult(imagePathToShow, imagePathFile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageCropResult)) {
            return false;
        }
        ImageCropResult imageCropResult = (ImageCropResult) other;
        return Intrinsics.areEqual(this.imagePathToShow, imageCropResult.imagePathToShow) && Intrinsics.areEqual(this.imagePathFile, imageCropResult.imagePathFile);
    }

    public final String getImagePathFile() {
        return this.imagePathFile;
    }

    public final String getImagePathToShow() {
        return this.imagePathToShow;
    }

    public int hashCode() {
        String str = this.imagePathToShow;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imagePathFile;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ImageCropResult(imagePathToShow=" + this.imagePathToShow + ", imagePathFile=" + this.imagePathFile + ")";
    }
}
