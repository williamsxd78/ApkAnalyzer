package com.vivaaerobus.app.doters.data;

import com.vivaaerobus.app.analytics.presentation.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DotersInfoType.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u000f\u0010\u0011\u0012\u0013B-\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0005\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/vivaaerobus/app/doters/data/DotersInfoType;", "", "total", "", "earned", "customer", "", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "getTotal", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEarned", "getCustomer", "()Ljava/lang/String;", AnalyticsConstants.CUSTOMER_VALUE, "Join", "Won", "Used", "Total", "Lcom/vivaaerobus/app/doters/data/DotersInfoType$Customer;", "Lcom/vivaaerobus/app/doters/data/DotersInfoType$Join;", "Lcom/vivaaerobus/app/doters/data/DotersInfoType$Total;", "Lcom/vivaaerobus/app/doters/data/DotersInfoType$Used;", "Lcom/vivaaerobus/app/doters/data/DotersInfoType$Won;", "doters_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DotersInfoType {
    public static final int $stable = 0;
    private final String customer;
    private final Double earned;
    private final Double total;

    /* compiled from: DotersInfoType.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/vivaaerobus/app/doters/data/DotersInfoType$Customer;", "Lcom/vivaaerobus/app/doters/data/DotersInfoType;", "customer", "", "<init>", "(Ljava/lang/String;)V", "doters_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Customer extends DotersInfoType {
        public static final int $stable = 0;

        public Customer(String str) {
            super(null, null, str, 3, null);
        }
    }

    /* compiled from: DotersInfoType.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/vivaaerobus/app/doters/data/DotersInfoType$Join;", "Lcom/vivaaerobus/app/doters/data/DotersInfoType;", "totalDoters", "", "<init>", "(Ljava/lang/Double;)V", "doters_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Join extends DotersInfoType {
        public static final int $stable = 0;

        public Join(Double d) {
            super(d, null, null, 6, null);
        }
    }

    /* compiled from: DotersInfoType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vivaaerobus/app/doters/data/DotersInfoType$Total;", "Lcom/vivaaerobus/app/doters/data/DotersInfoType;", "<init>", "()V", "doters_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Total extends DotersInfoType {
        public static final int $stable = 0;
        public static final Total INSTANCE = new Total();

        private Total() {
            super(null, null, null, 7, null);
        }
    }

    /* compiled from: DotersInfoType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vivaaerobus/app/doters/data/DotersInfoType$Used;", "Lcom/vivaaerobus/app/doters/data/DotersInfoType;", "<init>", "()V", "doters_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Used extends DotersInfoType {
        public static final int $stable = 0;
        public static final Used INSTANCE = new Used();

        private Used() {
            super(null, null, null, 7, null);
        }
    }

    /* compiled from: DotersInfoType.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vivaaerobus/app/doters/data/DotersInfoType$Won;", "Lcom/vivaaerobus/app/doters/data/DotersInfoType;", "totalDoters", "", "earned", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "doters_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Won extends DotersInfoType {
        public static final int $stable = 0;

        public Won(Double d, Double d2) {
            super(d, d2, null, 4, null);
        }
    }

    private DotersInfoType(Double d, Double d2, String str) {
        this.total = d;
        this.earned = d2;
        this.customer = str;
    }

    public /* synthetic */ DotersInfoType(Double d, Double d2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : str, null);
    }

    public /* synthetic */ DotersInfoType(Double d, Double d2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, str);
    }

    public final String getCustomer() {
        return this.customer;
    }

    public final Double getEarned() {
        return this.earned;
    }

    public final Double getTotal() {
        return this.total;
    }
}
