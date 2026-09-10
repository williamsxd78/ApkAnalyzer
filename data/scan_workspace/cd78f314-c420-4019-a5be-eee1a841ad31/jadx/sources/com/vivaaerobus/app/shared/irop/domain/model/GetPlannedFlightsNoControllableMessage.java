package com.vivaaerobus.app.shared.irop.domain.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetPlannedFlightsResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b?\b\u0086\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0011HÆ\u0003J\t\u0010B\u001a\u00020\u0011HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003Jå\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u0005HÆ\u0001J\u0014\u0010L\u001a\u00020\u00112\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010N\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010O\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010+R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 ¨\u0006P"}, d2 = {"Lcom/vivaaerobus/app/shared/irop/domain/model/GetPlannedFlightsNoControllableMessage;", "", "flt", "", "std", "", "dep", "arr", "notificationType", "idCategory", "idReason", "idAffectation", "messageSpanish", "messageEng", "uuid", "expirationDate", "isImputable", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "createdDate", "lastUpdate", "createdUser", "status", "modifiedUser", "titleEng", "titleEsp", "urlIcon", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFlt", "()I", "getStd", "()Ljava/lang/String;", "getDep", "getArr", "getNotificationType", "getIdCategory", "getIdReason", "getIdAffectation", "getMessageSpanish", "getMessageEng", "getUuid", "getExpirationDate", "()Z", "getActive", "getCreatedDate", "getLastUpdate", "getCreatedUser", "getStatus", "getModifiedUser", "getTitleEng", "getTitleEsp", "getUrlIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "toString", "irop_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GetPlannedFlightsNoControllableMessage {
    private final boolean active;
    private final String arr;
    private final String createdDate;
    private final String createdUser;
    private final String dep;
    private final String expirationDate;
    private final int flt;
    private final int idAffectation;
    private final int idCategory;
    private final int idReason;
    private final boolean isImputable;
    private final String lastUpdate;
    private final String messageEng;
    private final String messageSpanish;
    private final String modifiedUser;
    private final int notificationType;
    private final String status;
    private final String std;
    private final String titleEng;
    private final String titleEsp;
    private final String urlIcon;
    private final String uuid;

    public GetPlannedFlightsNoControllableMessage(int i, String std, String dep, String arr, int i2, int i3, int i4, int i5, String messageSpanish, String messageEng, String uuid, String expirationDate, boolean z, boolean z2, String createdDate, String lastUpdate, String createdUser, String status, String modifiedUser, String titleEng, String titleEsp, String urlIcon) {
        Intrinsics.checkNotNullParameter(std, "std");
        Intrinsics.checkNotNullParameter(dep, "dep");
        Intrinsics.checkNotNullParameter(arr, "arr");
        Intrinsics.checkNotNullParameter(messageSpanish, "messageSpanish");
        Intrinsics.checkNotNullParameter(messageEng, "messageEng");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(lastUpdate, "lastUpdate");
        Intrinsics.checkNotNullParameter(createdUser, "createdUser");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(modifiedUser, "modifiedUser");
        Intrinsics.checkNotNullParameter(titleEng, "titleEng");
        Intrinsics.checkNotNullParameter(titleEsp, "titleEsp");
        Intrinsics.checkNotNullParameter(urlIcon, "urlIcon");
        this.flt = i;
        this.std = std;
        this.dep = dep;
        this.arr = arr;
        this.notificationType = i2;
        this.idCategory = i3;
        this.idReason = i4;
        this.idAffectation = i5;
        this.messageSpanish = messageSpanish;
        this.messageEng = messageEng;
        this.uuid = uuid;
        this.expirationDate = expirationDate;
        this.isImputable = z;
        this.active = z2;
        this.createdDate = createdDate;
        this.lastUpdate = lastUpdate;
        this.createdUser = createdUser;
        this.status = status;
        this.modifiedUser = modifiedUser;
        this.titleEng = titleEng;
        this.titleEsp = titleEsp;
        this.urlIcon = urlIcon;
    }

    public static /* synthetic */ GetPlannedFlightsNoControllableMessage copy$default(GetPlannedFlightsNoControllableMessage getPlannedFlightsNoControllableMessage, int i, String str, String str2, String str3, int i2, int i3, int i4, int i5, String str4, String str5, String str6, String str7, boolean z, boolean z2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i6, Object obj) {
        String str16;
        String str17;
        int i7 = (i6 & 1) != 0 ? getPlannedFlightsNoControllableMessage.flt : i;
        String str18 = (i6 & 2) != 0 ? getPlannedFlightsNoControllableMessage.std : str;
        String str19 = (i6 & 4) != 0 ? getPlannedFlightsNoControllableMessage.dep : str2;
        String str20 = (i6 & 8) != 0 ? getPlannedFlightsNoControllableMessage.arr : str3;
        int i8 = (i6 & 16) != 0 ? getPlannedFlightsNoControllableMessage.notificationType : i2;
        int i9 = (i6 & 32) != 0 ? getPlannedFlightsNoControllableMessage.idCategory : i3;
        int i10 = (i6 & 64) != 0 ? getPlannedFlightsNoControllableMessage.idReason : i4;
        int i11 = (i6 & 128) != 0 ? getPlannedFlightsNoControllableMessage.idAffectation : i5;
        String str21 = (i6 & 256) != 0 ? getPlannedFlightsNoControllableMessage.messageSpanish : str4;
        String str22 = (i6 & 512) != 0 ? getPlannedFlightsNoControllableMessage.messageEng : str5;
        String str23 = (i6 & 1024) != 0 ? getPlannedFlightsNoControllableMessage.uuid : str6;
        String str24 = (i6 & 2048) != 0 ? getPlannedFlightsNoControllableMessage.expirationDate : str7;
        boolean z3 = (i6 & 4096) != 0 ? getPlannedFlightsNoControllableMessage.isImputable : z;
        boolean z4 = (i6 & 8192) != 0 ? getPlannedFlightsNoControllableMessage.active : z2;
        int i12 = i7;
        String str25 = (i6 & 16384) != 0 ? getPlannedFlightsNoControllableMessage.createdDate : str8;
        String str26 = (i6 & 32768) != 0 ? getPlannedFlightsNoControllableMessage.lastUpdate : str9;
        String str27 = (i6 & 65536) != 0 ? getPlannedFlightsNoControllableMessage.createdUser : str10;
        String str28 = (i6 & 131072) != 0 ? getPlannedFlightsNoControllableMessage.status : str11;
        String str29 = (i6 & 262144) != 0 ? getPlannedFlightsNoControllableMessage.modifiedUser : str12;
        String str30 = (i6 & 524288) != 0 ? getPlannedFlightsNoControllableMessage.titleEng : str13;
        String str31 = (i6 & 1048576) != 0 ? getPlannedFlightsNoControllableMessage.titleEsp : str14;
        if ((i6 & 2097152) != 0) {
            str17 = str31;
            str16 = getPlannedFlightsNoControllableMessage.urlIcon;
        } else {
            str16 = str15;
            str17 = str31;
        }
        return getPlannedFlightsNoControllableMessage.copy(i12, str18, str19, str20, i8, i9, i10, i11, str21, str22, str23, str24, z3, z4, str25, str26, str27, str28, str29, str30, str17, str16);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFlt() {
        return this.flt;
    }

    /* renamed from: component10, reason: from getter */
    public final String getMessageEng() {
        return this.messageEng;
    }

    /* renamed from: component11, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component12, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsImputable() {
        return this.isImputable;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* renamed from: component15, reason: from getter */
    public final String getCreatedDate() {
        return this.createdDate;
    }

    /* renamed from: component16, reason: from getter */
    public final String getLastUpdate() {
        return this.lastUpdate;
    }

    /* renamed from: component17, reason: from getter */
    public final String getCreatedUser() {
        return this.createdUser;
    }

    /* renamed from: component18, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component19, reason: from getter */
    public final String getModifiedUser() {
        return this.modifiedUser;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStd() {
        return this.std;
    }

    /* renamed from: component20, reason: from getter */
    public final String getTitleEng() {
        return this.titleEng;
    }

    /* renamed from: component21, reason: from getter */
    public final String getTitleEsp() {
        return this.titleEsp;
    }

    /* renamed from: component22, reason: from getter */
    public final String getUrlIcon() {
        return this.urlIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDep() {
        return this.dep;
    }

    /* renamed from: component4, reason: from getter */
    public final String getArr() {
        return this.arr;
    }

    /* renamed from: component5, reason: from getter */
    public final int getNotificationType() {
        return this.notificationType;
    }

    /* renamed from: component6, reason: from getter */
    public final int getIdCategory() {
        return this.idCategory;
    }

    /* renamed from: component7, reason: from getter */
    public final int getIdReason() {
        return this.idReason;
    }

    /* renamed from: component8, reason: from getter */
    public final int getIdAffectation() {
        return this.idAffectation;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMessageSpanish() {
        return this.messageSpanish;
    }

    public final GetPlannedFlightsNoControllableMessage copy(int flt, String std, String dep, String arr, int notificationType, int idCategory, int idReason, int idAffectation, String messageSpanish, String messageEng, String uuid, String expirationDate, boolean isImputable, boolean active, String createdDate, String lastUpdate, String createdUser, String status, String modifiedUser, String titleEng, String titleEsp, String urlIcon) {
        Intrinsics.checkNotNullParameter(std, "std");
        Intrinsics.checkNotNullParameter(dep, "dep");
        Intrinsics.checkNotNullParameter(arr, "arr");
        Intrinsics.checkNotNullParameter(messageSpanish, "messageSpanish");
        Intrinsics.checkNotNullParameter(messageEng, "messageEng");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(lastUpdate, "lastUpdate");
        Intrinsics.checkNotNullParameter(createdUser, "createdUser");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(modifiedUser, "modifiedUser");
        Intrinsics.checkNotNullParameter(titleEng, "titleEng");
        Intrinsics.checkNotNullParameter(titleEsp, "titleEsp");
        Intrinsics.checkNotNullParameter(urlIcon, "urlIcon");
        return new GetPlannedFlightsNoControllableMessage(flt, std, dep, arr, notificationType, idCategory, idReason, idAffectation, messageSpanish, messageEng, uuid, expirationDate, isImputable, active, createdDate, lastUpdate, createdUser, status, modifiedUser, titleEng, titleEsp, urlIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPlannedFlightsNoControllableMessage)) {
            return false;
        }
        GetPlannedFlightsNoControllableMessage getPlannedFlightsNoControllableMessage = (GetPlannedFlightsNoControllableMessage) other;
        return this.flt == getPlannedFlightsNoControllableMessage.flt && Intrinsics.areEqual(this.std, getPlannedFlightsNoControllableMessage.std) && Intrinsics.areEqual(this.dep, getPlannedFlightsNoControllableMessage.dep) && Intrinsics.areEqual(this.arr, getPlannedFlightsNoControllableMessage.arr) && this.notificationType == getPlannedFlightsNoControllableMessage.notificationType && this.idCategory == getPlannedFlightsNoControllableMessage.idCategory && this.idReason == getPlannedFlightsNoControllableMessage.idReason && this.idAffectation == getPlannedFlightsNoControllableMessage.idAffectation && Intrinsics.areEqual(this.messageSpanish, getPlannedFlightsNoControllableMessage.messageSpanish) && Intrinsics.areEqual(this.messageEng, getPlannedFlightsNoControllableMessage.messageEng) && Intrinsics.areEqual(this.uuid, getPlannedFlightsNoControllableMessage.uuid) && Intrinsics.areEqual(this.expirationDate, getPlannedFlightsNoControllableMessage.expirationDate) && this.isImputable == getPlannedFlightsNoControllableMessage.isImputable && this.active == getPlannedFlightsNoControllableMessage.active && Intrinsics.areEqual(this.createdDate, getPlannedFlightsNoControllableMessage.createdDate) && Intrinsics.areEqual(this.lastUpdate, getPlannedFlightsNoControllableMessage.lastUpdate) && Intrinsics.areEqual(this.createdUser, getPlannedFlightsNoControllableMessage.createdUser) && Intrinsics.areEqual(this.status, getPlannedFlightsNoControllableMessage.status) && Intrinsics.areEqual(this.modifiedUser, getPlannedFlightsNoControllableMessage.modifiedUser) && Intrinsics.areEqual(this.titleEng, getPlannedFlightsNoControllableMessage.titleEng) && Intrinsics.areEqual(this.titleEsp, getPlannedFlightsNoControllableMessage.titleEsp) && Intrinsics.areEqual(this.urlIcon, getPlannedFlightsNoControllableMessage.urlIcon);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getArr() {
        return this.arr;
    }

    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final String getCreatedUser() {
        return this.createdUser;
    }

    public final String getDep() {
        return this.dep;
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final int getFlt() {
        return this.flt;
    }

    public final int getIdAffectation() {
        return this.idAffectation;
    }

    public final int getIdCategory() {
        return this.idCategory;
    }

    public final int getIdReason() {
        return this.idReason;
    }

    public final String getLastUpdate() {
        return this.lastUpdate;
    }

    public final String getMessageEng() {
        return this.messageEng;
    }

    public final String getMessageSpanish() {
        return this.messageSpanish;
    }

    public final String getModifiedUser() {
        return this.modifiedUser;
    }

    public final int getNotificationType() {
        return this.notificationType;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStd() {
        return this.std;
    }

    public final String getTitleEng() {
        return this.titleEng;
    }

    public final String getTitleEsp() {
        return this.titleEsp;
    }

    public final String getUrlIcon() {
        return this.urlIcon;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.flt) * 31) + this.std.hashCode()) * 31) + this.dep.hashCode()) * 31) + this.arr.hashCode()) * 31) + Integer.hashCode(this.notificationType)) * 31) + Integer.hashCode(this.idCategory)) * 31) + Integer.hashCode(this.idReason)) * 31) + Integer.hashCode(this.idAffectation)) * 31) + this.messageSpanish.hashCode()) * 31) + this.messageEng.hashCode()) * 31) + this.uuid.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + Boolean.hashCode(this.isImputable)) * 31) + Boolean.hashCode(this.active)) * 31) + this.createdDate.hashCode()) * 31) + this.lastUpdate.hashCode()) * 31) + this.createdUser.hashCode()) * 31) + this.status.hashCode()) * 31) + this.modifiedUser.hashCode()) * 31) + this.titleEng.hashCode()) * 31) + this.titleEsp.hashCode()) * 31) + this.urlIcon.hashCode();
    }

    public final boolean isImputable() {
        return this.isImputable;
    }

    public String toString() {
        return "GetPlannedFlightsNoControllableMessage(flt=" + this.flt + ", std=" + this.std + ", dep=" + this.dep + ", arr=" + this.arr + ", notificationType=" + this.notificationType + ", idCategory=" + this.idCategory + ", idReason=" + this.idReason + ", idAffectation=" + this.idAffectation + ", messageSpanish=" + this.messageSpanish + ", messageEng=" + this.messageEng + ", uuid=" + this.uuid + ", expirationDate=" + this.expirationDate + ", isImputable=" + this.isImputable + ", active=" + this.active + ", createdDate=" + this.createdDate + ", lastUpdate=" + this.lastUpdate + ", createdUser=" + this.createdUser + ", status=" + this.status + ", modifiedUser=" + this.modifiedUser + ", titleEng=" + this.titleEng + ", titleEsp=" + this.titleEsp + ", urlIcon=" + this.urlIcon + ")";
    }
}
