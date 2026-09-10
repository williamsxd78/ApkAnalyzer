package com.yuno.domain.core;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SDKStyles.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/yuno/domain/core/FontFile;", "", "weight", "", "url", "", "(DLjava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getWeight", "()D", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FontFile {
    private final String url;
    private final double weight;

    public FontFile(double d, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.weight = d;
        this.url = url;
    }

    public static /* synthetic */ FontFile copy$default(FontFile fontFile, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = fontFile.weight;
        }
        if ((i & 2) != 0) {
            str = fontFile.url;
        }
        return fontFile.copy(d, str);
    }

    /* renamed from: component1, reason: from getter */
    public final double getWeight() {
        return this.weight;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final FontFile copy(double weight, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new FontFile(weight, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FontFile)) {
            return false;
        }
        FontFile fontFile = (FontFile) other;
        return Double.compare(this.weight, fontFile.weight) == 0 && Intrinsics.areEqual(this.url, fontFile.url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final double getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (Double.hashCode(this.weight) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "FontFile(weight=" + this.weight + ", url=" + this.url + ")";
    }
}
