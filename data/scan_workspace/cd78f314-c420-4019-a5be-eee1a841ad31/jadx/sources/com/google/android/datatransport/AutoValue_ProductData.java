package com.google.android.datatransport;

/* loaded from: classes13.dex */
final class AutoValue_ProductData extends ProductData {
    private final Integer productId;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ProductData(Integer num) {
        this.productId = num;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProductData)) {
            return false;
        }
        ProductData productData = (ProductData) obj;
        Integer num = this.productId;
        return num == null ? productData.getProductId() == null : num.equals(productData.getProductId());
    }

    @Override // com.google.android.datatransport.ProductData
    public Integer getProductId() {
        return this.productId;
    }

    public int hashCode() {
        Integer num = this.productId;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.productId + "}";
    }
}
