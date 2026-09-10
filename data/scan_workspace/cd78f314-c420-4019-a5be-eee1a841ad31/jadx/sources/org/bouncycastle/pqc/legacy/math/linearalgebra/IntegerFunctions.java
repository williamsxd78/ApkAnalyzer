package org.bouncycastle.pqc.legacy.math.linearalgebra;

import com.airbnb.paris.R2;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes10.dex */
public final class IntegerFunctions {
    private static final long SMALL_PRIME_PRODUCT = 152125131763605L;
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private static final BigInteger FOUR = BigInteger.valueOf(4);
    private static final int[] SMALL_PRIMES = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};
    private static SecureRandom sr = null;
    private static final int[] jacobiTable = {0, 1, 0, -1, 0, -1, 0, 1};

    private IntegerFunctions() {
    }

    public static BigInteger binomial(int i, int i2) {
        BigInteger bigInteger = ONE;
        if (i == 0) {
            return i2 == 0 ? bigInteger : ZERO;
        }
        if (i2 > (i >>> 1)) {
            i2 = i - i2;
        }
        for (int i3 = 1; i3 <= i2; i3++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i - (i3 - 1))).divide(BigInteger.valueOf(i3));
        }
        return bigInteger;
    }

    public static int bitCount(int i) {
        int i2 = 0;
        while (i != 0) {
            i2 += i & 1;
            i >>>= 1;
        }
        return i2;
    }

    public static int ceilLog(int i) {
        int i2 = 0;
        int i3 = 1;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    public static int ceilLog(BigInteger bigInteger) {
        int i = 0;
        for (BigInteger bigInteger2 = ONE; bigInteger2.compareTo(bigInteger) < 0; bigInteger2 = bigInteger2.shiftLeft(1)) {
            i++;
        }
        return i;
    }

    public static int ceilLog256(int i) {
        if (i == 0) {
            return 1;
        }
        if (i < 0) {
            i = -i;
        }
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 8;
        }
        return i2;
    }

    public static int ceilLog256(long j) {
        if (j == 0) {
            return 1;
        }
        if (j < 0) {
            j = -j;
        }
        int i = 0;
        while (j > 0) {
            i++;
            j >>>= 8;
        }
        return i;
    }

    public static BigInteger divideAndRound(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.signum() < 0 ? divideAndRound(bigInteger.negate(), bigInteger2).negate() : bigInteger2.signum() < 0 ? divideAndRound(bigInteger, bigInteger2.negate()).negate() : bigInteger.shiftLeft(1).add(bigInteger2).divide(bigInteger2.shiftLeft(1));
    }

    public static BigInteger[] divideAndRound(BigInteger[] bigIntegerArr, BigInteger bigInteger) {
        BigInteger[] bigIntegerArr2 = new BigInteger[bigIntegerArr.length];
        for (int i = 0; i < bigIntegerArr.length; i++) {
            bigIntegerArr2[i] = divideAndRound(bigIntegerArr[i], bigInteger);
        }
        return bigIntegerArr2;
    }

    public static int[] extGCD(int i, int i2) {
        BigInteger[] extgcd = extgcd(BigInteger.valueOf(i), BigInteger.valueOf(i2));
        return new int[]{extgcd[0].intValue(), extgcd[1].intValue(), extgcd[2].intValue()};
    }

    public static BigInteger[] extgcd(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = ONE;
        BigInteger bigInteger4 = ZERO;
        if (bigInteger2.signum() != 0) {
            BigInteger bigInteger5 = bigInteger;
            BigInteger bigInteger6 = bigInteger2;
            while (bigInteger6.signum() != 0) {
                BigInteger[] divideAndRemainder = bigInteger5.divideAndRemainder(bigInteger6);
                BigInteger bigInteger7 = divideAndRemainder[0];
                BigInteger bigInteger8 = divideAndRemainder[1];
                BigInteger bigInteger9 = bigInteger4;
                bigInteger4 = bigInteger3.subtract(bigInteger7.multiply(bigInteger4));
                bigInteger3 = bigInteger9;
                bigInteger5 = bigInteger6;
                bigInteger6 = bigInteger8;
            }
            bigInteger4 = bigInteger5.subtract(bigInteger.multiply(bigInteger3)).divide(bigInteger2);
            bigInteger = bigInteger5;
        }
        return new BigInteger[]{bigInteger, bigInteger3, bigInteger4};
    }

    public static float floatPow(float f, int i) {
        float f2 = 1.0f;
        while (i > 0) {
            f2 *= f;
            i--;
        }
        return f2;
    }

    public static int floorLog(int i) {
        if (i <= 0) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = i >>> 1; i3 > 0; i3 >>>= 1) {
            i2++;
        }
        return i2;
    }

    public static int floorLog(BigInteger bigInteger) {
        int i = -1;
        for (BigInteger bigInteger2 = ONE; bigInteger2.compareTo(bigInteger) <= 0; bigInteger2 = bigInteger2.shiftLeft(1)) {
            i++;
        }
        return i;
    }

    public static int gcd(int i, int i2) {
        return BigInteger.valueOf(i).gcd(BigInteger.valueOf(i2)).intValue();
    }

    public static float intRoot(int i, int i2) {
        float floatPow;
        float f = i / i2;
        float f2 = 0.0f;
        while (Math.abs(f2 - f) > 1.0E-4d) {
            while (true) {
                floatPow = floatPow(f, i2);
                if (Float.isInfinite(floatPow)) {
                    f = (f + f2) / 2.0f;
                }
            }
            f2 = f;
            f -= (floatPow - i) / (i2 * floatPow(f, i2 - 1));
        }
        return f;
    }

    public static byte[] integerToOctets(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.abs().toByteArray();
        if ((bigInteger.bitLength() & 7) != 0) {
            return byteArray;
        }
        int bitLength = bigInteger.bitLength() >> 3;
        byte[] bArr = new byte[bitLength];
        System.arraycopy(byteArray, 1, bArr, 0, bitLength);
        return bArr;
    }

    public static boolean isIncreasing(int[] iArr) {
        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i - 1] >= iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static int isPower(int i, int i2) {
        if (i <= 0) {
            return -1;
        }
        int i3 = 0;
        while (i > 1) {
            if (i % i2 != 0) {
                return -1;
            }
            i /= i2;
            i3++;
        }
        return i3;
    }

    public static boolean isPrime(int i) {
        if (i < 2) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if ((i & 1) == 0) {
            return false;
        }
        if (i < 42) {
            int i2 = 0;
            while (true) {
                int[] iArr = SMALL_PRIMES;
                if (i2 >= iArr.length) {
                    break;
                }
                if (i == iArr[i2]) {
                    return true;
                }
                i2++;
            }
        }
        if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0 || i % 11 == 0 || i % 13 == 0 || i % 17 == 0 || i % 19 == 0 || i % 23 == 0 || i % 29 == 0 || i % 31 == 0 || i % 37 == 0 || i % 41 == 0) {
            return false;
        }
        return BigInteger.valueOf(i).isProbablePrime(20);
    }

    public static int jacobi(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = ZERO;
        if (bigInteger2.equals(bigInteger3)) {
            return bigInteger.abs().equals(ONE) ? 1 : 0;
        }
        if (!bigInteger.testBit(0) && !bigInteger2.testBit(0)) {
            return 0;
        }
        long j = 1;
        if (bigInteger2.signum() == -1) {
            bigInteger2 = bigInteger2.negate();
            if (bigInteger.signum() == -1) {
                j = -1;
            }
        }
        while (!bigInteger2.testBit(0)) {
            bigInteger3 = bigInteger3.add(ONE);
            bigInteger2 = bigInteger2.divide(TWO);
        }
        if (bigInteger3.testBit(0)) {
            j *= jacobiTable[bigInteger.intValue() & 7];
        }
        if (bigInteger.signum() < 0) {
            if (bigInteger2.testBit(1)) {
                j = -j;
            }
            bigInteger = bigInteger.negate();
        }
        while (bigInteger.signum() != 0) {
            BigInteger bigInteger4 = ZERO;
            while (!bigInteger.testBit(0)) {
                bigInteger4 = bigInteger4.add(ONE);
                bigInteger = bigInteger.divide(TWO);
            }
            if (bigInteger4.testBit(0)) {
                j *= jacobiTable[bigInteger2.intValue() & 7];
            }
            if (bigInteger.compareTo(bigInteger2) >= 0) {
                BigInteger bigInteger5 = bigInteger2;
                bigInteger2 = bigInteger;
                bigInteger = bigInteger5;
            } else if (bigInteger2.testBit(1) && bigInteger.testBit(1)) {
                j = -j;
            }
            BigInteger subtract = bigInteger2.subtract(bigInteger);
            bigInteger2 = bigInteger;
            bigInteger = subtract;
        }
        if (bigInteger2.equals(ONE)) {
            return (int) j;
        }
        return 0;
    }

    public static BigInteger leastCommonMultiple(BigInteger[] bigIntegerArr) {
        int length = bigIntegerArr.length;
        BigInteger bigInteger = bigIntegerArr[0];
        for (int i = 1; i < length; i++) {
            bigInteger = bigInteger.multiply(bigIntegerArr[i]).divide(bigInteger.gcd(bigIntegerArr[i]));
        }
        return bigInteger;
    }

    public static int leastDiv(int i) {
        if (i < 0) {
            i = -i;
        }
        if (i == 0) {
            return 1;
        }
        if ((i & 1) == 0) {
            return 2;
        }
        for (int i2 = 3; i2 <= i / i2; i2 += 2) {
            if (i % i2 == 0) {
                return i2;
            }
        }
        return i;
    }

    public static double log(double d) {
        double d2 = 1.0d;
        if (d > 0.0d && d < 1.0d) {
            return -log(1.0d / d);
        }
        int i = 0;
        double d3 = d;
        while (d3 > 2.0d) {
            d3 /= 2.0d;
            i++;
            d2 *= 2.0d;
        }
        return i + logBKM(d / d2);
    }

    public static double log(long j) {
        return floorLog(BigInteger.valueOf(j)) + logBKM(j / (1 << r0));
    }

    private static double logBKM(double d) {
        double[] dArr = {1.0d, 0.5849625007211562d, 0.32192809488736235d, 0.16992500144231237d, 0.0874628412503394d, 0.044394119358453436d, 0.02236781302845451d, 0.01122725542325412d, 0.005624549193878107d, 0.0028150156070540383d, 0.0014081943928083889d, 7.042690112466433E-4d, 3.5217748030102726E-4d, 1.7609948644250602E-4d, 8.80524301221769E-5d, 4.4026886827316716E-5d, 2.2013611360340496E-5d, 1.1006847667481442E-5d, 5.503434330648604E-6d, 2.751719789561283E-6d, 1.375860550841138E-6d, 6.879304394358497E-7d, 3.4396526072176454E-7d, 1.7198264061184464E-7d, 8.599132286866321E-8d, 4.299566207501687E-8d, 2.1497831197679756E-8d, 1.0748915638882709E-8d, 5.374457829452062E-9d, 2.687228917228708E-9d, 1.3436144592400231E-9d, 6.718072297764289E-10d, 3.3590361492731876E-10d, 1.6795180747343547E-10d, 8.397590373916176E-11d, 4.1987951870191886E-11d, 2.0993975935248694E-11d, 1.0496987967662534E-11d, 5.2484939838408146E-12d, 2.624246991922794E-12d, 1.3121234959619935E-12d, 6.56061747981146E-13d, 3.2803087399061026E-13d, 1.6401543699531447E-13d, 8.200771849765956E-14d, 4.1003859248830365E-14d, 2.0501929624415328E-14d, 1.02509648122077E-14d, 5.1254824061038595E-15d, 2.5627412030519317E-15d, 1.2813706015259665E-15d, 6.406853007629834E-16d, 3.203426503814917E-16d, 1.6017132519074588E-16d, 8.008566259537294E-17d, 4.004283129768647E-17d, 2.0021415648843235E-17d, 1.0010707824421618E-17d, 5.005353912210809E-18d, 2.5026769561054044E-18d, 1.2513384780527022E-18d, 6.256692390263511E-19d, 3.1283461951317555E-19d, 1.5641730975658778E-19d, 7.820865487829389E-20d, 3.9104327439146944E-20d, 1.9552163719573472E-20d, 9.776081859786736E-21d, 4.888040929893368E-21d, 2.444020464946684E-21d, 1.222010232473342E-21d, 6.11005116236671E-22d, 3.055025581183355E-22d, 1.5275127905916775E-22d, 7.637563952958387E-23d, 3.818781976479194E-23d, 1.909390988239597E-23d, 9.546954941197984E-24d, 4.773477470598992E-24d, 2.386738735299496E-24d, 1.193369367649748E-24d, 5.96684683824874E-25d, 2.98342341912437E-25d, 1.491711709562185E-25d, 7.458558547810925E-26d, 3.7292792739054626E-26d, 1.8646396369527313E-26d, 9.323198184763657E-27d, 4.661599092381828E-27d, 2.330799546190914E-27d, 1.165399773095457E-27d, 5.826998865477285E-28d, 2.9134994327386427E-28d, 1.4567497163693213E-28d, 7.283748581846607E-29d, 3.6418742909233034E-29d, 1.8209371454616517E-29d, 9.104685727308258E-30d, 4.552342863654129E-30d, 2.2761714318270646E-30d};
        double d2 = 1.0d;
        double d3 = 0.0d;
        double d4 = 1.0d;
        for (int i = 0; i < 53; i++) {
            double d5 = (d2 * d4) + d2;
            if (d5 <= d) {
                d3 += dArr[i];
                d2 = d5;
            }
            d4 *= 0.5d;
        }
        return d3;
    }

    public static int maxPower(int i) {
        int i2 = 0;
        if (i != 0) {
            for (int i3 = 1; (i & i3) == 0; i3 <<= 1) {
                i2++;
            }
        }
        return i2;
    }

    public static long mod(long j, long j2) {
        long j3 = j % j2;
        return j3 < 0 ? j3 + j2 : j3;
    }

    public static int modInverse(int i, int i2) {
        return BigInteger.valueOf(i).modInverse(BigInteger.valueOf(i2)).intValue();
    }

    public static long modInverse(long j, long j2) {
        return BigInteger.valueOf(j).modInverse(BigInteger.valueOf(j2)).longValue();
    }

    public static int modPow(int i, int i2, int i3) {
        if (i3 <= 0 || i3 * i3 > Integer.MAX_VALUE || i2 < 0) {
            return 0;
        }
        int i4 = ((i % i3) + i3) % i3;
        int i5 = 1;
        while (i2 > 0) {
            if ((i2 & 1) == 1) {
                i5 = (i5 * i4) % i3;
            }
            i4 = (i4 * i4) % i3;
            i2 >>>= 1;
        }
        return i5;
    }

    public static BigInteger nextPrime(long j) {
        if (j <= 1) {
            return BigInteger.valueOf(2L);
        }
        if (j == 2) {
            return BigInteger.valueOf(3L);
        }
        boolean z = false;
        long j2 = 0;
        for (long j3 = j + 1 + (j & 1); j3 <= (j << 1) && !z; j3 += 2) {
            for (long j4 = 3; j4 <= (j3 >> 1) && !z; j4 += 2) {
                if (j3 % j4 == 0) {
                    z = true;
                }
            }
            if (!z) {
                j2 = j3;
            }
            z = !z;
        }
        return BigInteger.valueOf(j2);
    }

    public static BigInteger nextProbablePrime(BigInteger bigInteger) {
        return nextProbablePrime(bigInteger, 20);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if ((r0 % 41) != 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.math.BigInteger nextProbablePrime(java.math.BigInteger r6, int r7) {
        /*
            int r0 = r6.signum()
            if (r0 < 0) goto Lb0
            int r0 = r6.signum()
            if (r0 == 0) goto Lb0
            java.math.BigInteger r0 = org.bouncycastle.pqc.legacy.math.linearalgebra.IntegerFunctions.ONE
            boolean r1 = r6.equals(r0)
            if (r1 == 0) goto L16
            goto Lb0
        L16:
            java.math.BigInteger r6 = r6.add(r0)
            r1 = 0
            boolean r1 = r6.testBit(r1)
            if (r1 != 0) goto L25
        L21:
            java.math.BigInteger r6 = r6.add(r0)
        L25:
            int r0 = r6.bitLength()
            r1 = 6
            if (r0 <= r1) goto La1
            r0 = 152125131763605(0x8a5b6470af95, double:7.515980147347E-310)
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.math.BigInteger r0 = r6.remainder(r0)
            long r0 = r0.longValue()
            r2 = 3
            long r2 = r0 % r2
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L9e
            r2 = 5
            long r2 = r0 % r2
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L9e
            r2 = 7
            long r2 = r0 % r2
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L9e
            r2 = 11
            long r2 = r0 % r2
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L9e
            r2 = 13
            long r2 = r0 % r2
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L9e
            r2 = 17
            long r2 = r0 % r2
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L9e
            r2 = 19
            long r2 = r0 % r2
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L9e
            r2 = 23
            long r2 = r0 % r2
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L9e
            r2 = 29
            long r2 = r0 % r2
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L9e
            r2 = 31
            long r2 = r0 % r2
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L9e
            r2 = 37
            long r2 = r0 % r2
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L9e
            r2 = 41
            long r0 = r0 % r2
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto La1
        L9e:
            java.math.BigInteger r0 = org.bouncycastle.pqc.legacy.math.linearalgebra.IntegerFunctions.TWO
            goto L21
        La1:
            int r0 = r6.bitLength()
            r1 = 4
            if (r0 >= r1) goto La9
            goto Laf
        La9:
            boolean r0 = r6.isProbablePrime(r7)
            if (r0 == 0) goto L9e
        Laf:
            return r6
        Lb0:
            java.math.BigInteger r6 = org.bouncycastle.pqc.legacy.math.linearalgebra.IntegerFunctions.TWO
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.legacy.math.linearalgebra.IntegerFunctions.nextProbablePrime(java.math.BigInteger, int):java.math.BigInteger");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0012, code lost:
    
        r2 = r2 - 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int nextSmallerPrime(int r2) {
        /*
            r0 = 2
            if (r2 > r0) goto L5
            r2 = 1
            return r2
        L5:
            r1 = 3
            if (r2 != r1) goto L9
            return r0
        L9:
            r0 = r2 & 1
            if (r0 != 0) goto L10
            int r2 = r2 + (-1)
            goto L12
        L10:
            int r2 = r2 + (-2)
        L12:
            if (r2 <= r1) goto L1b
            boolean r0 = isPrime(r2)
            if (r0 != 0) goto L1b
            goto L10
        L1b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.legacy.math.linearalgebra.IntegerFunctions.nextSmallerPrime(int):int");
    }

    public static BigInteger octetsToInteger(byte[] bArr) {
        return octetsToInteger(bArr, 0, bArr.length);
    }

    public static BigInteger octetsToInteger(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 1];
        bArr2[0] = 0;
        System.arraycopy(bArr, i, bArr2, 1, i2);
        return new BigInteger(bArr2);
    }

    public static int order(int i, int i2) {
        int i3 = i % i2;
        if (i3 == 0) {
            throw new IllegalArgumentException(i + " is not an element of Z/(" + i2 + "Z)^*; it is not meaningful to compute its order.");
        }
        int i4 = 1;
        while (i3 != 1) {
            i3 = (i3 * i) % i2;
            if (i3 < 0) {
                i3 += i2;
            }
            i4++;
        }
        return i4;
    }

    public static boolean passesSmallPrimeTest(BigInteger bigInteger) {
        int[] iArr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, R2.attr.switchStyle, 257, R2.attr.textColorSearchUrl, R2.attr.thumbTintMode, R2.attr.tickMarkTint, R2.attr.titleMarginBottom, R2.attr.titleMargins, R2.attr.titleTextColor, R2.attr.ttcIndex, 307, 311, 313, 317, R2.color.abc_tint_spinner, R2.color.background_material_dark, R2.color.dim_foreground_disabled_material_dark, R2.color.dim_foreground_material_dark, R2.color.foreground_material_dark, R2.color.material_blue_grey_950, R2.color.material_grey_850, R2.color.primary_dark_material_light, R2.color.primary_text_disabled_material_light, R2.color.secondary_text_default_material_light, R2.color.switch_thumb_material_light, R2.dimen.abc_action_bar_default_padding_end_material, 401, 409, R2.dimen.abc_control_inset_material, 421, R2.dimen.abc_dialog_padding_top_material, R2.dimen.abc_disabled_alpha_material_dark, R2.dimen.abc_edit_text_inset_horizontal_material, R2.dimen.abc_list_item_height_material, R2.dimen.abc_search_view_preferred_width, R2.dimen.abc_text_size_caption_material, R2.dimen.abc_text_size_display_4_material, R2.dimen.abc_text_size_large_material, R2.dimen.abc_text_size_small_material, R2.dimen.disabled_alpha_material_dark, R2.dimen.hint_pressed_alpha_material_light, R2.dimen.notification_content_margin_start, R2.dimen.notification_small_icon_size_as_large, 503, 509, R2.drawable.abc_btn_radio_material_anim, R2.drawable.abc_btn_radio_to_on_mtrl_015, R2.drawable.abc_ic_menu_selectall_mtrl_alpha, R2.drawable.abc_ic_star_half_black_16dp, R2.drawable.abc_list_pressed_holo_dark, R2.drawable.abc_list_selector_holo_dark, R2.drawable.abc_ratingbar_small_material, R2.drawable.abc_scrubber_control_to_pressed_mtrl_000, R2.drawable.abc_seekbar_track_material, R2.drawable.abc_text_select_handle_middle_mtrl_dark, R2.drawable.abc_textfield_search_activated_mtrl_alpha, R2.drawable.btn_checkbox_unchecked_mtrl, 601, 607, R2.drawable.notification_template_icon_bg, R2.drawable.null_, R2.drawable.tooltip_frame_light, R2.id.accessibility_custom_action_18, R2.id.accessibility_custom_action_27, R2.id.accessibility_custom_action_29, R2.id.accessibility_custom_action_4, R2.id.action_bar, R2.id.action_bar_title, R2.id.action_context_bar, R2.id.alertTitle, R2.id.checkbox, R2.id.customPanel, R2.id.group_divider, 701, R2.id.off, 719, R2.id.search_go_btn, R2.id.shortcut, R2.id.submenuarrow, R2.id.tag_accessibility_clickable_spans, R2.id.text2, R2.id.title_template, R2.id.up, R2.layout.abc_action_bar_up_container, R2.layout.abc_action_mode_close_item_material, R2.layout.abc_popup_menu_item_layout, R2.layout.notification_action, R2.string.abc_action_menu_overflow_description, R2.string.abc_activity_chooser_view_see_all, R2.string.abc_menu_shift_shortcut_label, R2.string.abc_menu_sym_shortcut_label, R2.string.abc_searchview_description_query, R2.string.abc_searchview_description_submit, R2.style.Animation_AppCompat_Dialog, R2.style.Base_TextAppearance_AppCompat_Caption, R2.style.Base_TextAppearance_AppCompat_Display4, R2.style.Base_TextAppearance_AppCompat_Inverse, R2.style.Base_TextAppearance_AppCompat_Light_Widget_PopupMenu_Small, R2.style.Base_TextAppearance_AppCompat_Widget_ActionBar_Menu, R2.style.Base_TextAppearance_AppCompat_Widget_ActionBar_Title_Inverse, R2.style.Base_TextAppearance_AppCompat_Widget_ActionMode_Title, R2.style.Base_TextAppearance_AppCompat_Widget_Button_Inverse, R2.style.Base_Theme_AppCompat_DialogWhenLarge, R2.style.Base_Theme_AppCompat_Light, R2.style.Base_V21_Theme_AppCompat, 929, R2.style.Base_V7_Widget_AppCompat_AutoCompleteTextView, R2.style.Base_Widget_AppCompat_ActionBar_Solid, R2.style.Base_Widget_AppCompat_ActionButton_Overflow, R2.style.Base_Widget_AppCompat_ButtonBar_AlertDialog, R2.style.Base_Widget_AppCompat_Light_ActionBar, R2.style.Base_Widget_AppCompat_Light_ActionBar_TabText_Inverse, R2.style.Base_Widget_AppCompat_ListView, R2.style.Base_Widget_AppCompat_ProgressBar, 991, R2.style.Base_Widget_AppCompat_Toolbar_Button_Navigation, 1009, 1013, 1019, 1021, 1031, 1033, R2.style.TextAppearance_AppCompat_Light_SearchResult_Title, 1049, 1051, R2.style.TextAppearance_AppCompat_Widget_ActionMode_Title, R2.style.TextAppearance_AppCompat_Widget_Button, R2.style.TextAppearance_AppCompat_Widget_PopupMenu_Large, R2.style.ThemeOverlay_AppCompat_Dialog, R2.style.Theme_AppCompat_CompactMenu, R2.style.Theme_AppCompat_DayNight_DarkActionBar, R2.style.Theme_AppCompat_DayNight_Dialog_MinWidth, R2.style.Theme_AppCompat_Light, R2.style.Theme_AppCompat_Light_NoActionBar, R2.style.Widget_AppCompat_ActionButton_CloseMode, R2.style.Widget_AppCompat_ButtonBar, R2.style.Widget_AppCompat_Button_Small, R2.style.Widget_AppCompat_Light_AutoCompleteTextView, R2.style.Widget_AppCompat_Light_ListPopupWindow, R2.style.Widget_AppCompat_ListView_Menu, R2.style.Widget_AppCompat_RatingBar_Small, R2.style.Widget_AppCompat_TextView_SpinnerItem, R2.styleable.ActionBar_backgroundSplit, R2.styleable.ActionBar_contentInsetStart, R2.styleable.ActionBar_homeAsUpIndicator, R2.styleable.ActionBar_title, R2.styleable.ActionMode_background, R2.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable, R2.styleable.AlertDialog_listLayout, R2.styleable.AlertDialog_showTitle, R2.styleable.AnimatedStateListDrawableCompat_android_variablePadding, R2.styleable.AppCompatSeekBar_android_thumb, R2.styleable.AppCompatTextHelper_android_textAppearance, R2.styleable.AppCompatTextView_lastBaselineToBottomHeight, 1279, R2.styleable.AppCompatTheme_actionBarPopupTheme, R2.styleable.AppCompatTheme_actionBarTabTextStyle, R2.styleable.AppCompatTheme_actionBarWidgetTheme, R2.styleable.AppCompatTheme_actionModeCloseButtonStyle, R2.styleable.AppCompatTheme_actionModeFindDrawable, R2.styleable.AppCompatTheme_actionModePopupWindowStyle, R2.styleable.AppCompatTheme_actionModeStyle, R2.styleable.AppCompatTheme_borderlessButtonStyle, R2.styleable.AppCompatTheme_buttonBarNegativeButtonStyle, R2.styleable.AppCompatTheme_checkboxStyle, R2.styleable.AppCompatTheme_listPreferredItemPaddingEnd, R2.styleable.AppCompatTheme_panelMenuListWidth, R2.styleable.AppCompatTheme_ratingBarStyleSmall, R2.styleable.AppCompatTheme_textAppearanceLargePopupMenu, R2.styleable.AppCompatTheme_windowFixedHeightMajor, R2.styleable.ColorStateListItem_android_color, R2.styleable.FontFamily_fontProviderCerts, R2.styleable.FontFamily_fontProviderQuery, R2.styleable.FontFamilyFont_android_fontStyle, R2.styleable.FontFamilyFont_font, R2.styleable.GradientColor_android_centerX, R2.styleable.GradientColor_android_startY, R2.styleable.GradientColorItem_android_offset, R2.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, R2.styleable.LinearLayoutCompat_measureWithLargestChild, R2.styleable.MenuGroup_android_orderInCategory, R2.styleable.MenuItem_android_icon, R2.styleable.MenuItem_android_menuCategory, R2.styleable.MenuItem_android_title, R2.styleable.MenuItem_android_visible, R2.styleable.MenuItem_numericModifiers, R2.styleable.MenuView_android_itemIconDisabledAlpha};
        for (int i = 0; i < 239; i++) {
            if (bigInteger.mod(BigInteger.valueOf(iArr[i])).equals(ZERO)) {
                return false;
            }
        }
        return true;
    }

    public static int pow(int i, int i2) {
        int i3 = 1;
        while (i2 > 0) {
            if ((i2 & 1) == 1) {
                i3 *= i;
            }
            i *= i;
            i2 >>>= 1;
        }
        return i3;
    }

    public static long pow(long j, int i) {
        long j2 = 1;
        while (i > 0) {
            if ((i & 1) == 1) {
                j2 *= j;
            }
            j *= j;
            i >>>= 1;
        }
        return j2;
    }

    public static BigInteger randomize(BigInteger bigInteger) {
        if (sr == null) {
            sr = CryptoServicesRegistrar.getSecureRandom();
        }
        return randomize(bigInteger, sr);
    }

    public static BigInteger randomize(BigInteger bigInteger, SecureRandom secureRandom) {
        int bitLength = bigInteger.bitLength();
        BigInteger valueOf = BigInteger.valueOf(0L);
        if (secureRandom == null && (secureRandom = sr) == null) {
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        for (int i = 0; i < 20; i++) {
            valueOf = BigIntegers.createRandomBigInteger(bitLength, secureRandom);
            if (valueOf.compareTo(bigInteger) < 0) {
                return valueOf;
            }
        }
        return valueOf.mod(bigInteger);
    }

    public static BigInteger reduceInto(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger.subtract(bigInteger2).mod(bigInteger3.subtract(bigInteger2)).add(bigInteger2);
    }

    public static BigInteger squareRoot(BigInteger bigInteger) {
        int i;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = ZERO;
        if (bigInteger.compareTo(bigInteger3) < 0) {
            throw new ArithmeticException("cannot extract root of negative number" + bigInteger + ".");
        }
        int bitLength = bigInteger.bitLength();
        if ((bitLength & 1) != 0) {
            int i2 = bitLength - 1;
            bigInteger2 = bigInteger3;
            bigInteger3 = bigInteger3.add(ONE);
            i = i2;
        } else {
            i = bitLength;
            bigInteger2 = bigInteger3;
        }
        while (i > 0) {
            BigInteger bigInteger4 = FOUR;
            BigInteger multiply = bigInteger2.multiply(bigInteger4);
            int i3 = bigInteger.testBit(i + (-1)) ? 2 : 0;
            i -= 2;
            bigInteger2 = multiply.add(BigInteger.valueOf(i3 + (bigInteger.testBit(i) ? 1 : 0)));
            BigInteger multiply2 = bigInteger3.multiply(bigInteger4);
            BigInteger bigInteger5 = ONE;
            BigInteger add = multiply2.add(bigInteger5);
            bigInteger3 = bigInteger3.multiply(TWO);
            if (bigInteger2.compareTo(add) != -1) {
                bigInteger3 = bigInteger3.add(bigInteger5);
                bigInteger2 = bigInteger2.subtract(add);
            }
        }
        return bigInteger3;
    }
}
