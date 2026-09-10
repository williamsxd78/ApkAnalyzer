package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
class HQCKeccakRandomGenerator {
    private static long[] KeccakRoundConstants = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    protected int bitsInQueue;
    protected int fixedOutputLength;
    protected int rate;
    protected boolean squeezing;
    protected long[] state = new long[26];
    protected byte[] dataQueue = new byte[192];

    public HQCKeccakRandomGenerator(int i) {
        init(i);
    }

    private void KeccakIncAbsorb(byte[] bArr, int i) {
        long j;
        long j2;
        long[] jArr;
        long j3;
        if (bArr == null) {
            return;
        }
        int i2 = this.rate >> 3;
        int i3 = i;
        int i4 = 0;
        while (true) {
            j = i3;
            long j4 = i2;
            j2 = 8;
            if (this.state[25] + j < j4) {
                break;
            }
            int i5 = 0;
            while (true) {
                long j5 = i5;
                jArr = this.state;
                j3 = jArr[25];
                if (j5 < j4 - j3) {
                    int i6 = ((int) (j3 + j5)) >> 3;
                    jArr[i6] = jArr[i6] ^ ((bArr[r21 + i4] & 255) << ((int) (((j3 + j5) & 7) * 8)));
                    i5++;
                    j4 = j4;
                }
            }
            long j6 = j4;
            i3 = (int) (j - (j6 - j3));
            i4 = (int) (i4 + (j6 - j3));
            jArr[25] = 0;
            KeccakPermutation(jArr);
        }
        int i7 = 0;
        while (i7 < i3) {
            long[] jArr2 = this.state;
            long j7 = jArr2[25];
            long j8 = i7;
            int i8 = ((int) (j7 + j8)) >> 3;
            long j9 = j2;
            jArr2[i8] = jArr2[i8] ^ ((bArr[i7 + i4] & 255) << ((int) (((j7 + j8) & 7) * j9)));
            i7++;
            j2 = j9;
        }
        long[] jArr3 = this.state;
        jArr3[25] = jArr3[25] + j;
    }

    private void KeccakIncFinalize(int i) {
        int i2 = this.rate >> 3;
        long[] jArr = this.state;
        long j = jArr[25];
        int i3 = ((int) j) >> 3;
        jArr[i3] = ((i & BodyPartID.bodyIdMax) << ((int) ((j & 7) * 8))) ^ jArr[i3];
        int i4 = i2 - 1;
        int i5 = i4 >> 3;
        jArr[i5] = jArr[i5] ^ (128 << ((i4 & 7) * 8));
        jArr[25] = 0;
    }

    private void KeccakIncSqueeze(byte[] bArr, int i) {
        int i2 = this.rate >> 3;
        int i3 = 0;
        while (i3 < i) {
            if (i3 >= this.state[25]) {
                break;
            }
            long j = i2;
            bArr[i3] = (byte) (r9[(int) (((j - r10) + r7) >> 3)] >> ((int) ((7 & ((j - r10) + r7)) * 8)));
            i3++;
        }
        int i4 = i - i3;
        long[] jArr = this.state;
        jArr[25] = jArr[25] - i3;
        while (i4 > 0) {
            KeccakPermutation(this.state);
            int i5 = 0;
            while (i5 < i4 && i5 < i2) {
                bArr[i3 + i5] = (byte) (this.state[i5 >> 3] >> ((i5 & 7) * 8));
                i5++;
            }
            i3 += i5;
            i4 -= i5;
            this.state[25] = i2 - i5;
        }
    }

    private void KeccakPermutation(long[] jArr) {
        long[] jArr2 = this.state;
        long j = jArr2[0];
        long j2 = jArr2[1];
        char c = 2;
        long j3 = jArr2[2];
        char c2 = 3;
        long j4 = jArr2[3];
        char c3 = 4;
        long j5 = jArr2[4];
        long j6 = jArr2[5];
        long j7 = jArr2[6];
        long j8 = jArr2[7];
        long j9 = jArr2[8];
        long j10 = jArr2[9];
        long j11 = jArr2[10];
        long j12 = jArr2[11];
        long j13 = jArr2[12];
        long j14 = jArr2[13];
        long j15 = jArr2[14];
        long j16 = jArr2[15];
        long j17 = jArr2[16];
        long j18 = jArr2[17];
        long j19 = jArr2[18];
        long j20 = jArr2[19];
        long j21 = jArr2[20];
        long j22 = jArr2[21];
        long j23 = jArr2[22];
        long j24 = jArr2[23];
        int i = 24;
        long j25 = jArr2[24];
        int i2 = 0;
        while (i2 < i) {
            long j26 = (((j ^ j6) ^ j11) ^ j16) ^ j21;
            long j27 = (((j2 ^ j7) ^ j12) ^ j17) ^ j22;
            long j28 = (((j3 ^ j8) ^ j13) ^ j18) ^ j23;
            long j29 = (((j4 ^ j9) ^ j14) ^ j19) ^ j24;
            long j30 = (((j5 ^ j10) ^ j15) ^ j20) ^ j25;
            long j31 = ((j27 << 1) | (j27 >>> (-1))) ^ j30;
            long j32 = ((j28 << 1) | (j28 >>> (-1))) ^ j26;
            long j33 = ((j29 << 1) | (j29 >>> (-1))) ^ j27;
            long j34 = ((j30 << 1) | (j30 >>> (-1))) ^ j28;
            long j35 = ((j26 << 1) | (j26 >>> (-1))) ^ j29;
            long j36 = j ^ j31;
            long j37 = j6 ^ j31;
            long j38 = j11 ^ j31;
            long j39 = j16 ^ j31;
            long j40 = j21 ^ j31;
            long j41 = j2 ^ j32;
            long j42 = j7 ^ j32;
            long j43 = j12 ^ j32;
            long j44 = j17 ^ j32;
            long j45 = j22 ^ j32;
            long j46 = j3 ^ j33;
            long j47 = j8 ^ j33;
            long j48 = j13 ^ j33;
            long j49 = j18 ^ j33;
            long j50 = j23 ^ j33;
            long j51 = j4 ^ j34;
            long j52 = j9 ^ j34;
            long j53 = j14 ^ j34;
            long j54 = j19 ^ j34;
            long j55 = j24 ^ j34;
            long j56 = j5 ^ j35;
            long j57 = j10 ^ j35;
            long j58 = j15 ^ j35;
            long j59 = j20 ^ j35;
            long j60 = j25 ^ j35;
            long j61 = (j41 << 1) | (j41 >>> 63);
            char c4 = c;
            long j62 = (j42 << 44) | (j42 >>> 20);
            char c5 = c2;
            long j63 = (j57 << 20) | (j57 >>> 44);
            char c6 = c3;
            long j64 = (j50 << 61) | (j50 >>> c5);
            int i3 = i;
            long j65 = (j58 << 39) | (j58 >>> 25);
            int i4 = i2;
            long j66 = (j40 << 18) | (j40 >>> 46);
            long[] jArr3 = jArr2;
            long j67 = (j46 << 62) | (j46 >>> c4);
            long j68 = (j48 << 43) | (j48 >>> 21);
            long j69 = (j53 << 25) | (j53 >>> 39);
            long j70 = (j59 << 8) | (j59 >>> 56);
            long j71 = (j55 << 56) | (j55 >>> 8);
            long j72 = (j39 << 41) | (j39 >>> 23);
            long j73 = (j56 << 27) | (j56 >>> 37);
            long j74 = (j60 << 14) | (j60 >>> 50);
            long j75 = (j45 << c4) | (j45 >>> 62);
            long j76 = (j52 << 55) | (j52 >>> 9);
            long j77 = (j44 << 45) | (j44 >>> 19);
            long j78 = (j37 << 36) | (j37 >>> 28);
            long j79 = (j51 << 28) | (j51 >>> 36);
            long j80 = (j54 << 21) | (j54 >>> 43);
            long j81 = (j49 << 15) | (j49 >>> 49);
            long j82 = (j43 << 10) | (j43 >>> 54);
            long j83 = (j47 << 6) | (j47 >>> 58);
            long j84 = (j38 << c5) | (j38 >>> 61);
            long j85 = j36 ^ ((~j62) & j68);
            j2 = j62 ^ ((~j68) & j80);
            long j86 = j68 ^ ((~j80) & j74);
            long j87 = ((~j74) & j36) ^ j80;
            long j88 = j74 ^ (j62 & (~j36));
            long j89 = j79 ^ ((~j63) & j84);
            long j90 = ((~j84) & j77) ^ j63;
            long j91 = ((~j77) & j64) ^ j84;
            j9 = j77 ^ ((~j64) & j79);
            long j92 = ((~j79) & j63) ^ j64;
            j11 = j61 ^ ((~j83) & j69);
            long j93 = ((~j69) & j70) ^ j83;
            long j94 = ((~j70) & j66) ^ j69;
            long j95 = j70 ^ ((~j66) & j61);
            long j96 = ((~j61) & j83) ^ j66;
            long j97 = j73 ^ ((~j78) & j82);
            long j98 = ((~j82) & j81) ^ j78;
            long j99 = j82 ^ ((~j81) & j71);
            j19 = j81 ^ ((~j71) & j73);
            long j100 = j71 ^ ((~j73) & j78);
            long j101 = j67 ^ ((~j76) & j65);
            long j102 = j76 ^ ((~j65) & j72);
            long j103 = j65 ^ ((~j72) & j75);
            j24 = j72 ^ ((~j75) & j67);
            long j104 = j75 ^ ((~j67) & j76);
            j = j85 ^ KeccakRoundConstants[i4];
            i2 = i4 + 1;
            j7 = j90;
            j13 = j94;
            j15 = j96;
            j14 = j95;
            j8 = j91;
            c3 = c6;
            j4 = j87;
            j21 = j101;
            j20 = j100;
            c2 = c5;
            j17 = j98;
            j12 = j93;
            j22 = j102;
            j23 = j103;
            j10 = j92;
            j18 = j99;
            j16 = j97;
            j5 = j88;
            j6 = j89;
            j3 = j86;
            c = c4;
            j25 = j104;
            jArr2 = jArr3;
            i = i3;
        }
        long[] jArr4 = jArr2;
        jArr4[0] = j;
        jArr4[1] = j2;
        jArr4[c] = j3;
        jArr4[c2] = j4;
        jArr4[c3] = j5;
        jArr4[5] = j6;
        jArr4[6] = j7;
        jArr4[7] = j8;
        jArr4[8] = j9;
        jArr4[9] = j10;
        jArr4[10] = j11;
        jArr4[11] = j12;
        jArr4[12] = j13;
        jArr4[13] = j14;
        jArr4[14] = j15;
        jArr4[15] = j16;
        jArr4[16] = j17;
        jArr4[17] = j18;
        jArr4[18] = j19;
        jArr4[19] = j20;
        jArr4[20] = j21;
        jArr4[21] = j22;
        jArr4[22] = j23;
        jArr4[23] = j24;
        jArr4[i] = j25;
    }

    private void init(int i) {
        if (i != 128 && i != 224 && i != 256 && i != 288 && i != 384 && i != 512) {
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
        initSponge(1600 - (i << 1));
    }

    private void initSponge(int i) {
        if (i <= 0 || i >= 1600 || i % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.rate = i;
        int i2 = 0;
        while (true) {
            long[] jArr = this.state;
            if (i2 >= jArr.length) {
                Arrays.fill(this.dataQueue, (byte) 0);
                this.bitsInQueue = 0;
                this.squeezing = false;
                this.fixedOutputLength = (1600 - i) / 2;
                return;
            }
            jArr[i2] = 0;
            i2++;
        }
    }

    public void SHAKE256_512_ds(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        int i2 = 0;
        while (true) {
            long[] jArr = this.state;
            if (i2 >= jArr.length) {
                KeccakIncAbsorb(bArr2, i);
                KeccakIncAbsorb(bArr3, bArr3.length);
                KeccakIncFinalize(31);
                KeccakIncSqueeze(bArr, 64);
                return;
            }
            jArr[i2] = 0;
            i2++;
        }
    }

    public void expandSeed(byte[] bArr, int i) {
        int i2 = i % 8;
        byte[] bArr2 = new byte[8];
        int i3 = i - i2;
        KeccakIncSqueeze(bArr, i3);
        if (i2 != 0) {
            KeccakIncSqueeze(bArr2, 8);
            for (int i4 = 0; i4 < i2; i4++) {
                bArr[i3 + i4] = bArr2[i4];
            }
        }
    }

    public void randomGeneratorInit(byte[] bArr, byte[] bArr2, int i, int i2) {
        KeccakIncAbsorb(bArr, i);
        KeccakIncAbsorb(bArr2, i2);
        KeccakIncAbsorb(new byte[]{1}, 1);
        KeccakIncFinalize(31);
    }

    public void seedExpanderInit(byte[] bArr, int i) {
        KeccakIncAbsorb(bArr, i);
        KeccakIncAbsorb(new byte[]{2}, 1);
        KeccakIncFinalize(31);
    }

    public void squeeze(byte[] bArr, int i) {
        KeccakIncSqueeze(bArr, i);
    }
}
