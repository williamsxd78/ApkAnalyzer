package com.uplift.sdk.model.priv;

import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: ULLoanOfferResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u00060"}, d2 = {"Lcom/uplift/sdk/model/priv/ULLoanOfferResponse;", "", "originationFee", "", "financeCharges", "apr", "downPayment", "monthlyPaymentAmount", "paymentDueDay", "grandTotal", "loanAmount", "totalPayments", "orderAmount", "financedAmount", "numberOfPayments", "(IIIIIIIIIIII)V", "getApr", "()I", "getDownPayment", "getFinanceCharges", "getFinancedAmount", "getGrandTotal", "getLoanAmount", "getMonthlyPaymentAmount", "getNumberOfPayments", "getOrderAmount", "getOriginationFee", "getPaymentDueDay", "getTotalPayments", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ULLoanOfferResponse {

    @SerializedName("apr")
    private final int apr;

    @SerializedName("down_payment")
    private final int downPayment;

    @SerializedName("finance_charges")
    private final int financeCharges;

    @SerializedName("financed_amount")
    private final int financedAmount;

    @SerializedName("grand_total")
    private final int grandTotal;

    @SerializedName("loan_amount")
    private final int loanAmount;

    @SerializedName("monthly_payment_amount")
    private final int monthlyPaymentAmount;

    @SerializedName("number_of_payments")
    private final int numberOfPayments;

    @SerializedName("order_amount")
    private final int orderAmount;

    @SerializedName("origination_fee")
    private final int originationFee;

    @SerializedName("payment_due_day")
    private final int paymentDueDay;

    @SerializedName("total_payments")
    private final int totalPayments;

    public ULLoanOfferResponse(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.originationFee = i;
        this.financeCharges = i2;
        this.apr = i3;
        this.downPayment = i4;
        this.monthlyPaymentAmount = i5;
        this.paymentDueDay = i6;
        this.grandTotal = i7;
        this.loanAmount = i8;
        this.totalPayments = i9;
        this.orderAmount = i10;
        this.financedAmount = i11;
        this.numberOfPayments = i12;
    }

    public static /* synthetic */ ULLoanOfferResponse copy$default(ULLoanOfferResponse uLLoanOfferResponse, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i = uLLoanOfferResponse.originationFee;
        }
        if ((i13 & 2) != 0) {
            i2 = uLLoanOfferResponse.financeCharges;
        }
        if ((i13 & 4) != 0) {
            i3 = uLLoanOfferResponse.apr;
        }
        if ((i13 & 8) != 0) {
            i4 = uLLoanOfferResponse.downPayment;
        }
        if ((i13 & 16) != 0) {
            i5 = uLLoanOfferResponse.monthlyPaymentAmount;
        }
        if ((i13 & 32) != 0) {
            i6 = uLLoanOfferResponse.paymentDueDay;
        }
        if ((i13 & 64) != 0) {
            i7 = uLLoanOfferResponse.grandTotal;
        }
        if ((i13 & 128) != 0) {
            i8 = uLLoanOfferResponse.loanAmount;
        }
        if ((i13 & 256) != 0) {
            i9 = uLLoanOfferResponse.totalPayments;
        }
        if ((i13 & 512) != 0) {
            i10 = uLLoanOfferResponse.orderAmount;
        }
        if ((i13 & 1024) != 0) {
            i11 = uLLoanOfferResponse.financedAmount;
        }
        if ((i13 & 2048) != 0) {
            i12 = uLLoanOfferResponse.numberOfPayments;
        }
        int i14 = i11;
        int i15 = i12;
        int i16 = i9;
        int i17 = i10;
        int i18 = i7;
        int i19 = i8;
        int i20 = i5;
        int i21 = i6;
        return uLLoanOfferResponse.copy(i, i2, i3, i4, i20, i21, i18, i19, i16, i17, i14, i15);
    }

    /* renamed from: component1, reason: from getter */
    public final int getOriginationFee() {
        return this.originationFee;
    }

    /* renamed from: component10, reason: from getter */
    public final int getOrderAmount() {
        return this.orderAmount;
    }

    /* renamed from: component11, reason: from getter */
    public final int getFinancedAmount() {
        return this.financedAmount;
    }

    /* renamed from: component12, reason: from getter */
    public final int getNumberOfPayments() {
        return this.numberOfPayments;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFinanceCharges() {
        return this.financeCharges;
    }

    /* renamed from: component3, reason: from getter */
    public final int getApr() {
        return this.apr;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDownPayment() {
        return this.downPayment;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMonthlyPaymentAmount() {
        return this.monthlyPaymentAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPaymentDueDay() {
        return this.paymentDueDay;
    }

    /* renamed from: component7, reason: from getter */
    public final int getGrandTotal() {
        return this.grandTotal;
    }

    /* renamed from: component8, reason: from getter */
    public final int getLoanAmount() {
        return this.loanAmount;
    }

    /* renamed from: component9, reason: from getter */
    public final int getTotalPayments() {
        return this.totalPayments;
    }

    public final ULLoanOfferResponse copy(int originationFee, int financeCharges, int apr, int downPayment, int monthlyPaymentAmount, int paymentDueDay, int grandTotal, int loanAmount, int totalPayments, int orderAmount, int financedAmount, int numberOfPayments) {
        return new ULLoanOfferResponse(originationFee, financeCharges, apr, downPayment, monthlyPaymentAmount, paymentDueDay, grandTotal, loanAmount, totalPayments, orderAmount, financedAmount, numberOfPayments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ULLoanOfferResponse)) {
            return false;
        }
        ULLoanOfferResponse uLLoanOfferResponse = (ULLoanOfferResponse) other;
        return this.originationFee == uLLoanOfferResponse.originationFee && this.financeCharges == uLLoanOfferResponse.financeCharges && this.apr == uLLoanOfferResponse.apr && this.downPayment == uLLoanOfferResponse.downPayment && this.monthlyPaymentAmount == uLLoanOfferResponse.monthlyPaymentAmount && this.paymentDueDay == uLLoanOfferResponse.paymentDueDay && this.grandTotal == uLLoanOfferResponse.grandTotal && this.loanAmount == uLLoanOfferResponse.loanAmount && this.totalPayments == uLLoanOfferResponse.totalPayments && this.orderAmount == uLLoanOfferResponse.orderAmount && this.financedAmount == uLLoanOfferResponse.financedAmount && this.numberOfPayments == uLLoanOfferResponse.numberOfPayments;
    }

    public final int getApr() {
        return this.apr;
    }

    public final int getDownPayment() {
        return this.downPayment;
    }

    public final int getFinanceCharges() {
        return this.financeCharges;
    }

    public final int getFinancedAmount() {
        return this.financedAmount;
    }

    public final int getGrandTotal() {
        return this.grandTotal;
    }

    public final int getLoanAmount() {
        return this.loanAmount;
    }

    public final int getMonthlyPaymentAmount() {
        return this.monthlyPaymentAmount;
    }

    public final int getNumberOfPayments() {
        return this.numberOfPayments;
    }

    public final int getOrderAmount() {
        return this.orderAmount;
    }

    public final int getOriginationFee() {
        return this.originationFee;
    }

    public final int getPaymentDueDay() {
        return this.paymentDueDay;
    }

    public final int getTotalPayments() {
        return this.totalPayments;
    }

    public int hashCode() {
        return (((((((((((((((((((((Integer.hashCode(this.originationFee) * 31) + Integer.hashCode(this.financeCharges)) * 31) + Integer.hashCode(this.apr)) * 31) + Integer.hashCode(this.downPayment)) * 31) + Integer.hashCode(this.monthlyPaymentAmount)) * 31) + Integer.hashCode(this.paymentDueDay)) * 31) + Integer.hashCode(this.grandTotal)) * 31) + Integer.hashCode(this.loanAmount)) * 31) + Integer.hashCode(this.totalPayments)) * 31) + Integer.hashCode(this.orderAmount)) * 31) + Integer.hashCode(this.financedAmount)) * 31) + Integer.hashCode(this.numberOfPayments);
    }

    public String toString() {
        return "ULLoanOfferResponse(originationFee=" + this.originationFee + ", financeCharges=" + this.financeCharges + ", apr=" + this.apr + ", downPayment=" + this.downPayment + ", monthlyPaymentAmount=" + this.monthlyPaymentAmount + ", paymentDueDay=" + this.paymentDueDay + ", grandTotal=" + this.grandTotal + ", loanAmount=" + this.loanAmount + ", totalPayments=" + this.totalPayments + ", orderAmount=" + this.orderAmount + ", financedAmount=" + this.financedAmount + ", numberOfPayments=" + this.numberOfPayments + ')';
    }
}
