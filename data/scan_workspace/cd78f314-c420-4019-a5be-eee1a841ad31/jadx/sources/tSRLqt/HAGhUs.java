package tSRLqt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Incorrect field signature: LGIk; */
/* JADX WARN: Incorrect field signature: Lshort; */
/* loaded from: classes10.dex */
public class HAGhUs {
    public static int Edf = 2258;
    public static int IvH = 9300;
    private static final String WYbZcq = "CYFAppiumManager";
    private static final HAGhUs EJvezp = new HAGhUs();
    private static ExecutorService OdqhgP = Executors.newFixedThreadPool(2);
    private volatile boolean lYPPJI = false;
    private volatile boolean cWqSIm = false;
    private volatile boolean tEjAmN = false;
    private volatile boolean cwqTZU = false;
    private final int lqriwx = Hhiunu();
    private final int lvANDk = NENMkG();
    private final int NfHUAa = UCrqVG();
    private final String IUsYmM = WnFOdL.rva("\u0010//!\u0005,\u0011\r\u001b");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public class AlUPr implements Runnable {
        static String LQrGk;
        final /* synthetic */ int OFSXkD;

        static {
            Web(false);
        }

        AlUPr(int i) {
            this.OFSXkD = i;
        }

        public static /* synthetic */ void Web(boolean z) {
            if (z) {
                Web(false);
            }
            LQrGk = WnFOdL.rva("\u0010//!\u0005,\u0011\r\u001b");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (HAGhUs.this.isPortOpen(LQrGk, this.OFSXkD)) {
                    if (this.OFSXkD == HAGhUs.this.lqriwx) {
                        HAGhUs.this.cWqSIm = true;
                    } else if (this.OFSXkD == HAGhUs.this.lvANDk) {
                        HAGhUs.this.tEjAmN = true;
                    } else {
                        HAGhUs.this.cwqTZU = true;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes10.dex */
    class pqmOL implements Runnable {
        static String HijQqv;
        static String WKXZvc;

        static {
            jn(false);
        }

        pqmOL() {
        }

        public static /* synthetic */ void jn(boolean z) {
            if (z) {
                jn(false);
            }
            HijQqv = WnFOdL.rva("Fxl\u007fGmQ\u0003YP[\t[^N\u0005pDO|e");
            WKXZvc = WnFOdL.rva("Fxl\u007fGmQ\u0003YP[\t[^N\u0005`_@niW");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (HAGhUs.this.EBBBHU(HijQqv)) {
                    HAGhUs.this.lYPPJI = true;
                } else {
                    HAGhUs hAGhUs = HAGhUs.this;
                    hAGhUs.lYPPJI = hAGhUs.EBBBHU(WKXZvc);
                }
                HAGhUs hAGhUs2 = HAGhUs.this;
                hAGhUs2.checkAppiumPort(hAGhUs2.lqriwx);
                HAGhUs hAGhUs3 = HAGhUs.this;
                hAGhUs3.checkAppiumPort(hAGhUs3.lvANDk);
                HAGhUs hAGhUs4 = HAGhUs.this;
                hAGhUs4.checkAppiumPort(hAGhUs4.NfHUAa);
            } catch (Exception unused) {
            } catch (Throwable th) {
                HAGhUs.this.UhOIbN();
                throw th;
            }
            HAGhUs.this.UhOIbN();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public class rASjl implements Callable {
        final /* synthetic */ double WdQbFx;

        rASjl(Process process) {
            this.WdQbFx = process;
        }

        @Override // java.util.concurrent.Callable
        public Integer call() {
            try {
                return Integer.valueOf(this.WdQbFx.waitFor());
            } catch (InterruptedException unused) {
                return -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (tSRLqt.HAGhUs.Edf <= 2257) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        r4 = tSRLqt.HAGhUs.Edf;
        r5 = r4 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r5 == 26) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        if (r5 == 92) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        tSRLqt.HAGhUs.Edf = (r4 + r4) % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        tSRLqt.HAGhUs.Edf = (tSRLqt.HAGhUs.Edf ^ com.airbnb.paris.R2.styleable.AppCompatTheme_actionModeBackground) % 19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean EBBBHU(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            java.lang.Process r1 = r2.exec(r5)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            tSRLqt.HAGhUs$rASjl r2 = new tSRLqt.HAGhUs$rASjl     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            java.util.concurrent.Future r4 = r5.submit(r2)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            r2 = 2
            java.lang.Object r4 = r4.get(r2, r5)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            if (r4 != 0) goto L5d
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            java.io.InputStream r2 = r1.getInputStream()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            java.lang.String r5 = r4.readLine()     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L49
            java.lang.String r2 = "@yz"
            java.lang.String r2 = tSRLqt.WnFOdL.rva(r2)     // Catch: java.lang.Throwable -> L53
            boolean r5 = r5.contains(r2)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L49
            r5 = 1
            goto L4a
        L49:
            r5 = r0
        L4a:
            r4.close()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            if (r1 == 0) goto L52
            r1.destroy()
        L52:
            return r5
        L53:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
        L5c:
            throw r5     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
        L5d:
            r1.destroy()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6d
            if (r1 == 0) goto L65
            r1.destroy()
        L65:
            return r0
        L66:
            r4 = move-exception
            if (r1 == 0) goto L6c
            r1.destroy()
        L6c:
            throw r4
        L6d:
            if (r1 == 0) goto L94
            r1.destroy()
            int r4 = tSRLqt.HAGhUs.Edf
            r5 = 2257(0x8d1, float:3.163E-42)
            if (r4 > r5) goto L94
        L78:
            int r4 = tSRLqt.HAGhUs.Edf
            int r5 = r4 + 117
            r1 = 26
            if (r5 == r1) goto L8b
            r1 = 92
            if (r5 == r1) goto L85
            goto L78
        L85:
            int r4 = r4 + r4
            int r4 = r4 % 4
            tSRLqt.HAGhUs.Edf = r4
            goto L94
        L8b:
            int r4 = tSRLqt.HAGhUs.Edf
            r4 = r4 ^ 1296(0x510, float:1.816E-42)
            int r4 = r4 % 19
            tSRLqt.HAGhUs.Edf = r4
            goto L8b
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tSRLqt.HAGhUs.EBBBHU(java.lang.String):boolean");
    }

    private int Hhiunu() {
        Random random = new Random();
        int nextInt = ((random.nextInt(100) + 1) * 30) + ((random.nextInt(50) + 1) * 20) + 5000;
        return nextInt + (6790 - nextInt);
    }

    private int NENMkG() {
        Random random = new Random();
        int nextInt = ((random.nextInt(100) + 1) * 40) + ((random.nextInt(50) + 1) * 25) + 5500;
        return nextInt + (7810 - nextInt);
    }

    private int UCrqVG() {
        Random random = new Random();
        int nextInt = ((random.nextInt(100) + 1) * 35) + ((random.nextInt(50) + 1) * 20) + 5700;
        return nextInt + (8200 - nextInt);
    }

    private void UVeJW() {
        try {
            if (OdqhgP.isShutdown() || OdqhgP.isTerminated()) {
                OdqhgP = Executors.newFixedThreadPool(2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void UhOIbN() {
        try {
            OdqhgP.shutdown();
            try {
                if (!OdqhgP.awaitTermination(5L, TimeUnit.SECONDS)) {
                    OdqhgP.shutdownNow();
                }
            } catch (InterruptedException unused) {
                OdqhgP.shutdownNow();
            }
        } catch (Exception unused2) {
        }
    }

    public static HAGhUs getInstance() {
        return EJvezp;
    }

    public void checkAppiumPort(int i) {
        try {
            OdqhgP.submit(new AlUPr(i));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if ((tSRLqt.HAGhUs.IvH ^ 9300) != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        r6 = tSRLqt.HAGhUs.IvH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        if ((r6 + 26) == 98) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        tSRLqt.HAGhUs.IvH = (tSRLqt.HAGhUs.IvH + r6) % 72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getSensorData() {
        /*
            r8 = this;
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1 = 1000(0x3e8, float:1.401E-42)
            int r1 = r0.nextInt(r1)
            int r1 = r1 + 1
            r2 = 6
            int r2 = r0.nextInt(r2)
            int r2 = r2 + 1
            r3 = 7
            int r3 = r0.nextInt(r3)
            int r3 = r3 + 1
            r4 = 8
            int r4 = r0.nextInt(r4)
            int r4 = r4 + 1
            r5 = 4
            int r0 = r0.nextInt(r5)
            int r0 = r0 + 1
            int r5 = r1 * 7
            boolean r6 = r8.lYPPJI
            r7 = 0
            if (r6 == 0) goto L48
            int r6 = tSRLqt.HAGhUs.IvH
            r6 = r6 ^ 9300(0x2454, float:1.3032E-41)
            if (r6 == 0) goto L49
        L37:
            int r6 = tSRLqt.HAGhUs.IvH
            int r8 = r6 + 26
            r0 = 98
            if (r8 == r0) goto L40
            goto L37
        L40:
            int r8 = tSRLqt.HAGhUs.IvH
            int r8 = r8 + r6
            int r8 = r8 % 72
            tSRLqt.HAGhUs.IvH = r8
            goto L40
        L48:
            r2 = r7
        L49:
            int r5 = r5 + r2
            int r2 = r1 * 8
            boolean r6 = r8.cWqSIm
            if (r6 == 0) goto L51
            goto L52
        L51:
            r3 = r7
        L52:
            int r2 = r2 + r3
            int r3 = r1 * 9
            boolean r6 = r8.tEjAmN
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            r4 = r7
        L5b:
            int r3 = r3 + r4
            int r1 = r1 * 5
            boolean r8 = r8.cwqTZU
            if (r8 == 0) goto L63
            goto L64
        L63:
            r0 = r7
        L64:
            int r1 = r1 + r0
            r8 = r2 ^ r5
            r0 = r3 ^ r8
            r1 = r1 ^ r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r3 = ","
            r2.append(r3)
            r2.append(r8)
            r2.append(r3)
            r2.append(r0)
            r2.append(r3)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tSRLqt.HAGhUs.getSensorData():java.lang.String");
    }

    public boolean isPortOpen(String str, int i) {
        Socket socket;
        OutputStream outputStream;
        BufferedReader bufferedReader = null;
        try {
            socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(str, i), 1500);
                socket.setSoTimeout(1500);
                outputStream = socket.getOutputStream();
                try {
                    outputStream.write(("GET /status HTTP/1.1\r\nHost: " + str + ":" + i + "\r\nConnection: close\r\n\r\n").getBytes());
                    outputStream.flush();
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    boolean z = false;
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                try {
                                    break;
                                } catch (IOException unused) {
                                }
                            } else if (!readLine.isEmpty()) {
                                z = true;
                            }
                        } catch (Exception unused2) {
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException unused4) {
                                }
                            }
                            if (socket != null) {
                                try {
                                    if (!socket.isClosed()) {
                                        socket.close();
                                    }
                                } catch (IOException unused5) {
                                }
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused6) {
                                }
                            }
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException unused7) {
                                }
                            }
                            if (socket == null) {
                                throw th;
                            }
                            try {
                                if (socket.isClosed()) {
                                    throw th;
                                }
                                socket.close();
                                throw th;
                            } catch (IOException unused8) {
                                throw th;
                            }
                        }
                    }
                    bufferedReader2.close();
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused9) {
                        }
                    }
                    try {
                        if (!socket.isClosed()) {
                            socket.close();
                        }
                    } catch (IOException unused10) {
                    }
                    return z;
                } catch (Exception unused11) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception unused12) {
                outputStream = null;
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
            }
        } catch (Exception unused13) {
            socket = null;
            outputStream = null;
        } catch (Throwable th4) {
            th = th4;
            socket = null;
            outputStream = null;
        }
    }

    public void startDataCapture() {
        UVeJW();
        try {
            OdqhgP.submit(new pqmOL());
        } catch (Exception unused) {
        }
    }
}
