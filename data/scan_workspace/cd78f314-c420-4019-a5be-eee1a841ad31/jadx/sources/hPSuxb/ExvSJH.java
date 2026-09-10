package hPSuxb;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class ExvSJH {
    static String HKtcdI = null;
    static String HWaFjr = null;
    private static final char IGnJtR = '\\';
    public static char[] WnF = null;
    static String WuXspU = null;
    private static final char tdBbWZ = '.';

    static {
        tsZ(false);
    }

    private static char IQzGWV(char c) {
        if (c == '\\') {
            return tdBbWZ;
        }
        if (c == '.') {
            return '\\';
        }
        return c;
    }

    static String atos(float[] fArr) {
        if (fArr == null) {
            return HKtcdI;
        }
        if (fArr.length == 0) {
            return WuXspU;
        }
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            sb.append(String.format(HWaFjr, Float.valueOf(fArr[i])));
        }
        sb.append(")");
        return sb.toString();
    }

    public static float[] deQuantize(String str, float f, float f2, int i, int i2) {
        int length = str.length();
        float[] fArr = new float[length];
        float f3 = (f2 - f) / i;
        for (int i3 = 0; i3 < length; i3++) {
            fArr[i3] = (((IQzGWV(str.charAt(i3)) - i2) + 0.5f) * f3) + f;
        }
        return fArr;
    }

    public static boolean isPowerOfTwo(long j) {
        return j >= 0 && (j & (j - 1)) == 0;
    }

    public static long prevPowerOfTwo(long j) {
        if (j == 0) {
            return 0L;
        }
        long j2 = j | (j >>> 1);
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        return j6 - (j6 >>> 1);
    }

    public static String quantize(float[] fArr, float f, float f2, int i, int i2) {
        int length = fArr.length;
        StringBuilder sb = new StringBuilder();
        float f3 = (f2 - f) / i;
        for (int i3 = 0; i3 < length; i3++) {
            char floor = (char) (((int) Math.floor((fArr[i3] - f) / f3)) + i2);
            if (fArr[i3] == f2) {
                floor = (char) (i + i2);
            }
            sb.append(IQzGWV(floor));
        }
        return sb.toString();
    }

    /* JADX WARN: Incorrect return type in method signature: ()V */
    public static /* synthetic */ String rhj(String str) {
        if (WnF == null) {
            WnF = new char[32767];
            int i = 3;
            for (int i2 = 0; i2 < 32767; i2++) {
                i = ((i + (i ^ i2)) + 81) % 63;
                WnF[i2] = (char) i;
            }
        }
        char[] cArr = new char[str.length()];
        char[] charArray = str.toCharArray();
        for (int i3 = 0; i3 < str.length(); i3++) {
            cArr[i3] = (char) (cArr[i3] + ((char) (charArray[i3] ^ WnF[i3])));
        }
        return new String(cArr);
    }

    public static float shrinkCoef(float[] fArr, float f) {
        int length = fArr.length;
        Float[] fArr2 = new Float[length];
        for (int i = 0; i < length; i++) {
            fArr2[i] = Float.valueOf(Math.abs(fArr[i]));
        }
        Arrays.sort(fArr2);
        float floatValue = fArr2[(int) Math.floor((length - 1) * f)].floatValue();
        for (int i2 = 0; i2 < length; i2++) {
            if (Math.abs(fArr[i2]) < floatValue) {
                fArr[i2] = 0.0f;
            }
        }
        return floatValue;
    }

    public static long toPrevPowerOfTwo(long j) {
        return isPowerOfTwo(j) ? j : prevPowerOfTwo(j);
    }

    public static /* synthetic */ void tsZ(boolean z) {
        if (z) {
            tsZ(false);
        }
        WuXspU = rhj("0aq~^U\u0000");
        HWaFjr = rhj("=*.h");
        HKtcdI = rhj("0jibF\u0005");
    }
}
