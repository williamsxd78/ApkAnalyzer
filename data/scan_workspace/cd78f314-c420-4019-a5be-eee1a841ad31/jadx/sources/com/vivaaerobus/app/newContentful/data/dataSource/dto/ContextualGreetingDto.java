package com.vivaaerobus.app.newContentful.data.dataSource.dto;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContextualGreetingDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/vivaaerobus/app/newContentful/data/dataSource/dto/ContextualGreetingDto;", "", ContentfulConstants.CONTENT_TYPE_COPY, "", "backgroundImage", "lowerBound", "", "upperBound", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "getCopy", "()Ljava/lang/String;", "getBackgroundImage", "getLowerBound", "()I", "getUpperBound", "component1", "component2", "component3", "component4", "equals", "", "other", "hashCode", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ContextualGreetingDto {
    private final String backgroundImage;
    private final String copy;
    private final int lowerBound;
    private final int upperBound;

    public ContextualGreetingDto(String copy, String backgroundImage, int i, int i2) {
        Intrinsics.checkNotNullParameter(copy, "copy");
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        this.copy = copy;
        this.backgroundImage = backgroundImage;
        this.lowerBound = i;
        this.upperBound = i2;
    }

    public static /* synthetic */ ContextualGreetingDto copy$default(ContextualGreetingDto contextualGreetingDto, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = contextualGreetingDto.copy;
        }
        if ((i3 & 2) != 0) {
            str2 = contextualGreetingDto.backgroundImage;
        }
        if ((i3 & 4) != 0) {
            i = contextualGreetingDto.lowerBound;
        }
        if ((i3 & 8) != 0) {
            i2 = contextualGreetingDto.upperBound;
        }
        return contextualGreetingDto.copy(str, str2, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCopy() {
        return this.copy;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLowerBound() {
        return this.lowerBound;
    }

    /* renamed from: component4, reason: from getter */
    public final int getUpperBound() {
        return this.upperBound;
    }

    public final ContextualGreetingDto copy(String copy, String backgroundImage, int lowerBound, int upperBound) {
        Intrinsics.checkNotNullParameter(copy, "copy");
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        return new ContextualGreetingDto(copy, backgroundImage, lowerBound, upperBound);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextualGreetingDto)) {
            return false;
        }
        ContextualGreetingDto contextualGreetingDto = (ContextualGreetingDto) other;
        return Intrinsics.areEqual(this.copy, contextualGreetingDto.copy) && Intrinsics.areEqual(this.backgroundImage, contextualGreetingDto.backgroundImage) && this.lowerBound == contextualGreetingDto.lowerBound && this.upperBound == contextualGreetingDto.upperBound;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getCopy() {
        return this.copy;
    }

    public final int getLowerBound() {
        return this.lowerBound;
    }

    public final int getUpperBound() {
        return this.upperBound;
    }

    public int hashCode() {
        return (((((this.copy.hashCode() * 31) + this.backgroundImage.hashCode()) * 31) + Integer.hashCode(this.lowerBound)) * 31) + Integer.hashCode(this.upperBound);
    }

    public String toString() {
        return "ContextualGreetingDto(copy=" + this.copy + ", backgroundImage=" + this.backgroundImage + ", lowerBound=" + this.lowerBound + ", upperBound=" + this.upperBound + ")";
    }
}
