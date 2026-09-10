package com.vivaaerobus.app.dashboard.presentation.compose.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoardingPassModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/vivaaerobus/app/dashboard/presentation/compose/model/BoardingPassModel;", "", "pnr", "", "destinations", "flight", "terminal", "boardingPassCount", "", "flow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getPnr", "()Ljava/lang/String;", "getDestinations", "getFlight", "getTerminal", "getBoardingPassCount", "()I", "getFlow", "component1", "component2", "component3", "component4", "component5", "component6", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "dashboard_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BoardingPassModel {
    public static final int $stable = 0;
    private final int boardingPassCount;
    private final String destinations;
    private final String flight;
    private final String flow;
    private final String pnr;
    private final String terminal;

    public BoardingPassModel(String pnr, String destinations, String flight, String terminal, int i, String flow) {
        Intrinsics.checkNotNullParameter(pnr, "pnr");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(flight, "flight");
        Intrinsics.checkNotNullParameter(terminal, "terminal");
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.pnr = pnr;
        this.destinations = destinations;
        this.flight = flight;
        this.terminal = terminal;
        this.boardingPassCount = i;
        this.flow = flow;
    }

    public static /* synthetic */ BoardingPassModel copy$default(BoardingPassModel boardingPassModel, String str, String str2, String str3, String str4, int i, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = boardingPassModel.pnr;
        }
        if ((i2 & 2) != 0) {
            str2 = boardingPassModel.destinations;
        }
        if ((i2 & 4) != 0) {
            str3 = boardingPassModel.flight;
        }
        if ((i2 & 8) != 0) {
            str4 = boardingPassModel.terminal;
        }
        if ((i2 & 16) != 0) {
            i = boardingPassModel.boardingPassCount;
        }
        if ((i2 & 32) != 0) {
            str5 = boardingPassModel.flow;
        }
        int i3 = i;
        String str6 = str5;
        return boardingPassModel.copy(str, str2, str3, str4, i3, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPnr() {
        return this.pnr;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDestinations() {
        return this.destinations;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFlight() {
        return this.flight;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTerminal() {
        return this.terminal;
    }

    /* renamed from: component5, reason: from getter */
    public final int getBoardingPassCount() {
        return this.boardingPassCount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFlow() {
        return this.flow;
    }

    public final BoardingPassModel copy(String pnr, String destinations, String flight, String terminal, int boardingPassCount, String flow) {
        Intrinsics.checkNotNullParameter(pnr, "pnr");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(flight, "flight");
        Intrinsics.checkNotNullParameter(terminal, "terminal");
        Intrinsics.checkNotNullParameter(flow, "flow");
        return new BoardingPassModel(pnr, destinations, flight, terminal, boardingPassCount, flow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoardingPassModel)) {
            return false;
        }
        BoardingPassModel boardingPassModel = (BoardingPassModel) other;
        return Intrinsics.areEqual(this.pnr, boardingPassModel.pnr) && Intrinsics.areEqual(this.destinations, boardingPassModel.destinations) && Intrinsics.areEqual(this.flight, boardingPassModel.flight) && Intrinsics.areEqual(this.terminal, boardingPassModel.terminal) && this.boardingPassCount == boardingPassModel.boardingPassCount && Intrinsics.areEqual(this.flow, boardingPassModel.flow);
    }

    public final int getBoardingPassCount() {
        return this.boardingPassCount;
    }

    public final String getDestinations() {
        return this.destinations;
    }

    public final String getFlight() {
        return this.flight;
    }

    public final String getFlow() {
        return this.flow;
    }

    public final String getPnr() {
        return this.pnr;
    }

    public final String getTerminal() {
        return this.terminal;
    }

    public int hashCode() {
        return (((((((((this.pnr.hashCode() * 31) + this.destinations.hashCode()) * 31) + this.flight.hashCode()) * 31) + this.terminal.hashCode()) * 31) + Integer.hashCode(this.boardingPassCount)) * 31) + this.flow.hashCode();
    }

    public String toString() {
        return "BoardingPassModel(pnr=" + this.pnr + ", destinations=" + this.destinations + ", flight=" + this.flight + ", terminal=" + this.terminal + ", boardingPassCount=" + this.boardingPassCount + ", flow=" + this.flow + ")";
    }
}
