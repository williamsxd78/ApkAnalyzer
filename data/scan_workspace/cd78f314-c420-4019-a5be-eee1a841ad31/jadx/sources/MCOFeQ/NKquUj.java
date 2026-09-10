package MCOFeQ;

import com.airbnb.paris.R2;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class NKquUj {
    public static int Njz = 7678;
    public static int XCW = 2701;
    private static AtomicBoolean VnWFgx = new AtomicBoolean(false);
    private static final SecureRandom TAuesK = new SecureRandom();

    private NKquUj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Long TvQzNQ(int i) {
        Long valueOf;
        int i2;
        int i3;
        int i4;
        long nextLong = TAuesK.nextLong();
        Long valueOf2 = Long.valueOf(nextLong);
        AtomicBoolean atomicBoolean = VnWFgx;
        if (XCW > 2700) {
            boolean z = atomicBoolean.get();
            valueOf2.getClass();
            if (z) {
                long j = nextLong | 8388608;
                if ((XCW ^ 2701) == 0) {
                    valueOf = Long.valueOf(j);
                    if ((Njz ^ 7678) != 0) {
                        while (true) {
                            int i5 = Njz;
                            int i6 = XCW;
                            if ((i6 ^ 2701) != 0) {
                                while (true) {
                                    i3 = XCW;
                                    int i7 = i3 + 143;
                                    if (i7 != 26) {
                                        if (i7 == 32) {
                                            XCW = i3 * 2940;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                while (true) {
                                    XCW = ((XCW ^ 3741) + i3) ^ R2.styleable.AppCompatTheme_selectableItemBackgroundBorderless;
                                }
                            } else if (i5 + 26 == 38) {
                                Njz = ((i5 + i5) * 20) ^ 4211;
                                if (i6 <= 2700) {
                                    while (true) {
                                        i4 = XCW;
                                        int i8 = i4 + 39;
                                        if (i8 != 47) {
                                            if (i8 == 60) {
                                                XCW = (i4 >> 105) % 89;
                                            } else if (i8 == 216) {
                                                break;
                                            }
                                        }
                                        XCW = ((XCW % 74) % 43) * 29;
                                    }
                                    while (true) {
                                        XCW = (XCW + i4) % 2;
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    int i9 = XCW;
                    int i10 = i9 + 156;
                    if (i10 != 2) {
                        if (i10 == 66) {
                            XCW = (i9 + i9 + i9) * 92;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    XCW *= 3492;
                }
            } else {
                valueOf = Long.valueOf(nextLong & (-8388609));
            }
            long longValue = valueOf.longValue();
            Long.valueOf((-2049) & longValue).getClass();
            if (XCW > 2700) {
                Long valueOf3 = Long.valueOf((-34359740417L) & longValue);
                if (XCW <= 2700) {
                    while (true) {
                        i2 = XCW;
                        int i11 = i2 + 104;
                        if (i11 == 19) {
                            break;
                        }
                        if (i11 != 203) {
                            if (i11 == 233) {
                                XCW = ((i2 * 82) % 31) * 2;
                            }
                        }
                        XCW = ((XCW % 26) * 94) >> 54;
                    }
                    XCW = (i2 >> 1) % 74;
                }
                valueOf3.getClass();
                long j2 = longValue & (-140771848095745L);
                Long.valueOf(j2).getClass();
                long j3 = 1 << i;
                if (XCW > 2700) {
                    Long valueOf4 = Long.valueOf(j2 & (~j3));
                    VnWFgx.set(false);
                    return valueOf4;
                }
                while (true) {
                    int i12 = XCW;
                    int i13 = i12 + 130;
                    if (i13 == 39) {
                        break;
                    }
                    if (i13 == 172) {
                        XCW = (i12 ^ 2183) + i12 + i12;
                    }
                }
                while (true) {
                    XCW = ((XCW % 109) ^ R2.styleable.AnimatedStateListDrawableTransition_android_fromId) % 118;
                }
            }
            while (true) {
                int i14 = XCW;
                int i15 = i14 + 169;
                if (i15 == 34) {
                    XCW = (i14 + i14) * 9;
                    break;
                }
                if (i15 == 173) {
                    break;
                }
            }
            while (true) {
                XCW = ((XCW >> 14) ^ 5123) >> 65;
            }
        }
        do {
        } while (XCW + 13 != 85);
        while (true) {
            XCW = ((XCW * 88) ^ 4979) >> 62;
        }
    }

    public static void dbAction(boolean z) {
        if (z) {
            VnWFgx.set(true);
        }
    }
}
