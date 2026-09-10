package com.lexisnexisrisk.threatmetrix.rl;

import android.content.Context;
import com.airbnb.paris.R2;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public class NativeGathererHelper {
    public static int TGv = 5973;
    public static int czx = 7135;

    public boolean bIYQgQ(String str, boolean z, boolean z2) throws UnsatisfiedLinkError, Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        System.loadLibrary(str);
        int i5 = TGv;
        if (i5 > 5972) {
            if ((czx ^ 7135) == 0) {
                return init(93, z, z2);
            }
            if (i5 <= 5972) {
                while (true) {
                    i2 = TGv;
                    int i6 = i2 + 26;
                    if (i6 == 27) {
                        TGv = (i2 * 27) ^ 4190;
                    } else if (i6 == 168) {
                        break;
                    }
                }
                TGv = (i2 % 89) % 7;
            }
            do {
                int i7 = czx;
                i = i7 + 13;
                if (i != 32) {
                    if (i == 63) {
                        czx = ((i7 >> 123) + i7) * 105;
                        if ((TGv ^ 5973) != 0) {
                            while (true) {
                                int i8 = TGv;
                                int i9 = i8 + 39;
                                if (i9 == 86) {
                                    TGv = (i8 % 41) >> 44;
                                    break;
                                }
                                if (i9 == 282) {
                                    while (true) {
                                        TGv = (TGv ^ R2.styleable.AppCompatTheme_textAppearancePopupMenuHeader) * 92;
                                    }
                                } else if (i9 == 312) {
                                    TGv = ((i8 >> 123) + i8) ^ 3325;
                                }
                            }
                        }
                    }
                }
                czx = ((czx * 117) ^ 5140) % 120;
                break;
            } while (i != 256);
            do {
                czx = ((czx % 116) >> 69) ^ 3229;
            } while (TGv > 5972);
            while (true) {
                int i10 = TGv;
                int i11 = i10 + 65;
                if (i11 == 64) {
                    TGv = (i10 + i10) % 67;
                } else if (i11 == 253) {
                    TGv = (i10 + i10 + i10) * 87;
                } else if (i11 != 362) {
                }
                TGv = (TGv * 72) ^ R2.styleable.MenuItem_tooltipText;
            }
        }
        do {
            i3 = TGv;
            i4 = i3 + 91;
            if (i4 == 3) {
                while (true) {
                    TGv = ((TGv >> 52) ^ R2.style.Widget_AppCompat_Button_Colored) * 121;
                }
            }
        } while (i4 != 129);
        while (true) {
            TGv = (TGv * 36) + i3;
        }
    }

    public native int cancel();

    @Nullable
    public native String[] checkURLs(String[] strArr);

    protected void finalize() throws Throwable {
        super.finalize();
        finit();
    }

    public native void finit();

    public native Object getAddresses(Class cls);

    public native long getAppTime(String str, boolean z);

    @Nullable
    public native String getBinaryArch();

    @Nullable
    public native String getConnections(Context context);

    public native int getCpuCores();

    @Nullable
    public native String[] getFontList(String str);

    @Nullable
    public native String[] getNetworkInfo();

    @Nullable
    public native String getRandomString(int i);

    @Nullable
    public native int getSelinuxMode();

    public native long getTamperCode(int i);

    public native String getTextSectionHash(String str);

    @Nullable
    public native String hashFile(String str, int i);

    native boolean init(int i, boolean z, boolean z2);

    public native int jniDetectedDebugStatus(String str);

    @Nullable
    public native String md5(String str);

    public native void setInfoLogging(int i);

    public native String sha1Base32Encode(byte[] bArr);

    @Nullable
    public native String sha1HexEncode(byte[] bArr);

    @Nullable
    public native String sha256HexEncode(byte[] bArr);

    @Nullable
    public native String urlEncode(String str);

    public native String validatePackage(String str);

    public native int waitUntilCancelled();

    @Nullable
    public native String xor(String str, String str2);
}
