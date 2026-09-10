package com.quantummetric.instrument.internal;

import com.vivaaerobus.app.analytics.presentation.AnalyticsConstants;
import com.vivaaerobus.app.extension.Date_ExtensionKt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class iv {
    private static final ThreadLocal<SimpleDateFormat[]> a = new ThreadLocal<SimpleDateFormat[]>() { // from class: com.quantummetric.instrument.internal.iv.1
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ SimpleDateFormat[] initialValue() {
            ArrayList arrayList = new ArrayList();
            iv.a(arrayList, "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", false);
            iv.a(arrayList, "yyyy-MM-dd'T'HH:mm:ssXXX", false);
            iv.a(arrayList, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", true);
            iv.a(arrayList, Date_ExtensionKt.COMMON_DATE_PATTERN_ISO8601_UTC_WITH_Z, true);
            iv.a(arrayList, "yyyy-MM-dd'T'HH:mm:ss", true);
            iv.a(arrayList, Date_ExtensionKt.COMMON_DATE_PATTERN_ISO8601_SHORT, true);
            iv.a(arrayList, Date_ExtensionKt.COMMON_DATE_US_PATTERN_DATE, true);
            iv.a(arrayList, "M/d/yyyy", true);
            iv.a(arrayList, Date_ExtensionKt.COMMON_DATE_PATTERN_DATE, true);
            iv.a(arrayList, "d/M/yyyy", true);
            iv.a(arrayList, Date_ExtensionKt.COMMON_DATE_PATTERN_USA_SHORT_DATE_WITH_COMMA, true);
            return (SimpleDateFormat[]) arrayList.toArray(new SimpleDateFormat[0]);
        }
    };

    /* renamed from: com.quantummetric.instrument.internal.iv$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[iw.values().length];
            a = iArr;
            try {
                iArr[iw.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[iw.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[iw.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[iw.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[iw.DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[iw.DATETIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static Object a(Object obj, iw iwVar) {
        Date a2;
        SimpleDateFormat simpleDateFormat;
        TimeZone timeZone;
        try {
            switch (AnonymousClass2.a[iwVar.ordinal()]) {
                case 1:
                    return Double.valueOf(Double.parseDouble(obj.toString()));
                case 2:
                    return Long.valueOf(Long.parseLong(obj.toString()));
                case 3:
                    return String.valueOf(obj);
                case 4:
                    boolean z = false;
                    if (obj != null && obj != JSONObject.NULL) {
                        if (obj instanceof Boolean) {
                            z = ((Boolean) obj).booleanValue();
                        } else if (obj instanceof Number) {
                            if (((Number) obj).doubleValue() == 0.0d) {
                            }
                            z = true;
                        } else {
                            if (obj instanceof String) {
                                String str = (String) obj;
                                if (!AnalyticsConstants.TRUE_VALUE.equalsIgnoreCase(str)) {
                                    if (!AnalyticsConstants.FALSE_VALUE.equalsIgnoreCase(str)) {
                                        if (!"1".equals(str)) {
                                            if (!"0".equals(str)) {
                                                if (str.isEmpty()) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                    return Boolean.valueOf(z);
                case 5:
                    a2 = a(obj);
                    simpleDateFormat = new SimpleDateFormat(Date_ExtensionKt.COMMON_DATE_PATTERN_ISO8601_SHORT, Locale.US);
                    timeZone = TimeZone.getTimeZone(Date_ExtensionKt.DEFAULT_TIME_ZONE);
                    break;
                case 6:
                    a2 = a(obj);
                    simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                    timeZone = TimeZone.getTimeZone(Date_ExtensionKt.DEFAULT_TIME_ZONE);
                    break;
                default:
                    return null;
            }
            simpleDateFormat.setTimeZone(timeZone);
            return simpleDateFormat.format(a2);
        } catch (NullPointerException | NumberFormatException | ParseException unused) {
            return null;
        }
    }

    private static Date a(Object obj) throws ParseException {
        SimpleDateFormat[] simpleDateFormatArr;
        if (obj instanceof Number) {
            return new Date(((Number) obj).longValue());
        }
        if ((obj instanceof String) && (simpleDateFormatArr = a.get()) != null) {
            for (SimpleDateFormat simpleDateFormat : simpleDateFormatArr) {
                try {
                    return simpleDateFormat.parse((String) obj);
                } catch (ParseException unused) {
                }
            }
        }
        throw new ParseException("Unable to create date from ".concat(String.valueOf(obj)), 0);
    }

    static /* synthetic */ void a(List list, String str, boolean z) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
            simpleDateFormat.setLenient(false);
            if (z) {
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Date_ExtensionKt.DEFAULT_TIME_ZONE));
            }
            list.add(simpleDateFormat);
        } catch (IllegalArgumentException unused) {
        }
    }
}
