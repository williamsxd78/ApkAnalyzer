package com.vivaaerobus.app.checkIn.presentation.travelDocuments.model;

import androidx.autofill.HintConstants;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.common.C;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TravelInfoView.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\bb\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c\u0012\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b+\u0010,J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010<J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010<J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010<J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010w\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cHÆ\u0003J\u0011\u0010x\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jè\u0003\u0010z\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010{J\u0014\u0010|\u001a\u00020\u00122\b\u0010}\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010~\u001a\u00020\u007fHÖ\u0081\u0004J\u000b\u0010\u0080\u0001\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010.R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010.R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010.R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010.R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010.R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010.R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010.R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010=\u001a\u0004\b\u0011\u0010<R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010.R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010.R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010=\u001a\u0004\b\u0015\u0010<R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010.R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010.R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010.R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010.R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010.R\u0019\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010.R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010.R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010.R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010.R\u0015\u0010\"\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010=\u001a\u0004\b\"\u0010<R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010.R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010.R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010.R\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010.R\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010.R\u0019\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010FR\u0019\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bR\u0010FR\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010.¨\u0006\u0081\u0001"}, d2 = {"Lcom/vivaaerobus/app/checkIn/presentation/travelDocuments/model/TravelInfoView;", "", "missingDataTitle", "", "travelDocTitle", "autocompleteTitle", "passportTitle", "issuingCountryTitle", "issuingCountry", "expirationDateTitle", "expirationDate", "otherDocsTitle", "knowTravelerTitle", "knowTraveler", "redressNumberTitle", "redressNumber", "saveCompanionProfileTitle", "isSaveCompanionProfile", "", "destinationInfoTitle", "usedSameInfoPassengerOneTitle", "isUsedSameInfoPassengerOne", "addressTitle", "address", "postalCodeTitle", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "selectPolityTitle", "polities", "", "cityTitle", "city", "emergencyContactTitle", "emergencyContact", "emUsedSamePassengerInfoTitle", "isEmUsedSamePassengerInfo", "emergencyContactFullNameTitle", "emergencyContactFullName", "emergencyContactEmailTitle", "emergencyContactEmail", "emergencyContactTypePhoneTitle", "emergencyContactTypesPhone", "countryCodes", "emergencyContactPhone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getMissingDataTitle", "()Ljava/lang/String;", "getTravelDocTitle", "getAutocompleteTitle", "getPassportTitle", "getIssuingCountryTitle", "getIssuingCountry", "getExpirationDateTitle", "getExpirationDate", "getOtherDocsTitle", "getKnowTravelerTitle", "getKnowTraveler", "getRedressNumberTitle", "getRedressNumber", "getSaveCompanionProfileTitle", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDestinationInfoTitle", "getUsedSameInfoPassengerOneTitle", "getAddressTitle", "getAddress", "getPostalCodeTitle", "getPostalCode", "getSelectPolityTitle", "getPolities", "()Ljava/util/List;", "getCityTitle", "getCity", "getEmergencyContactTitle", "getEmergencyContact", "getEmUsedSamePassengerInfoTitle", "getEmergencyContactFullNameTitle", "getEmergencyContactFullName", "getEmergencyContactEmailTitle", "getEmergencyContactEmail", "getEmergencyContactTypePhoneTitle", "getEmergencyContactTypesPhone", "getCountryCodes", "getEmergencyContactPhone", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/vivaaerobus/app/checkIn/presentation/travelDocuments/model/TravelInfoView;", "equals", "other", "hashCode", "", "toString", "checkIn_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelInfoView {
    public static final int $stable = 8;
    private final String address;
    private final String addressTitle;
    private final String autocompleteTitle;
    private final String city;
    private final String cityTitle;
    private final List<String> countryCodes;
    private final String destinationInfoTitle;
    private final String emUsedSamePassengerInfoTitle;
    private final String emergencyContact;
    private final String emergencyContactEmail;
    private final String emergencyContactEmailTitle;
    private final String emergencyContactFullName;
    private final String emergencyContactFullNameTitle;
    private final String emergencyContactPhone;
    private final String emergencyContactTitle;
    private final String emergencyContactTypePhoneTitle;
    private final List<String> emergencyContactTypesPhone;
    private final String expirationDate;
    private final String expirationDateTitle;
    private final Boolean isEmUsedSamePassengerInfo;
    private final Boolean isSaveCompanionProfile;
    private final Boolean isUsedSameInfoPassengerOne;
    private final String issuingCountry;
    private final String issuingCountryTitle;
    private final String knowTraveler;
    private final String knowTravelerTitle;
    private final String missingDataTitle;
    private final String otherDocsTitle;
    private final String passportTitle;
    private final List<String> polities;
    private final String postalCode;
    private final String postalCodeTitle;
    private final String redressNumber;
    private final String redressNumberTitle;
    private final String saveCompanionProfileTitle;
    private final String selectPolityTitle;
    private final String travelDocTitle;
    private final String usedSameInfoPassengerOneTitle;

    public TravelInfoView(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, String str15, String str16, Boolean bool2, String str17, String str18, String str19, String str20, String str21, List<String> list, String str22, String str23, String str24, String str25, String str26, Boolean bool3, String str27, String str28, String str29, String str30, String str31, List<String> list2, List<String> list3, String str32) {
        this.missingDataTitle = str;
        this.travelDocTitle = str2;
        this.autocompleteTitle = str3;
        this.passportTitle = str4;
        this.issuingCountryTitle = str5;
        this.issuingCountry = str6;
        this.expirationDateTitle = str7;
        this.expirationDate = str8;
        this.otherDocsTitle = str9;
        this.knowTravelerTitle = str10;
        this.knowTraveler = str11;
        this.redressNumberTitle = str12;
        this.redressNumber = str13;
        this.saveCompanionProfileTitle = str14;
        this.isSaveCompanionProfile = bool;
        this.destinationInfoTitle = str15;
        this.usedSameInfoPassengerOneTitle = str16;
        this.isUsedSameInfoPassengerOne = bool2;
        this.addressTitle = str17;
        this.address = str18;
        this.postalCodeTitle = str19;
        this.postalCode = str20;
        this.selectPolityTitle = str21;
        this.polities = list;
        this.cityTitle = str22;
        this.city = str23;
        this.emergencyContactTitle = str24;
        this.emergencyContact = str25;
        this.emUsedSamePassengerInfoTitle = str26;
        this.isEmUsedSamePassengerInfo = bool3;
        this.emergencyContactFullNameTitle = str27;
        this.emergencyContactFullName = str28;
        this.emergencyContactEmailTitle = str29;
        this.emergencyContactEmail = str30;
        this.emergencyContactTypePhoneTitle = str31;
        this.emergencyContactTypesPhone = list2;
        this.countryCodes = list3;
        this.emergencyContactPhone = str32;
    }

    public static /* synthetic */ TravelInfoView copy$default(TravelInfoView travelInfoView, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, String str15, String str16, Boolean bool2, String str17, String str18, String str19, String str20, String str21, List list, String str22, String str23, String str24, String str25, String str26, Boolean bool3, String str27, String str28, String str29, String str30, String str31, List list2, List list3, String str32, int i, int i2, Object obj) {
        String str33;
        List list4;
        String str34;
        String str35;
        List list5;
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        Boolean bool4;
        String str41;
        String str42;
        String str43;
        String str44;
        String str45;
        List list6;
        Boolean bool5;
        String str46;
        String str47;
        String str48;
        String str49;
        String str50;
        String str51;
        String str52;
        String str53;
        String str54;
        String str55;
        Boolean bool6;
        String str56;
        String str57;
        String str58;
        String str59;
        String str60;
        String str61;
        String str62;
        String str63;
        String str64 = (i & 1) != 0 ? travelInfoView.missingDataTitle : str;
        String str65 = (i & 2) != 0 ? travelInfoView.travelDocTitle : str2;
        String str66 = (i & 4) != 0 ? travelInfoView.autocompleteTitle : str3;
        String str67 = (i & 8) != 0 ? travelInfoView.passportTitle : str4;
        String str68 = (i & 16) != 0 ? travelInfoView.issuingCountryTitle : str5;
        String str69 = (i & 32) != 0 ? travelInfoView.issuingCountry : str6;
        String str70 = (i & 64) != 0 ? travelInfoView.expirationDateTitle : str7;
        String str71 = (i & 128) != 0 ? travelInfoView.expirationDate : str8;
        String str72 = (i & 256) != 0 ? travelInfoView.otherDocsTitle : str9;
        String str73 = (i & 512) != 0 ? travelInfoView.knowTravelerTitle : str10;
        String str74 = (i & 1024) != 0 ? travelInfoView.knowTraveler : str11;
        String str75 = (i & 2048) != 0 ? travelInfoView.redressNumberTitle : str12;
        String str76 = (i & 4096) != 0 ? travelInfoView.redressNumber : str13;
        String str77 = (i & 8192) != 0 ? travelInfoView.saveCompanionProfileTitle : str14;
        String str78 = str64;
        Boolean bool7 = (i & 16384) != 0 ? travelInfoView.isSaveCompanionProfile : bool;
        String str79 = (i & 32768) != 0 ? travelInfoView.destinationInfoTitle : str15;
        String str80 = (i & 65536) != 0 ? travelInfoView.usedSameInfoPassengerOneTitle : str16;
        Boolean bool8 = (i & 131072) != 0 ? travelInfoView.isUsedSameInfoPassengerOne : bool2;
        String str81 = (i & 262144) != 0 ? travelInfoView.addressTitle : str17;
        String str82 = (i & 524288) != 0 ? travelInfoView.address : str18;
        String str83 = (i & 1048576) != 0 ? travelInfoView.postalCodeTitle : str19;
        String str84 = (i & 2097152) != 0 ? travelInfoView.postalCode : str20;
        String str85 = (i & 4194304) != 0 ? travelInfoView.selectPolityTitle : str21;
        List list7 = (i & 8388608) != 0 ? travelInfoView.polities : list;
        String str86 = (i & 16777216) != 0 ? travelInfoView.cityTitle : str22;
        String str87 = (i & 33554432) != 0 ? travelInfoView.city : str23;
        String str88 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? travelInfoView.emergencyContactTitle : str24;
        String str89 = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? travelInfoView.emergencyContact : str25;
        String str90 = (i & 268435456) != 0 ? travelInfoView.emUsedSamePassengerInfoTitle : str26;
        Boolean bool9 = (i & 536870912) != 0 ? travelInfoView.isEmUsedSamePassengerInfo : bool3;
        String str91 = (i & 1073741824) != 0 ? travelInfoView.emergencyContactFullNameTitle : str27;
        String str92 = (i & Integer.MIN_VALUE) != 0 ? travelInfoView.emergencyContactFullName : str28;
        String str93 = (i2 & 1) != 0 ? travelInfoView.emergencyContactEmailTitle : str29;
        String str94 = (i2 & 2) != 0 ? travelInfoView.emergencyContactEmail : str30;
        String str95 = (i2 & 4) != 0 ? travelInfoView.emergencyContactTypePhoneTitle : str31;
        List list8 = (i2 & 8) != 0 ? travelInfoView.emergencyContactTypesPhone : list2;
        List list9 = (i2 & 16) != 0 ? travelInfoView.countryCodes : list3;
        if ((i2 & 32) != 0) {
            list4 = list9;
            str33 = travelInfoView.emergencyContactPhone;
            str35 = str85;
            list5 = list7;
            str36 = str86;
            str37 = str87;
            str38 = str88;
            str39 = str89;
            str40 = str90;
            bool4 = bool9;
            str41 = str91;
            str42 = str92;
            str43 = str93;
            str44 = str94;
            str45 = str95;
            list6 = list8;
            bool5 = bool7;
            str47 = str71;
            str48 = str72;
            str49 = str73;
            str50 = str74;
            str51 = str75;
            str52 = str76;
            str53 = str77;
            str54 = str79;
            str55 = str80;
            bool6 = bool8;
            str56 = str81;
            str57 = str82;
            str58 = str83;
            str34 = str84;
            str59 = str65;
            str60 = str66;
            str61 = str67;
            str62 = str68;
            str63 = str69;
            str46 = str70;
        } else {
            str33 = str32;
            list4 = list9;
            str34 = str84;
            str35 = str85;
            list5 = list7;
            str36 = str86;
            str37 = str87;
            str38 = str88;
            str39 = str89;
            str40 = str90;
            bool4 = bool9;
            str41 = str91;
            str42 = str92;
            str43 = str93;
            str44 = str94;
            str45 = str95;
            list6 = list8;
            bool5 = bool7;
            str46 = str70;
            str47 = str71;
            str48 = str72;
            str49 = str73;
            str50 = str74;
            str51 = str75;
            str52 = str76;
            str53 = str77;
            str54 = str79;
            str55 = str80;
            bool6 = bool8;
            str56 = str81;
            str57 = str82;
            str58 = str83;
            str59 = str65;
            str60 = str66;
            str61 = str67;
            str62 = str68;
            str63 = str69;
        }
        return travelInfoView.copy(str78, str59, str60, str61, str62, str63, str46, str47, str48, str49, str50, str51, str52, str53, bool5, str54, str55, bool6, str56, str57, str58, str34, str35, list5, str36, str37, str38, str39, str40, bool4, str41, str42, str43, str44, str45, list6, list4, str33);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMissingDataTitle() {
        return this.missingDataTitle;
    }

    /* renamed from: component10, reason: from getter */
    public final String getKnowTravelerTitle() {
        return this.knowTravelerTitle;
    }

    /* renamed from: component11, reason: from getter */
    public final String getKnowTraveler() {
        return this.knowTraveler;
    }

    /* renamed from: component12, reason: from getter */
    public final String getRedressNumberTitle() {
        return this.redressNumberTitle;
    }

    /* renamed from: component13, reason: from getter */
    public final String getRedressNumber() {
        return this.redressNumber;
    }

    /* renamed from: component14, reason: from getter */
    public final String getSaveCompanionProfileTitle() {
        return this.saveCompanionProfileTitle;
    }

    /* renamed from: component15, reason: from getter */
    public final Boolean getIsSaveCompanionProfile() {
        return this.isSaveCompanionProfile;
    }

    /* renamed from: component16, reason: from getter */
    public final String getDestinationInfoTitle() {
        return this.destinationInfoTitle;
    }

    /* renamed from: component17, reason: from getter */
    public final String getUsedSameInfoPassengerOneTitle() {
        return this.usedSameInfoPassengerOneTitle;
    }

    /* renamed from: component18, reason: from getter */
    public final Boolean getIsUsedSameInfoPassengerOne() {
        return this.isUsedSameInfoPassengerOne;
    }

    /* renamed from: component19, reason: from getter */
    public final String getAddressTitle() {
        return this.addressTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTravelDocTitle() {
        return this.travelDocTitle;
    }

    /* renamed from: component20, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component21, reason: from getter */
    public final String getPostalCodeTitle() {
        return this.postalCodeTitle;
    }

    /* renamed from: component22, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* renamed from: component23, reason: from getter */
    public final String getSelectPolityTitle() {
        return this.selectPolityTitle;
    }

    public final List<String> component24() {
        return this.polities;
    }

    /* renamed from: component25, reason: from getter */
    public final String getCityTitle() {
        return this.cityTitle;
    }

    /* renamed from: component26, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: component27, reason: from getter */
    public final String getEmergencyContactTitle() {
        return this.emergencyContactTitle;
    }

    /* renamed from: component28, reason: from getter */
    public final String getEmergencyContact() {
        return this.emergencyContact;
    }

    /* renamed from: component29, reason: from getter */
    public final String getEmUsedSamePassengerInfoTitle() {
        return this.emUsedSamePassengerInfoTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAutocompleteTitle() {
        return this.autocompleteTitle;
    }

    /* renamed from: component30, reason: from getter */
    public final Boolean getIsEmUsedSamePassengerInfo() {
        return this.isEmUsedSamePassengerInfo;
    }

    /* renamed from: component31, reason: from getter */
    public final String getEmergencyContactFullNameTitle() {
        return this.emergencyContactFullNameTitle;
    }

    /* renamed from: component32, reason: from getter */
    public final String getEmergencyContactFullName() {
        return this.emergencyContactFullName;
    }

    /* renamed from: component33, reason: from getter */
    public final String getEmergencyContactEmailTitle() {
        return this.emergencyContactEmailTitle;
    }

    /* renamed from: component34, reason: from getter */
    public final String getEmergencyContactEmail() {
        return this.emergencyContactEmail;
    }

    /* renamed from: component35, reason: from getter */
    public final String getEmergencyContactTypePhoneTitle() {
        return this.emergencyContactTypePhoneTitle;
    }

    public final List<String> component36() {
        return this.emergencyContactTypesPhone;
    }

    public final List<String> component37() {
        return this.countryCodes;
    }

    /* renamed from: component38, reason: from getter */
    public final String getEmergencyContactPhone() {
        return this.emergencyContactPhone;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPassportTitle() {
        return this.passportTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIssuingCountryTitle() {
        return this.issuingCountryTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    /* renamed from: component7, reason: from getter */
    public final String getExpirationDateTitle() {
        return this.expirationDateTitle;
    }

    /* renamed from: component8, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component9, reason: from getter */
    public final String getOtherDocsTitle() {
        return this.otherDocsTitle;
    }

    public final TravelInfoView copy(String missingDataTitle, String travelDocTitle, String autocompleteTitle, String passportTitle, String issuingCountryTitle, String issuingCountry, String expirationDateTitle, String expirationDate, String otherDocsTitle, String knowTravelerTitle, String knowTraveler, String redressNumberTitle, String redressNumber, String saveCompanionProfileTitle, Boolean isSaveCompanionProfile, String destinationInfoTitle, String usedSameInfoPassengerOneTitle, Boolean isUsedSameInfoPassengerOne, String addressTitle, String address, String postalCodeTitle, String postalCode, String selectPolityTitle, List<String> polities, String cityTitle, String city, String emergencyContactTitle, String emergencyContact, String emUsedSamePassengerInfoTitle, Boolean isEmUsedSamePassengerInfo, String emergencyContactFullNameTitle, String emergencyContactFullName, String emergencyContactEmailTitle, String emergencyContactEmail, String emergencyContactTypePhoneTitle, List<String> emergencyContactTypesPhone, List<String> countryCodes, String emergencyContactPhone) {
        return new TravelInfoView(missingDataTitle, travelDocTitle, autocompleteTitle, passportTitle, issuingCountryTitle, issuingCountry, expirationDateTitle, expirationDate, otherDocsTitle, knowTravelerTitle, knowTraveler, redressNumberTitle, redressNumber, saveCompanionProfileTitle, isSaveCompanionProfile, destinationInfoTitle, usedSameInfoPassengerOneTitle, isUsedSameInfoPassengerOne, addressTitle, address, postalCodeTitle, postalCode, selectPolityTitle, polities, cityTitle, city, emergencyContactTitle, emergencyContact, emUsedSamePassengerInfoTitle, isEmUsedSamePassengerInfo, emergencyContactFullNameTitle, emergencyContactFullName, emergencyContactEmailTitle, emergencyContactEmail, emergencyContactTypePhoneTitle, emergencyContactTypesPhone, countryCodes, emergencyContactPhone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelInfoView)) {
            return false;
        }
        TravelInfoView travelInfoView = (TravelInfoView) other;
        return Intrinsics.areEqual(this.missingDataTitle, travelInfoView.missingDataTitle) && Intrinsics.areEqual(this.travelDocTitle, travelInfoView.travelDocTitle) && Intrinsics.areEqual(this.autocompleteTitle, travelInfoView.autocompleteTitle) && Intrinsics.areEqual(this.passportTitle, travelInfoView.passportTitle) && Intrinsics.areEqual(this.issuingCountryTitle, travelInfoView.issuingCountryTitle) && Intrinsics.areEqual(this.issuingCountry, travelInfoView.issuingCountry) && Intrinsics.areEqual(this.expirationDateTitle, travelInfoView.expirationDateTitle) && Intrinsics.areEqual(this.expirationDate, travelInfoView.expirationDate) && Intrinsics.areEqual(this.otherDocsTitle, travelInfoView.otherDocsTitle) && Intrinsics.areEqual(this.knowTravelerTitle, travelInfoView.knowTravelerTitle) && Intrinsics.areEqual(this.knowTraveler, travelInfoView.knowTraveler) && Intrinsics.areEqual(this.redressNumberTitle, travelInfoView.redressNumberTitle) && Intrinsics.areEqual(this.redressNumber, travelInfoView.redressNumber) && Intrinsics.areEqual(this.saveCompanionProfileTitle, travelInfoView.saveCompanionProfileTitle) && Intrinsics.areEqual(this.isSaveCompanionProfile, travelInfoView.isSaveCompanionProfile) && Intrinsics.areEqual(this.destinationInfoTitle, travelInfoView.destinationInfoTitle) && Intrinsics.areEqual(this.usedSameInfoPassengerOneTitle, travelInfoView.usedSameInfoPassengerOneTitle) && Intrinsics.areEqual(this.isUsedSameInfoPassengerOne, travelInfoView.isUsedSameInfoPassengerOne) && Intrinsics.areEqual(this.addressTitle, travelInfoView.addressTitle) && Intrinsics.areEqual(this.address, travelInfoView.address) && Intrinsics.areEqual(this.postalCodeTitle, travelInfoView.postalCodeTitle) && Intrinsics.areEqual(this.postalCode, travelInfoView.postalCode) && Intrinsics.areEqual(this.selectPolityTitle, travelInfoView.selectPolityTitle) && Intrinsics.areEqual(this.polities, travelInfoView.polities) && Intrinsics.areEqual(this.cityTitle, travelInfoView.cityTitle) && Intrinsics.areEqual(this.city, travelInfoView.city) && Intrinsics.areEqual(this.emergencyContactTitle, travelInfoView.emergencyContactTitle) && Intrinsics.areEqual(this.emergencyContact, travelInfoView.emergencyContact) && Intrinsics.areEqual(this.emUsedSamePassengerInfoTitle, travelInfoView.emUsedSamePassengerInfoTitle) && Intrinsics.areEqual(this.isEmUsedSamePassengerInfo, travelInfoView.isEmUsedSamePassengerInfo) && Intrinsics.areEqual(this.emergencyContactFullNameTitle, travelInfoView.emergencyContactFullNameTitle) && Intrinsics.areEqual(this.emergencyContactFullName, travelInfoView.emergencyContactFullName) && Intrinsics.areEqual(this.emergencyContactEmailTitle, travelInfoView.emergencyContactEmailTitle) && Intrinsics.areEqual(this.emergencyContactEmail, travelInfoView.emergencyContactEmail) && Intrinsics.areEqual(this.emergencyContactTypePhoneTitle, travelInfoView.emergencyContactTypePhoneTitle) && Intrinsics.areEqual(this.emergencyContactTypesPhone, travelInfoView.emergencyContactTypesPhone) && Intrinsics.areEqual(this.countryCodes, travelInfoView.countryCodes) && Intrinsics.areEqual(this.emergencyContactPhone, travelInfoView.emergencyContactPhone);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getAddressTitle() {
        return this.addressTitle;
    }

    public final String getAutocompleteTitle() {
        return this.autocompleteTitle;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCityTitle() {
        return this.cityTitle;
    }

    public final List<String> getCountryCodes() {
        return this.countryCodes;
    }

    public final String getDestinationInfoTitle() {
        return this.destinationInfoTitle;
    }

    public final String getEmUsedSamePassengerInfoTitle() {
        return this.emUsedSamePassengerInfoTitle;
    }

    public final String getEmergencyContact() {
        return this.emergencyContact;
    }

    public final String getEmergencyContactEmail() {
        return this.emergencyContactEmail;
    }

    public final String getEmergencyContactEmailTitle() {
        return this.emergencyContactEmailTitle;
    }

    public final String getEmergencyContactFullName() {
        return this.emergencyContactFullName;
    }

    public final String getEmergencyContactFullNameTitle() {
        return this.emergencyContactFullNameTitle;
    }

    public final String getEmergencyContactPhone() {
        return this.emergencyContactPhone;
    }

    public final String getEmergencyContactTitle() {
        return this.emergencyContactTitle;
    }

    public final String getEmergencyContactTypePhoneTitle() {
        return this.emergencyContactTypePhoneTitle;
    }

    public final List<String> getEmergencyContactTypesPhone() {
        return this.emergencyContactTypesPhone;
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final String getExpirationDateTitle() {
        return this.expirationDateTitle;
    }

    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    public final String getIssuingCountryTitle() {
        return this.issuingCountryTitle;
    }

    public final String getKnowTraveler() {
        return this.knowTraveler;
    }

    public final String getKnowTravelerTitle() {
        return this.knowTravelerTitle;
    }

    public final String getMissingDataTitle() {
        return this.missingDataTitle;
    }

    public final String getOtherDocsTitle() {
        return this.otherDocsTitle;
    }

    public final String getPassportTitle() {
        return this.passportTitle;
    }

    public final List<String> getPolities() {
        return this.polities;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getPostalCodeTitle() {
        return this.postalCodeTitle;
    }

    public final String getRedressNumber() {
        return this.redressNumber;
    }

    public final String getRedressNumberTitle() {
        return this.redressNumberTitle;
    }

    public final String getSaveCompanionProfileTitle() {
        return this.saveCompanionProfileTitle;
    }

    public final String getSelectPolityTitle() {
        return this.selectPolityTitle;
    }

    public final String getTravelDocTitle() {
        return this.travelDocTitle;
    }

    public final String getUsedSameInfoPassengerOneTitle() {
        return this.usedSameInfoPassengerOneTitle;
    }

    public int hashCode() {
        String str = this.missingDataTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.travelDocTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.autocompleteTitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.passportTitle;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.issuingCountryTitle;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.issuingCountry;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.expirationDateTitle;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.expirationDate;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.otherDocsTitle;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.knowTravelerTitle;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.knowTraveler;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.redressNumberTitle;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.redressNumber;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.saveCompanionProfileTitle;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool = this.isSaveCompanionProfile;
        int hashCode15 = (hashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str15 = this.destinationInfoTitle;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.usedSameInfoPassengerOneTitle;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool2 = this.isUsedSameInfoPassengerOne;
        int hashCode18 = (hashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str17 = this.addressTitle;
        int hashCode19 = (hashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.address;
        int hashCode20 = (hashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.postalCodeTitle;
        int hashCode21 = (hashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.postalCode;
        int hashCode22 = (hashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.selectPolityTitle;
        int hashCode23 = (hashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        List<String> list = this.polities;
        int hashCode24 = (hashCode23 + (list == null ? 0 : list.hashCode())) * 31;
        String str22 = this.cityTitle;
        int hashCode25 = (hashCode24 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.city;
        int hashCode26 = (hashCode25 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.emergencyContactTitle;
        int hashCode27 = (hashCode26 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.emergencyContact;
        int hashCode28 = (hashCode27 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.emUsedSamePassengerInfoTitle;
        int hashCode29 = (hashCode28 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Boolean bool3 = this.isEmUsedSamePassengerInfo;
        int hashCode30 = (hashCode29 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str27 = this.emergencyContactFullNameTitle;
        int hashCode31 = (hashCode30 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.emergencyContactFullName;
        int hashCode32 = (hashCode31 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.emergencyContactEmailTitle;
        int hashCode33 = (hashCode32 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.emergencyContactEmail;
        int hashCode34 = (hashCode33 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.emergencyContactTypePhoneTitle;
        int hashCode35 = (hashCode34 + (str31 == null ? 0 : str31.hashCode())) * 31;
        List<String> list2 = this.emergencyContactTypesPhone;
        int hashCode36 = (hashCode35 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.countryCodes;
        int hashCode37 = (hashCode36 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str32 = this.emergencyContactPhone;
        return hashCode37 + (str32 != null ? str32.hashCode() : 0);
    }

    public final Boolean isEmUsedSamePassengerInfo() {
        return this.isEmUsedSamePassengerInfo;
    }

    public final Boolean isSaveCompanionProfile() {
        return this.isSaveCompanionProfile;
    }

    public final Boolean isUsedSameInfoPassengerOne() {
        return this.isUsedSameInfoPassengerOne;
    }

    public String toString() {
        return "TravelInfoView(missingDataTitle=" + this.missingDataTitle + ", travelDocTitle=" + this.travelDocTitle + ", autocompleteTitle=" + this.autocompleteTitle + ", passportTitle=" + this.passportTitle + ", issuingCountryTitle=" + this.issuingCountryTitle + ", issuingCountry=" + this.issuingCountry + ", expirationDateTitle=" + this.expirationDateTitle + ", expirationDate=" + this.expirationDate + ", otherDocsTitle=" + this.otherDocsTitle + ", knowTravelerTitle=" + this.knowTravelerTitle + ", knowTraveler=" + this.knowTraveler + ", redressNumberTitle=" + this.redressNumberTitle + ", redressNumber=" + this.redressNumber + ", saveCompanionProfileTitle=" + this.saveCompanionProfileTitle + ", isSaveCompanionProfile=" + this.isSaveCompanionProfile + ", destinationInfoTitle=" + this.destinationInfoTitle + ", usedSameInfoPassengerOneTitle=" + this.usedSameInfoPassengerOneTitle + ", isUsedSameInfoPassengerOne=" + this.isUsedSameInfoPassengerOne + ", addressTitle=" + this.addressTitle + ", address=" + this.address + ", postalCodeTitle=" + this.postalCodeTitle + ", postalCode=" + this.postalCode + ", selectPolityTitle=" + this.selectPolityTitle + ", polities=" + this.polities + ", cityTitle=" + this.cityTitle + ", city=" + this.city + ", emergencyContactTitle=" + this.emergencyContactTitle + ", emergencyContact=" + this.emergencyContact + ", emUsedSamePassengerInfoTitle=" + this.emUsedSamePassengerInfoTitle + ", isEmUsedSamePassengerInfo=" + this.isEmUsedSamePassengerInfo + ", emergencyContactFullNameTitle=" + this.emergencyContactFullNameTitle + ", emergencyContactFullName=" + this.emergencyContactFullName + ", emergencyContactEmailTitle=" + this.emergencyContactEmailTitle + ", emergencyContactEmail=" + this.emergencyContactEmail + ", emergencyContactTypePhoneTitle=" + this.emergencyContactTypePhoneTitle + ", emergencyContactTypesPhone=" + this.emergencyContactTypesPhone + ", countryCodes=" + this.countryCodes + ", emergencyContactPhone=" + this.emergencyContactPhone + ")";
    }
}
