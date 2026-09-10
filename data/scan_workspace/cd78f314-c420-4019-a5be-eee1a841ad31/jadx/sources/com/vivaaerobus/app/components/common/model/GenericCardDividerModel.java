package com.vivaaerobus.app.components.common.model;

import com.vivaaerobus.app.components.genericCard.adapter.model.GenericCardBaseModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GenericCardDividerModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/vivaaerobus/app/components/common/model/GenericCardDividerModel;", "Lcom/vivaaerobus/app/components/genericCard/adapter/model/GenericCardBaseModel;", "marginTop", "", "marginBottom", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMarginTop", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMarginBottom", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GenericCardDividerModel implements GenericCardBaseModel {
    public static final int $stable = 0;
    private final Integer marginBottom;
    private final Integer marginTop;

    /* JADX WARN: Multi-variable type inference failed */
    public GenericCardDividerModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public GenericCardDividerModel(Integer num, Integer num2) {
        this.marginTop = num;
        this.marginBottom = num2;
    }

    public /* synthetic */ GenericCardDividerModel(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }

    public final Integer getMarginBottom() {
        return this.marginBottom;
    }

    public final Integer getMarginTop() {
        return this.marginTop;
    }
}
