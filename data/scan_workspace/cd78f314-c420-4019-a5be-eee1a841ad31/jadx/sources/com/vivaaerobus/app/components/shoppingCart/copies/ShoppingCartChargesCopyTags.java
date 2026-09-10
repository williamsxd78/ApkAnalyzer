package com.vivaaerobus.app.components.shoppingCart.copies;

import kotlin.Metadata;

/* compiled from: ShoppingCartChargesCopyTags.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/vivaaerobus/app/components/shoppingCart/copies/ShoppingCartChargesCopyTags;", "", "<init>", "()V", "GLOBAL_LABEL_INCLUDED", "", "BOOKER_LABEL_APP_INSTALLMENTS_COST", "copyTags", "", "getCopyTags", "()[Ljava/lang/String;", "[Ljava/lang/String;", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShoppingCartChargesCopyTags {
    public static final String GLOBAL_LABEL_INCLUDED = "GLOBAL_LABEL_INCLUDED";
    public static final ShoppingCartChargesCopyTags INSTANCE = new ShoppingCartChargesCopyTags();
    public static final String BOOKER_LABEL_APP_INSTALLMENTS_COST = "BOOKER_LABEL_APP-INSTALLMENTS-COST";
    private static final String[] copyTags = {"GLOBAL_LABEL_INCLUDED", BOOKER_LABEL_APP_INSTALLMENTS_COST};
    public static final int $stable = 8;

    private ShoppingCartChargesCopyTags() {
    }

    public final String[] getCopyTags() {
        return copyTags;
    }
}
