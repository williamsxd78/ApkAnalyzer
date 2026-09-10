package com.vivaaerobus.app.imagecrop.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageCropParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/imagecrop/model/ImageCropParams;", "", "uri", "", "cancelText", "cropText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUri", "()Ljava/lang/String;", "getCancelText", "getCropText", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "imageCrop_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ImageCropParams {
    private final String cancelText;
    private final String cropText;
    private final String uri;

    public ImageCropParams(String uri, String cancelText, String cropText) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(cancelText, "cancelText");
        Intrinsics.checkNotNullParameter(cropText, "cropText");
        this.uri = uri;
        this.cancelText = cancelText;
        this.cropText = cropText;
    }

    public static /* synthetic */ ImageCropParams copy$default(ImageCropParams imageCropParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageCropParams.uri;
        }
        if ((i & 2) != 0) {
            str2 = imageCropParams.cancelText;
        }
        if ((i & 4) != 0) {
            str3 = imageCropParams.cropText;
        }
        return imageCropParams.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCancelText() {
        return this.cancelText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCropText() {
        return this.cropText;
    }

    public final ImageCropParams copy(String uri, String cancelText, String cropText) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(cancelText, "cancelText");
        Intrinsics.checkNotNullParameter(cropText, "cropText");
        return new ImageCropParams(uri, cancelText, cropText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageCropParams)) {
            return false;
        }
        ImageCropParams imageCropParams = (ImageCropParams) other;
        return Intrinsics.areEqual(this.uri, imageCropParams.uri) && Intrinsics.areEqual(this.cancelText, imageCropParams.cancelText) && Intrinsics.areEqual(this.cropText, imageCropParams.cropText);
    }

    public final String getCancelText() {
        return this.cancelText;
    }

    public final String getCropText() {
        return this.cropText;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (((this.uri.hashCode() * 31) + this.cancelText.hashCode()) * 31) + this.cropText.hashCode();
    }

    public String toString() {
        return "ImageCropParams(uri=" + this.uri + ", cancelText=" + this.cancelText + ", cropText=" + this.cropText + ")";
    }
}
