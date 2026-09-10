package com.chuckerteam.chucker.internal.ui.transaction;

import com.chuckerteam.chucker.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ProtocolResources.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u001d\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/ProtocolResources;", "", "icon", "", "color", "<init>", "(II)V", "getIcon", "()I", "getColor", "Http", "Https", "Lcom/chuckerteam/chucker/internal/ui/transaction/ProtocolResources$Http;", "Lcom/chuckerteam/chucker/internal/ui/transaction/ProtocolResources$Https;", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ProtocolResources {
    private final int color;
    private final int icon;

    /* compiled from: ProtocolResources.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/ProtocolResources$Http;", "Lcom/chuckerteam/chucker/internal/ui/transaction/ProtocolResources;", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Http extends ProtocolResources {
        public Http() {
            super(R.drawable.chucker_ic_http, R.color.chucker_color_error, null);
        }
    }

    /* compiled from: ProtocolResources.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/ProtocolResources$Https;", "Lcom/chuckerteam/chucker/internal/ui/transaction/ProtocolResources;", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Https extends ProtocolResources {
        public Https() {
            super(R.drawable.chucker_ic_https, R.color.chucker_color_primary, null);
        }
    }

    private ProtocolResources(int i, int i2) {
        this.icon = i;
        this.color = i2;
    }

    public /* synthetic */ ProtocolResources(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    public final int getColor() {
        return this.color;
    }

    public final int getIcon() {
        return this.icon;
    }
}
