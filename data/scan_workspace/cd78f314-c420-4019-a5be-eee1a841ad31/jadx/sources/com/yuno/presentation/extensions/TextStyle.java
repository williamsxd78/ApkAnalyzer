package com.yuno.presentation.extensions;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/yuno/presentation/extensions/TextStyle;", "", TtmlNode.ATTR_TTS_FONT_WEIGHT, "", "(I)V", "getFontWeight", "()I", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TextStyle {
    private final int fontWeight;

    public TextStyle() {
        this(0, 1, null);
    }

    public TextStyle(int i) {
        this.fontWeight = i;
    }

    public /* synthetic */ TextStyle(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 400 : i);
    }

    public static /* synthetic */ TextStyle copy$default(TextStyle textStyle, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = textStyle.fontWeight;
        }
        return textStyle.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFontWeight() {
        return this.fontWeight;
    }

    public final TextStyle copy(int fontWeight) {
        return new TextStyle(fontWeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TextStyle) && this.fontWeight == ((TextStyle) other).fontWeight;
    }

    public final int getFontWeight() {
        return this.fontWeight;
    }

    public int hashCode() {
        return Integer.hashCode(this.fontWeight);
    }

    public String toString() {
        return "TextStyle(fontWeight=" + this.fontWeight + ")";
    }
}
