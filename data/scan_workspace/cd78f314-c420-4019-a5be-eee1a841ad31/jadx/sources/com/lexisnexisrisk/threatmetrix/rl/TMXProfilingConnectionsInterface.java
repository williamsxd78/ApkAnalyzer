package com.lexisnexisrisk.threatmetrix.rl;

import MCOFeQ.WqusdZ;
import java.io.InputStream;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface TMXProfilingConnectionsInterface {

    /* loaded from: classes3.dex */
    public enum HttpMethod {
        GET,
        POST;

        public static int dWF = 6143;
        public static int wVe;

        static {
            WqusdZ.wQp = 8268;
            WqusdZ.dwn = 4146;
            wVe = 2427;
        }
    }

    /* loaded from: classes3.dex */
    public interface TMXCallback {
        boolean onComplete(@Nonnull TMXHttpResponseCode tMXHttpResponseCode, @Nullable InputStream inputStream);
    }

    /* loaded from: classes3.dex */
    public static class TMXHttpResponseCode extends TMXSocketResponseCode {
        public static final int HttpResponseCRLError = -15;
        public static final int HttpResponseCertPathBuilderError = -12;
        public static final int HttpResponseCertPathValidatorError = -13;
        public static final int HttpResponseCertStoreError = -14;
        public static final int HttpResponseCertificateEncodingError = -8;
        public static final int HttpResponseCertificateError = -7;
        public static final int HttpResponseCertificateExpired = -9;
        public static final int HttpResponseCertificateMismatch = -6;
        public static final int HttpResponseCertificateNotYetValid = -10;
        public static final int HttpResponseCertificateParsingError = -11;
        public static final int HttpResponseConnectionError = -1;
        public static final int HttpResponseHostNotFoundError = -3;
        public static final int HttpResponseHostVerificationError = -5;
        public static final int HttpResponseNetworkTimeoutError = -4;
        public static final int HttpResponseNotYet = -2;
        public static final int HttpResponseOK = 200;
        public static int iCF = 6261;
        private int lcfQhc;

        public TMXHttpResponseCode(int i) {
            super();
            this.lcfQhc = i;
        }

        public int getHttpResponseCode() {
            return this.lcfQhc;
        }

        public void setHttpResponseCode(int i) {
            this.lcfQhc = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
        
            r4 = com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXHttpResponseCode.iCF ^ 1951;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean succeeded() {
            /*
                r4 = this;
                int r4 = r4.lcfQhc
                r0 = 200(0xc8, float:2.8E-43)
                r1 = 204(0xcc, float:2.86E-43)
                if (r4 == r0) goto L41
                int r0 = com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXHttpResponseCode.iCF
                r2 = 6260(0x1874, float:8.772E-42)
                if (r0 > r2) goto L3c
            Le:
                int r0 = com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXHttpResponseCode.iCF
                int r4 = r0 + 52
                r1 = 38
                if (r4 == r1) goto L30
                r1 = 58
                if (r4 == r1) goto L37
                r1 = 80
                if (r4 == r1) goto L2a
                r1 = 220(0xdc, float:3.08E-43)
                if (r4 == r1) goto L23
                goto Le
            L23:
                int r0 = r0 % 67
                int r4 = r0 >> 31
                com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXHttpResponseCode.iCF = r4
                goto Le
            L2a:
                int r4 = r0 + r0
                int r4 = r4 >> 88
                com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXHttpResponseCode.iCF = r4
            L30:
                int r4 = com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXHttpResponseCode.iCF
                int r4 = r4 % 6
            L34:
                int r4 = r4 + r0
                com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXHttpResponseCode.iCF = r4
            L37:
                int r4 = com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXHttpResponseCode.iCF
                r4 = r4 ^ 1951(0x79f, float:2.734E-42)
                goto L34
            L3c:
                if (r4 != r1) goto L3f
                goto L41
            L3f:
                r4 = 0
                return r4
            L41:
                int r4 = com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXHttpResponseCode.iCF
                r4 = r4 ^ 6261(0x1875, float:8.774E-42)
                r0 = 1
                if (r4 == 0) goto L77
            L48:
                int r4 = com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXHttpResponseCode.iCF
                int r2 = r4 + 39
                r3 = 84
                if (r2 == r3) goto L74
                r3 = 99
                if (r2 == r3) goto L6e
                if (r2 == r1) goto L65
                r3 = 299(0x12b, float:4.19E-43)
                if (r2 == r3) goto L5b
                goto L48
            L5b:
                int r0 = com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXHttpResponseCode.iCF
                int r0 = r0 + r4
                int r0 = r0 % 114
                int r0 = r0 * 59
                com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXHttpResponseCode.iCF = r0
                goto L5b
            L65:
                int r4 = r4 % 104
                int r4 = r4 * 71
                r4 = r4 ^ 1313(0x521, float:1.84E-42)
            L6b:
                com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXHttpResponseCode.iCF = r4
                return r0
            L6e:
                int r4 = r4 + r4
                int r4 = r4 % 23
                int r4 = r4 % 20
                goto L6b
            L74:
                int r4 = r4 >> 24
                goto L6b
            L77:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXHttpResponseCode.succeeded():boolean");
        }

        public String toString() {
            return String.valueOf(this.lcfQhc);
        }
    }

    /* loaded from: classes3.dex */
    public static class TMXSocketResponseCode {
        public static final int ResponseIOException = -22;
        public static final int ResponseIllegalArgumentException = -23;
        public static final int ResponseOk = -20;
        public static final int ResponseUnknownHost = -21;

        public TMXSocketResponseCode() {
        }
    }

    void cancelProfiling();

    void closeSocket(@Nonnull String str, int i);

    void httpRequest(@Nonnull HttpMethod httpMethod, @Nonnull String str, Map<String, String> map, byte[] bArr, @Nullable TMXCallback tMXCallback);

    void resolveHostByName(String str);

    void sendSocketRequest(@Nonnull String str, int i, @Nonnull byte[] bArr, boolean z, @Nullable TMXCallback tMXCallback);
}
